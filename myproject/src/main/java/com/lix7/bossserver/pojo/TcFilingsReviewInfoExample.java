package com.lix7.bossserver.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TcFilingsReviewInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TcFilingsReviewInfoExample() {
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

        public Criteria andMainpartNameIsNull() {
            addCriterion("mainPart_name is null");
            return (Criteria) this;
        }

        public Criteria andMainpartNameIsNotNull() {
            addCriterion("mainPart_name is not null");
            return (Criteria) this;
        }

        public Criteria andMainpartNameEqualTo(String value) {
            addCriterion("mainPart_name =", value, "mainpartName");
            return (Criteria) this;
        }

        public Criteria andMainpartNameNotEqualTo(String value) {
            addCriterion("mainPart_name <>", value, "mainpartName");
            return (Criteria) this;
        }

        public Criteria andMainpartNameGreaterThan(String value) {
            addCriterion("mainPart_name >", value, "mainpartName");
            return (Criteria) this;
        }

        public Criteria andMainpartNameGreaterThanOrEqualTo(String value) {
            addCriterion("mainPart_name >=", value, "mainpartName");
            return (Criteria) this;
        }

        public Criteria andMainpartNameLessThan(String value) {
            addCriterion("mainPart_name <", value, "mainpartName");
            return (Criteria) this;
        }

        public Criteria andMainpartNameLessThanOrEqualTo(String value) {
            addCriterion("mainPart_name <=", value, "mainpartName");
            return (Criteria) this;
        }

        public Criteria andMainpartNameLike(String value) {
            addCriterion("mainPart_name like", value, "mainpartName");
            return (Criteria) this;
        }

        public Criteria andMainpartNameNotLike(String value) {
            addCriterion("mainPart_name not like", value, "mainpartName");
            return (Criteria) this;
        }

        public Criteria andMainpartNameIn(List<String> values) {
            addCriterion("mainPart_name in", values, "mainpartName");
            return (Criteria) this;
        }

        public Criteria andMainpartNameNotIn(List<String> values) {
            addCriterion("mainPart_name not in", values, "mainpartName");
            return (Criteria) this;
        }

        public Criteria andMainpartNameBetween(String value1, String value2) {
            addCriterion("mainPart_name between", value1, value2, "mainpartName");
            return (Criteria) this;
        }

        public Criteria andMainpartNameNotBetween(String value1, String value2) {
            addCriterion("mainPart_name not between", value1, value2, "mainpartName");
            return (Criteria) this;
        }

        public Criteria andMainpartTzrIsNull() {
            addCriterion("mainPart_tzr is null");
            return (Criteria) this;
        }

        public Criteria andMainpartTzrIsNotNull() {
            addCriterion("mainPart_tzr is not null");
            return (Criteria) this;
        }

        public Criteria andMainpartTzrEqualTo(String value) {
            addCriterion("mainPart_tzr =", value, "mainpartTzr");
            return (Criteria) this;
        }

        public Criteria andMainpartTzrNotEqualTo(String value) {
            addCriterion("mainPart_tzr <>", value, "mainpartTzr");
            return (Criteria) this;
        }

        public Criteria andMainpartTzrGreaterThan(String value) {
            addCriterion("mainPart_tzr >", value, "mainpartTzr");
            return (Criteria) this;
        }

        public Criteria andMainpartTzrGreaterThanOrEqualTo(String value) {
            addCriterion("mainPart_tzr >=", value, "mainpartTzr");
            return (Criteria) this;
        }

        public Criteria andMainpartTzrLessThan(String value) {
            addCriterion("mainPart_tzr <", value, "mainpartTzr");
            return (Criteria) this;
        }

        public Criteria andMainpartTzrLessThanOrEqualTo(String value) {
            addCriterion("mainPart_tzr <=", value, "mainpartTzr");
            return (Criteria) this;
        }

        public Criteria andMainpartTzrLike(String value) {
            addCriterion("mainPart_tzr like", value, "mainpartTzr");
            return (Criteria) this;
        }

        public Criteria andMainpartTzrNotLike(String value) {
            addCriterion("mainPart_tzr not like", value, "mainpartTzr");
            return (Criteria) this;
        }

        public Criteria andMainpartTzrIn(List<String> values) {
            addCriterion("mainPart_tzr in", values, "mainpartTzr");
            return (Criteria) this;
        }

        public Criteria andMainpartTzrNotIn(List<String> values) {
            addCriterion("mainPart_tzr not in", values, "mainpartTzr");
            return (Criteria) this;
        }

        public Criteria andMainpartTzrBetween(String value1, String value2) {
            addCriterion("mainPart_tzr between", value1, value2, "mainpartTzr");
            return (Criteria) this;
        }

        public Criteria andMainpartTzrNotBetween(String value1, String value2) {
            addCriterion("mainPart_tzr not between", value1, value2, "mainpartTzr");
            return (Criteria) this;
        }

        public Criteria andMainpartZjlxIsNull() {
            addCriterion("mainPart_zjlx is null");
            return (Criteria) this;
        }

        public Criteria andMainpartZjlxIsNotNull() {
            addCriterion("mainPart_zjlx is not null");
            return (Criteria) this;
        }

        public Criteria andMainpartZjlxEqualTo(Long value) {
            addCriterion("mainPart_zjlx =", value, "mainpartZjlx");
            return (Criteria) this;
        }

        public Criteria andMainpartZjlxNotEqualTo(Long value) {
            addCriterion("mainPart_zjlx <>", value, "mainpartZjlx");
            return (Criteria) this;
        }

        public Criteria andMainpartZjlxGreaterThan(Long value) {
            addCriterion("mainPart_zjlx >", value, "mainpartZjlx");
            return (Criteria) this;
        }

        public Criteria andMainpartZjlxGreaterThanOrEqualTo(Long value) {
            addCriterion("mainPart_zjlx >=", value, "mainpartZjlx");
            return (Criteria) this;
        }

        public Criteria andMainpartZjlxLessThan(Long value) {
            addCriterion("mainPart_zjlx <", value, "mainpartZjlx");
            return (Criteria) this;
        }

        public Criteria andMainpartZjlxLessThanOrEqualTo(Long value) {
            addCriterion("mainPart_zjlx <=", value, "mainpartZjlx");
            return (Criteria) this;
        }

        public Criteria andMainpartZjlxIn(List<Long> values) {
            addCriterion("mainPart_zjlx in", values, "mainpartZjlx");
            return (Criteria) this;
        }

        public Criteria andMainpartZjlxNotIn(List<Long> values) {
            addCriterion("mainPart_zjlx not in", values, "mainpartZjlx");
            return (Criteria) this;
        }

        public Criteria andMainpartZjlxBetween(Long value1, Long value2) {
            addCriterion("mainPart_zjlx between", value1, value2, "mainpartZjlx");
            return (Criteria) this;
        }

        public Criteria andMainpartZjlxNotBetween(Long value1, Long value2) {
            addCriterion("mainPart_zjlx not between", value1, value2, "mainpartZjlx");
            return (Criteria) this;
        }

        public Criteria andMainpartZjhmIsNull() {
            addCriterion("mainPart_zjhm is null");
            return (Criteria) this;
        }

        public Criteria andMainpartZjhmIsNotNull() {
            addCriterion("mainPart_zjhm is not null");
            return (Criteria) this;
        }

        public Criteria andMainpartZjhmEqualTo(String value) {
            addCriterion("mainPart_zjhm =", value, "mainpartZjhm");
            return (Criteria) this;
        }

        public Criteria andMainpartZjhmNotEqualTo(String value) {
            addCriterion("mainPart_zjhm <>", value, "mainpartZjhm");
            return (Criteria) this;
        }

        public Criteria andMainpartZjhmGreaterThan(String value) {
            addCriterion("mainPart_zjhm >", value, "mainpartZjhm");
            return (Criteria) this;
        }

        public Criteria andMainpartZjhmGreaterThanOrEqualTo(String value) {
            addCriterion("mainPart_zjhm >=", value, "mainpartZjhm");
            return (Criteria) this;
        }

        public Criteria andMainpartZjhmLessThan(String value) {
            addCriterion("mainPart_zjhm <", value, "mainpartZjhm");
            return (Criteria) this;
        }

        public Criteria andMainpartZjhmLessThanOrEqualTo(String value) {
            addCriterion("mainPart_zjhm <=", value, "mainpartZjhm");
            return (Criteria) this;
        }

        public Criteria andMainpartZjhmLike(String value) {
            addCriterion("mainPart_zjhm like", value, "mainpartZjhm");
            return (Criteria) this;
        }

        public Criteria andMainpartZjhmNotLike(String value) {
            addCriterion("mainPart_zjhm not like", value, "mainpartZjhm");
            return (Criteria) this;
        }

        public Criteria andMainpartZjhmIn(List<String> values) {
            addCriterion("mainPart_zjhm in", values, "mainpartZjhm");
            return (Criteria) this;
        }

        public Criteria andMainpartZjhmNotIn(List<String> values) {
            addCriterion("mainPart_zjhm not in", values, "mainpartZjhm");
            return (Criteria) this;
        }

        public Criteria andMainpartZjhmBetween(String value1, String value2) {
            addCriterion("mainPart_zjhm between", value1, value2, "mainpartZjhm");
            return (Criteria) this;
        }

        public Criteria andMainpartZjhmNotBetween(String value1, String value2) {
            addCriterion("mainPart_zjhm not between", value1, value2, "mainpartZjhm");
            return (Criteria) this;
        }

        public Criteria andMainpartZjzsIsNull() {
            addCriterion("mainPart_zjzs is null");
            return (Criteria) this;
        }

        public Criteria andMainpartZjzsIsNotNull() {
            addCriterion("mainPart_zjzs is not null");
            return (Criteria) this;
        }

        public Criteria andMainpartZjzsEqualTo(String value) {
            addCriterion("mainPart_zjzs =", value, "mainpartZjzs");
            return (Criteria) this;
        }

        public Criteria andMainpartZjzsNotEqualTo(String value) {
            addCriterion("mainPart_zjzs <>", value, "mainpartZjzs");
            return (Criteria) this;
        }

        public Criteria andMainpartZjzsGreaterThan(String value) {
            addCriterion("mainPart_zjzs >", value, "mainpartZjzs");
            return (Criteria) this;
        }

        public Criteria andMainpartZjzsGreaterThanOrEqualTo(String value) {
            addCriterion("mainPart_zjzs >=", value, "mainpartZjzs");
            return (Criteria) this;
        }

        public Criteria andMainpartZjzsLessThan(String value) {
            addCriterion("mainPart_zjzs <", value, "mainpartZjzs");
            return (Criteria) this;
        }

        public Criteria andMainpartZjzsLessThanOrEqualTo(String value) {
            addCriterion("mainPart_zjzs <=", value, "mainpartZjzs");
            return (Criteria) this;
        }

        public Criteria andMainpartZjzsLike(String value) {
            addCriterion("mainPart_zjzs like", value, "mainpartZjzs");
            return (Criteria) this;
        }

        public Criteria andMainpartZjzsNotLike(String value) {
            addCriterion("mainPart_zjzs not like", value, "mainpartZjzs");
            return (Criteria) this;
        }

        public Criteria andMainpartZjzsIn(List<String> values) {
            addCriterion("mainPart_zjzs in", values, "mainpartZjzs");
            return (Criteria) this;
        }

        public Criteria andMainpartZjzsNotIn(List<String> values) {
            addCriterion("mainPart_zjzs not in", values, "mainpartZjzs");
            return (Criteria) this;
        }

        public Criteria andMainpartZjzsBetween(String value1, String value2) {
            addCriterion("mainPart_zjzs between", value1, value2, "mainpartZjzs");
            return (Criteria) this;
        }

        public Criteria andMainpartZjzsNotBetween(String value1, String value2) {
            addCriterion("mainPart_zjzs not between", value1, value2, "mainpartZjzs");
            return (Criteria) this;
        }

        public Criteria andMainpartShengidIsNull() {
            addCriterion("mainPart_shengid is null");
            return (Criteria) this;
        }

        public Criteria andMainpartShengidIsNotNull() {
            addCriterion("mainPart_shengid is not null");
            return (Criteria) this;
        }

        public Criteria andMainpartShengidEqualTo(Long value) {
            addCriterion("mainPart_shengid =", value, "mainpartShengid");
            return (Criteria) this;
        }

        public Criteria andMainpartShengidNotEqualTo(Long value) {
            addCriterion("mainPart_shengid <>", value, "mainpartShengid");
            return (Criteria) this;
        }

        public Criteria andMainpartShengidGreaterThan(Long value) {
            addCriterion("mainPart_shengid >", value, "mainpartShengid");
            return (Criteria) this;
        }

        public Criteria andMainpartShengidGreaterThanOrEqualTo(Long value) {
            addCriterion("mainPart_shengid >=", value, "mainpartShengid");
            return (Criteria) this;
        }

        public Criteria andMainpartShengidLessThan(Long value) {
            addCriterion("mainPart_shengid <", value, "mainpartShengid");
            return (Criteria) this;
        }

        public Criteria andMainpartShengidLessThanOrEqualTo(Long value) {
            addCriterion("mainPart_shengid <=", value, "mainpartShengid");
            return (Criteria) this;
        }

        public Criteria andMainpartShengidIn(List<Long> values) {
            addCriterion("mainPart_shengid in", values, "mainpartShengid");
            return (Criteria) this;
        }

        public Criteria andMainpartShengidNotIn(List<Long> values) {
            addCriterion("mainPart_shengid not in", values, "mainpartShengid");
            return (Criteria) this;
        }

        public Criteria andMainpartShengidBetween(Long value1, Long value2) {
            addCriterion("mainPart_shengid between", value1, value2, "mainpartShengid");
            return (Criteria) this;
        }

        public Criteria andMainpartShengidNotBetween(Long value1, Long value2) {
            addCriterion("mainPart_shengid not between", value1, value2, "mainpartShengid");
            return (Criteria) this;
        }

        public Criteria andMainpartShiidIsNull() {
            addCriterion("mainPart_shiid is null");
            return (Criteria) this;
        }

        public Criteria andMainpartShiidIsNotNull() {
            addCriterion("mainPart_shiid is not null");
            return (Criteria) this;
        }

        public Criteria andMainpartShiidEqualTo(Long value) {
            addCriterion("mainPart_shiid =", value, "mainpartShiid");
            return (Criteria) this;
        }

        public Criteria andMainpartShiidNotEqualTo(Long value) {
            addCriterion("mainPart_shiid <>", value, "mainpartShiid");
            return (Criteria) this;
        }

        public Criteria andMainpartShiidGreaterThan(Long value) {
            addCriterion("mainPart_shiid >", value, "mainpartShiid");
            return (Criteria) this;
        }

        public Criteria andMainpartShiidGreaterThanOrEqualTo(Long value) {
            addCriterion("mainPart_shiid >=", value, "mainpartShiid");
            return (Criteria) this;
        }

        public Criteria andMainpartShiidLessThan(Long value) {
            addCriterion("mainPart_shiid <", value, "mainpartShiid");
            return (Criteria) this;
        }

        public Criteria andMainpartShiidLessThanOrEqualTo(Long value) {
            addCriterion("mainPart_shiid <=", value, "mainpartShiid");
            return (Criteria) this;
        }

        public Criteria andMainpartShiidIn(List<Long> values) {
            addCriterion("mainPart_shiid in", values, "mainpartShiid");
            return (Criteria) this;
        }

        public Criteria andMainpartShiidNotIn(List<Long> values) {
            addCriterion("mainPart_shiid not in", values, "mainpartShiid");
            return (Criteria) this;
        }

        public Criteria andMainpartShiidBetween(Long value1, Long value2) {
            addCriterion("mainPart_shiid between", value1, value2, "mainpartShiid");
            return (Criteria) this;
        }

        public Criteria andMainpartShiidNotBetween(Long value1, Long value2) {
            addCriterion("mainPart_shiid not between", value1, value2, "mainpartShiid");
            return (Criteria) this;
        }

        public Criteria andMainpartXianidIsNull() {
            addCriterion("mainPart_xianid is null");
            return (Criteria) this;
        }

        public Criteria andMainpartXianidIsNotNull() {
            addCriterion("mainPart_xianid is not null");
            return (Criteria) this;
        }

        public Criteria andMainpartXianidEqualTo(Long value) {
            addCriterion("mainPart_xianid =", value, "mainpartXianid");
            return (Criteria) this;
        }

        public Criteria andMainpartXianidNotEqualTo(Long value) {
            addCriterion("mainPart_xianid <>", value, "mainpartXianid");
            return (Criteria) this;
        }

        public Criteria andMainpartXianidGreaterThan(Long value) {
            addCriterion("mainPart_xianid >", value, "mainpartXianid");
            return (Criteria) this;
        }

        public Criteria andMainpartXianidGreaterThanOrEqualTo(Long value) {
            addCriterion("mainPart_xianid >=", value, "mainpartXianid");
            return (Criteria) this;
        }

        public Criteria andMainpartXianidLessThan(Long value) {
            addCriterion("mainPart_xianid <", value, "mainpartXianid");
            return (Criteria) this;
        }

        public Criteria andMainpartXianidLessThanOrEqualTo(Long value) {
            addCriterion("mainPart_xianid <=", value, "mainpartXianid");
            return (Criteria) this;
        }

        public Criteria andMainpartXianidIn(List<Long> values) {
            addCriterion("mainPart_xianid in", values, "mainpartXianid");
            return (Criteria) this;
        }

        public Criteria andMainpartXianidNotIn(List<Long> values) {
            addCriterion("mainPart_xianid not in", values, "mainpartXianid");
            return (Criteria) this;
        }

        public Criteria andMainpartXianidBetween(Long value1, Long value2) {
            addCriterion("mainPart_xianid between", value1, value2, "mainpartXianid");
            return (Criteria) this;
        }

        public Criteria andMainpartXianidNotBetween(Long value1, Long value2) {
            addCriterion("mainPart_xianid not between", value1, value2, "mainpartXianid");
            return (Criteria) this;
        }

        public Criteria andMainpartXxdzIsNull() {
            addCriterion("mainPart_xxdz is null");
            return (Criteria) this;
        }

        public Criteria andMainpartXxdzIsNotNull() {
            addCriterion("mainPart_xxdz is not null");
            return (Criteria) this;
        }

        public Criteria andMainpartXxdzEqualTo(String value) {
            addCriterion("mainPart_xxdz =", value, "mainpartXxdz");
            return (Criteria) this;
        }

        public Criteria andMainpartXxdzNotEqualTo(String value) {
            addCriterion("mainPart_xxdz <>", value, "mainpartXxdz");
            return (Criteria) this;
        }

        public Criteria andMainpartXxdzGreaterThan(String value) {
            addCriterion("mainPart_xxdz >", value, "mainpartXxdz");
            return (Criteria) this;
        }

        public Criteria andMainpartXxdzGreaterThanOrEqualTo(String value) {
            addCriterion("mainPart_xxdz >=", value, "mainpartXxdz");
            return (Criteria) this;
        }

        public Criteria andMainpartXxdzLessThan(String value) {
            addCriterion("mainPart_xxdz <", value, "mainpartXxdz");
            return (Criteria) this;
        }

        public Criteria andMainpartXxdzLessThanOrEqualTo(String value) {
            addCriterion("mainPart_xxdz <=", value, "mainpartXxdz");
            return (Criteria) this;
        }

        public Criteria andMainpartXxdzLike(String value) {
            addCriterion("mainPart_xxdz like", value, "mainpartXxdz");
            return (Criteria) this;
        }

        public Criteria andMainpartXxdzNotLike(String value) {
            addCriterion("mainPart_xxdz not like", value, "mainpartXxdz");
            return (Criteria) this;
        }

        public Criteria andMainpartXxdzIn(List<String> values) {
            addCriterion("mainPart_xxdz in", values, "mainpartXxdz");
            return (Criteria) this;
        }

        public Criteria andMainpartXxdzNotIn(List<String> values) {
            addCriterion("mainPart_xxdz not in", values, "mainpartXxdz");
            return (Criteria) this;
        }

        public Criteria andMainpartXxdzBetween(String value1, String value2) {
            addCriterion("mainPart_xxdz between", value1, value2, "mainpartXxdz");
            return (Criteria) this;
        }

        public Criteria andMainpartXxdzNotBetween(String value1, String value2) {
            addCriterion("mainPart_xxdz not between", value1, value2, "mainpartXxdz");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrxmIsNull() {
            addCriterion("mainPart_fzrXm is null");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrxmIsNotNull() {
            addCriterion("mainPart_fzrXm is not null");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrxmEqualTo(String value) {
            addCriterion("mainPart_fzrXm =", value, "mainpartFzrxm");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrxmNotEqualTo(String value) {
            addCriterion("mainPart_fzrXm <>", value, "mainpartFzrxm");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrxmGreaterThan(String value) {
            addCriterion("mainPart_fzrXm >", value, "mainpartFzrxm");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrxmGreaterThanOrEqualTo(String value) {
            addCriterion("mainPart_fzrXm >=", value, "mainpartFzrxm");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrxmLessThan(String value) {
            addCriterion("mainPart_fzrXm <", value, "mainpartFzrxm");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrxmLessThanOrEqualTo(String value) {
            addCriterion("mainPart_fzrXm <=", value, "mainpartFzrxm");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrxmLike(String value) {
            addCriterion("mainPart_fzrXm like", value, "mainpartFzrxm");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrxmNotLike(String value) {
            addCriterion("mainPart_fzrXm not like", value, "mainpartFzrxm");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrxmIn(List<String> values) {
            addCriterion("mainPart_fzrXm in", values, "mainpartFzrxm");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrxmNotIn(List<String> values) {
            addCriterion("mainPart_fzrXm not in", values, "mainpartFzrxm");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrxmBetween(String value1, String value2) {
            addCriterion("mainPart_fzrXm between", value1, value2, "mainpartFzrxm");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrxmNotBetween(String value1, String value2) {
            addCriterion("mainPart_fzrXm not between", value1, value2, "mainpartFzrxm");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrxjlxIsNull() {
            addCriterion("mainPart_fzrXjlx is null");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrxjlxIsNotNull() {
            addCriterion("mainPart_fzrXjlx is not null");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrxjlxEqualTo(String value) {
            addCriterion("mainPart_fzrXjlx =", value, "mainpartFzrxjlx");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrxjlxNotEqualTo(String value) {
            addCriterion("mainPart_fzrXjlx <>", value, "mainpartFzrxjlx");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrxjlxGreaterThan(String value) {
            addCriterion("mainPart_fzrXjlx >", value, "mainpartFzrxjlx");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrxjlxGreaterThanOrEqualTo(String value) {
            addCriterion("mainPart_fzrXjlx >=", value, "mainpartFzrxjlx");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrxjlxLessThan(String value) {
            addCriterion("mainPart_fzrXjlx <", value, "mainpartFzrxjlx");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrxjlxLessThanOrEqualTo(String value) {
            addCriterion("mainPart_fzrXjlx <=", value, "mainpartFzrxjlx");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrxjlxLike(String value) {
            addCriterion("mainPart_fzrXjlx like", value, "mainpartFzrxjlx");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrxjlxNotLike(String value) {
            addCriterion("mainPart_fzrXjlx not like", value, "mainpartFzrxjlx");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrxjlxIn(List<String> values) {
            addCriterion("mainPart_fzrXjlx in", values, "mainpartFzrxjlx");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrxjlxNotIn(List<String> values) {
            addCriterion("mainPart_fzrXjlx not in", values, "mainpartFzrxjlx");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrxjlxBetween(String value1, String value2) {
            addCriterion("mainPart_fzrXjlx between", value1, value2, "mainpartFzrxjlx");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrxjlxNotBetween(String value1, String value2) {
            addCriterion("mainPart_fzrXjlx not between", value1, value2, "mainpartFzrxjlx");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrzjhmIsNull() {
            addCriterion("mainPart_fzrZjhm is null");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrzjhmIsNotNull() {
            addCriterion("mainPart_fzrZjhm is not null");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrzjhmEqualTo(String value) {
            addCriterion("mainPart_fzrZjhm =", value, "mainpartFzrzjhm");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrzjhmNotEqualTo(String value) {
            addCriterion("mainPart_fzrZjhm <>", value, "mainpartFzrzjhm");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrzjhmGreaterThan(String value) {
            addCriterion("mainPart_fzrZjhm >", value, "mainpartFzrzjhm");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrzjhmGreaterThanOrEqualTo(String value) {
            addCriterion("mainPart_fzrZjhm >=", value, "mainpartFzrzjhm");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrzjhmLessThan(String value) {
            addCriterion("mainPart_fzrZjhm <", value, "mainpartFzrzjhm");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrzjhmLessThanOrEqualTo(String value) {
            addCriterion("mainPart_fzrZjhm <=", value, "mainpartFzrzjhm");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrzjhmLike(String value) {
            addCriterion("mainPart_fzrZjhm like", value, "mainpartFzrzjhm");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrzjhmNotLike(String value) {
            addCriterion("mainPart_fzrZjhm not like", value, "mainpartFzrzjhm");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrzjhmIn(List<String> values) {
            addCriterion("mainPart_fzrZjhm in", values, "mainpartFzrzjhm");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrzjhmNotIn(List<String> values) {
            addCriterion("mainPart_fzrZjhm not in", values, "mainpartFzrzjhm");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrzjhmBetween(String value1, String value2) {
            addCriterion("mainPart_fzrZjhm between", value1, value2, "mainpartFzrzjhm");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrzjhmNotBetween(String value1, String value2) {
            addCriterion("mainPart_fzrZjhm not between", value1, value2, "mainpartFzrzjhm");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrdzyjIsNull() {
            addCriterion("mainPart_fzrDzyj is null");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrdzyjIsNotNull() {
            addCriterion("mainPart_fzrDzyj is not null");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrdzyjEqualTo(String value) {
            addCriterion("mainPart_fzrDzyj =", value, "mainpartFzrdzyj");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrdzyjNotEqualTo(String value) {
            addCriterion("mainPart_fzrDzyj <>", value, "mainpartFzrdzyj");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrdzyjGreaterThan(String value) {
            addCriterion("mainPart_fzrDzyj >", value, "mainpartFzrdzyj");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrdzyjGreaterThanOrEqualTo(String value) {
            addCriterion("mainPart_fzrDzyj >=", value, "mainpartFzrdzyj");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrdzyjLessThan(String value) {
            addCriterion("mainPart_fzrDzyj <", value, "mainpartFzrdzyj");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrdzyjLessThanOrEqualTo(String value) {
            addCriterion("mainPart_fzrDzyj <=", value, "mainpartFzrdzyj");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrdzyjLike(String value) {
            addCriterion("mainPart_fzrDzyj like", value, "mainpartFzrdzyj");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrdzyjNotLike(String value) {
            addCriterion("mainPart_fzrDzyj not like", value, "mainpartFzrdzyj");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrdzyjIn(List<String> values) {
            addCriterion("mainPart_fzrDzyj in", values, "mainpartFzrdzyj");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrdzyjNotIn(List<String> values) {
            addCriterion("mainPart_fzrDzyj not in", values, "mainpartFzrdzyj");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrdzyjBetween(String value1, String value2) {
            addCriterion("mainPart_fzrDzyj between", value1, value2, "mainpartFzrdzyj");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrdzyjNotBetween(String value1, String value2) {
            addCriterion("mainPart_fzrDzyj not between", value1, value2, "mainpartFzrdzyj");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrlxfs1IsNull() {
            addCriterion("mainPart_fzrLxfs1 is null");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrlxfs1IsNotNull() {
            addCriterion("mainPart_fzrLxfs1 is not null");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrlxfs1EqualTo(String value) {
            addCriterion("mainPart_fzrLxfs1 =", value, "mainpartFzrlxfs1");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrlxfs1NotEqualTo(String value) {
            addCriterion("mainPart_fzrLxfs1 <>", value, "mainpartFzrlxfs1");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrlxfs1GreaterThan(String value) {
            addCriterion("mainPart_fzrLxfs1 >", value, "mainpartFzrlxfs1");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrlxfs1GreaterThanOrEqualTo(String value) {
            addCriterion("mainPart_fzrLxfs1 >=", value, "mainpartFzrlxfs1");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrlxfs1LessThan(String value) {
            addCriterion("mainPart_fzrLxfs1 <", value, "mainpartFzrlxfs1");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrlxfs1LessThanOrEqualTo(String value) {
            addCriterion("mainPart_fzrLxfs1 <=", value, "mainpartFzrlxfs1");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrlxfs1Like(String value) {
            addCriterion("mainPart_fzrLxfs1 like", value, "mainpartFzrlxfs1");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrlxfs1NotLike(String value) {
            addCriterion("mainPart_fzrLxfs1 not like", value, "mainpartFzrlxfs1");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrlxfs1In(List<String> values) {
            addCriterion("mainPart_fzrLxfs1 in", values, "mainpartFzrlxfs1");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrlxfs1NotIn(List<String> values) {
            addCriterion("mainPart_fzrLxfs1 not in", values, "mainpartFzrlxfs1");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrlxfs1Between(String value1, String value2) {
            addCriterion("mainPart_fzrLxfs1 between", value1, value2, "mainpartFzrlxfs1");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrlxfs1NotBetween(String value1, String value2) {
            addCriterion("mainPart_fzrLxfs1 not between", value1, value2, "mainpartFzrlxfs1");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrlxfs2IsNull() {
            addCriterion("mainPart_fzrLxfs2 is null");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrlxfs2IsNotNull() {
            addCriterion("mainPart_fzrLxfs2 is not null");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrlxfs2EqualTo(String value) {
            addCriterion("mainPart_fzrLxfs2 =", value, "mainpartFzrlxfs2");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrlxfs2NotEqualTo(String value) {
            addCriterion("mainPart_fzrLxfs2 <>", value, "mainpartFzrlxfs2");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrlxfs2GreaterThan(String value) {
            addCriterion("mainPart_fzrLxfs2 >", value, "mainpartFzrlxfs2");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrlxfs2GreaterThanOrEqualTo(String value) {
            addCriterion("mainPart_fzrLxfs2 >=", value, "mainpartFzrlxfs2");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrlxfs2LessThan(String value) {
            addCriterion("mainPart_fzrLxfs2 <", value, "mainpartFzrlxfs2");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrlxfs2LessThanOrEqualTo(String value) {
            addCriterion("mainPart_fzrLxfs2 <=", value, "mainpartFzrlxfs2");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrlxfs2Like(String value) {
            addCriterion("mainPart_fzrLxfs2 like", value, "mainpartFzrlxfs2");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrlxfs2NotLike(String value) {
            addCriterion("mainPart_fzrLxfs2 not like", value, "mainpartFzrlxfs2");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrlxfs2In(List<String> values) {
            addCriterion("mainPart_fzrLxfs2 in", values, "mainpartFzrlxfs2");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrlxfs2NotIn(List<String> values) {
            addCriterion("mainPart_fzrLxfs2 not in", values, "mainpartFzrlxfs2");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrlxfs2Between(String value1, String value2) {
            addCriterion("mainPart_fzrLxfs2 between", value1, value2, "mainpartFzrlxfs2");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrlxfs2NotBetween(String value1, String value2) {
            addCriterion("mainPart_fzrLxfs2 not between", value1, value2, "mainpartFzrlxfs2");
            return (Criteria) this;
        }

        public Criteria andMainpartFzryjdhIsNull() {
            addCriterion("mainPart_fzrYjdh is null");
            return (Criteria) this;
        }

        public Criteria andMainpartFzryjdhIsNotNull() {
            addCriterion("mainPart_fzrYjdh is not null");
            return (Criteria) this;
        }

        public Criteria andMainpartFzryjdhEqualTo(String value) {
            addCriterion("mainPart_fzrYjdh =", value, "mainpartFzryjdh");
            return (Criteria) this;
        }

        public Criteria andMainpartFzryjdhNotEqualTo(String value) {
            addCriterion("mainPart_fzrYjdh <>", value, "mainpartFzryjdh");
            return (Criteria) this;
        }

        public Criteria andMainpartFzryjdhGreaterThan(String value) {
            addCriterion("mainPart_fzrYjdh >", value, "mainpartFzryjdh");
            return (Criteria) this;
        }

        public Criteria andMainpartFzryjdhGreaterThanOrEqualTo(String value) {
            addCriterion("mainPart_fzrYjdh >=", value, "mainpartFzryjdh");
            return (Criteria) this;
        }

        public Criteria andMainpartFzryjdhLessThan(String value) {
            addCriterion("mainPart_fzrYjdh <", value, "mainpartFzryjdh");
            return (Criteria) this;
        }

        public Criteria andMainpartFzryjdhLessThanOrEqualTo(String value) {
            addCriterion("mainPart_fzrYjdh <=", value, "mainpartFzryjdh");
            return (Criteria) this;
        }

        public Criteria andMainpartFzryjdhLike(String value) {
            addCriterion("mainPart_fzrYjdh like", value, "mainpartFzryjdh");
            return (Criteria) this;
        }

        public Criteria andMainpartFzryjdhNotLike(String value) {
            addCriterion("mainPart_fzrYjdh not like", value, "mainpartFzryjdh");
            return (Criteria) this;
        }

        public Criteria andMainpartFzryjdhIn(List<String> values) {
            addCriterion("mainPart_fzrYjdh in", values, "mainpartFzryjdh");
            return (Criteria) this;
        }

        public Criteria andMainpartFzryjdhNotIn(List<String> values) {
            addCriterion("mainPart_fzrYjdh not in", values, "mainpartFzryjdh");
            return (Criteria) this;
        }

        public Criteria andMainpartFzryjdhBetween(String value1, String value2) {
            addCriterion("mainPart_fzrYjdh between", value1, value2, "mainpartFzryjdh");
            return (Criteria) this;
        }

        public Criteria andMainpartFzryjdhNotBetween(String value1, String value2) {
            addCriterion("mainPart_fzrYjdh not between", value1, value2, "mainpartFzryjdh");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrjstxlxIsNull() {
            addCriterion("mainPart_fzrJstxLx is null");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrjstxlxIsNotNull() {
            addCriterion("mainPart_fzrJstxLx is not null");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrjstxlxEqualTo(Long value) {
            addCriterion("mainPart_fzrJstxLx =", value, "mainpartFzrjstxlx");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrjstxlxNotEqualTo(Long value) {
            addCriterion("mainPart_fzrJstxLx <>", value, "mainpartFzrjstxlx");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrjstxlxGreaterThan(Long value) {
            addCriterion("mainPart_fzrJstxLx >", value, "mainpartFzrjstxlx");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrjstxlxGreaterThanOrEqualTo(Long value) {
            addCriterion("mainPart_fzrJstxLx >=", value, "mainpartFzrjstxlx");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrjstxlxLessThan(Long value) {
            addCriterion("mainPart_fzrJstxLx <", value, "mainpartFzrjstxlx");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrjstxlxLessThanOrEqualTo(Long value) {
            addCriterion("mainPart_fzrJstxLx <=", value, "mainpartFzrjstxlx");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrjstxlxIn(List<Long> values) {
            addCriterion("mainPart_fzrJstxLx in", values, "mainpartFzrjstxlx");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrjstxlxNotIn(List<Long> values) {
            addCriterion("mainPart_fzrJstxLx not in", values, "mainpartFzrjstxlx");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrjstxlxBetween(Long value1, Long value2) {
            addCriterion("mainPart_fzrJstxLx between", value1, value2, "mainpartFzrjstxlx");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrjstxlxNotBetween(Long value1, Long value2) {
            addCriterion("mainPart_fzrJstxLx not between", value1, value2, "mainpartFzrjstxlx");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrjstxzhIsNull() {
            addCriterion("mainPart_fzrJstxZh is null");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrjstxzhIsNotNull() {
            addCriterion("mainPart_fzrJstxZh is not null");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrjstxzhEqualTo(String value) {
            addCriterion("mainPart_fzrJstxZh =", value, "mainpartFzrjstxzh");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrjstxzhNotEqualTo(String value) {
            addCriterion("mainPart_fzrJstxZh <>", value, "mainpartFzrjstxzh");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrjstxzhGreaterThan(String value) {
            addCriterion("mainPart_fzrJstxZh >", value, "mainpartFzrjstxzh");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrjstxzhGreaterThanOrEqualTo(String value) {
            addCriterion("mainPart_fzrJstxZh >=", value, "mainpartFzrjstxzh");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrjstxzhLessThan(String value) {
            addCriterion("mainPart_fzrJstxZh <", value, "mainpartFzrjstxzh");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrjstxzhLessThanOrEqualTo(String value) {
            addCriterion("mainPart_fzrJstxZh <=", value, "mainpartFzrjstxzh");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrjstxzhLike(String value) {
            addCriterion("mainPart_fzrJstxZh like", value, "mainpartFzrjstxzh");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrjstxzhNotLike(String value) {
            addCriterion("mainPart_fzrJstxZh not like", value, "mainpartFzrjstxzh");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrjstxzhIn(List<String> values) {
            addCriterion("mainPart_fzrJstxZh in", values, "mainpartFzrjstxzh");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrjstxzhNotIn(List<String> values) {
            addCriterion("mainPart_fzrJstxZh not in", values, "mainpartFzrjstxzh");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrjstxzhBetween(String value1, String value2) {
            addCriterion("mainPart_fzrJstxZh between", value1, value2, "mainpartFzrjstxzh");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrjstxzhNotBetween(String value1, String value2) {
            addCriterion("mainPart_fzrJstxZh not between", value1, value2, "mainpartFzrjstxzh");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrzjyxqIsNull() {
            addCriterion("mainPart_fzrZjyxq is null");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrzjyxqIsNotNull() {
            addCriterion("mainPart_fzrZjyxq is not null");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrzjyxqEqualTo(String value) {
            addCriterion("mainPart_fzrZjyxq =", value, "mainpartFzrzjyxq");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrzjyxqNotEqualTo(String value) {
            addCriterion("mainPart_fzrZjyxq <>", value, "mainpartFzrzjyxq");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrzjyxqGreaterThan(String value) {
            addCriterion("mainPart_fzrZjyxq >", value, "mainpartFzrzjyxq");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrzjyxqGreaterThanOrEqualTo(String value) {
            addCriterion("mainPart_fzrZjyxq >=", value, "mainpartFzrzjyxq");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrzjyxqLessThan(String value) {
            addCriterion("mainPart_fzrZjyxq <", value, "mainpartFzrzjyxq");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrzjyxqLessThanOrEqualTo(String value) {
            addCriterion("mainPart_fzrZjyxq <=", value, "mainpartFzrzjyxq");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrzjyxqLike(String value) {
            addCriterion("mainPart_fzrZjyxq like", value, "mainpartFzrzjyxq");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrzjyxqNotLike(String value) {
            addCriterion("mainPart_fzrZjyxq not like", value, "mainpartFzrzjyxq");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrzjyxqIn(List<String> values) {
            addCriterion("mainPart_fzrZjyxq in", values, "mainpartFzrzjyxq");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrzjyxqNotIn(List<String> values) {
            addCriterion("mainPart_fzrZjyxq not in", values, "mainpartFzrzjyxq");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrzjyxqBetween(String value1, String value2) {
            addCriterion("mainPart_fzrZjyxq between", value1, value2, "mainpartFzrzjyxq");
            return (Criteria) this;
        }

        public Criteria andMainpartFzrzjyxqNotBetween(String value1, String value2) {
            addCriterion("mainPart_fzrZjyxq not between", value1, value2, "mainpartFzrzjyxq");
            return (Criteria) this;
        }

        public Criteria andMainpartBbfsIsNull() {
            addCriterion("mainPart_bbfs is null");
            return (Criteria) this;
        }

        public Criteria andMainpartBbfsIsNotNull() {
            addCriterion("mainPart_bbfs is not null");
            return (Criteria) this;
        }

        public Criteria andMainpartBbfsEqualTo(Long value) {
            addCriterion("mainPart_bbfs =", value, "mainpartBbfs");
            return (Criteria) this;
        }

        public Criteria andMainpartBbfsNotEqualTo(Long value) {
            addCriterion("mainPart_bbfs <>", value, "mainpartBbfs");
            return (Criteria) this;
        }

        public Criteria andMainpartBbfsGreaterThan(Long value) {
            addCriterion("mainPart_bbfs >", value, "mainpartBbfs");
            return (Criteria) this;
        }

        public Criteria andMainpartBbfsGreaterThanOrEqualTo(Long value) {
            addCriterion("mainPart_bbfs >=", value, "mainpartBbfs");
            return (Criteria) this;
        }

        public Criteria andMainpartBbfsLessThan(Long value) {
            addCriterion("mainPart_bbfs <", value, "mainpartBbfs");
            return (Criteria) this;
        }

        public Criteria andMainpartBbfsLessThanOrEqualTo(Long value) {
            addCriterion("mainPart_bbfs <=", value, "mainpartBbfs");
            return (Criteria) this;
        }

        public Criteria andMainpartBbfsIn(List<Long> values) {
            addCriterion("mainPart_bbfs in", values, "mainpartBbfs");
            return (Criteria) this;
        }

        public Criteria andMainpartBbfsNotIn(List<Long> values) {
            addCriterion("mainPart_bbfs not in", values, "mainpartBbfs");
            return (Criteria) this;
        }

        public Criteria andMainpartBbfsBetween(Long value1, Long value2) {
            addCriterion("mainPart_bbfs between", value1, value2, "mainpartBbfs");
            return (Criteria) this;
        }

        public Criteria andMainpartBbfsNotBetween(Long value1, Long value2) {
            addCriterion("mainPart_bbfs not between", value1, value2, "mainpartBbfs");
            return (Criteria) this;
        }

        public Criteria andMainpartBzIsNull() {
            addCriterion("mainPart_bz is null");
            return (Criteria) this;
        }

        public Criteria andMainpartBzIsNotNull() {
            addCriterion("mainPart_bz is not null");
            return (Criteria) this;
        }

        public Criteria andMainpartBzEqualTo(String value) {
            addCriterion("mainPart_bz =", value, "mainpartBz");
            return (Criteria) this;
        }

        public Criteria andMainpartBzNotEqualTo(String value) {
            addCriterion("mainPart_bz <>", value, "mainpartBz");
            return (Criteria) this;
        }

        public Criteria andMainpartBzGreaterThan(String value) {
            addCriterion("mainPart_bz >", value, "mainpartBz");
            return (Criteria) this;
        }

        public Criteria andMainpartBzGreaterThanOrEqualTo(String value) {
            addCriterion("mainPart_bz >=", value, "mainpartBz");
            return (Criteria) this;
        }

        public Criteria andMainpartBzLessThan(String value) {
            addCriterion("mainPart_bz <", value, "mainpartBz");
            return (Criteria) this;
        }

        public Criteria andMainpartBzLessThanOrEqualTo(String value) {
            addCriterion("mainPart_bz <=", value, "mainpartBz");
            return (Criteria) this;
        }

        public Criteria andMainpartBzLike(String value) {
            addCriterion("mainPart_bz like", value, "mainpartBz");
            return (Criteria) this;
        }

        public Criteria andMainpartBzNotLike(String value) {
            addCriterion("mainPart_bz not like", value, "mainpartBz");
            return (Criteria) this;
        }

        public Criteria andMainpartBzIn(List<String> values) {
            addCriterion("mainPart_bz in", values, "mainpartBz");
            return (Criteria) this;
        }

        public Criteria andMainpartBzNotIn(List<String> values) {
            addCriterion("mainPart_bz not in", values, "mainpartBz");
            return (Criteria) this;
        }

        public Criteria andMainpartBzBetween(String value1, String value2) {
            addCriterion("mainPart_bz between", value1, value2, "mainpartBz");
            return (Criteria) this;
        }

        public Criteria andMainpartBzNotBetween(String value1, String value2) {
            addCriterion("mainPart_bz not between", value1, value2, "mainpartBz");
            return (Criteria) this;
        }

        public Criteria andServiceWzmcIsNull() {
            addCriterion("service_wzmc is null");
            return (Criteria) this;
        }

        public Criteria andServiceWzmcIsNotNull() {
            addCriterion("service_wzmc is not null");
            return (Criteria) this;
        }

        public Criteria andServiceWzmcEqualTo(String value) {
            addCriterion("service_wzmc =", value, "serviceWzmc");
            return (Criteria) this;
        }

        public Criteria andServiceWzmcNotEqualTo(String value) {
            addCriterion("service_wzmc <>", value, "serviceWzmc");
            return (Criteria) this;
        }

        public Criteria andServiceWzmcGreaterThan(String value) {
            addCriterion("service_wzmc >", value, "serviceWzmc");
            return (Criteria) this;
        }

        public Criteria andServiceWzmcGreaterThanOrEqualTo(String value) {
            addCriterion("service_wzmc >=", value, "serviceWzmc");
            return (Criteria) this;
        }

        public Criteria andServiceWzmcLessThan(String value) {
            addCriterion("service_wzmc <", value, "serviceWzmc");
            return (Criteria) this;
        }

        public Criteria andServiceWzmcLessThanOrEqualTo(String value) {
            addCriterion("service_wzmc <=", value, "serviceWzmc");
            return (Criteria) this;
        }

        public Criteria andServiceWzmcLike(String value) {
            addCriterion("service_wzmc like", value, "serviceWzmc");
            return (Criteria) this;
        }

        public Criteria andServiceWzmcNotLike(String value) {
            addCriterion("service_wzmc not like", value, "serviceWzmc");
            return (Criteria) this;
        }

        public Criteria andServiceWzmcIn(List<String> values) {
            addCriterion("service_wzmc in", values, "serviceWzmc");
            return (Criteria) this;
        }

        public Criteria andServiceWzmcNotIn(List<String> values) {
            addCriterion("service_wzmc not in", values, "serviceWzmc");
            return (Criteria) this;
        }

        public Criteria andServiceWzmcBetween(String value1, String value2) {
            addCriterion("service_wzmc between", value1, value2, "serviceWzmc");
            return (Criteria) this;
        }

        public Criteria andServiceWzmcNotBetween(String value1, String value2) {
            addCriterion("service_wzmc not between", value1, value2, "serviceWzmc");
            return (Criteria) this;
        }

        public Criteria andServiceSyurlIsNull() {
            addCriterion("service_syurl is null");
            return (Criteria) this;
        }

        public Criteria andServiceSyurlIsNotNull() {
            addCriterion("service_syurl is not null");
            return (Criteria) this;
        }

        public Criteria andServiceSyurlEqualTo(String value) {
            addCriterion("service_syurl =", value, "serviceSyurl");
            return (Criteria) this;
        }

        public Criteria andServiceSyurlNotEqualTo(String value) {
            addCriterion("service_syurl <>", value, "serviceSyurl");
            return (Criteria) this;
        }

        public Criteria andServiceSyurlGreaterThan(String value) {
            addCriterion("service_syurl >", value, "serviceSyurl");
            return (Criteria) this;
        }

        public Criteria andServiceSyurlGreaterThanOrEqualTo(String value) {
            addCriterion("service_syurl >=", value, "serviceSyurl");
            return (Criteria) this;
        }

        public Criteria andServiceSyurlLessThan(String value) {
            addCriterion("service_syurl <", value, "serviceSyurl");
            return (Criteria) this;
        }

        public Criteria andServiceSyurlLessThanOrEqualTo(String value) {
            addCriterion("service_syurl <=", value, "serviceSyurl");
            return (Criteria) this;
        }

        public Criteria andServiceSyurlLike(String value) {
            addCriterion("service_syurl like", value, "serviceSyurl");
            return (Criteria) this;
        }

        public Criteria andServiceSyurlNotLike(String value) {
            addCriterion("service_syurl not like", value, "serviceSyurl");
            return (Criteria) this;
        }

        public Criteria andServiceSyurlIn(List<String> values) {
            addCriterion("service_syurl in", values, "serviceSyurl");
            return (Criteria) this;
        }

        public Criteria andServiceSyurlNotIn(List<String> values) {
            addCriterion("service_syurl not in", values, "serviceSyurl");
            return (Criteria) this;
        }

        public Criteria andServiceSyurlBetween(String value1, String value2) {
            addCriterion("service_syurl between", value1, value2, "serviceSyurl");
            return (Criteria) this;
        }

        public Criteria andServiceSyurlNotBetween(String value1, String value2) {
            addCriterion("service_syurl not between", value1, value2, "serviceSyurl");
            return (Criteria) this;
        }

        public Criteria andServiceNrlxidIsNull() {
            addCriterion("service_nrlxId is null");
            return (Criteria) this;
        }

        public Criteria andServiceNrlxidIsNotNull() {
            addCriterion("service_nrlxId is not null");
            return (Criteria) this;
        }

        public Criteria andServiceNrlxidEqualTo(Long value) {
            addCriterion("service_nrlxId =", value, "serviceNrlxid");
            return (Criteria) this;
        }

        public Criteria andServiceNrlxidNotEqualTo(Long value) {
            addCriterion("service_nrlxId <>", value, "serviceNrlxid");
            return (Criteria) this;
        }

        public Criteria andServiceNrlxidGreaterThan(Long value) {
            addCriterion("service_nrlxId >", value, "serviceNrlxid");
            return (Criteria) this;
        }

        public Criteria andServiceNrlxidGreaterThanOrEqualTo(Long value) {
            addCriterion("service_nrlxId >=", value, "serviceNrlxid");
            return (Criteria) this;
        }

        public Criteria andServiceNrlxidLessThan(Long value) {
            addCriterion("service_nrlxId <", value, "serviceNrlxid");
            return (Criteria) this;
        }

        public Criteria andServiceNrlxidLessThanOrEqualTo(Long value) {
            addCriterion("service_nrlxId <=", value, "serviceNrlxid");
            return (Criteria) this;
        }

        public Criteria andServiceNrlxidIn(List<Long> values) {
            addCriterion("service_nrlxId in", values, "serviceNrlxid");
            return (Criteria) this;
        }

        public Criteria andServiceNrlxidNotIn(List<Long> values) {
            addCriterion("service_nrlxId not in", values, "serviceNrlxid");
            return (Criteria) this;
        }

        public Criteria andServiceNrlxidBetween(Long value1, Long value2) {
            addCriterion("service_nrlxId between", value1, value2, "serviceNrlxid");
            return (Criteria) this;
        }

        public Criteria andServiceNrlxidNotBetween(Long value1, Long value2) {
            addCriterion("service_nrlxId not between", value1, value2, "serviceNrlxid");
            return (Criteria) this;
        }

        public Criteria andServiceNrlxqzsphIsNull() {
            addCriterion("service_nrlxQzsph is null");
            return (Criteria) this;
        }

        public Criteria andServiceNrlxqzsphIsNotNull() {
            addCriterion("service_nrlxQzsph is not null");
            return (Criteria) this;
        }

        public Criteria andServiceNrlxqzsphEqualTo(String value) {
            addCriterion("service_nrlxQzsph =", value, "serviceNrlxqzsph");
            return (Criteria) this;
        }

        public Criteria andServiceNrlxqzsphNotEqualTo(String value) {
            addCriterion("service_nrlxQzsph <>", value, "serviceNrlxqzsph");
            return (Criteria) this;
        }

        public Criteria andServiceNrlxqzsphGreaterThan(String value) {
            addCriterion("service_nrlxQzsph >", value, "serviceNrlxqzsph");
            return (Criteria) this;
        }

        public Criteria andServiceNrlxqzsphGreaterThanOrEqualTo(String value) {
            addCriterion("service_nrlxQzsph >=", value, "serviceNrlxqzsph");
            return (Criteria) this;
        }

        public Criteria andServiceNrlxqzsphLessThan(String value) {
            addCriterion("service_nrlxQzsph <", value, "serviceNrlxqzsph");
            return (Criteria) this;
        }

        public Criteria andServiceNrlxqzsphLessThanOrEqualTo(String value) {
            addCriterion("service_nrlxQzsph <=", value, "serviceNrlxqzsph");
            return (Criteria) this;
        }

        public Criteria andServiceNrlxqzsphLike(String value) {
            addCriterion("service_nrlxQzsph like", value, "serviceNrlxqzsph");
            return (Criteria) this;
        }

        public Criteria andServiceNrlxqzsphNotLike(String value) {
            addCriterion("service_nrlxQzsph not like", value, "serviceNrlxqzsph");
            return (Criteria) this;
        }

        public Criteria andServiceNrlxqzsphIn(List<String> values) {
            addCriterion("service_nrlxQzsph in", values, "serviceNrlxqzsph");
            return (Criteria) this;
        }

        public Criteria andServiceNrlxqzsphNotIn(List<String> values) {
            addCriterion("service_nrlxQzsph not in", values, "serviceNrlxqzsph");
            return (Criteria) this;
        }

        public Criteria andServiceNrlxqzsphBetween(String value1, String value2) {
            addCriterion("service_nrlxQzsph between", value1, value2, "serviceNrlxqzsph");
            return (Criteria) this;
        }

        public Criteria andServiceNrlxqzsphNotBetween(String value1, String value2) {
            addCriterion("service_nrlxQzsph not between", value1, value2, "serviceNrlxqzsph");
            return (Criteria) this;
        }

        public Criteria andServiceNrlxspwjIsNull() {
            addCriterion("service_nrlxSpwj is null");
            return (Criteria) this;
        }

        public Criteria andServiceNrlxspwjIsNotNull() {
            addCriterion("service_nrlxSpwj is not null");
            return (Criteria) this;
        }

        public Criteria andServiceNrlxspwjEqualTo(String value) {
            addCriterion("service_nrlxSpwj =", value, "serviceNrlxspwj");
            return (Criteria) this;
        }

        public Criteria andServiceNrlxspwjNotEqualTo(String value) {
            addCriterion("service_nrlxSpwj <>", value, "serviceNrlxspwj");
            return (Criteria) this;
        }

        public Criteria andServiceNrlxspwjGreaterThan(String value) {
            addCriterion("service_nrlxSpwj >", value, "serviceNrlxspwj");
            return (Criteria) this;
        }

        public Criteria andServiceNrlxspwjGreaterThanOrEqualTo(String value) {
            addCriterion("service_nrlxSpwj >=", value, "serviceNrlxspwj");
            return (Criteria) this;
        }

        public Criteria andServiceNrlxspwjLessThan(String value) {
            addCriterion("service_nrlxSpwj <", value, "serviceNrlxspwj");
            return (Criteria) this;
        }

        public Criteria andServiceNrlxspwjLessThanOrEqualTo(String value) {
            addCriterion("service_nrlxSpwj <=", value, "serviceNrlxspwj");
            return (Criteria) this;
        }

        public Criteria andServiceNrlxspwjLike(String value) {
            addCriterion("service_nrlxSpwj like", value, "serviceNrlxspwj");
            return (Criteria) this;
        }

        public Criteria andServiceNrlxspwjNotLike(String value) {
            addCriterion("service_nrlxSpwj not like", value, "serviceNrlxspwj");
            return (Criteria) this;
        }

        public Criteria andServiceNrlxspwjIn(List<String> values) {
            addCriterion("service_nrlxSpwj in", values, "serviceNrlxspwj");
            return (Criteria) this;
        }

        public Criteria andServiceNrlxspwjNotIn(List<String> values) {
            addCriterion("service_nrlxSpwj not in", values, "serviceNrlxspwj");
            return (Criteria) this;
        }

        public Criteria andServiceNrlxspwjBetween(String value1, String value2) {
            addCriterion("service_nrlxSpwj between", value1, value2, "serviceNrlxspwj");
            return (Criteria) this;
        }

        public Criteria andServiceNrlxspwjNotBetween(String value1, String value2) {
            addCriterion("service_nrlxSpwj not between", value1, value2, "serviceNrlxspwj");
            return (Criteria) this;
        }

        public Criteria andServiceFwnridIsNull() {
            addCriterion("service_fwnrId is null");
            return (Criteria) this;
        }

        public Criteria andServiceFwnridIsNotNull() {
            addCriterion("service_fwnrId is not null");
            return (Criteria) this;
        }

        public Criteria andServiceFwnridEqualTo(String value) {
            addCriterion("service_fwnrId =", value, "serviceFwnrid");
            return (Criteria) this;
        }

        public Criteria andServiceFwnridNotEqualTo(String value) {
            addCriterion("service_fwnrId <>", value, "serviceFwnrid");
            return (Criteria) this;
        }

        public Criteria andServiceFwnridGreaterThan(String value) {
            addCriterion("service_fwnrId >", value, "serviceFwnrid");
            return (Criteria) this;
        }

        public Criteria andServiceFwnridGreaterThanOrEqualTo(String value) {
            addCriterion("service_fwnrId >=", value, "serviceFwnrid");
            return (Criteria) this;
        }

        public Criteria andServiceFwnridLessThan(String value) {
            addCriterion("service_fwnrId <", value, "serviceFwnrid");
            return (Criteria) this;
        }

        public Criteria andServiceFwnridLessThanOrEqualTo(String value) {
            addCriterion("service_fwnrId <=", value, "serviceFwnrid");
            return (Criteria) this;
        }

        public Criteria andServiceFwnridLike(String value) {
            addCriterion("service_fwnrId like", value, "serviceFwnrid");
            return (Criteria) this;
        }

        public Criteria andServiceFwnridNotLike(String value) {
            addCriterion("service_fwnrId not like", value, "serviceFwnrid");
            return (Criteria) this;
        }

        public Criteria andServiceFwnridIn(List<String> values) {
            addCriterion("service_fwnrId in", values, "serviceFwnrid");
            return (Criteria) this;
        }

        public Criteria andServiceFwnridNotIn(List<String> values) {
            addCriterion("service_fwnrId not in", values, "serviceFwnrid");
            return (Criteria) this;
        }

        public Criteria andServiceFwnridBetween(String value1, String value2) {
            addCriterion("service_fwnrId between", value1, value2, "serviceFwnrid");
            return (Criteria) this;
        }

        public Criteria andServiceFwnridNotBetween(String value1, String value2) {
            addCriterion("service_fwnrId not between", value1, value2, "serviceFwnrid");
            return (Criteria) this;
        }

        public Criteria andServiceFwlxIsNull() {
            addCriterion("service_fwlx is null");
            return (Criteria) this;
        }

        public Criteria andServiceFwlxIsNotNull() {
            addCriterion("service_fwlx is not null");
            return (Criteria) this;
        }

        public Criteria andServiceFwlxEqualTo(Long value) {
            addCriterion("service_fwlx =", value, "serviceFwlx");
            return (Criteria) this;
        }

        public Criteria andServiceFwlxNotEqualTo(Long value) {
            addCriterion("service_fwlx <>", value, "serviceFwlx");
            return (Criteria) this;
        }

        public Criteria andServiceFwlxGreaterThan(Long value) {
            addCriterion("service_fwlx >", value, "serviceFwlx");
            return (Criteria) this;
        }

        public Criteria andServiceFwlxGreaterThanOrEqualTo(Long value) {
            addCriterion("service_fwlx >=", value, "serviceFwlx");
            return (Criteria) this;
        }

        public Criteria andServiceFwlxLessThan(Long value) {
            addCriterion("service_fwlx <", value, "serviceFwlx");
            return (Criteria) this;
        }

        public Criteria andServiceFwlxLessThanOrEqualTo(Long value) {
            addCriterion("service_fwlx <=", value, "serviceFwlx");
            return (Criteria) this;
        }

        public Criteria andServiceFwlxIn(List<Long> values) {
            addCriterion("service_fwlx in", values, "serviceFwlx");
            return (Criteria) this;
        }

        public Criteria andServiceFwlxNotIn(List<Long> values) {
            addCriterion("service_fwlx not in", values, "serviceFwlx");
            return (Criteria) this;
        }

        public Criteria andServiceFwlxBetween(Long value1, Long value2) {
            addCriterion("service_fwlx between", value1, value2, "serviceFwlx");
            return (Criteria) this;
        }

        public Criteria andServiceFwlxNotBetween(Long value1, Long value2) {
            addCriterion("service_fwlx not between", value1, value2, "serviceFwlx");
            return (Criteria) this;
        }

        public Criteria andServiceYylbidIsNull() {
            addCriterion("service_yylbId is null");
            return (Criteria) this;
        }

        public Criteria andServiceYylbidIsNotNull() {
            addCriterion("service_yylbId is not null");
            return (Criteria) this;
        }

        public Criteria andServiceYylbidEqualTo(Long value) {
            addCriterion("service_yylbId =", value, "serviceYylbid");
            return (Criteria) this;
        }

        public Criteria andServiceYylbidNotEqualTo(Long value) {
            addCriterion("service_yylbId <>", value, "serviceYylbid");
            return (Criteria) this;
        }

        public Criteria andServiceYylbidGreaterThan(Long value) {
            addCriterion("service_yylbId >", value, "serviceYylbid");
            return (Criteria) this;
        }

        public Criteria andServiceYylbidGreaterThanOrEqualTo(Long value) {
            addCriterion("service_yylbId >=", value, "serviceYylbid");
            return (Criteria) this;
        }

        public Criteria andServiceYylbidLessThan(Long value) {
            addCriterion("service_yylbId <", value, "serviceYylbid");
            return (Criteria) this;
        }

        public Criteria andServiceYylbidLessThanOrEqualTo(Long value) {
            addCriterion("service_yylbId <=", value, "serviceYylbid");
            return (Criteria) this;
        }

        public Criteria andServiceYylbidIn(List<Long> values) {
            addCriterion("service_yylbId in", values, "serviceYylbid");
            return (Criteria) this;
        }

        public Criteria andServiceYylbidNotIn(List<Long> values) {
            addCriterion("service_yylbId not in", values, "serviceYylbid");
            return (Criteria) this;
        }

        public Criteria andServiceYylbidBetween(Long value1, Long value2) {
            addCriterion("service_yylbId between", value1, value2, "serviceYylbid");
            return (Criteria) this;
        }

        public Criteria andServiceYylbidNotBetween(Long value1, Long value2) {
            addCriterion("service_yylbId not between", value1, value2, "serviceYylbid");
            return (Criteria) this;
        }

        public Criteria andServiceFzrxmIsNull() {
            addCriterion("service_fzrXm is null");
            return (Criteria) this;
        }

        public Criteria andServiceFzrxmIsNotNull() {
            addCriterion("service_fzrXm is not null");
            return (Criteria) this;
        }

        public Criteria andServiceFzrxmEqualTo(String value) {
            addCriterion("service_fzrXm =", value, "serviceFzrxm");
            return (Criteria) this;
        }

        public Criteria andServiceFzrxmNotEqualTo(String value) {
            addCriterion("service_fzrXm <>", value, "serviceFzrxm");
            return (Criteria) this;
        }

        public Criteria andServiceFzrxmGreaterThan(String value) {
            addCriterion("service_fzrXm >", value, "serviceFzrxm");
            return (Criteria) this;
        }

        public Criteria andServiceFzrxmGreaterThanOrEqualTo(String value) {
            addCriterion("service_fzrXm >=", value, "serviceFzrxm");
            return (Criteria) this;
        }

        public Criteria andServiceFzrxmLessThan(String value) {
            addCriterion("service_fzrXm <", value, "serviceFzrxm");
            return (Criteria) this;
        }

        public Criteria andServiceFzrxmLessThanOrEqualTo(String value) {
            addCriterion("service_fzrXm <=", value, "serviceFzrxm");
            return (Criteria) this;
        }

        public Criteria andServiceFzrxmLike(String value) {
            addCriterion("service_fzrXm like", value, "serviceFzrxm");
            return (Criteria) this;
        }

        public Criteria andServiceFzrxmNotLike(String value) {
            addCriterion("service_fzrXm not like", value, "serviceFzrxm");
            return (Criteria) this;
        }

        public Criteria andServiceFzrxmIn(List<String> values) {
            addCriterion("service_fzrXm in", values, "serviceFzrxm");
            return (Criteria) this;
        }

        public Criteria andServiceFzrxmNotIn(List<String> values) {
            addCriterion("service_fzrXm not in", values, "serviceFzrxm");
            return (Criteria) this;
        }

        public Criteria andServiceFzrxmBetween(String value1, String value2) {
            addCriterion("service_fzrXm between", value1, value2, "serviceFzrxm");
            return (Criteria) this;
        }

        public Criteria andServiceFzrxmNotBetween(String value1, String value2) {
            addCriterion("service_fzrXm not between", value1, value2, "serviceFzrxm");
            return (Criteria) this;
        }

        public Criteria andServiceFzrzjlxIsNull() {
            addCriterion("service_fzrZjlx is null");
            return (Criteria) this;
        }

        public Criteria andServiceFzrzjlxIsNotNull() {
            addCriterion("service_fzrZjlx is not null");
            return (Criteria) this;
        }

        public Criteria andServiceFzrzjlxEqualTo(String value) {
            addCriterion("service_fzrZjlx =", value, "serviceFzrzjlx");
            return (Criteria) this;
        }

        public Criteria andServiceFzrzjlxNotEqualTo(String value) {
            addCriterion("service_fzrZjlx <>", value, "serviceFzrzjlx");
            return (Criteria) this;
        }

        public Criteria andServiceFzrzjlxGreaterThan(String value) {
            addCriterion("service_fzrZjlx >", value, "serviceFzrzjlx");
            return (Criteria) this;
        }

        public Criteria andServiceFzrzjlxGreaterThanOrEqualTo(String value) {
            addCriterion("service_fzrZjlx >=", value, "serviceFzrzjlx");
            return (Criteria) this;
        }

        public Criteria andServiceFzrzjlxLessThan(String value) {
            addCriterion("service_fzrZjlx <", value, "serviceFzrzjlx");
            return (Criteria) this;
        }

        public Criteria andServiceFzrzjlxLessThanOrEqualTo(String value) {
            addCriterion("service_fzrZjlx <=", value, "serviceFzrzjlx");
            return (Criteria) this;
        }

        public Criteria andServiceFzrzjlxLike(String value) {
            addCriterion("service_fzrZjlx like", value, "serviceFzrzjlx");
            return (Criteria) this;
        }

        public Criteria andServiceFzrzjlxNotLike(String value) {
            addCriterion("service_fzrZjlx not like", value, "serviceFzrzjlx");
            return (Criteria) this;
        }

        public Criteria andServiceFzrzjlxIn(List<String> values) {
            addCriterion("service_fzrZjlx in", values, "serviceFzrzjlx");
            return (Criteria) this;
        }

        public Criteria andServiceFzrzjlxNotIn(List<String> values) {
            addCriterion("service_fzrZjlx not in", values, "serviceFzrzjlx");
            return (Criteria) this;
        }

        public Criteria andServiceFzrzjlxBetween(String value1, String value2) {
            addCriterion("service_fzrZjlx between", value1, value2, "serviceFzrzjlx");
            return (Criteria) this;
        }

        public Criteria andServiceFzrzjlxNotBetween(String value1, String value2) {
            addCriterion("service_fzrZjlx not between", value1, value2, "serviceFzrzjlx");
            return (Criteria) this;
        }

        public Criteria andServiceFzrzjhmIsNull() {
            addCriterion("service_fzrZjhm is null");
            return (Criteria) this;
        }

        public Criteria andServiceFzrzjhmIsNotNull() {
            addCriterion("service_fzrZjhm is not null");
            return (Criteria) this;
        }

        public Criteria andServiceFzrzjhmEqualTo(String value) {
            addCriterion("service_fzrZjhm =", value, "serviceFzrzjhm");
            return (Criteria) this;
        }

        public Criteria andServiceFzrzjhmNotEqualTo(String value) {
            addCriterion("service_fzrZjhm <>", value, "serviceFzrzjhm");
            return (Criteria) this;
        }

        public Criteria andServiceFzrzjhmGreaterThan(String value) {
            addCriterion("service_fzrZjhm >", value, "serviceFzrzjhm");
            return (Criteria) this;
        }

        public Criteria andServiceFzrzjhmGreaterThanOrEqualTo(String value) {
            addCriterion("service_fzrZjhm >=", value, "serviceFzrzjhm");
            return (Criteria) this;
        }

        public Criteria andServiceFzrzjhmLessThan(String value) {
            addCriterion("service_fzrZjhm <", value, "serviceFzrzjhm");
            return (Criteria) this;
        }

        public Criteria andServiceFzrzjhmLessThanOrEqualTo(String value) {
            addCriterion("service_fzrZjhm <=", value, "serviceFzrzjhm");
            return (Criteria) this;
        }

        public Criteria andServiceFzrzjhmLike(String value) {
            addCriterion("service_fzrZjhm like", value, "serviceFzrzjhm");
            return (Criteria) this;
        }

        public Criteria andServiceFzrzjhmNotLike(String value) {
            addCriterion("service_fzrZjhm not like", value, "serviceFzrzjhm");
            return (Criteria) this;
        }

        public Criteria andServiceFzrzjhmIn(List<String> values) {
            addCriterion("service_fzrZjhm in", values, "serviceFzrzjhm");
            return (Criteria) this;
        }

        public Criteria andServiceFzrzjhmNotIn(List<String> values) {
            addCriterion("service_fzrZjhm not in", values, "serviceFzrzjhm");
            return (Criteria) this;
        }

        public Criteria andServiceFzrzjhmBetween(String value1, String value2) {
            addCriterion("service_fzrZjhm between", value1, value2, "serviceFzrzjhm");
            return (Criteria) this;
        }

        public Criteria andServiceFzrzjhmNotBetween(String value1, String value2) {
            addCriterion("service_fzrZjhm not between", value1, value2, "serviceFzrzjhm");
            return (Criteria) this;
        }

        public Criteria andServiceFzrdzyjIsNull() {
            addCriterion("service_fzrDzyj is null");
            return (Criteria) this;
        }

        public Criteria andServiceFzrdzyjIsNotNull() {
            addCriterion("service_fzrDzyj is not null");
            return (Criteria) this;
        }

        public Criteria andServiceFzrdzyjEqualTo(String value) {
            addCriterion("service_fzrDzyj =", value, "serviceFzrdzyj");
            return (Criteria) this;
        }

        public Criteria andServiceFzrdzyjNotEqualTo(String value) {
            addCriterion("service_fzrDzyj <>", value, "serviceFzrdzyj");
            return (Criteria) this;
        }

        public Criteria andServiceFzrdzyjGreaterThan(String value) {
            addCriterion("service_fzrDzyj >", value, "serviceFzrdzyj");
            return (Criteria) this;
        }

        public Criteria andServiceFzrdzyjGreaterThanOrEqualTo(String value) {
            addCriterion("service_fzrDzyj >=", value, "serviceFzrdzyj");
            return (Criteria) this;
        }

        public Criteria andServiceFzrdzyjLessThan(String value) {
            addCriterion("service_fzrDzyj <", value, "serviceFzrdzyj");
            return (Criteria) this;
        }

        public Criteria andServiceFzrdzyjLessThanOrEqualTo(String value) {
            addCriterion("service_fzrDzyj <=", value, "serviceFzrdzyj");
            return (Criteria) this;
        }

        public Criteria andServiceFzrdzyjLike(String value) {
            addCriterion("service_fzrDzyj like", value, "serviceFzrdzyj");
            return (Criteria) this;
        }

        public Criteria andServiceFzrdzyjNotLike(String value) {
            addCriterion("service_fzrDzyj not like", value, "serviceFzrdzyj");
            return (Criteria) this;
        }

        public Criteria andServiceFzrdzyjIn(List<String> values) {
            addCriterion("service_fzrDzyj in", values, "serviceFzrdzyj");
            return (Criteria) this;
        }

        public Criteria andServiceFzrdzyjNotIn(List<String> values) {
            addCriterion("service_fzrDzyj not in", values, "serviceFzrdzyj");
            return (Criteria) this;
        }

        public Criteria andServiceFzrdzyjBetween(String value1, String value2) {
            addCriterion("service_fzrDzyj between", value1, value2, "serviceFzrdzyj");
            return (Criteria) this;
        }

        public Criteria andServiceFzrdzyjNotBetween(String value1, String value2) {
            addCriterion("service_fzrDzyj not between", value1, value2, "serviceFzrdzyj");
            return (Criteria) this;
        }

        public Criteria andServiceFzrlxfs1IsNull() {
            addCriterion("service_fzrLxfs1 is null");
            return (Criteria) this;
        }

        public Criteria andServiceFzrlxfs1IsNotNull() {
            addCriterion("service_fzrLxfs1 is not null");
            return (Criteria) this;
        }

        public Criteria andServiceFzrlxfs1EqualTo(String value) {
            addCriterion("service_fzrLxfs1 =", value, "serviceFzrlxfs1");
            return (Criteria) this;
        }

        public Criteria andServiceFzrlxfs1NotEqualTo(String value) {
            addCriterion("service_fzrLxfs1 <>", value, "serviceFzrlxfs1");
            return (Criteria) this;
        }

        public Criteria andServiceFzrlxfs1GreaterThan(String value) {
            addCriterion("service_fzrLxfs1 >", value, "serviceFzrlxfs1");
            return (Criteria) this;
        }

        public Criteria andServiceFzrlxfs1GreaterThanOrEqualTo(String value) {
            addCriterion("service_fzrLxfs1 >=", value, "serviceFzrlxfs1");
            return (Criteria) this;
        }

        public Criteria andServiceFzrlxfs1LessThan(String value) {
            addCriterion("service_fzrLxfs1 <", value, "serviceFzrlxfs1");
            return (Criteria) this;
        }

        public Criteria andServiceFzrlxfs1LessThanOrEqualTo(String value) {
            addCriterion("service_fzrLxfs1 <=", value, "serviceFzrlxfs1");
            return (Criteria) this;
        }

        public Criteria andServiceFzrlxfs1Like(String value) {
            addCriterion("service_fzrLxfs1 like", value, "serviceFzrlxfs1");
            return (Criteria) this;
        }

        public Criteria andServiceFzrlxfs1NotLike(String value) {
            addCriterion("service_fzrLxfs1 not like", value, "serviceFzrlxfs1");
            return (Criteria) this;
        }

        public Criteria andServiceFzrlxfs1In(List<String> values) {
            addCriterion("service_fzrLxfs1 in", values, "serviceFzrlxfs1");
            return (Criteria) this;
        }

        public Criteria andServiceFzrlxfs1NotIn(List<String> values) {
            addCriterion("service_fzrLxfs1 not in", values, "serviceFzrlxfs1");
            return (Criteria) this;
        }

        public Criteria andServiceFzrlxfs1Between(String value1, String value2) {
            addCriterion("service_fzrLxfs1 between", value1, value2, "serviceFzrlxfs1");
            return (Criteria) this;
        }

        public Criteria andServiceFzrlxfs1NotBetween(String value1, String value2) {
            addCriterion("service_fzrLxfs1 not between", value1, value2, "serviceFzrlxfs1");
            return (Criteria) this;
        }

        public Criteria andServiceFzrlxfs2IsNull() {
            addCriterion("service_fzrLxfs2 is null");
            return (Criteria) this;
        }

        public Criteria andServiceFzrlxfs2IsNotNull() {
            addCriterion("service_fzrLxfs2 is not null");
            return (Criteria) this;
        }

        public Criteria andServiceFzrlxfs2EqualTo(String value) {
            addCriterion("service_fzrLxfs2 =", value, "serviceFzrlxfs2");
            return (Criteria) this;
        }

        public Criteria andServiceFzrlxfs2NotEqualTo(String value) {
            addCriterion("service_fzrLxfs2 <>", value, "serviceFzrlxfs2");
            return (Criteria) this;
        }

        public Criteria andServiceFzrlxfs2GreaterThan(String value) {
            addCriterion("service_fzrLxfs2 >", value, "serviceFzrlxfs2");
            return (Criteria) this;
        }

        public Criteria andServiceFzrlxfs2GreaterThanOrEqualTo(String value) {
            addCriterion("service_fzrLxfs2 >=", value, "serviceFzrlxfs2");
            return (Criteria) this;
        }

        public Criteria andServiceFzrlxfs2LessThan(String value) {
            addCriterion("service_fzrLxfs2 <", value, "serviceFzrlxfs2");
            return (Criteria) this;
        }

        public Criteria andServiceFzrlxfs2LessThanOrEqualTo(String value) {
            addCriterion("service_fzrLxfs2 <=", value, "serviceFzrlxfs2");
            return (Criteria) this;
        }

        public Criteria andServiceFzrlxfs2Like(String value) {
            addCriterion("service_fzrLxfs2 like", value, "serviceFzrlxfs2");
            return (Criteria) this;
        }

        public Criteria andServiceFzrlxfs2NotLike(String value) {
            addCriterion("service_fzrLxfs2 not like", value, "serviceFzrlxfs2");
            return (Criteria) this;
        }

        public Criteria andServiceFzrlxfs2In(List<String> values) {
            addCriterion("service_fzrLxfs2 in", values, "serviceFzrlxfs2");
            return (Criteria) this;
        }

        public Criteria andServiceFzrlxfs2NotIn(List<String> values) {
            addCriterion("service_fzrLxfs2 not in", values, "serviceFzrlxfs2");
            return (Criteria) this;
        }

        public Criteria andServiceFzrlxfs2Between(String value1, String value2) {
            addCriterion("service_fzrLxfs2 between", value1, value2, "serviceFzrlxfs2");
            return (Criteria) this;
        }

        public Criteria andServiceFzrlxfs2NotBetween(String value1, String value2) {
            addCriterion("service_fzrLxfs2 not between", value1, value2, "serviceFzrlxfs2");
            return (Criteria) this;
        }

        public Criteria andServiceFzryjdhIsNull() {
            addCriterion("service_fzrYjdh is null");
            return (Criteria) this;
        }

        public Criteria andServiceFzryjdhIsNotNull() {
            addCriterion("service_fzrYjdh is not null");
            return (Criteria) this;
        }

        public Criteria andServiceFzryjdhEqualTo(String value) {
            addCriterion("service_fzrYjdh =", value, "serviceFzryjdh");
            return (Criteria) this;
        }

        public Criteria andServiceFzryjdhNotEqualTo(String value) {
            addCriterion("service_fzrYjdh <>", value, "serviceFzryjdh");
            return (Criteria) this;
        }

        public Criteria andServiceFzryjdhGreaterThan(String value) {
            addCriterion("service_fzrYjdh >", value, "serviceFzryjdh");
            return (Criteria) this;
        }

        public Criteria andServiceFzryjdhGreaterThanOrEqualTo(String value) {
            addCriterion("service_fzrYjdh >=", value, "serviceFzryjdh");
            return (Criteria) this;
        }

        public Criteria andServiceFzryjdhLessThan(String value) {
            addCriterion("service_fzrYjdh <", value, "serviceFzryjdh");
            return (Criteria) this;
        }

        public Criteria andServiceFzryjdhLessThanOrEqualTo(String value) {
            addCriterion("service_fzrYjdh <=", value, "serviceFzryjdh");
            return (Criteria) this;
        }

        public Criteria andServiceFzryjdhLike(String value) {
            addCriterion("service_fzrYjdh like", value, "serviceFzryjdh");
            return (Criteria) this;
        }

        public Criteria andServiceFzryjdhNotLike(String value) {
            addCriterion("service_fzrYjdh not like", value, "serviceFzryjdh");
            return (Criteria) this;
        }

        public Criteria andServiceFzryjdhIn(List<String> values) {
            addCriterion("service_fzrYjdh in", values, "serviceFzryjdh");
            return (Criteria) this;
        }

        public Criteria andServiceFzryjdhNotIn(List<String> values) {
            addCriterion("service_fzrYjdh not in", values, "serviceFzryjdh");
            return (Criteria) this;
        }

        public Criteria andServiceFzryjdhBetween(String value1, String value2) {
            addCriterion("service_fzrYjdh between", value1, value2, "serviceFzryjdh");
            return (Criteria) this;
        }

        public Criteria andServiceFzryjdhNotBetween(String value1, String value2) {
            addCriterion("service_fzrYjdh not between", value1, value2, "serviceFzryjdh");
            return (Criteria) this;
        }

        public Criteria andServiceFzrjstxlxIsNull() {
            addCriterion("service_fzrJstxLx is null");
            return (Criteria) this;
        }

        public Criteria andServiceFzrjstxlxIsNotNull() {
            addCriterion("service_fzrJstxLx is not null");
            return (Criteria) this;
        }

        public Criteria andServiceFzrjstxlxEqualTo(Long value) {
            addCriterion("service_fzrJstxLx =", value, "serviceFzrjstxlx");
            return (Criteria) this;
        }

        public Criteria andServiceFzrjstxlxNotEqualTo(Long value) {
            addCriterion("service_fzrJstxLx <>", value, "serviceFzrjstxlx");
            return (Criteria) this;
        }

        public Criteria andServiceFzrjstxlxGreaterThan(Long value) {
            addCriterion("service_fzrJstxLx >", value, "serviceFzrjstxlx");
            return (Criteria) this;
        }

        public Criteria andServiceFzrjstxlxGreaterThanOrEqualTo(Long value) {
            addCriterion("service_fzrJstxLx >=", value, "serviceFzrjstxlx");
            return (Criteria) this;
        }

        public Criteria andServiceFzrjstxlxLessThan(Long value) {
            addCriterion("service_fzrJstxLx <", value, "serviceFzrjstxlx");
            return (Criteria) this;
        }

        public Criteria andServiceFzrjstxlxLessThanOrEqualTo(Long value) {
            addCriterion("service_fzrJstxLx <=", value, "serviceFzrjstxlx");
            return (Criteria) this;
        }

        public Criteria andServiceFzrjstxlxIn(List<Long> values) {
            addCriterion("service_fzrJstxLx in", values, "serviceFzrjstxlx");
            return (Criteria) this;
        }

        public Criteria andServiceFzrjstxlxNotIn(List<Long> values) {
            addCriterion("service_fzrJstxLx not in", values, "serviceFzrjstxlx");
            return (Criteria) this;
        }

        public Criteria andServiceFzrjstxlxBetween(Long value1, Long value2) {
            addCriterion("service_fzrJstxLx between", value1, value2, "serviceFzrjstxlx");
            return (Criteria) this;
        }

        public Criteria andServiceFzrjstxlxNotBetween(Long value1, Long value2) {
            addCriterion("service_fzrJstxLx not between", value1, value2, "serviceFzrjstxlx");
            return (Criteria) this;
        }

        public Criteria andServiceFzrjstxzhIsNull() {
            addCriterion("service_fzrJstxZh is null");
            return (Criteria) this;
        }

        public Criteria andServiceFzrjstxzhIsNotNull() {
            addCriterion("service_fzrJstxZh is not null");
            return (Criteria) this;
        }

        public Criteria andServiceFzrjstxzhEqualTo(String value) {
            addCriterion("service_fzrJstxZh =", value, "serviceFzrjstxzh");
            return (Criteria) this;
        }

        public Criteria andServiceFzrjstxzhNotEqualTo(String value) {
            addCriterion("service_fzrJstxZh <>", value, "serviceFzrjstxzh");
            return (Criteria) this;
        }

        public Criteria andServiceFzrjstxzhGreaterThan(String value) {
            addCriterion("service_fzrJstxZh >", value, "serviceFzrjstxzh");
            return (Criteria) this;
        }

        public Criteria andServiceFzrjstxzhGreaterThanOrEqualTo(String value) {
            addCriterion("service_fzrJstxZh >=", value, "serviceFzrjstxzh");
            return (Criteria) this;
        }

        public Criteria andServiceFzrjstxzhLessThan(String value) {
            addCriterion("service_fzrJstxZh <", value, "serviceFzrjstxzh");
            return (Criteria) this;
        }

        public Criteria andServiceFzrjstxzhLessThanOrEqualTo(String value) {
            addCriterion("service_fzrJstxZh <=", value, "serviceFzrjstxzh");
            return (Criteria) this;
        }

        public Criteria andServiceFzrjstxzhLike(String value) {
            addCriterion("service_fzrJstxZh like", value, "serviceFzrjstxzh");
            return (Criteria) this;
        }

        public Criteria andServiceFzrjstxzhNotLike(String value) {
            addCriterion("service_fzrJstxZh not like", value, "serviceFzrjstxzh");
            return (Criteria) this;
        }

        public Criteria andServiceFzrjstxzhIn(List<String> values) {
            addCriterion("service_fzrJstxZh in", values, "serviceFzrjstxzh");
            return (Criteria) this;
        }

        public Criteria andServiceFzrjstxzhNotIn(List<String> values) {
            addCriterion("service_fzrJstxZh not in", values, "serviceFzrjstxzh");
            return (Criteria) this;
        }

        public Criteria andServiceFzrjstxzhBetween(String value1, String value2) {
            addCriterion("service_fzrJstxZh between", value1, value2, "serviceFzrjstxzh");
            return (Criteria) this;
        }

        public Criteria andServiceFzrjstxzhNotBetween(String value1, String value2) {
            addCriterion("service_fzrJstxZh not between", value1, value2, "serviceFzrjstxzh");
            return (Criteria) this;
        }

        public Criteria andServiceFzrzjyxqIsNull() {
            addCriterion("service_fzrZjyxq is null");
            return (Criteria) this;
        }

        public Criteria andServiceFzrzjyxqIsNotNull() {
            addCriterion("service_fzrZjyxq is not null");
            return (Criteria) this;
        }

        public Criteria andServiceFzrzjyxqEqualTo(String value) {
            addCriterion("service_fzrZjyxq =", value, "serviceFzrzjyxq");
            return (Criteria) this;
        }

        public Criteria andServiceFzrzjyxqNotEqualTo(String value) {
            addCriterion("service_fzrZjyxq <>", value, "serviceFzrzjyxq");
            return (Criteria) this;
        }

        public Criteria andServiceFzrzjyxqGreaterThan(String value) {
            addCriterion("service_fzrZjyxq >", value, "serviceFzrzjyxq");
            return (Criteria) this;
        }

        public Criteria andServiceFzrzjyxqGreaterThanOrEqualTo(String value) {
            addCriterion("service_fzrZjyxq >=", value, "serviceFzrzjyxq");
            return (Criteria) this;
        }

        public Criteria andServiceFzrzjyxqLessThan(String value) {
            addCriterion("service_fzrZjyxq <", value, "serviceFzrzjyxq");
            return (Criteria) this;
        }

        public Criteria andServiceFzrzjyxqLessThanOrEqualTo(String value) {
            addCriterion("service_fzrZjyxq <=", value, "serviceFzrzjyxq");
            return (Criteria) this;
        }

        public Criteria andServiceFzrzjyxqLike(String value) {
            addCriterion("service_fzrZjyxq like", value, "serviceFzrzjyxq");
            return (Criteria) this;
        }

        public Criteria andServiceFzrzjyxqNotLike(String value) {
            addCriterion("service_fzrZjyxq not like", value, "serviceFzrzjyxq");
            return (Criteria) this;
        }

        public Criteria andServiceFzrzjyxqIn(List<String> values) {
            addCriterion("service_fzrZjyxq in", values, "serviceFzrzjyxq");
            return (Criteria) this;
        }

        public Criteria andServiceFzrzjyxqNotIn(List<String> values) {
            addCriterion("service_fzrZjyxq not in", values, "serviceFzrzjyxq");
            return (Criteria) this;
        }

        public Criteria andServiceFzrzjyxqBetween(String value1, String value2) {
            addCriterion("service_fzrZjyxq between", value1, value2, "serviceFzrzjyxq");
            return (Criteria) this;
        }

        public Criteria andServiceFzrzjyxqNotBetween(String value1, String value2) {
            addCriterion("service_fzrZjyxq not between", value1, value2, "serviceFzrzjyxq");
            return (Criteria) this;
        }

        public Criteria andServiceWzbzIsNull() {
            addCriterion("service_wzBz is null");
            return (Criteria) this;
        }

        public Criteria andServiceWzbzIsNotNull() {
            addCriterion("service_wzBz is not null");
            return (Criteria) this;
        }

        public Criteria andServiceWzbzEqualTo(String value) {
            addCriterion("service_wzBz =", value, "serviceWzbz");
            return (Criteria) this;
        }

        public Criteria andServiceWzbzNotEqualTo(String value) {
            addCriterion("service_wzBz <>", value, "serviceWzbz");
            return (Criteria) this;
        }

        public Criteria andServiceWzbzGreaterThan(String value) {
            addCriterion("service_wzBz >", value, "serviceWzbz");
            return (Criteria) this;
        }

        public Criteria andServiceWzbzGreaterThanOrEqualTo(String value) {
            addCriterion("service_wzBz >=", value, "serviceWzbz");
            return (Criteria) this;
        }

        public Criteria andServiceWzbzLessThan(String value) {
            addCriterion("service_wzBz <", value, "serviceWzbz");
            return (Criteria) this;
        }

        public Criteria andServiceWzbzLessThanOrEqualTo(String value) {
            addCriterion("service_wzBz <=", value, "serviceWzbz");
            return (Criteria) this;
        }

        public Criteria andServiceWzbzLike(String value) {
            addCriterion("service_wzBz like", value, "serviceWzbz");
            return (Criteria) this;
        }

        public Criteria andServiceWzbzNotLike(String value) {
            addCriterion("service_wzBz not like", value, "serviceWzbz");
            return (Criteria) this;
        }

        public Criteria andServiceWzbzIn(List<String> values) {
            addCriterion("service_wzBz in", values, "serviceWzbz");
            return (Criteria) this;
        }

        public Criteria andServiceWzbzNotIn(List<String> values) {
            addCriterion("service_wzBz not in", values, "serviceWzbz");
            return (Criteria) this;
        }

        public Criteria andServiceWzbzBetween(String value1, String value2) {
            addCriterion("service_wzBz between", value1, value2, "serviceWzbz");
            return (Criteria) this;
        }

        public Criteria andServiceWzbzNotBetween(String value1, String value2) {
            addCriterion("service_wzBz not between", value1, value2, "serviceWzbz");
            return (Criteria) this;
        }

        public Criteria andServiceXcxidIsNull() {
            addCriterion("service_xcxId is null");
            return (Criteria) this;
        }

        public Criteria andServiceXcxidIsNotNull() {
            addCriterion("service_xcxId is not null");
            return (Criteria) this;
        }

        public Criteria andServiceXcxidEqualTo(String value) {
            addCriterion("service_xcxId =", value, "serviceXcxid");
            return (Criteria) this;
        }

        public Criteria andServiceXcxidNotEqualTo(String value) {
            addCriterion("service_xcxId <>", value, "serviceXcxid");
            return (Criteria) this;
        }

        public Criteria andServiceXcxidGreaterThan(String value) {
            addCriterion("service_xcxId >", value, "serviceXcxid");
            return (Criteria) this;
        }

        public Criteria andServiceXcxidGreaterThanOrEqualTo(String value) {
            addCriterion("service_xcxId >=", value, "serviceXcxid");
            return (Criteria) this;
        }

        public Criteria andServiceXcxidLessThan(String value) {
            addCriterion("service_xcxId <", value, "serviceXcxid");
            return (Criteria) this;
        }

        public Criteria andServiceXcxidLessThanOrEqualTo(String value) {
            addCriterion("service_xcxId <=", value, "serviceXcxid");
            return (Criteria) this;
        }

        public Criteria andServiceXcxidLike(String value) {
            addCriterion("service_xcxId like", value, "serviceXcxid");
            return (Criteria) this;
        }

        public Criteria andServiceXcxidNotLike(String value) {
            addCriterion("service_xcxId not like", value, "serviceXcxid");
            return (Criteria) this;
        }

        public Criteria andServiceXcxidIn(List<String> values) {
            addCriterion("service_xcxId in", values, "serviceXcxid");
            return (Criteria) this;
        }

        public Criteria andServiceXcxidNotIn(List<String> values) {
            addCriterion("service_xcxId not in", values, "serviceXcxid");
            return (Criteria) this;
        }

        public Criteria andServiceXcxidBetween(String value1, String value2) {
            addCriterion("service_xcxId between", value1, value2, "serviceXcxid");
            return (Criteria) this;
        }

        public Criteria andServiceXcxidNotBetween(String value1, String value2) {
            addCriterion("service_xcxId not between", value1, value2, "serviceXcxid");
            return (Criteria) this;
        }

        public Criteria andAnnexCjmIsNull() {
            addCriterion("annex_cjm is null");
            return (Criteria) this;
        }

        public Criteria andAnnexCjmIsNotNull() {
            addCriterion("annex_cjm is not null");
            return (Criteria) this;
        }

        public Criteria andAnnexCjmEqualTo(String value) {
            addCriterion("annex_cjm =", value, "annexCjm");
            return (Criteria) this;
        }

        public Criteria andAnnexCjmNotEqualTo(String value) {
            addCriterion("annex_cjm <>", value, "annexCjm");
            return (Criteria) this;
        }

        public Criteria andAnnexCjmGreaterThan(String value) {
            addCriterion("annex_cjm >", value, "annexCjm");
            return (Criteria) this;
        }

        public Criteria andAnnexCjmGreaterThanOrEqualTo(String value) {
            addCriterion("annex_cjm >=", value, "annexCjm");
            return (Criteria) this;
        }

        public Criteria andAnnexCjmLessThan(String value) {
            addCriterion("annex_cjm <", value, "annexCjm");
            return (Criteria) this;
        }

        public Criteria andAnnexCjmLessThanOrEqualTo(String value) {
            addCriterion("annex_cjm <=", value, "annexCjm");
            return (Criteria) this;
        }

        public Criteria andAnnexCjmLike(String value) {
            addCriterion("annex_cjm like", value, "annexCjm");
            return (Criteria) this;
        }

        public Criteria andAnnexCjmNotLike(String value) {
            addCriterion("annex_cjm not like", value, "annexCjm");
            return (Criteria) this;
        }

        public Criteria andAnnexCjmIn(List<String> values) {
            addCriterion("annex_cjm in", values, "annexCjm");
            return (Criteria) this;
        }

        public Criteria andAnnexCjmNotIn(List<String> values) {
            addCriterion("annex_cjm not in", values, "annexCjm");
            return (Criteria) this;
        }

        public Criteria andAnnexCjmBetween(String value1, String value2) {
            addCriterion("annex_cjm between", value1, value2, "annexCjm");
            return (Criteria) this;
        }

        public Criteria andAnnexCjmNotBetween(String value1, String value2) {
            addCriterion("annex_cjm not between", value1, value2, "annexCjm");
            return (Criteria) this;
        }

        public Criteria andAnnexHyclbsIsNull() {
            addCriterion("annex_hyclbs is null");
            return (Criteria) this;
        }

        public Criteria andAnnexHyclbsIsNotNull() {
            addCriterion("annex_hyclbs is not null");
            return (Criteria) this;
        }

        public Criteria andAnnexHyclbsEqualTo(Long value) {
            addCriterion("annex_hyclbs =", value, "annexHyclbs");
            return (Criteria) this;
        }

        public Criteria andAnnexHyclbsNotEqualTo(Long value) {
            addCriterion("annex_hyclbs <>", value, "annexHyclbs");
            return (Criteria) this;
        }

        public Criteria andAnnexHyclbsGreaterThan(Long value) {
            addCriterion("annex_hyclbs >", value, "annexHyclbs");
            return (Criteria) this;
        }

        public Criteria andAnnexHyclbsGreaterThanOrEqualTo(Long value) {
            addCriterion("annex_hyclbs >=", value, "annexHyclbs");
            return (Criteria) this;
        }

        public Criteria andAnnexHyclbsLessThan(Long value) {
            addCriterion("annex_hyclbs <", value, "annexHyclbs");
            return (Criteria) this;
        }

        public Criteria andAnnexHyclbsLessThanOrEqualTo(Long value) {
            addCriterion("annex_hyclbs <=", value, "annexHyclbs");
            return (Criteria) this;
        }

        public Criteria andAnnexHyclbsIn(List<Long> values) {
            addCriterion("annex_hyclbs in", values, "annexHyclbs");
            return (Criteria) this;
        }

        public Criteria andAnnexHyclbsNotIn(List<Long> values) {
            addCriterion("annex_hyclbs not in", values, "annexHyclbs");
            return (Criteria) this;
        }

        public Criteria andAnnexHyclbsBetween(Long value1, Long value2) {
            addCriterion("annex_hyclbs between", value1, value2, "annexHyclbs");
            return (Criteria) this;
        }

        public Criteria andAnnexHyclbsNotBetween(Long value1, Long value2) {
            addCriterion("annex_hyclbs not between", value1, value2, "annexHyclbs");
            return (Criteria) this;
        }

        public Criteria andAnnexFjwjgsIsNull() {
            addCriterion("annex_fjwjgs is null");
            return (Criteria) this;
        }

        public Criteria andAnnexFjwjgsIsNotNull() {
            addCriterion("annex_fjwjgs is not null");
            return (Criteria) this;
        }

        public Criteria andAnnexFjwjgsEqualTo(Long value) {
            addCriterion("annex_fjwjgs =", value, "annexFjwjgs");
            return (Criteria) this;
        }

        public Criteria andAnnexFjwjgsNotEqualTo(Long value) {
            addCriterion("annex_fjwjgs <>", value, "annexFjwjgs");
            return (Criteria) this;
        }

        public Criteria andAnnexFjwjgsGreaterThan(Long value) {
            addCriterion("annex_fjwjgs >", value, "annexFjwjgs");
            return (Criteria) this;
        }

        public Criteria andAnnexFjwjgsGreaterThanOrEqualTo(Long value) {
            addCriterion("annex_fjwjgs >=", value, "annexFjwjgs");
            return (Criteria) this;
        }

        public Criteria andAnnexFjwjgsLessThan(Long value) {
            addCriterion("annex_fjwjgs <", value, "annexFjwjgs");
            return (Criteria) this;
        }

        public Criteria andAnnexFjwjgsLessThanOrEqualTo(Long value) {
            addCriterion("annex_fjwjgs <=", value, "annexFjwjgs");
            return (Criteria) this;
        }

        public Criteria andAnnexFjwjgsIn(List<Long> values) {
            addCriterion("annex_fjwjgs in", values, "annexFjwjgs");
            return (Criteria) this;
        }

        public Criteria andAnnexFjwjgsNotIn(List<Long> values) {
            addCriterion("annex_fjwjgs not in", values, "annexFjwjgs");
            return (Criteria) this;
        }

        public Criteria andAnnexFjwjgsBetween(Long value1, Long value2) {
            addCriterion("annex_fjwjgs between", value1, value2, "annexFjwjgs");
            return (Criteria) this;
        }

        public Criteria andAnnexFjwjgsNotBetween(Long value1, Long value2) {
            addCriterion("annex_fjwjgs not between", value1, value2, "annexFjwjgs");
            return (Criteria) this;
        }

        public Criteria andAnnexFjytIsNull() {
            addCriterion("annex_fjyt is null");
            return (Criteria) this;
        }

        public Criteria andAnnexFjytIsNotNull() {
            addCriterion("annex_fjyt is not null");
            return (Criteria) this;
        }

        public Criteria andAnnexFjytEqualTo(Long value) {
            addCriterion("annex_fjyt =", value, "annexFjyt");
            return (Criteria) this;
        }

        public Criteria andAnnexFjytNotEqualTo(Long value) {
            addCriterion("annex_fjyt <>", value, "annexFjyt");
            return (Criteria) this;
        }

        public Criteria andAnnexFjytGreaterThan(Long value) {
            addCriterion("annex_fjyt >", value, "annexFjyt");
            return (Criteria) this;
        }

        public Criteria andAnnexFjytGreaterThanOrEqualTo(Long value) {
            addCriterion("annex_fjyt >=", value, "annexFjyt");
            return (Criteria) this;
        }

        public Criteria andAnnexFjytLessThan(Long value) {
            addCriterion("annex_fjyt <", value, "annexFjyt");
            return (Criteria) this;
        }

        public Criteria andAnnexFjytLessThanOrEqualTo(Long value) {
            addCriterion("annex_fjyt <=", value, "annexFjyt");
            return (Criteria) this;
        }

        public Criteria andAnnexFjytIn(List<Long> values) {
            addCriterion("annex_fjyt in", values, "annexFjyt");
            return (Criteria) this;
        }

        public Criteria andAnnexFjytNotIn(List<Long> values) {
            addCriterion("annex_fjyt not in", values, "annexFjyt");
            return (Criteria) this;
        }

        public Criteria andAnnexFjytBetween(Long value1, Long value2) {
            addCriterion("annex_fjyt between", value1, value2, "annexFjyt");
            return (Criteria) this;
        }

        public Criteria andAnnexFjytNotBetween(Long value1, Long value2) {
            addCriterion("annex_fjyt not between", value1, value2, "annexFjyt");
            return (Criteria) this;
        }

        public Criteria andAnnexFjnrIsNull() {
            addCriterion("annex_fjnr is null");
            return (Criteria) this;
        }

        public Criteria andAnnexFjnrIsNotNull() {
            addCriterion("annex_fjnr is not null");
            return (Criteria) this;
        }

        public Criteria andAnnexFjnrEqualTo(String value) {
            addCriterion("annex_fjnr =", value, "annexFjnr");
            return (Criteria) this;
        }

        public Criteria andAnnexFjnrNotEqualTo(String value) {
            addCriterion("annex_fjnr <>", value, "annexFjnr");
            return (Criteria) this;
        }

        public Criteria andAnnexFjnrGreaterThan(String value) {
            addCriterion("annex_fjnr >", value, "annexFjnr");
            return (Criteria) this;
        }

        public Criteria andAnnexFjnrGreaterThanOrEqualTo(String value) {
            addCriterion("annex_fjnr >=", value, "annexFjnr");
            return (Criteria) this;
        }

        public Criteria andAnnexFjnrLessThan(String value) {
            addCriterion("annex_fjnr <", value, "annexFjnr");
            return (Criteria) this;
        }

        public Criteria andAnnexFjnrLessThanOrEqualTo(String value) {
            addCriterion("annex_fjnr <=", value, "annexFjnr");
            return (Criteria) this;
        }

        public Criteria andAnnexFjnrLike(String value) {
            addCriterion("annex_fjnr like", value, "annexFjnr");
            return (Criteria) this;
        }

        public Criteria andAnnexFjnrNotLike(String value) {
            addCriterion("annex_fjnr not like", value, "annexFjnr");
            return (Criteria) this;
        }

        public Criteria andAnnexFjnrIn(List<String> values) {
            addCriterion("annex_fjnr in", values, "annexFjnr");
            return (Criteria) this;
        }

        public Criteria andAnnexFjnrNotIn(List<String> values) {
            addCriterion("annex_fjnr not in", values, "annexFjnr");
            return (Criteria) this;
        }

        public Criteria andAnnexFjnrBetween(String value1, String value2) {
            addCriterion("annex_fjnr between", value1, value2, "annexFjnr");
            return (Criteria) this;
        }

        public Criteria andAnnexFjnrNotBetween(String value1, String value2) {
            addCriterion("annex_fjnr not between", value1, value2, "annexFjnr");
            return (Criteria) this;
        }

        public Criteria andAnnexFjssdxssdxlxIsNull() {
            addCriterion("annex_fjssdxSsdxlx is null");
            return (Criteria) this;
        }

        public Criteria andAnnexFjssdxssdxlxIsNotNull() {
            addCriterion("annex_fjssdxSsdxlx is not null");
            return (Criteria) this;
        }

        public Criteria andAnnexFjssdxssdxlxEqualTo(Long value) {
            addCriterion("annex_fjssdxSsdxlx =", value, "annexFjssdxssdxlx");
            return (Criteria) this;
        }

        public Criteria andAnnexFjssdxssdxlxNotEqualTo(Long value) {
            addCriterion("annex_fjssdxSsdxlx <>", value, "annexFjssdxssdxlx");
            return (Criteria) this;
        }

        public Criteria andAnnexFjssdxssdxlxGreaterThan(Long value) {
            addCriterion("annex_fjssdxSsdxlx >", value, "annexFjssdxssdxlx");
            return (Criteria) this;
        }

        public Criteria andAnnexFjssdxssdxlxGreaterThanOrEqualTo(Long value) {
            addCriterion("annex_fjssdxSsdxlx >=", value, "annexFjssdxssdxlx");
            return (Criteria) this;
        }

        public Criteria andAnnexFjssdxssdxlxLessThan(Long value) {
            addCriterion("annex_fjssdxSsdxlx <", value, "annexFjssdxssdxlx");
            return (Criteria) this;
        }

        public Criteria andAnnexFjssdxssdxlxLessThanOrEqualTo(Long value) {
            addCriterion("annex_fjssdxSsdxlx <=", value, "annexFjssdxssdxlx");
            return (Criteria) this;
        }

        public Criteria andAnnexFjssdxssdxlxIn(List<Long> values) {
            addCriterion("annex_fjssdxSsdxlx in", values, "annexFjssdxssdxlx");
            return (Criteria) this;
        }

        public Criteria andAnnexFjssdxssdxlxNotIn(List<Long> values) {
            addCriterion("annex_fjssdxSsdxlx not in", values, "annexFjssdxssdxlx");
            return (Criteria) this;
        }

        public Criteria andAnnexFjssdxssdxlxBetween(Long value1, Long value2) {
            addCriterion("annex_fjssdxSsdxlx between", value1, value2, "annexFjssdxssdxlx");
            return (Criteria) this;
        }

        public Criteria andAnnexFjssdxssdxlxNotBetween(Long value1, Long value2) {
            addCriterion("annex_fjssdxSsdxlx not between", value1, value2, "annexFjssdxssdxlx");
            return (Criteria) this;
        }

        public Criteria andAnnexFjssdxssdxbsIsNull() {
            addCriterion("annex_fjssdxSsdxbs is null");
            return (Criteria) this;
        }

        public Criteria andAnnexFjssdxssdxbsIsNotNull() {
            addCriterion("annex_fjssdxSsdxbs is not null");
            return (Criteria) this;
        }

        public Criteria andAnnexFjssdxssdxbsEqualTo(String value) {
            addCriterion("annex_fjssdxSsdxbs =", value, "annexFjssdxssdxbs");
            return (Criteria) this;
        }

        public Criteria andAnnexFjssdxssdxbsNotEqualTo(String value) {
            addCriterion("annex_fjssdxSsdxbs <>", value, "annexFjssdxssdxbs");
            return (Criteria) this;
        }

        public Criteria andAnnexFjssdxssdxbsGreaterThan(String value) {
            addCriterion("annex_fjssdxSsdxbs >", value, "annexFjssdxssdxbs");
            return (Criteria) this;
        }

        public Criteria andAnnexFjssdxssdxbsGreaterThanOrEqualTo(String value) {
            addCriterion("annex_fjssdxSsdxbs >=", value, "annexFjssdxssdxbs");
            return (Criteria) this;
        }

        public Criteria andAnnexFjssdxssdxbsLessThan(String value) {
            addCriterion("annex_fjssdxSsdxbs <", value, "annexFjssdxssdxbs");
            return (Criteria) this;
        }

        public Criteria andAnnexFjssdxssdxbsLessThanOrEqualTo(String value) {
            addCriterion("annex_fjssdxSsdxbs <=", value, "annexFjssdxssdxbs");
            return (Criteria) this;
        }

        public Criteria andAnnexFjssdxssdxbsLike(String value) {
            addCriterion("annex_fjssdxSsdxbs like", value, "annexFjssdxssdxbs");
            return (Criteria) this;
        }

        public Criteria andAnnexFjssdxssdxbsNotLike(String value) {
            addCriterion("annex_fjssdxSsdxbs not like", value, "annexFjssdxssdxbs");
            return (Criteria) this;
        }

        public Criteria andAnnexFjssdxssdxbsIn(List<String> values) {
            addCriterion("annex_fjssdxSsdxbs in", values, "annexFjssdxssdxbs");
            return (Criteria) this;
        }

        public Criteria andAnnexFjssdxssdxbsNotIn(List<String> values) {
            addCriterion("annex_fjssdxSsdxbs not in", values, "annexFjssdxssdxbs");
            return (Criteria) this;
        }

        public Criteria andAnnexFjssdxssdxbsBetween(String value1, String value2) {
            addCriterion("annex_fjssdxSsdxbs between", value1, value2, "annexFjssdxssdxbs");
            return (Criteria) this;
        }

        public Criteria andAnnexFjssdxssdxbsNotBetween(String value1, String value2) {
            addCriterion("annex_fjssdxSsdxbs not between", value1, value2, "annexFjssdxssdxbs");
            return (Criteria) this;
        }

        public Criteria andAnnexBzIsNull() {
            addCriterion("annex_bz is null");
            return (Criteria) this;
        }

        public Criteria andAnnexBzIsNotNull() {
            addCriterion("annex_bz is not null");
            return (Criteria) this;
        }

        public Criteria andAnnexBzEqualTo(String value) {
            addCriterion("annex_bz =", value, "annexBz");
            return (Criteria) this;
        }

        public Criteria andAnnexBzNotEqualTo(String value) {
            addCriterion("annex_bz <>", value, "annexBz");
            return (Criteria) this;
        }

        public Criteria andAnnexBzGreaterThan(String value) {
            addCriterion("annex_bz >", value, "annexBz");
            return (Criteria) this;
        }

        public Criteria andAnnexBzGreaterThanOrEqualTo(String value) {
            addCriterion("annex_bz >=", value, "annexBz");
            return (Criteria) this;
        }

        public Criteria andAnnexBzLessThan(String value) {
            addCriterion("annex_bz <", value, "annexBz");
            return (Criteria) this;
        }

        public Criteria andAnnexBzLessThanOrEqualTo(String value) {
            addCriterion("annex_bz <=", value, "annexBz");
            return (Criteria) this;
        }

        public Criteria andAnnexBzLike(String value) {
            addCriterion("annex_bz like", value, "annexBz");
            return (Criteria) this;
        }

        public Criteria andAnnexBzNotLike(String value) {
            addCriterion("annex_bz not like", value, "annexBz");
            return (Criteria) this;
        }

        public Criteria andAnnexBzIn(List<String> values) {
            addCriterion("annex_bz in", values, "annexBz");
            return (Criteria) this;
        }

        public Criteria andAnnexBzNotIn(List<String> values) {
            addCriterion("annex_bz not in", values, "annexBz");
            return (Criteria) this;
        }

        public Criteria andAnnexBzBetween(String value1, String value2) {
            addCriterion("annex_bz between", value1, value2, "annexBz");
            return (Criteria) this;
        }

        public Criteria andAnnexBzNotBetween(String value1, String value2) {
            addCriterion("annex_bz not between", value1, value2, "annexBz");
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