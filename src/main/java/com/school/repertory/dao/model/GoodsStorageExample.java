package com.school.repertory.dao.model;

import java.util.ArrayList;
import java.util.List;

public class GoodsStorageExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table goods_storage
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table goods_storage
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table goods_storage
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_storage
     *
     * @mbg.generated
     */
    public GoodsStorageExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_storage
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_storage
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_storage
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_storage
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_storage
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_storage
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_storage
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
     * This method corresponds to the database table goods_storage
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
     * This method corresponds to the database table goods_storage
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_storage
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
     * This class corresponds to the database table goods_storage
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

        public Criteria andStorageGoodsNoIsNull() {
            addCriterion("storage_goods_no is null");
            return (Criteria) this;
        }

        public Criteria andStorageGoodsNoIsNotNull() {
            addCriterion("storage_goods_no is not null");
            return (Criteria) this;
        }

        public Criteria andStorageGoodsNoEqualTo(String value) {
            addCriterion("storage_goods_no =", value, "storageGoodsNo");
            return (Criteria) this;
        }

        public Criteria andStorageGoodsNoNotEqualTo(String value) {
            addCriterion("storage_goods_no <>", value, "storageGoodsNo");
            return (Criteria) this;
        }

        public Criteria andStorageGoodsNoGreaterThan(String value) {
            addCriterion("storage_goods_no >", value, "storageGoodsNo");
            return (Criteria) this;
        }

        public Criteria andStorageGoodsNoGreaterThanOrEqualTo(String value) {
            addCriterion("storage_goods_no >=", value, "storageGoodsNo");
            return (Criteria) this;
        }

        public Criteria andStorageGoodsNoLessThan(String value) {
            addCriterion("storage_goods_no <", value, "storageGoodsNo");
            return (Criteria) this;
        }

        public Criteria andStorageGoodsNoLessThanOrEqualTo(String value) {
            addCriterion("storage_goods_no <=", value, "storageGoodsNo");
            return (Criteria) this;
        }

        public Criteria andStorageGoodsNoLike(String value) {
            addCriterion("storage_goods_no like", value, "storageGoodsNo");
            return (Criteria) this;
        }

        public Criteria andStorageGoodsNoNotLike(String value) {
            addCriterion("storage_goods_no not like", value, "storageGoodsNo");
            return (Criteria) this;
        }

        public Criteria andStorageGoodsNoIn(List<String> values) {
            addCriterion("storage_goods_no in", values, "storageGoodsNo");
            return (Criteria) this;
        }

        public Criteria andStorageGoodsNoNotIn(List<String> values) {
            addCriterion("storage_goods_no not in", values, "storageGoodsNo");
            return (Criteria) this;
        }

        public Criteria andStorageGoodsNoBetween(String value1, String value2) {
            addCriterion("storage_goods_no between", value1, value2, "storageGoodsNo");
            return (Criteria) this;
        }

        public Criteria andStorageGoodsNoNotBetween(String value1, String value2) {
            addCriterion("storage_goods_no not between", value1, value2, "storageGoodsNo");
            return (Criteria) this;
        }

        public Criteria andStorageCountIsNull() {
            addCriterion("storage_count is null");
            return (Criteria) this;
        }

        public Criteria andStorageCountIsNotNull() {
            addCriterion("storage_count is not null");
            return (Criteria) this;
        }

        public Criteria andStorageCountEqualTo(Integer value) {
            addCriterion("storage_count =", value, "storageCount");
            return (Criteria) this;
        }

        public Criteria andStorageCountNotEqualTo(Integer value) {
            addCriterion("storage_count <>", value, "storageCount");
            return (Criteria) this;
        }

        public Criteria andStorageCountGreaterThan(Integer value) {
            addCriterion("storage_count >", value, "storageCount");
            return (Criteria) this;
        }

        public Criteria andStorageCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("storage_count >=", value, "storageCount");
            return (Criteria) this;
        }

        public Criteria andStorageCountLessThan(Integer value) {
            addCriterion("storage_count <", value, "storageCount");
            return (Criteria) this;
        }

        public Criteria andStorageCountLessThanOrEqualTo(Integer value) {
            addCriterion("storage_count <=", value, "storageCount");
            return (Criteria) this;
        }

        public Criteria andStorageCountIn(List<Integer> values) {
            addCriterion("storage_count in", values, "storageCount");
            return (Criteria) this;
        }

        public Criteria andStorageCountNotIn(List<Integer> values) {
            addCriterion("storage_count not in", values, "storageCount");
            return (Criteria) this;
        }

        public Criteria andStorageCountBetween(Integer value1, Integer value2) {
            addCriterion("storage_count between", value1, value2, "storageCount");
            return (Criteria) this;
        }

        public Criteria andStorageCountNotBetween(Integer value1, Integer value2) {
            addCriterion("storage_count not between", value1, value2, "storageCount");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table goods_storage
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
     * This class corresponds to the database table goods_storage
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