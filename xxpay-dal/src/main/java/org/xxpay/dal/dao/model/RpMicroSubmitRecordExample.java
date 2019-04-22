package org.xxpay.dal.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RpMicroSubmitRecordExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    private Integer limit;

    private Integer offset;

    public RpMicroSubmitRecordExample() {
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

        public Criteria andBusiness_codeIsNull() {
            addCriterion("business_code is null");
            return (Criteria) this;
        }

        public Criteria andBusiness_codeIsNotNull() {
            addCriterion("business_code is not null");
            return (Criteria) this;
        }

        public Criteria andBusiness_codeEqualTo(String value) {
            addCriterion("business_code =", value, "business_code");
            return (Criteria) this;
        }

        public Criteria andBusiness_codeNotEqualTo(String value) {
            addCriterion("business_code <>", value, "business_code");
            return (Criteria) this;
        }

        public Criteria andBusiness_codeGreaterThan(String value) {
            addCriterion("business_code >", value, "business_code");
            return (Criteria) this;
        }

        public Criteria andBusiness_codeGreaterThanOrEqualTo(String value) {
            addCriterion("business_code >=", value, "business_code");
            return (Criteria) this;
        }

        public Criteria andBusiness_codeLessThan(String value) {
            addCriterion("business_code <", value, "business_code");
            return (Criteria) this;
        }

        public Criteria andBusiness_codeLessThanOrEqualTo(String value) {
            addCriterion("business_code <=", value, "business_code");
            return (Criteria) this;
        }

        public Criteria andBusiness_codeLike(String value) {
            addCriterion("business_code like", value, "business_code");
            return (Criteria) this;
        }

        public Criteria andBusiness_codeNotLike(String value) {
            addCriterion("business_code not like", value, "business_code");
            return (Criteria) this;
        }

        public Criteria andBusiness_codeIn(List<String> values) {
            addCriterion("business_code in", values, "business_code");
            return (Criteria) this;
        }

        public Criteria andBusiness_codeNotIn(List<String> values) {
            addCriterion("business_code not in", values, "business_code");
            return (Criteria) this;
        }

        public Criteria andBusiness_codeBetween(String value1, String value2) {
            addCriterion("business_code between", value1, value2, "business_code");
            return (Criteria) this;
        }

        public Criteria andBusiness_codeNotBetween(String value1, String value2) {
            addCriterion("business_code not between", value1, value2, "business_code");
            return (Criteria) this;
        }

        public Criteria andSub_mch_idIsNull() {
            addCriterion("sub_mch_id is null");
            return (Criteria) this;
        }

        public Criteria andSub_mch_idIsNotNull() {
            addCriterion("sub_mch_id is not null");
            return (Criteria) this;
        }

        public Criteria andSub_mch_idEqualTo(String value) {
            addCriterion("sub_mch_id =", value, "sub_mch_id");
            return (Criteria) this;
        }

        public Criteria andSub_mch_idNotEqualTo(String value) {
            addCriterion("sub_mch_id <>", value, "sub_mch_id");
            return (Criteria) this;
        }

        public Criteria andSub_mch_idGreaterThan(String value) {
            addCriterion("sub_mch_id >", value, "sub_mch_id");
            return (Criteria) this;
        }

        public Criteria andSub_mch_idGreaterThanOrEqualTo(String value) {
            addCriterion("sub_mch_id >=", value, "sub_mch_id");
            return (Criteria) this;
        }

        public Criteria andSub_mch_idLessThan(String value) {
            addCriterion("sub_mch_id <", value, "sub_mch_id");
            return (Criteria) this;
        }

        public Criteria andSub_mch_idLessThanOrEqualTo(String value) {
            addCriterion("sub_mch_id <=", value, "sub_mch_id");
            return (Criteria) this;
        }

        public Criteria andSub_mch_idLike(String value) {
            addCriterion("sub_mch_id like", value, "sub_mch_id");
            return (Criteria) this;
        }

        public Criteria andSub_mch_idNotLike(String value) {
            addCriterion("sub_mch_id not like", value, "sub_mch_id");
            return (Criteria) this;
        }

        public Criteria andSub_mch_idIn(List<String> values) {
            addCriterion("sub_mch_id in", values, "sub_mch_id");
            return (Criteria) this;
        }

        public Criteria andSub_mch_idNotIn(List<String> values) {
            addCriterion("sub_mch_id not in", values, "sub_mch_id");
            return (Criteria) this;
        }

        public Criteria andSub_mch_idBetween(String value1, String value2) {
            addCriterion("sub_mch_id between", value1, value2, "sub_mch_id");
            return (Criteria) this;
        }

        public Criteria andSub_mch_idNotBetween(String value1, String value2) {
            addCriterion("sub_mch_id not between", value1, value2, "sub_mch_id");
            return (Criteria) this;
        }

        public Criteria andId_card_copyIsNull() {
            addCriterion("id_card_copy is null");
            return (Criteria) this;
        }

        public Criteria andId_card_copyIsNotNull() {
            addCriterion("id_card_copy is not null");
            return (Criteria) this;
        }

        public Criteria andId_card_copyEqualTo(String value) {
            addCriterion("id_card_copy =", value, "id_card_copy");
            return (Criteria) this;
        }

        public Criteria andId_card_copyNotEqualTo(String value) {
            addCriterion("id_card_copy <>", value, "id_card_copy");
            return (Criteria) this;
        }

        public Criteria andId_card_copyGreaterThan(String value) {
            addCriterion("id_card_copy >", value, "id_card_copy");
            return (Criteria) this;
        }

        public Criteria andId_card_copyGreaterThanOrEqualTo(String value) {
            addCriterion("id_card_copy >=", value, "id_card_copy");
            return (Criteria) this;
        }

        public Criteria andId_card_copyLessThan(String value) {
            addCriterion("id_card_copy <", value, "id_card_copy");
            return (Criteria) this;
        }

        public Criteria andId_card_copyLessThanOrEqualTo(String value) {
            addCriterion("id_card_copy <=", value, "id_card_copy");
            return (Criteria) this;
        }

        public Criteria andId_card_copyLike(String value) {
            addCriterion("id_card_copy like", value, "id_card_copy");
            return (Criteria) this;
        }

        public Criteria andId_card_copyNotLike(String value) {
            addCriterion("id_card_copy not like", value, "id_card_copy");
            return (Criteria) this;
        }

        public Criteria andId_card_copyIn(List<String> values) {
            addCriterion("id_card_copy in", values, "id_card_copy");
            return (Criteria) this;
        }

        public Criteria andId_card_copyNotIn(List<String> values) {
            addCriterion("id_card_copy not in", values, "id_card_copy");
            return (Criteria) this;
        }

        public Criteria andId_card_copyBetween(String value1, String value2) {
            addCriterion("id_card_copy between", value1, value2, "id_card_copy");
            return (Criteria) this;
        }

        public Criteria andId_card_copyNotBetween(String value1, String value2) {
            addCriterion("id_card_copy not between", value1, value2, "id_card_copy");
            return (Criteria) this;
        }

        public Criteria andId_card_nationalIsNull() {
            addCriterion("id_card_national is null");
            return (Criteria) this;
        }

        public Criteria andId_card_nationalIsNotNull() {
            addCriterion("id_card_national is not null");
            return (Criteria) this;
        }

        public Criteria andId_card_nationalEqualTo(String value) {
            addCriterion("id_card_national =", value, "id_card_national");
            return (Criteria) this;
        }

        public Criteria andId_card_nationalNotEqualTo(String value) {
            addCriterion("id_card_national <>", value, "id_card_national");
            return (Criteria) this;
        }

        public Criteria andId_card_nationalGreaterThan(String value) {
            addCriterion("id_card_national >", value, "id_card_national");
            return (Criteria) this;
        }

        public Criteria andId_card_nationalGreaterThanOrEqualTo(String value) {
            addCriterion("id_card_national >=", value, "id_card_national");
            return (Criteria) this;
        }

        public Criteria andId_card_nationalLessThan(String value) {
            addCriterion("id_card_national <", value, "id_card_national");
            return (Criteria) this;
        }

        public Criteria andId_card_nationalLessThanOrEqualTo(String value) {
            addCriterion("id_card_national <=", value, "id_card_national");
            return (Criteria) this;
        }

        public Criteria andId_card_nationalLike(String value) {
            addCriterion("id_card_national like", value, "id_card_national");
            return (Criteria) this;
        }

        public Criteria andId_card_nationalNotLike(String value) {
            addCriterion("id_card_national not like", value, "id_card_national");
            return (Criteria) this;
        }

        public Criteria andId_card_nationalIn(List<String> values) {
            addCriterion("id_card_national in", values, "id_card_national");
            return (Criteria) this;
        }

        public Criteria andId_card_nationalNotIn(List<String> values) {
            addCriterion("id_card_national not in", values, "id_card_national");
            return (Criteria) this;
        }

        public Criteria andId_card_nationalBetween(String value1, String value2) {
            addCriterion("id_card_national between", value1, value2, "id_card_national");
            return (Criteria) this;
        }

        public Criteria andId_card_nationalNotBetween(String value1, String value2) {
            addCriterion("id_card_national not between", value1, value2, "id_card_national");
            return (Criteria) this;
        }

        public Criteria andId_card_nameIsNull() {
            addCriterion("id_card_name is null");
            return (Criteria) this;
        }

        public Criteria andId_card_nameIsNotNull() {
            addCriterion("id_card_name is not null");
            return (Criteria) this;
        }

        public Criteria andId_card_nameEqualTo(String value) {
            addCriterion("id_card_name =", value, "id_card_name");
            return (Criteria) this;
        }

        public Criteria andId_card_nameNotEqualTo(String value) {
            addCriterion("id_card_name <>", value, "id_card_name");
            return (Criteria) this;
        }

        public Criteria andId_card_nameGreaterThan(String value) {
            addCriterion("id_card_name >", value, "id_card_name");
            return (Criteria) this;
        }

        public Criteria andId_card_nameGreaterThanOrEqualTo(String value) {
            addCriterion("id_card_name >=", value, "id_card_name");
            return (Criteria) this;
        }

        public Criteria andId_card_nameLessThan(String value) {
            addCriterion("id_card_name <", value, "id_card_name");
            return (Criteria) this;
        }

        public Criteria andId_card_nameLessThanOrEqualTo(String value) {
            addCriterion("id_card_name <=", value, "id_card_name");
            return (Criteria) this;
        }

        public Criteria andId_card_nameLike(String value) {
            addCriterion("id_card_name like", value, "id_card_name");
            return (Criteria) this;
        }

        public Criteria andId_card_nameNotLike(String value) {
            addCriterion("id_card_name not like", value, "id_card_name");
            return (Criteria) this;
        }

        public Criteria andId_card_nameIn(List<String> values) {
            addCriterion("id_card_name in", values, "id_card_name");
            return (Criteria) this;
        }

        public Criteria andId_card_nameNotIn(List<String> values) {
            addCriterion("id_card_name not in", values, "id_card_name");
            return (Criteria) this;
        }

        public Criteria andId_card_nameBetween(String value1, String value2) {
            addCriterion("id_card_name between", value1, value2, "id_card_name");
            return (Criteria) this;
        }

        public Criteria andId_card_nameNotBetween(String value1, String value2) {
            addCriterion("id_card_name not between", value1, value2, "id_card_name");
            return (Criteria) this;
        }

        public Criteria andId_card_numberIsNull() {
            addCriterion("id_card_number is null");
            return (Criteria) this;
        }

        public Criteria andId_card_numberIsNotNull() {
            addCriterion("id_card_number is not null");
            return (Criteria) this;
        }

        public Criteria andId_card_numberEqualTo(String value) {
            addCriterion("id_card_number =", value, "id_card_number");
            return (Criteria) this;
        }

        public Criteria andId_card_numberNotEqualTo(String value) {
            addCriterion("id_card_number <>", value, "id_card_number");
            return (Criteria) this;
        }

        public Criteria andId_card_numberGreaterThan(String value) {
            addCriterion("id_card_number >", value, "id_card_number");
            return (Criteria) this;
        }

        public Criteria andId_card_numberGreaterThanOrEqualTo(String value) {
            addCriterion("id_card_number >=", value, "id_card_number");
            return (Criteria) this;
        }

        public Criteria andId_card_numberLessThan(String value) {
            addCriterion("id_card_number <", value, "id_card_number");
            return (Criteria) this;
        }

        public Criteria andId_card_numberLessThanOrEqualTo(String value) {
            addCriterion("id_card_number <=", value, "id_card_number");
            return (Criteria) this;
        }

        public Criteria andId_card_numberLike(String value) {
            addCriterion("id_card_number like", value, "id_card_number");
            return (Criteria) this;
        }

        public Criteria andId_card_numberNotLike(String value) {
            addCriterion("id_card_number not like", value, "id_card_number");
            return (Criteria) this;
        }

        public Criteria andId_card_numberIn(List<String> values) {
            addCriterion("id_card_number in", values, "id_card_number");
            return (Criteria) this;
        }

        public Criteria andId_card_numberNotIn(List<String> values) {
            addCriterion("id_card_number not in", values, "id_card_number");
            return (Criteria) this;
        }

        public Criteria andId_card_numberBetween(String value1, String value2) {
            addCriterion("id_card_number between", value1, value2, "id_card_number");
            return (Criteria) this;
        }

        public Criteria andId_card_numberNotBetween(String value1, String value2) {
            addCriterion("id_card_number not between", value1, value2, "id_card_number");
            return (Criteria) this;
        }

        public Criteria andId_card_valid_timeIsNull() {
            addCriterion("id_card_valid_time is null");
            return (Criteria) this;
        }

        public Criteria andId_card_valid_timeIsNotNull() {
            addCriterion("id_card_valid_time is not null");
            return (Criteria) this;
        }

        public Criteria andId_card_valid_timeEqualTo(String value) {
            addCriterion("id_card_valid_time =", value, "id_card_valid_time");
            return (Criteria) this;
        }

        public Criteria andId_card_valid_timeNotEqualTo(String value) {
            addCriterion("id_card_valid_time <>", value, "id_card_valid_time");
            return (Criteria) this;
        }

        public Criteria andId_card_valid_timeGreaterThan(String value) {
            addCriterion("id_card_valid_time >", value, "id_card_valid_time");
            return (Criteria) this;
        }

        public Criteria andId_card_valid_timeGreaterThanOrEqualTo(String value) {
            addCriterion("id_card_valid_time >=", value, "id_card_valid_time");
            return (Criteria) this;
        }

        public Criteria andId_card_valid_timeLessThan(String value) {
            addCriterion("id_card_valid_time <", value, "id_card_valid_time");
            return (Criteria) this;
        }

        public Criteria andId_card_valid_timeLessThanOrEqualTo(String value) {
            addCriterion("id_card_valid_time <=", value, "id_card_valid_time");
            return (Criteria) this;
        }

        public Criteria andId_card_valid_timeLike(String value) {
            addCriterion("id_card_valid_time like", value, "id_card_valid_time");
            return (Criteria) this;
        }

        public Criteria andId_card_valid_timeNotLike(String value) {
            addCriterion("id_card_valid_time not like", value, "id_card_valid_time");
            return (Criteria) this;
        }

        public Criteria andId_card_valid_timeIn(List<String> values) {
            addCriterion("id_card_valid_time in", values, "id_card_valid_time");
            return (Criteria) this;
        }

        public Criteria andId_card_valid_timeNotIn(List<String> values) {
            addCriterion("id_card_valid_time not in", values, "id_card_valid_time");
            return (Criteria) this;
        }

        public Criteria andId_card_valid_timeBetween(String value1, String value2) {
            addCriterion("id_card_valid_time between", value1, value2, "id_card_valid_time");
            return (Criteria) this;
        }

        public Criteria andId_card_valid_timeNotBetween(String value1, String value2) {
            addCriterion("id_card_valid_time not between", value1, value2, "id_card_valid_time");
            return (Criteria) this;
        }

        public Criteria andAccount_bankIsNull() {
            addCriterion("account_bank is null");
            return (Criteria) this;
        }

        public Criteria andAccount_bankIsNotNull() {
            addCriterion("account_bank is not null");
            return (Criteria) this;
        }

        public Criteria andAccount_bankEqualTo(String value) {
            addCriterion("account_bank =", value, "account_bank");
            return (Criteria) this;
        }

        public Criteria andAccount_bankNotEqualTo(String value) {
            addCriterion("account_bank <>", value, "account_bank");
            return (Criteria) this;
        }

        public Criteria andAccount_bankGreaterThan(String value) {
            addCriterion("account_bank >", value, "account_bank");
            return (Criteria) this;
        }

        public Criteria andAccount_bankGreaterThanOrEqualTo(String value) {
            addCriterion("account_bank >=", value, "account_bank");
            return (Criteria) this;
        }

        public Criteria andAccount_bankLessThan(String value) {
            addCriterion("account_bank <", value, "account_bank");
            return (Criteria) this;
        }

        public Criteria andAccount_bankLessThanOrEqualTo(String value) {
            addCriterion("account_bank <=", value, "account_bank");
            return (Criteria) this;
        }

        public Criteria andAccount_bankLike(String value) {
            addCriterion("account_bank like", value, "account_bank");
            return (Criteria) this;
        }

        public Criteria andAccount_bankNotLike(String value) {
            addCriterion("account_bank not like", value, "account_bank");
            return (Criteria) this;
        }

        public Criteria andAccount_bankIn(List<String> values) {
            addCriterion("account_bank in", values, "account_bank");
            return (Criteria) this;
        }

        public Criteria andAccount_bankNotIn(List<String> values) {
            addCriterion("account_bank not in", values, "account_bank");
            return (Criteria) this;
        }

        public Criteria andAccount_bankBetween(String value1, String value2) {
            addCriterion("account_bank between", value1, value2, "account_bank");
            return (Criteria) this;
        }

        public Criteria andAccount_bankNotBetween(String value1, String value2) {
            addCriterion("account_bank not between", value1, value2, "account_bank");
            return (Criteria) this;
        }

        public Criteria andBank_address_codeIsNull() {
            addCriterion("bank_address_code is null");
            return (Criteria) this;
        }

        public Criteria andBank_address_codeIsNotNull() {
            addCriterion("bank_address_code is not null");
            return (Criteria) this;
        }

        public Criteria andBank_address_codeEqualTo(String value) {
            addCriterion("bank_address_code =", value, "bank_address_code");
            return (Criteria) this;
        }

        public Criteria andBank_address_codeNotEqualTo(String value) {
            addCriterion("bank_address_code <>", value, "bank_address_code");
            return (Criteria) this;
        }

        public Criteria andBank_address_codeGreaterThan(String value) {
            addCriterion("bank_address_code >", value, "bank_address_code");
            return (Criteria) this;
        }

        public Criteria andBank_address_codeGreaterThanOrEqualTo(String value) {
            addCriterion("bank_address_code >=", value, "bank_address_code");
            return (Criteria) this;
        }

        public Criteria andBank_address_codeLessThan(String value) {
            addCriterion("bank_address_code <", value, "bank_address_code");
            return (Criteria) this;
        }

        public Criteria andBank_address_codeLessThanOrEqualTo(String value) {
            addCriterion("bank_address_code <=", value, "bank_address_code");
            return (Criteria) this;
        }

        public Criteria andBank_address_codeLike(String value) {
            addCriterion("bank_address_code like", value, "bank_address_code");
            return (Criteria) this;
        }

        public Criteria andBank_address_codeNotLike(String value) {
            addCriterion("bank_address_code not like", value, "bank_address_code");
            return (Criteria) this;
        }

        public Criteria andBank_address_codeIn(List<String> values) {
            addCriterion("bank_address_code in", values, "bank_address_code");
            return (Criteria) this;
        }

        public Criteria andBank_address_codeNotIn(List<String> values) {
            addCriterion("bank_address_code not in", values, "bank_address_code");
            return (Criteria) this;
        }

        public Criteria andBank_address_codeBetween(String value1, String value2) {
            addCriterion("bank_address_code between", value1, value2, "bank_address_code");
            return (Criteria) this;
        }

        public Criteria andBank_address_codeNotBetween(String value1, String value2) {
            addCriterion("bank_address_code not between", value1, value2, "bank_address_code");
            return (Criteria) this;
        }

        public Criteria andAccount_numberIsNull() {
            addCriterion("account_number is null");
            return (Criteria) this;
        }

        public Criteria andAccount_numberIsNotNull() {
            addCriterion("account_number is not null");
            return (Criteria) this;
        }

        public Criteria andAccount_numberEqualTo(String value) {
            addCriterion("account_number =", value, "account_number");
            return (Criteria) this;
        }

        public Criteria andAccount_numberNotEqualTo(String value) {
            addCriterion("account_number <>", value, "account_number");
            return (Criteria) this;
        }

        public Criteria andAccount_numberGreaterThan(String value) {
            addCriterion("account_number >", value, "account_number");
            return (Criteria) this;
        }

        public Criteria andAccount_numberGreaterThanOrEqualTo(String value) {
            addCriterion("account_number >=", value, "account_number");
            return (Criteria) this;
        }

        public Criteria andAccount_numberLessThan(String value) {
            addCriterion("account_number <", value, "account_number");
            return (Criteria) this;
        }

        public Criteria andAccount_numberLessThanOrEqualTo(String value) {
            addCriterion("account_number <=", value, "account_number");
            return (Criteria) this;
        }

        public Criteria andAccount_numberLike(String value) {
            addCriterion("account_number like", value, "account_number");
            return (Criteria) this;
        }

        public Criteria andAccount_numberNotLike(String value) {
            addCriterion("account_number not like", value, "account_number");
            return (Criteria) this;
        }

        public Criteria andAccount_numberIn(List<String> values) {
            addCriterion("account_number in", values, "account_number");
            return (Criteria) this;
        }

        public Criteria andAccount_numberNotIn(List<String> values) {
            addCriterion("account_number not in", values, "account_number");
            return (Criteria) this;
        }

        public Criteria andAccount_numberBetween(String value1, String value2) {
            addCriterion("account_number between", value1, value2, "account_number");
            return (Criteria) this;
        }

        public Criteria andAccount_numberNotBetween(String value1, String value2) {
            addCriterion("account_number not between", value1, value2, "account_number");
            return (Criteria) this;
        }

        public Criteria andStore_nameIsNull() {
            addCriterion("store_name is null");
            return (Criteria) this;
        }

        public Criteria andStore_nameIsNotNull() {
            addCriterion("store_name is not null");
            return (Criteria) this;
        }

        public Criteria andStore_nameEqualTo(String value) {
            addCriterion("store_name =", value, "store_name");
            return (Criteria) this;
        }

        public Criteria andStore_nameNotEqualTo(String value) {
            addCriterion("store_name <>", value, "store_name");
            return (Criteria) this;
        }

        public Criteria andStore_nameGreaterThan(String value) {
            addCriterion("store_name >", value, "store_name");
            return (Criteria) this;
        }

        public Criteria andStore_nameGreaterThanOrEqualTo(String value) {
            addCriterion("store_name >=", value, "store_name");
            return (Criteria) this;
        }

        public Criteria andStore_nameLessThan(String value) {
            addCriterion("store_name <", value, "store_name");
            return (Criteria) this;
        }

        public Criteria andStore_nameLessThanOrEqualTo(String value) {
            addCriterion("store_name <=", value, "store_name");
            return (Criteria) this;
        }

        public Criteria andStore_nameLike(String value) {
            addCriterion("store_name like", value, "store_name");
            return (Criteria) this;
        }

        public Criteria andStore_nameNotLike(String value) {
            addCriterion("store_name not like", value, "store_name");
            return (Criteria) this;
        }

        public Criteria andStore_nameIn(List<String> values) {
            addCriterion("store_name in", values, "store_name");
            return (Criteria) this;
        }

        public Criteria andStore_nameNotIn(List<String> values) {
            addCriterion("store_name not in", values, "store_name");
            return (Criteria) this;
        }

        public Criteria andStore_nameBetween(String value1, String value2) {
            addCriterion("store_name between", value1, value2, "store_name");
            return (Criteria) this;
        }

        public Criteria andStore_nameNotBetween(String value1, String value2) {
            addCriterion("store_name not between", value1, value2, "store_name");
            return (Criteria) this;
        }

        public Criteria andStore_address_codeIsNull() {
            addCriterion("store_address_code is null");
            return (Criteria) this;
        }

        public Criteria andStore_address_codeIsNotNull() {
            addCriterion("store_address_code is not null");
            return (Criteria) this;
        }

        public Criteria andStore_address_codeEqualTo(String value) {
            addCriterion("store_address_code =", value, "store_address_code");
            return (Criteria) this;
        }

        public Criteria andStore_address_codeNotEqualTo(String value) {
            addCriterion("store_address_code <>", value, "store_address_code");
            return (Criteria) this;
        }

        public Criteria andStore_address_codeGreaterThan(String value) {
            addCriterion("store_address_code >", value, "store_address_code");
            return (Criteria) this;
        }

        public Criteria andStore_address_codeGreaterThanOrEqualTo(String value) {
            addCriterion("store_address_code >=", value, "store_address_code");
            return (Criteria) this;
        }

        public Criteria andStore_address_codeLessThan(String value) {
            addCriterion("store_address_code <", value, "store_address_code");
            return (Criteria) this;
        }

        public Criteria andStore_address_codeLessThanOrEqualTo(String value) {
            addCriterion("store_address_code <=", value, "store_address_code");
            return (Criteria) this;
        }

        public Criteria andStore_address_codeLike(String value) {
            addCriterion("store_address_code like", value, "store_address_code");
            return (Criteria) this;
        }

        public Criteria andStore_address_codeNotLike(String value) {
            addCriterion("store_address_code not like", value, "store_address_code");
            return (Criteria) this;
        }

        public Criteria andStore_address_codeIn(List<String> values) {
            addCriterion("store_address_code in", values, "store_address_code");
            return (Criteria) this;
        }

        public Criteria andStore_address_codeNotIn(List<String> values) {
            addCriterion("store_address_code not in", values, "store_address_code");
            return (Criteria) this;
        }

        public Criteria andStore_address_codeBetween(String value1, String value2) {
            addCriterion("store_address_code between", value1, value2, "store_address_code");
            return (Criteria) this;
        }

        public Criteria andStore_address_codeNotBetween(String value1, String value2) {
            addCriterion("store_address_code not between", value1, value2, "store_address_code");
            return (Criteria) this;
        }

        public Criteria andStore_streetIsNull() {
            addCriterion("store_street is null");
            return (Criteria) this;
        }

        public Criteria andStore_streetIsNotNull() {
            addCriterion("store_street is not null");
            return (Criteria) this;
        }

        public Criteria andStore_streetEqualTo(String value) {
            addCriterion("store_street =", value, "store_street");
            return (Criteria) this;
        }

        public Criteria andStore_streetNotEqualTo(String value) {
            addCriterion("store_street <>", value, "store_street");
            return (Criteria) this;
        }

        public Criteria andStore_streetGreaterThan(String value) {
            addCriterion("store_street >", value, "store_street");
            return (Criteria) this;
        }

        public Criteria andStore_streetGreaterThanOrEqualTo(String value) {
            addCriterion("store_street >=", value, "store_street");
            return (Criteria) this;
        }

        public Criteria andStore_streetLessThan(String value) {
            addCriterion("store_street <", value, "store_street");
            return (Criteria) this;
        }

        public Criteria andStore_streetLessThanOrEqualTo(String value) {
            addCriterion("store_street <=", value, "store_street");
            return (Criteria) this;
        }

        public Criteria andStore_streetLike(String value) {
            addCriterion("store_street like", value, "store_street");
            return (Criteria) this;
        }

        public Criteria andStore_streetNotLike(String value) {
            addCriterion("store_street not like", value, "store_street");
            return (Criteria) this;
        }

        public Criteria andStore_streetIn(List<String> values) {
            addCriterion("store_street in", values, "store_street");
            return (Criteria) this;
        }

        public Criteria andStore_streetNotIn(List<String> values) {
            addCriterion("store_street not in", values, "store_street");
            return (Criteria) this;
        }

        public Criteria andStore_streetBetween(String value1, String value2) {
            addCriterion("store_street between", value1, value2, "store_street");
            return (Criteria) this;
        }

        public Criteria andStore_streetNotBetween(String value1, String value2) {
            addCriterion("store_street not between", value1, value2, "store_street");
            return (Criteria) this;
        }

        public Criteria andStore_entrance_picIsNull() {
            addCriterion("store_entrance_pic is null");
            return (Criteria) this;
        }

        public Criteria andStore_entrance_picIsNotNull() {
            addCriterion("store_entrance_pic is not null");
            return (Criteria) this;
        }

        public Criteria andStore_entrance_picEqualTo(String value) {
            addCriterion("store_entrance_pic =", value, "store_entrance_pic");
            return (Criteria) this;
        }

        public Criteria andStore_entrance_picNotEqualTo(String value) {
            addCriterion("store_entrance_pic <>", value, "store_entrance_pic");
            return (Criteria) this;
        }

        public Criteria andStore_entrance_picGreaterThan(String value) {
            addCriterion("store_entrance_pic >", value, "store_entrance_pic");
            return (Criteria) this;
        }

        public Criteria andStore_entrance_picGreaterThanOrEqualTo(String value) {
            addCriterion("store_entrance_pic >=", value, "store_entrance_pic");
            return (Criteria) this;
        }

        public Criteria andStore_entrance_picLessThan(String value) {
            addCriterion("store_entrance_pic <", value, "store_entrance_pic");
            return (Criteria) this;
        }

        public Criteria andStore_entrance_picLessThanOrEqualTo(String value) {
            addCriterion("store_entrance_pic <=", value, "store_entrance_pic");
            return (Criteria) this;
        }

        public Criteria andStore_entrance_picLike(String value) {
            addCriterion("store_entrance_pic like", value, "store_entrance_pic");
            return (Criteria) this;
        }

        public Criteria andStore_entrance_picNotLike(String value) {
            addCriterion("store_entrance_pic not like", value, "store_entrance_pic");
            return (Criteria) this;
        }

        public Criteria andStore_entrance_picIn(List<String> values) {
            addCriterion("store_entrance_pic in", values, "store_entrance_pic");
            return (Criteria) this;
        }

        public Criteria andStore_entrance_picNotIn(List<String> values) {
            addCriterion("store_entrance_pic not in", values, "store_entrance_pic");
            return (Criteria) this;
        }

        public Criteria andStore_entrance_picBetween(String value1, String value2) {
            addCriterion("store_entrance_pic between", value1, value2, "store_entrance_pic");
            return (Criteria) this;
        }

        public Criteria andStore_entrance_picNotBetween(String value1, String value2) {
            addCriterion("store_entrance_pic not between", value1, value2, "store_entrance_pic");
            return (Criteria) this;
        }

        public Criteria andIndoor_picIsNull() {
            addCriterion("indoor_pic is null");
            return (Criteria) this;
        }

        public Criteria andIndoor_picIsNotNull() {
            addCriterion("indoor_pic is not null");
            return (Criteria) this;
        }

        public Criteria andIndoor_picEqualTo(String value) {
            addCriterion("indoor_pic =", value, "indoor_pic");
            return (Criteria) this;
        }

        public Criteria andIndoor_picNotEqualTo(String value) {
            addCriterion("indoor_pic <>", value, "indoor_pic");
            return (Criteria) this;
        }

        public Criteria andIndoor_picGreaterThan(String value) {
            addCriterion("indoor_pic >", value, "indoor_pic");
            return (Criteria) this;
        }

        public Criteria andIndoor_picGreaterThanOrEqualTo(String value) {
            addCriterion("indoor_pic >=", value, "indoor_pic");
            return (Criteria) this;
        }

        public Criteria andIndoor_picLessThan(String value) {
            addCriterion("indoor_pic <", value, "indoor_pic");
            return (Criteria) this;
        }

        public Criteria andIndoor_picLessThanOrEqualTo(String value) {
            addCriterion("indoor_pic <=", value, "indoor_pic");
            return (Criteria) this;
        }

        public Criteria andIndoor_picLike(String value) {
            addCriterion("indoor_pic like", value, "indoor_pic");
            return (Criteria) this;
        }

        public Criteria andIndoor_picNotLike(String value) {
            addCriterion("indoor_pic not like", value, "indoor_pic");
            return (Criteria) this;
        }

        public Criteria andIndoor_picIn(List<String> values) {
            addCriterion("indoor_pic in", values, "indoor_pic");
            return (Criteria) this;
        }

        public Criteria andIndoor_picNotIn(List<String> values) {
            addCriterion("indoor_pic not in", values, "indoor_pic");
            return (Criteria) this;
        }

        public Criteria andIndoor_picBetween(String value1, String value2) {
            addCriterion("indoor_pic between", value1, value2, "indoor_pic");
            return (Criteria) this;
        }

        public Criteria andIndoor_picNotBetween(String value1, String value2) {
            addCriterion("indoor_pic not between", value1, value2, "indoor_pic");
            return (Criteria) this;
        }

        public Criteria andMerchant_shortnameIsNull() {
            addCriterion("merchant_shortname is null");
            return (Criteria) this;
        }

        public Criteria andMerchant_shortnameIsNotNull() {
            addCriterion("merchant_shortname is not null");
            return (Criteria) this;
        }

        public Criteria andMerchant_shortnameEqualTo(String value) {
            addCriterion("merchant_shortname =", value, "merchant_shortname");
            return (Criteria) this;
        }

        public Criteria andMerchant_shortnameNotEqualTo(String value) {
            addCriterion("merchant_shortname <>", value, "merchant_shortname");
            return (Criteria) this;
        }

        public Criteria andMerchant_shortnameGreaterThan(String value) {
            addCriterion("merchant_shortname >", value, "merchant_shortname");
            return (Criteria) this;
        }

        public Criteria andMerchant_shortnameGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_shortname >=", value, "merchant_shortname");
            return (Criteria) this;
        }

        public Criteria andMerchant_shortnameLessThan(String value) {
            addCriterion("merchant_shortname <", value, "merchant_shortname");
            return (Criteria) this;
        }

        public Criteria andMerchant_shortnameLessThanOrEqualTo(String value) {
            addCriterion("merchant_shortname <=", value, "merchant_shortname");
            return (Criteria) this;
        }

        public Criteria andMerchant_shortnameLike(String value) {
            addCriterion("merchant_shortname like", value, "merchant_shortname");
            return (Criteria) this;
        }

        public Criteria andMerchant_shortnameNotLike(String value) {
            addCriterion("merchant_shortname not like", value, "merchant_shortname");
            return (Criteria) this;
        }

        public Criteria andMerchant_shortnameIn(List<String> values) {
            addCriterion("merchant_shortname in", values, "merchant_shortname");
            return (Criteria) this;
        }

        public Criteria andMerchant_shortnameNotIn(List<String> values) {
            addCriterion("merchant_shortname not in", values, "merchant_shortname");
            return (Criteria) this;
        }

        public Criteria andMerchant_shortnameBetween(String value1, String value2) {
            addCriterion("merchant_shortname between", value1, value2, "merchant_shortname");
            return (Criteria) this;
        }

        public Criteria andMerchant_shortnameNotBetween(String value1, String value2) {
            addCriterion("merchant_shortname not between", value1, value2, "merchant_shortname");
            return (Criteria) this;
        }

        public Criteria andService_phoneIsNull() {
            addCriterion("service_phone is null");
            return (Criteria) this;
        }

        public Criteria andService_phoneIsNotNull() {
            addCriterion("service_phone is not null");
            return (Criteria) this;
        }

        public Criteria andService_phoneEqualTo(String value) {
            addCriterion("service_phone =", value, "service_phone");
            return (Criteria) this;
        }

        public Criteria andService_phoneNotEqualTo(String value) {
            addCriterion("service_phone <>", value, "service_phone");
            return (Criteria) this;
        }

        public Criteria andService_phoneGreaterThan(String value) {
            addCriterion("service_phone >", value, "service_phone");
            return (Criteria) this;
        }

        public Criteria andService_phoneGreaterThanOrEqualTo(String value) {
            addCriterion("service_phone >=", value, "service_phone");
            return (Criteria) this;
        }

        public Criteria andService_phoneLessThan(String value) {
            addCriterion("service_phone <", value, "service_phone");
            return (Criteria) this;
        }

        public Criteria andService_phoneLessThanOrEqualTo(String value) {
            addCriterion("service_phone <=", value, "service_phone");
            return (Criteria) this;
        }

        public Criteria andService_phoneLike(String value) {
            addCriterion("service_phone like", value, "service_phone");
            return (Criteria) this;
        }

        public Criteria andService_phoneNotLike(String value) {
            addCriterion("service_phone not like", value, "service_phone");
            return (Criteria) this;
        }

        public Criteria andService_phoneIn(List<String> values) {
            addCriterion("service_phone in", values, "service_phone");
            return (Criteria) this;
        }

        public Criteria andService_phoneNotIn(List<String> values) {
            addCriterion("service_phone not in", values, "service_phone");
            return (Criteria) this;
        }

        public Criteria andService_phoneBetween(String value1, String value2) {
            addCriterion("service_phone between", value1, value2, "service_phone");
            return (Criteria) this;
        }

        public Criteria andService_phoneNotBetween(String value1, String value2) {
            addCriterion("service_phone not between", value1, value2, "service_phone");
            return (Criteria) this;
        }

        public Criteria andProduct_descIsNull() {
            addCriterion("product_desc is null");
            return (Criteria) this;
        }

        public Criteria andProduct_descIsNotNull() {
            addCriterion("product_desc is not null");
            return (Criteria) this;
        }

        public Criteria andProduct_descEqualTo(String value) {
            addCriterion("product_desc =", value, "product_desc");
            return (Criteria) this;
        }

        public Criteria andProduct_descNotEqualTo(String value) {
            addCriterion("product_desc <>", value, "product_desc");
            return (Criteria) this;
        }

        public Criteria andProduct_descGreaterThan(String value) {
            addCriterion("product_desc >", value, "product_desc");
            return (Criteria) this;
        }

        public Criteria andProduct_descGreaterThanOrEqualTo(String value) {
            addCriterion("product_desc >=", value, "product_desc");
            return (Criteria) this;
        }

        public Criteria andProduct_descLessThan(String value) {
            addCriterion("product_desc <", value, "product_desc");
            return (Criteria) this;
        }

        public Criteria andProduct_descLessThanOrEqualTo(String value) {
            addCriterion("product_desc <=", value, "product_desc");
            return (Criteria) this;
        }

        public Criteria andProduct_descLike(String value) {
            addCriterion("product_desc like", value, "product_desc");
            return (Criteria) this;
        }

        public Criteria andProduct_descNotLike(String value) {
            addCriterion("product_desc not like", value, "product_desc");
            return (Criteria) this;
        }

        public Criteria andProduct_descIn(List<String> values) {
            addCriterion("product_desc in", values, "product_desc");
            return (Criteria) this;
        }

        public Criteria andProduct_descNotIn(List<String> values) {
            addCriterion("product_desc not in", values, "product_desc");
            return (Criteria) this;
        }

        public Criteria andProduct_descBetween(String value1, String value2) {
            addCriterion("product_desc between", value1, value2, "product_desc");
            return (Criteria) this;
        }

        public Criteria andProduct_descNotBetween(String value1, String value2) {
            addCriterion("product_desc not between", value1, value2, "product_desc");
            return (Criteria) this;
        }

        public Criteria andRateIsNull() {
            addCriterion("rate is null");
            return (Criteria) this;
        }

        public Criteria andRateIsNotNull() {
            addCriterion("rate is not null");
            return (Criteria) this;
        }

        public Criteria andRateEqualTo(String value) {
            addCriterion("rate =", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotEqualTo(String value) {
            addCriterion("rate <>", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThan(String value) {
            addCriterion("rate >", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThanOrEqualTo(String value) {
            addCriterion("rate >=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThan(String value) {
            addCriterion("rate <", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThanOrEqualTo(String value) {
            addCriterion("rate <=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLike(String value) {
            addCriterion("rate like", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotLike(String value) {
            addCriterion("rate not like", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateIn(List<String> values) {
            addCriterion("rate in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotIn(List<String> values) {
            addCriterion("rate not in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateBetween(String value1, String value2) {
            addCriterion("rate between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotBetween(String value1, String value2) {
            addCriterion("rate not between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andContact_phoneIsNull() {
            addCriterion("contact_phone is null");
            return (Criteria) this;
        }

        public Criteria andContact_phoneIsNotNull() {
            addCriterion("contact_phone is not null");
            return (Criteria) this;
        }

        public Criteria andContact_phoneEqualTo(String value) {
            addCriterion("contact_phone =", value, "contact_phone");
            return (Criteria) this;
        }

        public Criteria andContact_phoneNotEqualTo(String value) {
            addCriterion("contact_phone <>", value, "contact_phone");
            return (Criteria) this;
        }

        public Criteria andContact_phoneGreaterThan(String value) {
            addCriterion("contact_phone >", value, "contact_phone");
            return (Criteria) this;
        }

        public Criteria andContact_phoneGreaterThanOrEqualTo(String value) {
            addCriterion("contact_phone >=", value, "contact_phone");
            return (Criteria) this;
        }

        public Criteria andContact_phoneLessThan(String value) {
            addCriterion("contact_phone <", value, "contact_phone");
            return (Criteria) this;
        }

        public Criteria andContact_phoneLessThanOrEqualTo(String value) {
            addCriterion("contact_phone <=", value, "contact_phone");
            return (Criteria) this;
        }

        public Criteria andContact_phoneLike(String value) {
            addCriterion("contact_phone like", value, "contact_phone");
            return (Criteria) this;
        }

        public Criteria andContact_phoneNotLike(String value) {
            addCriterion("contact_phone not like", value, "contact_phone");
            return (Criteria) this;
        }

        public Criteria andContact_phoneIn(List<String> values) {
            addCriterion("contact_phone in", values, "contact_phone");
            return (Criteria) this;
        }

        public Criteria andContact_phoneNotIn(List<String> values) {
            addCriterion("contact_phone not in", values, "contact_phone");
            return (Criteria) this;
        }

        public Criteria andContact_phoneBetween(String value1, String value2) {
            addCriterion("contact_phone between", value1, value2, "contact_phone");
            return (Criteria) this;
        }

        public Criteria andContact_phoneNotBetween(String value1, String value2) {
            addCriterion("contact_phone not between", value1, value2, "contact_phone");
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