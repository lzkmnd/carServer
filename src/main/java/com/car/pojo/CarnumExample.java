package com.car.pojo;

import java.util.ArrayList;
import java.util.List;

public class CarnumExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table carnum
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table carnum
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table carnum
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table carnum
     *
     * @mbg.generated
     */
    public CarnumExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table carnum
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table carnum
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table carnum
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table carnum
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table carnum
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table carnum
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table carnum
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
     * This method corresponds to the database table carnum
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
     * This method corresponds to the database table carnum
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table carnum
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
     * This class corresponds to the database table carnum
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

        public Criteria andCaridIsNull() {
            addCriterion("carid is null");
            return (Criteria) this;
        }

        public Criteria andCaridIsNotNull() {
            addCriterion("carid is not null");
            return (Criteria) this;
        }

        public Criteria andCaridEqualTo(Integer value) {
            addCriterion("carid =", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridNotEqualTo(Integer value) {
            addCriterion("carid <>", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridGreaterThan(Integer value) {
            addCriterion("carid >", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridGreaterThanOrEqualTo(Integer value) {
            addCriterion("carid >=", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridLessThan(Integer value) {
            addCriterion("carid <", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridLessThanOrEqualTo(Integer value) {
            addCriterion("carid <=", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridIn(List<Integer> values) {
            addCriterion("carid in", values, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridNotIn(List<Integer> values) {
            addCriterion("carid not in", values, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridBetween(Integer value1, Integer value2) {
            addCriterion("carid between", value1, value2, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridNotBetween(Integer value1, Integer value2) {
            addCriterion("carid not between", value1, value2, "carid");
            return (Criteria) this;
        }

        public Criteria andNum1IsNull() {
            addCriterion("Num1 is null");
            return (Criteria) this;
        }

        public Criteria andNum1IsNotNull() {
            addCriterion("Num1 is not null");
            return (Criteria) this;
        }

        public Criteria andNum1EqualTo(String value) {
            addCriterion("Num1 =", value, "num1");
            return (Criteria) this;
        }

        public Criteria andNum1NotEqualTo(String value) {
            addCriterion("Num1 <>", value, "num1");
            return (Criteria) this;
        }

        public Criteria andNum1GreaterThan(String value) {
            addCriterion("Num1 >", value, "num1");
            return (Criteria) this;
        }

        public Criteria andNum1GreaterThanOrEqualTo(String value) {
            addCriterion("Num1 >=", value, "num1");
            return (Criteria) this;
        }

        public Criteria andNum1LessThan(String value) {
            addCriterion("Num1 <", value, "num1");
            return (Criteria) this;
        }

        public Criteria andNum1LessThanOrEqualTo(String value) {
            addCriterion("Num1 <=", value, "num1");
            return (Criteria) this;
        }

        public Criteria andNum1Like(String value) {
            addCriterion("Num1 like", value, "num1");
            return (Criteria) this;
        }

        public Criteria andNum1NotLike(String value) {
            addCriterion("Num1 not like", value, "num1");
            return (Criteria) this;
        }

        public Criteria andNum1In(List<String> values) {
            addCriterion("Num1 in", values, "num1");
            return (Criteria) this;
        }

        public Criteria andNum1NotIn(List<String> values) {
            addCriterion("Num1 not in", values, "num1");
            return (Criteria) this;
        }

        public Criteria andNum1Between(String value1, String value2) {
            addCriterion("Num1 between", value1, value2, "num1");
            return (Criteria) this;
        }

        public Criteria andNum1NotBetween(String value1, String value2) {
            addCriterion("Num1 not between", value1, value2, "num1");
            return (Criteria) this;
        }

        public Criteria andNum2IsNull() {
            addCriterion("Num2 is null");
            return (Criteria) this;
        }

        public Criteria andNum2IsNotNull() {
            addCriterion("Num2 is not null");
            return (Criteria) this;
        }

        public Criteria andNum2EqualTo(String value) {
            addCriterion("Num2 =", value, "num2");
            return (Criteria) this;
        }

        public Criteria andNum2NotEqualTo(String value) {
            addCriterion("Num2 <>", value, "num2");
            return (Criteria) this;
        }

        public Criteria andNum2GreaterThan(String value) {
            addCriterion("Num2 >", value, "num2");
            return (Criteria) this;
        }

        public Criteria andNum2GreaterThanOrEqualTo(String value) {
            addCriterion("Num2 >=", value, "num2");
            return (Criteria) this;
        }

        public Criteria andNum2LessThan(String value) {
            addCriterion("Num2 <", value, "num2");
            return (Criteria) this;
        }

        public Criteria andNum2LessThanOrEqualTo(String value) {
            addCriterion("Num2 <=", value, "num2");
            return (Criteria) this;
        }

        public Criteria andNum2Like(String value) {
            addCriterion("Num2 like", value, "num2");
            return (Criteria) this;
        }

        public Criteria andNum2NotLike(String value) {
            addCriterion("Num2 not like", value, "num2");
            return (Criteria) this;
        }

        public Criteria andNum2In(List<String> values) {
            addCriterion("Num2 in", values, "num2");
            return (Criteria) this;
        }

        public Criteria andNum2NotIn(List<String> values) {
            addCriterion("Num2 not in", values, "num2");
            return (Criteria) this;
        }

        public Criteria andNum2Between(String value1, String value2) {
            addCriterion("Num2 between", value1, value2, "num2");
            return (Criteria) this;
        }

        public Criteria andNum2NotBetween(String value1, String value2) {
            addCriterion("Num2 not between", value1, value2, "num2");
            return (Criteria) this;
        }

        public Criteria andNum3IsNull() {
            addCriterion("Num3 is null");
            return (Criteria) this;
        }

        public Criteria andNum3IsNotNull() {
            addCriterion("Num3 is not null");
            return (Criteria) this;
        }

        public Criteria andNum3EqualTo(String value) {
            addCriterion("Num3 =", value, "num3");
            return (Criteria) this;
        }

        public Criteria andNum3NotEqualTo(String value) {
            addCriterion("Num3 <>", value, "num3");
            return (Criteria) this;
        }

        public Criteria andNum3GreaterThan(String value) {
            addCriterion("Num3 >", value, "num3");
            return (Criteria) this;
        }

        public Criteria andNum3GreaterThanOrEqualTo(String value) {
            addCriterion("Num3 >=", value, "num3");
            return (Criteria) this;
        }

        public Criteria andNum3LessThan(String value) {
            addCriterion("Num3 <", value, "num3");
            return (Criteria) this;
        }

        public Criteria andNum3LessThanOrEqualTo(String value) {
            addCriterion("Num3 <=", value, "num3");
            return (Criteria) this;
        }

        public Criteria andNum3Like(String value) {
            addCriterion("Num3 like", value, "num3");
            return (Criteria) this;
        }

        public Criteria andNum3NotLike(String value) {
            addCriterion("Num3 not like", value, "num3");
            return (Criteria) this;
        }

        public Criteria andNum3In(List<String> values) {
            addCriterion("Num3 in", values, "num3");
            return (Criteria) this;
        }

        public Criteria andNum3NotIn(List<String> values) {
            addCriterion("Num3 not in", values, "num3");
            return (Criteria) this;
        }

        public Criteria andNum3Between(String value1, String value2) {
            addCriterion("Num3 between", value1, value2, "num3");
            return (Criteria) this;
        }

        public Criteria andNum3NotBetween(String value1, String value2) {
            addCriterion("Num3 not between", value1, value2, "num3");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table carnum
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
     * This class corresponds to the database table carnum
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