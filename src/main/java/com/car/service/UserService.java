package com.car.service;

import java.util.List;
import java.util.Map;

import com.car.pojo.User;

public interface UserService {

    List<User> list();
    User getByUseid(String userid);
    User getByUseridAndPassword(Map params);
    String add(User user);
}
