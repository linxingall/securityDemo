package com.linx.model;

import java.util.ArrayList;
import java.util.List;

public class SysAuthoritiesResourcesQuery {
    /**
     * sys_authorities_resources
     */
    protected String orderByClause;

    /**
     * sys_authorities_resources
     */
    protected boolean distinct;

    /**
     * sys_authorities_resources
     */
    protected List<Criteria> oredCriteria;

    /**
     * sys_authorities_resources
     */
    public SysAuthoritiesResourcesQuery() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * sys_authorities_resources
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * sys_authorities_resources
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * sys_authorities_resources
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * sys_authorities_resources
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * sys_authorities_resources
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * sys_authorities_resources
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * sys_authorities_resources
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * sys_authorities_resources
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * sys_authorities_resources
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * sys_authorities_resources
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class corresponds to the database table sys_authorities_resources
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andResourceIdIsNull() {
            addCriterion("RESOURCE_ID is null");
            return (Criteria) this;
        }

        public Criteria andResourceIdIsNotNull() {
            addCriterion("RESOURCE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andResourceIdEqualTo(String value) {
            addCriterion("RESOURCE_ID =", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdNotEqualTo(String value) {
            addCriterion("RESOURCE_ID <>", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdGreaterThan(String value) {
            addCriterion("RESOURCE_ID >", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdGreaterThanOrEqualTo(String value) {
            addCriterion("RESOURCE_ID >=", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdLessThan(String value) {
            addCriterion("RESOURCE_ID <", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdLessThanOrEqualTo(String value) {
            addCriterion("RESOURCE_ID <=", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdLike(String value) {
            addCriterion("RESOURCE_ID like", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdNotLike(String value) {
            addCriterion("RESOURCE_ID not like", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdIn(List<String> values) {
            addCriterion("RESOURCE_ID in", values, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdNotIn(List<String> values) {
            addCriterion("RESOURCE_ID not in", values, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdBetween(String value1, String value2) {
            addCriterion("RESOURCE_ID between", value1, value2, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdNotBetween(String value1, String value2) {
            addCriterion("RESOURCE_ID not between", value1, value2, "resourceId");
            return (Criteria) this;
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

        public Criteria andIdLikeInsensitive(String value) {
            addCriterion("upper(ID) like", value.toUpperCase(), "id");
            return (Criteria) this;
        }

        public Criteria andResourceIdLikeInsensitive(String value) {
            addCriterion("upper(RESOURCE_ID) like", value.toUpperCase(), "resourceId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdLikeInsensitive(String value) {
            addCriterion("upper(AUTHORITY_ID) like", value.toUpperCase(), "authorityId");
            return (Criteria) this;
        }
    }

    /**
     * sys_authorities_resources
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class corresponds to the database table sys_authorities_resources
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