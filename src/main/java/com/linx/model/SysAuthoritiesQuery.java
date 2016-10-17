package com.linx.model;

import java.util.ArrayList;
import java.util.List;

public class SysAuthoritiesQuery {
    /**
     * sys_authorities
     */
    protected String orderByClause;

    /**
     * sys_authorities
     */
    protected boolean distinct;

    /**
     * sys_authorities
     */
    protected List<Criteria> oredCriteria;

    /**
     * sys_authorities
     */
    public SysAuthoritiesQuery() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * sys_authorities
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * sys_authorities
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * sys_authorities
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * sys_authorities
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * sys_authorities
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * sys_authorities
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * sys_authorities
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * sys_authorities
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * sys_authorities
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * sys_authorities
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class corresponds to the database table sys_authorities
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

        public Criteria andAuthorityIdIsNull() {
            addCriterion("AUTHORITY_ID is null");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdIsNotNull() {
            addCriterion("AUTHORITY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdEqualTo(String value) {
            addCriterion("AUTHORITY_ID =", value, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdNotEqualTo(String value) {
            addCriterion("AUTHORITY_ID <>", value, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdGreaterThan(String value) {
            addCriterion("AUTHORITY_ID >", value, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdGreaterThanOrEqualTo(String value) {
            addCriterion("AUTHORITY_ID >=", value, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdLessThan(String value) {
            addCriterion("AUTHORITY_ID <", value, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdLessThanOrEqualTo(String value) {
            addCriterion("AUTHORITY_ID <=", value, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdLike(String value) {
            addCriterion("AUTHORITY_ID like", value, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdNotLike(String value) {
            addCriterion("AUTHORITY_ID not like", value, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdIn(List<String> values) {
            addCriterion("AUTHORITY_ID in", values, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdNotIn(List<String> values) {
            addCriterion("AUTHORITY_ID not in", values, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdBetween(String value1, String value2) {
            addCriterion("AUTHORITY_ID between", value1, value2, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdNotBetween(String value1, String value2) {
            addCriterion("AUTHORITY_ID not between", value1, value2, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityMarkIsNull() {
            addCriterion("AUTHORITY_MARK is null");
            return (Criteria) this;
        }

        public Criteria andAuthorityMarkIsNotNull() {
            addCriterion("AUTHORITY_MARK is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorityMarkEqualTo(String value) {
            addCriterion("AUTHORITY_MARK =", value, "authorityMark");
            return (Criteria) this;
        }

        public Criteria andAuthorityMarkNotEqualTo(String value) {
            addCriterion("AUTHORITY_MARK <>", value, "authorityMark");
            return (Criteria) this;
        }

        public Criteria andAuthorityMarkGreaterThan(String value) {
            addCriterion("AUTHORITY_MARK >", value, "authorityMark");
            return (Criteria) this;
        }

        public Criteria andAuthorityMarkGreaterThanOrEqualTo(String value) {
            addCriterion("AUTHORITY_MARK >=", value, "authorityMark");
            return (Criteria) this;
        }

        public Criteria andAuthorityMarkLessThan(String value) {
            addCriterion("AUTHORITY_MARK <", value, "authorityMark");
            return (Criteria) this;
        }

        public Criteria andAuthorityMarkLessThanOrEqualTo(String value) {
            addCriterion("AUTHORITY_MARK <=", value, "authorityMark");
            return (Criteria) this;
        }

        public Criteria andAuthorityMarkLike(String value) {
            addCriterion("AUTHORITY_MARK like", value, "authorityMark");
            return (Criteria) this;
        }

        public Criteria andAuthorityMarkNotLike(String value) {
            addCriterion("AUTHORITY_MARK not like", value, "authorityMark");
            return (Criteria) this;
        }

        public Criteria andAuthorityMarkIn(List<String> values) {
            addCriterion("AUTHORITY_MARK in", values, "authorityMark");
            return (Criteria) this;
        }

        public Criteria andAuthorityMarkNotIn(List<String> values) {
            addCriterion("AUTHORITY_MARK not in", values, "authorityMark");
            return (Criteria) this;
        }

        public Criteria andAuthorityMarkBetween(String value1, String value2) {
            addCriterion("AUTHORITY_MARK between", value1, value2, "authorityMark");
            return (Criteria) this;
        }

        public Criteria andAuthorityMarkNotBetween(String value1, String value2) {
            addCriterion("AUTHORITY_MARK not between", value1, value2, "authorityMark");
            return (Criteria) this;
        }

        public Criteria andAuthorityNameIsNull() {
            addCriterion("AUTHORITY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andAuthorityNameIsNotNull() {
            addCriterion("AUTHORITY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorityNameEqualTo(String value) {
            addCriterion("AUTHORITY_NAME =", value, "authorityName");
            return (Criteria) this;
        }

        public Criteria andAuthorityNameNotEqualTo(String value) {
            addCriterion("AUTHORITY_NAME <>", value, "authorityName");
            return (Criteria) this;
        }

        public Criteria andAuthorityNameGreaterThan(String value) {
            addCriterion("AUTHORITY_NAME >", value, "authorityName");
            return (Criteria) this;
        }

        public Criteria andAuthorityNameGreaterThanOrEqualTo(String value) {
            addCriterion("AUTHORITY_NAME >=", value, "authorityName");
            return (Criteria) this;
        }

        public Criteria andAuthorityNameLessThan(String value) {
            addCriterion("AUTHORITY_NAME <", value, "authorityName");
            return (Criteria) this;
        }

        public Criteria andAuthorityNameLessThanOrEqualTo(String value) {
            addCriterion("AUTHORITY_NAME <=", value, "authorityName");
            return (Criteria) this;
        }

        public Criteria andAuthorityNameLike(String value) {
            addCriterion("AUTHORITY_NAME like", value, "authorityName");
            return (Criteria) this;
        }

        public Criteria andAuthorityNameNotLike(String value) {
            addCriterion("AUTHORITY_NAME not like", value, "authorityName");
            return (Criteria) this;
        }

        public Criteria andAuthorityNameIn(List<String> values) {
            addCriterion("AUTHORITY_NAME in", values, "authorityName");
            return (Criteria) this;
        }

        public Criteria andAuthorityNameNotIn(List<String> values) {
            addCriterion("AUTHORITY_NAME not in", values, "authorityName");
            return (Criteria) this;
        }

        public Criteria andAuthorityNameBetween(String value1, String value2) {
            addCriterion("AUTHORITY_NAME between", value1, value2, "authorityName");
            return (Criteria) this;
        }

        public Criteria andAuthorityNameNotBetween(String value1, String value2) {
            addCriterion("AUTHORITY_NAME not between", value1, value2, "authorityName");
            return (Criteria) this;
        }

        public Criteria andAuthorityDescIsNull() {
            addCriterion("AUTHORITY_DESC is null");
            return (Criteria) this;
        }

        public Criteria andAuthorityDescIsNotNull() {
            addCriterion("AUTHORITY_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorityDescEqualTo(String value) {
            addCriterion("AUTHORITY_DESC =", value, "authorityDesc");
            return (Criteria) this;
        }

        public Criteria andAuthorityDescNotEqualTo(String value) {
            addCriterion("AUTHORITY_DESC <>", value, "authorityDesc");
            return (Criteria) this;
        }

        public Criteria andAuthorityDescGreaterThan(String value) {
            addCriterion("AUTHORITY_DESC >", value, "authorityDesc");
            return (Criteria) this;
        }

        public Criteria andAuthorityDescGreaterThanOrEqualTo(String value) {
            addCriterion("AUTHORITY_DESC >=", value, "authorityDesc");
            return (Criteria) this;
        }

        public Criteria andAuthorityDescLessThan(String value) {
            addCriterion("AUTHORITY_DESC <", value, "authorityDesc");
            return (Criteria) this;
        }

        public Criteria andAuthorityDescLessThanOrEqualTo(String value) {
            addCriterion("AUTHORITY_DESC <=", value, "authorityDesc");
            return (Criteria) this;
        }

        public Criteria andAuthorityDescLike(String value) {
            addCriterion("AUTHORITY_DESC like", value, "authorityDesc");
            return (Criteria) this;
        }

        public Criteria andAuthorityDescNotLike(String value) {
            addCriterion("AUTHORITY_DESC not like", value, "authorityDesc");
            return (Criteria) this;
        }

        public Criteria andAuthorityDescIn(List<String> values) {
            addCriterion("AUTHORITY_DESC in", values, "authorityDesc");
            return (Criteria) this;
        }

        public Criteria andAuthorityDescNotIn(List<String> values) {
            addCriterion("AUTHORITY_DESC not in", values, "authorityDesc");
            return (Criteria) this;
        }

        public Criteria andAuthorityDescBetween(String value1, String value2) {
            addCriterion("AUTHORITY_DESC between", value1, value2, "authorityDesc");
            return (Criteria) this;
        }

        public Criteria andAuthorityDescNotBetween(String value1, String value2) {
            addCriterion("AUTHORITY_DESC not between", value1, value2, "authorityDesc");
            return (Criteria) this;
        }

        public Criteria andMessageIsNull() {
            addCriterion("MESSAGE is null");
            return (Criteria) this;
        }

        public Criteria andMessageIsNotNull() {
            addCriterion("MESSAGE is not null");
            return (Criteria) this;
        }

        public Criteria andMessageEqualTo(String value) {
            addCriterion("MESSAGE =", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotEqualTo(String value) {
            addCriterion("MESSAGE <>", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageGreaterThan(String value) {
            addCriterion("MESSAGE >", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageGreaterThanOrEqualTo(String value) {
            addCriterion("MESSAGE >=", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLessThan(String value) {
            addCriterion("MESSAGE <", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLessThanOrEqualTo(String value) {
            addCriterion("MESSAGE <=", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLike(String value) {
            addCriterion("MESSAGE like", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotLike(String value) {
            addCriterion("MESSAGE not like", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageIn(List<String> values) {
            addCriterion("MESSAGE in", values, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotIn(List<String> values) {
            addCriterion("MESSAGE not in", values, "message");
            return (Criteria) this;
        }

        public Criteria andMessageBetween(String value1, String value2) {
            addCriterion("MESSAGE between", value1, value2, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotBetween(String value1, String value2) {
            addCriterion("MESSAGE not between", value1, value2, "message");
            return (Criteria) this;
        }

        public Criteria andEnableIsNull() {
            addCriterion("ENABLE is null");
            return (Criteria) this;
        }

        public Criteria andEnableIsNotNull() {
            addCriterion("ENABLE is not null");
            return (Criteria) this;
        }

        public Criteria andEnableEqualTo(Integer value) {
            addCriterion("ENABLE =", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableNotEqualTo(Integer value) {
            addCriterion("ENABLE <>", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableGreaterThan(Integer value) {
            addCriterion("ENABLE >", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableGreaterThanOrEqualTo(Integer value) {
            addCriterion("ENABLE >=", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableLessThan(Integer value) {
            addCriterion("ENABLE <", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableLessThanOrEqualTo(Integer value) {
            addCriterion("ENABLE <=", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableIn(List<Integer> values) {
            addCriterion("ENABLE in", values, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableNotIn(List<Integer> values) {
            addCriterion("ENABLE not in", values, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableBetween(Integer value1, Integer value2) {
            addCriterion("ENABLE between", value1, value2, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableNotBetween(Integer value1, Integer value2) {
            addCriterion("ENABLE not between", value1, value2, "enable");
            return (Criteria) this;
        }

        public Criteria andIssysIsNull() {
            addCriterion("ISSYS is null");
            return (Criteria) this;
        }

        public Criteria andIssysIsNotNull() {
            addCriterion("ISSYS is not null");
            return (Criteria) this;
        }

        public Criteria andIssysEqualTo(Integer value) {
            addCriterion("ISSYS =", value, "issys");
            return (Criteria) this;
        }

        public Criteria andIssysNotEqualTo(Integer value) {
            addCriterion("ISSYS <>", value, "issys");
            return (Criteria) this;
        }

        public Criteria andIssysGreaterThan(Integer value) {
            addCriterion("ISSYS >", value, "issys");
            return (Criteria) this;
        }

        public Criteria andIssysGreaterThanOrEqualTo(Integer value) {
            addCriterion("ISSYS >=", value, "issys");
            return (Criteria) this;
        }

        public Criteria andIssysLessThan(Integer value) {
            addCriterion("ISSYS <", value, "issys");
            return (Criteria) this;
        }

        public Criteria andIssysLessThanOrEqualTo(Integer value) {
            addCriterion("ISSYS <=", value, "issys");
            return (Criteria) this;
        }

        public Criteria andIssysIn(List<Integer> values) {
            addCriterion("ISSYS in", values, "issys");
            return (Criteria) this;
        }

        public Criteria andIssysNotIn(List<Integer> values) {
            addCriterion("ISSYS not in", values, "issys");
            return (Criteria) this;
        }

        public Criteria andIssysBetween(Integer value1, Integer value2) {
            addCriterion("ISSYS between", value1, value2, "issys");
            return (Criteria) this;
        }

        public Criteria andIssysNotBetween(Integer value1, Integer value2) {
            addCriterion("ISSYS not between", value1, value2, "issys");
            return (Criteria) this;
        }

        public Criteria andModuleIdIsNull() {
            addCriterion("MODULE_ID is null");
            return (Criteria) this;
        }

        public Criteria andModuleIdIsNotNull() {
            addCriterion("MODULE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andModuleIdEqualTo(String value) {
            addCriterion("MODULE_ID =", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdNotEqualTo(String value) {
            addCriterion("MODULE_ID <>", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdGreaterThan(String value) {
            addCriterion("MODULE_ID >", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdGreaterThanOrEqualTo(String value) {
            addCriterion("MODULE_ID >=", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdLessThan(String value) {
            addCriterion("MODULE_ID <", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdLessThanOrEqualTo(String value) {
            addCriterion("MODULE_ID <=", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdLike(String value) {
            addCriterion("MODULE_ID like", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdNotLike(String value) {
            addCriterion("MODULE_ID not like", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdIn(List<String> values) {
            addCriterion("MODULE_ID in", values, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdNotIn(List<String> values) {
            addCriterion("MODULE_ID not in", values, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdBetween(String value1, String value2) {
            addCriterion("MODULE_ID between", value1, value2, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdNotBetween(String value1, String value2) {
            addCriterion("MODULE_ID not between", value1, value2, "moduleId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdLikeInsensitive(String value) {
            addCriterion("upper(AUTHORITY_ID) like", value.toUpperCase(), "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityMarkLikeInsensitive(String value) {
            addCriterion("upper(AUTHORITY_MARK) like", value.toUpperCase(), "authorityMark");
            return (Criteria) this;
        }

        public Criteria andAuthorityNameLikeInsensitive(String value) {
            addCriterion("upper(AUTHORITY_NAME) like", value.toUpperCase(), "authorityName");
            return (Criteria) this;
        }

        public Criteria andAuthorityDescLikeInsensitive(String value) {
            addCriterion("upper(AUTHORITY_DESC) like", value.toUpperCase(), "authorityDesc");
            return (Criteria) this;
        }

        public Criteria andMessageLikeInsensitive(String value) {
            addCriterion("upper(MESSAGE) like", value.toUpperCase(), "message");
            return (Criteria) this;
        }

        public Criteria andModuleIdLikeInsensitive(String value) {
            addCriterion("upper(MODULE_ID) like", value.toUpperCase(), "moduleId");
            return (Criteria) this;
        }
    }

    /**
     * sys_authorities
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class corresponds to the database table sys_authorities
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