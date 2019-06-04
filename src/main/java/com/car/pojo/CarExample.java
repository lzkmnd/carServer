package com.car.pojo;

import java.util.ArrayList;
import java.util.List;

public class CarExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table car
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table car
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table car
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table car
     *
     * @mbg.generated
     */
    public CarExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table car
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table car
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table car
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table car
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table car
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table car
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table car
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
     * This method corresponds to the database table car
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
     * This method corresponds to the database table car
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table car
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
     * This class corresponds to the database table car
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

        public Criteria andCaridEqualTo(String value) {
            addCriterion("carid =", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridNotEqualTo(String value) {
            addCriterion("carid <>", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridGreaterThan(String value) {
            addCriterion("carid >", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridGreaterThanOrEqualTo(String value) {
            addCriterion("carid >=", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridLessThan(String value) {
            addCriterion("carid <", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridLessThanOrEqualTo(String value) {
            addCriterion("carid <=", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridLike(String value) {
            addCriterion("carid like", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridNotLike(String value) {
            addCriterion("carid not like", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridIn(List<String> values) {
            addCriterion("carid in", values, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridNotIn(List<String> values) {
            addCriterion("carid not in", values, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridBetween(String value1, String value2) {
            addCriterion("carid between", value1, value2, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridNotBetween(String value1, String value2) {
            addCriterion("carid not between", value1, value2, "carid");
            return (Criteria) this;
        }

        public Criteria andBrandIsNull() {
            addCriterion("brand is null");
            return (Criteria) this;
        }

        public Criteria andBrandIsNotNull() {
            addCriterion("brand is not null");
            return (Criteria) this;
        }

        public Criteria andBrandEqualTo(String value) {
            addCriterion("brand =", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotEqualTo(String value) {
            addCriterion("brand <>", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThan(String value) {
            addCriterion("brand >", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThanOrEqualTo(String value) {
            addCriterion("brand >=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThan(String value) {
            addCriterion("brand <", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThanOrEqualTo(String value) {
            addCriterion("brand <=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLike(String value) {
            addCriterion("brand like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotLike(String value) {
            addCriterion("brand not like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandIn(List<String> values) {
            addCriterion("brand in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotIn(List<String> values) {
            addCriterion("brand not in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandBetween(String value1, String value2) {
            addCriterion("brand between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotBetween(String value1, String value2) {
            addCriterion("brand not between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("Name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("Name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("Name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("Name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("Name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("Name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("Name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("Name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("Name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("Name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("Name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("Name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("Name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("Name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("Type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("Type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("Type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("Type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("Type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("Type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("Type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("Type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("Type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("Type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("Type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("Type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("Type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("Type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andEnergyresourceIsNull() {
            addCriterion("EnergyResource is null");
            return (Criteria) this;
        }

        public Criteria andEnergyresourceIsNotNull() {
            addCriterion("EnergyResource is not null");
            return (Criteria) this;
        }

        public Criteria andEnergyresourceEqualTo(String value) {
            addCriterion("EnergyResource =", value, "energyresource");
            return (Criteria) this;
        }

        public Criteria andEnergyresourceNotEqualTo(String value) {
            addCriterion("EnergyResource <>", value, "energyresource");
            return (Criteria) this;
        }

        public Criteria andEnergyresourceGreaterThan(String value) {
            addCriterion("EnergyResource >", value, "energyresource");
            return (Criteria) this;
        }

        public Criteria andEnergyresourceGreaterThanOrEqualTo(String value) {
            addCriterion("EnergyResource >=", value, "energyresource");
            return (Criteria) this;
        }

        public Criteria andEnergyresourceLessThan(String value) {
            addCriterion("EnergyResource <", value, "energyresource");
            return (Criteria) this;
        }

        public Criteria andEnergyresourceLessThanOrEqualTo(String value) {
            addCriterion("EnergyResource <=", value, "energyresource");
            return (Criteria) this;
        }

        public Criteria andEnergyresourceLike(String value) {
            addCriterion("EnergyResource like", value, "energyresource");
            return (Criteria) this;
        }

        public Criteria andEnergyresourceNotLike(String value) {
            addCriterion("EnergyResource not like", value, "energyresource");
            return (Criteria) this;
        }

        public Criteria andEnergyresourceIn(List<String> values) {
            addCriterion("EnergyResource in", values, "energyresource");
            return (Criteria) this;
        }

        public Criteria andEnergyresourceNotIn(List<String> values) {
            addCriterion("EnergyResource not in", values, "energyresource");
            return (Criteria) this;
        }

        public Criteria andEnergyresourceBetween(String value1, String value2) {
            addCriterion("EnergyResource between", value1, value2, "energyresource");
            return (Criteria) this;
        }

        public Criteria andEnergyresourceNotBetween(String value1, String value2) {
            addCriterion("EnergyResource not between", value1, value2, "energyresource");
            return (Criteria) this;
        }

        public Criteria andDetailIsNull() {
            addCriterion("detail is null");
            return (Criteria) this;
        }

        public Criteria andDetailIsNotNull() {
            addCriterion("detail is not null");
            return (Criteria) this;
        }

        public Criteria andDetailEqualTo(String value) {
            addCriterion("detail =", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotEqualTo(String value) {
            addCriterion("detail <>", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailGreaterThan(String value) {
            addCriterion("detail >", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailGreaterThanOrEqualTo(String value) {
            addCriterion("detail >=", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailLessThan(String value) {
            addCriterion("detail <", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailLessThanOrEqualTo(String value) {
            addCriterion("detail <=", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailLike(String value) {
            addCriterion("detail like", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotLike(String value) {
            addCriterion("detail not like", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailIn(List<String> values) {
            addCriterion("detail in", values, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotIn(List<String> values) {
            addCriterion("detail not in", values, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailBetween(String value1, String value2) {
            addCriterion("detail between", value1, value2, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotBetween(String value1, String value2) {
            addCriterion("detail not between", value1, value2, "detail");
            return (Criteria) this;
        }

        public Criteria andPurlIsNull() {
            addCriterion("Purl is null");
            return (Criteria) this;
        }

        public Criteria andPurlIsNotNull() {
            addCriterion("Purl is not null");
            return (Criteria) this;
        }

        public Criteria andPurlEqualTo(String value) {
            addCriterion("Purl =", value, "purl");
            return (Criteria) this;
        }

        public Criteria andPurlNotEqualTo(String value) {
            addCriterion("Purl <>", value, "purl");
            return (Criteria) this;
        }

        public Criteria andPurlGreaterThan(String value) {
            addCriterion("Purl >", value, "purl");
            return (Criteria) this;
        }

        public Criteria andPurlGreaterThanOrEqualTo(String value) {
            addCriterion("Purl >=", value, "purl");
            return (Criteria) this;
        }

        public Criteria andPurlLessThan(String value) {
            addCriterion("Purl <", value, "purl");
            return (Criteria) this;
        }

        public Criteria andPurlLessThanOrEqualTo(String value) {
            addCriterion("Purl <=", value, "purl");
            return (Criteria) this;
        }

        public Criteria andPurlLike(String value) {
            addCriterion("Purl like", value, "purl");
            return (Criteria) this;
        }

        public Criteria andPurlNotLike(String value) {
            addCriterion("Purl not like", value, "purl");
            return (Criteria) this;
        }

        public Criteria andPurlIn(List<String> values) {
            addCriterion("Purl in", values, "purl");
            return (Criteria) this;
        }

        public Criteria andPurlNotIn(List<String> values) {
            addCriterion("Purl not in", values, "purl");
            return (Criteria) this;
        }

        public Criteria andPurlBetween(String value1, String value2) {
            addCriterion("Purl between", value1, value2, "purl");
            return (Criteria) this;
        }

        public Criteria andPurlNotBetween(String value1, String value2) {
            addCriterion("Purl not between", value1, value2, "purl");
            return (Criteria) this;
        }

        public Criteria andPurl1IsNull() {
            addCriterion("Purl1 is null");
            return (Criteria) this;
        }

        public Criteria andPurl1IsNotNull() {
            addCriterion("Purl1 is not null");
            return (Criteria) this;
        }

        public Criteria andPurl1EqualTo(String value) {
            addCriterion("Purl1 =", value, "purl1");
            return (Criteria) this;
        }

        public Criteria andPurl1NotEqualTo(String value) {
            addCriterion("Purl1 <>", value, "purl1");
            return (Criteria) this;
        }

        public Criteria andPurl1GreaterThan(String value) {
            addCriterion("Purl1 >", value, "purl1");
            return (Criteria) this;
        }

        public Criteria andPurl1GreaterThanOrEqualTo(String value) {
            addCriterion("Purl1 >=", value, "purl1");
            return (Criteria) this;
        }

        public Criteria andPurl1LessThan(String value) {
            addCriterion("Purl1 <", value, "purl1");
            return (Criteria) this;
        }

        public Criteria andPurl1LessThanOrEqualTo(String value) {
            addCriterion("Purl1 <=", value, "purl1");
            return (Criteria) this;
        }

        public Criteria andPurl1Like(String value) {
            addCriterion("Purl1 like", value, "purl1");
            return (Criteria) this;
        }

        public Criteria andPurl1NotLike(String value) {
            addCriterion("Purl1 not like", value, "purl1");
            return (Criteria) this;
        }

        public Criteria andPurl1In(List<String> values) {
            addCriterion("Purl1 in", values, "purl1");
            return (Criteria) this;
        }

        public Criteria andPurl1NotIn(List<String> values) {
            addCriterion("Purl1 not in", values, "purl1");
            return (Criteria) this;
        }

        public Criteria andPurl1Between(String value1, String value2) {
            addCriterion("Purl1 between", value1, value2, "purl1");
            return (Criteria) this;
        }

        public Criteria andPurl1NotBetween(String value1, String value2) {
            addCriterion("Purl1 not between", value1, value2, "purl1");
            return (Criteria) this;
        }

        public Criteria andPurl2IsNull() {
            addCriterion("Purl2 is null");
            return (Criteria) this;
        }

        public Criteria andPurl2IsNotNull() {
            addCriterion("Purl2 is not null");
            return (Criteria) this;
        }

        public Criteria andPurl2EqualTo(String value) {
            addCriterion("Purl2 =", value, "purl2");
            return (Criteria) this;
        }

        public Criteria andPurl2NotEqualTo(String value) {
            addCriterion("Purl2 <>", value, "purl2");
            return (Criteria) this;
        }

        public Criteria andPurl2GreaterThan(String value) {
            addCriterion("Purl2 >", value, "purl2");
            return (Criteria) this;
        }

        public Criteria andPurl2GreaterThanOrEqualTo(String value) {
            addCriterion("Purl2 >=", value, "purl2");
            return (Criteria) this;
        }

        public Criteria andPurl2LessThan(String value) {
            addCriterion("Purl2 <", value, "purl2");
            return (Criteria) this;
        }

        public Criteria andPurl2LessThanOrEqualTo(String value) {
            addCriterion("Purl2 <=", value, "purl2");
            return (Criteria) this;
        }

        public Criteria andPurl2Like(String value) {
            addCriterion("Purl2 like", value, "purl2");
            return (Criteria) this;
        }

        public Criteria andPurl2NotLike(String value) {
            addCriterion("Purl2 not like", value, "purl2");
            return (Criteria) this;
        }

        public Criteria andPurl2In(List<String> values) {
            addCriterion("Purl2 in", values, "purl2");
            return (Criteria) this;
        }

        public Criteria andPurl2NotIn(List<String> values) {
            addCriterion("Purl2 not in", values, "purl2");
            return (Criteria) this;
        }

        public Criteria andPurl2Between(String value1, String value2) {
            addCriterion("Purl2 between", value1, value2, "purl2");
            return (Criteria) this;
        }

        public Criteria andPurl2NotBetween(String value1, String value2) {
            addCriterion("Purl2 not between", value1, value2, "purl2");
            return (Criteria) this;
        }

        public Criteria andPurl3IsNull() {
            addCriterion("Purl3 is null");
            return (Criteria) this;
        }

        public Criteria andPurl3IsNotNull() {
            addCriterion("Purl3 is not null");
            return (Criteria) this;
        }

        public Criteria andPurl3EqualTo(String value) {
            addCriterion("Purl3 =", value, "purl3");
            return (Criteria) this;
        }

        public Criteria andPurl3NotEqualTo(String value) {
            addCriterion("Purl3 <>", value, "purl3");
            return (Criteria) this;
        }

        public Criteria andPurl3GreaterThan(String value) {
            addCriterion("Purl3 >", value, "purl3");
            return (Criteria) this;
        }

        public Criteria andPurl3GreaterThanOrEqualTo(String value) {
            addCriterion("Purl3 >=", value, "purl3");
            return (Criteria) this;
        }

        public Criteria andPurl3LessThan(String value) {
            addCriterion("Purl3 <", value, "purl3");
            return (Criteria) this;
        }

        public Criteria andPurl3LessThanOrEqualTo(String value) {
            addCriterion("Purl3 <=", value, "purl3");
            return (Criteria) this;
        }

        public Criteria andPurl3Like(String value) {
            addCriterion("Purl3 like", value, "purl3");
            return (Criteria) this;
        }

        public Criteria andPurl3NotLike(String value) {
            addCriterion("Purl3 not like", value, "purl3");
            return (Criteria) this;
        }

        public Criteria andPurl3In(List<String> values) {
            addCriterion("Purl3 in", values, "purl3");
            return (Criteria) this;
        }

        public Criteria andPurl3NotIn(List<String> values) {
            addCriterion("Purl3 not in", values, "purl3");
            return (Criteria) this;
        }

        public Criteria andPurl3Between(String value1, String value2) {
            addCriterion("Purl3 between", value1, value2, "purl3");
            return (Criteria) this;
        }

        public Criteria andPurl3NotBetween(String value1, String value2) {
            addCriterion("Purl3 not between", value1, value2, "purl3");
            return (Criteria) this;
        }

        public Criteria andPurl4IsNull() {
            addCriterion("Purl4 is null");
            return (Criteria) this;
        }

        public Criteria andPurl4IsNotNull() {
            addCriterion("Purl4 is not null");
            return (Criteria) this;
        }

        public Criteria andPurl4EqualTo(String value) {
            addCriterion("Purl4 =", value, "purl4");
            return (Criteria) this;
        }

        public Criteria andPurl4NotEqualTo(String value) {
            addCriterion("Purl4 <>", value, "purl4");
            return (Criteria) this;
        }

        public Criteria andPurl4GreaterThan(String value) {
            addCriterion("Purl4 >", value, "purl4");
            return (Criteria) this;
        }

        public Criteria andPurl4GreaterThanOrEqualTo(String value) {
            addCriterion("Purl4 >=", value, "purl4");
            return (Criteria) this;
        }

        public Criteria andPurl4LessThan(String value) {
            addCriterion("Purl4 <", value, "purl4");
            return (Criteria) this;
        }

        public Criteria andPurl4LessThanOrEqualTo(String value) {
            addCriterion("Purl4 <=", value, "purl4");
            return (Criteria) this;
        }

        public Criteria andPurl4Like(String value) {
            addCriterion("Purl4 like", value, "purl4");
            return (Criteria) this;
        }

        public Criteria andPurl4NotLike(String value) {
            addCriterion("Purl4 not like", value, "purl4");
            return (Criteria) this;
        }

        public Criteria andPurl4In(List<String> values) {
            addCriterion("Purl4 in", values, "purl4");
            return (Criteria) this;
        }

        public Criteria andPurl4NotIn(List<String> values) {
            addCriterion("Purl4 not in", values, "purl4");
            return (Criteria) this;
        }

        public Criteria andPurl4Between(String value1, String value2) {
            addCriterion("Purl4 between", value1, value2, "purl4");
            return (Criteria) this;
        }

        public Criteria andPurl4NotBetween(String value1, String value2) {
            addCriterion("Purl4 not between", value1, value2, "purl4");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table car
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
     * This class corresponds to the database table car
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