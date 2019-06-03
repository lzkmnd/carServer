package com.car.service.impl;

import com.car.mapper.*;
import com.car.pojo.*;
import com.car.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    @Autowired
    Ac_refrigeratorMapper ac_refrigeratorMapper ;
    @Autowired
    Chassis_steeringMapper chassis_steeringMapper ;
    @Autowired
    Control_configurationMapper control_configurationMapper ;
    @Autowired
    External_configurationMapper external_configurationMapper ;
    @Autowired
    Glass_rearviewmirrorMapper glass_rearviewmirrorMapper ;
    @Autowired
    High_tech_configurationMapper high_tech_configurationMapper ;
    @Autowired
    Light_configurationMapper light_configurationMapper ;
    @Autowired
    Media_configurationMapper media_configurationMapper ;
    @Autowired
    Internal_configurationMapper internal_configurationMapper;
    @Autowired
    EngineMapper engineMapper ;
    @Autowired
    BodyMapper bodyMapper;
    @Autowired
    CarnumMapper carnumMapper;
    @Autowired
    CategoryMapper categoryMapper;
    @Autowired
    UserMapper userMapper;
    @Autowired
    CarMapper carMapper;
    

    @Override
    public List<Car> list() {
        return carMapper.list();
    }

    @Override
    public List<Car> listMain() {
        return carMapper.listMain();
    }

    @Override
    public Ac_refrigerator getAc_refrigerator(String Num) {
        return ac_refrigeratorMapper.selectByPrimaryKey(Num);
    }

    @Override
    public Body getBody(String Num) {
        return bodyMapper.selectByPrimaryKey(Num);
    }

    @Override
    public Carnum getCarnum(String Num) {
        return carnumMapper.selectByPrimaryKey(Integer.valueOf(Num));
    }

    @Override
    public Chassis_steering getChassis_steering(String Num) {
        return chassis_steeringMapper.selectByPrimaryKey(Num);
    }

    @Override
    public Control_configuration getControl_configuration(String Num) {
        return control_configurationMapper.selectByPrimaryKey(Num);
    }

    @Override
    public Engine getEngine(String Num) {
        return engineMapper.selectByPrimaryKey(Num);
    }

    @Override
    public External_configuration getExternal_configuration(String Num) {
        return external_configurationMapper.selectByPrimaryKey(Num);
    }

    @Override
    public Glass_rearviewmirror getGlass_rearviewmirror(String Num) {
        return glass_rearviewmirrorMapper.selectByPrimaryKey(Num);
    }

    @Override
    public High_tech_configuration getHigh_tech_configuration(String Num) {
        return high_tech_configurationMapper.selectByPrimaryKey(Num);
    }

    @Override
    public Internal_configuration getInternal_configuration(String Num) {
        return internal_configurationMapper.selectByPrimaryKey(Num);
    }

    @Override
    public Light_configuration getLight_configuration(String Num) {
        return light_configurationMapper.selectByPrimaryKey(Num);
    }

    @Override
    public Media_configuration getMedia_configuration(String Num) {
        return media_configurationMapper.selectByPrimaryKey(Num);
    }
}
