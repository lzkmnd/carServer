package com.car.service.impl;

import java.util.List;
import java.util.Map;

import com.car.mapper.UserMapper;
import com.car.pojo.User;
import com.car.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.car.mapper.CategoryMapper;
import com.car.pojo.Category;
import com.car.service.CategoryService;

@Service
public class UserServiceImpl  implements UserService {
    @Autowired
    UserMapper userMapper;


    public List<User> list(){
        return userMapper.list();
    }

    @Override
    public String getIdentify(String userid) {
        String identify = userMapper.getIdentify(userid);
        return identify;
    }

    public User getByUseid(String userid){
        return userMapper.getByUseid(userid);
    }
    public User getByUseridAndPassword(Map params){return userMapper.getByUseridAndPassword(params);}
    public String add(User user){
        boolean a = false;
        String msg ;
        if(userMapper.getByUseid(user.getUserid())==null){
            userMapper.add(user);
            a = true;
            msg = String.valueOf(a);
        }else{
            a = false;
            msg = String.valueOf(a)+"（"+user.getUserid()+"已存在"+"）";
        }
        return msg;
    }

}
