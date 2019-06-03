package com.car.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//import com.car.mapper.UserMapper;
//import com.car.pojo.User;
import com.car.mapper.*;
import com.car.pojo.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class MybatisTest {
    @Autowired
    private  Ac_refrigeratorMapper ac_refrigeratorMapper ;
    @Autowired
    private  Chassis_steeringMapper chassis_steeringMapper ;
    @Autowired
    private  Control_configurationMapper control_configurationMapper ;
    @Autowired
    private  Internal_configurationMapper internal_configurationMapper;
    @Autowired
    private  External_configurationMapper external_configurationMapper ;
    @Autowired
    private  Glass_rearviewmirrorMapper glass_rearviewmirrorMapper ;
    @Autowired
    private  High_tech_configurationMapper high_tech_configurationMapper ;
    @Autowired
    private  Light_configurationMapper light_configurationMapper ;
    @Autowired
    private  Media_configurationMapper media_configurationMapper ;
    @Autowired
    private  EngineMapper engineMapper ;
    @Autowired
    private  BodyMapper bodyMapper;
    @Autowired
    private CarnumMapper carnumMapper;
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

    @Test
    public void CarnumselectByPrimaryKey(){
        System.out.println(carnumMapper);
        Carnum cn= carnumMapper.selectByPrimaryKey(1);
        System.out.println(cn.getNum1());
        System.out.println(cn.getNum2());

    }

    @Test
    public void  BodySelectByPrimaryKey(){
        System.out.println(bodyMapper);
        Body cn= bodyMapper.selectByPrimaryKey("25379");
        System.out.println(cn.getBodystructure());
        // ac_refrigerator cn2= Ac_refrigeratorMapper.selectByPrimaryKey(carnumMapper.selectByPrimaryKey(1).getNum2());
        // System.out.println(cn.toString());
    }
    @Test
    public void  Ac_refrigeratorSelectByPrimaryKey(){
        System.out.println(ac_refrigeratorMapper);
        Ac_refrigerator cn= ac_refrigeratorMapper.selectByPrimaryKey("25379");
        System.out.println(cn.getAirconditioningcontrolmode());
        // ac_refrigerator cn2= Ac_refrigeratorMapper.selectByPrimaryKey(carnumMapper.selectByPrimaryKey(1).getNum2());
        // System.out.println(cn.toString());
    }
    @Test
    public void  Chassis_steeringSelectByPrimaryKey(){
        System.out.println(chassis_steeringMapper);
        Chassis_steering cn= chassis_steeringMapper.selectByPrimaryKey("25379");
    }
    @Test
    public void  control_configurationSelectByPrimaryKey(){
        System.out.println(control_configurationMapper);
        Control_configuration cn= control_configurationMapper.selectByPrimaryKey("25379");
    }
    @Test
    public void  external_configurationSelectByPrimaryKey(){
        System.out.println(external_configurationMapper);
        External_configuration cn= external_configurationMapper.selectByPrimaryKey("25379");
    }
    @Test
    public void  glass_rearviewmirrorSelectByPrimaryKey(){
        System.out.println(glass_rearviewmirrorMapper);
        Glass_rearviewmirror cn= glass_rearviewmirrorMapper.selectByPrimaryKey("25379");
    }
    @Test
    public void  high_tech_configurationSelectByPrimaryKey(){
        System.out.println(high_tech_configurationMapper);
        High_tech_configuration cn= high_tech_configurationMapper.selectByPrimaryKey("25379");
    }
    @Test
    public void  Light_configurationMapperSelectByPrimaryKey(){
        System.out.println(light_configurationMapper);
        Light_configuration cn= light_configurationMapper.selectByPrimaryKey("25379");
    }
    @Test
    public void  Media_configurationSelectByPrimaryKey(){
        System.out.println(media_configurationMapper);
        Media_configuration cn= media_configurationMapper.selectByPrimaryKey("25379");
    }
    @Test
    public void  EngineSelectByPrimaryKey(){
        System.out.println(engineMapper);
        Engine cn= engineMapper.selectByPrimaryKey("25379");
    }
    @Test
    public void  Internal_configurationSelectByPrimaryKey(){
        System.out.println(internal_configurationMapper);
        Internal_configuration cn= internal_configurationMapper.selectByPrimaryKey("25379");
    }


}

