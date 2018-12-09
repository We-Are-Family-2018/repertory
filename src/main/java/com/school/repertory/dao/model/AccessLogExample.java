package com.school.repertory.dao.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class AccessLogExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table access_log
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table access_log
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table access_log
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table access_log
     *
     * @mbg.generated
     */
    public AccessLogExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table access_log
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table access_log
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table access_log
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table access_log
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table access_log
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table access_log
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table access_log
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
     * This method corresponds to the database table access_log
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
     * This method corresponds to the database table access_log
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table access_log
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
     * This class corresponds to the database table access_log
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

        public Criteria andAccessIdIsNull() {
            addCriterion("access_id is null");
            return (Criteria) this;
        }

        public Criteria andAccessIdIsNotNull() {
            addCriterion("access_id is not null");
            return (Criteria) this;
        }

        public Criteria andAccessIdEqualTo(Integer value) {
            addCriterion("access_id =", value, "accessId");
            return (Criteria) this;
        }

        public Criteria andAccessIdNotEqualTo(Integer value) {
            addCriterion("access_id <>", value, "accessId");
            return (Criteria) this;
        }

        public Criteria andAccessIdGreaterThan(Integer value) {
            addCriterion("access_id >", value, "accessId");
            return (Criteria) this;
        }

        public Criteria andAccessIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("access_id >=", value, "accessId");
            return (Criteria) this;
        }

        public Criteria andAccessIdLessThan(Integer value) {
            addCriterion("access_id <", value, "accessId");
            return (Criteria) this;
        }

        public Criteria andAccessIdLessThanOrEqualTo(Integer value) {
            addCriterion("access_id <=", value, "accessId");
            return (Criteria) this;
        }

        public Criteria andAccessIdIn(List<Integer> values) {
            addCriterion("access_id in", values, "accessId");
            return (Criteria) this;
        }

        public Criteria andAccessIdNotIn(List<Integer> values) {
            addCriterion("access_id not in", values, "accessId");
            return (Criteria) this;
        }

        public Criteria andAccessIdBetween(Integer value1, Integer value2) {
            addCriterion("access_id between", value1, value2, "accessId");
            return (Criteria) this;
        }

        public Criteria andAccessIdNotBetween(Integer value1, Integer value2) {
            addCriterion("access_id not between", value1, value2, "accessId");
            return (Criteria) this;
        }

        public Criteria andAccessUsernameIsNull() {
            addCriterion("access_username is null");
            return (Criteria) this;
        }

        public Criteria andAccessUsernameIsNotNull() {
            addCriterion("access_username is not null");
            return (Criteria) this;
        }

        public Criteria andAccessUsernameEqualTo(String value) {
            addCriterion("access_username =", value, "accessUsername");
            return (Criteria) this;
        }

        public Criteria andAccessUsernameNotEqualTo(String value) {
            addCriterion("access_username <>", value, "accessUsername");
            return (Criteria) this;
        }

        public Criteria andAccessUsernameGreaterThan(String value) {
            addCriterion("access_username >", value, "accessUsername");
            return (Criteria) this;
        }

        public Criteria andAccessUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("access_username >=", value, "accessUsername");
            return (Criteria) this;
        }

        public Criteria andAccessUsernameLessThan(String value) {
            addCriterion("access_username <", value, "accessUsername");
            return (Criteria) this;
        }

        public Criteria andAccessUsernameLessThanOrEqualTo(String value) {
            addCriterion("access_username <=", value, "accessUsername");
            return (Criteria) this;
        }

        public Criteria andAccessUsernameLike(String value) {
            addCriterion("access_username like", value, "accessUsername");
            return (Criteria) this;
        }

        public Criteria andAccessUsernameNotLike(String value) {
            addCriterion("access_username not like", value, "accessUsername");
            return (Criteria) this;
        }

        public Criteria andAccessUsernameIn(List<String> values) {
            addCriterion("access_username in", values, "accessUsername");
            return (Criteria) this;
        }

        public Criteria andAccessUsernameNotIn(List<String> values) {
            addCriterion("access_username not in", values, "accessUsername");
            return (Criteria) this;
        }

        public Criteria andAccessUsernameBetween(String value1, String value2) {
            addCriterion("access_username between", value1, value2, "accessUsername");
            return (Criteria) this;
        }

        public Criteria andAccessUsernameNotBetween(String value1, String value2) {
            addCriterion("access_username not between", value1, value2, "accessUsername");
            return (Criteria) this;
        }

        public Criteria andAccessActionIsNull() {
            addCriterion("access_action is null");
            return (Criteria) this;
        }

        public Criteria andAccessActionIsNotNull() {
            addCriterion("access_action is not null");
            return (Criteria) this;
        }

        public Criteria andAccessActionEqualTo(String value) {
            addCriterion("access_action =", value, "accessAction");
            return (Criteria) this;
        }

        public Criteria andAccessActionNotEqualTo(String value) {
            addCriterion("access_action <>", value, "accessAction");
            return (Criteria) this;
        }

        public Criteria andAccessActionGreaterThan(String value) {
            addCriterion("access_action >", value, "accessAction");
            return (Criteria) this;
        }

        public Criteria andAccessActionGreaterThanOrEqualTo(String value) {
            addCriterion("access_action >=", value, "accessAction");
            return (Criteria) this;
        }

        public Criteria andAccessActionLessThan(String value) {
            addCriterion("access_action <", value, "accessAction");
            return (Criteria) this;
        }

        public Criteria andAccessActionLessThanOrEqualTo(String value) {
            addCriterion("access_action <=", value, "accessAction");
            return (Criteria) this;
        }

        public Criteria andAccessActionLike(String value) {
            addCriterion("access_action like", value, "accessAction");
            return (Criteria) this;
        }

        public Criteria andAccessActionNotLike(String value) {
            addCriterion("access_action not like", value, "accessAction");
            return (Criteria) this;
        }

        public Criteria andAccessActionIn(List<String> values) {
            addCriterion("access_action in", values, "accessAction");
            return (Criteria) this;
        }

        public Criteria andAccessActionNotIn(List<String> values) {
            addCriterion("access_action not in", values, "accessAction");
            return (Criteria) this;
        }

        public Criteria andAccessActionBetween(String value1, String value2) {
            addCriterion("access_action between", value1, value2, "accessAction");
            return (Criteria) this;
        }

        public Criteria andAccessActionNotBetween(String value1, String value2) {
            addCriterion("access_action not between", value1, value2, "accessAction");
            return (Criteria) this;
        }

        public Criteria andAccessDtIsNull() {
            addCriterion("access_dt is null");
            return (Criteria) this;
        }

        public Criteria andAccessDtIsNotNull() {
            addCriterion("access_dt is not null");
            return (Criteria) this;
        }

        public Criteria andAccessDtEqualTo(LocalDateTime value) {
            addCriterion("access_dt =", value, "accessDt");
            return (Criteria) this;
        }

        public Criteria andAccessDtNotEqualTo(LocalDateTime value) {
            addCriterion("access_dt <>", value, "accessDt");
            return (Criteria) this;
        }

        public Criteria andAccessDtGreaterThan(LocalDateTime value) {
            addCriterion("access_dt >", value, "accessDt");
            return (Criteria) this;
        }

        public Criteria andAccessDtGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("access_dt >=", value, "accessDt");
            return (Criteria) this;
        }

        public Criteria andAccessDtLessThan(LocalDateTime value) {
            addCriterion("access_dt <", value, "accessDt");
            return (Criteria) this;
        }

        public Criteria andAccessDtLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("access_dt <=", value, "accessDt");
            return (Criteria) this;
        }

        public Criteria andAccessDtIn(List<LocalDateTime> values) {
            addCriterion("access_dt in", values, "accessDt");
            return (Criteria) this;
        }

        public Criteria andAccessDtNotIn(List<LocalDateTime> values) {
            addCriterion("access_dt not in", values, "accessDt");
            return (Criteria) this;
        }

        public Criteria andAccessDtBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("access_dt between", value1, value2, "accessDt");
            return (Criteria) this;
        }

        public Criteria andAccessDtNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("access_dt not between", value1, value2, "accessDt");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table access_log
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
     * This class corresponds to the database table access_log
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