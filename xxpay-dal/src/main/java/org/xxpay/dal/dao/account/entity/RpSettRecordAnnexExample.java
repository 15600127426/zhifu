package org.xxpay.dal.dao.account.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RpSettRecordAnnexExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    private Integer limit;

    private Integer offset;

    public RpSettRecordAnnexExample() {
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

        public Criteria andIs_deleteIsNull() {
            addCriterion("is_delete is null");
            return (Criteria) this;
        }

        public Criteria andIs_deleteIsNotNull() {
            addCriterion("is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andIs_deleteEqualTo(String value) {
            addCriterion("is_delete =", value, "is_delete");
            return (Criteria) this;
        }

        public Criteria andIs_deleteNotEqualTo(String value) {
            addCriterion("is_delete <>", value, "is_delete");
            return (Criteria) this;
        }

        public Criteria andIs_deleteGreaterThan(String value) {
            addCriterion("is_delete >", value, "is_delete");
            return (Criteria) this;
        }

        public Criteria andIs_deleteGreaterThanOrEqualTo(String value) {
            addCriterion("is_delete >=", value, "is_delete");
            return (Criteria) this;
        }

        public Criteria andIs_deleteLessThan(String value) {
            addCriterion("is_delete <", value, "is_delete");
            return (Criteria) this;
        }

        public Criteria andIs_deleteLessThanOrEqualTo(String value) {
            addCriterion("is_delete <=", value, "is_delete");
            return (Criteria) this;
        }

        public Criteria andIs_deleteLike(String value) {
            addCriterion("is_delete like", value, "is_delete");
            return (Criteria) this;
        }

        public Criteria andIs_deleteNotLike(String value) {
            addCriterion("is_delete not like", value, "is_delete");
            return (Criteria) this;
        }

        public Criteria andIs_deleteIn(List<String> values) {
            addCriterion("is_delete in", values, "is_delete");
            return (Criteria) this;
        }

        public Criteria andIs_deleteNotIn(List<String> values) {
            addCriterion("is_delete not in", values, "is_delete");
            return (Criteria) this;
        }

        public Criteria andIs_deleteBetween(String value1, String value2) {
            addCriterion("is_delete between", value1, value2, "is_delete");
            return (Criteria) this;
        }

        public Criteria andIs_deleteNotBetween(String value1, String value2) {
            addCriterion("is_delete not between", value1, value2, "is_delete");
            return (Criteria) this;
        }

        public Criteria andAnnex_nameIsNull() {
            addCriterion("annex_name is null");
            return (Criteria) this;
        }

        public Criteria andAnnex_nameIsNotNull() {
            addCriterion("annex_name is not null");
            return (Criteria) this;
        }

        public Criteria andAnnex_nameEqualTo(String value) {
            addCriterion("annex_name =", value, "annex_name");
            return (Criteria) this;
        }

        public Criteria andAnnex_nameNotEqualTo(String value) {
            addCriterion("annex_name <>", value, "annex_name");
            return (Criteria) this;
        }

        public Criteria andAnnex_nameGreaterThan(String value) {
            addCriterion("annex_name >", value, "annex_name");
            return (Criteria) this;
        }

        public Criteria andAnnex_nameGreaterThanOrEqualTo(String value) {
            addCriterion("annex_name >=", value, "annex_name");
            return (Criteria) this;
        }

        public Criteria andAnnex_nameLessThan(String value) {
            addCriterion("annex_name <", value, "annex_name");
            return (Criteria) this;
        }

        public Criteria andAnnex_nameLessThanOrEqualTo(String value) {
            addCriterion("annex_name <=", value, "annex_name");
            return (Criteria) this;
        }

        public Criteria andAnnex_nameLike(String value) {
            addCriterion("annex_name like", value, "annex_name");
            return (Criteria) this;
        }

        public Criteria andAnnex_nameNotLike(String value) {
            addCriterion("annex_name not like", value, "annex_name");
            return (Criteria) this;
        }

        public Criteria andAnnex_nameIn(List<String> values) {
            addCriterion("annex_name in", values, "annex_name");
            return (Criteria) this;
        }

        public Criteria andAnnex_nameNotIn(List<String> values) {
            addCriterion("annex_name not in", values, "annex_name");
            return (Criteria) this;
        }

        public Criteria andAnnex_nameBetween(String value1, String value2) {
            addCriterion("annex_name between", value1, value2, "annex_name");
            return (Criteria) this;
        }

        public Criteria andAnnex_nameNotBetween(String value1, String value2) {
            addCriterion("annex_name not between", value1, value2, "annex_name");
            return (Criteria) this;
        }

        public Criteria andAnnex_addressIsNull() {
            addCriterion("annex_address is null");
            return (Criteria) this;
        }

        public Criteria andAnnex_addressIsNotNull() {
            addCriterion("annex_address is not null");
            return (Criteria) this;
        }

        public Criteria andAnnex_addressEqualTo(String value) {
            addCriterion("annex_address =", value, "annex_address");
            return (Criteria) this;
        }

        public Criteria andAnnex_addressNotEqualTo(String value) {
            addCriterion("annex_address <>", value, "annex_address");
            return (Criteria) this;
        }

        public Criteria andAnnex_addressGreaterThan(String value) {
            addCriterion("annex_address >", value, "annex_address");
            return (Criteria) this;
        }

        public Criteria andAnnex_addressGreaterThanOrEqualTo(String value) {
            addCriterion("annex_address >=", value, "annex_address");
            return (Criteria) this;
        }

        public Criteria andAnnex_addressLessThan(String value) {
            addCriterion("annex_address <", value, "annex_address");
            return (Criteria) this;
        }

        public Criteria andAnnex_addressLessThanOrEqualTo(String value) {
            addCriterion("annex_address <=", value, "annex_address");
            return (Criteria) this;
        }

        public Criteria andAnnex_addressLike(String value) {
            addCriterion("annex_address like", value, "annex_address");
            return (Criteria) this;
        }

        public Criteria andAnnex_addressNotLike(String value) {
            addCriterion("annex_address not like", value, "annex_address");
            return (Criteria) this;
        }

        public Criteria andAnnex_addressIn(List<String> values) {
            addCriterion("annex_address in", values, "annex_address");
            return (Criteria) this;
        }

        public Criteria andAnnex_addressNotIn(List<String> values) {
            addCriterion("annex_address not in", values, "annex_address");
            return (Criteria) this;
        }

        public Criteria andAnnex_addressBetween(String value1, String value2) {
            addCriterion("annex_address between", value1, value2, "annex_address");
            return (Criteria) this;
        }

        public Criteria andAnnex_addressNotBetween(String value1, String value2) {
            addCriterion("annex_address not between", value1, value2, "annex_address");
            return (Criteria) this;
        }

        public Criteria andSettlement_idIsNull() {
            addCriterion("settlement_id is null");
            return (Criteria) this;
        }

        public Criteria andSettlement_idIsNotNull() {
            addCriterion("settlement_id is not null");
            return (Criteria) this;
        }

        public Criteria andSettlement_idEqualTo(String value) {
            addCriterion("settlement_id =", value, "settlement_id");
            return (Criteria) this;
        }

        public Criteria andSettlement_idNotEqualTo(String value) {
            addCriterion("settlement_id <>", value, "settlement_id");
            return (Criteria) this;
        }

        public Criteria andSettlement_idGreaterThan(String value) {
            addCriterion("settlement_id >", value, "settlement_id");
            return (Criteria) this;
        }

        public Criteria andSettlement_idGreaterThanOrEqualTo(String value) {
            addCriterion("settlement_id >=", value, "settlement_id");
            return (Criteria) this;
        }

        public Criteria andSettlement_idLessThan(String value) {
            addCriterion("settlement_id <", value, "settlement_id");
            return (Criteria) this;
        }

        public Criteria andSettlement_idLessThanOrEqualTo(String value) {
            addCriterion("settlement_id <=", value, "settlement_id");
            return (Criteria) this;
        }

        public Criteria andSettlement_idLike(String value) {
            addCriterion("settlement_id like", value, "settlement_id");
            return (Criteria) this;
        }

        public Criteria andSettlement_idNotLike(String value) {
            addCriterion("settlement_id not like", value, "settlement_id");
            return (Criteria) this;
        }

        public Criteria andSettlement_idIn(List<String> values) {
            addCriterion("settlement_id in", values, "settlement_id");
            return (Criteria) this;
        }

        public Criteria andSettlement_idNotIn(List<String> values) {
            addCriterion("settlement_id not in", values, "settlement_id");
            return (Criteria) this;
        }

        public Criteria andSettlement_idBetween(String value1, String value2) {
            addCriterion("settlement_id between", value1, value2, "settlement_id");
            return (Criteria) this;
        }

        public Criteria andSettlement_idNotBetween(String value1, String value2) {
            addCriterion("settlement_id not between", value1, value2, "settlement_id");
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