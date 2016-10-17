package com.linx.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysUsersQuery {
    /**
     * sys_users
     */
    protected String orderByClause;

    /**
     * sys_users
     */
    protected boolean distinct;

    /**
     * sys_users
     */
    protected List<Criteria> oredCriteria;

    /**
     * sys_users
     */
    public SysUsersQuery() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * sys_users
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * sys_users
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * sys_users
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * sys_users
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * sys_users
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * sys_users
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * sys_users
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * sys_users
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * sys_users
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * sys_users
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class corresponds to the database table sys_users
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

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("USER_ID like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("USER_ID not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("USERNAME is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("USERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("USERNAME =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("USERNAME <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("USERNAME >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("USERNAME >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("USERNAME <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("USERNAME <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("USERNAME like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("USERNAME not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("USERNAME in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("USERNAME not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("USERNAME between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("USERNAME not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("PASSWORD =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("PASSWORD <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("PASSWORD >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("PASSWORD >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("PASSWORD <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("PASSWORD <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("PASSWORD like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("PASSWORD not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("PASSWORD in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("PASSWORD not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("PASSWORD between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("PASSWORD not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andDtCreateIsNull() {
            addCriterion("DT_CREATE is null");
            return (Criteria) this;
        }

        public Criteria andDtCreateIsNotNull() {
            addCriterion("DT_CREATE is not null");
            return (Criteria) this;
        }

        public Criteria andDtCreateEqualTo(Date value) {
            addCriterion("DT_CREATE =", value, "dtCreate");
            return (Criteria) this;
        }

        public Criteria andDtCreateNotEqualTo(Date value) {
            addCriterion("DT_CREATE <>", value, "dtCreate");
            return (Criteria) this;
        }

        public Criteria andDtCreateGreaterThan(Date value) {
            addCriterion("DT_CREATE >", value, "dtCreate");
            return (Criteria) this;
        }

        public Criteria andDtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("DT_CREATE >=", value, "dtCreate");
            return (Criteria) this;
        }

        public Criteria andDtCreateLessThan(Date value) {
            addCriterion("DT_CREATE <", value, "dtCreate");
            return (Criteria) this;
        }

        public Criteria andDtCreateLessThanOrEqualTo(Date value) {
            addCriterion("DT_CREATE <=", value, "dtCreate");
            return (Criteria) this;
        }

        public Criteria andDtCreateIn(List<Date> values) {
            addCriterion("DT_CREATE in", values, "dtCreate");
            return (Criteria) this;
        }

        public Criteria andDtCreateNotIn(List<Date> values) {
            addCriterion("DT_CREATE not in", values, "dtCreate");
            return (Criteria) this;
        }

        public Criteria andDtCreateBetween(Date value1, Date value2) {
            addCriterion("DT_CREATE between", value1, value2, "dtCreate");
            return (Criteria) this;
        }

        public Criteria andDtCreateNotBetween(Date value1, Date value2) {
            addCriterion("DT_CREATE not between", value1, value2, "dtCreate");
            return (Criteria) this;
        }

        public Criteria andLastLoginIsNull() {
            addCriterion("LAST_LOGIN is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginIsNotNull() {
            addCriterion("LAST_LOGIN is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginEqualTo(Date value) {
            addCriterion("LAST_LOGIN =", value, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andLastLoginNotEqualTo(Date value) {
            addCriterion("LAST_LOGIN <>", value, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andLastLoginGreaterThan(Date value) {
            addCriterion("LAST_LOGIN >", value, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andLastLoginGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_LOGIN >=", value, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andLastLoginLessThan(Date value) {
            addCriterion("LAST_LOGIN <", value, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andLastLoginLessThanOrEqualTo(Date value) {
            addCriterion("LAST_LOGIN <=", value, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andLastLoginIn(List<Date> values) {
            addCriterion("LAST_LOGIN in", values, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andLastLoginNotIn(List<Date> values) {
            addCriterion("LAST_LOGIN not in", values, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andLastLoginBetween(Date value1, Date value2) {
            addCriterion("LAST_LOGIN between", value1, value2, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andLastLoginNotBetween(Date value1, Date value2) {
            addCriterion("LAST_LOGIN not between", value1, value2, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andDeadlineIsNull() {
            addCriterion("DEADLINE is null");
            return (Criteria) this;
        }

        public Criteria andDeadlineIsNotNull() {
            addCriterion("DEADLINE is not null");
            return (Criteria) this;
        }

        public Criteria andDeadlineEqualTo(Date value) {
            addCriterion("DEADLINE =", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotEqualTo(Date value) {
            addCriterion("DEADLINE <>", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineGreaterThan(Date value) {
            addCriterion("DEADLINE >", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineGreaterThanOrEqualTo(Date value) {
            addCriterion("DEADLINE >=", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineLessThan(Date value) {
            addCriterion("DEADLINE <", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineLessThanOrEqualTo(Date value) {
            addCriterion("DEADLINE <=", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineIn(List<Date> values) {
            addCriterion("DEADLINE in", values, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotIn(List<Date> values) {
            addCriterion("DEADLINE not in", values, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineBetween(Date value1, Date value2) {
            addCriterion("DEADLINE between", value1, value2, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotBetween(Date value1, Date value2) {
            addCriterion("DEADLINE not between", value1, value2, "deadline");
            return (Criteria) this;
        }

        public Criteria andLoginIpIsNull() {
            addCriterion("LOGIN_IP is null");
            return (Criteria) this;
        }

        public Criteria andLoginIpIsNotNull() {
            addCriterion("LOGIN_IP is not null");
            return (Criteria) this;
        }

        public Criteria andLoginIpEqualTo(String value) {
            addCriterion("LOGIN_IP =", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpNotEqualTo(String value) {
            addCriterion("LOGIN_IP <>", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpGreaterThan(String value) {
            addCriterion("LOGIN_IP >", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpGreaterThanOrEqualTo(String value) {
            addCriterion("LOGIN_IP >=", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpLessThan(String value) {
            addCriterion("LOGIN_IP <", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpLessThanOrEqualTo(String value) {
            addCriterion("LOGIN_IP <=", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpLike(String value) {
            addCriterion("LOGIN_IP like", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpNotLike(String value) {
            addCriterion("LOGIN_IP not like", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpIn(List<String> values) {
            addCriterion("LOGIN_IP in", values, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpNotIn(List<String> values) {
            addCriterion("LOGIN_IP not in", values, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpBetween(String value1, String value2) {
            addCriterion("LOGIN_IP between", value1, value2, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpNotBetween(String value1, String value2) {
            addCriterion("LOGIN_IP not between", value1, value2, "loginIp");
            return (Criteria) this;
        }

        public Criteria andVQzjgidIsNull() {
            addCriterion("V_QZJGID is null");
            return (Criteria) this;
        }

        public Criteria andVQzjgidIsNotNull() {
            addCriterion("V_QZJGID is not null");
            return (Criteria) this;
        }

        public Criteria andVQzjgidEqualTo(String value) {
            addCriterion("V_QZJGID =", value, "vQzjgid");
            return (Criteria) this;
        }

        public Criteria andVQzjgidNotEqualTo(String value) {
            addCriterion("V_QZJGID <>", value, "vQzjgid");
            return (Criteria) this;
        }

        public Criteria andVQzjgidGreaterThan(String value) {
            addCriterion("V_QZJGID >", value, "vQzjgid");
            return (Criteria) this;
        }

        public Criteria andVQzjgidGreaterThanOrEqualTo(String value) {
            addCriterion("V_QZJGID >=", value, "vQzjgid");
            return (Criteria) this;
        }

        public Criteria andVQzjgidLessThan(String value) {
            addCriterion("V_QZJGID <", value, "vQzjgid");
            return (Criteria) this;
        }

        public Criteria andVQzjgidLessThanOrEqualTo(String value) {
            addCriterion("V_QZJGID <=", value, "vQzjgid");
            return (Criteria) this;
        }

        public Criteria andVQzjgidLike(String value) {
            addCriterion("V_QZJGID like", value, "vQzjgid");
            return (Criteria) this;
        }

        public Criteria andVQzjgidNotLike(String value) {
            addCriterion("V_QZJGID not like", value, "vQzjgid");
            return (Criteria) this;
        }

        public Criteria andVQzjgidIn(List<String> values) {
            addCriterion("V_QZJGID in", values, "vQzjgid");
            return (Criteria) this;
        }

        public Criteria andVQzjgidNotIn(List<String> values) {
            addCriterion("V_QZJGID not in", values, "vQzjgid");
            return (Criteria) this;
        }

        public Criteria andVQzjgidBetween(String value1, String value2) {
            addCriterion("V_QZJGID between", value1, value2, "vQzjgid");
            return (Criteria) this;
        }

        public Criteria andVQzjgidNotBetween(String value1, String value2) {
            addCriterion("V_QZJGID not between", value1, value2, "vQzjgid");
            return (Criteria) this;
        }

        public Criteria andVQzjgmcIsNull() {
            addCriterion("V_QZJGMC is null");
            return (Criteria) this;
        }

        public Criteria andVQzjgmcIsNotNull() {
            addCriterion("V_QZJGMC is not null");
            return (Criteria) this;
        }

        public Criteria andVQzjgmcEqualTo(String value) {
            addCriterion("V_QZJGMC =", value, "vQzjgmc");
            return (Criteria) this;
        }

        public Criteria andVQzjgmcNotEqualTo(String value) {
            addCriterion("V_QZJGMC <>", value, "vQzjgmc");
            return (Criteria) this;
        }

        public Criteria andVQzjgmcGreaterThan(String value) {
            addCriterion("V_QZJGMC >", value, "vQzjgmc");
            return (Criteria) this;
        }

        public Criteria andVQzjgmcGreaterThanOrEqualTo(String value) {
            addCriterion("V_QZJGMC >=", value, "vQzjgmc");
            return (Criteria) this;
        }

        public Criteria andVQzjgmcLessThan(String value) {
            addCriterion("V_QZJGMC <", value, "vQzjgmc");
            return (Criteria) this;
        }

        public Criteria andVQzjgmcLessThanOrEqualTo(String value) {
            addCriterion("V_QZJGMC <=", value, "vQzjgmc");
            return (Criteria) this;
        }

        public Criteria andVQzjgmcLike(String value) {
            addCriterion("V_QZJGMC like", value, "vQzjgmc");
            return (Criteria) this;
        }

        public Criteria andVQzjgmcNotLike(String value) {
            addCriterion("V_QZJGMC not like", value, "vQzjgmc");
            return (Criteria) this;
        }

        public Criteria andVQzjgmcIn(List<String> values) {
            addCriterion("V_QZJGMC in", values, "vQzjgmc");
            return (Criteria) this;
        }

        public Criteria andVQzjgmcNotIn(List<String> values) {
            addCriterion("V_QZJGMC not in", values, "vQzjgmc");
            return (Criteria) this;
        }

        public Criteria andVQzjgmcBetween(String value1, String value2) {
            addCriterion("V_QZJGMC between", value1, value2, "vQzjgmc");
            return (Criteria) this;
        }

        public Criteria andVQzjgmcNotBetween(String value1, String value2) {
            addCriterion("V_QZJGMC not between", value1, value2, "vQzjgmc");
            return (Criteria) this;
        }

        public Criteria andDepIdIsNull() {
            addCriterion("DEP_ID is null");
            return (Criteria) this;
        }

        public Criteria andDepIdIsNotNull() {
            addCriterion("DEP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDepIdEqualTo(String value) {
            addCriterion("DEP_ID =", value, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdNotEqualTo(String value) {
            addCriterion("DEP_ID <>", value, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdGreaterThan(String value) {
            addCriterion("DEP_ID >", value, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdGreaterThanOrEqualTo(String value) {
            addCriterion("DEP_ID >=", value, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdLessThan(String value) {
            addCriterion("DEP_ID <", value, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdLessThanOrEqualTo(String value) {
            addCriterion("DEP_ID <=", value, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdLike(String value) {
            addCriterion("DEP_ID like", value, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdNotLike(String value) {
            addCriterion("DEP_ID not like", value, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdIn(List<String> values) {
            addCriterion("DEP_ID in", values, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdNotIn(List<String> values) {
            addCriterion("DEP_ID not in", values, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdBetween(String value1, String value2) {
            addCriterion("DEP_ID between", value1, value2, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdNotBetween(String value1, String value2) {
            addCriterion("DEP_ID not between", value1, value2, "depId");
            return (Criteria) this;
        }

        public Criteria andDepNameIsNull() {
            addCriterion("DEP_NAME is null");
            return (Criteria) this;
        }

        public Criteria andDepNameIsNotNull() {
            addCriterion("DEP_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andDepNameEqualTo(String value) {
            addCriterion("DEP_NAME =", value, "depName");
            return (Criteria) this;
        }

        public Criteria andDepNameNotEqualTo(String value) {
            addCriterion("DEP_NAME <>", value, "depName");
            return (Criteria) this;
        }

        public Criteria andDepNameGreaterThan(String value) {
            addCriterion("DEP_NAME >", value, "depName");
            return (Criteria) this;
        }

        public Criteria andDepNameGreaterThanOrEqualTo(String value) {
            addCriterion("DEP_NAME >=", value, "depName");
            return (Criteria) this;
        }

        public Criteria andDepNameLessThan(String value) {
            addCriterion("DEP_NAME <", value, "depName");
            return (Criteria) this;
        }

        public Criteria andDepNameLessThanOrEqualTo(String value) {
            addCriterion("DEP_NAME <=", value, "depName");
            return (Criteria) this;
        }

        public Criteria andDepNameLike(String value) {
            addCriterion("DEP_NAME like", value, "depName");
            return (Criteria) this;
        }

        public Criteria andDepNameNotLike(String value) {
            addCriterion("DEP_NAME not like", value, "depName");
            return (Criteria) this;
        }

        public Criteria andDepNameIn(List<String> values) {
            addCriterion("DEP_NAME in", values, "depName");
            return (Criteria) this;
        }

        public Criteria andDepNameNotIn(List<String> values) {
            addCriterion("DEP_NAME not in", values, "depName");
            return (Criteria) this;
        }

        public Criteria andDepNameBetween(String value1, String value2) {
            addCriterion("DEP_NAME between", value1, value2, "depName");
            return (Criteria) this;
        }

        public Criteria andDepNameNotBetween(String value1, String value2) {
            addCriterion("DEP_NAME not between", value1, value2, "depName");
            return (Criteria) this;
        }

        public Criteria andEnabledIsNull() {
            addCriterion("ENABLED is null");
            return (Criteria) this;
        }

        public Criteria andEnabledIsNotNull() {
            addCriterion("ENABLED is not null");
            return (Criteria) this;
        }

        public Criteria andEnabledEqualTo(Integer value) {
            addCriterion("ENABLED =", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotEqualTo(Integer value) {
            addCriterion("ENABLED <>", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThan(Integer value) {
            addCriterion("ENABLED >", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThanOrEqualTo(Integer value) {
            addCriterion("ENABLED >=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThan(Integer value) {
            addCriterion("ENABLED <", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThanOrEqualTo(Integer value) {
            addCriterion("ENABLED <=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledIn(List<Integer> values) {
            addCriterion("ENABLED in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotIn(List<Integer> values) {
            addCriterion("ENABLED not in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledBetween(Integer value1, Integer value2) {
            addCriterion("ENABLED between", value1, value2, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotBetween(Integer value1, Integer value2) {
            addCriterion("ENABLED not between", value1, value2, "enabled");
            return (Criteria) this;
        }

        public Criteria andAccountNonExpiredIsNull() {
            addCriterion("ACCOUNT_NON_EXPIRED is null");
            return (Criteria) this;
        }

        public Criteria andAccountNonExpiredIsNotNull() {
            addCriterion("ACCOUNT_NON_EXPIRED is not null");
            return (Criteria) this;
        }

        public Criteria andAccountNonExpiredEqualTo(Integer value) {
            addCriterion("ACCOUNT_NON_EXPIRED =", value, "accountNonExpired");
            return (Criteria) this;
        }

        public Criteria andAccountNonExpiredNotEqualTo(Integer value) {
            addCriterion("ACCOUNT_NON_EXPIRED <>", value, "accountNonExpired");
            return (Criteria) this;
        }

        public Criteria andAccountNonExpiredGreaterThan(Integer value) {
            addCriterion("ACCOUNT_NON_EXPIRED >", value, "accountNonExpired");
            return (Criteria) this;
        }

        public Criteria andAccountNonExpiredGreaterThanOrEqualTo(Integer value) {
            addCriterion("ACCOUNT_NON_EXPIRED >=", value, "accountNonExpired");
            return (Criteria) this;
        }

        public Criteria andAccountNonExpiredLessThan(Integer value) {
            addCriterion("ACCOUNT_NON_EXPIRED <", value, "accountNonExpired");
            return (Criteria) this;
        }

        public Criteria andAccountNonExpiredLessThanOrEqualTo(Integer value) {
            addCriterion("ACCOUNT_NON_EXPIRED <=", value, "accountNonExpired");
            return (Criteria) this;
        }

        public Criteria andAccountNonExpiredIn(List<Integer> values) {
            addCriterion("ACCOUNT_NON_EXPIRED in", values, "accountNonExpired");
            return (Criteria) this;
        }

        public Criteria andAccountNonExpiredNotIn(List<Integer> values) {
            addCriterion("ACCOUNT_NON_EXPIRED not in", values, "accountNonExpired");
            return (Criteria) this;
        }

        public Criteria andAccountNonExpiredBetween(Integer value1, Integer value2) {
            addCriterion("ACCOUNT_NON_EXPIRED between", value1, value2, "accountNonExpired");
            return (Criteria) this;
        }

        public Criteria andAccountNonExpiredNotBetween(Integer value1, Integer value2) {
            addCriterion("ACCOUNT_NON_EXPIRED not between", value1, value2, "accountNonExpired");
            return (Criteria) this;
        }

        public Criteria andAccountNonLockedIsNull() {
            addCriterion("ACCOUNT_NON_LOCKED is null");
            return (Criteria) this;
        }

        public Criteria andAccountNonLockedIsNotNull() {
            addCriterion("ACCOUNT_NON_LOCKED is not null");
            return (Criteria) this;
        }

        public Criteria andAccountNonLockedEqualTo(Integer value) {
            addCriterion("ACCOUNT_NON_LOCKED =", value, "accountNonLocked");
            return (Criteria) this;
        }

        public Criteria andAccountNonLockedNotEqualTo(Integer value) {
            addCriterion("ACCOUNT_NON_LOCKED <>", value, "accountNonLocked");
            return (Criteria) this;
        }

        public Criteria andAccountNonLockedGreaterThan(Integer value) {
            addCriterion("ACCOUNT_NON_LOCKED >", value, "accountNonLocked");
            return (Criteria) this;
        }

        public Criteria andAccountNonLockedGreaterThanOrEqualTo(Integer value) {
            addCriterion("ACCOUNT_NON_LOCKED >=", value, "accountNonLocked");
            return (Criteria) this;
        }

        public Criteria andAccountNonLockedLessThan(Integer value) {
            addCriterion("ACCOUNT_NON_LOCKED <", value, "accountNonLocked");
            return (Criteria) this;
        }

        public Criteria andAccountNonLockedLessThanOrEqualTo(Integer value) {
            addCriterion("ACCOUNT_NON_LOCKED <=", value, "accountNonLocked");
            return (Criteria) this;
        }

        public Criteria andAccountNonLockedIn(List<Integer> values) {
            addCriterion("ACCOUNT_NON_LOCKED in", values, "accountNonLocked");
            return (Criteria) this;
        }

        public Criteria andAccountNonLockedNotIn(List<Integer> values) {
            addCriterion("ACCOUNT_NON_LOCKED not in", values, "accountNonLocked");
            return (Criteria) this;
        }

        public Criteria andAccountNonLockedBetween(Integer value1, Integer value2) {
            addCriterion("ACCOUNT_NON_LOCKED between", value1, value2, "accountNonLocked");
            return (Criteria) this;
        }

        public Criteria andAccountNonLockedNotBetween(Integer value1, Integer value2) {
            addCriterion("ACCOUNT_NON_LOCKED not between", value1, value2, "accountNonLocked");
            return (Criteria) this;
        }

        public Criteria andCredentialsNonExpiredIsNull() {
            addCriterion("CREDENTIALS_NON_EXPIRED is null");
            return (Criteria) this;
        }

        public Criteria andCredentialsNonExpiredIsNotNull() {
            addCriterion("CREDENTIALS_NON_EXPIRED is not null");
            return (Criteria) this;
        }

        public Criteria andCredentialsNonExpiredEqualTo(Integer value) {
            addCriterion("CREDENTIALS_NON_EXPIRED =", value, "credentialsNonExpired");
            return (Criteria) this;
        }

        public Criteria andCredentialsNonExpiredNotEqualTo(Integer value) {
            addCriterion("CREDENTIALS_NON_EXPIRED <>", value, "credentialsNonExpired");
            return (Criteria) this;
        }

        public Criteria andCredentialsNonExpiredGreaterThan(Integer value) {
            addCriterion("CREDENTIALS_NON_EXPIRED >", value, "credentialsNonExpired");
            return (Criteria) this;
        }

        public Criteria andCredentialsNonExpiredGreaterThanOrEqualTo(Integer value) {
            addCriterion("CREDENTIALS_NON_EXPIRED >=", value, "credentialsNonExpired");
            return (Criteria) this;
        }

        public Criteria andCredentialsNonExpiredLessThan(Integer value) {
            addCriterion("CREDENTIALS_NON_EXPIRED <", value, "credentialsNonExpired");
            return (Criteria) this;
        }

        public Criteria andCredentialsNonExpiredLessThanOrEqualTo(Integer value) {
            addCriterion("CREDENTIALS_NON_EXPIRED <=", value, "credentialsNonExpired");
            return (Criteria) this;
        }

        public Criteria andCredentialsNonExpiredIn(List<Integer> values) {
            addCriterion("CREDENTIALS_NON_EXPIRED in", values, "credentialsNonExpired");
            return (Criteria) this;
        }

        public Criteria andCredentialsNonExpiredNotIn(List<Integer> values) {
            addCriterion("CREDENTIALS_NON_EXPIRED not in", values, "credentialsNonExpired");
            return (Criteria) this;
        }

        public Criteria andCredentialsNonExpiredBetween(Integer value1, Integer value2) {
            addCriterion("CREDENTIALS_NON_EXPIRED between", value1, value2, "credentialsNonExpired");
            return (Criteria) this;
        }

        public Criteria andCredentialsNonExpiredNotBetween(Integer value1, Integer value2) {
            addCriterion("CREDENTIALS_NON_EXPIRED not between", value1, value2, "credentialsNonExpired");
            return (Criteria) this;
        }

        public Criteria andUserIdLikeInsensitive(String value) {
            addCriterion("upper(USER_ID) like", value.toUpperCase(), "userId");
            return (Criteria) this;
        }

        public Criteria andUsernameLikeInsensitive(String value) {
            addCriterion("upper(USERNAME) like", value.toUpperCase(), "username");
            return (Criteria) this;
        }

        public Criteria andNameLikeInsensitive(String value) {
            addCriterion("upper(NAME) like", value.toUpperCase(), "name");
            return (Criteria) this;
        }

        public Criteria andPasswordLikeInsensitive(String value) {
            addCriterion("upper(PASSWORD) like", value.toUpperCase(), "password");
            return (Criteria) this;
        }

        public Criteria andLoginIpLikeInsensitive(String value) {
            addCriterion("upper(LOGIN_IP) like", value.toUpperCase(), "loginIp");
            return (Criteria) this;
        }

        public Criteria andVQzjgidLikeInsensitive(String value) {
            addCriterion("upper(V_QZJGID) like", value.toUpperCase(), "vQzjgid");
            return (Criteria) this;
        }

        public Criteria andVQzjgmcLikeInsensitive(String value) {
            addCriterion("upper(V_QZJGMC) like", value.toUpperCase(), "vQzjgmc");
            return (Criteria) this;
        }

        public Criteria andDepIdLikeInsensitive(String value) {
            addCriterion("upper(DEP_ID) like", value.toUpperCase(), "depId");
            return (Criteria) this;
        }

        public Criteria andDepNameLikeInsensitive(String value) {
            addCriterion("upper(DEP_NAME) like", value.toUpperCase(), "depName");
            return (Criteria) this;
        }
    }

    /**
     * sys_users
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class corresponds to the database table sys_users
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