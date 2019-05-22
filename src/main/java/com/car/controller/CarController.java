package com.car.controller;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.car.pojo.User;
import com.car.service.UserService;
import com.car.util.SendmailUtils;
import com.car.util.imgUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.car.pojo.Category;
import com.car.service.CategoryService;
import com.car.util.Page;

// 告诉spring mvc这是一个控制器类
@Controller
@RequestMapping("")
public class CarController {
	@Autowired
	CategoryService categoryService;
	@Autowired
	UserService userService;

	//ok
	@RequestMapping("listCategory")
	public ModelAndView listCategory(Page page){
		ModelAndView mav = new ModelAndView();
		PageHelper.offsetPage(page.getStart(),5);
		List<Category> cs= categoryService.list();
		int total = (int) new PageInfo<>(cs).getTotal();
		
		page.caculateLast(total);
		
		// 放入转发参数
		mav.addObject("cs", cs);
		// 放入jsp路径
		mav.setViewName("listCategory");
		return mav;
	}

	//ok
	@ResponseBody
	@RequestMapping("/getOneCategory")
	public String getOneCategory() {
	    System.out.println("getOneCategory()...");
		Category c = new Category();
		c.setId(100);
		c.setName("测试连接成功");
		JSONObject json= new JSONObject();
		json.put("category", JSONObject.toJSON(c));
		return json.toJSONString();
	}

	//ok
    @ResponseBody
    @RequestMapping("/getOnejson")
    public String getOnejson() {
        System.out.println("getOnejson()...");
        JSONObject json= new JSONObject();
        json.put("id", 1);
        return json.toJSONString();
    }

    //ok
	@ResponseBody
	@RequestMapping("/getManyCategory")
	public String getManyCategory() {
		List<Category> cs = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			Category c = new Category();
			c.setId(i);
			c.setName("分类名称:"+i);
			cs.add(c);
		}

		return JSONObject.toJSON(cs).toString();
	}

	//no
    @ResponseBody
    @RequestMapping("/submitCategory")
    public String submitCategory(@RequestBody Category category) {
        System.out.println("SSM接受到浏览器提交的json，并转换为Category对象:"+category);
        return "ok";
    }

	@RequestMapping("/loginByUser")
	@ResponseBody
	public String loginByUser(@RequestBody String str) {
		JSONObject jsonObject = JSONObject.parseObject(str);
		JSONObject result = new JSONObject();
		User user = JSON.toJavaObject(jsonObject,User.class);
		Map<String,String> params = new HashMap();
		params.put("userid",user.getUserid());
		params.put("password",user.getPassword());
		User loginUser = userService.getByUseridAndPassword(params);
		if (loginUser!=null){
			result.put("result","true");
			result.put("user",JSONObject.toJSON(loginUser));
		}else {
			result.put("result","false");
		}
		System.out.println("retrn:"+result.toJSONString());
		return result.toJSONString();
	}


	/*//no
	@ResponseBody
	@RequestMapping("/Regist")
	public String Regist(@RequestBody User user) {
		String result = userService.add(user);
		JSONObject json= new JSONObject();
		json.put("result", result);
		return json.toJSONString();
	}*/

	//ok
	@ResponseBody
	@RequestMapping("/Regist")
	public String Regist(@RequestBody String str) {
		JSONObject js = JSONObject.parseObject(str);
		User user = JSON.toJavaObject(js,User.class);
		String imgPath = "F:\\JavaTest\\carServer\\img"+user.getUserid()+"img";
		imgUtils.GenerateImage(user.getImgPath(),imgPath);
		String result = userService.add(user);
		JSONObject json= new JSONObject();
		json.put("result", result);
		System.out.println(json.toJSONString());
		return json.toJSONString();
	}
	@ResponseBody
	@RequestMapping("/saveImg")
	public String saveImg(@RequestBody String str) {
		JSONObject js = JSONObject.parseObject(str);
		String imgPath = "F:\\JavaTest\\carServer\\img\\sdfsdfsdimg.jpg";
		imgUtils.GenerateImage(js.get("img").toString(),imgPath);
		JSONObject json= new JSONObject();
		json.put("result", "ok");
		System.out.println(json.toJSONString());
		return json.toJSONString();
	}

	//no
	@ResponseBody
	@RequestMapping("/test")//test
	public String test(@RequestBody User user) {
		System.out.println("SSM接受到json，并转换为user对象:"+user);
		User u = new User();
		u.setUserid("welcome");
		u.setArea(user.getUserid());
		JSONObject json= new JSONObject();
		json.put("user", JSONObject.toJSON(u));
		return json.toJSONString();
	}


	@ResponseBody
	@RequestMapping("/getYanzheng")
	//得到验证码
	public String getYanzheng(@RequestBody String str) {
		JSONObject json = JSON.parseObject(str);
		Integer code  =  (int)((Math.random()*9+1)*100000);  //产生验证码
		System.out.println(code);
		String email = json.get("email").toString();
		SendmailUtils.send(email,code);
		JSONObject json2= new JSONObject();
		json2.put("yanzhengma", code);
		System.out.println("验证码："+json2);
		return json2.toJSONString();
	}

	//ok
    @ResponseBody
    @RequestMapping("/jsonStringTest")
    //得到验证码
    public String jsonStringTest(@RequestBody String jsonString) {
        System.out.println("SSM接受到浏览器提交的json:"+jsonString);
        return  jsonString;
	}

	//no
    @ResponseBody
    @RequestMapping("/jsonObjectTest")
    public String jsonObjectTest(@RequestBody User user) {
        System.out.println("SSM接受到浏览器提交的json，并转化为user:"+user);
        JSONObject json = new JSONObject();
        User u = new User();
        u.setUserid("welcome");
        u.setArea(user.getUserid());
        json.put("user", JSONObject.toJSON(u));
        return json.toJSONString();

    }
}
