package com.car.mapper;

import com.car.pojo.Media_configuration;
import com.car.pojo.Media_configurationExample;
import java.util.List;

public interface Media_configurationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table media_configuration
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String num);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table media_configuration
     *
     * @mbg.generated
     */
    int insert(Media_configuration record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table media_configuration
     *
     * @mbg.generated
     */
    int insertSelective(Media_configuration record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table media_configuration
     *
     * @mbg.generated
     */
    List<Media_configuration> selectByExample(Media_configurationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table media_configuration
     *
     * @mbg.generated
     */
    Media_configuration selectByPrimaryKey(String num);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table media_configuration
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Media_configuration record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table media_configuration
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Media_configuration record);
}