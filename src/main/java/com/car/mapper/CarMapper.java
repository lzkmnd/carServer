package com.car.mapper;

import com.car.pojo.Car;
import com.car.pojo.CarExample;
import java.util.List;

public interface CarMapper {

    int deleteByPrimaryKey(String carid);

    int insert(Car record);

    int insertSelective(Car record);

    List<Car> list();
    List<Car> listMain();

    List<Car> selectByExample(CarExample example);

    Car selectByPrimaryKey(String carid);

    int updateByPrimaryKeySelective(Car record);

    int updateByPrimaryKey(Car record);
}