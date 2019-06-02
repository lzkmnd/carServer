package com.car.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//import com.car.mapper.UserMapper;
//import com.car.pojo.User;
import com.car.mapper.CarMapper;
import com.car.mapper.UserMapper;
import com.car.pojo.Car;
import com.car.pojo.CarExample;
import com.car.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.car.mapper.CategoryMapper;
import com.car.pojo.Category;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class MybatisTest {

    @Autowired
    private CategoryMapper categoryMapper;
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private CarMapper carMapper;


//    @Test
//    public void testUserAdd() {
//        User user = new User();
//        user.setUserid("lzkmnd22FAFASFSA2");
//        user.setPassword("123456");
//        user.setEmail("111@qq.com");
//        user.setArea("上海");
//        user.setIdentity("admin");
//        user.setPhone("1110");
//        userMapper.add(user);
//    }
    @Test
    public void testCategoryAdd() {
        Category category = new Category();
        category.setName("new Category");
        categoryMapper.add(category);
    }

    @Test
    public void testList() {
        System.out.println(categoryMapper);
        List<Category> cs=categoryMapper.list();
        for (Category c : cs) {
            System.out.println(c.getName());
        }
    }
    @Test
    public void getIdentify() {
        String S = userMapper.getIdentify("qqqq");
        System.out.println(S);
    }

    @Test
    public void testgetByUseridAndPassword() {
        System.out.println(userMapper);
        Map<String,Object> params = new HashMap<>();
        params.put("userid","lzkmnd222");
        params.put("password", "123456");
        User user = userMapper.getByUseridAndPassword(params);
        System.out.println(user);
    }

    @Test
    public void  testGetUser(){
        User user = userMapper.getByUseid("lzkmnd222");
        System.out.println(user);
    }

    @Test
    public void teesCar(){
        System.out.println(carMapper);
        Car car = carMapper.selectByPrimaryKey("1");
        System.out.println(car.getName());
//        List<Car> cs= mapper.selectByExample(example);
//
//        for (Car c : cs) {
//            System.out.println(c.getName());
//        }
    }


    @Test
    public void ListCar(){
        System.out.println(carMapper);
        List<Car> cs= carMapper.list();
        for (Car c : cs) {
            System.out.println(c.getName());
        }
    }

}

