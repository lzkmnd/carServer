package com.car.mapper;

import com.car.pojo.Light_configuration;
import com.car.pojo.Light_configurationExample;
import java.util.List;

public interface Light_configurationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table light_configuration
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String num);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table light_configuration
     *
     * @mbg.generated
     */
    int insert(Light_configuration record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table light_configuration
     *
     * @mbg.generated
     */
    int insertSelective(Light_configuration record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table light_configuration
     *
     * @mbg.generated
     */
    List<Light_configuration> selectByExample(Light_configurationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table light_configuration
     *
     * @mbg.generated
     */
    Light_configuration selectByPrimaryKey(String num);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table light_configuration
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Light_configuration record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table light_configuration
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Light_configuration record);
}