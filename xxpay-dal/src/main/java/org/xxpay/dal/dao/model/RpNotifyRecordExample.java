package org.xxpay.dal.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RpNotifyRecordExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    private Integer limit;

    private Integer offset;

    public RpNotifyRecordExample() {
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

        public Criteria andNotify_timesIsNull() {
            addCriterion("notify_times is null");
            return (Criteria) this;
        }

        public Criteria andNotify_timesIsNotNull() {
            addCriterion("notify_times is not null");
            return (Criteria) this;
        }

        public Criteria andNotify_timesEqualTo(Integer value) {
            addCriterion("notify_times =", value, "notify_times");
            return (Criteria) this;
        }

        public Criteria andNotify_timesNotEqualTo(Integer value) {
            addCriterion("notify_times <>", value, "notify_times");
            return (Criteria) this;
        }

        public Criteria andNotify_timesGreaterThan(Integer value) {
            addCriterion("notify_times >", value, "notify_times");
            return (Criteria) this;
        }

        public Criteria andNotify_timesGreaterThanOrEqualTo(Integer value) {
            addCriterion("notify_times >=", value, "notify_times");
            return (Criteria) this;
        }

        public Criteria andNotify_timesLessThan(Integer value) {
            addCriterion("notify_times <", value, "notify_times");
            return (Criteria) this;
        }

        public Criteria andNotify_timesLessThanOrEqualTo(Integer value) {
            addCriterion("notify_times <=", value, "notify_times");
            return (Criteria) this;
        }

        public Criteria andNotify_timesIn(List<Integer> values) {
            addCriterion("notify_times in", values, "notify_times");
            return (Criteria) this;
        }

        public Criteria andNotify_timesNotIn(List<Integer> values) {
            addCriterion("notify_times not in", values, "notify_times");
            return (Criteria) this;
        }

        public Criteria andNotify_timesBetween(Integer value1, Integer value2) {
            addCriterion("notify_times between", value1, value2, "notify_times");
            return (Criteria) this;
        }

        public Criteria andNotify_timesNotBetween(Integer value1, Integer value2) {
            addCriterion("notify_times not between", value1, value2, "notify_times");
            return (Criteria) this;
        }

        public Criteria andLimit_notify_timesIsNull() {
            addCriterion("limit_notify_times is null");
            return (Criteria) this;
        }

        public Criteria andLimit_notify_timesIsNotNull() {
            addCriterion("limit_notify_times is not null");
            return (Criteria) this;
        }

        public Criteria andLimit_notify_timesEqualTo(Integer value) {
            addCriterion("limit_notify_times =", value, "limit_notify_times");
            return (Criteria) this;
        }

        public Criteria andLimit_notify_timesNotEqualTo(Integer value) {
            addCriterion("limit_notify_times <>", value, "limit_notify_times");
            return (Criteria) this;
        }

        public Criteria andLimit_notify_timesGreaterThan(Integer value) {
            addCriterion("limit_notify_times >", value, "limit_notify_times");
            return (Criteria) this;
        }

        public Criteria andLimit_notify_timesGreaterThanOrEqualTo(Integer value) {
            addCriterion("limit_notify_times >=", value, "limit_notify_times");
            return (Criteria) this;
        }

        public Criteria andLimit_notify_timesLessThan(Integer value) {
            addCriterion("limit_notify_times <", value, "limit_notify_times");
            return (Criteria) this;
        }

        public Criteria andLimit_notify_timesLessThanOrEqualTo(Integer value) {
            addCriterion("limit_notify_times <=", value, "limit_notify_times");
            return (Criteria) this;
        }

        public Criteria andLimit_notify_timesIn(List<Integer> values) {
            addCriterion("limit_notify_times in", values, "limit_notify_times");
            return (Criteria) this;
        }

        public Criteria andLimit_notify_timesNotIn(List<Integer> values) {
            addCriterion("limit_notify_times not in", values, "limit_notify_times");
            return (Criteria) this;
        }

        public Criteria andLimit_notify_timesBetween(Integer value1, Integer value2) {
            addCriterion("limit_notify_times between", value1, value2, "limit_notify_times");
            return (Criteria) this;
        }

        public Criteria andLimit_notify_timesNotBetween(Integer value1, Integer value2) {
            addCriterion("limit_notify_times not between", value1, value2, "limit_notify_times");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andMerchant_order_noIsNull() {
            addCriterion("merchant_order_no is null");
            return (Criteria) this;
        }

        public Criteria andMerchant_order_noIsNotNull() {
            addCriterion("merchant_order_no is not null");
            return (Criteria) this;
        }

        public Criteria andMerchant_order_noEqualTo(String value) {
            addCriterion("merchant_order_no =", value, "merchant_order_no");
            return (Criteria) this;
        }

        public Criteria andMerchant_order_noNotEqualTo(String value) {
            addCriterion("merchant_order_no <>", value, "merchant_order_no");
            return (Criteria) this;
        }

        public Criteria andMerchant_order_noGreaterThan(String value) {
            addCriterion("merchant_order_no >", value, "merchant_order_no");
            return (Criteria) this;
        }

        public Criteria andMerchant_order_noGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_order_no >=", value, "merchant_order_no");
            return (Criteria) this;
        }

        public Criteria andMerchant_order_noLessThan(String value) {
            addCriterion("merchant_order_no <", value, "merchant_order_no");
            return (Criteria) this;
        }

        public Criteria andMerchant_order_noLessThanOrEqualTo(String value) {
            addCriterion("merchant_order_no <=", value, "merchant_order_no");
            return (Criteria) this;
        }

        public Criteria andMerchant_order_noLike(String value) {
            addCriterion("merchant_order_no like", value, "merchant_order_no");
            return (Criteria) this;
        }

        public Criteria andMerchant_order_noNotLike(String value) {
            addCriterion("merchant_order_no not like", value, "merchant_order_no");
            return (Criteria) this;
        }

        public Criteria andMerchant_order_noIn(List<String> values) {
            addCriterion("merchant_order_no in", values, "merchant_order_no");
            return (Criteria) this;
        }

        public Criteria andMerchant_order_noNotIn(List<String> values) {
            addCriterion("merchant_order_no not in", values, "merchant_order_no");
            return (Criteria) this;
        }

        public Criteria andMerchant_order_noBetween(String value1, String value2) {
            addCriterion("merchant_order_no between", value1, value2, "merchant_order_no");
            return (Criteria) this;
        }

        public Criteria andMerchant_order_noNotBetween(String value1, String value2) {
            addCriterion("merchant_order_no not between", value1, value2, "merchant_order_no");
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

        public Criteria andNotify_typeIsNull() {
            addCriterion("notify_type is null");
            return (Criteria) this;
        }

        public Criteria andNotify_typeIsNotNull() {
            addCriterion("notify_type is not null");
            return (Criteria) this;
        }

        public Criteria andNotify_typeEqualTo(String value) {
            addCriterion("notify_type =", value, "notify_type");
            return (Criteria) this;
        }

        public Criteria andNotify_typeNotEqualTo(String value) {
            addCriterion("notify_type <>", value, "notify_type");
            return (Criteria) this;
        }

        public Criteria andNotify_typeGreaterThan(String value) {
            addCriterion("notify_type >", value, "notify_type");
            return (Criteria) this;
        }

        public Criteria andNotify_typeGreaterThanOrEqualTo(String value) {
            addCriterion("notify_type >=", value, "notify_type");
            return (Criteria) this;
        }

        public Criteria andNotify_typeLessThan(String value) {
            addCriterion("notify_type <", value, "notify_type");
            return (Criteria) this;
        }

        public Criteria andNotify_typeLessThanOrEqualTo(String value) {
            addCriterion("notify_type <=", value, "notify_type");
            return (Criteria) this;
        }

        public Criteria andNotify_typeLike(String value) {
            addCriterion("notify_type like", value, "notify_type");
            return (Criteria) this;
        }

        public Criteria andNotify_typeNotLike(String value) {
            addCriterion("notify_type not like", value, "notify_type");
            return (Criteria) this;
        }

        public Criteria andNotify_typeIn(List<String> values) {
            addCriterion("notify_type in", values, "notify_type");
            return (Criteria) this;
        }

        public Criteria andNotify_typeNotIn(List<String> values) {
            addCriterion("notify_type not in", values, "notify_type");
            return (Criteria) this;
        }

        public Criteria andNotify_typeBetween(String value1, String value2) {
            addCriterion("notify_type between", value1, value2, "notify_type");
            return (Criteria) this;
        }

        public Criteria andNotify_typeNotBetween(String value1, String value2) {
            addCriterion("notify_type not between", value1, value2, "notify_type");
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