package org.xxpay.dal.dao.account.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class RpSettRecordExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    private Integer limit;

    private Integer offset;

    public RpSettRecordExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(Integer value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(Integer value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(Integer value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(Integer value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(Integer value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(Integer value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<Integer> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<Integer> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(Integer value1, Integer value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(Integer value1, Integer value2) {
            addCriterion("version not between", value1, value2, "version");
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

        public Criteria andSett_modeIsNull() {
            addCriterion("sett_mode is null");
            return (Criteria) this;
        }

        public Criteria andSett_modeIsNotNull() {
            addCriterion("sett_mode is not null");
            return (Criteria) this;
        }

        public Criteria andSett_modeEqualTo(String value) {
            addCriterion("sett_mode =", value, "sett_mode");
            return (Criteria) this;
        }

        public Criteria andSett_modeNotEqualTo(String value) {
            addCriterion("sett_mode <>", value, "sett_mode");
            return (Criteria) this;
        }

        public Criteria andSett_modeGreaterThan(String value) {
            addCriterion("sett_mode >", value, "sett_mode");
            return (Criteria) this;
        }

        public Criteria andSett_modeGreaterThanOrEqualTo(String value) {
            addCriterion("sett_mode >=", value, "sett_mode");
            return (Criteria) this;
        }

        public Criteria andSett_modeLessThan(String value) {
            addCriterion("sett_mode <", value, "sett_mode");
            return (Criteria) this;
        }

        public Criteria andSett_modeLessThanOrEqualTo(String value) {
            addCriterion("sett_mode <=", value, "sett_mode");
            return (Criteria) this;
        }

        public Criteria andSett_modeLike(String value) {
            addCriterion("sett_mode like", value, "sett_mode");
            return (Criteria) this;
        }

        public Criteria andSett_modeNotLike(String value) {
            addCriterion("sett_mode not like", value, "sett_mode");
            return (Criteria) this;
        }

        public Criteria andSett_modeIn(List<String> values) {
            addCriterion("sett_mode in", values, "sett_mode");
            return (Criteria) this;
        }

        public Criteria andSett_modeNotIn(List<String> values) {
            addCriterion("sett_mode not in", values, "sett_mode");
            return (Criteria) this;
        }

        public Criteria andSett_modeBetween(String value1, String value2) {
            addCriterion("sett_mode between", value1, value2, "sett_mode");
            return (Criteria) this;
        }

        public Criteria andSett_modeNotBetween(String value1, String value2) {
            addCriterion("sett_mode not between", value1, value2, "sett_mode");
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

        public Criteria andUser_nameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUser_nameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUser_nameEqualTo(String value) {
            addCriterion("user_name =", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameGreaterThan(String value) {
            addCriterion("user_name >", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameLessThan(String value) {
            addCriterion("user_name <", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameLike(String value) {
            addCriterion("user_name like", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameNotLike(String value) {
            addCriterion("user_name not like", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameIn(List<String> values) {
            addCriterion("user_name in", values, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_typeIsNull() {
            addCriterion("user_type is null");
            return (Criteria) this;
        }

        public Criteria andUser_typeIsNotNull() {
            addCriterion("user_type is not null");
            return (Criteria) this;
        }

        public Criteria andUser_typeEqualTo(String value) {
            addCriterion("user_type =", value, "user_type");
            return (Criteria) this;
        }

        public Criteria andUser_typeNotEqualTo(String value) {
            addCriterion("user_type <>", value, "user_type");
            return (Criteria) this;
        }

        public Criteria andUser_typeGreaterThan(String value) {
            addCriterion("user_type >", value, "user_type");
            return (Criteria) this;
        }

        public Criteria andUser_typeGreaterThanOrEqualTo(String value) {
            addCriterion("user_type >=", value, "user_type");
            return (Criteria) this;
        }

        public Criteria andUser_typeLessThan(String value) {
            addCriterion("user_type <", value, "user_type");
            return (Criteria) this;
        }

        public Criteria andUser_typeLessThanOrEqualTo(String value) {
            addCriterion("user_type <=", value, "user_type");
            return (Criteria) this;
        }

        public Criteria andUser_typeLike(String value) {
            addCriterion("user_type like", value, "user_type");
            return (Criteria) this;
        }

        public Criteria andUser_typeNotLike(String value) {
            addCriterion("user_type not like", value, "user_type");
            return (Criteria) this;
        }

        public Criteria andUser_typeIn(List<String> values) {
            addCriterion("user_type in", values, "user_type");
            return (Criteria) this;
        }

        public Criteria andUser_typeNotIn(List<String> values) {
            addCriterion("user_type not in", values, "user_type");
            return (Criteria) this;
        }

        public Criteria andUser_typeBetween(String value1, String value2) {
            addCriterion("user_type between", value1, value2, "user_type");
            return (Criteria) this;
        }

        public Criteria andUser_typeNotBetween(String value1, String value2) {
            addCriterion("user_type not between", value1, value2, "user_type");
            return (Criteria) this;
        }

        public Criteria andSett_dateIsNull() {
            addCriterion("sett_date is null");
            return (Criteria) this;
        }

        public Criteria andSett_dateIsNotNull() {
            addCriterion("sett_date is not null");
            return (Criteria) this;
        }

        public Criteria andSett_dateEqualTo(Date value) {
            addCriterionForJDBCDate("sett_date =", value, "sett_date");
            return (Criteria) this;
        }

        public Criteria andSett_dateNotEqualTo(Date value) {
            addCriterionForJDBCDate("sett_date <>", value, "sett_date");
            return (Criteria) this;
        }

        public Criteria andSett_dateGreaterThan(Date value) {
            addCriterionForJDBCDate("sett_date >", value, "sett_date");
            return (Criteria) this;
        }

        public Criteria andSett_dateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sett_date >=", value, "sett_date");
            return (Criteria) this;
        }

        public Criteria andSett_dateLessThan(Date value) {
            addCriterionForJDBCDate("sett_date <", value, "sett_date");
            return (Criteria) this;
        }

        public Criteria andSett_dateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sett_date <=", value, "sett_date");
            return (Criteria) this;
        }

        public Criteria andSett_dateIn(List<Date> values) {
            addCriterionForJDBCDate("sett_date in", values, "sett_date");
            return (Criteria) this;
        }

        public Criteria andSett_dateNotIn(List<Date> values) {
            addCriterionForJDBCDate("sett_date not in", values, "sett_date");
            return (Criteria) this;
        }

        public Criteria andSett_dateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sett_date between", value1, value2, "sett_date");
            return (Criteria) this;
        }

        public Criteria andSett_dateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sett_date not between", value1, value2, "sett_date");
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

        public Criteria andCountryIsNull() {
            addCriterion("country is null");
            return (Criteria) this;
        }

        public Criteria andCountryIsNotNull() {
            addCriterion("country is not null");
            return (Criteria) this;
        }

        public Criteria andCountryEqualTo(String value) {
            addCriterion("country =", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotEqualTo(String value) {
            addCriterion("country <>", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThan(String value) {
            addCriterion("country >", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThanOrEqualTo(String value) {
            addCriterion("country >=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThan(String value) {
            addCriterion("country <", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThanOrEqualTo(String value) {
            addCriterion("country <=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLike(String value) {
            addCriterion("country like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotLike(String value) {
            addCriterion("country not like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryIn(List<String> values) {
            addCriterion("country in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotIn(List<String> values) {
            addCriterion("country not in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryBetween(String value1, String value2) {
            addCriterion("country between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotBetween(String value1, String value2) {
            addCriterion("country not between", value1, value2, "country");
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

        public Criteria andBank_account_addressIsNull() {
            addCriterion("bank_account_address is null");
            return (Criteria) this;
        }

        public Criteria andBank_account_addressIsNotNull() {
            addCriterion("bank_account_address is not null");
            return (Criteria) this;
        }

        public Criteria andBank_account_addressEqualTo(String value) {
            addCriterion("bank_account_address =", value, "bank_account_address");
            return (Criteria) this;
        }

        public Criteria andBank_account_addressNotEqualTo(String value) {
            addCriterion("bank_account_address <>", value, "bank_account_address");
            return (Criteria) this;
        }

        public Criteria andBank_account_addressGreaterThan(String value) {
            addCriterion("bank_account_address >", value, "bank_account_address");
            return (Criteria) this;
        }

        public Criteria andBank_account_addressGreaterThanOrEqualTo(String value) {
            addCriterion("bank_account_address >=", value, "bank_account_address");
            return (Criteria) this;
        }

        public Criteria andBank_account_addressLessThan(String value) {
            addCriterion("bank_account_address <", value, "bank_account_address");
            return (Criteria) this;
        }

        public Criteria andBank_account_addressLessThanOrEqualTo(String value) {
            addCriterion("bank_account_address <=", value, "bank_account_address");
            return (Criteria) this;
        }

        public Criteria andBank_account_addressLike(String value) {
            addCriterion("bank_account_address like", value, "bank_account_address");
            return (Criteria) this;
        }

        public Criteria andBank_account_addressNotLike(String value) {
            addCriterion("bank_account_address not like", value, "bank_account_address");
            return (Criteria) this;
        }

        public Criteria andBank_account_addressIn(List<String> values) {
            addCriterion("bank_account_address in", values, "bank_account_address");
            return (Criteria) this;
        }

        public Criteria andBank_account_addressNotIn(List<String> values) {
            addCriterion("bank_account_address not in", values, "bank_account_address");
            return (Criteria) this;
        }

        public Criteria andBank_account_addressBetween(String value1, String value2) {
            addCriterion("bank_account_address between", value1, value2, "bank_account_address");
            return (Criteria) this;
        }

        public Criteria andBank_account_addressNotBetween(String value1, String value2) {
            addCriterion("bank_account_address not between", value1, value2, "bank_account_address");
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

        public Criteria andSett_feeIsNull() {
            addCriterion("sett_fee is null");
            return (Criteria) this;
        }

        public Criteria andSett_feeIsNotNull() {
            addCriterion("sett_fee is not null");
            return (Criteria) this;
        }

        public Criteria andSett_feeEqualTo(BigDecimal value) {
            addCriterion("sett_fee =", value, "sett_fee");
            return (Criteria) this;
        }

        public Criteria andSett_feeNotEqualTo(BigDecimal value) {
            addCriterion("sett_fee <>", value, "sett_fee");
            return (Criteria) this;
        }

        public Criteria andSett_feeGreaterThan(BigDecimal value) {
            addCriterion("sett_fee >", value, "sett_fee");
            return (Criteria) this;
        }

        public Criteria andSett_feeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sett_fee >=", value, "sett_fee");
            return (Criteria) this;
        }

        public Criteria andSett_feeLessThan(BigDecimal value) {
            addCriterion("sett_fee <", value, "sett_fee");
            return (Criteria) this;
        }

        public Criteria andSett_feeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sett_fee <=", value, "sett_fee");
            return (Criteria) this;
        }

        public Criteria andSett_feeIn(List<BigDecimal> values) {
            addCriterion("sett_fee in", values, "sett_fee");
            return (Criteria) this;
        }

        public Criteria andSett_feeNotIn(List<BigDecimal> values) {
            addCriterion("sett_fee not in", values, "sett_fee");
            return (Criteria) this;
        }

        public Criteria andSett_feeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sett_fee between", value1, value2, "sett_fee");
            return (Criteria) this;
        }

        public Criteria andSett_feeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sett_fee not between", value1, value2, "sett_fee");
            return (Criteria) this;
        }

        public Criteria andRemit_amountIsNull() {
            addCriterion("remit_amount is null");
            return (Criteria) this;
        }

        public Criteria andRemit_amountIsNotNull() {
            addCriterion("remit_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRemit_amountEqualTo(BigDecimal value) {
            addCriterion("remit_amount =", value, "remit_amount");
            return (Criteria) this;
        }

        public Criteria andRemit_amountNotEqualTo(BigDecimal value) {
            addCriterion("remit_amount <>", value, "remit_amount");
            return (Criteria) this;
        }

        public Criteria andRemit_amountGreaterThan(BigDecimal value) {
            addCriterion("remit_amount >", value, "remit_amount");
            return (Criteria) this;
        }

        public Criteria andRemit_amountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("remit_amount >=", value, "remit_amount");
            return (Criteria) this;
        }

        public Criteria andRemit_amountLessThan(BigDecimal value) {
            addCriterion("remit_amount <", value, "remit_amount");
            return (Criteria) this;
        }

        public Criteria andRemit_amountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("remit_amount <=", value, "remit_amount");
            return (Criteria) this;
        }

        public Criteria andRemit_amountIn(List<BigDecimal> values) {
            addCriterion("remit_amount in", values, "remit_amount");
            return (Criteria) this;
        }

        public Criteria andRemit_amountNotIn(List<BigDecimal> values) {
            addCriterion("remit_amount not in", values, "remit_amount");
            return (Criteria) this;
        }

        public Criteria andRemit_amountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("remit_amount between", value1, value2, "remit_amount");
            return (Criteria) this;
        }

        public Criteria andRemit_amountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("remit_amount not between", value1, value2, "remit_amount");
            return (Criteria) this;
        }

        public Criteria andSett_statusIsNull() {
            addCriterion("sett_status is null");
            return (Criteria) this;
        }

        public Criteria andSett_statusIsNotNull() {
            addCriterion("sett_status is not null");
            return (Criteria) this;
        }

        public Criteria andSett_statusEqualTo(String value) {
            addCriterion("sett_status =", value, "sett_status");
            return (Criteria) this;
        }

        public Criteria andSett_statusNotEqualTo(String value) {
            addCriterion("sett_status <>", value, "sett_status");
            return (Criteria) this;
        }

        public Criteria andSett_statusGreaterThan(String value) {
            addCriterion("sett_status >", value, "sett_status");
            return (Criteria) this;
        }

        public Criteria andSett_statusGreaterThanOrEqualTo(String value) {
            addCriterion("sett_status >=", value, "sett_status");
            return (Criteria) this;
        }

        public Criteria andSett_statusLessThan(String value) {
            addCriterion("sett_status <", value, "sett_status");
            return (Criteria) this;
        }

        public Criteria andSett_statusLessThanOrEqualTo(String value) {
            addCriterion("sett_status <=", value, "sett_status");
            return (Criteria) this;
        }

        public Criteria andSett_statusLike(String value) {
            addCriterion("sett_status like", value, "sett_status");
            return (Criteria) this;
        }

        public Criteria andSett_statusNotLike(String value) {
            addCriterion("sett_status not like", value, "sett_status");
            return (Criteria) this;
        }

        public Criteria andSett_statusIn(List<String> values) {
            addCriterion("sett_status in", values, "sett_status");
            return (Criteria) this;
        }

        public Criteria andSett_statusNotIn(List<String> values) {
            addCriterion("sett_status not in", values, "sett_status");
            return (Criteria) this;
        }

        public Criteria andSett_statusBetween(String value1, String value2) {
            addCriterion("sett_status between", value1, value2, "sett_status");
            return (Criteria) this;
        }

        public Criteria andSett_statusNotBetween(String value1, String value2) {
            addCriterion("sett_status not between", value1, value2, "sett_status");
            return (Criteria) this;
        }

        public Criteria andRemit_confirm_timeIsNull() {
            addCriterion("remit_confirm_time is null");
            return (Criteria) this;
        }

        public Criteria andRemit_confirm_timeIsNotNull() {
            addCriterion("remit_confirm_time is not null");
            return (Criteria) this;
        }

        public Criteria andRemit_confirm_timeEqualTo(Date value) {
            addCriterion("remit_confirm_time =", value, "remit_confirm_time");
            return (Criteria) this;
        }

        public Criteria andRemit_confirm_timeNotEqualTo(Date value) {
            addCriterion("remit_confirm_time <>", value, "remit_confirm_time");
            return (Criteria) this;
        }

        public Criteria andRemit_confirm_timeGreaterThan(Date value) {
            addCriterion("remit_confirm_time >", value, "remit_confirm_time");
            return (Criteria) this;
        }

        public Criteria andRemit_confirm_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("remit_confirm_time >=", value, "remit_confirm_time");
            return (Criteria) this;
        }

        public Criteria andRemit_confirm_timeLessThan(Date value) {
            addCriterion("remit_confirm_time <", value, "remit_confirm_time");
            return (Criteria) this;
        }

        public Criteria andRemit_confirm_timeLessThanOrEqualTo(Date value) {
            addCriterion("remit_confirm_time <=", value, "remit_confirm_time");
            return (Criteria) this;
        }

        public Criteria andRemit_confirm_timeIn(List<Date> values) {
            addCriterion("remit_confirm_time in", values, "remit_confirm_time");
            return (Criteria) this;
        }

        public Criteria andRemit_confirm_timeNotIn(List<Date> values) {
            addCriterion("remit_confirm_time not in", values, "remit_confirm_time");
            return (Criteria) this;
        }

        public Criteria andRemit_confirm_timeBetween(Date value1, Date value2) {
            addCriterion("remit_confirm_time between", value1, value2, "remit_confirm_time");
            return (Criteria) this;
        }

        public Criteria andRemit_confirm_timeNotBetween(Date value1, Date value2) {
            addCriterion("remit_confirm_time not between", value1, value2, "remit_confirm_time");
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

        public Criteria andRemit_remarkIsNull() {
            addCriterion("remit_remark is null");
            return (Criteria) this;
        }

        public Criteria andRemit_remarkIsNotNull() {
            addCriterion("remit_remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemit_remarkEqualTo(String value) {
            addCriterion("remit_remark =", value, "remit_remark");
            return (Criteria) this;
        }

        public Criteria andRemit_remarkNotEqualTo(String value) {
            addCriterion("remit_remark <>", value, "remit_remark");
            return (Criteria) this;
        }

        public Criteria andRemit_remarkGreaterThan(String value) {
            addCriterion("remit_remark >", value, "remit_remark");
            return (Criteria) this;
        }

        public Criteria andRemit_remarkGreaterThanOrEqualTo(String value) {
            addCriterion("remit_remark >=", value, "remit_remark");
            return (Criteria) this;
        }

        public Criteria andRemit_remarkLessThan(String value) {
            addCriterion("remit_remark <", value, "remit_remark");
            return (Criteria) this;
        }

        public Criteria andRemit_remarkLessThanOrEqualTo(String value) {
            addCriterion("remit_remark <=", value, "remit_remark");
            return (Criteria) this;
        }

        public Criteria andRemit_remarkLike(String value) {
            addCriterion("remit_remark like", value, "remit_remark");
            return (Criteria) this;
        }

        public Criteria andRemit_remarkNotLike(String value) {
            addCriterion("remit_remark not like", value, "remit_remark");
            return (Criteria) this;
        }

        public Criteria andRemit_remarkIn(List<String> values) {
            addCriterion("remit_remark in", values, "remit_remark");
            return (Criteria) this;
        }

        public Criteria andRemit_remarkNotIn(List<String> values) {
            addCriterion("remit_remark not in", values, "remit_remark");
            return (Criteria) this;
        }

        public Criteria andRemit_remarkBetween(String value1, String value2) {
            addCriterion("remit_remark between", value1, value2, "remit_remark");
            return (Criteria) this;
        }

        public Criteria andRemit_remarkNotBetween(String value1, String value2) {
            addCriterion("remit_remark not between", value1, value2, "remit_remark");
            return (Criteria) this;
        }

        public Criteria andOperator_loginnameIsNull() {
            addCriterion("operator_loginname is null");
            return (Criteria) this;
        }

        public Criteria andOperator_loginnameIsNotNull() {
            addCriterion("operator_loginname is not null");
            return (Criteria) this;
        }

        public Criteria andOperator_loginnameEqualTo(String value) {
            addCriterion("operator_loginname =", value, "operator_loginname");
            return (Criteria) this;
        }

        public Criteria andOperator_loginnameNotEqualTo(String value) {
            addCriterion("operator_loginname <>", value, "operator_loginname");
            return (Criteria) this;
        }

        public Criteria andOperator_loginnameGreaterThan(String value) {
            addCriterion("operator_loginname >", value, "operator_loginname");
            return (Criteria) this;
        }

        public Criteria andOperator_loginnameGreaterThanOrEqualTo(String value) {
            addCriterion("operator_loginname >=", value, "operator_loginname");
            return (Criteria) this;
        }

        public Criteria andOperator_loginnameLessThan(String value) {
            addCriterion("operator_loginname <", value, "operator_loginname");
            return (Criteria) this;
        }

        public Criteria andOperator_loginnameLessThanOrEqualTo(String value) {
            addCriterion("operator_loginname <=", value, "operator_loginname");
            return (Criteria) this;
        }

        public Criteria andOperator_loginnameLike(String value) {
            addCriterion("operator_loginname like", value, "operator_loginname");
            return (Criteria) this;
        }

        public Criteria andOperator_loginnameNotLike(String value) {
            addCriterion("operator_loginname not like", value, "operator_loginname");
            return (Criteria) this;
        }

        public Criteria andOperator_loginnameIn(List<String> values) {
            addCriterion("operator_loginname in", values, "operator_loginname");
            return (Criteria) this;
        }

        public Criteria andOperator_loginnameNotIn(List<String> values) {
            addCriterion("operator_loginname not in", values, "operator_loginname");
            return (Criteria) this;
        }

        public Criteria andOperator_loginnameBetween(String value1, String value2) {
            addCriterion("operator_loginname between", value1, value2, "operator_loginname");
            return (Criteria) this;
        }

        public Criteria andOperator_loginnameNotBetween(String value1, String value2) {
            addCriterion("operator_loginname not between", value1, value2, "operator_loginname");
            return (Criteria) this;
        }

        public Criteria andOperator_realnameIsNull() {
            addCriterion("operator_realname is null");
            return (Criteria) this;
        }

        public Criteria andOperator_realnameIsNotNull() {
            addCriterion("operator_realname is not null");
            return (Criteria) this;
        }

        public Criteria andOperator_realnameEqualTo(String value) {
            addCriterion("operator_realname =", value, "operator_realname");
            return (Criteria) this;
        }

        public Criteria andOperator_realnameNotEqualTo(String value) {
            addCriterion("operator_realname <>", value, "operator_realname");
            return (Criteria) this;
        }

        public Criteria andOperator_realnameGreaterThan(String value) {
            addCriterion("operator_realname >", value, "operator_realname");
            return (Criteria) this;
        }

        public Criteria andOperator_realnameGreaterThanOrEqualTo(String value) {
            addCriterion("operator_realname >=", value, "operator_realname");
            return (Criteria) this;
        }

        public Criteria andOperator_realnameLessThan(String value) {
            addCriterion("operator_realname <", value, "operator_realname");
            return (Criteria) this;
        }

        public Criteria andOperator_realnameLessThanOrEqualTo(String value) {
            addCriterion("operator_realname <=", value, "operator_realname");
            return (Criteria) this;
        }

        public Criteria andOperator_realnameLike(String value) {
            addCriterion("operator_realname like", value, "operator_realname");
            return (Criteria) this;
        }

        public Criteria andOperator_realnameNotLike(String value) {
            addCriterion("operator_realname not like", value, "operator_realname");
            return (Criteria) this;
        }

        public Criteria andOperator_realnameIn(List<String> values) {
            addCriterion("operator_realname in", values, "operator_realname");
            return (Criteria) this;
        }

        public Criteria andOperator_realnameNotIn(List<String> values) {
            addCriterion("operator_realname not in", values, "operator_realname");
            return (Criteria) this;
        }

        public Criteria andOperator_realnameBetween(String value1, String value2) {
            addCriterion("operator_realname between", value1, value2, "operator_realname");
            return (Criteria) this;
        }

        public Criteria andOperator_realnameNotBetween(String value1, String value2) {
            addCriterion("operator_realname not between", value1, value2, "operator_realname");
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