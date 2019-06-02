package com.car.service.impl;

import com.car.mapper.CarMapper;
import com.car.pojo.Car;
import com.car.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

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
}
