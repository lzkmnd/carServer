package com.car.service;

import com.car.pojo.*;

import java.util.List;

public interface CarService {
    List<Car> list();
    List<Car> listMain();
    Ac_refrigerator getAc_refrigerator(String Num);
    Body getBody(String Num);
    Carnum getCarnum(String Num);
    Chassis_steering getChassis_steering(String Num);
    Control_configuration getControl_configuration(String Num);
    Engine getEngine(String Num);
    External_configuration getExternal_configuration(String Num);
    Glass_rearviewmirror getGlass_rearviewmirror(String Num);
    High_tech_configuration getHigh_tech_configuration(String Num);
    Internal_configuration getInternal_configuration(String Num);
    Light_configuration getLight_configuration(String Num);
    Media_configuration getMedia_configuration(String Num);
}
