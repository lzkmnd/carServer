package com.car.test;


import java.io.InputStream;
import java.util.List;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import com.car.mapper.CarMapper;
import com.car.pojo.Car;
import com.car.pojo.CarExample;

public class TestMybatis {
    public static void main(String args[]) throws Exception {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session=sqlSessionFactory.openSession();

        CarExample example = new CarExample();
        example.createCriteria().andNameLike("%9%");
        CarMapper mapper = session.getMapper(CarMapper.class);
        List<Car> cs= mapper.selectByExample(example);

        for (Car c : cs) {
            System.out.println(c.getName());
        }

    }
}
