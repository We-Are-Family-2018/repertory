package com.school.repertory.dao.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class GoodsExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table goods
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table goods
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table goods
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated
     */
    public GoodsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
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
     * This method corresponds to the database table goods
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
     * This method corresponds to the database table goods
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
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
     * This class corresponds to the database table goods
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

        public Criteria andGoodsNoIsNull() {
            addCriterion("goods_no is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNoIsNotNull() {
            addCriterion("goods_no is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNoEqualTo(String value) {
            addCriterion("goods_no =", value, "goodsNo");
            return (Criteria) this;
        }

        public Criteria andGoodsNoNotEqualTo(String value) {
            addCriterion("goods_no <>", value, "goodsNo");
            return (Criteria) this;
        }

        public Criteria andGoodsNoGreaterThan(String value) {
            addCriterion("goods_no >", value, "goodsNo");
            return (Criteria) this;
        }

        public Criteria andGoodsNoGreaterThanOrEqualTo(String value) {
            addCriterion("goods_no >=", value, "goodsNo");
            return (Criteria) this;
        }

        public Criteria andGoodsNoLessThan(String value) {
            addCriterion("goods_no <", value, "goodsNo");
            return (Criteria) this;
        }

        public Criteria andGoodsNoLessThanOrEqualTo(String value) {
            addCriterion("goods_no <=", value, "goodsNo");
            return (Criteria) this;
        }

        public Criteria andGoodsNoLike(String value) {
            addCriterion("goods_no like", value, "goodsNo");
            return (Criteria) this;
        }

        public Criteria andGoodsNoNotLike(String value) {
            addCriterion("goods_no not like", value, "goodsNo");
            return (Criteria) this;
        }

        public Criteria andGoodsNoIn(List<String> values) {
            addCriterion("goods_no in", values, "goodsNo");
            return (Criteria) this;
        }

        public Criteria andGoodsNoNotIn(List<String> values) {
            addCriterion("goods_no not in", values, "goodsNo");
            return (Criteria) this;
        }

        public Criteria andGoodsNoBetween(String value1, String value2) {
            addCriterion("goods_no between", value1, value2, "goodsNo");
            return (Criteria) this;
        }

        public Criteria andGoodsNoNotBetween(String value1, String value2) {
            addCriterion("goods_no not between", value1, value2, "goodsNo");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNull() {
            addCriterion("goods_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNotNull() {
            addCriterion("goods_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEqualTo(String value) {
            addCriterion("goods_name =", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotEqualTo(String value) {
            addCriterion("goods_name <>", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThan(String value) {
            addCriterion("goods_name >", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("goods_name >=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThan(String value) {
            addCriterion("goods_name <", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("goods_name <=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLike(String value) {
            addCriterion("goods_name like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotLike(String value) {
            addCriterion("goods_name not like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIn(List<String> values) {
            addCriterion("goods_name in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotIn(List<String> values) {
            addCriterion("goods_name not in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameBetween(String value1, String value2) {
            addCriterion("goods_name between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotBetween(String value1, String value2) {
            addCriterion("goods_name not between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsSizeLengthIsNull() {
            addCriterion("goods_size_length is null");
            return (Criteria) this;
        }

        public Criteria andGoodsSizeLengthIsNotNull() {
            addCriterion("goods_size_length is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsSizeLengthEqualTo(BigDecimal value) {
            addCriterion("goods_size_length =", value, "goodsSizeLength");
            return (Criteria) this;
        }

        public Criteria andGoodsSizeLengthNotEqualTo(BigDecimal value) {
            addCriterion("goods_size_length <>", value, "goodsSizeLength");
            return (Criteria) this;
        }

        public Criteria andGoodsSizeLengthGreaterThan(BigDecimal value) {
            addCriterion("goods_size_length >", value, "goodsSizeLength");
            return (Criteria) this;
        }

        public Criteria andGoodsSizeLengthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_size_length >=", value, "goodsSizeLength");
            return (Criteria) this;
        }

        public Criteria andGoodsSizeLengthLessThan(BigDecimal value) {
            addCriterion("goods_size_length <", value, "goodsSizeLength");
            return (Criteria) this;
        }

        public Criteria andGoodsSizeLengthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_size_length <=", value, "goodsSizeLength");
            return (Criteria) this;
        }

        public Criteria andGoodsSizeLengthIn(List<BigDecimal> values) {
            addCriterion("goods_size_length in", values, "goodsSizeLength");
            return (Criteria) this;
        }

        public Criteria andGoodsSizeLengthNotIn(List<BigDecimal> values) {
            addCriterion("goods_size_length not in", values, "goodsSizeLength");
            return (Criteria) this;
        }

        public Criteria andGoodsSizeLengthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_size_length between", value1, value2, "goodsSizeLength");
            return (Criteria) this;
        }

        public Criteria andGoodsSizeLengthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_size_length not between", value1, value2, "goodsSizeLength");
            return (Criteria) this;
        }

        public Criteria andGoodsSizeWidthIsNull() {
            addCriterion("goods_size_width is null");
            return (Criteria) this;
        }

        public Criteria andGoodsSizeWidthIsNotNull() {
            addCriterion("goods_size_width is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsSizeWidthEqualTo(BigDecimal value) {
            addCriterion("goods_size_width =", value, "goodsSizeWidth");
            return (Criteria) this;
        }

        public Criteria andGoodsSizeWidthNotEqualTo(BigDecimal value) {
            addCriterion("goods_size_width <>", value, "goodsSizeWidth");
            return (Criteria) this;
        }

        public Criteria andGoodsSizeWidthGreaterThan(BigDecimal value) {
            addCriterion("goods_size_width >", value, "goodsSizeWidth");
            return (Criteria) this;
        }

        public Criteria andGoodsSizeWidthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_size_width >=", value, "goodsSizeWidth");
            return (Criteria) this;
        }

        public Criteria andGoodsSizeWidthLessThan(BigDecimal value) {
            addCriterion("goods_size_width <", value, "goodsSizeWidth");
            return (Criteria) this;
        }

        public Criteria andGoodsSizeWidthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_size_width <=", value, "goodsSizeWidth");
            return (Criteria) this;
        }

        public Criteria andGoodsSizeWidthIn(List<BigDecimal> values) {
            addCriterion("goods_size_width in", values, "goodsSizeWidth");
            return (Criteria) this;
        }

        public Criteria andGoodsSizeWidthNotIn(List<BigDecimal> values) {
            addCriterion("goods_size_width not in", values, "goodsSizeWidth");
            return (Criteria) this;
        }

        public Criteria andGoodsSizeWidthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_size_width between", value1, value2, "goodsSizeWidth");
            return (Criteria) this;
        }

        public Criteria andGoodsSizeWidthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_size_width not between", value1, value2, "goodsSizeWidth");
            return (Criteria) this;
        }

        public Criteria andGoodsSizeHeightIsNull() {
            addCriterion("goods_size_height is null");
            return (Criteria) this;
        }

        public Criteria andGoodsSizeHeightIsNotNull() {
            addCriterion("goods_size_height is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsSizeHeightEqualTo(BigDecimal value) {
            addCriterion("goods_size_height =", value, "goodsSizeHeight");
            return (Criteria) this;
        }

        public Criteria andGoodsSizeHeightNotEqualTo(BigDecimal value) {
            addCriterion("goods_size_height <>", value, "goodsSizeHeight");
            return (Criteria) this;
        }

        public Criteria andGoodsSizeHeightGreaterThan(BigDecimal value) {
            addCriterion("goods_size_height >", value, "goodsSizeHeight");
            return (Criteria) this;
        }

        public Criteria andGoodsSizeHeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_size_height >=", value, "goodsSizeHeight");
            return (Criteria) this;
        }

        public Criteria andGoodsSizeHeightLessThan(BigDecimal value) {
            addCriterion("goods_size_height <", value, "goodsSizeHeight");
            return (Criteria) this;
        }

        public Criteria andGoodsSizeHeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_size_height <=", value, "goodsSizeHeight");
            return (Criteria) this;
        }

        public Criteria andGoodsSizeHeightIn(List<BigDecimal> values) {
            addCriterion("goods_size_height in", values, "goodsSizeHeight");
            return (Criteria) this;
        }

        public Criteria andGoodsSizeHeightNotIn(List<BigDecimal> values) {
            addCriterion("goods_size_height not in", values, "goodsSizeHeight");
            return (Criteria) this;
        }

        public Criteria andGoodsSizeHeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_size_height between", value1, value2, "goodsSizeHeight");
            return (Criteria) this;
        }

        public Criteria andGoodsSizeHeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_size_height not between", value1, value2, "goodsSizeHeight");
            return (Criteria) this;
        }

        public Criteria andGoodsValueIsNull() {
            addCriterion("goods_value is null");
            return (Criteria) this;
        }

        public Criteria andGoodsValueIsNotNull() {
            addCriterion("goods_value is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsValueEqualTo(BigDecimal value) {
            addCriterion("goods_value =", value, "goodsValue");
            return (Criteria) this;
        }

        public Criteria andGoodsValueNotEqualTo(BigDecimal value) {
            addCriterion("goods_value <>", value, "goodsValue");
            return (Criteria) this;
        }

        public Criteria andGoodsValueGreaterThan(BigDecimal value) {
            addCriterion("goods_value >", value, "goodsValue");
            return (Criteria) this;
        }

        public Criteria andGoodsValueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_value >=", value, "goodsValue");
            return (Criteria) this;
        }

        public Criteria andGoodsValueLessThan(BigDecimal value) {
            addCriterion("goods_value <", value, "goodsValue");
            return (Criteria) this;
        }

        public Criteria andGoodsValueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_value <=", value, "goodsValue");
            return (Criteria) this;
        }

        public Criteria andGoodsValueIn(List<BigDecimal> values) {
            addCriterion("goods_value in", values, "goodsValue");
            return (Criteria) this;
        }

        public Criteria andGoodsValueNotIn(List<BigDecimal> values) {
            addCriterion("goods_value not in", values, "goodsValue");
            return (Criteria) this;
        }

        public Criteria andGoodsValueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_value between", value1, value2, "goodsValue");
            return (Criteria) this;
        }

        public Criteria andGoodsValueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_value not between", value1, value2, "goodsValue");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table goods
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
     * This class corresponds to the database table goods
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