package org.xxpay.dal.dao.account.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RpAccountHistoryExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    private Integer limit;

    private Integer offset;

    public RpAccountHistoryExample() {
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

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(BigDecimal value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(BigDecimal value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(BigDecimal value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(BigDecimal value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<BigDecimal> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<BigDecimal> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount not between", value1, value2, "amount");
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

        public Criteria andFund_directionIsNull() {
            addCriterion("fund_direction is null");
            return (Criteria) this;
        }

        public Criteria andFund_directionIsNotNull() {
            addCriterion("fund_direction is not null");
            return (Criteria) this;
        }

        public Criteria andFund_directionEqualTo(String value) {
            addCriterion("fund_direction =", value, "fund_direction");
            return (Criteria) this;
        }

        public Criteria andFund_directionNotEqualTo(String value) {
            addCriterion("fund_direction <>", value, "fund_direction");
            return (Criteria) this;
        }

        public Criteria andFund_directionGreaterThan(String value) {
            addCriterion("fund_direction >", value, "fund_direction");
            return (Criteria) this;
        }

        public Criteria andFund_directionGreaterThanOrEqualTo(String value) {
            addCriterion("fund_direction >=", value, "fund_direction");
            return (Criteria) this;
        }

        public Criteria andFund_directionLessThan(String value) {
            addCriterion("fund_direction <", value, "fund_direction");
            return (Criteria) this;
        }

        public Criteria andFund_directionLessThanOrEqualTo(String value) {
            addCriterion("fund_direction <=", value, "fund_direction");
            return (Criteria) this;
        }

        public Criteria andFund_directionLike(String value) {
            addCriterion("fund_direction like", value, "fund_direction");
            return (Criteria) this;
        }

        public Criteria andFund_directionNotLike(String value) {
            addCriterion("fund_direction not like", value, "fund_direction");
            return (Criteria) this;
        }

        public Criteria andFund_directionIn(List<String> values) {
            addCriterion("fund_direction in", values, "fund_direction");
            return (Criteria) this;
        }

        public Criteria andFund_directionNotIn(List<String> values) {
            addCriterion("fund_direction not in", values, "fund_direction");
            return (Criteria) this;
        }

        public Criteria andFund_directionBetween(String value1, String value2) {
            addCriterion("fund_direction between", value1, value2, "fund_direction");
            return (Criteria) this;
        }

        public Criteria andFund_directionNotBetween(String value1, String value2) {
            addCriterion("fund_direction not between", value1, value2, "fund_direction");
            return (Criteria) this;
        }

        public Criteria andIs_allow_settIsNull() {
            addCriterion("is_allow_sett is null");
            return (Criteria) this;
        }

        public Criteria andIs_allow_settIsNotNull() {
            addCriterion("is_allow_sett is not null");
            return (Criteria) this;
        }

        public Criteria andIs_allow_settEqualTo(String value) {
            addCriterion("is_allow_sett =", value, "is_allow_sett");
            return (Criteria) this;
        }

        public Criteria andIs_allow_settNotEqualTo(String value) {
            addCriterion("is_allow_sett <>", value, "is_allow_sett");
            return (Criteria) this;
        }

        public Criteria andIs_allow_settGreaterThan(String value) {
            addCriterion("is_allow_sett >", value, "is_allow_sett");
            return (Criteria) this;
        }

        public Criteria andIs_allow_settGreaterThanOrEqualTo(String value) {
            addCriterion("is_allow_sett >=", value, "is_allow_sett");
            return (Criteria) this;
        }

        public Criteria andIs_allow_settLessThan(String value) {
            addCriterion("is_allow_sett <", value, "is_allow_sett");
            return (Criteria) this;
        }

        public Criteria andIs_allow_settLessThanOrEqualTo(String value) {
            addCriterion("is_allow_sett <=", value, "is_allow_sett");
            return (Criteria) this;
        }

        public Criteria andIs_allow_settLike(String value) {
            addCriterion("is_allow_sett like", value, "is_allow_sett");
            return (Criteria) this;
        }

        public Criteria andIs_allow_settNotLike(String value) {
            addCriterion("is_allow_sett not like", value, "is_allow_sett");
            return (Criteria) this;
        }

        public Criteria andIs_allow_settIn(List<String> values) {
            addCriterion("is_allow_sett in", values, "is_allow_sett");
            return (Criteria) this;
        }

        public Criteria andIs_allow_settNotIn(List<String> values) {
            addCriterion("is_allow_sett not in", values, "is_allow_sett");
            return (Criteria) this;
        }

        public Criteria andIs_allow_settBetween(String value1, String value2) {
            addCriterion("is_allow_sett between", value1, value2, "is_allow_sett");
            return (Criteria) this;
        }

        public Criteria andIs_allow_settNotBetween(String value1, String value2) {
            addCriterion("is_allow_sett not between", value1, value2, "is_allow_sett");
            return (Criteria) this;
        }

        public Criteria andIs_complete_settIsNull() {
            addCriterion("is_complete_sett is null");
            return (Criteria) this;
        }

        public Criteria andIs_complete_settIsNotNull() {
            addCriterion("is_complete_sett is not null");
            return (Criteria) this;
        }

        public Criteria andIs_complete_settEqualTo(String value) {
            addCriterion("is_complete_sett =", value, "is_complete_sett");
            return (Criteria) this;
        }

        public Criteria andIs_complete_settNotEqualTo(String value) {
            addCriterion("is_complete_sett <>", value, "is_complete_sett");
            return (Criteria) this;
        }

        public Criteria andIs_complete_settGreaterThan(String value) {
            addCriterion("is_complete_sett >", value, "is_complete_sett");
            return (Criteria) this;
        }

        public Criteria andIs_complete_settGreaterThanOrEqualTo(String value) {
            addCriterion("is_complete_sett >=", value, "is_complete_sett");
            return (Criteria) this;
        }

        public Criteria andIs_complete_settLessThan(String value) {
            addCriterion("is_complete_sett <", value, "is_complete_sett");
            return (Criteria) this;
        }

        public Criteria andIs_complete_settLessThanOrEqualTo(String value) {
            addCriterion("is_complete_sett <=", value, "is_complete_sett");
            return (Criteria) this;
        }

        public Criteria andIs_complete_settLike(String value) {
            addCriterion("is_complete_sett like", value, "is_complete_sett");
            return (Criteria) this;
        }

        public Criteria andIs_complete_settNotLike(String value) {
            addCriterion("is_complete_sett not like", value, "is_complete_sett");
            return (Criteria) this;
        }

        public Criteria andIs_complete_settIn(List<String> values) {
            addCriterion("is_complete_sett in", values, "is_complete_sett");
            return (Criteria) this;
        }

        public Criteria andIs_complete_settNotIn(List<String> values) {
            addCriterion("is_complete_sett not in", values, "is_complete_sett");
            return (Criteria) this;
        }

        public Criteria andIs_complete_settBetween(String value1, String value2) {
            addCriterion("is_complete_sett between", value1, value2, "is_complete_sett");
            return (Criteria) this;
        }

        public Criteria andIs_complete_settNotBetween(String value1, String value2) {
            addCriterion("is_complete_sett not between", value1, value2, "is_complete_sett");
            return (Criteria) this;
        }

        public Criteria andRequest_noIsNull() {
            addCriterion("request_no is null");
            return (Criteria) this;
        }

        public Criteria andRequest_noIsNotNull() {
            addCriterion("request_no is not null");
            return (Criteria) this;
        }

        public Criteria andRequest_noEqualTo(String value) {
            addCriterion("request_no =", value, "request_no");
            return (Criteria) this;
        }

        public Criteria andRequest_noNotEqualTo(String value) {
            addCriterion("request_no <>", value, "request_no");
            return (Criteria) this;
        }

        public Criteria andRequest_noGreaterThan(String value) {
            addCriterion("request_no >", value, "request_no");
            return (Criteria) this;
        }

        public Criteria andRequest_noGreaterThanOrEqualTo(String value) {
            addCriterion("request_no >=", value, "request_no");
            return (Criteria) this;
        }

        public Criteria andRequest_noLessThan(String value) {
            addCriterion("request_no <", value, "request_no");
            return (Criteria) this;
        }

        public Criteria andRequest_noLessThanOrEqualTo(String value) {
            addCriterion("request_no <=", value, "request_no");
            return (Criteria) this;
        }

        public Criteria andRequest_noLike(String value) {
            addCriterion("request_no like", value, "request_no");
            return (Criteria) this;
        }

        public Criteria andRequest_noNotLike(String value) {
            addCriterion("request_no not like", value, "request_no");
            return (Criteria) this;
        }

        public Criteria andRequest_noIn(List<String> values) {
            addCriterion("request_no in", values, "request_no");
            return (Criteria) this;
        }

        public Criteria andRequest_noNotIn(List<String> values) {
            addCriterion("request_no not in", values, "request_no");
            return (Criteria) this;
        }

        public Criteria andRequest_noBetween(String value1, String value2) {
            addCriterion("request_no between", value1, value2, "request_no");
            return (Criteria) this;
        }

        public Criteria andRequest_noNotBetween(String value1, String value2) {
            addCriterion("request_no not between", value1, value2, "request_no");
            return (Criteria) this;
        }

        public Criteria andBank_trx_noIsNull() {
            addCriterion("bank_trx_no is null");
            return (Criteria) this;
        }

        public Criteria andBank_trx_noIsNotNull() {
            addCriterion("bank_trx_no is not null");
            return (Criteria) this;
        }

        public Criteria andBank_trx_noEqualTo(String value) {
            addCriterion("bank_trx_no =", value, "bank_trx_no");
            return (Criteria) this;
        }

        public Criteria andBank_trx_noNotEqualTo(String value) {
            addCriterion("bank_trx_no <>", value, "bank_trx_no");
            return (Criteria) this;
        }

        public Criteria andBank_trx_noGreaterThan(String value) {
            addCriterion("bank_trx_no >", value, "bank_trx_no");
            return (Criteria) this;
        }

        public Criteria andBank_trx_noGreaterThanOrEqualTo(String value) {
            addCriterion("bank_trx_no >=", value, "bank_trx_no");
            return (Criteria) this;
        }

        public Criteria andBank_trx_noLessThan(String value) {
            addCriterion("bank_trx_no <", value, "bank_trx_no");
            return (Criteria) this;
        }

        public Criteria andBank_trx_noLessThanOrEqualTo(String value) {
            addCriterion("bank_trx_no <=", value, "bank_trx_no");
            return (Criteria) this;
        }

        public Criteria andBank_trx_noLike(String value) {
            addCriterion("bank_trx_no like", value, "bank_trx_no");
            return (Criteria) this;
        }

        public Criteria andBank_trx_noNotLike(String value) {
            addCriterion("bank_trx_no not like", value, "bank_trx_no");
            return (Criteria) this;
        }

        public Criteria andBank_trx_noIn(List<String> values) {
            addCriterion("bank_trx_no in", values, "bank_trx_no");
            return (Criteria) this;
        }

        public Criteria andBank_trx_noNotIn(List<String> values) {
            addCriterion("bank_trx_no not in", values, "bank_trx_no");
            return (Criteria) this;
        }

        public Criteria andBank_trx_noBetween(String value1, String value2) {
            addCriterion("bank_trx_no between", value1, value2, "bank_trx_no");
            return (Criteria) this;
        }

        public Criteria andBank_trx_noNotBetween(String value1, String value2) {
            addCriterion("bank_trx_no not between", value1, value2, "bank_trx_no");
            return (Criteria) this;
        }

        public Criteria andTrx_typeIsNull() {
            addCriterion("trx_type is null");
            return (Criteria) this;
        }

        public Criteria andTrx_typeIsNotNull() {
            addCriterion("trx_type is not null");
            return (Criteria) this;
        }

        public Criteria andTrx_typeEqualTo(String value) {
            addCriterion("trx_type =", value, "trx_type");
            return (Criteria) this;
        }

        public Criteria andTrx_typeNotEqualTo(String value) {
            addCriterion("trx_type <>", value, "trx_type");
            return (Criteria) this;
        }

        public Criteria andTrx_typeGreaterThan(String value) {
            addCriterion("trx_type >", value, "trx_type");
            return (Criteria) this;
        }

        public Criteria andTrx_typeGreaterThanOrEqualTo(String value) {
            addCriterion("trx_type >=", value, "trx_type");
            return (Criteria) this;
        }

        public Criteria andTrx_typeLessThan(String value) {
            addCriterion("trx_type <", value, "trx_type");
            return (Criteria) this;
        }

        public Criteria andTrx_typeLessThanOrEqualTo(String value) {
            addCriterion("trx_type <=", value, "trx_type");
            return (Criteria) this;
        }

        public Criteria andTrx_typeLike(String value) {
            addCriterion("trx_type like", value, "trx_type");
            return (Criteria) this;
        }

        public Criteria andTrx_typeNotLike(String value) {
            addCriterion("trx_type not like", value, "trx_type");
            return (Criteria) this;
        }

        public Criteria andTrx_typeIn(List<String> values) {
            addCriterion("trx_type in", values, "trx_type");
            return (Criteria) this;
        }

        public Criteria andTrx_typeNotIn(List<String> values) {
            addCriterion("trx_type not in", values, "trx_type");
            return (Criteria) this;
        }

        public Criteria andTrx_typeBetween(String value1, String value2) {
            addCriterion("trx_type between", value1, value2, "trx_type");
            return (Criteria) this;
        }

        public Criteria andTrx_typeNotBetween(String value1, String value2) {
            addCriterion("trx_type not between", value1, value2, "trx_type");
            return (Criteria) this;
        }

        public Criteria andRisk_dayIsNull() {
            addCriterion("risk_day is null");
            return (Criteria) this;
        }

        public Criteria andRisk_dayIsNotNull() {
            addCriterion("risk_day is not null");
            return (Criteria) this;
        }

        public Criteria andRisk_dayEqualTo(Integer value) {
            addCriterion("risk_day =", value, "risk_day");
            return (Criteria) this;
        }

        public Criteria andRisk_dayNotEqualTo(Integer value) {
            addCriterion("risk_day <>", value, "risk_day");
            return (Criteria) this;
        }

        public Criteria andRisk_dayGreaterThan(Integer value) {
            addCriterion("risk_day >", value, "risk_day");
            return (Criteria) this;
        }

        public Criteria andRisk_dayGreaterThanOrEqualTo(Integer value) {
            addCriterion("risk_day >=", value, "risk_day");
            return (Criteria) this;
        }

        public Criteria andRisk_dayLessThan(Integer value) {
            addCriterion("risk_day <", value, "risk_day");
            return (Criteria) this;
        }

        public Criteria andRisk_dayLessThanOrEqualTo(Integer value) {
            addCriterion("risk_day <=", value, "risk_day");
            return (Criteria) this;
        }

        public Criteria andRisk_dayIn(List<Integer> values) {
            addCriterion("risk_day in", values, "risk_day");
            return (Criteria) this;
        }

        public Criteria andRisk_dayNotIn(List<Integer> values) {
            addCriterion("risk_day not in", values, "risk_day");
            return (Criteria) this;
        }

        public Criteria andRisk_dayBetween(Integer value1, Integer value2) {
            addCriterion("risk_day between", value1, value2, "risk_day");
            return (Criteria) this;
        }

        public Criteria andRisk_dayNotBetween(Integer value1, Integer value2) {
            addCriterion("risk_day not between", value1, value2, "risk_day");
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