package com.car.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.car.pojo.*;
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
        JSONObject result = new JSONObject();
        String carId = jsonObject.get("carId").toString();
        Carnum carnum = carService.getCarnum(carId);
        ArrayList<String> nums = new ArrayList();
        String num1 = carnum.getNum1();
        if (num1!=null){
            nums.add(num1);
        }
        String num2 = carnum.getNum2();
        if (num2!=null){
            nums.add(num2);
        }
        String num3 = carnum.getNum3();
        if (num3!=null){
            nums.add(num3);
        }
        int i = 1;
        ArrayList<CarDetail> jsonlist = new ArrayList<CarDetail>();
        for (String num:nums) {
            Ac_refrigerator ac_refrigerator = carService.getAc_refrigerator(num);
            Body body = carService.getBody(num);
            Chassis_steering chassis_steering = carService.getChassis_steering(num);
            Control_configuration control_configuration = carService.getControl_configuration(num);
            Engine engine = carService.getEngine(num);
            External_configuration external_configuration = carService.getExternal_configuration(num);
            Glass_rearviewmirror glass_rearviewmirror = carService.getGlass_rearviewmirror(num);
            High_tech_configuration high_tech_configuration = carService.getHigh_tech_configuration(num);
            Internal_configuration internal_configuration = carService.getInternal_configuration(num);
            Light_configuration light_configuration = carService.getLight_configuration(num);
            Media_configuration media_configuration = carService.getMedia_configuration(num);
            Basic_parameter  basic_parameter =carService.getBasic_parameter(num);
            Brand  brand = carService.getBrand(num);

            Safety_equipment  safety_equipment = carService.getSafety_equipment(num);

            Seat_configuration  seat_configuration = carService.getSeat_configuration(num);

            Transmission  transmission = carService.getTransmission(num);

            Wheel_brake  wheel_brake = carService.getWheel_brake(num);
            CarDetail carDetail1 = new CarDetail();
            carDetail1.setBrand(brand);
            carDetail1.setBasic_parameter(basic_parameter);
            carDetail1.setSafety_equipment(safety_equipment);
            carDetail1.setSeat_configuration(seat_configuration);
            carDetail1.setTransmission(transmission);
            carDetail1.setWheel_brake(wheel_brake);
            carDetail1.setCarid(carId);
            carDetail1.setAc_refrigerator(ac_refrigerator);
            carDetail1.setBody(body);
            carDetail1.setCarnum(num);
            carDetail1.setChassis_steering(chassis_steering);
            carDetail1.setExternal_configuration(external_configuration);
            carDetail1.setControl_configuration(control_configuration);
            carDetail1.setEngine(engine);
            carDetail1.setGlass_rearviewmirror(glass_rearviewmirror);
            carDetail1.setHigh_tech_configuration(high_tech_configuration);
            carDetail1.setInternal_configuration(internal_configuration);
            carDetail1.setLight_configuration(light_configuration);
            carDetail1.setMedia_configuration(media_configuration);
            jsonlist.add(carDetail1);
//            JSONObject Ac_refrigeratorJSON = (JSONObject)JSON.toJSON(ac_refrigerator);
//            JSONObject BodyJSON = (JSONObject)JSON.toJSON(body);
//            JSONObject Chassis_steeringJSON = (JSONObject)JSON.toJSON(chassis_steering);
//            JSONObject Control_configurationJSON = (JSONObject)JSON.toJSON(control_configuration);
//            JSONObject EngineJSON = (JSONObject)JSON.toJSON(engine);
//            JSONObject External_configurationJSON = (JSONObject)JSON.toJSON(external_configuration);
//            JSONObject Glass_rearviewmirrorJSON = (JSONObject)JSON.toJSON(glass_rearviewmirror);
//            JSONObject High_tech_configurationJSON = (JSONObject)JSON.toJSON(high_tech_configuration);
//            JSONObject Internal_configurationJSON = (JSONObject)JSON.toJSON(internal_configuration);
//            JSONObject Light_configurationJSON = (JSONObject)JSON.toJSON(light_configuration);
//            JSONObject Media_configurationJSON = (JSONObject)JSON.toJSON(media_configuration);
//            JSONObject json= new JSONObject();
//            json.put("carnum",num);
//            String S1 = json.toJSONString();
//            json.put("Ac_refrigerator",Ac_refrigeratorJSON);
//            String S2 = json.toJSONString();
//            json.put("Body",BodyJSON);
//            String S3 = json.toJSONString();
//            json.put("Chassis_steering",Chassis_steeringJSON);
//            String S4 = json.toJSONString();
//            json.put("Control_configuration",Control_configurationJSON);
//            String S5 = json.toJSONString();
//            json.put("Engine",EngineJSON);
//            String S6= json.toJSONString();
//            json.put("External_configuration",External_configurationJSON);
//            String S7 = json.toJSONString();
//            json.put("Glass_rearviewmirror",Glass_rearviewmirrorJSON);
//            String S8 = json.toJSONString();
//            json.put("High_tech_configuration",High_tech_configurationJSON);
//            String S9 = json.toJSONString();
//            json.put("Internal_configuration",Internal_configurationJSON);
//            String S10 = json.toJSONString();
//            json.put("Light_configuration",Light_configurationJSON);
//            String S11 = json.toJSONString();
//            json.put("Media_configuration",Media_configurationJSON);
//            String S12 = json.toJSONString();
//            result.put("carDetail"+i,ja);
            i++;
        }
        JSONArray ja = JSONArray.parseArray(JSON.toJSONString(jsonlist));
        return ja.toJSONString();
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
