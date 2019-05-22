package com.car.mapper;

import com.car.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    public int add(User user);


    public void delete(String userid);


    public User getByUseid(String userid);

    public User getByUseridAndPassword(Map params);

    public int update(User user);


    public List<User> list();

}