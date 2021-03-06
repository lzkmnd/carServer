package com.car.mapper;

import com.car.pojo.Engine;
import com.car.pojo.EngineExample;
import java.util.List;

public interface EngineMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table engine
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String num);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table engine
     *
     * @mbg.generated
     */
    int insert(Engine record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table engine
     *
     * @mbg.generated
     */
    int insertSelective(Engine record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table engine
     *
     * @mbg.generated
     */
    List<Engine> selectByExample(EngineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table engine
     *
     * @mbg.generated
     */
    Engine selectByPrimaryKey(String num);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table engine
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Engine record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table engine
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Engine record);
}