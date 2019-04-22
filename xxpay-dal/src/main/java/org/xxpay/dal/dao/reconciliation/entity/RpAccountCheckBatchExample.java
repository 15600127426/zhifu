package org.xxpay.dal.dao.reconciliation.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class RpAccountCheckBatchExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    private Integer limit;

    private Integer offset;

    public RpAccountCheckBatchExample() {
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

        public Criteria andBatch_noIsNull() {
            addCriterion("batch_no is null");
            return (Criteria) this;
        }

        public Criteria andBatch_noIsNotNull() {
            addCriterion("batch_no is not null");
            return (Criteria) this;
        }

        public Criteria andBatch_noEqualTo(String value) {
            addCriterion("batch_no =", value, "batch_no");
            return (Criteria) this;
        }

        public Criteria andBatch_noNotEqualTo(String value) {
            addCriterion("batch_no <>", value, "batch_no");
            return (Criteria) this;
        }

        public Criteria andBatch_noGreaterThan(String value) {
            addCriterion("batch_no >", value, "batch_no");
            return (Criteria) this;
        }

        public Criteria andBatch_noGreaterThanOrEqualTo(String value) {
            addCriterion("batch_no >=", value, "batch_no");
            return (Criteria) this;
        }

        public Criteria andBatch_noLessThan(String value) {
            addCriterion("batch_no <", value, "batch_no");
            return (Criteria) this;
        }

        public Criteria andBatch_noLessThanOrEqualTo(String value) {
            addCriterion("batch_no <=", value, "batch_no");
            return (Criteria) this;
        }

        public Criteria andBatch_noLike(String value) {
            addCriterion("batch_no like", value, "batch_no");
            return (Criteria) this;
        }

        public Criteria andBatch_noNotLike(String value) {
            addCriterion("batch_no not like", value, "batch_no");
            return (Criteria) this;
        }

        public Criteria andBatch_noIn(List<String> values) {
            addCriterion("batch_no in", values, "batch_no");
            return (Criteria) this;
        }

        public Criteria andBatch_noNotIn(List<String> values) {
            addCriterion("batch_no not in", values, "batch_no");
            return (Criteria) this;
        }

        public Criteria andBatch_noBetween(String value1, String value2) {
            addCriterion("batch_no between", value1, value2, "batch_no");
            return (Criteria) this;
        }

        public Criteria andBatch_noNotBetween(String value1, String value2) {
            addCriterion("batch_no not between", value1, value2, "batch_no");
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

        public Criteria andBill_typeIsNull() {
            addCriterion("bill_type is null");
            return (Criteria) this;
        }

        public Criteria andBill_typeIsNotNull() {
            addCriterion("bill_type is not null");
            return (Criteria) this;
        }

        public Criteria andBill_typeEqualTo(String value) {
            addCriterion("bill_type =", value, "bill_type");
            return (Criteria) this;
        }

        public Criteria andBill_typeNotEqualTo(String value) {
            addCriterion("bill_type <>", value, "bill_type");
            return (Criteria) this;
        }

        public Criteria andBill_typeGreaterThan(String value) {
            addCriterion("bill_type >", value, "bill_type");
            return (Criteria) this;
        }

        public Criteria andBill_typeGreaterThanOrEqualTo(String value) {
            addCriterion("bill_type >=", value, "bill_type");
            return (Criteria) this;
        }

        public Criteria andBill_typeLessThan(String value) {
            addCriterion("bill_type <", value, "bill_type");
            return (Criteria) this;
        }

        public Criteria andBill_typeLessThanOrEqualTo(String value) {
            addCriterion("bill_type <=", value, "bill_type");
            return (Criteria) this;
        }

        public Criteria andBill_typeLike(String value) {
            addCriterion("bill_type like", value, "bill_type");
            return (Criteria) this;
        }

        public Criteria andBill_typeNotLike(String value) {
            addCriterion("bill_type not like", value, "bill_type");
            return (Criteria) this;
        }

        public Criteria andBill_typeIn(List<String> values) {
            addCriterion("bill_type in", values, "bill_type");
            return (Criteria) this;
        }

        public Criteria andBill_typeNotIn(List<String> values) {
            addCriterion("bill_type not in", values, "bill_type");
            return (Criteria) this;
        }

        public Criteria andBill_typeBetween(String value1, String value2) {
            addCriterion("bill_type between", value1, value2, "bill_type");
            return (Criteria) this;
        }

        public Criteria andBill_typeNotBetween(String value1, String value2) {
            addCriterion("bill_type not between", value1, value2, "bill_type");
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

        public Criteria andMistake_countIsNull() {
            addCriterion("mistake_count is null");
            return (Criteria) this;
        }

        public Criteria andMistake_countIsNotNull() {
            addCriterion("mistake_count is not null");
            return (Criteria) this;
        }

        public Criteria andMistake_countEqualTo(Integer value) {
            addCriterion("mistake_count =", value, "mistake_count");
            return (Criteria) this;
        }

        public Criteria andMistake_countNotEqualTo(Integer value) {
            addCriterion("mistake_count <>", value, "mistake_count");
            return (Criteria) this;
        }

        public Criteria andMistake_countGreaterThan(Integer value) {
            addCriterion("mistake_count >", value, "mistake_count");
            return (Criteria) this;
        }

        public Criteria andMistake_countGreaterThanOrEqualTo(Integer value) {
            addCriterion("mistake_count >=", value, "mistake_count");
            return (Criteria) this;
        }

        public Criteria andMistake_countLessThan(Integer value) {
            addCriterion("mistake_count <", value, "mistake_count");
            return (Criteria) this;
        }

        public Criteria andMistake_countLessThanOrEqualTo(Integer value) {
            addCriterion("mistake_count <=", value, "mistake_count");
            return (Criteria) this;
        }

        public Criteria andMistake_countIn(List<Integer> values) {
            addCriterion("mistake_count in", values, "mistake_count");
            return (Criteria) this;
        }

        public Criteria andMistake_countNotIn(List<Integer> values) {
            addCriterion("mistake_count not in", values, "mistake_count");
            return (Criteria) this;
        }

        public Criteria andMistake_countBetween(Integer value1, Integer value2) {
            addCriterion("mistake_count between", value1, value2, "mistake_count");
            return (Criteria) this;
        }

        public Criteria andMistake_countNotBetween(Integer value1, Integer value2) {
            addCriterion("mistake_count not between", value1, value2, "mistake_count");
            return (Criteria) this;
        }

        public Criteria andUnhandle_mistake_countIsNull() {
            addCriterion("unhandle_mistake_count is null");
            return (Criteria) this;
        }

        public Criteria andUnhandle_mistake_countIsNotNull() {
            addCriterion("unhandle_mistake_count is not null");
            return (Criteria) this;
        }

        public Criteria andUnhandle_mistake_countEqualTo(Integer value) {
            addCriterion("unhandle_mistake_count =", value, "unhandle_mistake_count");
            return (Criteria) this;
        }

        public Criteria andUnhandle_mistake_countNotEqualTo(Integer value) {
            addCriterion("unhandle_mistake_count <>", value, "unhandle_mistake_count");
            return (Criteria) this;
        }

        public Criteria andUnhandle_mistake_countGreaterThan(Integer value) {
            addCriterion("unhandle_mistake_count >", value, "unhandle_mistake_count");
            return (Criteria) this;
        }

        public Criteria andUnhandle_mistake_countGreaterThanOrEqualTo(Integer value) {
            addCriterion("unhandle_mistake_count >=", value, "unhandle_mistake_count");
            return (Criteria) this;
        }

        public Criteria andUnhandle_mistake_countLessThan(Integer value) {
            addCriterion("unhandle_mistake_count <", value, "unhandle_mistake_count");
            return (Criteria) this;
        }

        public Criteria andUnhandle_mistake_countLessThanOrEqualTo(Integer value) {
            addCriterion("unhandle_mistake_count <=", value, "unhandle_mistake_count");
            return (Criteria) this;
        }

        public Criteria andUnhandle_mistake_countIn(List<Integer> values) {
            addCriterion("unhandle_mistake_count in", values, "unhandle_mistake_count");
            return (Criteria) this;
        }

        public Criteria andUnhandle_mistake_countNotIn(List<Integer> values) {
            addCriterion("unhandle_mistake_count not in", values, "unhandle_mistake_count");
            return (Criteria) this;
        }

        public Criteria andUnhandle_mistake_countBetween(Integer value1, Integer value2) {
            addCriterion("unhandle_mistake_count between", value1, value2, "unhandle_mistake_count");
            return (Criteria) this;
        }

        public Criteria andUnhandle_mistake_countNotBetween(Integer value1, Integer value2) {
            addCriterion("unhandle_mistake_count not between", value1, value2, "unhandle_mistake_count");
            return (Criteria) this;
        }

        public Criteria andTrade_countIsNull() {
            addCriterion("trade_count is null");
            return (Criteria) this;
        }

        public Criteria andTrade_countIsNotNull() {
            addCriterion("trade_count is not null");
            return (Criteria) this;
        }

        public Criteria andTrade_countEqualTo(Integer value) {
            addCriterion("trade_count =", value, "trade_count");
            return (Criteria) this;
        }

        public Criteria andTrade_countNotEqualTo(Integer value) {
            addCriterion("trade_count <>", value, "trade_count");
            return (Criteria) this;
        }

        public Criteria andTrade_countGreaterThan(Integer value) {
            addCriterion("trade_count >", value, "trade_count");
            return (Criteria) this;
        }

        public Criteria andTrade_countGreaterThanOrEqualTo(Integer value) {
            addCriterion("trade_count >=", value, "trade_count");
            return (Criteria) this;
        }

        public Criteria andTrade_countLessThan(Integer value) {
            addCriterion("trade_count <", value, "trade_count");
            return (Criteria) this;
        }

        public Criteria andTrade_countLessThanOrEqualTo(Integer value) {
            addCriterion("trade_count <=", value, "trade_count");
            return (Criteria) this;
        }

        public Criteria andTrade_countIn(List<Integer> values) {
            addCriterion("trade_count in", values, "trade_count");
            return (Criteria) this;
        }

        public Criteria andTrade_countNotIn(List<Integer> values) {
            addCriterion("trade_count not in", values, "trade_count");
            return (Criteria) this;
        }

        public Criteria andTrade_countBetween(Integer value1, Integer value2) {
            addCriterion("trade_count between", value1, value2, "trade_count");
            return (Criteria) this;
        }

        public Criteria andTrade_countNotBetween(Integer value1, Integer value2) {
            addCriterion("trade_count not between", value1, value2, "trade_count");
            return (Criteria) this;
        }

        public Criteria andBank_trade_countIsNull() {
            addCriterion("bank_trade_count is null");
            return (Criteria) this;
        }

        public Criteria andBank_trade_countIsNotNull() {
            addCriterion("bank_trade_count is not null");
            return (Criteria) this;
        }

        public Criteria andBank_trade_countEqualTo(Integer value) {
            addCriterion("bank_trade_count =", value, "bank_trade_count");
            return (Criteria) this;
        }

        public Criteria andBank_trade_countNotEqualTo(Integer value) {
            addCriterion("bank_trade_count <>", value, "bank_trade_count");
            return (Criteria) this;
        }

        public Criteria andBank_trade_countGreaterThan(Integer value) {
            addCriterion("bank_trade_count >", value, "bank_trade_count");
            return (Criteria) this;
        }

        public Criteria andBank_trade_countGreaterThanOrEqualTo(Integer value) {
            addCriterion("bank_trade_count >=", value, "bank_trade_count");
            return (Criteria) this;
        }

        public Criteria andBank_trade_countLessThan(Integer value) {
            addCriterion("bank_trade_count <", value, "bank_trade_count");
            return (Criteria) this;
        }

        public Criteria andBank_trade_countLessThanOrEqualTo(Integer value) {
            addCriterion("bank_trade_count <=", value, "bank_trade_count");
            return (Criteria) this;
        }

        public Criteria andBank_trade_countIn(List<Integer> values) {
            addCriterion("bank_trade_count in", values, "bank_trade_count");
            return (Criteria) this;
        }

        public Criteria andBank_trade_countNotIn(List<Integer> values) {
            addCriterion("bank_trade_count not in", values, "bank_trade_count");
            return (Criteria) this;
        }

        public Criteria andBank_trade_countBetween(Integer value1, Integer value2) {
            addCriterion("bank_trade_count between", value1, value2, "bank_trade_count");
            return (Criteria) this;
        }

        public Criteria andBank_trade_countNotBetween(Integer value1, Integer value2) {
            addCriterion("bank_trade_count not between", value1, value2, "bank_trade_count");
            return (Criteria) this;
        }

        public Criteria andTrade_amountIsNull() {
            addCriterion("trade_amount is null");
            return (Criteria) this;
        }

        public Criteria andTrade_amountIsNotNull() {
            addCriterion("trade_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTrade_amountEqualTo(BigDecimal value) {
            addCriterion("trade_amount =", value, "trade_amount");
            return (Criteria) this;
        }

        public Criteria andTrade_amountNotEqualTo(BigDecimal value) {
            addCriterion("trade_amount <>", value, "trade_amount");
            return (Criteria) this;
        }

        public Criteria andTrade_amountGreaterThan(BigDecimal value) {
            addCriterion("trade_amount >", value, "trade_amount");
            return (Criteria) this;
        }

        public Criteria andTrade_amountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("trade_amount >=", value, "trade_amount");
            return (Criteria) this;
        }

        public Criteria andTrade_amountLessThan(BigDecimal value) {
            addCriterion("trade_amount <", value, "trade_amount");
            return (Criteria) this;
        }

        public Criteria andTrade_amountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("trade_amount <=", value, "trade_amount");
            return (Criteria) this;
        }

        public Criteria andTrade_amountIn(List<BigDecimal> values) {
            addCriterion("trade_amount in", values, "trade_amount");
            return (Criteria) this;
        }

        public Criteria andTrade_amountNotIn(List<BigDecimal> values) {
            addCriterion("trade_amount not in", values, "trade_amount");
            return (Criteria) this;
        }

        public Criteria andTrade_amountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("trade_amount between", value1, value2, "trade_amount");
            return (Criteria) this;
        }

        public Criteria andTrade_amountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("trade_amount not between", value1, value2, "trade_amount");
            return (Criteria) this;
        }

        public Criteria andBank_trade_amountIsNull() {
            addCriterion("bank_trade_amount is null");
            return (Criteria) this;
        }

        public Criteria andBank_trade_amountIsNotNull() {
            addCriterion("bank_trade_amount is not null");
            return (Criteria) this;
        }

        public Criteria andBank_trade_amountEqualTo(BigDecimal value) {
            addCriterion("bank_trade_amount =", value, "bank_trade_amount");
            return (Criteria) this;
        }

        public Criteria andBank_trade_amountNotEqualTo(BigDecimal value) {
            addCriterion("bank_trade_amount <>", value, "bank_trade_amount");
            return (Criteria) this;
        }

        public Criteria andBank_trade_amountGreaterThan(BigDecimal value) {
            addCriterion("bank_trade_amount >", value, "bank_trade_amount");
            return (Criteria) this;
        }

        public Criteria andBank_trade_amountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("bank_trade_amount >=", value, "bank_trade_amount");
            return (Criteria) this;
        }

        public Criteria andBank_trade_amountLessThan(BigDecimal value) {
            addCriterion("bank_trade_amount <", value, "bank_trade_amount");
            return (Criteria) this;
        }

        public Criteria andBank_trade_amountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("bank_trade_amount <=", value, "bank_trade_amount");
            return (Criteria) this;
        }

        public Criteria andBank_trade_amountIn(List<BigDecimal> values) {
            addCriterion("bank_trade_amount in", values, "bank_trade_amount");
            return (Criteria) this;
        }

        public Criteria andBank_trade_amountNotIn(List<BigDecimal> values) {
            addCriterion("bank_trade_amount not in", values, "bank_trade_amount");
            return (Criteria) this;
        }

        public Criteria andBank_trade_amountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bank_trade_amount between", value1, value2, "bank_trade_amount");
            return (Criteria) this;
        }

        public Criteria andBank_trade_amountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bank_trade_amount not between", value1, value2, "bank_trade_amount");
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

        public Criteria andOrg_check_file_pathIsNull() {
            addCriterion("org_check_file_path is null");
            return (Criteria) this;
        }

        public Criteria andOrg_check_file_pathIsNotNull() {
            addCriterion("org_check_file_path is not null");
            return (Criteria) this;
        }

        public Criteria andOrg_check_file_pathEqualTo(String value) {
            addCriterion("org_check_file_path =", value, "org_check_file_path");
            return (Criteria) this;
        }

        public Criteria andOrg_check_file_pathNotEqualTo(String value) {
            addCriterion("org_check_file_path <>", value, "org_check_file_path");
            return (Criteria) this;
        }

        public Criteria andOrg_check_file_pathGreaterThan(String value) {
            addCriterion("org_check_file_path >", value, "org_check_file_path");
            return (Criteria) this;
        }

        public Criteria andOrg_check_file_pathGreaterThanOrEqualTo(String value) {
            addCriterion("org_check_file_path >=", value, "org_check_file_path");
            return (Criteria) this;
        }

        public Criteria andOrg_check_file_pathLessThan(String value) {
            addCriterion("org_check_file_path <", value, "org_check_file_path");
            return (Criteria) this;
        }

        public Criteria andOrg_check_file_pathLessThanOrEqualTo(String value) {
            addCriterion("org_check_file_path <=", value, "org_check_file_path");
            return (Criteria) this;
        }

        public Criteria andOrg_check_file_pathLike(String value) {
            addCriterion("org_check_file_path like", value, "org_check_file_path");
            return (Criteria) this;
        }

        public Criteria andOrg_check_file_pathNotLike(String value) {
            addCriterion("org_check_file_path not like", value, "org_check_file_path");
            return (Criteria) this;
        }

        public Criteria andOrg_check_file_pathIn(List<String> values) {
            addCriterion("org_check_file_path in", values, "org_check_file_path");
            return (Criteria) this;
        }

        public Criteria andOrg_check_file_pathNotIn(List<String> values) {
            addCriterion("org_check_file_path not in", values, "org_check_file_path");
            return (Criteria) this;
        }

        public Criteria andOrg_check_file_pathBetween(String value1, String value2) {
            addCriterion("org_check_file_path between", value1, value2, "org_check_file_path");
            return (Criteria) this;
        }

        public Criteria andOrg_check_file_pathNotBetween(String value1, String value2) {
            addCriterion("org_check_file_path not between", value1, value2, "org_check_file_path");
            return (Criteria) this;
        }

        public Criteria andRelease_check_file_pathIsNull() {
            addCriterion("release_check_file_path is null");
            return (Criteria) this;
        }

        public Criteria andRelease_check_file_pathIsNotNull() {
            addCriterion("release_check_file_path is not null");
            return (Criteria) this;
        }

        public Criteria andRelease_check_file_pathEqualTo(String value) {
            addCriterion("release_check_file_path =", value, "release_check_file_path");
            return (Criteria) this;
        }

        public Criteria andRelease_check_file_pathNotEqualTo(String value) {
            addCriterion("release_check_file_path <>", value, "release_check_file_path");
            return (Criteria) this;
        }

        public Criteria andRelease_check_file_pathGreaterThan(String value) {
            addCriterion("release_check_file_path >", value, "release_check_file_path");
            return (Criteria) this;
        }

        public Criteria andRelease_check_file_pathGreaterThanOrEqualTo(String value) {
            addCriterion("release_check_file_path >=", value, "release_check_file_path");
            return (Criteria) this;
        }

        public Criteria andRelease_check_file_pathLessThan(String value) {
            addCriterion("release_check_file_path <", value, "release_check_file_path");
            return (Criteria) this;
        }

        public Criteria andRelease_check_file_pathLessThanOrEqualTo(String value) {
            addCriterion("release_check_file_path <=", value, "release_check_file_path");
            return (Criteria) this;
        }

        public Criteria andRelease_check_file_pathLike(String value) {
            addCriterion("release_check_file_path like", value, "release_check_file_path");
            return (Criteria) this;
        }

        public Criteria andRelease_check_file_pathNotLike(String value) {
            addCriterion("release_check_file_path not like", value, "release_check_file_path");
            return (Criteria) this;
        }

        public Criteria andRelease_check_file_pathIn(List<String> values) {
            addCriterion("release_check_file_path in", values, "release_check_file_path");
            return (Criteria) this;
        }

        public Criteria andRelease_check_file_pathNotIn(List<String> values) {
            addCriterion("release_check_file_path not in", values, "release_check_file_path");
            return (Criteria) this;
        }

        public Criteria andRelease_check_file_pathBetween(String value1, String value2) {
            addCriterion("release_check_file_path between", value1, value2, "release_check_file_path");
            return (Criteria) this;
        }

        public Criteria andRelease_check_file_pathNotBetween(String value1, String value2) {
            addCriterion("release_check_file_path not between", value1, value2, "release_check_file_path");
            return (Criteria) this;
        }

        public Criteria andRelease_statusIsNull() {
            addCriterion("release_status is null");
            return (Criteria) this;
        }

        public Criteria andRelease_statusIsNotNull() {
            addCriterion("release_status is not null");
            return (Criteria) this;
        }

        public Criteria andRelease_statusEqualTo(String value) {
            addCriterion("release_status =", value, "release_status");
            return (Criteria) this;
        }

        public Criteria andRelease_statusNotEqualTo(String value) {
            addCriterion("release_status <>", value, "release_status");
            return (Criteria) this;
        }

        public Criteria andRelease_statusGreaterThan(String value) {
            addCriterion("release_status >", value, "release_status");
            return (Criteria) this;
        }

        public Criteria andRelease_statusGreaterThanOrEqualTo(String value) {
            addCriterion("release_status >=", value, "release_status");
            return (Criteria) this;
        }

        public Criteria andRelease_statusLessThan(String value) {
            addCriterion("release_status <", value, "release_status");
            return (Criteria) this;
        }

        public Criteria andRelease_statusLessThanOrEqualTo(String value) {
            addCriterion("release_status <=", value, "release_status");
            return (Criteria) this;
        }

        public Criteria andRelease_statusLike(String value) {
            addCriterion("release_status like", value, "release_status");
            return (Criteria) this;
        }

        public Criteria andRelease_statusNotLike(String value) {
            addCriterion("release_status not like", value, "release_status");
            return (Criteria) this;
        }

        public Criteria andRelease_statusIn(List<String> values) {
            addCriterion("release_status in", values, "release_status");
            return (Criteria) this;
        }

        public Criteria andRelease_statusNotIn(List<String> values) {
            addCriterion("release_status not in", values, "release_status");
            return (Criteria) this;
        }

        public Criteria andRelease_statusBetween(String value1, String value2) {
            addCriterion("release_status between", value1, value2, "release_status");
            return (Criteria) this;
        }

        public Criteria andRelease_statusNotBetween(String value1, String value2) {
            addCriterion("release_status not between", value1, value2, "release_status");
            return (Criteria) this;
        }

        public Criteria andCheck_fail_msgIsNull() {
            addCriterion("check_fail_msg is null");
            return (Criteria) this;
        }

        public Criteria andCheck_fail_msgIsNotNull() {
            addCriterion("check_fail_msg is not null");
            return (Criteria) this;
        }

        public Criteria andCheck_fail_msgEqualTo(String value) {
            addCriterion("check_fail_msg =", value, "check_fail_msg");
            return (Criteria) this;
        }

        public Criteria andCheck_fail_msgNotEqualTo(String value) {
            addCriterion("check_fail_msg <>", value, "check_fail_msg");
            return (Criteria) this;
        }

        public Criteria andCheck_fail_msgGreaterThan(String value) {
            addCriterion("check_fail_msg >", value, "check_fail_msg");
            return (Criteria) this;
        }

        public Criteria andCheck_fail_msgGreaterThanOrEqualTo(String value) {
            addCriterion("check_fail_msg >=", value, "check_fail_msg");
            return (Criteria) this;
        }

        public Criteria andCheck_fail_msgLessThan(String value) {
            addCriterion("check_fail_msg <", value, "check_fail_msg");
            return (Criteria) this;
        }

        public Criteria andCheck_fail_msgLessThanOrEqualTo(String value) {
            addCriterion("check_fail_msg <=", value, "check_fail_msg");
            return (Criteria) this;
        }

        public Criteria andCheck_fail_msgLike(String value) {
            addCriterion("check_fail_msg like", value, "check_fail_msg");
            return (Criteria) this;
        }

        public Criteria andCheck_fail_msgNotLike(String value) {
            addCriterion("check_fail_msg not like", value, "check_fail_msg");
            return (Criteria) this;
        }

        public Criteria andCheck_fail_msgIn(List<String> values) {
            addCriterion("check_fail_msg in", values, "check_fail_msg");
            return (Criteria) this;
        }

        public Criteria andCheck_fail_msgNotIn(List<String> values) {
            addCriterion("check_fail_msg not in", values, "check_fail_msg");
            return (Criteria) this;
        }

        public Criteria andCheck_fail_msgBetween(String value1, String value2) {
            addCriterion("check_fail_msg between", value1, value2, "check_fail_msg");
            return (Criteria) this;
        }

        public Criteria andCheck_fail_msgNotBetween(String value1, String value2) {
            addCriterion("check_fail_msg not between", value1, value2, "check_fail_msg");
            return (Criteria) this;
        }

        public Criteria andBank_err_msgIsNull() {
            addCriterion("bank_err_msg is null");
            return (Criteria) this;
        }

        public Criteria andBank_err_msgIsNotNull() {
            addCriterion("bank_err_msg is not null");
            return (Criteria) this;
        }

        public Criteria andBank_err_msgEqualTo(String value) {
            addCriterion("bank_err_msg =", value, "bank_err_msg");
            return (Criteria) this;
        }

        public Criteria andBank_err_msgNotEqualTo(String value) {
            addCriterion("bank_err_msg <>", value, "bank_err_msg");
            return (Criteria) this;
        }

        public Criteria andBank_err_msgGreaterThan(String value) {
            addCriterion("bank_err_msg >", value, "bank_err_msg");
            return (Criteria) this;
        }

        public Criteria andBank_err_msgGreaterThanOrEqualTo(String value) {
            addCriterion("bank_err_msg >=", value, "bank_err_msg");
            return (Criteria) this;
        }

        public Criteria andBank_err_msgLessThan(String value) {
            addCriterion("bank_err_msg <", value, "bank_err_msg");
            return (Criteria) this;
        }

        public Criteria andBank_err_msgLessThanOrEqualTo(String value) {
            addCriterion("bank_err_msg <=", value, "bank_err_msg");
            return (Criteria) this;
        }

        public Criteria andBank_err_msgLike(String value) {
            addCriterion("bank_err_msg like", value, "bank_err_msg");
            return (Criteria) this;
        }

        public Criteria andBank_err_msgNotLike(String value) {
            addCriterion("bank_err_msg not like", value, "bank_err_msg");
            return (Criteria) this;
        }

        public Criteria andBank_err_msgIn(List<String> values) {
            addCriterion("bank_err_msg in", values, "bank_err_msg");
            return (Criteria) this;
        }

        public Criteria andBank_err_msgNotIn(List<String> values) {
            addCriterion("bank_err_msg not in", values, "bank_err_msg");
            return (Criteria) this;
        }

        public Criteria andBank_err_msgBetween(String value1, String value2) {
            addCriterion("bank_err_msg between", value1, value2, "bank_err_msg");
            return (Criteria) this;
        }

        public Criteria andBank_err_msgNotBetween(String value1, String value2) {
            addCriterion("bank_err_msg not between", value1, value2, "bank_err_msg");
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