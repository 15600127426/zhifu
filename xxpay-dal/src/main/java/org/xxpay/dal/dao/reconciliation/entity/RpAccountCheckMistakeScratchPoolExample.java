package org.xxpay.dal.dao.reconciliation.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RpAccountCheckMistakeScratchPoolExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    private Integer limit;

    private Integer offset;

    public RpAccountCheckMistakeScratchPoolExample() {
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

        public Criteria andRefund_timesEqualTo(Short value) {
            addCriterion("refund_times =", value, "refund_times");
            return (Criteria) this;
        }

        public Criteria andRefund_timesNotEqualTo(Short value) {
            addCriterion("refund_times <>", value, "refund_times");
            return (Criteria) this;
        }

        public Criteria andRefund_timesGreaterThan(Short value) {
            addCriterion("refund_times >", value, "refund_times");
            return (Criteria) this;
        }

        public Criteria andRefund_timesGreaterThanOrEqualTo(Short value) {
            addCriterion("refund_times >=", value, "refund_times");
            return (Criteria) this;
        }

        public Criteria andRefund_timesLessThan(Short value) {
            addCriterion("refund_times <", value, "refund_times");
            return (Criteria) this;
        }

        public Criteria andRefund_timesLessThanOrEqualTo(Short value) {
            addCriterion("refund_times <=", value, "refund_times");
            return (Criteria) this;
        }

        public Criteria andRefund_timesIn(List<Short> values) {
            addCriterion("refund_times in", values, "refund_times");
            return (Criteria) this;
        }

        public Criteria andRefund_timesNotIn(List<Short> values) {
            addCriterion("refund_times not in", values, "refund_times");
            return (Criteria) this;
        }

        public Criteria andRefund_timesBetween(Short value1, Short value2) {
            addCriterion("refund_times between", value1, value2, "refund_times");
            return (Criteria) this;
        }

        public Criteria andRefund_timesNotBetween(Short value1, Short value2) {
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
            addCriterion("bill_date =", value, "bill_date");
            return (Criteria) this;
        }

        public Criteria andBill_dateNotEqualTo(Date value) {
            addCriterion("bill_date <>", value, "bill_date");
            return (Criteria) this;
        }

        public Criteria andBill_dateGreaterThan(Date value) {
            addCriterion("bill_date >", value, "bill_date");
            return (Criteria) this;
        }

        public Criteria andBill_dateGreaterThanOrEqualTo(Date value) {
            addCriterion("bill_date >=", value, "bill_date");
            return (Criteria) this;
        }

        public Criteria andBill_dateLessThan(Date value) {
            addCriterion("bill_date <", value, "bill_date");
            return (Criteria) this;
        }

        public Criteria andBill_dateLessThanOrEqualTo(Date value) {
            addCriterion("bill_date <=", value, "bill_date");
            return (Criteria) this;
        }

        public Criteria andBill_dateIn(List<Date> values) {
            addCriterion("bill_date in", values, "bill_date");
            return (Criteria) this;
        }

        public Criteria andBill_dateNotIn(List<Date> values) {
            addCriterion("bill_date not in", values, "bill_date");
            return (Criteria) this;
        }

        public Criteria andBill_dateBetween(Date value1, Date value2) {
            addCriterion("bill_date between", value1, value2, "bill_date");
            return (Criteria) this;
        }

        public Criteria andBill_dateNotBetween(Date value1, Date value2) {
            addCriterion("bill_date not between", value1, value2, "bill_date");
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