package org.xxpay.dal.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RpUserBankAccountExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    private Integer limit;

    private Integer offset;

    public RpUserBankAccountExample() {
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

        public Criteria andBank_nameIsNull() {
            addCriterion("bank_name is null");
            return (Criteria) this;
        }

        public Criteria andBank_nameIsNotNull() {
            addCriterion("bank_name is not null");
            return (Criteria) this;
        }

        public Criteria andBank_nameEqualTo(String value) {
            addCriterion("bank_name =", value, "bank_name");
            return (Criteria) this;
        }

        public Criteria andBank_nameNotEqualTo(String value) {
            addCriterion("bank_name <>", value, "bank_name");
            return (Criteria) this;
        }

        public Criteria andBank_nameGreaterThan(String value) {
            addCriterion("bank_name >", value, "bank_name");
            return (Criteria) this;
        }

        public Criteria andBank_nameGreaterThanOrEqualTo(String value) {
            addCriterion("bank_name >=", value, "bank_name");
            return (Criteria) this;
        }

        public Criteria andBank_nameLessThan(String value) {
            addCriterion("bank_name <", value, "bank_name");
            return (Criteria) this;
        }

        public Criteria andBank_nameLessThanOrEqualTo(String value) {
            addCriterion("bank_name <=", value, "bank_name");
            return (Criteria) this;
        }

        public Criteria andBank_nameLike(String value) {
            addCriterion("bank_name like", value, "bank_name");
            return (Criteria) this;
        }

        public Criteria andBank_nameNotLike(String value) {
            addCriterion("bank_name not like", value, "bank_name");
            return (Criteria) this;
        }

        public Criteria andBank_nameIn(List<String> values) {
            addCriterion("bank_name in", values, "bank_name");
            return (Criteria) this;
        }

        public Criteria andBank_nameNotIn(List<String> values) {
            addCriterion("bank_name not in", values, "bank_name");
            return (Criteria) this;
        }

        public Criteria andBank_nameBetween(String value1, String value2) {
            addCriterion("bank_name between", value1, value2, "bank_name");
            return (Criteria) this;
        }

        public Criteria andBank_nameNotBetween(String value1, String value2) {
            addCriterion("bank_name not between", value1, value2, "bank_name");
            return (Criteria) this;
        }

        public Criteria andBank_codeIsNull() {
            addCriterion("bank_code is null");
            return (Criteria) this;
        }

        public Criteria andBank_codeIsNotNull() {
            addCriterion("bank_code is not null");
            return (Criteria) this;
        }

        public Criteria andBank_codeEqualTo(String value) {
            addCriterion("bank_code =", value, "bank_code");
            return (Criteria) this;
        }

        public Criteria andBank_codeNotEqualTo(String value) {
            addCriterion("bank_code <>", value, "bank_code");
            return (Criteria) this;
        }

        public Criteria andBank_codeGreaterThan(String value) {
            addCriterion("bank_code >", value, "bank_code");
            return (Criteria) this;
        }

        public Criteria andBank_codeGreaterThanOrEqualTo(String value) {
            addCriterion("bank_code >=", value, "bank_code");
            return (Criteria) this;
        }

        public Criteria andBank_codeLessThan(String value) {
            addCriterion("bank_code <", value, "bank_code");
            return (Criteria) this;
        }

        public Criteria andBank_codeLessThanOrEqualTo(String value) {
            addCriterion("bank_code <=", value, "bank_code");
            return (Criteria) this;
        }

        public Criteria andBank_codeLike(String value) {
            addCriterion("bank_code like", value, "bank_code");
            return (Criteria) this;
        }

        public Criteria andBank_codeNotLike(String value) {
            addCriterion("bank_code not like", value, "bank_code");
            return (Criteria) this;
        }

        public Criteria andBank_codeIn(List<String> values) {
            addCriterion("bank_code in", values, "bank_code");
            return (Criteria) this;
        }

        public Criteria andBank_codeNotIn(List<String> values) {
            addCriterion("bank_code not in", values, "bank_code");
            return (Criteria) this;
        }

        public Criteria andBank_codeBetween(String value1, String value2) {
            addCriterion("bank_code between", value1, value2, "bank_code");
            return (Criteria) this;
        }

        public Criteria andBank_codeNotBetween(String value1, String value2) {
            addCriterion("bank_code not between", value1, value2, "bank_code");
            return (Criteria) this;
        }

        public Criteria andBank_account_nameIsNull() {
            addCriterion("bank_account_name is null");
            return (Criteria) this;
        }

        public Criteria andBank_account_nameIsNotNull() {
            addCriterion("bank_account_name is not null");
            return (Criteria) this;
        }

        public Criteria andBank_account_nameEqualTo(String value) {
            addCriterion("bank_account_name =", value, "bank_account_name");
            return (Criteria) this;
        }

        public Criteria andBank_account_nameNotEqualTo(String value) {
            addCriterion("bank_account_name <>", value, "bank_account_name");
            return (Criteria) this;
        }

        public Criteria andBank_account_nameGreaterThan(String value) {
            addCriterion("bank_account_name >", value, "bank_account_name");
            return (Criteria) this;
        }

        public Criteria andBank_account_nameGreaterThanOrEqualTo(String value) {
            addCriterion("bank_account_name >=", value, "bank_account_name");
            return (Criteria) this;
        }

        public Criteria andBank_account_nameLessThan(String value) {
            addCriterion("bank_account_name <", value, "bank_account_name");
            return (Criteria) this;
        }

        public Criteria andBank_account_nameLessThanOrEqualTo(String value) {
            addCriterion("bank_account_name <=", value, "bank_account_name");
            return (Criteria) this;
        }

        public Criteria andBank_account_nameLike(String value) {
            addCriterion("bank_account_name like", value, "bank_account_name");
            return (Criteria) this;
        }

        public Criteria andBank_account_nameNotLike(String value) {
            addCriterion("bank_account_name not like", value, "bank_account_name");
            return (Criteria) this;
        }

        public Criteria andBank_account_nameIn(List<String> values) {
            addCriterion("bank_account_name in", values, "bank_account_name");
            return (Criteria) this;
        }

        public Criteria andBank_account_nameNotIn(List<String> values) {
            addCriterion("bank_account_name not in", values, "bank_account_name");
            return (Criteria) this;
        }

        public Criteria andBank_account_nameBetween(String value1, String value2) {
            addCriterion("bank_account_name between", value1, value2, "bank_account_name");
            return (Criteria) this;
        }

        public Criteria andBank_account_nameNotBetween(String value1, String value2) {
            addCriterion("bank_account_name not between", value1, value2, "bank_account_name");
            return (Criteria) this;
        }

        public Criteria andBank_account_noIsNull() {
            addCriterion("bank_account_no is null");
            return (Criteria) this;
        }

        public Criteria andBank_account_noIsNotNull() {
            addCriterion("bank_account_no is not null");
            return (Criteria) this;
        }

        public Criteria andBank_account_noEqualTo(String value) {
            addCriterion("bank_account_no =", value, "bank_account_no");
            return (Criteria) this;
        }

        public Criteria andBank_account_noNotEqualTo(String value) {
            addCriterion("bank_account_no <>", value, "bank_account_no");
            return (Criteria) this;
        }

        public Criteria andBank_account_noGreaterThan(String value) {
            addCriterion("bank_account_no >", value, "bank_account_no");
            return (Criteria) this;
        }

        public Criteria andBank_account_noGreaterThanOrEqualTo(String value) {
            addCriterion("bank_account_no >=", value, "bank_account_no");
            return (Criteria) this;
        }

        public Criteria andBank_account_noLessThan(String value) {
            addCriterion("bank_account_no <", value, "bank_account_no");
            return (Criteria) this;
        }

        public Criteria andBank_account_noLessThanOrEqualTo(String value) {
            addCriterion("bank_account_no <=", value, "bank_account_no");
            return (Criteria) this;
        }

        public Criteria andBank_account_noLike(String value) {
            addCriterion("bank_account_no like", value, "bank_account_no");
            return (Criteria) this;
        }

        public Criteria andBank_account_noNotLike(String value) {
            addCriterion("bank_account_no not like", value, "bank_account_no");
            return (Criteria) this;
        }

        public Criteria andBank_account_noIn(List<String> values) {
            addCriterion("bank_account_no in", values, "bank_account_no");
            return (Criteria) this;
        }

        public Criteria andBank_account_noNotIn(List<String> values) {
            addCriterion("bank_account_no not in", values, "bank_account_no");
            return (Criteria) this;
        }

        public Criteria andBank_account_noBetween(String value1, String value2) {
            addCriterion("bank_account_no between", value1, value2, "bank_account_no");
            return (Criteria) this;
        }

        public Criteria andBank_account_noNotBetween(String value1, String value2) {
            addCriterion("bank_account_no not between", value1, value2, "bank_account_no");
            return (Criteria) this;
        }

        public Criteria andCard_typeIsNull() {
            addCriterion("card_type is null");
            return (Criteria) this;
        }

        public Criteria andCard_typeIsNotNull() {
            addCriterion("card_type is not null");
            return (Criteria) this;
        }

        public Criteria andCard_typeEqualTo(String value) {
            addCriterion("card_type =", value, "card_type");
            return (Criteria) this;
        }

        public Criteria andCard_typeNotEqualTo(String value) {
            addCriterion("card_type <>", value, "card_type");
            return (Criteria) this;
        }

        public Criteria andCard_typeGreaterThan(String value) {
            addCriterion("card_type >", value, "card_type");
            return (Criteria) this;
        }

        public Criteria andCard_typeGreaterThanOrEqualTo(String value) {
            addCriterion("card_type >=", value, "card_type");
            return (Criteria) this;
        }

        public Criteria andCard_typeLessThan(String value) {
            addCriterion("card_type <", value, "card_type");
            return (Criteria) this;
        }

        public Criteria andCard_typeLessThanOrEqualTo(String value) {
            addCriterion("card_type <=", value, "card_type");
            return (Criteria) this;
        }

        public Criteria andCard_typeLike(String value) {
            addCriterion("card_type like", value, "card_type");
            return (Criteria) this;
        }

        public Criteria andCard_typeNotLike(String value) {
            addCriterion("card_type not like", value, "card_type");
            return (Criteria) this;
        }

        public Criteria andCard_typeIn(List<String> values) {
            addCriterion("card_type in", values, "card_type");
            return (Criteria) this;
        }

        public Criteria andCard_typeNotIn(List<String> values) {
            addCriterion("card_type not in", values, "card_type");
            return (Criteria) this;
        }

        public Criteria andCard_typeBetween(String value1, String value2) {
            addCriterion("card_type between", value1, value2, "card_type");
            return (Criteria) this;
        }

        public Criteria andCard_typeNotBetween(String value1, String value2) {
            addCriterion("card_type not between", value1, value2, "card_type");
            return (Criteria) this;
        }

        public Criteria andCard_noIsNull() {
            addCriterion("card_no is null");
            return (Criteria) this;
        }

        public Criteria andCard_noIsNotNull() {
            addCriterion("card_no is not null");
            return (Criteria) this;
        }

        public Criteria andCard_noEqualTo(String value) {
            addCriterion("card_no =", value, "card_no");
            return (Criteria) this;
        }

        public Criteria andCard_noNotEqualTo(String value) {
            addCriterion("card_no <>", value, "card_no");
            return (Criteria) this;
        }

        public Criteria andCard_noGreaterThan(String value) {
            addCriterion("card_no >", value, "card_no");
            return (Criteria) this;
        }

        public Criteria andCard_noGreaterThanOrEqualTo(String value) {
            addCriterion("card_no >=", value, "card_no");
            return (Criteria) this;
        }

        public Criteria andCard_noLessThan(String value) {
            addCriterion("card_no <", value, "card_no");
            return (Criteria) this;
        }

        public Criteria andCard_noLessThanOrEqualTo(String value) {
            addCriterion("card_no <=", value, "card_no");
            return (Criteria) this;
        }

        public Criteria andCard_noLike(String value) {
            addCriterion("card_no like", value, "card_no");
            return (Criteria) this;
        }

        public Criteria andCard_noNotLike(String value) {
            addCriterion("card_no not like", value, "card_no");
            return (Criteria) this;
        }

        public Criteria andCard_noIn(List<String> values) {
            addCriterion("card_no in", values, "card_no");
            return (Criteria) this;
        }

        public Criteria andCard_noNotIn(List<String> values) {
            addCriterion("card_no not in", values, "card_no");
            return (Criteria) this;
        }

        public Criteria andCard_noBetween(String value1, String value2) {
            addCriterion("card_no between", value1, value2, "card_no");
            return (Criteria) this;
        }

        public Criteria andCard_noNotBetween(String value1, String value2) {
            addCriterion("card_no not between", value1, value2, "card_no");
            return (Criteria) this;
        }

        public Criteria andMobile_noIsNull() {
            addCriterion("mobile_no is null");
            return (Criteria) this;
        }

        public Criteria andMobile_noIsNotNull() {
            addCriterion("mobile_no is not null");
            return (Criteria) this;
        }

        public Criteria andMobile_noEqualTo(String value) {
            addCriterion("mobile_no =", value, "mobile_no");
            return (Criteria) this;
        }

        public Criteria andMobile_noNotEqualTo(String value) {
            addCriterion("mobile_no <>", value, "mobile_no");
            return (Criteria) this;
        }

        public Criteria andMobile_noGreaterThan(String value) {
            addCriterion("mobile_no >", value, "mobile_no");
            return (Criteria) this;
        }

        public Criteria andMobile_noGreaterThanOrEqualTo(String value) {
            addCriterion("mobile_no >=", value, "mobile_no");
            return (Criteria) this;
        }

        public Criteria andMobile_noLessThan(String value) {
            addCriterion("mobile_no <", value, "mobile_no");
            return (Criteria) this;
        }

        public Criteria andMobile_noLessThanOrEqualTo(String value) {
            addCriterion("mobile_no <=", value, "mobile_no");
            return (Criteria) this;
        }

        public Criteria andMobile_noLike(String value) {
            addCriterion("mobile_no like", value, "mobile_no");
            return (Criteria) this;
        }

        public Criteria andMobile_noNotLike(String value) {
            addCriterion("mobile_no not like", value, "mobile_no");
            return (Criteria) this;
        }

        public Criteria andMobile_noIn(List<String> values) {
            addCriterion("mobile_no in", values, "mobile_no");
            return (Criteria) this;
        }

        public Criteria andMobile_noNotIn(List<String> values) {
            addCriterion("mobile_no not in", values, "mobile_no");
            return (Criteria) this;
        }

        public Criteria andMobile_noBetween(String value1, String value2) {
            addCriterion("mobile_no between", value1, value2, "mobile_no");
            return (Criteria) this;
        }

        public Criteria andMobile_noNotBetween(String value1, String value2) {
            addCriterion("mobile_no not between", value1, value2, "mobile_no");
            return (Criteria) this;
        }

        public Criteria andIs_defaultIsNull() {
            addCriterion("is_default is null");
            return (Criteria) this;
        }

        public Criteria andIs_defaultIsNotNull() {
            addCriterion("is_default is not null");
            return (Criteria) this;
        }

        public Criteria andIs_defaultEqualTo(String value) {
            addCriterion("is_default =", value, "is_default");
            return (Criteria) this;
        }

        public Criteria andIs_defaultNotEqualTo(String value) {
            addCriterion("is_default <>", value, "is_default");
            return (Criteria) this;
        }

        public Criteria andIs_defaultGreaterThan(String value) {
            addCriterion("is_default >", value, "is_default");
            return (Criteria) this;
        }

        public Criteria andIs_defaultGreaterThanOrEqualTo(String value) {
            addCriterion("is_default >=", value, "is_default");
            return (Criteria) this;
        }

        public Criteria andIs_defaultLessThan(String value) {
            addCriterion("is_default <", value, "is_default");
            return (Criteria) this;
        }

        public Criteria andIs_defaultLessThanOrEqualTo(String value) {
            addCriterion("is_default <=", value, "is_default");
            return (Criteria) this;
        }

        public Criteria andIs_defaultLike(String value) {
            addCriterion("is_default like", value, "is_default");
            return (Criteria) this;
        }

        public Criteria andIs_defaultNotLike(String value) {
            addCriterion("is_default not like", value, "is_default");
            return (Criteria) this;
        }

        public Criteria andIs_defaultIn(List<String> values) {
            addCriterion("is_default in", values, "is_default");
            return (Criteria) this;
        }

        public Criteria andIs_defaultNotIn(List<String> values) {
            addCriterion("is_default not in", values, "is_default");
            return (Criteria) this;
        }

        public Criteria andIs_defaultBetween(String value1, String value2) {
            addCriterion("is_default between", value1, value2, "is_default");
            return (Criteria) this;
        }

        public Criteria andIs_defaultNotBetween(String value1, String value2) {
            addCriterion("is_default not between", value1, value2, "is_default");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andAreasIsNull() {
            addCriterion("areas is null");
            return (Criteria) this;
        }

        public Criteria andAreasIsNotNull() {
            addCriterion("areas is not null");
            return (Criteria) this;
        }

        public Criteria andAreasEqualTo(String value) {
            addCriterion("areas =", value, "areas");
            return (Criteria) this;
        }

        public Criteria andAreasNotEqualTo(String value) {
            addCriterion("areas <>", value, "areas");
            return (Criteria) this;
        }

        public Criteria andAreasGreaterThan(String value) {
            addCriterion("areas >", value, "areas");
            return (Criteria) this;
        }

        public Criteria andAreasGreaterThanOrEqualTo(String value) {
            addCriterion("areas >=", value, "areas");
            return (Criteria) this;
        }

        public Criteria andAreasLessThan(String value) {
            addCriterion("areas <", value, "areas");
            return (Criteria) this;
        }

        public Criteria andAreasLessThanOrEqualTo(String value) {
            addCriterion("areas <=", value, "areas");
            return (Criteria) this;
        }

        public Criteria andAreasLike(String value) {
            addCriterion("areas like", value, "areas");
            return (Criteria) this;
        }

        public Criteria andAreasNotLike(String value) {
            addCriterion("areas not like", value, "areas");
            return (Criteria) this;
        }

        public Criteria andAreasIn(List<String> values) {
            addCriterion("areas in", values, "areas");
            return (Criteria) this;
        }

        public Criteria andAreasNotIn(List<String> values) {
            addCriterion("areas not in", values, "areas");
            return (Criteria) this;
        }

        public Criteria andAreasBetween(String value1, String value2) {
            addCriterion("areas between", value1, value2, "areas");
            return (Criteria) this;
        }

        public Criteria andAreasNotBetween(String value1, String value2) {
            addCriterion("areas not between", value1, value2, "areas");
            return (Criteria) this;
        }

        public Criteria andStreetIsNull() {
            addCriterion("street is null");
            return (Criteria) this;
        }

        public Criteria andStreetIsNotNull() {
            addCriterion("street is not null");
            return (Criteria) this;
        }

        public Criteria andStreetEqualTo(String value) {
            addCriterion("street =", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotEqualTo(String value) {
            addCriterion("street <>", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetGreaterThan(String value) {
            addCriterion("street >", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetGreaterThanOrEqualTo(String value) {
            addCriterion("street >=", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetLessThan(String value) {
            addCriterion("street <", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetLessThanOrEqualTo(String value) {
            addCriterion("street <=", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetLike(String value) {
            addCriterion("street like", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotLike(String value) {
            addCriterion("street not like", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetIn(List<String> values) {
            addCriterion("street in", values, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotIn(List<String> values) {
            addCriterion("street not in", values, "street");
            return (Criteria) this;
        }

        public Criteria andStreetBetween(String value1, String value2) {
            addCriterion("street between", value1, value2, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotBetween(String value1, String value2) {
            addCriterion("street not between", value1, value2, "street");
            return (Criteria) this;
        }

        public Criteria andBank_account_typeIsNull() {
            addCriterion("bank_account_type is null");
            return (Criteria) this;
        }

        public Criteria andBank_account_typeIsNotNull() {
            addCriterion("bank_account_type is not null");
            return (Criteria) this;
        }

        public Criteria andBank_account_typeEqualTo(String value) {
            addCriterion("bank_account_type =", value, "bank_account_type");
            return (Criteria) this;
        }

        public Criteria andBank_account_typeNotEqualTo(String value) {
            addCriterion("bank_account_type <>", value, "bank_account_type");
            return (Criteria) this;
        }

        public Criteria andBank_account_typeGreaterThan(String value) {
            addCriterion("bank_account_type >", value, "bank_account_type");
            return (Criteria) this;
        }

        public Criteria andBank_account_typeGreaterThanOrEqualTo(String value) {
            addCriterion("bank_account_type >=", value, "bank_account_type");
            return (Criteria) this;
        }

        public Criteria andBank_account_typeLessThan(String value) {
            addCriterion("bank_account_type <", value, "bank_account_type");
            return (Criteria) this;
        }

        public Criteria andBank_account_typeLessThanOrEqualTo(String value) {
            addCriterion("bank_account_type <=", value, "bank_account_type");
            return (Criteria) this;
        }

        public Criteria andBank_account_typeLike(String value) {
            addCriterion("bank_account_type like", value, "bank_account_type");
            return (Criteria) this;
        }

        public Criteria andBank_account_typeNotLike(String value) {
            addCriterion("bank_account_type not like", value, "bank_account_type");
            return (Criteria) this;
        }

        public Criteria andBank_account_typeIn(List<String> values) {
            addCriterion("bank_account_type in", values, "bank_account_type");
            return (Criteria) this;
        }

        public Criteria andBank_account_typeNotIn(List<String> values) {
            addCriterion("bank_account_type not in", values, "bank_account_type");
            return (Criteria) this;
        }

        public Criteria andBank_account_typeBetween(String value1, String value2) {
            addCriterion("bank_account_type between", value1, value2, "bank_account_type");
            return (Criteria) this;
        }

        public Criteria andBank_account_typeNotBetween(String value1, String value2) {
            addCriterion("bank_account_type not between", value1, value2, "bank_account_type");
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