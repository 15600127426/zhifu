package org.xxpay.dal.dao.reconciliation.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class RpAccountCheck_mistakeExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    private Integer limit;

    private Integer offset;

    public RpAccountCheck_mistakeExample() {
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

        public Criteria andEditorIsNull() {
            addCriterion("editor is null");
            return (Criteria) this;
        }

        public Criteria andEditorIsNotNull() {
            addCriterion("editor is not null");
            return (Criteria) this;
        }

        public Criteria andEditorEqualTo(String value) {
            addCriterion("editor =", value, "editor");
            return (Criteria) this;
        }

        public Criteria andEditorNotEqualTo(String value) {
            addCriterion("editor <>", value, "editor");
            return (Criteria) this;
        }

        public Criteria andEditorGreaterThan(String value) {
            addCriterion("editor >", value, "editor");
            return (Criteria) this;
        }

        public Criteria andEditorGreaterThanOrEqualTo(String value) {
            addCriterion("editor >=", value, "editor");
            return (Criteria) this;
        }

        public Criteria andEditorLessThan(String value) {
            addCriterion("editor <", value, "editor");
            return (Criteria) this;
        }

        public Criteria andEditorLessThanOrEqualTo(String value) {
            addCriterion("editor <=", value, "editor");
            return (Criteria) this;
        }

        public Criteria andEditorLike(String value) {
            addCriterion("editor like", value, "editor");
            return (Criteria) this;
        }

        public Criteria andEditorNotLike(String value) {
            addCriterion("editor not like", value, "editor");
            return (Criteria) this;
        }

        public Criteria andEditorIn(List<String> values) {
            addCriterion("editor in", values, "editor");
            return (Criteria) this;
        }

        public Criteria andEditorNotIn(List<String> values) {
            addCriterion("editor not in", values, "editor");
            return (Criteria) this;
        }

        public Criteria andEditorBetween(String value1, String value2) {
            addCriterion("editor between", value1, value2, "editor");
            return (Criteria) this;
        }

        public Criteria andEditorNotBetween(String value1, String value2) {
            addCriterion("editor not between", value1, value2, "editor");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("creater not between", value1, value2, "creater");
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

        public Criteria andAccount_check_batch_noIsNull() {
            addCriterion("account_check_batch_no is null");
            return (Criteria) this;
        }

        public Criteria andAccount_check_batch_noIsNotNull() {
            addCriterion("account_check_batch_no is not null");
            return (Criteria) this;
        }

        public Criteria andAccount_check_batch_noEqualTo(String value) {
            addCriterion("account_check_batch_no =", value, "account_check_batch_no");
            return (Criteria) this;
        }

        public Criteria andAccount_check_batch_noNotEqualTo(String value) {
            addCriterion("account_check_batch_no <>", value, "account_check_batch_no");
            return (Criteria) this;
        }

        public Criteria andAccount_check_batch_noGreaterThan(String value) {
            addCriterion("account_check_batch_no >", value, "account_check_batch_no");
            return (Criteria) this;
        }

        public Criteria andAccount_check_batch_noGreaterThanOrEqualTo(String value) {
            addCriterion("account_check_batch_no >=", value, "account_check_batch_no");
            return (Criteria) this;
        }

        public Criteria andAccount_check_batch_noLessThan(String value) {
            addCriterion("account_check_batch_no <", value, "account_check_batch_no");
            return (Criteria) this;
        }

        public Criteria andAccount_check_batch_noLessThanOrEqualTo(String value) {
            addCriterion("account_check_batch_no <=", value, "account_check_batch_no");
            return (Criteria) this;
        }

        public Criteria andAccount_check_batch_noLike(String value) {
            addCriterion("account_check_batch_no like", value, "account_check_batch_no");
            return (Criteria) this;
        }

        public Criteria andAccount_check_batch_noNotLike(String value) {
            addCriterion("account_check_batch_no not like", value, "account_check_batch_no");
            return (Criteria) this;
        }

        public Criteria andAccount_check_batch_noIn(List<String> values) {
            addCriterion("account_check_batch_no in", values, "account_check_batch_no");
            return (Criteria) this;
        }

        public Criteria andAccount_check_batch_noNotIn(List<String> values) {
            addCriterion("account_check_batch_no not in", values, "account_check_batch_no");
            return (Criteria) this;
        }

        public Criteria andAccount_check_batch_noBetween(String value1, String value2) {
            addCriterion("account_check_batch_no between", value1, value2, "account_check_batch_no");
            return (Criteria) this;
        }

        public Criteria andAccount_check_batch_noNotBetween(String value1, String value2) {
            addCriterion("account_check_batch_no not between", value1, value2, "account_check_batch_no");
            return (Criteria) this;
        }

        public Criteria andBill_dateIsNull() {
            addCriterion("bill_date is null");
            return (Criteria) this;
        }

        public Criteria andBill_dateIsNotNull() {
            addCriterion("bill_date is not null");
            return (Criteria) this;
        }

        public Criteria andBill_dateEqualTo(Date value) {
            addCriterionForJDBCDate("bill_date =", value, "bill_date");
            return (Criteria) this;
        }

        public Criteria andBill_dateNotEqualTo(Date value) {
            addCriterionForJDBCDate("bill_date <>", value, "bill_date");
            return (Criteria) this;
        }

        public Criteria andBill_dateGreaterThan(Date value) {
            addCriterionForJDBCDate("bill_date >", value, "bill_date");
            return (Criteria) this;
        }

        public Criteria andBill_dateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("bill_date >=", value, "bill_date");
            return (Criteria) this;
        }

        public Criteria andBill_dateLessThan(Date value) {
            addCriterionForJDBCDate("bill_date <", value, "bill_date");
            return (Criteria) this;
        }

        public Criteria andBill_dateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("bill_date <=", value, "bill_date");
            return (Criteria) this;
        }

        public Criteria andBill_dateIn(List<Date> values) {
            addCriterionForJDBCDate("bill_date in", values, "bill_date");
            return (Criteria) this;
        }

        public Criteria andBill_dateNotIn(List<Date> values) {
            addCriterionForJDBCDate("bill_date not in", values, "bill_date");
            return (Criteria) this;
        }

        public Criteria andBill_dateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("bill_date between", value1, value2, "bill_date");
            return (Criteria) this;
        }

        public Criteria andBill_dateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("bill_date not between", value1, value2, "bill_date");
            return (Criteria) this;
        }

        public Criteria andBank_typeIsNull() {
            addCriterion("bank_type is null");
            return (Criteria) this;
        }

        public Criteria andBank_typeIsNotNull() {
            addCriterion("bank_type is not null");
            return (Criteria) this;
        }

        public Criteria andBank_typeEqualTo(String value) {
            addCriterion("bank_type =", value, "bank_type");
            return (Criteria) this;
        }

        public Criteria andBank_typeNotEqualTo(String value) {
            addCriterion("bank_type <>", value, "bank_type");
            return (Criteria) this;
        }

        public Criteria andBank_typeGreaterThan(String value) {
            addCriterion("bank_type >", value, "bank_type");
            return (Criteria) this;
        }

        public Criteria andBank_typeGreaterThanOrEqualTo(String value) {
            addCriterion("bank_type >=", value, "bank_type");
            return (Criteria) this;
        }

        public Criteria andBank_typeLessThan(String value) {
            addCriterion("bank_type <", value, "bank_type");
            return (Criteria) this;
        }

        public Criteria andBank_typeLessThanOrEqualTo(String value) {
            addCriterion("bank_type <=", value, "bank_type");
            return (Criteria) this;
        }

        public Criteria andBank_typeLike(String value) {
            addCriterion("bank_type like", value, "bank_type");
            return (Criteria) this;
        }

        public Criteria andBank_typeNotLike(String value) {
            addCriterion("bank_type not like", value, "bank_type");
            return (Criteria) this;
        }

        public Criteria andBank_typeIn(List<String> values) {
            addCriterion("bank_type in", values, "bank_type");
            return (Criteria) this;
        }

        public Criteria andBank_typeNotIn(List<String> values) {
            addCriterion("bank_type not in", values, "bank_type");
            return (Criteria) this;
        }

        public Criteria andBank_typeBetween(String value1, String value2) {
            addCriterion("bank_type between", value1, value2, "bank_type");
            return (Criteria) this;
        }

        public Criteria andBank_typeNotBetween(String value1, String value2) {
            addCriterion("bank_type not between", value1, value2, "bank_type");
            return (Criteria) this;
        }

        public Criteria andOrder_timeIsNull() {
            addCriterion("order_time is null");
            return (Criteria) this;
        }

        public Criteria andOrder_timeIsNotNull() {
            addCriterion("order_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrder_timeEqualTo(Date value) {
            addCriterion("order_time =", value, "order_time");
            return (Criteria) this;
        }

        public Criteria andOrder_timeNotEqualTo(Date value) {
            addCriterion("order_time <>", value, "order_time");
            return (Criteria) this;
        }

        public Criteria andOrder_timeGreaterThan(Date value) {
            addCriterion("order_time >", value, "order_time");
            return (Criteria) this;
        }

        public Criteria andOrder_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("order_time >=", value, "order_time");
            return (Criteria) this;
        }

        public Criteria andOrder_timeLessThan(Date value) {
            addCriterion("order_time <", value, "order_time");
            return (Criteria) this;
        }

        public Criteria andOrder_timeLessThanOrEqualTo(Date value) {
            addCriterion("order_time <=", value, "order_time");
            return (Criteria) this;
        }

        public Criteria andOrder_timeIn(List<Date> values) {
            addCriterion("order_time in", values, "order_time");
            return (Criteria) this;
        }

        public Criteria andOrder_timeNotIn(List<Date> values) {
            addCriterion("order_time not in", values, "order_time");
            return (Criteria) this;
        }

        public Criteria andOrder_timeBetween(Date value1, Date value2) {
            addCriterion("order_time between", value1, value2, "order_time");
            return (Criteria) this;
        }

        public Criteria andOrder_timeNotBetween(Date value1, Date value2) {
            addCriterion("order_time not between", value1, value2, "order_time");
            return (Criteria) this;
        }

        public Criteria andMerchant_nameIsNull() {
            addCriterion("merchant_name is null");
            return (Criteria) this;
        }

        public Criteria andMerchant_nameIsNotNull() {
            addCriterion("merchant_name is not null");
            return (Criteria) this;
        }

        public Criteria andMerchant_nameEqualTo(String value) {
            addCriterion("merchant_name =", value, "merchant_name");
            return (Criteria) this;
        }

        public Criteria andMerchant_nameNotEqualTo(String value) {
            addCriterion("merchant_name <>", value, "merchant_name");
            return (Criteria) this;
        }

        public Criteria andMerchant_nameGreaterThan(String value) {
            addCriterion("merchant_name >", value, "merchant_name");
            return (Criteria) this;
        }

        public Criteria andMerchant_nameGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_name >=", value, "merchant_name");
            return (Criteria) this;
        }

        public Criteria andMerchant_nameLessThan(String value) {
            addCriterion("merchant_name <", value, "merchant_name");
            return (Criteria) this;
        }

        public Criteria andMerchant_nameLessThanOrEqualTo(String value) {
            addCriterion("merchant_name <=", value, "merchant_name");
            return (Criteria) this;
        }

        public Criteria andMerchant_nameLike(String value) {
            addCriterion("merchant_name like", value, "merchant_name");
            return (Criteria) this;
        }

        public Criteria andMerchant_nameNotLike(String value) {
            addCriterion("merchant_name not like", value, "merchant_name");
            return (Criteria) this;
        }

        public Criteria andMerchant_nameIn(List<String> values) {
            addCriterion("merchant_name in", values, "merchant_name");
            return (Criteria) this;
        }

        public Criteria andMerchant_nameNotIn(List<String> values) {
            addCriterion("merchant_name not in", values, "merchant_name");
            return (Criteria) this;
        }

        public Criteria andMerchant_nameBetween(String value1, String value2) {
            addCriterion("merchant_name between", value1, value2, "merchant_name");
            return (Criteria) this;
        }

        public Criteria andMerchant_nameNotBetween(String value1, String value2) {
            addCriterion("merchant_name not between", value1, value2, "merchant_name");
            return (Criteria) this;
        }

        public Criteria andMerchant_noIsNull() {
            addCriterion("merchant_no is null");
            return (Criteria) this;
        }

        public Criteria andMerchant_noIsNotNull() {
            addCriterion("merchant_no is not null");
            return (Criteria) this;
        }

        public Criteria andMerchant_noEqualTo(String value) {
            addCriterion("merchant_no =", value, "merchant_no");
            return (Criteria) this;
        }

        public Criteria andMerchant_noNotEqualTo(String value) {
            addCriterion("merchant_no <>", value, "merchant_no");
            return (Criteria) this;
        }

        public Criteria andMerchant_noGreaterThan(String value) {
            addCriterion("merchant_no >", value, "merchant_no");
            return (Criteria) this;
        }

        public Criteria andMerchant_noGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_no >=", value, "merchant_no");
            return (Criteria) this;
        }

        public Criteria andMerchant_noLessThan(String value) {
            addCriterion("merchant_no <", value, "merchant_no");
            return (Criteria) this;
        }

        public Criteria andMerchant_noLessThanOrEqualTo(String value) {
            addCriterion("merchant_no <=", value, "merchant_no");
            return (Criteria) this;
        }

        public Criteria andMerchant_noLike(String value) {
            addCriterion("merchant_no like", value, "merchant_no");
            return (Criteria) this;
        }

        public Criteria andMerchant_noNotLike(String value) {
            addCriterion("merchant_no not like", value, "merchant_no");
            return (Criteria) this;
        }

        public Criteria andMerchant_noIn(List<String> values) {
            addCriterion("merchant_no in", values, "merchant_no");
            return (Criteria) this;
        }

        public Criteria andMerchant_noNotIn(List<String> values) {
            addCriterion("merchant_no not in", values, "merchant_no");
            return (Criteria) this;
        }

        public Criteria andMerchant_noBetween(String value1, String value2) {
            addCriterion("merchant_no between", value1, value2, "merchant_no");
            return (Criteria) this;
        }

        public Criteria andMerchant_noNotBetween(String value1, String value2) {
            addCriterion("merchant_no not between", value1, value2, "merchant_no");
            return (Criteria) this;
        }

        public Criteria andOrder_noIsNull() {
            addCriterion("order_no is null");
            return (Criteria) this;
        }

        public Criteria andOrder_noIsNotNull() {
            addCriterion("order_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrder_noEqualTo(String value) {
            addCriterion("order_no =", value, "order_no");
            return (Criteria) this;
        }

        public Criteria andOrder_noNotEqualTo(String value) {
            addCriterion("order_no <>", value, "order_no");
            return (Criteria) this;
        }

        public Criteria andOrder_noGreaterThan(String value) {
            addCriterion("order_no >", value, "order_no");
            return (Criteria) this;
        }

        public Criteria andOrder_noGreaterThanOrEqualTo(String value) {
            addCriterion("order_no >=", value, "order_no");
            return (Criteria) this;
        }

        public Criteria andOrder_noLessThan(String value) {
            addCriterion("order_no <", value, "order_no");
            return (Criteria) this;
        }

        public Criteria andOrder_noLessThanOrEqualTo(String value) {
            addCriterion("order_no <=", value, "order_no");
            return (Criteria) this;
        }

        public Criteria andOrder_noLike(String value) {
            addCriterion("order_no like", value, "order_no");
            return (Criteria) this;
        }

        public Criteria andOrder_noNotLike(String value) {
            addCriterion("order_no not like", value, "order_no");
            return (Criteria) this;
        }

        public Criteria andOrder_noIn(List<String> values) {
            addCriterion("order_no in", values, "order_no");
            return (Criteria) this;
        }

        public Criteria andOrder_noNotIn(List<String> values) {
            addCriterion("order_no not in", values, "order_no");
            return (Criteria) this;
        }

        public Criteria andOrder_noBetween(String value1, String value2) {
            addCriterion("order_no between", value1, value2, "order_no");
            return (Criteria) this;
        }

        public Criteria andOrder_noNotBetween(String value1, String value2) {
            addCriterion("order_no not between", value1, value2, "order_no");
            return (Criteria) this;
        }

        public Criteria andTrade_timeIsNull() {
            addCriterion("trade_time is null");
            return (Criteria) this;
        }

        public Criteria andTrade_timeIsNotNull() {
            addCriterion("trade_time is not null");
            return (Criteria) this;
        }

        public Criteria andTrade_timeEqualTo(Date value) {
            addCriterion("trade_time =", value, "trade_time");
            return (Criteria) this;
        }

        public Criteria andTrade_timeNotEqualTo(Date value) {
            addCriterion("trade_time <>", value, "trade_time");
            return (Criteria) this;
        }

        public Criteria andTrade_timeGreaterThan(Date value) {
            addCriterion("trade_time >", value, "trade_time");
            return (Criteria) this;
        }

        public Criteria andTrade_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("trade_time >=", value, "trade_time");
            return (Criteria) this;
        }

        public Criteria andTrade_timeLessThan(Date value) {
            addCriterion("trade_time <", value, "trade_time");
            return (Criteria) this;
        }

        public Criteria andTrade_timeLessThanOrEqualTo(Date value) {
            addCriterion("trade_time <=", value, "trade_time");
            return (Criteria) this;
        }

        public Criteria andTrade_timeIn(List<Date> values) {
            addCriterion("trade_time in", values, "trade_time");
            return (Criteria) this;
        }

        public Criteria andTrade_timeNotIn(List<Date> values) {
            addCriterion("trade_time not in", values, "trade_time");
            return (Criteria) this;
        }

        public Criteria andTrade_timeBetween(Date value1, Date value2) {
            addCriterion("trade_time between", value1, value2, "trade_time");
            return (Criteria) this;
        }

        public Criteria andTrade_timeNotBetween(Date value1, Date value2) {
            addCriterion("trade_time not between", value1, value2, "trade_time");
            return (Criteria) this;
        }

        public Criteria andTrx_noIsNull() {
            addCriterion("trx_no is null");
            return (Criteria) this;
        }

        public Criteria andTrx_noIsNotNull() {
            addCriterion("trx_no is not null");
            return (Criteria) this;
        }

        public Criteria andTrx_noEqualTo(String value) {
            addCriterion("trx_no =", value, "trx_no");
            return (Criteria) this;
        }

        public Criteria andTrx_noNotEqualTo(String value) {
            addCriterion("trx_no <>", value, "trx_no");
            return (Criteria) this;
        }

        public Criteria andTrx_noGreaterThan(String value) {
            addCriterion("trx_no >", value, "trx_no");
            return (Criteria) this;
        }

        public Criteria andTrx_noGreaterThanOrEqualTo(String value) {
            addCriterion("trx_no >=", value, "trx_no");
            return (Criteria) this;
        }

        public Criteria andTrx_noLessThan(String value) {
            addCriterion("trx_no <", value, "trx_no");
            return (Criteria) this;
        }

        public Criteria andTrx_noLessThanOrEqualTo(String value) {
            addCriterion("trx_no <=", value, "trx_no");
            return (Criteria) this;
        }

        public Criteria andTrx_noLike(String value) {
            addCriterion("trx_no like", value, "trx_no");
            return (Criteria) this;
        }

        public Criteria andTrx_noNotLike(String value) {
            addCriterion("trx_no not like", value, "trx_no");
            return (Criteria) this;
        }

        public Criteria andTrx_noIn(List<String> values) {
            addCriterion("trx_no in", values, "trx_no");
            return (Criteria) this;
        }

        public Criteria andTrx_noNotIn(List<String> values) {
            addCriterion("trx_no not in", values, "trx_no");
            return (Criteria) this;
        }

        public Criteria andTrx_noBetween(String value1, String value2) {
            addCriterion("trx_no between", value1, value2, "trx_no");
            return (Criteria) this;
        }

        public Criteria andTrx_noNotBetween(String value1, String value2) {
            addCriterion("trx_no not between", value1, value2, "trx_no");
            return (Criteria) this;
        }

        public Criteria andOrder_amountIsNull() {
            addCriterion("order_amount is null");
            return (Criteria) this;
        }

        public Criteria andOrder_amountIsNotNull() {
            addCriterion("order_amount is not null");
            return (Criteria) this;
        }

        public Criteria andOrder_amountEqualTo(BigDecimal value) {
            addCriterion("order_amount =", value, "order_amount");
            return (Criteria) this;
        }

        public Criteria andOrder_amountNotEqualTo(BigDecimal value) {
            addCriterion("order_amount <>", value, "order_amount");
            return (Criteria) this;
        }

        public Criteria andOrder_amountGreaterThan(BigDecimal value) {
            addCriterion("order_amount >", value, "order_amount");
            return (Criteria) this;
        }

        public Criteria andOrder_amountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("order_amount >=", value, "order_amount");
            return (Criteria) this;
        }

        public Criteria andOrder_amountLessThan(BigDecimal value) {
            addCriterion("order_amount <", value, "order_amount");
            return (Criteria) this;
        }

        public Criteria andOrder_amountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("order_amount <=", value, "order_amount");
            return (Criteria) this;
        }

        public Criteria andOrder_amountIn(List<BigDecimal> values) {
            addCriterion("order_amount in", values, "order_amount");
            return (Criteria) this;
        }

        public Criteria andOrder_amountNotIn(List<BigDecimal> values) {
            addCriterion("order_amount not in", values, "order_amount");
            return (Criteria) this;
        }

        public Criteria andOrder_amountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_amount between", value1, value2, "order_amount");
            return (Criteria) this;
        }

        public Criteria andOrder_amountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_amount not between", value1, value2, "order_amount");
            return (Criteria) this;
        }

        public Criteria andRefund_amountIsNull() {
            addCriterion("refund_amount is null");
            return (Criteria) this;
        }

        public Criteria andRefund_amountIsNotNull() {
            addCriterion("refund_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRefund_amountEqualTo(BigDecimal value) {
            addCriterion("refund_amount =", value, "refund_amount");
            return (Criteria) this;
        }

        public Criteria andRefund_amountNotEqualTo(BigDecimal value) {
            addCriterion("refund_amount <>", value, "refund_amount");
            return (Criteria) this;
        }

        public Criteria andRefund_amountGreaterThan(BigDecimal value) {
            addCriterion("refund_amount >", value, "refund_amount");
            return (Criteria) this;
        }

        public Criteria andRefund_amountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("refund_amount >=", value, "refund_amount");
            return (Criteria) this;
        }

        public Criteria andRefund_amountLessThan(BigDecimal value) {
            addCriterion("refund_amount <", value, "refund_amount");
            return (Criteria) this;
        }

        public Criteria andRefund_amountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("refund_amount <=", value, "refund_amount");
            return (Criteria) this;
        }

        public Criteria andRefund_amountIn(List<BigDecimal> values) {
            addCriterion("refund_amount in", values, "refund_amount");
            return (Criteria) this;
        }

        public Criteria andRefund_amountNotIn(List<BigDecimal> values) {
            addCriterion("refund_amount not in", values, "refund_amount");
            return (Criteria) this;
        }

        public Criteria andRefund_amountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("refund_amount between", value1, value2, "refund_amount");
            return (Criteria) this;
        }

        public Criteria andRefund_amountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("refund_amount not between", value1, value2, "refund_amount");
            return (Criteria) this;
        }

        public Criteria andTrade_statusIsNull() {
            addCriterion("trade_status is null");
            return (Criteria) this;
        }

        public Criteria andTrade_statusIsNotNull() {
            addCriterion("trade_status is not null");
            return (Criteria) this;
        }

        public Criteria andTrade_statusEqualTo(String value) {
            addCriterion("trade_status =", value, "trade_status");
            return (Criteria) this;
        }

        public Criteria andTrade_statusNotEqualTo(String value) {
            addCriterion("trade_status <>", value, "trade_status");
            return (Criteria) this;
        }

        public Criteria andTrade_statusGreaterThan(String value) {
            addCriterion("trade_status >", value, "trade_status");
            return (Criteria) this;
        }

        public Criteria andTrade_statusGreaterThanOrEqualTo(String value) {
            addCriterion("trade_status >=", value, "trade_status");
            return (Criteria) this;
        }

        public Criteria andTrade_statusLessThan(String value) {
            addCriterion("trade_status <", value, "trade_status");
            return (Criteria) this;
        }

        public Criteria andTrade_statusLessThanOrEqualTo(String value) {
            addCriterion("trade_status <=", value, "trade_status");
            return (Criteria) this;
        }

        public Criteria andTrade_statusLike(String value) {
            addCriterion("trade_status like", value, "trade_status");
            return (Criteria) this;
        }

        public Criteria andTrade_statusNotLike(String value) {
            addCriterion("trade_status not like", value, "trade_status");
            return (Criteria) this;
        }

        public Criteria andTrade_statusIn(List<String> values) {
            addCriterion("trade_status in", values, "trade_status");
            return (Criteria) this;
        }

        public Criteria andTrade_statusNotIn(List<String> values) {
            addCriterion("trade_status not in", values, "trade_status");
            return (Criteria) this;
        }

        public Criteria andTrade_statusBetween(String value1, String value2) {
            addCriterion("trade_status between", value1, value2, "trade_status");
            return (Criteria) this;
        }

        public Criteria andTrade_statusNotBetween(String value1, String value2) {
            addCriterion("trade_status not between", value1, value2, "trade_status");
            return (Criteria) this;
        }

        public Criteria andFeeIsNull() {
            addCriterion("fee is null");
            return (Criteria) this;
        }

        public Criteria andFeeIsNotNull() {
            addCriterion("fee is not null");
            return (Criteria) this;
        }

        public Criteria andFeeEqualTo(BigDecimal value) {
            addCriterion("fee =", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotEqualTo(BigDecimal value) {
            addCriterion("fee <>", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeGreaterThan(BigDecimal value) {
            addCriterion("fee >", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fee >=", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeLessThan(BigDecimal value) {
            addCriterion("fee <", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fee <=", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeIn(List<BigDecimal> values) {
            addCriterion("fee in", values, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotIn(List<BigDecimal> values) {
            addCriterion("fee not in", values, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fee between", value1, value2, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fee not between", value1, value2, "fee");
            return (Criteria) this;
        }

        public Criteria andBank_trade_timeIsNull() {
            addCriterion("bank_trade_time is null");
            return (Criteria) this;
        }

        public Criteria andBank_trade_timeIsNotNull() {
            addCriterion("bank_trade_time is not null");
            return (Criteria) this;
        }

        public Criteria andBank_trade_timeEqualTo(Date value) {
            addCriterion("bank_trade_time =", value, "bank_trade_time");
            return (Criteria) this;
        }

        public Criteria andBank_trade_timeNotEqualTo(Date value) {
            addCriterion("bank_trade_time <>", value, "bank_trade_time");
            return (Criteria) this;
        }

        public Criteria andBank_trade_timeGreaterThan(Date value) {
            addCriterion("bank_trade_time >", value, "bank_trade_time");
            return (Criteria) this;
        }

        public Criteria andBank_trade_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("bank_trade_time >=", value, "bank_trade_time");
            return (Criteria) this;
        }

        public Criteria andBank_trade_timeLessThan(Date value) {
            addCriterion("bank_trade_time <", value, "bank_trade_time");
            return (Criteria) this;
        }

        public Criteria andBank_trade_timeLessThanOrEqualTo(Date value) {
            addCriterion("bank_trade_time <=", value, "bank_trade_time");
            return (Criteria) this;
        }

        public Criteria andBank_trade_timeIn(List<Date> values) {
            addCriterion("bank_trade_time in", values, "bank_trade_time");
            return (Criteria) this;
        }

        public Criteria andBank_trade_timeNotIn(List<Date> values) {
            addCriterion("bank_trade_time not in", values, "bank_trade_time");
            return (Criteria) this;
        }

        public Criteria andBank_trade_timeBetween(Date value1, Date value2) {
            addCriterion("bank_trade_time between", value1, value2, "bank_trade_time");
            return (Criteria) this;
        }

        public Criteria andBank_trade_timeNotBetween(Date value1, Date value2) {
            addCriterion("bank_trade_time not between", value1, value2, "bank_trade_time");
            return (Criteria) this;
        }

        public Criteria andBank_order_noIsNull() {
            addCriterion("bank_order_no is null");
            return (Criteria) this;
        }

        public Criteria andBank_order_noIsNotNull() {
            addCriterion("bank_order_no is not null");
            return (Criteria) this;
        }

        public Criteria andBank_order_noEqualTo(String value) {
            addCriterion("bank_order_no =", value, "bank_order_no");
            return (Criteria) this;
        }

        public Criteria andBank_order_noNotEqualTo(String value) {
            addCriterion("bank_order_no <>", value, "bank_order_no");
            return (Criteria) this;
        }

        public Criteria andBank_order_noGreaterThan(String value) {
            addCriterion("bank_order_no >", value, "bank_order_no");
            return (Criteria) this;
        }

        public Criteria andBank_order_noGreaterThanOrEqualTo(String value) {
            addCriterion("bank_order_no >=", value, "bank_order_no");
            return (Criteria) this;
        }

        public Criteria andBank_order_noLessThan(String value) {
            addCriterion("bank_order_no <", value, "bank_order_no");
            return (Criteria) this;
        }

        public Criteria andBank_order_noLessThanOrEqualTo(String value) {
            addCriterion("bank_order_no <=", value, "bank_order_no");
            return (Criteria) this;
        }

        public Criteria andBank_order_noLike(String value) {
            addCriterion("bank_order_no like", value, "bank_order_no");
            return (Criteria) this;
        }

        public Criteria andBank_order_noNotLike(String value) {
            addCriterion("bank_order_no not like", value, "bank_order_no");
            return (Criteria) this;
        }

        public Criteria andBank_order_noIn(List<String> values) {
            addCriterion("bank_order_no in", values, "bank_order_no");
            return (Criteria) this;
        }

        public Criteria andBank_order_noNotIn(List<String> values) {
            addCriterion("bank_order_no not in", values, "bank_order_no");
            return (Criteria) this;
        }

        public Criteria andBank_order_noBetween(String value1, String value2) {
            addCriterion("bank_order_no between", value1, value2, "bank_order_no");
            return (Criteria) this;
        }

        public Criteria andBank_order_noNotBetween(String value1, String value2) {
            addCriterion("bank_order_no not between", value1, value2, "bank_order_no");
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

        public Criteria andBank_trade_statusIsNull() {
            addCriterion("bank_trade_status is null");
            return (Criteria) this;
        }

        public Criteria andBank_trade_statusIsNotNull() {
            addCriterion("bank_trade_status is not null");
            return (Criteria) this;
        }

        public Criteria andBank_trade_statusEqualTo(String value) {
            addCriterion("bank_trade_status =", value, "bank_trade_status");
            return (Criteria) this;
        }

        public Criteria andBank_trade_statusNotEqualTo(String value) {
            addCriterion("bank_trade_status <>", value, "bank_trade_status");
            return (Criteria) this;
        }

        public Criteria andBank_trade_statusGreaterThan(String value) {
            addCriterion("bank_trade_status >", value, "bank_trade_status");
            return (Criteria) this;
        }

        public Criteria andBank_trade_statusGreaterThanOrEqualTo(String value) {
            addCriterion("bank_trade_status >=", value, "bank_trade_status");
            return (Criteria) this;
        }

        public Criteria andBank_trade_statusLessThan(String value) {
            addCriterion("bank_trade_status <", value, "bank_trade_status");
            return (Criteria) this;
        }

        public Criteria andBank_trade_statusLessThanOrEqualTo(String value) {
            addCriterion("bank_trade_status <=", value, "bank_trade_status");
            return (Criteria) this;
        }

        public Criteria andBank_trade_statusLike(String value) {
            addCriterion("bank_trade_status like", value, "bank_trade_status");
            return (Criteria) this;
        }

        public Criteria andBank_trade_statusNotLike(String value) {
            addCriterion("bank_trade_status not like", value, "bank_trade_status");
            return (Criteria) this;
        }

        public Criteria andBank_trade_statusIn(List<String> values) {
            addCriterion("bank_trade_status in", values, "bank_trade_status");
            return (Criteria) this;
        }

        public Criteria andBank_trade_statusNotIn(List<String> values) {
            addCriterion("bank_trade_status not in", values, "bank_trade_status");
            return (Criteria) this;
        }

        public Criteria andBank_trade_statusBetween(String value1, String value2) {
            addCriterion("bank_trade_status between", value1, value2, "bank_trade_status");
            return (Criteria) this;
        }

        public Criteria andBank_trade_statusNotBetween(String value1, String value2) {
            addCriterion("bank_trade_status not between", value1, value2, "bank_trade_status");
            return (Criteria) this;
        }

        public Criteria andBank_amountIsNull() {
            addCriterion("bank_amount is null");
            return (Criteria) this;
        }

        public Criteria andBank_amountIsNotNull() {
            addCriterion("bank_amount is not null");
            return (Criteria) this;
        }

        public Criteria andBank_amountEqualTo(BigDecimal value) {
            addCriterion("bank_amount =", value, "bank_amount");
            return (Criteria) this;
        }

        public Criteria andBank_amountNotEqualTo(BigDecimal value) {
            addCriterion("bank_amount <>", value, "bank_amount");
            return (Criteria) this;
        }

        public Criteria andBank_amountGreaterThan(BigDecimal value) {
            addCriterion("bank_amount >", value, "bank_amount");
            return (Criteria) this;
        }

        public Criteria andBank_amountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("bank_amount >=", value, "bank_amount");
            return (Criteria) this;
        }

        public Criteria andBank_amountLessThan(BigDecimal value) {
            addCriterion("bank_amount <", value, "bank_amount");
            return (Criteria) this;
        }

        public Criteria andBank_amountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("bank_amount <=", value, "bank_amount");
            return (Criteria) this;
        }

        public Criteria andBank_amountIn(List<BigDecimal> values) {
            addCriterion("bank_amount in", values, "bank_amount");
            return (Criteria) this;
        }

        public Criteria andBank_amountNotIn(List<BigDecimal> values) {
            addCriterion("bank_amount not in", values, "bank_amount");
            return (Criteria) this;
        }

        public Criteria andBank_amountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bank_amount between", value1, value2, "bank_amount");
            return (Criteria) this;
        }

        public Criteria andBank_amountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bank_amount not between", value1, value2, "bank_amount");
            return (Criteria) this;
        }

        public Criteria andBank_refund_amountIsNull() {
            addCriterion("bank_refund_amount is null");
            return (Criteria) this;
        }

        public Criteria andBank_refund_amountIsNotNull() {
            addCriterion("bank_refund_amount is not null");
            return (Criteria) this;
        }

        public Criteria andBank_refund_amountEqualTo(BigDecimal value) {
            addCriterion("bank_refund_amount =", value, "bank_refund_amount");
            return (Criteria) this;
        }

        public Criteria andBank_refund_amountNotEqualTo(BigDecimal value) {
            addCriterion("bank_refund_amount <>", value, "bank_refund_amount");
            return (Criteria) this;
        }

        public Criteria andBank_refund_amountGreaterThan(BigDecimal value) {
            addCriterion("bank_refund_amount >", value, "bank_refund_amount");
            return (Criteria) this;
        }

        public Criteria andBank_refund_amountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("bank_refund_amount >=", value, "bank_refund_amount");
            return (Criteria) this;
        }

        public Criteria andBank_refund_amountLessThan(BigDecimal value) {
            addCriterion("bank_refund_amount <", value, "bank_refund_amount");
            return (Criteria) this;
        }

        public Criteria andBank_refund_amountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("bank_refund_amount <=", value, "bank_refund_amount");
            return (Criteria) this;
        }

        public Criteria andBank_refund_amountIn(List<BigDecimal> values) {
            addCriterion("bank_refund_amount in", values, "bank_refund_amount");
            return (Criteria) this;
        }

        public Criteria andBank_refund_amountNotIn(List<BigDecimal> values) {
            addCriterion("bank_refund_amount not in", values, "bank_refund_amount");
            return (Criteria) this;
        }

        public Criteria andBank_refund_amountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bank_refund_amount between", value1, value2, "bank_refund_amount");
            return (Criteria) this;
        }

        public Criteria andBank_refund_amountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bank_refund_amount not between", value1, value2, "bank_refund_amount");
            return (Criteria) this;
        }

        public Criteria andBank_feeIsNull() {
            addCriterion("bank_fee is null");
            return (Criteria) this;
        }

        public Criteria andBank_feeIsNotNull() {
            addCriterion("bank_fee is not null");
            return (Criteria) this;
        }

        public Criteria andBank_feeEqualTo(BigDecimal value) {
            addCriterion("bank_fee =", value, "bank_fee");
            return (Criteria) this;
        }

        public Criteria andBank_feeNotEqualTo(BigDecimal value) {
            addCriterion("bank_fee <>", value, "bank_fee");
            return (Criteria) this;
        }

        public Criteria andBank_feeGreaterThan(BigDecimal value) {
            addCriterion("bank_fee >", value, "bank_fee");
            return (Criteria) this;
        }

        public Criteria andBank_feeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("bank_fee >=", value, "bank_fee");
            return (Criteria) this;
        }

        public Criteria andBank_feeLessThan(BigDecimal value) {
            addCriterion("bank_fee <", value, "bank_fee");
            return (Criteria) this;
        }

        public Criteria andBank_feeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("bank_fee <=", value, "bank_fee");
            return (Criteria) this;
        }

        public Criteria andBank_feeIn(List<BigDecimal> values) {
            addCriterion("bank_fee in", values, "bank_fee");
            return (Criteria) this;
        }

        public Criteria andBank_feeNotIn(List<BigDecimal> values) {
            addCriterion("bank_fee not in", values, "bank_fee");
            return (Criteria) this;
        }

        public Criteria andBank_feeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bank_fee between", value1, value2, "bank_fee");
            return (Criteria) this;
        }

        public Criteria andBank_feeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bank_fee not between", value1, value2, "bank_fee");
            return (Criteria) this;
        }

        public Criteria andErr_typeIsNull() {
            addCriterion("err_type is null");
            return (Criteria) this;
        }

        public Criteria andErr_typeIsNotNull() {
            addCriterion("err_type is not null");
            return (Criteria) this;
        }

        public Criteria andErr_typeEqualTo(String value) {
            addCriterion("err_type =", value, "err_type");
            return (Criteria) this;
        }

        public Criteria andErr_typeNotEqualTo(String value) {
            addCriterion("err_type <>", value, "err_type");
            return (Criteria) this;
        }

        public Criteria andErr_typeGreaterThan(String value) {
            addCriterion("err_type >", value, "err_type");
            return (Criteria) this;
        }

        public Criteria andErr_typeGreaterThanOrEqualTo(String value) {
            addCriterion("err_type >=", value, "err_type");
            return (Criteria) this;
        }

        public Criteria andErr_typeLessThan(String value) {
            addCriterion("err_type <", value, "err_type");
            return (Criteria) this;
        }

        public Criteria andErr_typeLessThanOrEqualTo(String value) {
            addCriterion("err_type <=", value, "err_type");
            return (Criteria) this;
        }

        public Criteria andErr_typeLike(String value) {
            addCriterion("err_type like", value, "err_type");
            return (Criteria) this;
        }

        public Criteria andErr_typeNotLike(String value) {
            addCriterion("err_type not like", value, "err_type");
            return (Criteria) this;
        }

        public Criteria andErr_typeIn(List<String> values) {
            addCriterion("err_type in", values, "err_type");
            return (Criteria) this;
        }

        public Criteria andErr_typeNotIn(List<String> values) {
            addCriterion("err_type not in", values, "err_type");
            return (Criteria) this;
        }

        public Criteria andErr_typeBetween(String value1, String value2) {
            addCriterion("err_type between", value1, value2, "err_type");
            return (Criteria) this;
        }

        public Criteria andErr_typeNotBetween(String value1, String value2) {
            addCriterion("err_type not between", value1, value2, "err_type");
            return (Criteria) this;
        }

        public Criteria andHandle_statusIsNull() {
            addCriterion("handle_status is null");
            return (Criteria) this;
        }

        public Criteria andHandle_statusIsNotNull() {
            addCriterion("handle_status is not null");
            return (Criteria) this;
        }

        public Criteria andHandle_statusEqualTo(String value) {
            addCriterion("handle_status =", value, "handle_status");
            return (Criteria) this;
        }

        public Criteria andHandle_statusNotEqualTo(String value) {
            addCriterion("handle_status <>", value, "handle_status");
            return (Criteria) this;
        }

        public Criteria andHandle_statusGreaterThan(String value) {
            addCriterion("handle_status >", value, "handle_status");
            return (Criteria) this;
        }

        public Criteria andHandle_statusGreaterThanOrEqualTo(String value) {
            addCriterion("handle_status >=", value, "handle_status");
            return (Criteria) this;
        }

        public Criteria andHandle_statusLessThan(String value) {
            addCriterion("handle_status <", value, "handle_status");
            return (Criteria) this;
        }

        public Criteria andHandle_statusLessThanOrEqualTo(String value) {
            addCriterion("handle_status <=", value, "handle_status");
            return (Criteria) this;
        }

        public Criteria andHandle_statusLike(String value) {
            addCriterion("handle_status like", value, "handle_status");
            return (Criteria) this;
        }

        public Criteria andHandle_statusNotLike(String value) {
            addCriterion("handle_status not like", value, "handle_status");
            return (Criteria) this;
        }

        public Criteria andHandle_statusIn(List<String> values) {
            addCriterion("handle_status in", values, "handle_status");
            return (Criteria) this;
        }

        public Criteria andHandle_statusNotIn(List<String> values) {
            addCriterion("handle_status not in", values, "handle_status");
            return (Criteria) this;
        }

        public Criteria andHandle_statusBetween(String value1, String value2) {
            addCriterion("handle_status between", value1, value2, "handle_status");
            return (Criteria) this;
        }

        public Criteria andHandle_statusNotBetween(String value1, String value2) {
            addCriterion("handle_status not between", value1, value2, "handle_status");
            return (Criteria) this;
        }

        public Criteria andHandle_valueIsNull() {
            addCriterion("handle_value is null");
            return (Criteria) this;
        }

        public Criteria andHandle_valueIsNotNull() {
            addCriterion("handle_value is not null");
            return (Criteria) this;
        }

        public Criteria andHandle_valueEqualTo(String value) {
            addCriterion("handle_value =", value, "handle_value");
            return (Criteria) this;
        }

        public Criteria andHandle_valueNotEqualTo(String value) {
            addCriterion("handle_value <>", value, "handle_value");
            return (Criteria) this;
        }

        public Criteria andHandle_valueGreaterThan(String value) {
            addCriterion("handle_value >", value, "handle_value");
            return (Criteria) this;
        }

        public Criteria andHandle_valueGreaterThanOrEqualTo(String value) {
            addCriterion("handle_value >=", value, "handle_value");
            return (Criteria) this;
        }

        public Criteria andHandle_valueLessThan(String value) {
            addCriterion("handle_value <", value, "handle_value");
            return (Criteria) this;
        }

        public Criteria andHandle_valueLessThanOrEqualTo(String value) {
            addCriterion("handle_value <=", value, "handle_value");
            return (Criteria) this;
        }

        public Criteria andHandle_valueLike(String value) {
            addCriterion("handle_value like", value, "handle_value");
            return (Criteria) this;
        }

        public Criteria andHandle_valueNotLike(String value) {
            addCriterion("handle_value not like", value, "handle_value");
            return (Criteria) this;
        }

        public Criteria andHandle_valueIn(List<String> values) {
            addCriterion("handle_value in", values, "handle_value");
            return (Criteria) this;
        }

        public Criteria andHandle_valueNotIn(List<String> values) {
            addCriterion("handle_value not in", values, "handle_value");
            return (Criteria) this;
        }

        public Criteria andHandle_valueBetween(String value1, String value2) {
            addCriterion("handle_value between", value1, value2, "handle_value");
            return (Criteria) this;
        }

        public Criteria andHandle_valueNotBetween(String value1, String value2) {
            addCriterion("handle_value not between", value1, value2, "handle_value");
            return (Criteria) this;
        }

        public Criteria andHandle_remarkIsNull() {
            addCriterion("handle_remark is null");
            return (Criteria) this;
        }

        public Criteria andHandle_remarkIsNotNull() {
            addCriterion("handle_remark is not null");
            return (Criteria) this;
        }

        public Criteria andHandle_remarkEqualTo(String value) {
            addCriterion("handle_remark =", value, "handle_remark");
            return (Criteria) this;
        }

        public Criteria andHandle_remarkNotEqualTo(String value) {
            addCriterion("handle_remark <>", value, "handle_remark");
            return (Criteria) this;
        }

        public Criteria andHandle_remarkGreaterThan(String value) {
            addCriterion("handle_remark >", value, "handle_remark");
            return (Criteria) this;
        }

        public Criteria andHandle_remarkGreaterThanOrEqualTo(String value) {
            addCriterion("handle_remark >=", value, "handle_remark");
            return (Criteria) this;
        }

        public Criteria andHandle_remarkLessThan(String value) {
            addCriterion("handle_remark <", value, "handle_remark");
            return (Criteria) this;
        }

        public Criteria andHandle_remarkLessThanOrEqualTo(String value) {
            addCriterion("handle_remark <=", value, "handle_remark");
            return (Criteria) this;
        }

        public Criteria andHandle_remarkLike(String value) {
            addCriterion("handle_remark like", value, "handle_remark");
            return (Criteria) this;
        }

        public Criteria andHandle_remarkNotLike(String value) {
            addCriterion("handle_remark not like", value, "handle_remark");
            return (Criteria) this;
        }

        public Criteria andHandle_remarkIn(List<String> values) {
            addCriterion("handle_remark in", values, "handle_remark");
            return (Criteria) this;
        }

        public Criteria andHandle_remarkNotIn(List<String> values) {
            addCriterion("handle_remark not in", values, "handle_remark");
            return (Criteria) this;
        }

        public Criteria andHandle_remarkBetween(String value1, String value2) {
            addCriterion("handle_remark between", value1, value2, "handle_remark");
            return (Criteria) this;
        }

        public Criteria andHandle_remarkNotBetween(String value1, String value2) {
            addCriterion("handle_remark not between", value1, value2, "handle_remark");
            return (Criteria) this;
        }

        public Criteria andOperator_nameIsNull() {
            addCriterion("operator_name is null");
            return (Criteria) this;
        }

        public Criteria andOperator_nameIsNotNull() {
            addCriterion("operator_name is not null");
            return (Criteria) this;
        }

        public Criteria andOperator_nameEqualTo(String value) {
            addCriterion("operator_name =", value, "operator_name");
            return (Criteria) this;
        }

        public Criteria andOperator_nameNotEqualTo(String value) {
            addCriterion("operator_name <>", value, "operator_name");
            return (Criteria) this;
        }

        public Criteria andOperator_nameGreaterThan(String value) {
            addCriterion("operator_name >", value, "operator_name");
            return (Criteria) this;
        }

        public Criteria andOperator_nameGreaterThanOrEqualTo(String value) {
            addCriterion("operator_name >=", value, "operator_name");
            return (Criteria) this;
        }

        public Criteria andOperator_nameLessThan(String value) {
            addCriterion("operator_name <", value, "operator_name");
            return (Criteria) this;
        }

        public Criteria andOperator_nameLessThanOrEqualTo(String value) {
            addCriterion("operator_name <=", value, "operator_name");
            return (Criteria) this;
        }

        public Criteria andOperator_nameLike(String value) {
            addCriterion("operator_name like", value, "operator_name");
            return (Criteria) this;
        }

        public Criteria andOperator_nameNotLike(String value) {
            addCriterion("operator_name not like", value, "operator_name");
            return (Criteria) this;
        }

        public Criteria andOperator_nameIn(List<String> values) {
            addCriterion("operator_name in", values, "operator_name");
            return (Criteria) this;
        }

        public Criteria andOperator_nameNotIn(List<String> values) {
            addCriterion("operator_name not in", values, "operator_name");
            return (Criteria) this;
        }

        public Criteria andOperator_nameBetween(String value1, String value2) {
            addCriterion("operator_name between", value1, value2, "operator_name");
            return (Criteria) this;
        }

        public Criteria andOperator_nameNotBetween(String value1, String value2) {
            addCriterion("operator_name not between", value1, value2, "operator_name");
            return (Criteria) this;
        }

        public Criteria andOperator_account_noIsNull() {
            addCriterion("operator_account_no is null");
            return (Criteria) this;
        }

        public Criteria andOperator_account_noIsNotNull() {
            addCriterion("operator_account_no is not null");
            return (Criteria) this;
        }

        public Criteria andOperator_account_noEqualTo(String value) {
            addCriterion("operator_account_no =", value, "operator_account_no");
            return (Criteria) this;
        }

        public Criteria andOperator_account_noNotEqualTo(String value) {
            addCriterion("operator_account_no <>", value, "operator_account_no");
            return (Criteria) this;
        }

        public Criteria andOperator_account_noGreaterThan(String value) {
            addCriterion("operator_account_no >", value, "operator_account_no");
            return (Criteria) this;
        }

        public Criteria andOperator_account_noGreaterThanOrEqualTo(String value) {
            addCriterion("operator_account_no >=", value, "operator_account_no");
            return (Criteria) this;
        }

        public Criteria andOperator_account_noLessThan(String value) {
            addCriterion("operator_account_no <", value, "operator_account_no");
            return (Criteria) this;
        }

        public Criteria andOperator_account_noLessThanOrEqualTo(String value) {
            addCriterion("operator_account_no <=", value, "operator_account_no");
            return (Criteria) this;
        }

        public Criteria andOperator_account_noLike(String value) {
            addCriterion("operator_account_no like", value, "operator_account_no");
            return (Criteria) this;
        }

        public Criteria andOperator_account_noNotLike(String value) {
            addCriterion("operator_account_no not like", value, "operator_account_no");
            return (Criteria) this;
        }

        public Criteria andOperator_account_noIn(List<String> values) {
            addCriterion("operator_account_no in", values, "operator_account_no");
            return (Criteria) this;
        }

        public Criteria andOperator_account_noNotIn(List<String> values) {
            addCriterion("operator_account_no not in", values, "operator_account_no");
            return (Criteria) this;
        }

        public Criteria andOperator_account_noBetween(String value1, String value2) {
            addCriterion("operator_account_no between", value1, value2, "operator_account_no");
            return (Criteria) this;
        }

        public Criteria andOperator_account_noNotBetween(String value1, String value2) {
            addCriterion("operator_account_no not between", value1, value2, "operator_account_no");
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