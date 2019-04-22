package org.xxpay.dal.dao.account.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RpAccountExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    private Integer limit;

    private Integer offset;

    public RpAccountExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
    }

    protected abstract static class GeneratedCriteria implements Serializable {
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreate_timeEqualTo(Date value) {
            addCriterion("create_time =", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeGreaterThan(Date value) {
            addCriterion("create_time >", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeLessThan(Date value) {
            addCriterion("create_time <", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIn(List<Date> values) {
            addCriterion("create_time in", values, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "create_time");
            return (Criteria) this;
        }

        public Criteria andEdit_timeIsNull() {
            addCriterion("edit_time is null");
            return (Criteria) this;
        }

        public Criteria andEdit_timeIsNotNull() {
            addCriterion("edit_time is not null");
            return (Criteria) this;
        }

        public Criteria andEdit_timeEqualTo(Date value) {
            addCriterion("edit_time =", value, "edit_time");
            return (Criteria) this;
        }

        public Criteria andEdit_timeNotEqualTo(Date value) {
            addCriterion("edit_time <>", value, "edit_time");
            return (Criteria) this;
        }

        public Criteria andEdit_timeGreaterThan(Date value) {
            addCriterion("edit_time >", value, "edit_time");
            return (Criteria) this;
        }

        public Criteria andEdit_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("edit_time >=", value, "edit_time");
            return (Criteria) this;
        }

        public Criteria andEdit_timeLessThan(Date value) {
            addCriterion("edit_time <", value, "edit_time");
            return (Criteria) this;
        }

        public Criteria andEdit_timeLessThanOrEqualTo(Date value) {
            addCriterion("edit_time <=", value, "edit_time");
            return (Criteria) this;
        }

        public Criteria andEdit_timeIn(List<Date> values) {
            addCriterion("edit_time in", values, "edit_time");
            return (Criteria) this;
        }

        public Criteria andEdit_timeNotIn(List<Date> values) {
            addCriterion("edit_time not in", values, "edit_time");
            return (Criteria) this;
        }

        public Criteria andEdit_timeBetween(Date value1, Date value2) {
            addCriterion("edit_time between", value1, value2, "edit_time");
            return (Criteria) this;
        }

        public Criteria andEdit_timeNotBetween(Date value1, Date value2) {
            addCriterion("edit_time not between", value1, value2, "edit_time");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(Long value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(Long value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(Long value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(Long value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(Long value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(Long value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<Long> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<Long> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(Long value1, Long value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(Long value1, Long value2) {
            addCriterion("version not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andAccount_noIsNull() {
            addCriterion("account_no is null");
            return (Criteria) this;
        }

        public Criteria andAccount_noIsNotNull() {
            addCriterion("account_no is not null");
            return (Criteria) this;
        }

        public Criteria andAccount_noEqualTo(String value) {
            addCriterion("account_no =", value, "account_no");
            return (Criteria) this;
        }

        public Criteria andAccount_noNotEqualTo(String value) {
            addCriterion("account_no <>", value, "account_no");
            return (Criteria) this;
        }

        public Criteria andAccount_noGreaterThan(String value) {
            addCriterion("account_no >", value, "account_no");
            return (Criteria) this;
        }

        public Criteria andAccount_noGreaterThanOrEqualTo(String value) {
            addCriterion("account_no >=", value, "account_no");
            return (Criteria) this;
        }

        public Criteria andAccount_noLessThan(String value) {
            addCriterion("account_no <", value, "account_no");
            return (Criteria) this;
        }

        public Criteria andAccount_noLessThanOrEqualTo(String value) {
            addCriterion("account_no <=", value, "account_no");
            return (Criteria) this;
        }

        public Criteria andAccount_noLike(String value) {
            addCriterion("account_no like", value, "account_no");
            return (Criteria) this;
        }

        public Criteria andAccount_noNotLike(String value) {
            addCriterion("account_no not like", value, "account_no");
            return (Criteria) this;
        }

        public Criteria andAccount_noIn(List<String> values) {
            addCriterion("account_no in", values, "account_no");
            return (Criteria) this;
        }

        public Criteria andAccount_noNotIn(List<String> values) {
            addCriterion("account_no not in", values, "account_no");
            return (Criteria) this;
        }

        public Criteria andAccount_noBetween(String value1, String value2) {
            addCriterion("account_no between", value1, value2, "account_no");
            return (Criteria) this;
        }

        public Criteria andAccount_noNotBetween(String value1, String value2) {
            addCriterion("account_no not between", value1, value2, "account_no");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNull() {
            addCriterion("balance is null");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNotNull() {
            addCriterion("balance is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceEqualTo(BigDecimal value) {
            addCriterion("balance =", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotEqualTo(BigDecimal value) {
            addCriterion("balance <>", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThan(BigDecimal value) {
            addCriterion("balance >", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("balance >=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThan(BigDecimal value) {
            addCriterion("balance <", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("balance <=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceIn(List<BigDecimal> values) {
            addCriterion("balance in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotIn(List<BigDecimal> values) {
            addCriterion("balance not in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("balance between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("balance not between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andUnbalanceIsNull() {
            addCriterion("unbalance is null");
            return (Criteria) this;
        }

        public Criteria andUnbalanceIsNotNull() {
            addCriterion("unbalance is not null");
            return (Criteria) this;
        }

        public Criteria andUnbalanceEqualTo(BigDecimal value) {
            addCriterion("unbalance =", value, "unbalance");
            return (Criteria) this;
        }

        public Criteria andUnbalanceNotEqualTo(BigDecimal value) {
            addCriterion("unbalance <>", value, "unbalance");
            return (Criteria) this;
        }

        public Criteria andUnbalanceGreaterThan(BigDecimal value) {
            addCriterion("unbalance >", value, "unbalance");
            return (Criteria) this;
        }

        public Criteria andUnbalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("unbalance >=", value, "unbalance");
            return (Criteria) this;
        }

        public Criteria andUnbalanceLessThan(BigDecimal value) {
            addCriterion("unbalance <", value, "unbalance");
            return (Criteria) this;
        }

        public Criteria andUnbalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("unbalance <=", value, "unbalance");
            return (Criteria) this;
        }

        public Criteria andUnbalanceIn(List<BigDecimal> values) {
            addCriterion("unbalance in", values, "unbalance");
            return (Criteria) this;
        }

        public Criteria andUnbalanceNotIn(List<BigDecimal> values) {
            addCriterion("unbalance not in", values, "unbalance");
            return (Criteria) this;
        }

        public Criteria andUnbalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unbalance between", value1, value2, "unbalance");
            return (Criteria) this;
        }

        public Criteria andUnbalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unbalance not between", value1, value2, "unbalance");
            return (Criteria) this;
        }

        public Criteria andSecurity_moneyIsNull() {
            addCriterion("security_money is null");
            return (Criteria) this;
        }

        public Criteria andSecurity_moneyIsNotNull() {
            addCriterion("security_money is not null");
            return (Criteria) this;
        }

        public Criteria andSecurity_moneyEqualTo(BigDecimal value) {
            addCriterion("security_money =", value, "security_money");
            return (Criteria) this;
        }

        public Criteria andSecurity_moneyNotEqualTo(BigDecimal value) {
            addCriterion("security_money <>", value, "security_money");
            return (Criteria) this;
        }

        public Criteria andSecurity_moneyGreaterThan(BigDecimal value) {
            addCriterion("security_money >", value, "security_money");
            return (Criteria) this;
        }

        public Criteria andSecurity_moneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("security_money >=", value, "security_money");
            return (Criteria) this;
        }

        public Criteria andSecurity_moneyLessThan(BigDecimal value) {
            addCriterion("security_money <", value, "security_money");
            return (Criteria) this;
        }

        public Criteria andSecurity_moneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("security_money <=", value, "security_money");
            return (Criteria) this;
        }

        public Criteria andSecurity_moneyIn(List<BigDecimal> values) {
            addCriterion("security_money in", values, "security_money");
            return (Criteria) this;
        }

        public Criteria andSecurity_moneyNotIn(List<BigDecimal> values) {
            addCriterion("security_money not in", values, "security_money");
            return (Criteria) this;
        }

        public Criteria andSecurity_moneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("security_money between", value1, value2, "security_money");
            return (Criteria) this;
        }

        public Criteria andSecurity_moneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("security_money not between", value1, value2, "security_money");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andTotal_incomeIsNull() {
            addCriterion("total_income is null");
            return (Criteria) this;
        }

        public Criteria andTotal_incomeIsNotNull() {
            addCriterion("total_income is not null");
            return (Criteria) this;
        }

        public Criteria andTotal_incomeEqualTo(BigDecimal value) {
            addCriterion("total_income =", value, "total_income");
            return (Criteria) this;
        }

        public Criteria andTotal_incomeNotEqualTo(BigDecimal value) {
            addCriterion("total_income <>", value, "total_income");
            return (Criteria) this;
        }

        public Criteria andTotal_incomeGreaterThan(BigDecimal value) {
            addCriterion("total_income >", value, "total_income");
            return (Criteria) this;
        }

        public Criteria andTotal_incomeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_income >=", value, "total_income");
            return (Criteria) this;
        }

        public Criteria andTotal_incomeLessThan(BigDecimal value) {
            addCriterion("total_income <", value, "total_income");
            return (Criteria) this;
        }

        public Criteria andTotal_incomeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_income <=", value, "total_income");
            return (Criteria) this;
        }

        public Criteria andTotal_incomeIn(List<BigDecimal> values) {
            addCriterion("total_income in", values, "total_income");
            return (Criteria) this;
        }

        public Criteria andTotal_incomeNotIn(List<BigDecimal> values) {
            addCriterion("total_income not in", values, "total_income");
            return (Criteria) this;
        }

        public Criteria andTotal_incomeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_income between", value1, value2, "total_income");
            return (Criteria) this;
        }

        public Criteria andTotal_incomeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_income not between", value1, value2, "total_income");
            return (Criteria) this;
        }

        public Criteria andTotal_expendIsNull() {
            addCriterion("total_expend is null");
            return (Criteria) this;
        }

        public Criteria andTotal_expendIsNotNull() {
            addCriterion("total_expend is not null");
            return (Criteria) this;
        }

        public Criteria andTotal_expendEqualTo(BigDecimal value) {
            addCriterion("total_expend =", value, "total_expend");
            return (Criteria) this;
        }

        public Criteria andTotal_expendNotEqualTo(BigDecimal value) {
            addCriterion("total_expend <>", value, "total_expend");
            return (Criteria) this;
        }

        public Criteria andTotal_expendGreaterThan(BigDecimal value) {
            addCriterion("total_expend >", value, "total_expend");
            return (Criteria) this;
        }

        public Criteria andTotal_expendGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_expend >=", value, "total_expend");
            return (Criteria) this;
        }

        public Criteria andTotal_expendLessThan(BigDecimal value) {
            addCriterion("total_expend <", value, "total_expend");
            return (Criteria) this;
        }

        public Criteria andTotal_expendLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_expend <=", value, "total_expend");
            return (Criteria) this;
        }

        public Criteria andTotal_expendIn(List<BigDecimal> values) {
            addCriterion("total_expend in", values, "total_expend");
            return (Criteria) this;
        }

        public Criteria andTotal_expendNotIn(List<BigDecimal> values) {
            addCriterion("total_expend not in", values, "total_expend");
            return (Criteria) this;
        }

        public Criteria andTotal_expendBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_expend between", value1, value2, "total_expend");
            return (Criteria) this;
        }

        public Criteria andTotal_expendNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_expend not between", value1, value2, "total_expend");
            return (Criteria) this;
        }

        public Criteria andToday_incomeIsNull() {
            addCriterion("today_income is null");
            return (Criteria) this;
        }

        public Criteria andToday_incomeIsNotNull() {
            addCriterion("today_income is not null");
            return (Criteria) this;
        }

        public Criteria andToday_incomeEqualTo(BigDecimal value) {
            addCriterion("today_income =", value, "today_income");
            return (Criteria) this;
        }

        public Criteria andToday_incomeNotEqualTo(BigDecimal value) {
            addCriterion("today_income <>", value, "today_income");
            return (Criteria) this;
        }

        public Criteria andToday_incomeGreaterThan(BigDecimal value) {
            addCriterion("today_income >", value, "today_income");
            return (Criteria) this;
        }

        public Criteria andToday_incomeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("today_income >=", value, "today_income");
            return (Criteria) this;
        }

        public Criteria andToday_incomeLessThan(BigDecimal value) {
            addCriterion("today_income <", value, "today_income");
            return (Criteria) this;
        }

        public Criteria andToday_incomeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("today_income <=", value, "today_income");
            return (Criteria) this;
        }

        public Criteria andToday_incomeIn(List<BigDecimal> values) {
            addCriterion("today_income in", values, "today_income");
            return (Criteria) this;
        }

        public Criteria andToday_incomeNotIn(List<BigDecimal> values) {
            addCriterion("today_income not in", values, "today_income");
            return (Criteria) this;
        }

        public Criteria andToday_incomeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("today_income between", value1, value2, "today_income");
            return (Criteria) this;
        }

        public Criteria andToday_incomeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("today_income not between", value1, value2, "today_income");
            return (Criteria) this;
        }

        public Criteria andToday_expendIsNull() {
            addCriterion("today_expend is null");
            return (Criteria) this;
        }

        public Criteria andToday_expendIsNotNull() {
            addCriterion("today_expend is not null");
            return (Criteria) this;
        }

        public Criteria andToday_expendEqualTo(BigDecimal value) {
            addCriterion("today_expend =", value, "today_expend");
            return (Criteria) this;
        }

        public Criteria andToday_expendNotEqualTo(BigDecimal value) {
            addCriterion("today_expend <>", value, "today_expend");
            return (Criteria) this;
        }

        public Criteria andToday_expendGreaterThan(BigDecimal value) {
            addCriterion("today_expend >", value, "today_expend");
            return (Criteria) this;
        }

        public Criteria andToday_expendGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("today_expend >=", value, "today_expend");
            return (Criteria) this;
        }

        public Criteria andToday_expendLessThan(BigDecimal value) {
            addCriterion("today_expend <", value, "today_expend");
            return (Criteria) this;
        }

        public Criteria andToday_expendLessThanOrEqualTo(BigDecimal value) {
            addCriterion("today_expend <=", value, "today_expend");
            return (Criteria) this;
        }

        public Criteria andToday_expendIn(List<BigDecimal> values) {
            addCriterion("today_expend in", values, "today_expend");
            return (Criteria) this;
        }

        public Criteria andToday_expendNotIn(List<BigDecimal> values) {
            addCriterion("today_expend not in", values, "today_expend");
            return (Criteria) this;
        }

        public Criteria andToday_expendBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("today_expend between", value1, value2, "today_expend");
            return (Criteria) this;
        }

        public Criteria andToday_expendNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("today_expend not between", value1, value2, "today_expend");
            return (Criteria) this;
        }

        public Criteria andAccount_typeIsNull() {
            addCriterion("account_type is null");
            return (Criteria) this;
        }

        public Criteria andAccount_typeIsNotNull() {
            addCriterion("account_type is not null");
            return (Criteria) this;
        }

        public Criteria andAccount_typeEqualTo(String value) {
            addCriterion("account_type =", value, "account_type");
            return (Criteria) this;
        }

        public Criteria andAccount_typeNotEqualTo(String value) {
            addCriterion("account_type <>", value, "account_type");
            return (Criteria) this;
        }

        public Criteria andAccount_typeGreaterThan(String value) {
            addCriterion("account_type >", value, "account_type");
            return (Criteria) this;
        }

        public Criteria andAccount_typeGreaterThanOrEqualTo(String value) {
            addCriterion("account_type >=", value, "account_type");
            return (Criteria) this;
        }

        public Criteria andAccount_typeLessThan(String value) {
            addCriterion("account_type <", value, "account_type");
            return (Criteria) this;
        }

        public Criteria andAccount_typeLessThanOrEqualTo(String value) {
            addCriterion("account_type <=", value, "account_type");
            return (Criteria) this;
        }

        public Criteria andAccount_typeLike(String value) {
            addCriterion("account_type like", value, "account_type");
            return (Criteria) this;
        }

        public Criteria andAccount_typeNotLike(String value) {
            addCriterion("account_type not like", value, "account_type");
            return (Criteria) this;
        }

        public Criteria andAccount_typeIn(List<String> values) {
            addCriterion("account_type in", values, "account_type");
            return (Criteria) this;
        }

        public Criteria andAccount_typeNotIn(List<String> values) {
            addCriterion("account_type not in", values, "account_type");
            return (Criteria) this;
        }

        public Criteria andAccount_typeBetween(String value1, String value2) {
            addCriterion("account_type between", value1, value2, "account_type");
            return (Criteria) this;
        }

        public Criteria andAccount_typeNotBetween(String value1, String value2) {
            addCriterion("account_type not between", value1, value2, "account_type");
            return (Criteria) this;
        }

        public Criteria andSett_amountIsNull() {
            addCriterion("sett_amount is null");
            return (Criteria) this;
        }

        public Criteria andSett_amountIsNotNull() {
            addCriterion("sett_amount is not null");
            return (Criteria) this;
        }

        public Criteria andSett_amountEqualTo(BigDecimal value) {
            addCriterion("sett_amount =", value, "sett_amount");
            return (Criteria) this;
        }

        public Criteria andSett_amountNotEqualTo(BigDecimal value) {
            addCriterion("sett_amount <>", value, "sett_amount");
            return (Criteria) this;
        }

        public Criteria andSett_amountGreaterThan(BigDecimal value) {
            addCriterion("sett_amount >", value, "sett_amount");
            return (Criteria) this;
        }

        public Criteria andSett_amountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sett_amount >=", value, "sett_amount");
            return (Criteria) this;
        }

        public Criteria andSett_amountLessThan(BigDecimal value) {
            addCriterion("sett_amount <", value, "sett_amount");
            return (Criteria) this;
        }

        public Criteria andSett_amountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sett_amount <=", value, "sett_amount");
            return (Criteria) this;
        }

        public Criteria andSett_amountIn(List<BigDecimal> values) {
            addCriterion("sett_amount in", values, "sett_amount");
            return (Criteria) this;
        }

        public Criteria andSett_amountNotIn(List<BigDecimal> values) {
            addCriterion("sett_amount not in", values, "sett_amount");
            return (Criteria) this;
        }

        public Criteria andSett_amountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sett_amount between", value1, value2, "sett_amount");
            return (Criteria) this;
        }

        public Criteria andSett_amountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sett_amount not between", value1, value2, "sett_amount");
            return (Criteria) this;
        }

        public Criteria andUser_noIsNull() {
            addCriterion("user_no is null");
            return (Criteria) this;
        }

        public Criteria andUser_noIsNotNull() {
            addCriterion("user_no is not null");
            return (Criteria) this;
        }

        public Criteria andUser_noEqualTo(String value) {
            addCriterion("user_no =", value, "user_no");
            return (Criteria) this;
        }

        public Criteria andUser_noNotEqualTo(String value) {
            addCriterion("user_no <>", value, "user_no");
            return (Criteria) this;
        }

        public Criteria andUser_noGreaterThan(String value) {
            addCriterion("user_no >", value, "user_no");
            return (Criteria) this;
        }

        public Criteria andUser_noGreaterThanOrEqualTo(String value) {
            addCriterion("user_no >=", value, "user_no");
            return (Criteria) this;
        }

        public Criteria andUser_noLessThan(String value) {
            addCriterion("user_no <", value, "user_no");
            return (Criteria) this;
        }

        public Criteria andUser_noLessThanOrEqualTo(String value) {
            addCriterion("user_no <=", value, "user_no");
            return (Criteria) this;
        }

        public Criteria andUser_noLike(String value) {
            addCriterion("user_no like", value, "user_no");
            return (Criteria) this;
        }

        public Criteria andUser_noNotLike(String value) {
            addCriterion("user_no not like", value, "user_no");
            return (Criteria) this;
        }

        public Criteria andUser_noIn(List<String> values) {
            addCriterion("user_no in", values, "user_no");
            return (Criteria) this;
        }

        public Criteria andUser_noNotIn(List<String> values) {
            addCriterion("user_no not in", values, "user_no");
            return (Criteria) this;
        }

        public Criteria andUser_noBetween(String value1, String value2) {
            addCriterion("user_no between", value1, value2, "user_no");
            return (Criteria) this;
        }

        public Criteria andUser_noNotBetween(String value1, String value2) {
            addCriterion("user_no not between", value1, value2, "user_no");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria implements Serializable {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion implements Serializable {
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