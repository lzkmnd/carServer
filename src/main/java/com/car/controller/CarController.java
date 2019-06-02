package com.car.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.car.pojo.Car;
import com.car.service.CarService;
import com.car.util.imgUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
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
        for (Car car:cars) {
            String img = imgUtils.GetImageStr(car.getPurl()+".jpg");
            car.setPurl(img);
            System.out.println(car.getName());
            System.out.println(car.getPurl());
        }
        JSONArray jsonArray = (JSONArray) JSONArray.toJSON(cars);
        json.put("cars",jsonArray);
        return jsonArray.toJSONString();
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
