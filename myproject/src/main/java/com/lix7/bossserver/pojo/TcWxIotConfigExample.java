package com.lix7.bossserver.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TcWxIotConfigExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TcWxIotConfigExample() {
        oredCriteria = new ArrayList<>();
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

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andChannelIdIsNull() {
            addCriterion("channel_id is null");
            return (Criteria) this;
        }

        public Criteria andChannelIdIsNotNull() {
            addCriterion("channel_id is not null");
            return (Criteria) this;
        }

        public Criteria andChannelIdEqualTo(String value) {
            addCriterion("channel_id =", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotEqualTo(String value) {
            addCriterion("channel_id <>", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdGreaterThan(String value) {
            addCriterion("channel_id >", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdGreaterThanOrEqualTo(String value) {
            addCriterion("channel_id >=", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdLessThan(String value) {
            addCriterion("channel_id <", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdLessThanOrEqualTo(String value) {
            addCriterion("channel_id <=", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdLike(String value) {
            addCriterion("channel_id like", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotLike(String value) {
            addCriterion("channel_id not like", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdIn(List<String> values) {
            addCriterion("channel_id in", values, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotIn(List<String> values) {
            addCriterion("channel_id not in", values, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdBetween(String value1, String value2) {
            addCriterion("channel_id between", value1, value2, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotBetween(String value1, String value2) {
            addCriterion("channel_id not between", value1, value2, "channelId");
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

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andApplyRemarkIsNull() {
            addCriterion("apply_remark is null");
            return (Criteria) this;
        }

        public Criteria andApplyRemarkIsNotNull() {
            addCriterion("apply_remark is not null");
            return (Criteria) this;
        }

        public Criteria andApplyRemarkEqualTo(String value) {
            addCriterion("apply_remark =", value, "applyRemark");
            return (Criteria) this;
        }

        public Criteria andApplyRemarkNotEqualTo(String value) {
            addCriterion("apply_remark <>", value, "applyRemark");
            return (Criteria) this;
        }

        public Criteria andApplyRemarkGreaterThan(String value) {
            addCriterion("apply_remark >", value, "applyRemark");
            return (Criteria) this;
        }

        public Criteria andApplyRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("apply_remark >=", value, "applyRemark");
            return (Criteria) this;
        }

        public Criteria andApplyRemarkLessThan(String value) {
            addCriterion("apply_remark <", value, "applyRemark");
            return (Criteria) this;
        }

        public Criteria andApplyRemarkLessThanOrEqualTo(String value) {
            addCriterion("apply_remark <=", value, "applyRemark");
            return (Criteria) this;
        }

        public Criteria andApplyRemarkLike(String value) {
            addCriterion("apply_remark like", value, "applyRemark");
            return (Criteria) this;
        }

        public Criteria andApplyRemarkNotLike(String value) {
            addCriterion("apply_remark not like", value, "applyRemark");
            return (Criteria) this;
        }

        public Criteria andApplyRemarkIn(List<String> values) {
            addCriterion("apply_remark in", values, "applyRemark");
            return (Criteria) this;
        }

        public Criteria andApplyRemarkNotIn(List<String> values) {
            addCriterion("apply_remark not in", values, "applyRemark");
            return (Criteria) this;
        }

        public Criteria andApplyRemarkBetween(String value1, String value2) {
            addCriterion("apply_remark between", value1, value2, "applyRemark");
            return (Criteria) this;
        }

        public Criteria andApplyRemarkNotBetween(String value1, String value2) {
            addCriterion("apply_remark not between", value1, value2, "applyRemark");
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

        public Criteria andIotProductIdIsNull() {
            addCriterion("iot_product_id is null");
            return (Criteria) this;
        }

        public Criteria andIotProductIdIsNotNull() {
            addCriterion("iot_product_id is not null");
            return (Criteria) this;
        }

        public Criteria andIotProductIdEqualTo(String value) {
            addCriterion("iot_product_id =", value, "iotProductId");
            return (Criteria) this;
        }

        public Criteria andIotProductIdNotEqualTo(String value) {
            addCriterion("iot_product_id <>", value, "iotProductId");
            return (Criteria) this;
        }

        public Criteria andIotProductIdGreaterThan(String value) {
            addCriterion("iot_product_id >", value, "iotProductId");
            return (Criteria) this;
        }

        public Criteria andIotProductIdGreaterThanOrEqualTo(String value) {
            addCriterion("iot_product_id >=", value, "iotProductId");
            return (Criteria) this;
        }

        public Criteria andIotProductIdLessThan(String value) {
            addCriterion("iot_product_id <", value, "iotProductId");
            return (Criteria) this;
        }

        public Criteria andIotProductIdLessThanOrEqualTo(String value) {
            addCriterion("iot_product_id <=", value, "iotProductId");
            return (Criteria) this;
        }

        public Criteria andIotProductIdLike(String value) {
            addCriterion("iot_product_id like", value, "iotProductId");
            return (Criteria) this;
        }

        public Criteria andIotProductIdNotLike(String value) {
            addCriterion("iot_product_id not like", value, "iotProductId");
            return (Criteria) this;
        }

        public Criteria andIotProductIdIn(List<String> values) {
            addCriterion("iot_product_id in", values, "iotProductId");
            return (Criteria) this;
        }

        public Criteria andIotProductIdNotIn(List<String> values) {
            addCriterion("iot_product_id not in", values, "iotProductId");
            return (Criteria) this;
        }

        public Criteria andIotProductIdBetween(String value1, String value2) {
            addCriterion("iot_product_id between", value1, value2, "iotProductId");
            return (Criteria) this;
        }

        public Criteria andIotProductIdNotBetween(String value1, String value2) {
            addCriterion("iot_product_id not between", value1, value2, "iotProductId");
            return (Criteria) this;
        }

        public Criteria andMsgTypeListIsNull() {
            addCriterion("msg_type_list is null");
            return (Criteria) this;
        }

        public Criteria andMsgTypeListIsNotNull() {
            addCriterion("msg_type_list is not null");
            return (Criteria) this;
        }

        public Criteria andMsgTypeListEqualTo(String value) {
            addCriterion("msg_type_list =", value, "msgTypeList");
            return (Criteria) this;
        }

        public Criteria andMsgTypeListNotEqualTo(String value) {
            addCriterion("msg_type_list <>", value, "msgTypeList");
            return (Criteria) this;
        }

        public Criteria andMsgTypeListGreaterThan(String value) {
            addCriterion("msg_type_list >", value, "msgTypeList");
            return (Criteria) this;
        }

        public Criteria andMsgTypeListGreaterThanOrEqualTo(String value) {
            addCriterion("msg_type_list >=", value, "msgTypeList");
            return (Criteria) this;
        }

        public Criteria andMsgTypeListLessThan(String value) {
            addCriterion("msg_type_list <", value, "msgTypeList");
            return (Criteria) this;
        }

        public Criteria andMsgTypeListLessThanOrEqualTo(String value) {
            addCriterion("msg_type_list <=", value, "msgTypeList");
            return (Criteria) this;
        }

        public Criteria andMsgTypeListLike(String value) {
            addCriterion("msg_type_list like", value, "msgTypeList");
            return (Criteria) this;
        }

        public Criteria andMsgTypeListNotLike(String value) {
            addCriterion("msg_type_list not like", value, "msgTypeList");
            return (Criteria) this;
        }

        public Criteria andMsgTypeListIn(List<String> values) {
            addCriterion("msg_type_list in", values, "msgTypeList");
            return (Criteria) this;
        }

        public Criteria andMsgTypeListNotIn(List<String> values) {
            addCriterion("msg_type_list not in", values, "msgTypeList");
            return (Criteria) this;
        }

        public Criteria andMsgTypeListBetween(String value1, String value2) {
            addCriterion("msg_type_list between", value1, value2, "msgTypeList");
            return (Criteria) this;
        }

        public Criteria andMsgTypeListNotBetween(String value1, String value2) {
            addCriterion("msg_type_list not between", value1, value2, "msgTypeList");
            return (Criteria) this;
        }

        public Criteria andSendTargetIsNull() {
            addCriterion("send_target is null");
            return (Criteria) this;
        }

        public Criteria andSendTargetIsNotNull() {
            addCriterion("send_target is not null");
            return (Criteria) this;
        }

        public Criteria andSendTargetEqualTo(String value) {
            addCriterion("send_target =", value, "sendTarget");
            return (Criteria) this;
        }

        public Criteria andSendTargetNotEqualTo(String value) {
            addCriterion("send_target <>", value, "sendTarget");
            return (Criteria) this;
        }

        public Criteria andSendTargetGreaterThan(String value) {
            addCriterion("send_target >", value, "sendTarget");
            return (Criteria) this;
        }

        public Criteria andSendTargetGreaterThanOrEqualTo(String value) {
            addCriterion("send_target >=", value, "sendTarget");
            return (Criteria) this;
        }

        public Criteria andSendTargetLessThan(String value) {
            addCriterion("send_target <", value, "sendTarget");
            return (Criteria) this;
        }

        public Criteria andSendTargetLessThanOrEqualTo(String value) {
            addCriterion("send_target <=", value, "sendTarget");
            return (Criteria) this;
        }

        public Criteria andSendTargetLike(String value) {
            addCriterion("send_target like", value, "sendTarget");
            return (Criteria) this;
        }

        public Criteria andSendTargetNotLike(String value) {
            addCriterion("send_target not like", value, "sendTarget");
            return (Criteria) this;
        }

        public Criteria andSendTargetIn(List<String> values) {
            addCriterion("send_target in", values, "sendTarget");
            return (Criteria) this;
        }

        public Criteria andSendTargetNotIn(List<String> values) {
            addCriterion("send_target not in", values, "sendTarget");
            return (Criteria) this;
        }

        public Criteria andSendTargetBetween(String value1, String value2) {
            addCriterion("send_target between", value1, value2, "sendTarget");
            return (Criteria) this;
        }

        public Criteria andSendTargetNotBetween(String value1, String value2) {
            addCriterion("send_target not between", value1, value2, "sendTarget");
            return (Criteria) this;
        }

        public Criteria andUrlResourceFiltersIsNull() {
            addCriterion("url_resource_filters is null");
            return (Criteria) this;
        }

        public Criteria andUrlResourceFiltersIsNotNull() {
            addCriterion("url_resource_filters is not null");
            return (Criteria) this;
        }

        public Criteria andUrlResourceFiltersEqualTo(String value) {
            addCriterion("url_resource_filters =", value, "urlResourceFilters");
            return (Criteria) this;
        }

        public Criteria andUrlResourceFiltersNotEqualTo(String value) {
            addCriterion("url_resource_filters <>", value, "urlResourceFilters");
            return (Criteria) this;
        }

        public Criteria andUrlResourceFiltersGreaterThan(String value) {
            addCriterion("url_resource_filters >", value, "urlResourceFilters");
            return (Criteria) this;
        }

        public Criteria andUrlResourceFiltersGreaterThanOrEqualTo(String value) {
            addCriterion("url_resource_filters >=", value, "urlResourceFilters");
            return (Criteria) this;
        }

        public Criteria andUrlResourceFiltersLessThan(String value) {
            addCriterion("url_resource_filters <", value, "urlResourceFilters");
            return (Criteria) this;
        }

        public Criteria andUrlResourceFiltersLessThanOrEqualTo(String value) {
            addCriterion("url_resource_filters <=", value, "urlResourceFilters");
            return (Criteria) this;
        }

        public Criteria andUrlResourceFiltersLike(String value) {
            addCriterion("url_resource_filters like", value, "urlResourceFilters");
            return (Criteria) this;
        }

        public Criteria andUrlResourceFiltersNotLike(String value) {
            addCriterion("url_resource_filters not like", value, "urlResourceFilters");
            return (Criteria) this;
        }

        public Criteria andUrlResourceFiltersIn(List<String> values) {
            addCriterion("url_resource_filters in", values, "urlResourceFilters");
            return (Criteria) this;
        }

        public Criteria andUrlResourceFiltersNotIn(List<String> values) {
            addCriterion("url_resource_filters not in", values, "urlResourceFilters");
            return (Criteria) this;
        }

        public Criteria andUrlResourceFiltersBetween(String value1, String value2) {
            addCriterion("url_resource_filters between", value1, value2, "urlResourceFilters");
            return (Criteria) this;
        }

        public Criteria andUrlResourceFiltersNotBetween(String value1, String value2) {
            addCriterion("url_resource_filters not between", value1, value2, "urlResourceFilters");
            return (Criteria) this;
        }

        public Criteria andLastModifyByIsNull() {
            addCriterion("last_modify_by is null");
            return (Criteria) this;
        }

        public Criteria andLastModifyByIsNotNull() {
            addCriterion("last_modify_by is not null");
            return (Criteria) this;
        }

        public Criteria andLastModifyByEqualTo(String value) {
            addCriterion("last_modify_by =", value, "lastModifyBy");
            return (Criteria) this;
        }

        public Criteria andLastModifyByNotEqualTo(String value) {
            addCriterion("last_modify_by <>", value, "lastModifyBy");
            return (Criteria) this;
        }

        public Criteria andLastModifyByGreaterThan(String value) {
            addCriterion("last_modify_by >", value, "lastModifyBy");
            return (Criteria) this;
        }

        public Criteria andLastModifyByGreaterThanOrEqualTo(String value) {
            addCriterion("last_modify_by >=", value, "lastModifyBy");
            return (Criteria) this;
        }

        public Criteria andLastModifyByLessThan(String value) {
            addCriterion("last_modify_by <", value, "lastModifyBy");
            return (Criteria) this;
        }

        public Criteria andLastModifyByLessThanOrEqualTo(String value) {
            addCriterion("last_modify_by <=", value, "lastModifyBy");
            return (Criteria) this;
        }

        public Criteria andLastModifyByLike(String value) {
            addCriterion("last_modify_by like", value, "lastModifyBy");
            return (Criteria) this;
        }

        public Criteria andLastModifyByNotLike(String value) {
            addCriterion("last_modify_by not like", value, "lastModifyBy");
            return (Criteria) this;
        }

        public Criteria andLastModifyByIn(List<String> values) {
            addCriterion("last_modify_by in", values, "lastModifyBy");
            return (Criteria) this;
        }

        public Criteria andLastModifyByNotIn(List<String> values) {
            addCriterion("last_modify_by not in", values, "lastModifyBy");
            return (Criteria) this;
        }

        public Criteria andLastModifyByBetween(String value1, String value2) {
            addCriterion("last_modify_by between", value1, value2, "lastModifyBy");
            return (Criteria) this;
        }

        public Criteria andLastModifyByNotBetween(String value1, String value2) {
            addCriterion("last_modify_by not between", value1, value2, "lastModifyBy");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeIsNull() {
            addCriterion("last_modify_time is null");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeIsNotNull() {
            addCriterion("last_modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeEqualTo(Date value) {
            addCriterion("last_modify_time =", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeNotEqualTo(Date value) {
            addCriterion("last_modify_time <>", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeGreaterThan(Date value) {
            addCriterion("last_modify_time >", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_modify_time >=", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeLessThan(Date value) {
            addCriterion("last_modify_time <", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_modify_time <=", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeIn(List<Date> values) {
            addCriterion("last_modify_time in", values, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeNotIn(List<Date> values) {
            addCriterion("last_modify_time not in", values, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeBetween(Date value1, Date value2) {
            addCriterion("last_modify_time between", value1, value2, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_modify_time not between", value1, value2, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastApproveByIsNull() {
            addCriterion("last_approve_by is null");
            return (Criteria) this;
        }

        public Criteria andLastApproveByIsNotNull() {
            addCriterion("last_approve_by is not null");
            return (Criteria) this;
        }

        public Criteria andLastApproveByEqualTo(String value) {
            addCriterion("last_approve_by =", value, "lastApproveBy");
            return (Criteria) this;
        }

        public Criteria andLastApproveByNotEqualTo(String value) {
            addCriterion("last_approve_by <>", value, "lastApproveBy");
            return (Criteria) this;
        }

        public Criteria andLastApproveByGreaterThan(String value) {
            addCriterion("last_approve_by >", value, "lastApproveBy");
            return (Criteria) this;
        }

        public Criteria andLastApproveByGreaterThanOrEqualTo(String value) {
            addCriterion("last_approve_by >=", value, "lastApproveBy");
            return (Criteria) this;
        }

        public Criteria andLastApproveByLessThan(String value) {
            addCriterion("last_approve_by <", value, "lastApproveBy");
            return (Criteria) this;
        }

        public Criteria andLastApproveByLessThanOrEqualTo(String value) {
            addCriterion("last_approve_by <=", value, "lastApproveBy");
            return (Criteria) this;
        }

        public Criteria andLastApproveByLike(String value) {
            addCriterion("last_approve_by like", value, "lastApproveBy");
            return (Criteria) this;
        }

        public Criteria andLastApproveByNotLike(String value) {
            addCriterion("last_approve_by not like", value, "lastApproveBy");
            return (Criteria) this;
        }

        public Criteria andLastApproveByIn(List<String> values) {
            addCriterion("last_approve_by in", values, "lastApproveBy");
            return (Criteria) this;
        }

        public Criteria andLastApproveByNotIn(List<String> values) {
            addCriterion("last_approve_by not in", values, "lastApproveBy");
            return (Criteria) this;
        }

        public Criteria andLastApproveByBetween(String value1, String value2) {
            addCriterion("last_approve_by between", value1, value2, "lastApproveBy");
            return (Criteria) this;
        }

        public Criteria andLastApproveByNotBetween(String value1, String value2) {
            addCriterion("last_approve_by not between", value1, value2, "lastApproveBy");
            return (Criteria) this;
        }

        public Criteria andLastApproveTimeIsNull() {
            addCriterion("last_approve_time is null");
            return (Criteria) this;
        }

        public Criteria andLastApproveTimeIsNotNull() {
            addCriterion("last_approve_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastApproveTimeEqualTo(Date value) {
            addCriterion("last_approve_time =", value, "lastApproveTime");
            return (Criteria) this;
        }

        public Criteria andLastApproveTimeNotEqualTo(Date value) {
            addCriterion("last_approve_time <>", value, "lastApproveTime");
            return (Criteria) this;
        }

        public Criteria andLastApproveTimeGreaterThan(Date value) {
            addCriterion("last_approve_time >", value, "lastApproveTime");
            return (Criteria) this;
        }

        public Criteria andLastApproveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_approve_time >=", value, "lastApproveTime");
            return (Criteria) this;
        }

        public Criteria andLastApproveTimeLessThan(Date value) {
            addCriterion("last_approve_time <", value, "lastApproveTime");
            return (Criteria) this;
        }

        public Criteria andLastApproveTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_approve_time <=", value, "lastApproveTime");
            return (Criteria) this;
        }

        public Criteria andLastApproveTimeIn(List<Date> values) {
            addCriterion("last_approve_time in", values, "lastApproveTime");
            return (Criteria) this;
        }

        public Criteria andLastApproveTimeNotIn(List<Date> values) {
            addCriterion("last_approve_time not in", values, "lastApproveTime");
            return (Criteria) this;
        }

        public Criteria andLastApproveTimeBetween(Date value1, Date value2) {
            addCriterion("last_approve_time between", value1, value2, "lastApproveTime");
            return (Criteria) this;
        }

        public Criteria andLastApproveTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_approve_time not between", value1, value2, "lastApproveTime");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNull() {
            addCriterion("is_delete is null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNotNull() {
            addCriterion("is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteEqualTo(Byte value) {
            addCriterion("is_delete =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(Byte value) {
            addCriterion("is_delete <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(Byte value) {
            addCriterion("is_delete >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_delete >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(Byte value) {
            addCriterion("is_delete <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(Byte value) {
            addCriterion("is_delete <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<Byte> values) {
            addCriterion("is_delete in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<Byte> values) {
            addCriterion("is_delete not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(Byte value1, Byte value2) {
            addCriterion("is_delete between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(Byte value1, Byte value2) {
            addCriterion("is_delete not between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNull() {
            addCriterion("create_by is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("create_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(String value) {
            addCriterion("create_by =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(String value) {
            addCriterion("create_by <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(String value) {
            addCriterion("create_by >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("create_by >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(String value) {
            addCriterion("create_by <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(String value) {
            addCriterion("create_by <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLike(String value) {
            addCriterion("create_by like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotLike(String value) {
            addCriterion("create_by not like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<String> values) {
            addCriterion("create_by in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<String> values) {
            addCriterion("create_by not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(String value1, String value2) {
            addCriterion("create_by between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(String value1, String value2) {
            addCriterion("create_by not between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNull() {
            addCriterion("update_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNotNull() {
            addCriterion("update_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateByEqualTo(String value) {
            addCriterion("update_by =", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotEqualTo(String value) {
            addCriterion("update_by <>", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThan(String value) {
            addCriterion("update_by >", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThanOrEqualTo(String value) {
            addCriterion("update_by >=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThan(String value) {
            addCriterion("update_by <", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThanOrEqualTo(String value) {
            addCriterion("update_by <=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLike(String value) {
            addCriterion("update_by like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotLike(String value) {
            addCriterion("update_by not like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIn(List<String> values) {
            addCriterion("update_by in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotIn(List<String> values) {
            addCriterion("update_by not in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByBetween(String value1, String value2) {
            addCriterion("update_by between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotBetween(String value1, String value2) {
            addCriterion("update_by not between", value1, value2, "updateBy");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
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