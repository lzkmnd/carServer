package com.car.mapper;

import com.car.pojo.Body;
import com.car.pojo.BodyExample;
import java.util.List;

public interface BodyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table body
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String num);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table body
     *
     * @mbg.generated
     */
    int insert(Body record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table body
     *
     * @mbg.generated
     */
    int insertSelective(Body record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table body
     *
     * @mbg.generated
     */
    List<Body> selectByExample(BodyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table body
     *
     * @mbg.generated
     */
    Body selectByPrimaryKey(String num);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table body
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Body record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table body
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Body record);
}