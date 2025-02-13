package com.lix7.bossserver.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TcFilingsInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TcFilingsInfoExample() {
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

        public Criteria andApplyIdIsNull() {
            addCriterion("apply_id is null");
            return (Criteria) this;
        }

        public Criteria andApplyIdIsNotNull() {
            addCriterion("apply_id is not null");
            return (Criteria) this;
        }

        public Criteria andApplyIdEqualTo(Integer value) {
            addCriterion("apply_id =", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdNotEqualTo(Integer value) {
            addCriterion("apply_id <>", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdGreaterThan(Integer value) {
            addCriterion("apply_id >", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("apply_id >=", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdLessThan(Integer value) {
            addCriterion("apply_id <", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdLessThanOrEqualTo(Integer value) {
            addCriterion("apply_id <=", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdIn(List<Integer> values) {
            addCriterion("apply_id in", values, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdNotIn(List<Integer> values) {
            addCriterion("apply_id not in", values, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdBetween(Integer value1, Integer value2) {
            addCriterion("apply_id between", value1, value2, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("apply_id not between", value1, value2, "applyId");
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

        public Criteria andProgramAppIdIsNull() {
            addCriterion("program_app_id is null");
            return (Criteria) this;
        }

        public Criteria andProgramAppIdIsNotNull() {
            addCriterion("program_app_id is not null");
            return (Criteria) this;
        }

        public Criteria andProgramAppIdEqualTo(String value) {
            addCriterion("program_app_id =", value, "programAppId");
            return (Criteria) this;
        }

        public Criteria andProgramAppIdNotEqualTo(String value) {
            addCriterion("program_app_id <>", value, "programAppId");
            return (Criteria) this;
        }

        public Criteria andProgramAppIdGreaterThan(String value) {
            addCriterion("program_app_id >", value, "programAppId");
            return (Criteria) this;
        }

        public Criteria andProgramAppIdGreaterThanOrEqualTo(String value) {
            addCriterion("program_app_id >=", value, "programAppId");
            return (Criteria) this;
        }

        public Criteria andProgramAppIdLessThan(String value) {
            addCriterion("program_app_id <", value, "programAppId");
            return (Criteria) this;
        }

        public Criteria andProgramAppIdLessThanOrEqualTo(String value) {
            addCriterion("program_app_id <=", value, "programAppId");
            return (Criteria) this;
        }

        public Criteria andProgramAppIdLike(String value) {
            addCriterion("program_app_id like", value, "programAppId");
            return (Criteria) this;
        }

        public Criteria andProgramAppIdNotLike(String value) {
            addCriterion("program_app_id not like", value, "programAppId");
            return (Criteria) this;
        }

        public Criteria andProgramAppIdIn(List<String> values) {
            addCriterion("program_app_id in", values, "programAppId");
            return (Criteria) this;
        }

        public Criteria andProgramAppIdNotIn(List<String> values) {
            addCriterion("program_app_id not in", values, "programAppId");
            return (Criteria) this;
        }

        public Criteria andProgramAppIdBetween(String value1, String value2) {
            addCriterion("program_app_id between", value1, value2, "programAppId");
            return (Criteria) this;
        }

        public Criteria andProgramAppIdNotBetween(String value1, String value2) {
            addCriterion("program_app_id not between", value1, value2, "programAppId");
            return (Criteria) this;
        }

        public Criteria andMainpartFilingsIdIsNull() {
            addCriterion("mainPart_filings_id is null");
            return (Criteria) this;
        }

        public Criteria andMainpartFilingsIdIsNotNull() {
            addCriterion("mainPart_filings_id is not null");
            return (Criteria) this;
        }

        public Criteria andMainpartFilingsIdEqualTo(String value) {
            addCriterion("mainPart_filings_id =", value, "mainpartFilingsId");
            return (Criteria) this;
        }

        public Criteria andMainpartFilingsIdNotEqualTo(String value) {
            addCriterion("mainPart_filings_id <>", value, "mainpartFilingsId");
            return (Criteria) this;
        }

        public Criteria andMainpartFilingsIdGreaterThan(String value) {
            addCriterion("mainPart_filings_id >", value, "mainpartFilingsId");
            return (Criteria) this;
        }

        public Criteria andMainpartFilingsIdGreaterThanOrEqualTo(String value) {
            addCriterion("mainPart_filings_id >=", value, "mainpartFilingsId");
            return (Criteria) this;
        }

        public Criteria andMainpartFilingsIdLessThan(String value) {
            addCriterion("mainPart_filings_id <", value, "mainpartFilingsId");
            return (Criteria) this;
        }

        public Criteria andMainpartFilingsIdLessThanOrEqualTo(String value) {
            addCriterion("mainPart_filings_id <=", value, "mainpartFilingsId");
            return (Criteria) this;
        }

        public Criteria andMainpartFilingsIdLike(String value) {
            addCriterion("mainPart_filings_id like", value, "mainpartFilingsId");
            return (Criteria) this;
        }

        public Criteria andMainpartFilingsIdNotLike(String value) {
            addCriterion("mainPart_filings_id not like", value, "mainpartFilingsId");
            return (Criteria) this;
        }

        public Criteria andMainpartFilingsIdIn(List<String> values) {
            addCriterion("mainPart_filings_id in", values, "mainpartFilingsId");
            return (Criteria) this;
        }

        public Criteria andMainpartFilingsIdNotIn(List<String> values) {
            addCriterion("mainPart_filings_id not in", values, "mainpartFilingsId");
            return (Criteria) this;
        }

        public Criteria andMainpartFilingsIdBetween(String value1, String value2) {
            addCriterion("mainPart_filings_id between", value1, value2, "mainpartFilingsId");
            return (Criteria) this;
        }

        public Criteria andMainpartFilingsIdNotBetween(String value1, String value2) {
            addCriterion("mainPart_filings_id not between", value1, value2, "mainpartFilingsId");
            return (Criteria) this;
        }

        public Criteria andProgramFilingsIdIsNull() {
            addCriterion("program_filings_id is null");
            return (Criteria) this;
        }

        public Criteria andProgramFilingsIdIsNotNull() {
            addCriterion("program_filings_id is not null");
            return (Criteria) this;
        }

        public Criteria andProgramFilingsIdEqualTo(String value) {
            addCriterion("program_filings_id =", value, "programFilingsId");
            return (Criteria) this;
        }

        public Criteria andProgramFilingsIdNotEqualTo(String value) {
            addCriterion("program_filings_id <>", value, "programFilingsId");
            return (Criteria) this;
        }

        public Criteria andProgramFilingsIdGreaterThan(String value) {
            addCriterion("program_filings_id >", value, "programFilingsId");
            return (Criteria) this;
        }

        public Criteria andProgramFilingsIdGreaterThanOrEqualTo(String value) {
            addCriterion("program_filings_id >=", value, "programFilingsId");
            return (Criteria) this;
        }

        public Criteria andProgramFilingsIdLessThan(String value) {
            addCriterion("program_filings_id <", value, "programFilingsId");
            return (Criteria) this;
        }

        public Criteria andProgramFilingsIdLessThanOrEqualTo(String value) {
            addCriterion("program_filings_id <=", value, "programFilingsId");
            return (Criteria) this;
        }

        public Criteria andProgramFilingsIdLike(String value) {
            addCriterion("program_filings_id like", value, "programFilingsId");
            return (Criteria) this;
        }

        public Criteria andProgramFilingsIdNotLike(String value) {
            addCriterion("program_filings_id not like", value, "programFilingsId");
            return (Criteria) this;
        }

        public Criteria andProgramFilingsIdIn(List<String> values) {
            addCriterion("program_filings_id in", values, "programFilingsId");
            return (Criteria) this;
        }

        public Criteria andProgramFilingsIdNotIn(List<String> values) {
            addCriterion("program_filings_id not in", values, "programFilingsId");
            return (Criteria) this;
        }

        public Criteria andProgramFilingsIdBetween(String value1, String value2) {
            addCriterion("program_filings_id between", value1, value2, "programFilingsId");
            return (Criteria) this;
        }

        public Criteria andProgramFilingsIdNotBetween(String value1, String value2) {
            addCriterion("program_filings_id not between", value1, value2, "programFilingsId");
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

        public Criteria andVerifyRemarkIsNull() {
            addCriterion("verify_remark is null");
            return (Criteria) this;
        }

        public Criteria andVerifyRemarkIsNotNull() {
            addCriterion("verify_remark is not null");
            return (Criteria) this;
        }

        public Criteria andVerifyRemarkEqualTo(String value) {
            addCriterion("verify_remark =", value, "verifyRemark");
            return (Criteria) this;
        }

        public Criteria andVerifyRemarkNotEqualTo(String value) {
            addCriterion("verify_remark <>", value, "verifyRemark");
            return (Criteria) this;
        }

        public Criteria andVerifyRemarkGreaterThan(String value) {
            addCriterion("verify_remark >", value, "verifyRemark");
            return (Criteria) this;
        }

        public Criteria andVerifyRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("verify_remark >=", value, "verifyRemark");
            return (Criteria) this;
        }

        public Criteria andVerifyRemarkLessThan(String value) {
            addCriterion("verify_remark <", value, "verifyRemark");
            return (Criteria) this;
        }

        public Criteria andVerifyRemarkLessThanOrEqualTo(String value) {
            addCriterion("verify_remark <=", value, "verifyRemark");
            return (Criteria) this;
        }

        public Criteria andVerifyRemarkLike(String value) {
            addCriterion("verify_remark like", value, "verifyRemark");
            return (Criteria) this;
        }

        public Criteria andVerifyRemarkNotLike(String value) {
            addCriterion("verify_remark not like", value, "verifyRemark");
            return (Criteria) this;
        }

        public Criteria andVerifyRemarkIn(List<String> values) {
            addCriterion("verify_remark in", values, "verifyRemark");
            return (Criteria) this;
        }

        public Criteria andVerifyRemarkNotIn(List<String> values) {
            addCriterion("verify_remark not in", values, "verifyRemark");
            return (Criteria) this;
        }

        public Criteria andVerifyRemarkBetween(String value1, String value2) {
            addCriterion("verify_remark between", value1, value2, "verifyRemark");
            return (Criteria) this;
        }

        public Criteria andVerifyRemarkNotBetween(String value1, String value2) {
            addCriterion("verify_remark not between", value1, value2, "verifyRemark");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIsNull() {
            addCriterion("apply_time is null");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIsNotNull() {
            addCriterion("apply_time is not null");
            return (Criteria) this;
        }

        public Criteria andApplyTimeEqualTo(Date value) {
            addCriterion("apply_time =", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotEqualTo(Date value) {
            addCriterion("apply_time <>", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeGreaterThan(Date value) {
            addCriterion("apply_time >", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("apply_time >=", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeLessThan(Date value) {
            addCriterion("apply_time <", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeLessThanOrEqualTo(Date value) {
            addCriterion("apply_time <=", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIn(List<Date> values) {
            addCriterion("apply_time in", values, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotIn(List<Date> values) {
            addCriterion("apply_time not in", values, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeBetween(Date value1, Date value2) {
            addCriterion("apply_time between", value1, value2, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotBetween(Date value1, Date value2) {
            addCriterion("apply_time not between", value1, value2, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyByIsNull() {
            addCriterion("apply_by is null");
            return (Criteria) this;
        }

        public Criteria andApplyByIsNotNull() {
            addCriterion("apply_by is not null");
            return (Criteria) this;
        }

        public Criteria andApplyByEqualTo(String value) {
            addCriterion("apply_by =", value, "applyBy");
            return (Criteria) this;
        }

        public Criteria andApplyByNotEqualTo(String value) {
            addCriterion("apply_by <>", value, "applyBy");
            return (Criteria) this;
        }

        public Criteria andApplyByGreaterThan(String value) {
            addCriterion("apply_by >", value, "applyBy");
            return (Criteria) this;
        }

        public Criteria andApplyByGreaterThanOrEqualTo(String value) {
            addCriterion("apply_by >=", value, "applyBy");
            return (Criteria) this;
        }

        public Criteria andApplyByLessThan(String value) {
            addCriterion("apply_by <", value, "applyBy");
            return (Criteria) this;
        }

        public Criteria andApplyByLessThanOrEqualTo(String value) {
            addCriterion("apply_by <=", value, "applyBy");
            return (Criteria) this;
        }

        public Criteria andApplyByLike(String value) {
            addCriterion("apply_by like", value, "applyBy");
            return (Criteria) this;
        }

        public Criteria andApplyByNotLike(String value) {
            addCriterion("apply_by not like", value, "applyBy");
            return (Criteria) this;
        }

        public Criteria andApplyByIn(List<String> values) {
            addCriterion("apply_by in", values, "applyBy");
            return (Criteria) this;
        }

        public Criteria andApplyByNotIn(List<String> values) {
            addCriterion("apply_by not in", values, "applyBy");
            return (Criteria) this;
        }

        public Criteria andApplyByBetween(String value1, String value2) {
            addCriterion("apply_by between", value1, value2, "applyBy");
            return (Criteria) this;
        }

        public Criteria andApplyByNotBetween(String value1, String value2) {
            addCriterion("apply_by not between", value1, value2, "applyBy");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeIsNull() {
            addCriterion("verify_time is null");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeIsNotNull() {
            addCriterion("verify_time is not null");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeEqualTo(Date value) {
            addCriterion("verify_time =", value, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeNotEqualTo(Date value) {
            addCriterion("verify_time <>", value, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeGreaterThan(Date value) {
            addCriterion("verify_time >", value, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("verify_time >=", value, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeLessThan(Date value) {
            addCriterion("verify_time <", value, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("verify_time <=", value, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeIn(List<Date> values) {
            addCriterion("verify_time in", values, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeNotIn(List<Date> values) {
            addCriterion("verify_time not in", values, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeBetween(Date value1, Date value2) {
            addCriterion("verify_time between", value1, value2, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("verify_time not between", value1, value2, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyByIsNull() {
            addCriterion("verify_by is null");
            return (Criteria) this;
        }

        public Criteria andVerifyByIsNotNull() {
            addCriterion("verify_by is not null");
            return (Criteria) this;
        }

        public Criteria andVerifyByEqualTo(String value) {
            addCriterion("verify_by =", value, "verifyBy");
            return (Criteria) this;
        }

        public Criteria andVerifyByNotEqualTo(String value) {
            addCriterion("verify_by <>", value, "verifyBy");
            return (Criteria) this;
        }

        public Criteria andVerifyByGreaterThan(String value) {
            addCriterion("verify_by >", value, "verifyBy");
            return (Criteria) this;
        }

        public Criteria andVerifyByGreaterThanOrEqualTo(String value) {
            addCriterion("verify_by >=", value, "verifyBy");
            return (Criteria) this;
        }

        public Criteria andVerifyByLessThan(String value) {
            addCriterion("verify_by <", value, "verifyBy");
            return (Criteria) this;
        }

        public Criteria andVerifyByLessThanOrEqualTo(String value) {
            addCriterion("verify_by <=", value, "verifyBy");
            return (Criteria) this;
        }

        public Criteria andVerifyByLike(String value) {
            addCriterion("verify_by like", value, "verifyBy");
            return (Criteria) this;
        }

        public Criteria andVerifyByNotLike(String value) {
            addCriterion("verify_by not like", value, "verifyBy");
            return (Criteria) this;
        }

        public Criteria andVerifyByIn(List<String> values) {
            addCriterion("verify_by in", values, "verifyBy");
            return (Criteria) this;
        }

        public Criteria andVerifyByNotIn(List<String> values) {
            addCriterion("verify_by not in", values, "verifyBy");
            return (Criteria) this;
        }

        public Criteria andVerifyByBetween(String value1, String value2) {
            addCriterion("verify_by between", value1, value2, "verifyBy");
            return (Criteria) this;
        }

        public Criteria andVerifyByNotBetween(String value1, String value2) {
            addCriterion("verify_by not between", value1, value2, "verifyBy");
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