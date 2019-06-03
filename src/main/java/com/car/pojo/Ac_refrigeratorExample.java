package com.car.pojo;

import java.util.ArrayList;
import java.util.List;

public class Ac_refrigeratorExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ac_refrigerator
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ac_refrigerator
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ac_refrigerator
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_refrigerator
     *
     * @mbg.generated
     */
    public Ac_refrigeratorExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_refrigerator
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_refrigerator
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_refrigerator
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_refrigerator
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_refrigerator
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_refrigerator
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_refrigerator
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_refrigerator
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_refrigerator
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_refrigerator
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ac_refrigerator
     *
     * @mbg.generated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andNumIsNull() {
            addCriterion("Num is null");
            return (Criteria) this;
        }

        public Criteria andNumIsNotNull() {
            addCriterion("Num is not null");
            return (Criteria) this;
        }

        public Criteria andNumEqualTo(String value) {
            addCriterion("Num =", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotEqualTo(String value) {
            addCriterion("Num <>", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThan(String value) {
            addCriterion("Num >", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanOrEqualTo(String value) {
            addCriterion("Num >=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThan(String value) {
            addCriterion("Num <", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThanOrEqualTo(String value) {
            addCriterion("Num <=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLike(String value) {
            addCriterion("Num like", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotLike(String value) {
            addCriterion("Num not like", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumIn(List<String> values) {
            addCriterion("Num in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotIn(List<String> values) {
            addCriterion("Num not in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumBetween(String value1, String value2) {
            addCriterion("Num between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotBetween(String value1, String value2) {
            addCriterion("Num not between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andAirconditioningcontrolmodeIsNull() {
            addCriterion("AirConditioningControlMode is null");
            return (Criteria) this;
        }

        public Criteria andAirconditioningcontrolmodeIsNotNull() {
            addCriterion("AirConditioningControlMode is not null");
            return (Criteria) this;
        }

        public Criteria andAirconditioningcontrolmodeEqualTo(String value) {
            addCriterion("AirConditioningControlMode =", value, "airconditioningcontrolmode");
            return (Criteria) this;
        }

        public Criteria andAirconditioningcontrolmodeNotEqualTo(String value) {
            addCriterion("AirConditioningControlMode <>", value, "airconditioningcontrolmode");
            return (Criteria) this;
        }

        public Criteria andAirconditioningcontrolmodeGreaterThan(String value) {
            addCriterion("AirConditioningControlMode >", value, "airconditioningcontrolmode");
            return (Criteria) this;
        }

        public Criteria andAirconditioningcontrolmodeGreaterThanOrEqualTo(String value) {
            addCriterion("AirConditioningControlMode >=", value, "airconditioningcontrolmode");
            return (Criteria) this;
        }

        public Criteria andAirconditioningcontrolmodeLessThan(String value) {
            addCriterion("AirConditioningControlMode <", value, "airconditioningcontrolmode");
            return (Criteria) this;
        }

        public Criteria andAirconditioningcontrolmodeLessThanOrEqualTo(String value) {
            addCriterion("AirConditioningControlMode <=", value, "airconditioningcontrolmode");
            return (Criteria) this;
        }

        public Criteria andAirconditioningcontrolmodeLike(String value) {
            addCriterion("AirConditioningControlMode like", value, "airconditioningcontrolmode");
            return (Criteria) this;
        }

        public Criteria andAirconditioningcontrolmodeNotLike(String value) {
            addCriterion("AirConditioningControlMode not like", value, "airconditioningcontrolmode");
            return (Criteria) this;
        }

        public Criteria andAirconditioningcontrolmodeIn(List<String> values) {
            addCriterion("AirConditioningControlMode in", values, "airconditioningcontrolmode");
            return (Criteria) this;
        }

        public Criteria andAirconditioningcontrolmodeNotIn(List<String> values) {
            addCriterion("AirConditioningControlMode not in", values, "airconditioningcontrolmode");
            return (Criteria) this;
        }

        public Criteria andAirconditioningcontrolmodeBetween(String value1, String value2) {
            addCriterion("AirConditioningControlMode between", value1, value2, "airconditioningcontrolmode");
            return (Criteria) this;
        }

        public Criteria andAirconditioningcontrolmodeNotBetween(String value1, String value2) {
            addCriterion("AirConditioningControlMode not between", value1, value2, "airconditioningcontrolmode");
            return (Criteria) this;
        }

        public Criteria andRearindependentairconditioningIsNull() {
            addCriterion("RearIndependentAirConditioning is null");
            return (Criteria) this;
        }

        public Criteria andRearindependentairconditioningIsNotNull() {
            addCriterion("RearIndependentAirConditioning is not null");
            return (Criteria) this;
        }

        public Criteria andRearindependentairconditioningEqualTo(String value) {
            addCriterion("RearIndependentAirConditioning =", value, "rearindependentairconditioning");
            return (Criteria) this;
        }

        public Criteria andRearindependentairconditioningNotEqualTo(String value) {
            addCriterion("RearIndependentAirConditioning <>", value, "rearindependentairconditioning");
            return (Criteria) this;
        }

        public Criteria andRearindependentairconditioningGreaterThan(String value) {
            addCriterion("RearIndependentAirConditioning >", value, "rearindependentairconditioning");
            return (Criteria) this;
        }

        public Criteria andRearindependentairconditioningGreaterThanOrEqualTo(String value) {
            addCriterion("RearIndependentAirConditioning >=", value, "rearindependentairconditioning");
            return (Criteria) this;
        }

        public Criteria andRearindependentairconditioningLessThan(String value) {
            addCriterion("RearIndependentAirConditioning <", value, "rearindependentairconditioning");
            return (Criteria) this;
        }

        public Criteria andRearindependentairconditioningLessThanOrEqualTo(String value) {
            addCriterion("RearIndependentAirConditioning <=", value, "rearindependentairconditioning");
            return (Criteria) this;
        }

        public Criteria andRearindependentairconditioningLike(String value) {
            addCriterion("RearIndependentAirConditioning like", value, "rearindependentairconditioning");
            return (Criteria) this;
        }

        public Criteria andRearindependentairconditioningNotLike(String value) {
            addCriterion("RearIndependentAirConditioning not like", value, "rearindependentairconditioning");
            return (Criteria) this;
        }

        public Criteria andRearindependentairconditioningIn(List<String> values) {
            addCriterion("RearIndependentAirConditioning in", values, "rearindependentairconditioning");
            return (Criteria) this;
        }

        public Criteria andRearindependentairconditioningNotIn(List<String> values) {
            addCriterion("RearIndependentAirConditioning not in", values, "rearindependentairconditioning");
            return (Criteria) this;
        }

        public Criteria andRearindependentairconditioningBetween(String value1, String value2) {
            addCriterion("RearIndependentAirConditioning between", value1, value2, "rearindependentairconditioning");
            return (Criteria) this;
        }

        public Criteria andRearindependentairconditioningNotBetween(String value1, String value2) {
            addCriterion("RearIndependentAirConditioning not between", value1, value2, "rearindependentairconditioning");
            return (Criteria) this;
        }

        public Criteria andRearseathvacductsIsNull() {
            addCriterion("RearSeatHVACDucts is null");
            return (Criteria) this;
        }

        public Criteria andRearseathvacductsIsNotNull() {
            addCriterion("RearSeatHVACDucts is not null");
            return (Criteria) this;
        }

        public Criteria andRearseathvacductsEqualTo(String value) {
            addCriterion("RearSeatHVACDucts =", value, "rearseathvacducts");
            return (Criteria) this;
        }

        public Criteria andRearseathvacductsNotEqualTo(String value) {
            addCriterion("RearSeatHVACDucts <>", value, "rearseathvacducts");
            return (Criteria) this;
        }

        public Criteria andRearseathvacductsGreaterThan(String value) {
            addCriterion("RearSeatHVACDucts >", value, "rearseathvacducts");
            return (Criteria) this;
        }

        public Criteria andRearseathvacductsGreaterThanOrEqualTo(String value) {
            addCriterion("RearSeatHVACDucts >=", value, "rearseathvacducts");
            return (Criteria) this;
        }

        public Criteria andRearseathvacductsLessThan(String value) {
            addCriterion("RearSeatHVACDucts <", value, "rearseathvacducts");
            return (Criteria) this;
        }

        public Criteria andRearseathvacductsLessThanOrEqualTo(String value) {
            addCriterion("RearSeatHVACDucts <=", value, "rearseathvacducts");
            return (Criteria) this;
        }

        public Criteria andRearseathvacductsLike(String value) {
            addCriterion("RearSeatHVACDucts like", value, "rearseathvacducts");
            return (Criteria) this;
        }

        public Criteria andRearseathvacductsNotLike(String value) {
            addCriterion("RearSeatHVACDucts not like", value, "rearseathvacducts");
            return (Criteria) this;
        }

        public Criteria andRearseathvacductsIn(List<String> values) {
            addCriterion("RearSeatHVACDucts in", values, "rearseathvacducts");
            return (Criteria) this;
        }

        public Criteria andRearseathvacductsNotIn(List<String> values) {
            addCriterion("RearSeatHVACDucts not in", values, "rearseathvacducts");
            return (Criteria) this;
        }

        public Criteria andRearseathvacductsBetween(String value1, String value2) {
            addCriterion("RearSeatHVACDucts between", value1, value2, "rearseathvacducts");
            return (Criteria) this;
        }

        public Criteria andRearseathvacductsNotBetween(String value1, String value2) {
            addCriterion("RearSeatHVACDucts not between", value1, value2, "rearseathvacducts");
            return (Criteria) this;
        }

        public Criteria andTemperaturezoningcontrolIsNull() {
            addCriterion("TemperatureZoningControl is null");
            return (Criteria) this;
        }

        public Criteria andTemperaturezoningcontrolIsNotNull() {
            addCriterion("TemperatureZoningControl is not null");
            return (Criteria) this;
        }

        public Criteria andTemperaturezoningcontrolEqualTo(String value) {
            addCriterion("TemperatureZoningControl =", value, "temperaturezoningcontrol");
            return (Criteria) this;
        }

        public Criteria andTemperaturezoningcontrolNotEqualTo(String value) {
            addCriterion("TemperatureZoningControl <>", value, "temperaturezoningcontrol");
            return (Criteria) this;
        }

        public Criteria andTemperaturezoningcontrolGreaterThan(String value) {
            addCriterion("TemperatureZoningControl >", value, "temperaturezoningcontrol");
            return (Criteria) this;
        }

        public Criteria andTemperaturezoningcontrolGreaterThanOrEqualTo(String value) {
            addCriterion("TemperatureZoningControl >=", value, "temperaturezoningcontrol");
            return (Criteria) this;
        }

        public Criteria andTemperaturezoningcontrolLessThan(String value) {
            addCriterion("TemperatureZoningControl <", value, "temperaturezoningcontrol");
            return (Criteria) this;
        }

        public Criteria andTemperaturezoningcontrolLessThanOrEqualTo(String value) {
            addCriterion("TemperatureZoningControl <=", value, "temperaturezoningcontrol");
            return (Criteria) this;
        }

        public Criteria andTemperaturezoningcontrolLike(String value) {
            addCriterion("TemperatureZoningControl like", value, "temperaturezoningcontrol");
            return (Criteria) this;
        }

        public Criteria andTemperaturezoningcontrolNotLike(String value) {
            addCriterion("TemperatureZoningControl not like", value, "temperaturezoningcontrol");
            return (Criteria) this;
        }

        public Criteria andTemperaturezoningcontrolIn(List<String> values) {
            addCriterion("TemperatureZoningControl in", values, "temperaturezoningcontrol");
            return (Criteria) this;
        }

        public Criteria andTemperaturezoningcontrolNotIn(List<String> values) {
            addCriterion("TemperatureZoningControl not in", values, "temperaturezoningcontrol");
            return (Criteria) this;
        }

        public Criteria andTemperaturezoningcontrolBetween(String value1, String value2) {
            addCriterion("TemperatureZoningControl between", value1, value2, "temperaturezoningcontrol");
            return (Criteria) this;
        }

        public Criteria andTemperaturezoningcontrolNotBetween(String value1, String value2) {
            addCriterion("TemperatureZoningControl not between", value1, value2, "temperaturezoningcontrol");
            return (Criteria) this;
        }

        public Criteria andInCarairconditioningPollenfiltrationIsNull() {
            addCriterion("In_carAirConditioning_Pollenfiltration is null");
            return (Criteria) this;
        }

        public Criteria andInCarairconditioningPollenfiltrationIsNotNull() {
            addCriterion("In_carAirConditioning_Pollenfiltration is not null");
            return (Criteria) this;
        }

        public Criteria andInCarairconditioningPollenfiltrationEqualTo(String value) {
            addCriterion("In_carAirConditioning_Pollenfiltration =", value, "inCarairconditioningPollenfiltration");
            return (Criteria) this;
        }

        public Criteria andInCarairconditioningPollenfiltrationNotEqualTo(String value) {
            addCriterion("In_carAirConditioning_Pollenfiltration <>", value, "inCarairconditioningPollenfiltration");
            return (Criteria) this;
        }

        public Criteria andInCarairconditioningPollenfiltrationGreaterThan(String value) {
            addCriterion("In_carAirConditioning_Pollenfiltration >", value, "inCarairconditioningPollenfiltration");
            return (Criteria) this;
        }

        public Criteria andInCarairconditioningPollenfiltrationGreaterThanOrEqualTo(String value) {
            addCriterion("In_carAirConditioning_Pollenfiltration >=", value, "inCarairconditioningPollenfiltration");
            return (Criteria) this;
        }

        public Criteria andInCarairconditioningPollenfiltrationLessThan(String value) {
            addCriterion("In_carAirConditioning_Pollenfiltration <", value, "inCarairconditioningPollenfiltration");
            return (Criteria) this;
        }

        public Criteria andInCarairconditioningPollenfiltrationLessThanOrEqualTo(String value) {
            addCriterion("In_carAirConditioning_Pollenfiltration <=", value, "inCarairconditioningPollenfiltration");
            return (Criteria) this;
        }

        public Criteria andInCarairconditioningPollenfiltrationLike(String value) {
            addCriterion("In_carAirConditioning_Pollenfiltration like", value, "inCarairconditioningPollenfiltration");
            return (Criteria) this;
        }

        public Criteria andInCarairconditioningPollenfiltrationNotLike(String value) {
            addCriterion("In_carAirConditioning_Pollenfiltration not like", value, "inCarairconditioningPollenfiltration");
            return (Criteria) this;
        }

        public Criteria andInCarairconditioningPollenfiltrationIn(List<String> values) {
            addCriterion("In_carAirConditioning_Pollenfiltration in", values, "inCarairconditioningPollenfiltration");
            return (Criteria) this;
        }

        public Criteria andInCarairconditioningPollenfiltrationNotIn(List<String> values) {
            addCriterion("In_carAirConditioning_Pollenfiltration not in", values, "inCarairconditioningPollenfiltration");
            return (Criteria) this;
        }

        public Criteria andInCarairconditioningPollenfiltrationBetween(String value1, String value2) {
            addCriterion("In_carAirConditioning_Pollenfiltration between", value1, value2, "inCarairconditioningPollenfiltration");
            return (Criteria) this;
        }

        public Criteria andInCarairconditioningPollenfiltrationNotBetween(String value1, String value2) {
            addCriterion("In_carAirConditioning_Pollenfiltration not between", value1, value2, "inCarairconditioningPollenfiltration");
            return (Criteria) this;
        }

        public Criteria andCarrefrigeratorIsNull() {
            addCriterion("CarRefrigerator is null");
            return (Criteria) this;
        }

        public Criteria andCarrefrigeratorIsNotNull() {
            addCriterion("CarRefrigerator is not null");
            return (Criteria) this;
        }

        public Criteria andCarrefrigeratorEqualTo(String value) {
            addCriterion("CarRefrigerator =", value, "carrefrigerator");
            return (Criteria) this;
        }

        public Criteria andCarrefrigeratorNotEqualTo(String value) {
            addCriterion("CarRefrigerator <>", value, "carrefrigerator");
            return (Criteria) this;
        }

        public Criteria andCarrefrigeratorGreaterThan(String value) {
            addCriterion("CarRefrigerator >", value, "carrefrigerator");
            return (Criteria) this;
        }

        public Criteria andCarrefrigeratorGreaterThanOrEqualTo(String value) {
            addCriterion("CarRefrigerator >=", value, "carrefrigerator");
            return (Criteria) this;
        }

        public Criteria andCarrefrigeratorLessThan(String value) {
            addCriterion("CarRefrigerator <", value, "carrefrigerator");
            return (Criteria) this;
        }

        public Criteria andCarrefrigeratorLessThanOrEqualTo(String value) {
            addCriterion("CarRefrigerator <=", value, "carrefrigerator");
            return (Criteria) this;
        }

        public Criteria andCarrefrigeratorLike(String value) {
            addCriterion("CarRefrigerator like", value, "carrefrigerator");
            return (Criteria) this;
        }

        public Criteria andCarrefrigeratorNotLike(String value) {
            addCriterion("CarRefrigerator not like", value, "carrefrigerator");
            return (Criteria) this;
        }

        public Criteria andCarrefrigeratorIn(List<String> values) {
            addCriterion("CarRefrigerator in", values, "carrefrigerator");
            return (Criteria) this;
        }

        public Criteria andCarrefrigeratorNotIn(List<String> values) {
            addCriterion("CarRefrigerator not in", values, "carrefrigerator");
            return (Criteria) this;
        }

        public Criteria andCarrefrigeratorBetween(String value1, String value2) {
            addCriterion("CarRefrigerator between", value1, value2, "carrefrigerator");
            return (Criteria) this;
        }

        public Criteria andCarrefrigeratorNotBetween(String value1, String value2) {
            addCriterion("CarRefrigerator not between", value1, value2, "carrefrigerator");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ac_refrigerator
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ac_refrigerator
     *
     * @mbg.generated
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}