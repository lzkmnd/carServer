package com.car.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.car.mapper.CarnumMapper;
import com.car.pojo.Car;
import com.car.pojo.Carnum;
import com.car.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("")
public class CarController {

     @Autowired
    CarService carService;

    @ResponseBody
    @RequestMapping("/listCar")
    public String listCar() {
        JSONObject json= new JSONObject();
        List<Car> cars= carService.listMain();
        JSONArray jsonArray = (JSONArray) JSONArray.toJSON(cars);
        json.put("cars",jsonArray);
        return jsonArray.toJSONString();
    }

    @ResponseBody
    @RequestMapping("/getCarDitail")
    public String getCarDitail(@RequestBody String str) {
        JSONObject jsonObject = JSONObject.parseObject(str);
        String carId = jsonObject.get("carId").toString();
        Carnum carnum = carService.getCarnum(carId);
        ArrayList<String> nums = new ArrayList();
        String num1 = carnum.getNum1();
        if (num1!=null){
            nums.add(num1);
        }
        String num2 = carnum.getNum2();
        if (num1!=null){
            nums.add(num2);
        }
        String num3 = carnum.getNum3();
        if (num1!=null){
            nums.add(num3);
        }
        for (String num:nums) {
            
        }
        return str;
    }

    @ResponseBody
    @RequestMapping("/getOneCar")
    public String getOneCar() {
        System.out.println("getOneCar()...");
        Car c = new Car();
        c.setBrand("??");
        c.setName("测试连接成功");
        JSONObject json= new JSONObject();
        json.put("car", JSONObject.toJSON(c));
        return json.toJSONString();
    }

}
