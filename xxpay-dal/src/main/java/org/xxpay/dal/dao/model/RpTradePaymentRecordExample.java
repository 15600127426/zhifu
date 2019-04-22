package org.xxpay.dal.dao.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RpTradePaymentRecordExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    private Integer limit;

    private Integer offset;

    public RpTradePaymentRecordExample() {
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

        public Criteria andProduct_nameIsNull() {
            addCriterion("product_name is null");
            return (Criteria) this;
        }

        public Criteria andProduct_nameIsNotNull() {
            addCriterion("product_name is not null");
            return (Criteria) this;
        }

        public Criteria andProduct_nameEqualTo(String value) {
            addCriterion("product_name =", value, "product_name");
            return (Criteria) this;
        }

        public Criteria andProduct_nameNotEqualTo(String value) {
            addCriterion("product_name <>", value, "product_name");
            return (Criteria) this;
        }

        public Criteria andProduct_nameGreaterThan(String value) {
            addCriterion("product_name >", value, "product_name");
            return (Criteria) this;
        }

        public Criteria andProduct_nameGreaterThanOrEqualTo(String value) {
            addCriterion("product_name >=", value, "product_name");
            return (Criteria) this;
        }

        public Criteria andProduct_nameLessThan(String value) {
            addCriterion("product_name <", value, "product_name");
            return (Criteria) this;
        }

        public Criteria andProduct_nameLessThanOrEqualTo(String value) {
            addCriterion("product_name <=", value, "product_name");
            return (Criteria) this;
        }

        public Criteria andProduct_nameLike(String value) {
            addCriterion("product_name like", value, "product_name");
            return (Criteria) this;
        }

        public Criteria andProduct_nameNotLike(String value) {
            addCriterion("product_name not like", value, "product_name");
            return (Criteria) this;
        }

        public Criteria andProduct_nameIn(List<String> values) {
            addCriterion("product_name in", values, "product_name");
            return (Criteria) this;
        }

        public Criteria andProduct_nameNotIn(List<String> values) {
            addCriterion("product_name not in", values, "product_name");
            return (Criteria) this;
        }

        public Criteria andProduct_nameBetween(String value1, String value2) {
            addCriterion("product_name between", value1, value2, "product_name");
            return (Criteria) this;
        }

        public Criteria andProduct_nameNotBetween(String value1, String value2) {
            addCriterion("product_name not between", value1, value2, "product_name");
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

        public Criteria andPayer_user_noIsNull() {
            addCriterion("payer_user_no is null");
            return (Criteria) this;
        }

        public Criteria andPayer_user_noIsNotNull() {
            addCriterion("payer_user_no is not null");
            return (Criteria) this;
        }

        public Criteria andPayer_user_noEqualTo(String value) {
            addCriterion("payer_user_no =", value, "payer_user_no");
            return (Criteria) this;
        }

        public Criteria andPayer_user_noNotEqualTo(String value) {
            addCriterion("payer_user_no <>", value, "payer_user_no");
            return (Criteria) this;
        }

        public Criteria andPayer_user_noGreaterThan(String value) {
            addCriterion("payer_user_no >", value, "payer_user_no");
            return (Criteria) this;
        }

        public Criteria andPayer_user_noGreaterThanOrEqualTo(String value) {
            addCriterion("payer_user_no >=", value, "payer_user_no");
            return (Criteria) this;
        }

        public Criteria andPayer_user_noLessThan(String value) {
            addCriterion("payer_user_no <", value, "payer_user_no");
            return (Criteria) this;
        }

        public Criteria andPayer_user_noLessThanOrEqualTo(String value) {
            addCriterion("payer_user_no <=", value, "payer_user_no");
            return (Criteria) this;
        }

        public Criteria andPayer_user_noLike(String value) {
            addCriterion("payer_user_no like", value, "payer_user_no");
            return (Criteria) this;
        }

        public Criteria andPayer_user_noNotLike(String value) {
            addCriterion("payer_user_no not like", value, "payer_user_no");
            return (Criteria) this;
        }

        public Criteria andPayer_user_noIn(List<String> values) {
            addCriterion("payer_user_no in", values, "payer_user_no");
            return (Criteria) this;
        }

        public Criteria andPayer_user_noNotIn(List<String> values) {
            addCriterion("payer_user_no not in", values, "payer_user_no");
            return (Criteria) this;
        }

        public Criteria andPayer_user_noBetween(String value1, String value2) {
            addCriterion("payer_user_no between", value1, value2, "payer_user_no");
            return (Criteria) this;
        }

        public Criteria andPayer_user_noNotBetween(String value1, String value2) {
            addCriterion("payer_user_no not between", value1, value2, "payer_user_no");
            return (Criteria) this;
        }

        public Criteria andPayer_nameIsNull() {
            addCriterion("payer_name is null");
            return (Criteria) this;
        }

        public Criteria andPayer_nameIsNotNull() {
            addCriterion("payer_name is not null");
            return (Criteria) this;
        }

        public Criteria andPayer_nameEqualTo(String value) {
            addCriterion("payer_name =", value, "payer_name");
            return (Criteria) this;
        }

        public Criteria andPayer_nameNotEqualTo(String value) {
            addCriterion("payer_name <>", value, "payer_name");
            return (Criteria) this;
        }

        public Criteria andPayer_nameGreaterThan(String value) {
            addCriterion("payer_name >", value, "payer_name");
            return (Criteria) this;
        }

        public Criteria andPayer_nameGreaterThanOrEqualTo(String value) {
            addCriterion("payer_name >=", value, "payer_name");
            return (Criteria) this;
        }

        public Criteria andPayer_nameLessThan(String value) {
            addCriterion("payer_name <", value, "payer_name");
            return (Criteria) this;
        }

        public Criteria andPayer_nameLessThanOrEqualTo(String value) {
            addCriterion("payer_name <=", value, "payer_name");
            return (Criteria) this;
        }

        public Criteria andPayer_nameLike(String value) {
            addCriterion("payer_name like", value, "payer_name");
            return (Criteria) this;
        }

        public Criteria andPayer_nameNotLike(String value) {
            addCriterion("payer_name not like", value, "payer_name");
            return (Criteria) this;
        }

        public Criteria andPayer_nameIn(List<String> values) {
            addCriterion("payer_name in", values, "payer_name");
            return (Criteria) this;
        }

        public Criteria andPayer_nameNotIn(List<String> values) {
            addCriterion("payer_name not in", values, "payer_name");
            return (Criteria) this;
        }

        public Criteria andPayer_nameBetween(String value1, String value2) {
            addCriterion("payer_name between", value1, value2, "payer_name");
            return (Criteria) this;
        }

        public Criteria andPayer_nameNotBetween(String value1, String value2) {
            addCriterion("payer_name not between", value1, value2, "payer_name");
            return (Criteria) this;
        }

        public Criteria andPayer_pay_amountIsNull() {
            addCriterion("payer_pay_amount is null");
            return (Criteria) this;
        }

        public Criteria andPayer_pay_amountIsNotNull() {
            addCriterion("payer_pay_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPayer_pay_amountEqualTo(BigDecimal value) {
            addCriterion("payer_pay_amount =", value, "payer_pay_amount");
            return (Criteria) this;
        }

        public Criteria andPayer_pay_amountNotEqualTo(BigDecimal value) {
            addCriterion("payer_pay_amount <>", value, "payer_pay_amount");
            return (Criteria) this;
        }

        public Criteria andPayer_pay_amountGreaterThan(BigDecimal value) {
            addCriterion("payer_pay_amount >", value, "payer_pay_amount");
            return (Criteria) this;
        }

        public Criteria andPayer_pay_amountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("payer_pay_amount >=", value, "payer_pay_amount");
            return (Criteria) this;
        }

        public Criteria andPayer_pay_amountLessThan(BigDecimal value) {
            addCriterion("payer_pay_amount <", value, "payer_pay_amount");
            return (Criteria) this;
        }

        public Criteria andPayer_pay_amountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("payer_pay_amount <=", value, "payer_pay_amount");
            return (Criteria) this;
        }

        public Criteria andPayer_pay_amountIn(List<BigDecimal> values) {
            addCriterion("payer_pay_amount in", values, "payer_pay_amount");
            return (Criteria) this;
        }

        public Criteria andPayer_pay_amountNotIn(List<BigDecimal> values) {
            addCriterion("payer_pay_amount not in", values, "payer_pay_amount");
            return (Criteria) this;
        }

        public Criteria andPayer_pay_amountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("payer_pay_amount between", value1, value2, "payer_pay_amount");
            return (Criteria) this;
        }

        public Criteria andPayer_pay_amountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("payer_pay_amount not between", value1, value2, "payer_pay_amount");
            return (Criteria) this;
        }

        public Criteria andPayer_feeIsNull() {
            addCriterion("payer_fee is null");
            return (Criteria) this;
        }

        public Criteria andPayer_feeIsNotNull() {
            addCriterion("payer_fee is not null");
            return (Criteria) this;
        }

        public Criteria andPayer_feeEqualTo(BigDecimal value) {
            addCriterion("payer_fee =", value, "payer_fee");
            return (Criteria) this;
        }

        public Criteria andPayer_feeNotEqualTo(BigDecimal value) {
            addCriterion("payer_fee <>", value, "payer_fee");
            return (Criteria) this;
        }

        public Criteria andPayer_feeGreaterThan(BigDecimal value) {
            addCriterion("payer_fee >", value, "payer_fee");
            return (Criteria) this;
        }

        public Criteria andPayer_feeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("payer_fee >=", value, "payer_fee");
            return (Criteria) this;
        }

        public Criteria andPayer_feeLessThan(BigDecimal value) {
            addCriterion("payer_fee <", value, "payer_fee");
            return (Criteria) this;
        }

        public Criteria andPayer_feeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("payer_fee <=", value, "payer_fee");
            return (Criteria) this;
        }

        public Criteria andPayer_feeIn(List<BigDecimal> values) {
            addCriterion("payer_fee in", values, "payer_fee");
            return (Criteria) this;
        }

        public Criteria andPayer_feeNotIn(List<BigDecimal> values) {
            addCriterion("payer_fee not in", values, "payer_fee");
            return (Criteria) this;
        }

        public Criteria andPayer_feeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("payer_fee between", value1, value2, "payer_fee");
            return (Criteria) this;
        }

        public Criteria andPayer_feeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("payer_fee not between", value1, value2, "payer_fee");
            return (Criteria) this;
        }

        public Criteria andPayer_account_typeIsNull() {
            addCriterion("payer_account_type is null");
            return (Criteria) this;
        }

        public Criteria andPayer_account_typeIsNotNull() {
            addCriterion("payer_account_type is not null");
            return (Criteria) this;
        }

        public Criteria andPayer_account_typeEqualTo(String value) {
            addCriterion("payer_account_type =", value, "payer_account_type");
            return (Criteria) this;
        }

        public Criteria andPayer_account_typeNotEqualTo(String value) {
            addCriterion("payer_account_type <>", value, "payer_account_type");
            return (Criteria) this;
        }

        public Criteria andPayer_account_typeGreaterThan(String value) {
            addCriterion("payer_account_type >", value, "payer_account_type");
            return (Criteria) this;
        }

        public Criteria andPayer_account_typeGreaterThanOrEqualTo(String value) {
            addCriterion("payer_account_type >=", value, "payer_account_type");
            return (Criteria) this;
        }

        public Criteria andPayer_account_typeLessThan(String value) {
            addCriterion("payer_account_type <", value, "payer_account_type");
            return (Criteria) this;
        }

        public Criteria andPayer_account_typeLessThanOrEqualTo(String value) {
            addCriterion("payer_account_type <=", value, "payer_account_type");
            return (Criteria) this;
        }

        public Criteria andPayer_account_typeLike(String value) {
            addCriterion("payer_account_type like", value, "payer_account_type");
            return (Criteria) this;
        }

        public Criteria andPayer_account_typeNotLike(String value) {
            addCriterion("payer_account_type not like", value, "payer_account_type");
            return (Criteria) this;
        }

        public Criteria andPayer_account_typeIn(List<String> values) {
            addCriterion("payer_account_type in", values, "payer_account_type");
            return (Criteria) this;
        }

        public Criteria andPayer_account_typeNotIn(List<String> values) {
            addCriterion("payer_account_type not in", values, "payer_account_type");
            return (Criteria) this;
        }

        public Criteria andPayer_account_typeBetween(String value1, String value2) {
            addCriterion("payer_account_type between", value1, value2, "payer_account_type");
            return (Criteria) this;
        }

        public Criteria andPayer_account_typeNotBetween(String value1, String value2) {
            addCriterion("payer_account_type not between", value1, value2, "payer_account_type");
            return (Criteria) this;
        }

        public Criteria andReceiver_user_noIsNull() {
            addCriterion("receiver_user_no is null");
            return (Criteria) this;
        }

        public Criteria andReceiver_user_noIsNotNull() {
            addCriterion("receiver_user_no is not null");
            return (Criteria) this;
        }

        public Criteria andReceiver_user_noEqualTo(String value) {
            addCriterion("receiver_user_no =", value, "receiver_user_no");
            return (Criteria) this;
        }

        public Criteria andReceiver_user_noNotEqualTo(String value) {
            addCriterion("receiver_user_no <>", value, "receiver_user_no");
            return (Criteria) this;
        }

        public Criteria andReceiver_user_noGreaterThan(String value) {
            addCriterion("receiver_user_no >", value, "receiver_user_no");
            return (Criteria) this;
        }

        public Criteria andReceiver_user_noGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_user_no >=", value, "receiver_user_no");
            return (Criteria) this;
        }

        public Criteria andReceiver_user_noLessThan(String value) {
            addCriterion("receiver_user_no <", value, "receiver_user_no");
            return (Criteria) this;
        }

        public Criteria andReceiver_user_noLessThanOrEqualTo(String value) {
            addCriterion("receiver_user_no <=", value, "receiver_user_no");
            return (Criteria) this;
        }

        public Criteria andReceiver_user_noLike(String value) {
            addCriterion("receiver_user_no like", value, "receiver_user_no");
            return (Criteria) this;
        }

        public Criteria andReceiver_user_noNotLike(String value) {
            addCriterion("receiver_user_no not like", value, "receiver_user_no");
            return (Criteria) this;
        }

        public Criteria andReceiver_user_noIn(List<String> values) {
            addCriterion("receiver_user_no in", values, "receiver_user_no");
            return (Criteria) this;
        }

        public Criteria andReceiver_user_noNotIn(List<String> values) {
            addCriterion("receiver_user_no not in", values, "receiver_user_no");
            return (Criteria) this;
        }

        public Criteria andReceiver_user_noBetween(String value1, String value2) {
            addCriterion("receiver_user_no between", value1, value2, "receiver_user_no");
            return (Criteria) this;
        }

        public Criteria andReceiver_user_noNotBetween(String value1, String value2) {
            addCriterion("receiver_user_no not between", value1, value2, "receiver_user_no");
            return (Criteria) this;
        }

        public Criteria andReceiver_nameIsNull() {
            addCriterion("receiver_name is null");
            return (Criteria) this;
        }

        public Criteria andReceiver_nameIsNotNull() {
            addCriterion("receiver_name is not null");
            return (Criteria) this;
        }

        public Criteria andReceiver_nameEqualTo(String value) {
            addCriterion("receiver_name =", value, "receiver_name");
            return (Criteria) this;
        }

        public Criteria andReceiver_nameNotEqualTo(String value) {
            addCriterion("receiver_name <>", value, "receiver_name");
            return (Criteria) this;
        }

        public Criteria andReceiver_nameGreaterThan(String value) {
            addCriterion("receiver_name >", value, "receiver_name");
            return (Criteria) this;
        }

        public Criteria andReceiver_nameGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_name >=", value, "receiver_name");
            return (Criteria) this;
        }

        public Criteria andReceiver_nameLessThan(String value) {
            addCriterion("receiver_name <", value, "receiver_name");
            return (Criteria) this;
        }

        public Criteria andReceiver_nameLessThanOrEqualTo(String value) {
            addCriterion("receiver_name <=", value, "receiver_name");
            return (Criteria) this;
        }

        public Criteria andReceiver_nameLike(String value) {
            addCriterion("receiver_name like", value, "receiver_name");
            return (Criteria) this;
        }

        public Criteria andReceiver_nameNotLike(String value) {
            addCriterion("receiver_name not like", value, "receiver_name");
            return (Criteria) this;
        }

        public Criteria andReceiver_nameIn(List<String> values) {
            addCriterion("receiver_name in", values, "receiver_name");
            return (Criteria) this;
        }

        public Criteria andReceiver_nameNotIn(List<String> values) {
            addCriterion("receiver_name not in", values, "receiver_name");
            return (Criteria) this;
        }

        public Criteria andReceiver_nameBetween(String value1, String value2) {
            addCriterion("receiver_name between", value1, value2, "receiver_name");
            return (Criteria) this;
        }

        public Criteria andReceiver_nameNotBetween(String value1, String value2) {
            addCriterion("receiver_name not between", value1, value2, "receiver_name");
            return (Criteria) this;
        }

        public Criteria andReceiver_pay_amountIsNull() {
            addCriterion("receiver_pay_amount is null");
            return (Criteria) this;
        }

        public Criteria andReceiver_pay_amountIsNotNull() {
            addCriterion("receiver_pay_amount is not null");
            return (Criteria) this;
        }

        public Criteria andReceiver_pay_amountEqualTo(BigDecimal value) {
            addCriterion("receiver_pay_amount =", value, "receiver_pay_amount");
            return (Criteria) this;
        }

        public Criteria andReceiver_pay_amountNotEqualTo(BigDecimal value) {
            addCriterion("receiver_pay_amount <>", value, "receiver_pay_amount");
            return (Criteria) this;
        }

        public Criteria andReceiver_pay_amountGreaterThan(BigDecimal value) {
            addCriterion("receiver_pay_amount >", value, "receiver_pay_amount");
            return (Criteria) this;
        }

        public Criteria andReceiver_pay_amountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("receiver_pay_amount >=", value, "receiver_pay_amount");
            return (Criteria) this;
        }

        public Criteria andReceiver_pay_amountLessThan(BigDecimal value) {
            addCriterion("receiver_pay_amount <", value, "receiver_pay_amount");
            return (Criteria) this;
        }

        public Criteria andReceiver_pay_amountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("receiver_pay_amount <=", value, "receiver_pay_amount");
            return (Criteria) this;
        }

        public Criteria andReceiver_pay_amountIn(List<BigDecimal> values) {
            addCriterion("receiver_pay_amount in", values, "receiver_pay_amount");
            return (Criteria) this;
        }

        public Criteria andReceiver_pay_amountNotIn(List<BigDecimal> values) {
            addCriterion("receiver_pay_amount not in", values, "receiver_pay_amount");
            return (Criteria) this;
        }

        public Criteria andReceiver_pay_amountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("receiver_pay_amount between", value1, value2, "receiver_pay_amount");
            return (Criteria) this;
        }

        public Criteria andReceiver_pay_amountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("receiver_pay_amount not between", value1, value2, "receiver_pay_amount");
            return (Criteria) this;
        }

        public Criteria andReceiver_feeIsNull() {
            addCriterion("receiver_fee is null");
            return (Criteria) this;
        }

        public Criteria andReceiver_feeIsNotNull() {
            addCriterion("receiver_fee is not null");
            return (Criteria) this;
        }

        public Criteria andReceiver_feeEqualTo(BigDecimal value) {
            addCriterion("receiver_fee =", value, "receiver_fee");
            return (Criteria) this;
        }

        public Criteria andReceiver_feeNotEqualTo(BigDecimal value) {
            addCriterion("receiver_fee <>", value, "receiver_fee");
            return (Criteria) this;
        }

        public Criteria andReceiver_feeGreaterThan(BigDecimal value) {
            addCriterion("receiver_fee >", value, "receiver_fee");
            return (Criteria) this;
        }

        public Criteria andReceiver_feeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("receiver_fee >=", value, "receiver_fee");
            return (Criteria) this;
        }

        public Criteria andReceiver_feeLessThan(BigDecimal value) {
            addCriterion("receiver_fee <", value, "receiver_fee");
            return (Criteria) this;
        }

        public Criteria andReceiver_feeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("receiver_fee <=", value, "receiver_fee");
            return (Criteria) this;
        }

        public Criteria andReceiver_feeIn(List<BigDecimal> values) {
            addCriterion("receiver_fee in", values, "receiver_fee");
            return (Criteria) this;
        }

        public Criteria andReceiver_feeNotIn(List<BigDecimal> values) {
            addCriterion("receiver_fee not in", values, "receiver_fee");
            return (Criteria) this;
        }

        public Criteria andReceiver_feeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("receiver_fee between", value1, value2, "receiver_fee");
            return (Criteria) this;
        }

        public Criteria andReceiver_feeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("receiver_fee not between", value1, value2, "receiver_fee");
            return (Criteria) this;
        }

        public Criteria andReceiver_account_typeIsNull() {
            addCriterion("receiver_account_type is null");
            return (Criteria) this;
        }

        public Criteria andReceiver_account_typeIsNotNull() {
            addCriterion("receiver_account_type is not null");
            return (Criteria) this;
        }

        public Criteria andReceiver_account_typeEqualTo(String value) {
            addCriterion("receiver_account_type =", value, "receiver_account_type");
            return (Criteria) this;
        }

        public Criteria andReceiver_account_typeNotEqualTo(String value) {
            addCriterion("receiver_account_type <>", value, "receiver_account_type");
            return (Criteria) this;
        }

        public Criteria andReceiver_account_typeGreaterThan(String value) {
            addCriterion("receiver_account_type >", value, "receiver_account_type");
            return (Criteria) this;
        }

        public Criteria andReceiver_account_typeGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_account_type >=", value, "receiver_account_type");
            return (Criteria) this;
        }

        public Criteria andReceiver_account_typeLessThan(String value) {
            addCriterion("receiver_account_type <", value, "receiver_account_type");
            return (Criteria) this;
        }

        public Criteria andReceiver_account_typeLessThanOrEqualTo(String value) {
            addCriterion("receiver_account_type <=", value, "receiver_account_type");
            return (Criteria) this;
        }

        public Criteria andReceiver_account_typeLike(String value) {
            addCriterion("receiver_account_type like", value, "receiver_account_type");
            return (Criteria) this;
        }

        public Criteria andReceiver_account_typeNotLike(String value) {
            addCriterion("receiver_account_type not like", value, "receiver_account_type");
            return (Criteria) this;
        }

        public Criteria andReceiver_account_typeIn(List<String> values) {
            addCriterion("receiver_account_type in", values, "receiver_account_type");
            return (Criteria) this;
        }

        public Criteria andReceiver_account_typeNotIn(List<String> values) {
            addCriterion("receiver_account_type not in", values, "receiver_account_type");
            return (Criteria) this;
        }

        public Criteria andReceiver_account_typeBetween(String value1, String value2) {
            addCriterion("receiver_account_type between", value1, value2, "receiver_account_type");
            return (Criteria) this;
        }

        public Criteria andReceiver_account_typeNotBetween(String value1, String value2) {
            addCriterion("receiver_account_type not between", value1, value2, "receiver_account_type");
            return (Criteria) this;
        }

        public Criteria andOrder_ipIsNull() {
            addCriterion("order_ip is null");
            return (Criteria) this;
        }

        public Criteria andOrder_ipIsNotNull() {
            addCriterion("order_ip is not null");
            return (Criteria) this;
        }

        public Criteria andOrder_ipEqualTo(String value) {
            addCriterion("order_ip =", value, "order_ip");
            return (Criteria) this;
        }

        public Criteria andOrder_ipNotEqualTo(String value) {
            addCriterion("order_ip <>", value, "order_ip");
            return (Criteria) this;
        }

        public Criteria andOrder_ipGreaterThan(String value) {
            addCriterion("order_ip >", value, "order_ip");
            return (Criteria) this;
        }

        public Criteria andOrder_ipGreaterThanOrEqualTo(String value) {
            addCriterion("order_ip >=", value, "order_ip");
            return (Criteria) this;
        }

        public Criteria andOrder_ipLessThan(String value) {
            addCriterion("order_ip <", value, "order_ip");
            return (Criteria) this;
        }

        public Criteria andOrder_ipLessThanOrEqualTo(String value) {
            addCriterion("order_ip <=", value, "order_ip");
            return (Criteria) this;
        }

        public Criteria andOrder_ipLike(String value) {
            addCriterion("order_ip like", value, "order_ip");
            return (Criteria) this;
        }

        public Criteria andOrder_ipNotLike(String value) {
            addCriterion("order_ip not like", value, "order_ip");
            return (Criteria) this;
        }

        public Criteria andOrder_ipIn(List<String> values) {
            addCriterion("order_ip in", values, "order_ip");
            return (Criteria) this;
        }

        public Criteria andOrder_ipNotIn(List<String> values) {
            addCriterion("order_ip not in", values, "order_ip");
            return (Criteria) this;
        }

        public Criteria andOrder_ipBetween(String value1, String value2) {
            addCriterion("order_ip between", value1, value2, "order_ip");
            return (Criteria) this;
        }

        public Criteria andOrder_ipNotBetween(String value1, String value2) {
            addCriterion("order_ip not between", value1, value2, "order_ip");
            return (Criteria) this;
        }

        public Criteria andOrder_referer_urlIsNull() {
            addCriterion("order_referer_url is null");
            return (Criteria) this;
        }

        public Criteria andOrder_referer_urlIsNotNull() {
            addCriterion("order_referer_url is not null");
            return (Criteria) this;
        }

        public Criteria andOrder_referer_urlEqualTo(String value) {
            addCriterion("order_referer_url =", value, "order_referer_url");
            return (Criteria) this;
        }

        public Criteria andOrder_referer_urlNotEqualTo(String value) {
            addCriterion("order_referer_url <>", value, "order_referer_url");
            return (Criteria) this;
        }

        public Criteria andOrder_referer_urlGreaterThan(String value) {
            addCriterion("order_referer_url >", value, "order_referer_url");
            return (Criteria) this;
        }

        public Criteria andOrder_referer_urlGreaterThanOrEqualTo(String value) {
            addCriterion("order_referer_url >=", value, "order_referer_url");
            return (Criteria) this;
        }

        public Criteria andOrder_referer_urlLessThan(String value) {
            addCriterion("order_referer_url <", value, "order_referer_url");
            return (Criteria) this;
        }

        public Criteria andOrder_referer_urlLessThanOrEqualTo(String value) {
            addCriterion("order_referer_url <=", value, "order_referer_url");
            return (Criteria) this;
        }

        public Criteria andOrder_referer_urlLike(String value) {
            addCriterion("order_referer_url like", value, "order_referer_url");
            return (Criteria) this;
        }

        public Criteria andOrder_referer_urlNotLike(String value) {
            addCriterion("order_referer_url not like", value, "order_referer_url");
            return (Criteria) this;
        }

        public Criteria andOrder_referer_urlIn(List<String> values) {
            addCriterion("order_referer_url in", values, "order_referer_url");
            return (Criteria) this;
        }

        public Criteria andOrder_referer_urlNotIn(List<String> values) {
            addCriterion("order_referer_url not in", values, "order_referer_url");
            return (Criteria) this;
        }

        public Criteria andOrder_referer_urlBetween(String value1, String value2) {
            addCriterion("order_referer_url between", value1, value2, "order_referer_url");
            return (Criteria) this;
        }

        public Criteria andOrder_referer_urlNotBetween(String value1, String value2) {
            addCriterion("order_referer_url not between", value1, value2, "order_referer_url");
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

        public Criteria andPlat_incomeIsNull() {
            addCriterion("plat_income is null");
            return (Criteria) this;
        }

        public Criteria andPlat_incomeIsNotNull() {
            addCriterion("plat_income is not null");
            return (Criteria) this;
        }

        public Criteria andPlat_incomeEqualTo(BigDecimal value) {
            addCriterion("plat_income =", value, "plat_income");
            return (Criteria) this;
        }

        public Criteria andPlat_incomeNotEqualTo(BigDecimal value) {
            addCriterion("plat_income <>", value, "plat_income");
            return (Criteria) this;
        }

        public Criteria andPlat_incomeGreaterThan(BigDecimal value) {
            addCriterion("plat_income >", value, "plat_income");
            return (Criteria) this;
        }

        public Criteria andPlat_incomeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("plat_income >=", value, "plat_income");
            return (Criteria) this;
        }

        public Criteria andPlat_incomeLessThan(BigDecimal value) {
            addCriterion("plat_income <", value, "plat_income");
            return (Criteria) this;
        }

        public Criteria andPlat_incomeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("plat_income <=", value, "plat_income");
            return (Criteria) this;
        }

        public Criteria andPlat_incomeIn(List<BigDecimal> values) {
            addCriterion("plat_income in", values, "plat_income");
            return (Criteria) this;
        }

        public Criteria andPlat_incomeNotIn(List<BigDecimal> values) {
            addCriterion("plat_income not in", values, "plat_income");
            return (Criteria) this;
        }

        public Criteria andPlat_incomeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("plat_income between", value1, value2, "plat_income");
            return (Criteria) this;
        }

        public Criteria andPlat_incomeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("plat_income not between", value1, value2, "plat_income");
            return (Criteria) this;
        }

        public Criteria andFee_rateIsNull() {
            addCriterion("fee_rate is null");
            return (Criteria) this;
        }

        public Criteria andFee_rateIsNotNull() {
            addCriterion("fee_rate is not null");
            return (Criteria) this;
        }

        public Criteria andFee_rateEqualTo(BigDecimal value) {
            addCriterion("fee_rate =", value, "fee_rate");
            return (Criteria) this;
        }

        public Criteria andFee_rateNotEqualTo(BigDecimal value) {
            addCriterion("fee_rate <>", value, "fee_rate");
            return (Criteria) this;
        }

        public Criteria andFee_rateGreaterThan(BigDecimal value) {
            addCriterion("fee_rate >", value, "fee_rate");
            return (Criteria) this;
        }

        public Criteria andFee_rateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fee_rate >=", value, "fee_rate");
            return (Criteria) this;
        }

        public Criteria andFee_rateLessThan(BigDecimal value) {
            addCriterion("fee_rate <", value, "fee_rate");
            return (Criteria) this;
        }

        public Criteria andFee_rateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fee_rate <=", value, "fee_rate");
            return (Criteria) this;
        }

        public Criteria andFee_rateIn(List<BigDecimal> values) {
            addCriterion("fee_rate in", values, "fee_rate");
            return (Criteria) this;
        }

        public Criteria andFee_rateNotIn(List<BigDecimal> values) {
            addCriterion("fee_rate not in", values, "fee_rate");
            return (Criteria) this;
        }

        public Criteria andFee_rateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fee_rate between", value1, value2, "fee_rate");
            return (Criteria) this;
        }

        public Criteria andFee_rateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fee_rate not between", value1, value2, "fee_rate");
            return (Criteria) this;
        }

        public Criteria andPlat_costIsNull() {
            addCriterion("plat_cost is null");
            return (Criteria) this;
        }

        public Criteria andPlat_costIsNotNull() {
            addCriterion("plat_cost is not null");
            return (Criteria) this;
        }

        public Criteria andPlat_costEqualTo(BigDecimal value) {
            addCriterion("plat_cost =", value, "plat_cost");
            return (Criteria) this;
        }

        public Criteria andPlat_costNotEqualTo(BigDecimal value) {
            addCriterion("plat_cost <>", value, "plat_cost");
            return (Criteria) this;
        }

        public Criteria andPlat_costGreaterThan(BigDecimal value) {
            addCriterion("plat_cost >", value, "plat_cost");
            return (Criteria) this;
        }

        public Criteria andPlat_costGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("plat_cost >=", value, "plat_cost");
            return (Criteria) this;
        }

        public Criteria andPlat_costLessThan(BigDecimal value) {
            addCriterion("plat_cost <", value, "plat_cost");
            return (Criteria) this;
        }

        public Criteria andPlat_costLessThanOrEqualTo(BigDecimal value) {
            addCriterion("plat_cost <=", value, "plat_cost");
            return (Criteria) this;
        }

        public Criteria andPlat_costIn(List<BigDecimal> values) {
            addCriterion("plat_cost in", values, "plat_cost");
            return (Criteria) this;
        }

        public Criteria andPlat_costNotIn(List<BigDecimal> values) {
            addCriterion("plat_cost not in", values, "plat_cost");
            return (Criteria) this;
        }

        public Criteria andPlat_costBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("plat_cost between", value1, value2, "plat_cost");
            return (Criteria) this;
        }

        public Criteria andPlat_costNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("plat_cost not between", value1, value2, "plat_cost");
            return (Criteria) this;
        }

        public Criteria andPlat_profitIsNull() {
            addCriterion("plat_profit is null");
            return (Criteria) this;
        }

        public Criteria andPlat_profitIsNotNull() {
            addCriterion("plat_profit is not null");
            return (Criteria) this;
        }

        public Criteria andPlat_profitEqualTo(BigDecimal value) {
            addCriterion("plat_profit =", value, "plat_profit");
            return (Criteria) this;
        }

        public Criteria andPlat_profitNotEqualTo(BigDecimal value) {
            addCriterion("plat_profit <>", value, "plat_profit");
            return (Criteria) this;
        }

        public Criteria andPlat_profitGreaterThan(BigDecimal value) {
            addCriterion("plat_profit >", value, "plat_profit");
            return (Criteria) this;
        }

        public Criteria andPlat_profitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("plat_profit >=", value, "plat_profit");
            return (Criteria) this;
        }

        public Criteria andPlat_profitLessThan(BigDecimal value) {
            addCriterion("plat_profit <", value, "plat_profit");
            return (Criteria) this;
        }

        public Criteria andPlat_profitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("plat_profit <=", value, "plat_profit");
            return (Criteria) this;
        }

        public Criteria andPlat_profitIn(List<BigDecimal> values) {
            addCriterion("plat_profit in", values, "plat_profit");
            return (Criteria) this;
        }

        public Criteria andPlat_profitNotIn(List<BigDecimal> values) {
            addCriterion("plat_profit not in", values, "plat_profit");
            return (Criteria) this;
        }

        public Criteria andPlat_profitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("plat_profit between", value1, value2, "plat_profit");
            return (Criteria) this;
        }

        public Criteria andPlat_profitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("plat_profit not between", value1, value2, "plat_profit");
            return (Criteria) this;
        }

        public Criteria andReturn_urlIsNull() {
            addCriterion("return_url is null");
            return (Criteria) this;
        }

        public Criteria andReturn_urlIsNotNull() {
            addCriterion("return_url is not null");
            return (Criteria) this;
        }

        public Criteria andReturn_urlEqualTo(String value) {
            addCriterion("return_url =", value, "return_url");
            return (Criteria) this;
        }

        public Criteria andReturn_urlNotEqualTo(String value) {
            addCriterion("return_url <>", value, "return_url");
            return (Criteria) this;
        }

        public Criteria andReturn_urlGreaterThan(String value) {
            addCriterion("return_url >", value, "return_url");
            return (Criteria) this;
        }

        public Criteria andReturn_urlGreaterThanOrEqualTo(String value) {
            addCriterion("return_url >=", value, "return_url");
            return (Criteria) this;
        }

        public Criteria andReturn_urlLessThan(String value) {
            addCriterion("return_url <", value, "return_url");
            return (Criteria) this;
        }

        public Criteria andReturn_urlLessThanOrEqualTo(String value) {
            addCriterion("return_url <=", value, "return_url");
            return (Criteria) this;
        }

        public Criteria andReturn_urlLike(String value) {
            addCriterion("return_url like", value, "return_url");
            return (Criteria) this;
        }

        public Criteria andReturn_urlNotLike(String value) {
            addCriterion("return_url not like", value, "return_url");
            return (Criteria) this;
        }

        public Criteria andReturn_urlIn(List<String> values) {
            addCriterion("return_url in", values, "return_url");
            return (Criteria) this;
        }

        public Criteria andReturn_urlNotIn(List<String> values) {
            addCriterion("return_url not in", values, "return_url");
            return (Criteria) this;
        }

        public Criteria andReturn_urlBetween(String value1, String value2) {
            addCriterion("return_url between", value1, value2, "return_url");
            return (Criteria) this;
        }

        public Criteria andReturn_urlNotBetween(String value1, String value2) {
            addCriterion("return_url not between", value1, value2, "return_url");
            return (Criteria) this;
        }

        public Criteria andNotify_urlIsNull() {
            addCriterion("notify_url is null");
            return (Criteria) this;
        }

        public Criteria andNotify_urlIsNotNull() {
            addCriterion("notify_url is not null");
            return (Criteria) this;
        }

        public Criteria andNotify_urlEqualTo(String value) {
            addCriterion("notify_url =", value, "notify_url");
            return (Criteria) this;
        }

        public Criteria andNotify_urlNotEqualTo(String value) {
            addCriterion("notify_url <>", value, "notify_url");
            return (Criteria) this;
        }

        public Criteria andNotify_urlGreaterThan(String value) {
            addCriterion("notify_url >", value, "notify_url");
            return (Criteria) this;
        }

        public Criteria andNotify_urlGreaterThanOrEqualTo(String value) {
            addCriterion("notify_url >=", value, "notify_url");
            return (Criteria) this;
        }

        public Criteria andNotify_urlLessThan(String value) {
            addCriterion("notify_url <", value, "notify_url");
            return (Criteria) this;
        }

        public Criteria andNotify_urlLessThanOrEqualTo(String value) {
            addCriterion("notify_url <=", value, "notify_url");
            return (Criteria) this;
        }

        public Criteria andNotify_urlLike(String value) {
            addCriterion("notify_url like", value, "notify_url");
            return (Criteria) this;
        }

        public Criteria andNotify_urlNotLike(String value) {
            addCriterion("notify_url not like", value, "notify_url");
            return (Criteria) this;
        }

        public Criteria andNotify_urlIn(List<String> values) {
            addCriterion("notify_url in", values, "notify_url");
            return (Criteria) this;
        }

        public Criteria andNotify_urlNotIn(List<String> values) {
            addCriterion("notify_url not in", values, "notify_url");
            return (Criteria) this;
        }

        public Criteria andNotify_urlBetween(String value1, String value2) {
            addCriterion("notify_url between", value1, value2, "notify_url");
            return (Criteria) this;
        }

        public Criteria andNotify_urlNotBetween(String value1, String value2) {
            addCriterion("notify_url not between", value1, value2, "notify_url");
            return (Criteria) this;
        }

        public Criteria andPay_way_codeIsNull() {
            addCriterion("pay_way_code is null");
            return (Criteria) this;
        }

        public Criteria andPay_way_codeIsNotNull() {
            addCriterion("pay_way_code is not null");
            return (Criteria) this;
        }

        public Criteria andPay_way_codeEqualTo(String value) {
            addCriterion("pay_way_code =", value, "pay_way_code");
            return (Criteria) this;
        }

        public Criteria andPay_way_codeNotEqualTo(String value) {
            addCriterion("pay_way_code <>", value, "pay_way_code");
            return (Criteria) this;
        }

        public Criteria andPay_way_codeGreaterThan(String value) {
            addCriterion("pay_way_code >", value, "pay_way_code");
            return (Criteria) this;
        }

        public Criteria andPay_way_codeGreaterThanOrEqualTo(String value) {
            addCriterion("pay_way_code >=", value, "pay_way_code");
            return (Criteria) this;
        }

        public Criteria andPay_way_codeLessThan(String value) {
            addCriterion("pay_way_code <", value, "pay_way_code");
            return (Criteria) this;
        }

        public Criteria andPay_way_codeLessThanOrEqualTo(String value) {
            addCriterion("pay_way_code <=", value, "pay_way_code");
            return (Criteria) this;
        }

        public Criteria andPay_way_codeLike(String value) {
            addCriterion("pay_way_code like", value, "pay_way_code");
            return (Criteria) this;
        }

        public Criteria andPay_way_codeNotLike(String value) {
            addCriterion("pay_way_code not like", value, "pay_way_code");
            return (Criteria) this;
        }

        public Criteria andPay_way_codeIn(List<String> values) {
            addCriterion("pay_way_code in", values, "pay_way_code");
            return (Criteria) this;
        }

        public Criteria andPay_way_codeNotIn(List<String> values) {
            addCriterion("pay_way_code not in", values, "pay_way_code");
            return (Criteria) this;
        }

        public Criteria andPay_way_codeBetween(String value1, String value2) {
            addCriterion("pay_way_code between", value1, value2, "pay_way_code");
            return (Criteria) this;
        }

        public Criteria andPay_way_codeNotBetween(String value1, String value2) {
            addCriterion("pay_way_code not between", value1, value2, "pay_way_code");
            return (Criteria) this;
        }

        public Criteria andPay_way_nameIsNull() {
            addCriterion("pay_way_name is null");
            return (Criteria) this;
        }

        public Criteria andPay_way_nameIsNotNull() {
            addCriterion("pay_way_name is not null");
            return (Criteria) this;
        }

        public Criteria andPay_way_nameEqualTo(String value) {
            addCriterion("pay_way_name =", value, "pay_way_name");
            return (Criteria) this;
        }

        public Criteria andPay_way_nameNotEqualTo(String value) {
            addCriterion("pay_way_name <>", value, "pay_way_name");
            return (Criteria) this;
        }

        public Criteria andPay_way_nameGreaterThan(String value) {
            addCriterion("pay_way_name >", value, "pay_way_name");
            return (Criteria) this;
        }

        public Criteria andPay_way_nameGreaterThanOrEqualTo(String value) {
            addCriterion("pay_way_name >=", value, "pay_way_name");
            return (Criteria) this;
        }

        public Criteria andPay_way_nameLessThan(String value) {
            addCriterion("pay_way_name <", value, "pay_way_name");
            return (Criteria) this;
        }

        public Criteria andPay_way_nameLessThanOrEqualTo(String value) {
            addCriterion("pay_way_name <=", value, "pay_way_name");
            return (Criteria) this;
        }

        public Criteria andPay_way_nameLike(String value) {
            addCriterion("pay_way_name like", value, "pay_way_name");
            return (Criteria) this;
        }

        public Criteria andPay_way_nameNotLike(String value) {
            addCriterion("pay_way_name not like", value, "pay_way_name");
            return (Criteria) this;
        }

        public Criteria andPay_way_nameIn(List<String> values) {
            addCriterion("pay_way_name in", values, "pay_way_name");
            return (Criteria) this;
        }

        public Criteria andPay_way_nameNotIn(List<String> values) {
            addCriterion("pay_way_name not in", values, "pay_way_name");
            return (Criteria) this;
        }

        public Criteria andPay_way_nameBetween(String value1, String value2) {
            addCriterion("pay_way_name between", value1, value2, "pay_way_name");
            return (Criteria) this;
        }

        public Criteria andPay_way_nameNotBetween(String value1, String value2) {
            addCriterion("pay_way_name not between", value1, value2, "pay_way_name");
            return (Criteria) this;
        }

        public Criteria andPay_success_timeIsNull() {
            addCriterion("pay_success_time is null");
            return (Criteria) this;
        }

        public Criteria andPay_success_timeIsNotNull() {
            addCriterion("pay_success_time is not null");
            return (Criteria) this;
        }

        public Criteria andPay_success_timeEqualTo(Date value) {
            addCriterion("pay_success_time =", value, "pay_success_time");
            return (Criteria) this;
        }

        public Criteria andPay_success_timeNotEqualTo(Date value) {
            addCriterion("pay_success_time <>", value, "pay_success_time");
            return (Criteria) this;
        }

        public Criteria andPay_success_timeGreaterThan(Date value) {
            addCriterion("pay_success_time >", value, "pay_success_time");
            return (Criteria) this;
        }

        public Criteria andPay_success_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("pay_success_time >=", value, "pay_success_time");
            return (Criteria) this;
        }

        public Criteria andPay_success_timeLessThan(Date value) {
            addCriterion("pay_success_time <", value, "pay_success_time");
            return (Criteria) this;
        }

        public Criteria andPay_success_timeLessThanOrEqualTo(Date value) {
            addCriterion("pay_success_time <=", value, "pay_success_time");
            return (Criteria) this;
        }

        public Criteria andPay_success_timeIn(List<Date> values) {
            addCriterion("pay_success_time in", values, "pay_success_time");
            return (Criteria) this;
        }

        public Criteria andPay_success_timeNotIn(List<Date> values) {
            addCriterion("pay_success_time not in", values, "pay_success_time");
            return (Criteria) this;
        }

        public Criteria andPay_success_timeBetween(Date value1, Date value2) {
            addCriterion("pay_success_time between", value1, value2, "pay_success_time");
            return (Criteria) this;
        }

        public Criteria andPay_success_timeNotBetween(Date value1, Date value2) {
            addCriterion("pay_success_time not between", value1, value2, "pay_success_time");
            return (Criteria) this;
        }

        public Criteria andComplete_timeIsNull() {
            addCriterion("complete_time is null");
            return (Criteria) this;
        }

        public Criteria andComplete_timeIsNotNull() {
            addCriterion("complete_time is not null");
            return (Criteria) this;
        }

        public Criteria andComplete_timeEqualTo(Date value) {
            addCriterion("complete_time =", value, "complete_time");
            return (Criteria) this;
        }

        public Criteria andComplete_timeNotEqualTo(Date value) {
            addCriterion("complete_time <>", value, "complete_time");
            return (Criteria) this;
        }

        public Criteria andComplete_timeGreaterThan(Date value) {
            addCriterion("complete_time >", value, "complete_time");
            return (Criteria) this;
        }

        public Criteria andComplete_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("complete_time >=", value, "complete_time");
            return (Criteria) this;
        }

        public Criteria andComplete_timeLessThan(Date value) {
            addCriterion("complete_time <", value, "complete_time");
            return (Criteria) this;
        }

        public Criteria andComplete_timeLessThanOrEqualTo(Date value) {
            addCriterion("complete_time <=", value, "complete_time");
            return (Criteria) this;
        }

        public Criteria andComplete_timeIn(List<Date> values) {
            addCriterion("complete_time in", values, "complete_time");
            return (Criteria) this;
        }

        public Criteria andComplete_timeNotIn(List<Date> values) {
            addCriterion("complete_time not in", values, "complete_time");
            return (Criteria) this;
        }

        public Criteria andComplete_timeBetween(Date value1, Date value2) {
            addCriterion("complete_time between", value1, value2, "complete_time");
            return (Criteria) this;
        }

        public Criteria andComplete_timeNotBetween(Date value1, Date value2) {
            addCriterion("complete_time not between", value1, value2, "complete_time");
            return (Criteria) this;
        }

        public Criteria andIs_refundIsNull() {
            addCriterion("is_refund is null");
            return (Criteria) this;
        }

        public Criteria andIs_refundIsNotNull() {
            addCriterion("is_refund is not null");
            return (Criteria) this;
        }

        public Criteria andIs_refundEqualTo(String value) {
            addCriterion("is_refund =", value, "is_refund");
            return (Criteria) this;
        }

        public Criteria andIs_refundNotEqualTo(String value) {
            addCriterion("is_refund <>", value, "is_refund");
            return (Criteria) this;
        }

        public Criteria andIs_refundGreaterThan(String value) {
            addCriterion("is_refund >", value, "is_refund");
            return (Criteria) this;
        }

        public Criteria andIs_refundGreaterThanOrEqualTo(String value) {
            addCriterion("is_refund >=", value, "is_refund");
            return (Criteria) this;
        }

        public Criteria andIs_refundLessThan(String value) {
            addCriterion("is_refund <", value, "is_refund");
            return (Criteria) this;
        }

        public Criteria andIs_refundLessThanOrEqualTo(String value) {
            addCriterion("is_refund <=", value, "is_refund");
            return (Criteria) this;
        }

        public Criteria andIs_refundLike(String value) {
            addCriterion("is_refund like", value, "is_refund");
            return (Criteria) this;
        }

        public Criteria andIs_refundNotLike(String value) {
            addCriterion("is_refund not like", value, "is_refund");
            return (Criteria) this;
        }

        public Criteria andIs_refundIn(List<String> values) {
            addCriterion("is_refund in", values, "is_refund");
            return (Criteria) this;
        }

        public Criteria andIs_refundNotIn(List<String> values) {
            addCriterion("is_refund not in", values, "is_refund");
            return (Criteria) this;
        }

        public Criteria andIs_refundBetween(String value1, String value2) {
            addCriterion("is_refund between", value1, value2, "is_refund");
            return (Criteria) this;
        }

        public Criteria andIs_refundNotBetween(String value1, String value2) {
            addCriterion("is_refund not between", value1, value2, "is_refund");
            return (Criteria) this;
        }

        public Criteria andRefund_timesIsNull() {
            addCriterion("refund_times is null");
            return (Criteria) this;
        }

        public Criteria andRefund_timesIsNotNull() {
            addCriterion("refund_times is not null");
            return (Criteria) this;
        }

        public Criteria andRefund_timesEqualTo(Integer value) {
            addCriterion("refund_times =", value, "refund_times");
            return (Criteria) this;
        }

        public Criteria andRefund_timesNotEqualTo(Integer value) {
            addCriterion("refund_times <>", value, "refund_times");
            return (Criteria) this;
        }

        public Criteria andRefund_timesGreaterThan(Integer value) {
            addCriterion("refund_times >", value, "refund_times");
            return (Criteria) this;
        }

        public Criteria andRefund_timesGreaterThanOrEqualTo(Integer value) {
            addCriterion("refund_times >=", value, "refund_times");
            return (Criteria) this;
        }

        public Criteria andRefund_timesLessThan(Integer value) {
            addCriterion("refund_times <", value, "refund_times");
            return (Criteria) this;
        }

        public Criteria andRefund_timesLessThanOrEqualTo(Integer value) {
            addCriterion("refund_times <=", value, "refund_times");
            return (Criteria) this;
        }

        public Criteria andRefund_timesIn(List<Integer> values) {
            addCriterion("refund_times in", values, "refund_times");
            return (Criteria) this;
        }

        public Criteria andRefund_timesNotIn(List<Integer> values) {
            addCriterion("refund_times not in", values, "refund_times");
            return (Criteria) this;
        }

        public Criteria andRefund_timesBetween(Integer value1, Integer value2) {
            addCriterion("refund_times between", value1, value2, "refund_times");
            return (Criteria) this;
        }

        public Criteria andRefund_timesNotBetween(Integer value1, Integer value2) {
            addCriterion("refund_times not between", value1, value2, "refund_times");
            return (Criteria) this;
        }

        public Criteria andSuccess_refund_amountIsNull() {
            addCriterion("success_refund_amount is null");
            return (Criteria) this;
        }

        public Criteria andSuccess_refund_amountIsNotNull() {
            addCriterion("success_refund_amount is not null");
            return (Criteria) this;
        }

        public Criteria andSuccess_refund_amountEqualTo(BigDecimal value) {
            addCriterion("success_refund_amount =", value, "success_refund_amount");
            return (Criteria) this;
        }

        public Criteria andSuccess_refund_amountNotEqualTo(BigDecimal value) {
            addCriterion("success_refund_amount <>", value, "success_refund_amount");
            return (Criteria) this;
        }

        public Criteria andSuccess_refund_amountGreaterThan(BigDecimal value) {
            addCriterion("success_refund_amount >", value, "success_refund_amount");
            return (Criteria) this;
        }

        public Criteria andSuccess_refund_amountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("success_refund_amount >=", value, "success_refund_amount");
            return (Criteria) this;
        }

        public Criteria andSuccess_refund_amountLessThan(BigDecimal value) {
            addCriterion("success_refund_amount <", value, "success_refund_amount");
            return (Criteria) this;
        }

        public Criteria andSuccess_refund_amountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("success_refund_amount <=", value, "success_refund_amount");
            return (Criteria) this;
        }

        public Criteria andSuccess_refund_amountIn(List<BigDecimal> values) {
            addCriterion("success_refund_amount in", values, "success_refund_amount");
            return (Criteria) this;
        }

        public Criteria andSuccess_refund_amountNotIn(List<BigDecimal> values) {
            addCriterion("success_refund_amount not in", values, "success_refund_amount");
            return (Criteria) this;
        }

        public Criteria andSuccess_refund_amountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("success_refund_amount between", value1, value2, "success_refund_amount");
            return (Criteria) this;
        }

        public Criteria andSuccess_refund_amountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("success_refund_amount not between", value1, value2, "success_refund_amount");
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

        public Criteria andOrder_fromIsNull() {
            addCriterion("order_from is null");
            return (Criteria) this;
        }

        public Criteria andOrder_fromIsNotNull() {
            addCriterion("order_from is not null");
            return (Criteria) this;
        }

        public Criteria andOrder_fromEqualTo(String value) {
            addCriterion("order_from =", value, "order_from");
            return (Criteria) this;
        }

        public Criteria andOrder_fromNotEqualTo(String value) {
            addCriterion("order_from <>", value, "order_from");
            return (Criteria) this;
        }

        public Criteria andOrder_fromGreaterThan(String value) {
            addCriterion("order_from >", value, "order_from");
            return (Criteria) this;
        }

        public Criteria andOrder_fromGreaterThanOrEqualTo(String value) {
            addCriterion("order_from >=", value, "order_from");
            return (Criteria) this;
        }

        public Criteria andOrder_fromLessThan(String value) {
            addCriterion("order_from <", value, "order_from");
            return (Criteria) this;
        }

        public Criteria andOrder_fromLessThanOrEqualTo(String value) {
            addCriterion("order_from <=", value, "order_from");
            return (Criteria) this;
        }

        public Criteria andOrder_fromLike(String value) {
            addCriterion("order_from like", value, "order_from");
            return (Criteria) this;
        }

        public Criteria andOrder_fromNotLike(String value) {
            addCriterion("order_from not like", value, "order_from");
            return (Criteria) this;
        }

        public Criteria andOrder_fromIn(List<String> values) {
            addCriterion("order_from in", values, "order_from");
            return (Criteria) this;
        }

        public Criteria andOrder_fromNotIn(List<String> values) {
            addCriterion("order_from not in", values, "order_from");
            return (Criteria) this;
        }

        public Criteria andOrder_fromBetween(String value1, String value2) {
            addCriterion("order_from between", value1, value2, "order_from");
            return (Criteria) this;
        }

        public Criteria andOrder_fromNotBetween(String value1, String value2) {
            addCriterion("order_from not between", value1, value2, "order_from");
            return (Criteria) this;
        }

        public Criteria andPay_type_codeIsNull() {
            addCriterion("pay_type_code is null");
            return (Criteria) this;
        }

        public Criteria andPay_type_codeIsNotNull() {
            addCriterion("pay_type_code is not null");
            return (Criteria) this;
        }

        public Criteria andPay_type_codeEqualTo(String value) {
            addCriterion("pay_type_code =", value, "pay_type_code");
            return (Criteria) this;
        }

        public Criteria andPay_type_codeNotEqualTo(String value) {
            addCriterion("pay_type_code <>", value, "pay_type_code");
            return (Criteria) this;
        }

        public Criteria andPay_type_codeGreaterThan(String value) {
            addCriterion("pay_type_code >", value, "pay_type_code");
            return (Criteria) this;
        }

        public Criteria andPay_type_codeGreaterThanOrEqualTo(String value) {
            addCriterion("pay_type_code >=", value, "pay_type_code");
            return (Criteria) this;
        }

        public Criteria andPay_type_codeLessThan(String value) {
            addCriterion("pay_type_code <", value, "pay_type_code");
            return (Criteria) this;
        }

        public Criteria andPay_type_codeLessThanOrEqualTo(String value) {
            addCriterion("pay_type_code <=", value, "pay_type_code");
            return (Criteria) this;
        }

        public Criteria andPay_type_codeLike(String value) {
            addCriterion("pay_type_code like", value, "pay_type_code");
            return (Criteria) this;
        }

        public Criteria andPay_type_codeNotLike(String value) {
            addCriterion("pay_type_code not like", value, "pay_type_code");
            return (Criteria) this;
        }

        public Criteria andPay_type_codeIn(List<String> values) {
            addCriterion("pay_type_code in", values, "pay_type_code");
            return (Criteria) this;
        }

        public Criteria andPay_type_codeNotIn(List<String> values) {
            addCriterion("pay_type_code not in", values, "pay_type_code");
            return (Criteria) this;
        }

        public Criteria andPay_type_codeBetween(String value1, String value2) {
            addCriterion("pay_type_code between", value1, value2, "pay_type_code");
            return (Criteria) this;
        }

        public Criteria andPay_type_codeNotBetween(String value1, String value2) {
            addCriterion("pay_type_code not between", value1, value2, "pay_type_code");
            return (Criteria) this;
        }

        public Criteria andPay_type_nameIsNull() {
            addCriterion("pay_type_name is null");
            return (Criteria) this;
        }

        public Criteria andPay_type_nameIsNotNull() {
            addCriterion("pay_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andPay_type_nameEqualTo(String value) {
            addCriterion("pay_type_name =", value, "pay_type_name");
            return (Criteria) this;
        }

        public Criteria andPay_type_nameNotEqualTo(String value) {
            addCriterion("pay_type_name <>", value, "pay_type_name");
            return (Criteria) this;
        }

        public Criteria andPay_type_nameGreaterThan(String value) {
            addCriterion("pay_type_name >", value, "pay_type_name");
            return (Criteria) this;
        }

        public Criteria andPay_type_nameGreaterThanOrEqualTo(String value) {
            addCriterion("pay_type_name >=", value, "pay_type_name");
            return (Criteria) this;
        }

        public Criteria andPay_type_nameLessThan(String value) {
            addCriterion("pay_type_name <", value, "pay_type_name");
            return (Criteria) this;
        }

        public Criteria andPay_type_nameLessThanOrEqualTo(String value) {
            addCriterion("pay_type_name <=", value, "pay_type_name");
            return (Criteria) this;
        }

        public Criteria andPay_type_nameLike(String value) {
            addCriterion("pay_type_name like", value, "pay_type_name");
            return (Criteria) this;
        }

        public Criteria andPay_type_nameNotLike(String value) {
            addCriterion("pay_type_name not like", value, "pay_type_name");
            return (Criteria) this;
        }

        public Criteria andPay_type_nameIn(List<String> values) {
            addCriterion("pay_type_name in", values, "pay_type_name");
            return (Criteria) this;
        }

        public Criteria andPay_type_nameNotIn(List<String> values) {
            addCriterion("pay_type_name not in", values, "pay_type_name");
            return (Criteria) this;
        }

        public Criteria andPay_type_nameBetween(String value1, String value2) {
            addCriterion("pay_type_name between", value1, value2, "pay_type_name");
            return (Criteria) this;
        }

        public Criteria andPay_type_nameNotBetween(String value1, String value2) {
            addCriterion("pay_type_name not between", value1, value2, "pay_type_name");
            return (Criteria) this;
        }

        public Criteria andFund_into_typeIsNull() {
            addCriterion("fund_into_type is null");
            return (Criteria) this;
        }

        public Criteria andFund_into_typeIsNotNull() {
            addCriterion("fund_into_type is not null");
            return (Criteria) this;
        }

        public Criteria andFund_into_typeEqualTo(String value) {
            addCriterion("fund_into_type =", value, "fund_into_type");
            return (Criteria) this;
        }

        public Criteria andFund_into_typeNotEqualTo(String value) {
            addCriterion("fund_into_type <>", value, "fund_into_type");
            return (Criteria) this;
        }

        public Criteria andFund_into_typeGreaterThan(String value) {
            addCriterion("fund_into_type >", value, "fund_into_type");
            return (Criteria) this;
        }

        public Criteria andFund_into_typeGreaterThanOrEqualTo(String value) {
            addCriterion("fund_into_type >=", value, "fund_into_type");
            return (Criteria) this;
        }

        public Criteria andFund_into_typeLessThan(String value) {
            addCriterion("fund_into_type <", value, "fund_into_type");
            return (Criteria) this;
        }

        public Criteria andFund_into_typeLessThanOrEqualTo(String value) {
            addCriterion("fund_into_type <=", value, "fund_into_type");
            return (Criteria) this;
        }

        public Criteria andFund_into_typeLike(String value) {
            addCriterion("fund_into_type like", value, "fund_into_type");
            return (Criteria) this;
        }

        public Criteria andFund_into_typeNotLike(String value) {
            addCriterion("fund_into_type not like", value, "fund_into_type");
            return (Criteria) this;
        }

        public Criteria andFund_into_typeIn(List<String> values) {
            addCriterion("fund_into_type in", values, "fund_into_type");
            return (Criteria) this;
        }

        public Criteria andFund_into_typeNotIn(List<String> values) {
            addCriterion("fund_into_type not in", values, "fund_into_type");
            return (Criteria) this;
        }

        public Criteria andFund_into_typeBetween(String value1, String value2) {
            addCriterion("fund_into_type between", value1, value2, "fund_into_type");
            return (Criteria) this;
        }

        public Criteria andFund_into_typeNotBetween(String value1, String value2) {
            addCriterion("fund_into_type not between", value1, value2, "fund_into_type");
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

        public Criteria andField1IsNull() {
            addCriterion("field1 is null");
            return (Criteria) this;
        }

        public Criteria andField1IsNotNull() {
            addCriterion("field1 is not null");
            return (Criteria) this;
        }

        public Criteria andField1EqualTo(String value) {
            addCriterion("field1 =", value, "field1");
            return (Criteria) this;
        }

        public Criteria andField1NotEqualTo(String value) {
            addCriterion("field1 <>", value, "field1");
            return (Criteria) this;
        }

        public Criteria andField1GreaterThan(String value) {
            addCriterion("field1 >", value, "field1");
            return (Criteria) this;
        }

        public Criteria andField1GreaterThanOrEqualTo(String value) {
            addCriterion("field1 >=", value, "field1");
            return (Criteria) this;
        }

        public Criteria andField1LessThan(String value) {
            addCriterion("field1 <", value, "field1");
            return (Criteria) this;
        }

        public Criteria andField1LessThanOrEqualTo(String value) {
            addCriterion("field1 <=", value, "field1");
            return (Criteria) this;
        }

        public Criteria andField1Like(String value) {
            addCriterion("field1 like", value, "field1");
            return (Criteria) this;
        }

        public Criteria andField1NotLike(String value) {
            addCriterion("field1 not like", value, "field1");
            return (Criteria) this;
        }

        public Criteria andField1In(List<String> values) {
            addCriterion("field1 in", values, "field1");
            return (Criteria) this;
        }

        public Criteria andField1NotIn(List<String> values) {
            addCriterion("field1 not in", values, "field1");
            return (Criteria) this;
        }

        public Criteria andField1Between(String value1, String value2) {
            addCriterion("field1 between", value1, value2, "field1");
            return (Criteria) this;
        }

        public Criteria andField1NotBetween(String value1, String value2) {
            addCriterion("field1 not between", value1, value2, "field1");
            return (Criteria) this;
        }

        public Criteria andField2IsNull() {
            addCriterion("field2 is null");
            return (Criteria) this;
        }

        public Criteria andField2IsNotNull() {
            addCriterion("field2 is not null");
            return (Criteria) this;
        }

        public Criteria andField2EqualTo(String value) {
            addCriterion("field2 =", value, "field2");
            return (Criteria) this;
        }

        public Criteria andField2NotEqualTo(String value) {
            addCriterion("field2 <>", value, "field2");
            return (Criteria) this;
        }

        public Criteria andField2GreaterThan(String value) {
            addCriterion("field2 >", value, "field2");
            return (Criteria) this;
        }

        public Criteria andField2GreaterThanOrEqualTo(String value) {
            addCriterion("field2 >=", value, "field2");
            return (Criteria) this;
        }

        public Criteria andField2LessThan(String value) {
            addCriterion("field2 <", value, "field2");
            return (Criteria) this;
        }

        public Criteria andField2LessThanOrEqualTo(String value) {
            addCriterion("field2 <=", value, "field2");
            return (Criteria) this;
        }

        public Criteria andField2Like(String value) {
            addCriterion("field2 like", value, "field2");
            return (Criteria) this;
        }

        public Criteria andField2NotLike(String value) {
            addCriterion("field2 not like", value, "field2");
            return (Criteria) this;
        }

        public Criteria andField2In(List<String> values) {
            addCriterion("field2 in", values, "field2");
            return (Criteria) this;
        }

        public Criteria andField2NotIn(List<String> values) {
            addCriterion("field2 not in", values, "field2");
            return (Criteria) this;
        }

        public Criteria andField2Between(String value1, String value2) {
            addCriterion("field2 between", value1, value2, "field2");
            return (Criteria) this;
        }

        public Criteria andField2NotBetween(String value1, String value2) {
            addCriterion("field2 not between", value1, value2, "field2");
            return (Criteria) this;
        }

        public Criteria andField3IsNull() {
            addCriterion("field3 is null");
            return (Criteria) this;
        }

        public Criteria andField3IsNotNull() {
            addCriterion("field3 is not null");
            return (Criteria) this;
        }

        public Criteria andField3EqualTo(String value) {
            addCriterion("field3 =", value, "field3");
            return (Criteria) this;
        }

        public Criteria andField3NotEqualTo(String value) {
            addCriterion("field3 <>", value, "field3");
            return (Criteria) this;
        }

        public Criteria andField3GreaterThan(String value) {
            addCriterion("field3 >", value, "field3");
            return (Criteria) this;
        }

        public Criteria andField3GreaterThanOrEqualTo(String value) {
            addCriterion("field3 >=", value, "field3");
            return (Criteria) this;
        }

        public Criteria andField3LessThan(String value) {
            addCriterion("field3 <", value, "field3");
            return (Criteria) this;
        }

        public Criteria andField3LessThanOrEqualTo(String value) {
            addCriterion("field3 <=", value, "field3");
            return (Criteria) this;
        }

        public Criteria andField3Like(String value) {
            addCriterion("field3 like", value, "field3");
            return (Criteria) this;
        }

        public Criteria andField3NotLike(String value) {
            addCriterion("field3 not like", value, "field3");
            return (Criteria) this;
        }

        public Criteria andField3In(List<String> values) {
            addCriterion("field3 in", values, "field3");
            return (Criteria) this;
        }

        public Criteria andField3NotIn(List<String> values) {
            addCriterion("field3 not in", values, "field3");
            return (Criteria) this;
        }

        public Criteria andField3Between(String value1, String value2) {
            addCriterion("field3 between", value1, value2, "field3");
            return (Criteria) this;
        }

        public Criteria andField3NotBetween(String value1, String value2) {
            addCriterion("field3 not between", value1, value2, "field3");
            return (Criteria) this;
        }

        public Criteria andField4IsNull() {
            addCriterion("field4 is null");
            return (Criteria) this;
        }

        public Criteria andField4IsNotNull() {
            addCriterion("field4 is not null");
            return (Criteria) this;
        }

        public Criteria andField4EqualTo(String value) {
            addCriterion("field4 =", value, "field4");
            return (Criteria) this;
        }

        public Criteria andField4NotEqualTo(String value) {
            addCriterion("field4 <>", value, "field4");
            return (Criteria) this;
        }

        public Criteria andField4GreaterThan(String value) {
            addCriterion("field4 >", value, "field4");
            return (Criteria) this;
        }

        public Criteria andField4GreaterThanOrEqualTo(String value) {
            addCriterion("field4 >=", value, "field4");
            return (Criteria) this;
        }

        public Criteria andField4LessThan(String value) {
            addCriterion("field4 <", value, "field4");
            return (Criteria) this;
        }

        public Criteria andField4LessThanOrEqualTo(String value) {
            addCriterion("field4 <=", value, "field4");
            return (Criteria) this;
        }

        public Criteria andField4Like(String value) {
            addCriterion("field4 like", value, "field4");
            return (Criteria) this;
        }

        public Criteria andField4NotLike(String value) {
            addCriterion("field4 not like", value, "field4");
            return (Criteria) this;
        }

        public Criteria andField4In(List<String> values) {
            addCriterion("field4 in", values, "field4");
            return (Criteria) this;
        }

        public Criteria andField4NotIn(List<String> values) {
            addCriterion("field4 not in", values, "field4");
            return (Criteria) this;
        }

        public Criteria andField4Between(String value1, String value2) {
            addCriterion("field4 between", value1, value2, "field4");
            return (Criteria) this;
        }

        public Criteria andField4NotBetween(String value1, String value2) {
            addCriterion("field4 not between", value1, value2, "field4");
            return (Criteria) this;
        }

        public Criteria andField5IsNull() {
            addCriterion("field5 is null");
            return (Criteria) this;
        }

        public Criteria andField5IsNotNull() {
            addCriterion("field5 is not null");
            return (Criteria) this;
        }

        public Criteria andField5EqualTo(String value) {
            addCriterion("field5 =", value, "field5");
            return (Criteria) this;
        }

        public Criteria andField5NotEqualTo(String value) {
            addCriterion("field5 <>", value, "field5");
            return (Criteria) this;
        }

        public Criteria andField5GreaterThan(String value) {
            addCriterion("field5 >", value, "field5");
            return (Criteria) this;
        }

        public Criteria andField5GreaterThanOrEqualTo(String value) {
            addCriterion("field5 >=", value, "field5");
            return (Criteria) this;
        }

        public Criteria andField5LessThan(String value) {
            addCriterion("field5 <", value, "field5");
            return (Criteria) this;
        }

        public Criteria andField5LessThanOrEqualTo(String value) {
            addCriterion("field5 <=", value, "field5");
            return (Criteria) this;
        }

        public Criteria andField5Like(String value) {
            addCriterion("field5 like", value, "field5");
            return (Criteria) this;
        }

        public Criteria andField5NotLike(String value) {
            addCriterion("field5 not like", value, "field5");
            return (Criteria) this;
        }

        public Criteria andField5In(List<String> values) {
            addCriterion("field5 in", values, "field5");
            return (Criteria) this;
        }

        public Criteria andField5NotIn(List<String> values) {
            addCriterion("field5 not in", values, "field5");
            return (Criteria) this;
        }

        public Criteria andField5Between(String value1, String value2) {
            addCriterion("field5 between", value1, value2, "field5");
            return (Criteria) this;
        }

        public Criteria andField5NotBetween(String value1, String value2) {
            addCriterion("field5 not between", value1, value2, "field5");
            return (Criteria) this;
        }

        public Criteria andBank_return_msgIsNull() {
            addCriterion("bank_return_msg is null");
            return (Criteria) this;
        }

        public Criteria andBank_return_msgIsNotNull() {
            addCriterion("bank_return_msg is not null");
            return (Criteria) this;
        }

        public Criteria andBank_return_msgEqualTo(String value) {
            addCriterion("bank_return_msg =", value, "bank_return_msg");
            return (Criteria) this;
        }

        public Criteria andBank_return_msgNotEqualTo(String value) {
            addCriterion("bank_return_msg <>", value, "bank_return_msg");
            return (Criteria) this;
        }

        public Criteria andBank_return_msgGreaterThan(String value) {
            addCriterion("bank_return_msg >", value, "bank_return_msg");
            return (Criteria) this;
        }

        public Criteria andBank_return_msgGreaterThanOrEqualTo(String value) {
            addCriterion("bank_return_msg >=", value, "bank_return_msg");
            return (Criteria) this;
        }

        public Criteria andBank_return_msgLessThan(String value) {
            addCriterion("bank_return_msg <", value, "bank_return_msg");
            return (Criteria) this;
        }

        public Criteria andBank_return_msgLessThanOrEqualTo(String value) {
            addCriterion("bank_return_msg <=", value, "bank_return_msg");
            return (Criteria) this;
        }

        public Criteria andBank_return_msgLike(String value) {
            addCriterion("bank_return_msg like", value, "bank_return_msg");
            return (Criteria) this;
        }

        public Criteria andBank_return_msgNotLike(String value) {
            addCriterion("bank_return_msg not like", value, "bank_return_msg");
            return (Criteria) this;
        }

        public Criteria andBank_return_msgIn(List<String> values) {
            addCriterion("bank_return_msg in", values, "bank_return_msg");
            return (Criteria) this;
        }

        public Criteria andBank_return_msgNotIn(List<String> values) {
            addCriterion("bank_return_msg not in", values, "bank_return_msg");
            return (Criteria) this;
        }

        public Criteria andBank_return_msgBetween(String value1, String value2) {
            addCriterion("bank_return_msg between", value1, value2, "bank_return_msg");
            return (Criteria) this;
        }

        public Criteria andBank_return_msgNotBetween(String value1, String value2) {
            addCriterion("bank_return_msg not between", value1, value2, "bank_return_msg");
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