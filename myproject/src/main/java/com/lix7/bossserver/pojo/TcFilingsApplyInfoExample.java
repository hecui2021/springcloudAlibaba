package com.lix7.bossserver.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TcFilingsApplyInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TcFilingsApplyInfoExample() {
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

        public Criteria andMainPartNameIsNull() {
            addCriterion("main_part_name is null");
            return (Criteria) this;
        }

        public Criteria andMainPartNameIsNotNull() {
            addCriterion("main_part_name is not null");
            return (Criteria) this;
        }

        public Criteria andMainPartNameEqualTo(String value) {
            addCriterion("main_part_name =", value, "mainPartName");
            return (Criteria) this;
        }

        public Criteria andMainPartNameNotEqualTo(String value) {
            addCriterion("main_part_name <>", value, "mainPartName");
            return (Criteria) this;
        }

        public Criteria andMainPartNameGreaterThan(String value) {
            addCriterion("main_part_name >", value, "mainPartName");
            return (Criteria) this;
        }

        public Criteria andMainPartNameGreaterThanOrEqualTo(String value) {
            addCriterion("main_part_name >=", value, "mainPartName");
            return (Criteria) this;
        }

        public Criteria andMainPartNameLessThan(String value) {
            addCriterion("main_part_name <", value, "mainPartName");
            return (Criteria) this;
        }

        public Criteria andMainPartNameLessThanOrEqualTo(String value) {
            addCriterion("main_part_name <=", value, "mainPartName");
            return (Criteria) this;
        }

        public Criteria andMainPartNameLike(String value) {
            addCriterion("main_part_name like", value, "mainPartName");
            return (Criteria) this;
        }

        public Criteria andMainPartNameNotLike(String value) {
            addCriterion("main_part_name not like", value, "mainPartName");
            return (Criteria) this;
        }

        public Criteria andMainPartNameIn(List<String> values) {
            addCriterion("main_part_name in", values, "mainPartName");
            return (Criteria) this;
        }

        public Criteria andMainPartNameNotIn(List<String> values) {
            addCriterion("main_part_name not in", values, "mainPartName");
            return (Criteria) this;
        }

        public Criteria andMainPartNameBetween(String value1, String value2) {
            addCriterion("main_part_name between", value1, value2, "mainPartName");
            return (Criteria) this;
        }

        public Criteria andMainPartNameNotBetween(String value1, String value2) {
            addCriterion("main_part_name not between", value1, value2, "mainPartName");
            return (Criteria) this;
        }

        public Criteria andMainPartTzrIsNull() {
            addCriterion("main_part_tzr is null");
            return (Criteria) this;
        }

        public Criteria andMainPartTzrIsNotNull() {
            addCriterion("main_part_tzr is not null");
            return (Criteria) this;
        }

        public Criteria andMainPartTzrEqualTo(String value) {
            addCriterion("main_part_tzr =", value, "mainPartTzr");
            return (Criteria) this;
        }

        public Criteria andMainPartTzrNotEqualTo(String value) {
            addCriterion("main_part_tzr <>", value, "mainPartTzr");
            return (Criteria) this;
        }

        public Criteria andMainPartTzrGreaterThan(String value) {
            addCriterion("main_part_tzr >", value, "mainPartTzr");
            return (Criteria) this;
        }

        public Criteria andMainPartTzrGreaterThanOrEqualTo(String value) {
            addCriterion("main_part_tzr >=", value, "mainPartTzr");
            return (Criteria) this;
        }

        public Criteria andMainPartTzrLessThan(String value) {
            addCriterion("main_part_tzr <", value, "mainPartTzr");
            return (Criteria) this;
        }

        public Criteria andMainPartTzrLessThanOrEqualTo(String value) {
            addCriterion("main_part_tzr <=", value, "mainPartTzr");
            return (Criteria) this;
        }

        public Criteria andMainPartTzrLike(String value) {
            addCriterion("main_part_tzr like", value, "mainPartTzr");
            return (Criteria) this;
        }

        public Criteria andMainPartTzrNotLike(String value) {
            addCriterion("main_part_tzr not like", value, "mainPartTzr");
            return (Criteria) this;
        }

        public Criteria andMainPartTzrIn(List<String> values) {
            addCriterion("main_part_tzr in", values, "mainPartTzr");
            return (Criteria) this;
        }

        public Criteria andMainPartTzrNotIn(List<String> values) {
            addCriterion("main_part_tzr not in", values, "mainPartTzr");
            return (Criteria) this;
        }

        public Criteria andMainPartTzrBetween(String value1, String value2) {
            addCriterion("main_part_tzr between", value1, value2, "mainPartTzr");
            return (Criteria) this;
        }

        public Criteria andMainPartTzrNotBetween(String value1, String value2) {
            addCriterion("main_part_tzr not between", value1, value2, "mainPartTzr");
            return (Criteria) this;
        }

        public Criteria andMainPartDwxzIsNull() {
            addCriterion("main_part_dwxz is null");
            return (Criteria) this;
        }

        public Criteria andMainPartDwxzIsNotNull() {
            addCriterion("main_part_dwxz is not null");
            return (Criteria) this;
        }

        public Criteria andMainPartDwxzEqualTo(Long value) {
            addCriterion("main_part_dwxz =", value, "mainPartDwxz");
            return (Criteria) this;
        }

        public Criteria andMainPartDwxzNotEqualTo(Long value) {
            addCriterion("main_part_dwxz <>", value, "mainPartDwxz");
            return (Criteria) this;
        }

        public Criteria andMainPartDwxzGreaterThan(Long value) {
            addCriterion("main_part_dwxz >", value, "mainPartDwxz");
            return (Criteria) this;
        }

        public Criteria andMainPartDwxzGreaterThanOrEqualTo(Long value) {
            addCriterion("main_part_dwxz >=", value, "mainPartDwxz");
            return (Criteria) this;
        }

        public Criteria andMainPartDwxzLessThan(Long value) {
            addCriterion("main_part_dwxz <", value, "mainPartDwxz");
            return (Criteria) this;
        }

        public Criteria andMainPartDwxzLessThanOrEqualTo(Long value) {
            addCriterion("main_part_dwxz <=", value, "mainPartDwxz");
            return (Criteria) this;
        }

        public Criteria andMainPartDwxzIn(List<Long> values) {
            addCriterion("main_part_dwxz in", values, "mainPartDwxz");
            return (Criteria) this;
        }

        public Criteria andMainPartDwxzNotIn(List<Long> values) {
            addCriterion("main_part_dwxz not in", values, "mainPartDwxz");
            return (Criteria) this;
        }

        public Criteria andMainPartDwxzBetween(Long value1, Long value2) {
            addCriterion("main_part_dwxz between", value1, value2, "mainPartDwxz");
            return (Criteria) this;
        }

        public Criteria andMainPartDwxzNotBetween(Long value1, Long value2) {
            addCriterion("main_part_dwxz not between", value1, value2, "mainPartDwxz");
            return (Criteria) this;
        }

        public Criteria andMainPartZjlxIsNull() {
            addCriterion("main_part_zjlx is null");
            return (Criteria) this;
        }

        public Criteria andMainPartZjlxIsNotNull() {
            addCriterion("main_part_zjlx is not null");
            return (Criteria) this;
        }

        public Criteria andMainPartZjlxEqualTo(Long value) {
            addCriterion("main_part_zjlx =", value, "mainPartZjlx");
            return (Criteria) this;
        }

        public Criteria andMainPartZjlxNotEqualTo(Long value) {
            addCriterion("main_part_zjlx <>", value, "mainPartZjlx");
            return (Criteria) this;
        }

        public Criteria andMainPartZjlxGreaterThan(Long value) {
            addCriterion("main_part_zjlx >", value, "mainPartZjlx");
            return (Criteria) this;
        }

        public Criteria andMainPartZjlxGreaterThanOrEqualTo(Long value) {
            addCriterion("main_part_zjlx >=", value, "mainPartZjlx");
            return (Criteria) this;
        }

        public Criteria andMainPartZjlxLessThan(Long value) {
            addCriterion("main_part_zjlx <", value, "mainPartZjlx");
            return (Criteria) this;
        }

        public Criteria andMainPartZjlxLessThanOrEqualTo(Long value) {
            addCriterion("main_part_zjlx <=", value, "mainPartZjlx");
            return (Criteria) this;
        }

        public Criteria andMainPartZjlxIn(List<Long> values) {
            addCriterion("main_part_zjlx in", values, "mainPartZjlx");
            return (Criteria) this;
        }

        public Criteria andMainPartZjlxNotIn(List<Long> values) {
            addCriterion("main_part_zjlx not in", values, "mainPartZjlx");
            return (Criteria) this;
        }

        public Criteria andMainPartZjlxBetween(Long value1, Long value2) {
            addCriterion("main_part_zjlx between", value1, value2, "mainPartZjlx");
            return (Criteria) this;
        }

        public Criteria andMainPartZjlxNotBetween(Long value1, Long value2) {
            addCriterion("main_part_zjlx not between", value1, value2, "mainPartZjlx");
            return (Criteria) this;
        }

        public Criteria andMainPartZjhmIsNull() {
            addCriterion("main_part_zjhm is null");
            return (Criteria) this;
        }

        public Criteria andMainPartZjhmIsNotNull() {
            addCriterion("main_part_zjhm is not null");
            return (Criteria) this;
        }

        public Criteria andMainPartZjhmEqualTo(String value) {
            addCriterion("main_part_zjhm =", value, "mainPartZjhm");
            return (Criteria) this;
        }

        public Criteria andMainPartZjhmNotEqualTo(String value) {
            addCriterion("main_part_zjhm <>", value, "mainPartZjhm");
            return (Criteria) this;
        }

        public Criteria andMainPartZjhmGreaterThan(String value) {
            addCriterion("main_part_zjhm >", value, "mainPartZjhm");
            return (Criteria) this;
        }

        public Criteria andMainPartZjhmGreaterThanOrEqualTo(String value) {
            addCriterion("main_part_zjhm >=", value, "mainPartZjhm");
            return (Criteria) this;
        }

        public Criteria andMainPartZjhmLessThan(String value) {
            addCriterion("main_part_zjhm <", value, "mainPartZjhm");
            return (Criteria) this;
        }

        public Criteria andMainPartZjhmLessThanOrEqualTo(String value) {
            addCriterion("main_part_zjhm <=", value, "mainPartZjhm");
            return (Criteria) this;
        }

        public Criteria andMainPartZjhmLike(String value) {
            addCriterion("main_part_zjhm like", value, "mainPartZjhm");
            return (Criteria) this;
        }

        public Criteria andMainPartZjhmNotLike(String value) {
            addCriterion("main_part_zjhm not like", value, "mainPartZjhm");
            return (Criteria) this;
        }

        public Criteria andMainPartZjhmIn(List<String> values) {
            addCriterion("main_part_zjhm in", values, "mainPartZjhm");
            return (Criteria) this;
        }

        public Criteria andMainPartZjhmNotIn(List<String> values) {
            addCriterion("main_part_zjhm not in", values, "mainPartZjhm");
            return (Criteria) this;
        }

        public Criteria andMainPartZjhmBetween(String value1, String value2) {
            addCriterion("main_part_zjhm between", value1, value2, "mainPartZjhm");
            return (Criteria) this;
        }

        public Criteria andMainPartZjhmNotBetween(String value1, String value2) {
            addCriterion("main_part_zjhm not between", value1, value2, "mainPartZjhm");
            return (Criteria) this;
        }

        public Criteria andMainPartZjzsIsNull() {
            addCriterion("main_part_zjzs is null");
            return (Criteria) this;
        }

        public Criteria andMainPartZjzsIsNotNull() {
            addCriterion("main_part_zjzs is not null");
            return (Criteria) this;
        }

        public Criteria andMainPartZjzsEqualTo(String value) {
            addCriterion("main_part_zjzs =", value, "mainPartZjzs");
            return (Criteria) this;
        }

        public Criteria andMainPartZjzsNotEqualTo(String value) {
            addCriterion("main_part_zjzs <>", value, "mainPartZjzs");
            return (Criteria) this;
        }

        public Criteria andMainPartZjzsGreaterThan(String value) {
            addCriterion("main_part_zjzs >", value, "mainPartZjzs");
            return (Criteria) this;
        }

        public Criteria andMainPartZjzsGreaterThanOrEqualTo(String value) {
            addCriterion("main_part_zjzs >=", value, "mainPartZjzs");
            return (Criteria) this;
        }

        public Criteria andMainPartZjzsLessThan(String value) {
            addCriterion("main_part_zjzs <", value, "mainPartZjzs");
            return (Criteria) this;
        }

        public Criteria andMainPartZjzsLessThanOrEqualTo(String value) {
            addCriterion("main_part_zjzs <=", value, "mainPartZjzs");
            return (Criteria) this;
        }

        public Criteria andMainPartZjzsLike(String value) {
            addCriterion("main_part_zjzs like", value, "mainPartZjzs");
            return (Criteria) this;
        }

        public Criteria andMainPartZjzsNotLike(String value) {
            addCriterion("main_part_zjzs not like", value, "mainPartZjzs");
            return (Criteria) this;
        }

        public Criteria andMainPartZjzsIn(List<String> values) {
            addCriterion("main_part_zjzs in", values, "mainPartZjzs");
            return (Criteria) this;
        }

        public Criteria andMainPartZjzsNotIn(List<String> values) {
            addCriterion("main_part_zjzs not in", values, "mainPartZjzs");
            return (Criteria) this;
        }

        public Criteria andMainPartZjzsBetween(String value1, String value2) {
            addCriterion("main_part_zjzs between", value1, value2, "mainPartZjzs");
            return (Criteria) this;
        }

        public Criteria andMainPartZjzsNotBetween(String value1, String value2) {
            addCriterion("main_part_zjzs not between", value1, value2, "mainPartZjzs");
            return (Criteria) this;
        }

        public Criteria andMainPartShengidIsNull() {
            addCriterion("main_part_shengid is null");
            return (Criteria) this;
        }

        public Criteria andMainPartShengidIsNotNull() {
            addCriterion("main_part_shengid is not null");
            return (Criteria) this;
        }

        public Criteria andMainPartShengidEqualTo(Long value) {
            addCriterion("main_part_shengid =", value, "mainPartShengid");
            return (Criteria) this;
        }

        public Criteria andMainPartShengidNotEqualTo(Long value) {
            addCriterion("main_part_shengid <>", value, "mainPartShengid");
            return (Criteria) this;
        }

        public Criteria andMainPartShengidGreaterThan(Long value) {
            addCriterion("main_part_shengid >", value, "mainPartShengid");
            return (Criteria) this;
        }

        public Criteria andMainPartShengidGreaterThanOrEqualTo(Long value) {
            addCriterion("main_part_shengid >=", value, "mainPartShengid");
            return (Criteria) this;
        }

        public Criteria andMainPartShengidLessThan(Long value) {
            addCriterion("main_part_shengid <", value, "mainPartShengid");
            return (Criteria) this;
        }

        public Criteria andMainPartShengidLessThanOrEqualTo(Long value) {
            addCriterion("main_part_shengid <=", value, "mainPartShengid");
            return (Criteria) this;
        }

        public Criteria andMainPartShengidIn(List<Long> values) {
            addCriterion("main_part_shengid in", values, "mainPartShengid");
            return (Criteria) this;
        }

        public Criteria andMainPartShengidNotIn(List<Long> values) {
            addCriterion("main_part_shengid not in", values, "mainPartShengid");
            return (Criteria) this;
        }

        public Criteria andMainPartShengidBetween(Long value1, Long value2) {
            addCriterion("main_part_shengid between", value1, value2, "mainPartShengid");
            return (Criteria) this;
        }

        public Criteria andMainPartShengidNotBetween(Long value1, Long value2) {
            addCriterion("main_part_shengid not between", value1, value2, "mainPartShengid");
            return (Criteria) this;
        }

        public Criteria andMainPartShiidIsNull() {
            addCriterion("main_part_shiid is null");
            return (Criteria) this;
        }

        public Criteria andMainPartShiidIsNotNull() {
            addCriterion("main_part_shiid is not null");
            return (Criteria) this;
        }

        public Criteria andMainPartShiidEqualTo(Long value) {
            addCriterion("main_part_shiid =", value, "mainPartShiid");
            return (Criteria) this;
        }

        public Criteria andMainPartShiidNotEqualTo(Long value) {
            addCriterion("main_part_shiid <>", value, "mainPartShiid");
            return (Criteria) this;
        }

        public Criteria andMainPartShiidGreaterThan(Long value) {
            addCriterion("main_part_shiid >", value, "mainPartShiid");
            return (Criteria) this;
        }

        public Criteria andMainPartShiidGreaterThanOrEqualTo(Long value) {
            addCriterion("main_part_shiid >=", value, "mainPartShiid");
            return (Criteria) this;
        }

        public Criteria andMainPartShiidLessThan(Long value) {
            addCriterion("main_part_shiid <", value, "mainPartShiid");
            return (Criteria) this;
        }

        public Criteria andMainPartShiidLessThanOrEqualTo(Long value) {
            addCriterion("main_part_shiid <=", value, "mainPartShiid");
            return (Criteria) this;
        }

        public Criteria andMainPartShiidIn(List<Long> values) {
            addCriterion("main_part_shiid in", values, "mainPartShiid");
            return (Criteria) this;
        }

        public Criteria andMainPartShiidNotIn(List<Long> values) {
            addCriterion("main_part_shiid not in", values, "mainPartShiid");
            return (Criteria) this;
        }

        public Criteria andMainPartShiidBetween(Long value1, Long value2) {
            addCriterion("main_part_shiid between", value1, value2, "mainPartShiid");
            return (Criteria) this;
        }

        public Criteria andMainPartShiidNotBetween(Long value1, Long value2) {
            addCriterion("main_part_shiid not between", value1, value2, "mainPartShiid");
            return (Criteria) this;
        }

        public Criteria andMainPartXianidIsNull() {
            addCriterion("main_part_xianid is null");
            return (Criteria) this;
        }

        public Criteria andMainPartXianidIsNotNull() {
            addCriterion("main_part_xianid is not null");
            return (Criteria) this;
        }

        public Criteria andMainPartXianidEqualTo(Long value) {
            addCriterion("main_part_xianid =", value, "mainPartXianid");
            return (Criteria) this;
        }

        public Criteria andMainPartXianidNotEqualTo(Long value) {
            addCriterion("main_part_xianid <>", value, "mainPartXianid");
            return (Criteria) this;
        }

        public Criteria andMainPartXianidGreaterThan(Long value) {
            addCriterion("main_part_xianid >", value, "mainPartXianid");
            return (Criteria) this;
        }

        public Criteria andMainPartXianidGreaterThanOrEqualTo(Long value) {
            addCriterion("main_part_xianid >=", value, "mainPartXianid");
            return (Criteria) this;
        }

        public Criteria andMainPartXianidLessThan(Long value) {
            addCriterion("main_part_xianid <", value, "mainPartXianid");
            return (Criteria) this;
        }

        public Criteria andMainPartXianidLessThanOrEqualTo(Long value) {
            addCriterion("main_part_xianid <=", value, "mainPartXianid");
            return (Criteria) this;
        }

        public Criteria andMainPartXianidIn(List<Long> values) {
            addCriterion("main_part_xianid in", values, "mainPartXianid");
            return (Criteria) this;
        }

        public Criteria andMainPartXianidNotIn(List<Long> values) {
            addCriterion("main_part_xianid not in", values, "mainPartXianid");
            return (Criteria) this;
        }

        public Criteria andMainPartXianidBetween(Long value1, Long value2) {
            addCriterion("main_part_xianid between", value1, value2, "mainPartXianid");
            return (Criteria) this;
        }

        public Criteria andMainPartXianidNotBetween(Long value1, Long value2) {
            addCriterion("main_part_xianid not between", value1, value2, "mainPartXianid");
            return (Criteria) this;
        }

        public Criteria andMainPartShengshixianIsNull() {
            addCriterion("main_part_shengshixian is null");
            return (Criteria) this;
        }

        public Criteria andMainPartShengshixianIsNotNull() {
            addCriterion("main_part_shengshixian is not null");
            return (Criteria) this;
        }

        public Criteria andMainPartShengshixianEqualTo(String value) {
            addCriterion("main_part_shengshixian =", value, "mainPartShengshixian");
            return (Criteria) this;
        }

        public Criteria andMainPartShengshixianNotEqualTo(String value) {
            addCriterion("main_part_shengshixian <>", value, "mainPartShengshixian");
            return (Criteria) this;
        }

        public Criteria andMainPartShengshixianGreaterThan(String value) {
            addCriterion("main_part_shengshixian >", value, "mainPartShengshixian");
            return (Criteria) this;
        }

        public Criteria andMainPartShengshixianGreaterThanOrEqualTo(String value) {
            addCriterion("main_part_shengshixian >=", value, "mainPartShengshixian");
            return (Criteria) this;
        }

        public Criteria andMainPartShengshixianLessThan(String value) {
            addCriterion("main_part_shengshixian <", value, "mainPartShengshixian");
            return (Criteria) this;
        }

        public Criteria andMainPartShengshixianLessThanOrEqualTo(String value) {
            addCriterion("main_part_shengshixian <=", value, "mainPartShengshixian");
            return (Criteria) this;
        }

        public Criteria andMainPartShengshixianLike(String value) {
            addCriterion("main_part_shengshixian like", value, "mainPartShengshixian");
            return (Criteria) this;
        }

        public Criteria andMainPartShengshixianNotLike(String value) {
            addCriterion("main_part_shengshixian not like", value, "mainPartShengshixian");
            return (Criteria) this;
        }

        public Criteria andMainPartShengshixianIn(List<String> values) {
            addCriterion("main_part_shengshixian in", values, "mainPartShengshixian");
            return (Criteria) this;
        }

        public Criteria andMainPartShengshixianNotIn(List<String> values) {
            addCriterion("main_part_shengshixian not in", values, "mainPartShengshixian");
            return (Criteria) this;
        }

        public Criteria andMainPartShengshixianBetween(String value1, String value2) {
            addCriterion("main_part_shengshixian between", value1, value2, "mainPartShengshixian");
            return (Criteria) this;
        }

        public Criteria andMainPartShengshixianNotBetween(String value1, String value2) {
            addCriterion("main_part_shengshixian not between", value1, value2, "mainPartShengshixian");
            return (Criteria) this;
        }

        public Criteria andMainPartXxdzIsNull() {
            addCriterion("main_part_xxdz is null");
            return (Criteria) this;
        }

        public Criteria andMainPartXxdzIsNotNull() {
            addCriterion("main_part_xxdz is not null");
            return (Criteria) this;
        }

        public Criteria andMainPartXxdzEqualTo(String value) {
            addCriterion("main_part_xxdz =", value, "mainPartXxdz");
            return (Criteria) this;
        }

        public Criteria andMainPartXxdzNotEqualTo(String value) {
            addCriterion("main_part_xxdz <>", value, "mainPartXxdz");
            return (Criteria) this;
        }

        public Criteria andMainPartXxdzGreaterThan(String value) {
            addCriterion("main_part_xxdz >", value, "mainPartXxdz");
            return (Criteria) this;
        }

        public Criteria andMainPartXxdzGreaterThanOrEqualTo(String value) {
            addCriterion("main_part_xxdz >=", value, "mainPartXxdz");
            return (Criteria) this;
        }

        public Criteria andMainPartXxdzLessThan(String value) {
            addCriterion("main_part_xxdz <", value, "mainPartXxdz");
            return (Criteria) this;
        }

        public Criteria andMainPartXxdzLessThanOrEqualTo(String value) {
            addCriterion("main_part_xxdz <=", value, "mainPartXxdz");
            return (Criteria) this;
        }

        public Criteria andMainPartXxdzLike(String value) {
            addCriterion("main_part_xxdz like", value, "mainPartXxdz");
            return (Criteria) this;
        }

        public Criteria andMainPartXxdzNotLike(String value) {
            addCriterion("main_part_xxdz not like", value, "mainPartXxdz");
            return (Criteria) this;
        }

        public Criteria andMainPartXxdzIn(List<String> values) {
            addCriterion("main_part_xxdz in", values, "mainPartXxdz");
            return (Criteria) this;
        }

        public Criteria andMainPartXxdzNotIn(List<String> values) {
            addCriterion("main_part_xxdz not in", values, "mainPartXxdz");
            return (Criteria) this;
        }

        public Criteria andMainPartXxdzBetween(String value1, String value2) {
            addCriterion("main_part_xxdz between", value1, value2, "mainPartXxdz");
            return (Criteria) this;
        }

        public Criteria andMainPartXxdzNotBetween(String value1, String value2) {
            addCriterion("main_part_xxdz not between", value1, value2, "mainPartXxdz");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrXmIsNull() {
            addCriterion("main_part_fzr_xm is null");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrXmIsNotNull() {
            addCriterion("main_part_fzr_xm is not null");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrXmEqualTo(String value) {
            addCriterion("main_part_fzr_xm =", value, "mainPartFzrXm");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrXmNotEqualTo(String value) {
            addCriterion("main_part_fzr_xm <>", value, "mainPartFzrXm");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrXmGreaterThan(String value) {
            addCriterion("main_part_fzr_xm >", value, "mainPartFzrXm");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrXmGreaterThanOrEqualTo(String value) {
            addCriterion("main_part_fzr_xm >=", value, "mainPartFzrXm");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrXmLessThan(String value) {
            addCriterion("main_part_fzr_xm <", value, "mainPartFzrXm");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrXmLessThanOrEqualTo(String value) {
            addCriterion("main_part_fzr_xm <=", value, "mainPartFzrXm");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrXmLike(String value) {
            addCriterion("main_part_fzr_xm like", value, "mainPartFzrXm");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrXmNotLike(String value) {
            addCriterion("main_part_fzr_xm not like", value, "mainPartFzrXm");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrXmIn(List<String> values) {
            addCriterion("main_part_fzr_xm in", values, "mainPartFzrXm");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrXmNotIn(List<String> values) {
            addCriterion("main_part_fzr_xm not in", values, "mainPartFzrXm");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrXmBetween(String value1, String value2) {
            addCriterion("main_part_fzr_xm between", value1, value2, "mainPartFzrXm");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrXmNotBetween(String value1, String value2) {
            addCriterion("main_part_fzr_xm not between", value1, value2, "mainPartFzrXm");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrZjlxIsNull() {
            addCriterion("main_part_fzr_zjlx is null");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrZjlxIsNotNull() {
            addCriterion("main_part_fzr_zjlx is not null");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrZjlxEqualTo(Long value) {
            addCriterion("main_part_fzr_zjlx =", value, "mainPartFzrZjlx");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrZjlxNotEqualTo(Long value) {
            addCriterion("main_part_fzr_zjlx <>", value, "mainPartFzrZjlx");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrZjlxGreaterThan(Long value) {
            addCriterion("main_part_fzr_zjlx >", value, "mainPartFzrZjlx");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrZjlxGreaterThanOrEqualTo(Long value) {
            addCriterion("main_part_fzr_zjlx >=", value, "mainPartFzrZjlx");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrZjlxLessThan(Long value) {
            addCriterion("main_part_fzr_zjlx <", value, "mainPartFzrZjlx");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrZjlxLessThanOrEqualTo(Long value) {
            addCriterion("main_part_fzr_zjlx <=", value, "mainPartFzrZjlx");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrZjlxIn(List<Long> values) {
            addCriterion("main_part_fzr_zjlx in", values, "mainPartFzrZjlx");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrZjlxNotIn(List<Long> values) {
            addCriterion("main_part_fzr_zjlx not in", values, "mainPartFzrZjlx");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrZjlxBetween(Long value1, Long value2) {
            addCriterion("main_part_fzr_zjlx between", value1, value2, "mainPartFzrZjlx");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrZjlxNotBetween(Long value1, Long value2) {
            addCriterion("main_part_fzr_zjlx not between", value1, value2, "mainPartFzrZjlx");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrZjhmIsNull() {
            addCriterion("main_part_fzr_zjhm is null");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrZjhmIsNotNull() {
            addCriterion("main_part_fzr_zjhm is not null");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrZjhmEqualTo(String value) {
            addCriterion("main_part_fzr_zjhm =", value, "mainPartFzrZjhm");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrZjhmNotEqualTo(String value) {
            addCriterion("main_part_fzr_zjhm <>", value, "mainPartFzrZjhm");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrZjhmGreaterThan(String value) {
            addCriterion("main_part_fzr_zjhm >", value, "mainPartFzrZjhm");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrZjhmGreaterThanOrEqualTo(String value) {
            addCriterion("main_part_fzr_zjhm >=", value, "mainPartFzrZjhm");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrZjhmLessThan(String value) {
            addCriterion("main_part_fzr_zjhm <", value, "mainPartFzrZjhm");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrZjhmLessThanOrEqualTo(String value) {
            addCriterion("main_part_fzr_zjhm <=", value, "mainPartFzrZjhm");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrZjhmLike(String value) {
            addCriterion("main_part_fzr_zjhm like", value, "mainPartFzrZjhm");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrZjhmNotLike(String value) {
            addCriterion("main_part_fzr_zjhm not like", value, "mainPartFzrZjhm");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrZjhmIn(List<String> values) {
            addCriterion("main_part_fzr_zjhm in", values, "mainPartFzrZjhm");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrZjhmNotIn(List<String> values) {
            addCriterion("main_part_fzr_zjhm not in", values, "mainPartFzrZjhm");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrZjhmBetween(String value1, String value2) {
            addCriterion("main_part_fzr_zjhm between", value1, value2, "mainPartFzrZjhm");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrZjhmNotBetween(String value1, String value2) {
            addCriterion("main_part_fzr_zjhm not between", value1, value2, "mainPartFzrZjhm");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrDzyjIsNull() {
            addCriterion("main_part_fzr_dzyj is null");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrDzyjIsNotNull() {
            addCriterion("main_part_fzr_dzyj is not null");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrDzyjEqualTo(String value) {
            addCriterion("main_part_fzr_dzyj =", value, "mainPartFzrDzyj");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrDzyjNotEqualTo(String value) {
            addCriterion("main_part_fzr_dzyj <>", value, "mainPartFzrDzyj");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrDzyjGreaterThan(String value) {
            addCriterion("main_part_fzr_dzyj >", value, "mainPartFzrDzyj");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrDzyjGreaterThanOrEqualTo(String value) {
            addCriterion("main_part_fzr_dzyj >=", value, "mainPartFzrDzyj");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrDzyjLessThan(String value) {
            addCriterion("main_part_fzr_dzyj <", value, "mainPartFzrDzyj");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrDzyjLessThanOrEqualTo(String value) {
            addCriterion("main_part_fzr_dzyj <=", value, "mainPartFzrDzyj");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrDzyjLike(String value) {
            addCriterion("main_part_fzr_dzyj like", value, "mainPartFzrDzyj");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrDzyjNotLike(String value) {
            addCriterion("main_part_fzr_dzyj not like", value, "mainPartFzrDzyj");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrDzyjIn(List<String> values) {
            addCriterion("main_part_fzr_dzyj in", values, "mainPartFzrDzyj");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrDzyjNotIn(List<String> values) {
            addCriterion("main_part_fzr_dzyj not in", values, "mainPartFzrDzyj");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrDzyjBetween(String value1, String value2) {
            addCriterion("main_part_fzr_dzyj between", value1, value2, "mainPartFzrDzyj");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrDzyjNotBetween(String value1, String value2) {
            addCriterion("main_part_fzr_dzyj not between", value1, value2, "mainPartFzrDzyj");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrLxfs1IsNull() {
            addCriterion("main_part_fzr_lxfs1 is null");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrLxfs1IsNotNull() {
            addCriterion("main_part_fzr_lxfs1 is not null");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrLxfs1EqualTo(String value) {
            addCriterion("main_part_fzr_lxfs1 =", value, "mainPartFzrLxfs1");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrLxfs1NotEqualTo(String value) {
            addCriterion("main_part_fzr_lxfs1 <>", value, "mainPartFzrLxfs1");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrLxfs1GreaterThan(String value) {
            addCriterion("main_part_fzr_lxfs1 >", value, "mainPartFzrLxfs1");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrLxfs1GreaterThanOrEqualTo(String value) {
            addCriterion("main_part_fzr_lxfs1 >=", value, "mainPartFzrLxfs1");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrLxfs1LessThan(String value) {
            addCriterion("main_part_fzr_lxfs1 <", value, "mainPartFzrLxfs1");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrLxfs1LessThanOrEqualTo(String value) {
            addCriterion("main_part_fzr_lxfs1 <=", value, "mainPartFzrLxfs1");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrLxfs1Like(String value) {
            addCriterion("main_part_fzr_lxfs1 like", value, "mainPartFzrLxfs1");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrLxfs1NotLike(String value) {
            addCriterion("main_part_fzr_lxfs1 not like", value, "mainPartFzrLxfs1");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrLxfs1In(List<String> values) {
            addCriterion("main_part_fzr_lxfs1 in", values, "mainPartFzrLxfs1");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrLxfs1NotIn(List<String> values) {
            addCriterion("main_part_fzr_lxfs1 not in", values, "mainPartFzrLxfs1");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrLxfs1Between(String value1, String value2) {
            addCriterion("main_part_fzr_lxfs1 between", value1, value2, "mainPartFzrLxfs1");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrLxfs1NotBetween(String value1, String value2) {
            addCriterion("main_part_fzr_lxfs1 not between", value1, value2, "mainPartFzrLxfs1");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrLxfs2IsNull() {
            addCriterion("main_part_fzr_lxfs2 is null");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrLxfs2IsNotNull() {
            addCriterion("main_part_fzr_lxfs2 is not null");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrLxfs2EqualTo(String value) {
            addCriterion("main_part_fzr_lxfs2 =", value, "mainPartFzrLxfs2");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrLxfs2NotEqualTo(String value) {
            addCriterion("main_part_fzr_lxfs2 <>", value, "mainPartFzrLxfs2");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrLxfs2GreaterThan(String value) {
            addCriterion("main_part_fzr_lxfs2 >", value, "mainPartFzrLxfs2");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrLxfs2GreaterThanOrEqualTo(String value) {
            addCriterion("main_part_fzr_lxfs2 >=", value, "mainPartFzrLxfs2");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrLxfs2LessThan(String value) {
            addCriterion("main_part_fzr_lxfs2 <", value, "mainPartFzrLxfs2");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrLxfs2LessThanOrEqualTo(String value) {
            addCriterion("main_part_fzr_lxfs2 <=", value, "mainPartFzrLxfs2");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrLxfs2Like(String value) {
            addCriterion("main_part_fzr_lxfs2 like", value, "mainPartFzrLxfs2");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrLxfs2NotLike(String value) {
            addCriterion("main_part_fzr_lxfs2 not like", value, "mainPartFzrLxfs2");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrLxfs2In(List<String> values) {
            addCriterion("main_part_fzr_lxfs2 in", values, "mainPartFzrLxfs2");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrLxfs2NotIn(List<String> values) {
            addCriterion("main_part_fzr_lxfs2 not in", values, "mainPartFzrLxfs2");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrLxfs2Between(String value1, String value2) {
            addCriterion("main_part_fzr_lxfs2 between", value1, value2, "mainPartFzrLxfs2");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrLxfs2NotBetween(String value1, String value2) {
            addCriterion("main_part_fzr_lxfs2 not between", value1, value2, "mainPartFzrLxfs2");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrYjdhIsNull() {
            addCriterion("main_part_fzr_yjdh is null");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrYjdhIsNotNull() {
            addCriterion("main_part_fzr_yjdh is not null");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrYjdhEqualTo(String value) {
            addCriterion("main_part_fzr_yjdh =", value, "mainPartFzrYjdh");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrYjdhNotEqualTo(String value) {
            addCriterion("main_part_fzr_yjdh <>", value, "mainPartFzrYjdh");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrYjdhGreaterThan(String value) {
            addCriterion("main_part_fzr_yjdh >", value, "mainPartFzrYjdh");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrYjdhGreaterThanOrEqualTo(String value) {
            addCriterion("main_part_fzr_yjdh >=", value, "mainPartFzrYjdh");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrYjdhLessThan(String value) {
            addCriterion("main_part_fzr_yjdh <", value, "mainPartFzrYjdh");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrYjdhLessThanOrEqualTo(String value) {
            addCriterion("main_part_fzr_yjdh <=", value, "mainPartFzrYjdh");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrYjdhLike(String value) {
            addCriterion("main_part_fzr_yjdh like", value, "mainPartFzrYjdh");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrYjdhNotLike(String value) {
            addCriterion("main_part_fzr_yjdh not like", value, "mainPartFzrYjdh");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrYjdhIn(List<String> values) {
            addCriterion("main_part_fzr_yjdh in", values, "mainPartFzrYjdh");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrYjdhNotIn(List<String> values) {
            addCriterion("main_part_fzr_yjdh not in", values, "mainPartFzrYjdh");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrYjdhBetween(String value1, String value2) {
            addCriterion("main_part_fzr_yjdh between", value1, value2, "mainPartFzrYjdh");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrYjdhNotBetween(String value1, String value2) {
            addCriterion("main_part_fzr_yjdh not between", value1, value2, "mainPartFzrYjdh");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrJstxLxIsNull() {
            addCriterion("main_part_fzr_jstx_lx is null");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrJstxLxIsNotNull() {
            addCriterion("main_part_fzr_jstx_lx is not null");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrJstxLxEqualTo(Long value) {
            addCriterion("main_part_fzr_jstx_lx =", value, "mainPartFzrJstxLx");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrJstxLxNotEqualTo(Long value) {
            addCriterion("main_part_fzr_jstx_lx <>", value, "mainPartFzrJstxLx");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrJstxLxGreaterThan(Long value) {
            addCriterion("main_part_fzr_jstx_lx >", value, "mainPartFzrJstxLx");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrJstxLxGreaterThanOrEqualTo(Long value) {
            addCriterion("main_part_fzr_jstx_lx >=", value, "mainPartFzrJstxLx");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrJstxLxLessThan(Long value) {
            addCriterion("main_part_fzr_jstx_lx <", value, "mainPartFzrJstxLx");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrJstxLxLessThanOrEqualTo(Long value) {
            addCriterion("main_part_fzr_jstx_lx <=", value, "mainPartFzrJstxLx");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrJstxLxIn(List<Long> values) {
            addCriterion("main_part_fzr_jstx_lx in", values, "mainPartFzrJstxLx");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrJstxLxNotIn(List<Long> values) {
            addCriterion("main_part_fzr_jstx_lx not in", values, "mainPartFzrJstxLx");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrJstxLxBetween(Long value1, Long value2) {
            addCriterion("main_part_fzr_jstx_lx between", value1, value2, "mainPartFzrJstxLx");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrJstxLxNotBetween(Long value1, Long value2) {
            addCriterion("main_part_fzr_jstx_lx not between", value1, value2, "mainPartFzrJstxLx");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrJstxZhIsNull() {
            addCriterion("main_part_fzr_jstx_zh is null");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrJstxZhIsNotNull() {
            addCriterion("main_part_fzr_jstx_zh is not null");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrJstxZhEqualTo(String value) {
            addCriterion("main_part_fzr_jstx_zh =", value, "mainPartFzrJstxZh");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrJstxZhNotEqualTo(String value) {
            addCriterion("main_part_fzr_jstx_zh <>", value, "mainPartFzrJstxZh");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrJstxZhGreaterThan(String value) {
            addCriterion("main_part_fzr_jstx_zh >", value, "mainPartFzrJstxZh");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrJstxZhGreaterThanOrEqualTo(String value) {
            addCriterion("main_part_fzr_jstx_zh >=", value, "mainPartFzrJstxZh");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrJstxZhLessThan(String value) {
            addCriterion("main_part_fzr_jstx_zh <", value, "mainPartFzrJstxZh");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrJstxZhLessThanOrEqualTo(String value) {
            addCriterion("main_part_fzr_jstx_zh <=", value, "mainPartFzrJstxZh");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrJstxZhLike(String value) {
            addCriterion("main_part_fzr_jstx_zh like", value, "mainPartFzrJstxZh");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrJstxZhNotLike(String value) {
            addCriterion("main_part_fzr_jstx_zh not like", value, "mainPartFzrJstxZh");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrJstxZhIn(List<String> values) {
            addCriterion("main_part_fzr_jstx_zh in", values, "mainPartFzrJstxZh");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrJstxZhNotIn(List<String> values) {
            addCriterion("main_part_fzr_jstx_zh not in", values, "mainPartFzrJstxZh");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrJstxZhBetween(String value1, String value2) {
            addCriterion("main_part_fzr_jstx_zh between", value1, value2, "mainPartFzrJstxZh");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrJstxZhNotBetween(String value1, String value2) {
            addCriterion("main_part_fzr_jstx_zh not between", value1, value2, "mainPartFzrJstxZh");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrZjyxqIsNull() {
            addCriterion("main_part_fzr_zjyxq is null");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrZjyxqIsNotNull() {
            addCriterion("main_part_fzr_zjyxq is not null");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrZjyxqEqualTo(String value) {
            addCriterion("main_part_fzr_zjyxq =", value, "mainPartFzrZjyxq");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrZjyxqNotEqualTo(String value) {
            addCriterion("main_part_fzr_zjyxq <>", value, "mainPartFzrZjyxq");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrZjyxqGreaterThan(String value) {
            addCriterion("main_part_fzr_zjyxq >", value, "mainPartFzrZjyxq");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrZjyxqGreaterThanOrEqualTo(String value) {
            addCriterion("main_part_fzr_zjyxq >=", value, "mainPartFzrZjyxq");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrZjyxqLessThan(String value) {
            addCriterion("main_part_fzr_zjyxq <", value, "mainPartFzrZjyxq");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrZjyxqLessThanOrEqualTo(String value) {
            addCriterion("main_part_fzr_zjyxq <=", value, "mainPartFzrZjyxq");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrZjyxqLike(String value) {
            addCriterion("main_part_fzr_zjyxq like", value, "mainPartFzrZjyxq");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrZjyxqNotLike(String value) {
            addCriterion("main_part_fzr_zjyxq not like", value, "mainPartFzrZjyxq");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrZjyxqIn(List<String> values) {
            addCriterion("main_part_fzr_zjyxq in", values, "mainPartFzrZjyxq");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrZjyxqNotIn(List<String> values) {
            addCriterion("main_part_fzr_zjyxq not in", values, "mainPartFzrZjyxq");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrZjyxqBetween(String value1, String value2) {
            addCriterion("main_part_fzr_zjyxq between", value1, value2, "mainPartFzrZjyxq");
            return (Criteria) this;
        }

        public Criteria andMainPartFzrZjyxqNotBetween(String value1, String value2) {
            addCriterion("main_part_fzr_zjyxq not between", value1, value2, "mainPartFzrZjyxq");
            return (Criteria) this;
        }

        public Criteria andMainPartBbfsIsNull() {
            addCriterion("main_part_bbfs is null");
            return (Criteria) this;
        }

        public Criteria andMainPartBbfsIsNotNull() {
            addCriterion("main_part_bbfs is not null");
            return (Criteria) this;
        }

        public Criteria andMainPartBbfsEqualTo(Long value) {
            addCriterion("main_part_bbfs =", value, "mainPartBbfs");
            return (Criteria) this;
        }

        public Criteria andMainPartBbfsNotEqualTo(Long value) {
            addCriterion("main_part_bbfs <>", value, "mainPartBbfs");
            return (Criteria) this;
        }

        public Criteria andMainPartBbfsGreaterThan(Long value) {
            addCriterion("main_part_bbfs >", value, "mainPartBbfs");
            return (Criteria) this;
        }

        public Criteria andMainPartBbfsGreaterThanOrEqualTo(Long value) {
            addCriterion("main_part_bbfs >=", value, "mainPartBbfs");
            return (Criteria) this;
        }

        public Criteria andMainPartBbfsLessThan(Long value) {
            addCriterion("main_part_bbfs <", value, "mainPartBbfs");
            return (Criteria) this;
        }

        public Criteria andMainPartBbfsLessThanOrEqualTo(Long value) {
            addCriterion("main_part_bbfs <=", value, "mainPartBbfs");
            return (Criteria) this;
        }

        public Criteria andMainPartBbfsIn(List<Long> values) {
            addCriterion("main_part_bbfs in", values, "mainPartBbfs");
            return (Criteria) this;
        }

        public Criteria andMainPartBbfsNotIn(List<Long> values) {
            addCriterion("main_part_bbfs not in", values, "mainPartBbfs");
            return (Criteria) this;
        }

        public Criteria andMainPartBbfsBetween(Long value1, Long value2) {
            addCriterion("main_part_bbfs between", value1, value2, "mainPartBbfs");
            return (Criteria) this;
        }

        public Criteria andMainPartBbfsNotBetween(Long value1, Long value2) {
            addCriterion("main_part_bbfs not between", value1, value2, "mainPartBbfs");
            return (Criteria) this;
        }

        public Criteria andMainPartBzIsNull() {
            addCriterion("main_part_bz is null");
            return (Criteria) this;
        }

        public Criteria andMainPartBzIsNotNull() {
            addCriterion("main_part_bz is not null");
            return (Criteria) this;
        }

        public Criteria andMainPartBzEqualTo(String value) {
            addCriterion("main_part_bz =", value, "mainPartBz");
            return (Criteria) this;
        }

        public Criteria andMainPartBzNotEqualTo(String value) {
            addCriterion("main_part_bz <>", value, "mainPartBz");
            return (Criteria) this;
        }

        public Criteria andMainPartBzGreaterThan(String value) {
            addCriterion("main_part_bz >", value, "mainPartBz");
            return (Criteria) this;
        }

        public Criteria andMainPartBzGreaterThanOrEqualTo(String value) {
            addCriterion("main_part_bz >=", value, "mainPartBz");
            return (Criteria) this;
        }

        public Criteria andMainPartBzLessThan(String value) {
            addCriterion("main_part_bz <", value, "mainPartBz");
            return (Criteria) this;
        }

        public Criteria andMainPartBzLessThanOrEqualTo(String value) {
            addCriterion("main_part_bz <=", value, "mainPartBz");
            return (Criteria) this;
        }

        public Criteria andMainPartBzLike(String value) {
            addCriterion("main_part_bz like", value, "mainPartBz");
            return (Criteria) this;
        }

        public Criteria andMainPartBzNotLike(String value) {
            addCriterion("main_part_bz not like", value, "mainPartBz");
            return (Criteria) this;
        }

        public Criteria andMainPartBzIn(List<String> values) {
            addCriterion("main_part_bz in", values, "mainPartBz");
            return (Criteria) this;
        }

        public Criteria andMainPartBzNotIn(List<String> values) {
            addCriterion("main_part_bz not in", values, "mainPartBz");
            return (Criteria) this;
        }

        public Criteria andMainPartBzBetween(String value1, String value2) {
            addCriterion("main_part_bz between", value1, value2, "mainPartBz");
            return (Criteria) this;
        }

        public Criteria andMainPartBzNotBetween(String value1, String value2) {
            addCriterion("main_part_bz not between", value1, value2, "mainPartBz");
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

        public Criteria andServiceNrlxIdIsNull() {
            addCriterion("service_nrlx_id is null");
            return (Criteria) this;
        }

        public Criteria andServiceNrlxIdIsNotNull() {
            addCriterion("service_nrlx_id is not null");
            return (Criteria) this;
        }

        public Criteria andServiceNrlxIdEqualTo(Long value) {
            addCriterion("service_nrlx_id =", value, "serviceNrlxId");
            return (Criteria) this;
        }

        public Criteria andServiceNrlxIdNotEqualTo(Long value) {
            addCriterion("service_nrlx_id <>", value, "serviceNrlxId");
            return (Criteria) this;
        }

        public Criteria andServiceNrlxIdGreaterThan(Long value) {
            addCriterion("service_nrlx_id >", value, "serviceNrlxId");
            return (Criteria) this;
        }

        public Criteria andServiceNrlxIdGreaterThanOrEqualTo(Long value) {
            addCriterion("service_nrlx_id >=", value, "serviceNrlxId");
            return (Criteria) this;
        }

        public Criteria andServiceNrlxIdLessThan(Long value) {
            addCriterion("service_nrlx_id <", value, "serviceNrlxId");
            return (Criteria) this;
        }

        public Criteria andServiceNrlxIdLessThanOrEqualTo(Long value) {
            addCriterion("service_nrlx_id <=", value, "serviceNrlxId");
            return (Criteria) this;
        }

        public Criteria andServiceNrlxIdIn(List<Long> values) {
            addCriterion("service_nrlx_id in", values, "serviceNrlxId");
            return (Criteria) this;
        }

        public Criteria andServiceNrlxIdNotIn(List<Long> values) {
            addCriterion("service_nrlx_id not in", values, "serviceNrlxId");
            return (Criteria) this;
        }

        public Criteria andServiceNrlxIdBetween(Long value1, Long value2) {
            addCriterion("service_nrlx_id between", value1, value2, "serviceNrlxId");
            return (Criteria) this;
        }

        public Criteria andServiceNrlxIdNotBetween(Long value1, Long value2) {
            addCriterion("service_nrlx_id not between", value1, value2, "serviceNrlxId");
            return (Criteria) this;
        }

        public Criteria andServiceNrlxQzsphIsNull() {
            addCriterion("service_nrlx_qzsph is null");
            return (Criteria) this;
        }

        public Criteria andServiceNrlxQzsphIsNotNull() {
            addCriterion("service_nrlx_qzsph is not null");
            return (Criteria) this;
        }

        public Criteria andServiceNrlxQzsphEqualTo(String value) {
            addCriterion("service_nrlx_qzsph =", value, "serviceNrlxQzsph");
            return (Criteria) this;
        }

        public Criteria andServiceNrlxQzsphNotEqualTo(String value) {
            addCriterion("service_nrlx_qzsph <>", value, "serviceNrlxQzsph");
            return (Criteria) this;
        }

        public Criteria andServiceNrlxQzsphGreaterThan(String value) {
            addCriterion("service_nrlx_qzsph >", value, "serviceNrlxQzsph");
            return (Criteria) this;
        }

        public Criteria andServiceNrlxQzsphGreaterThanOrEqualTo(String value) {
            addCriterion("service_nrlx_qzsph >=", value, "serviceNrlxQzsph");
            return (Criteria) this;
        }

        public Criteria andServiceNrlxQzsphLessThan(String value) {
            addCriterion("service_nrlx_qzsph <", value, "serviceNrlxQzsph");
            return (Criteria) this;
        }

        public Criteria andServiceNrlxQzsphLessThanOrEqualTo(String value) {
            addCriterion("service_nrlx_qzsph <=", value, "serviceNrlxQzsph");
            return (Criteria) this;
        }

        public Criteria andServiceNrlxQzsphLike(String value) {
            addCriterion("service_nrlx_qzsph like", value, "serviceNrlxQzsph");
            return (Criteria) this;
        }

        public Criteria andServiceNrlxQzsphNotLike(String value) {
            addCriterion("service_nrlx_qzsph not like", value, "serviceNrlxQzsph");
            return (Criteria) this;
        }

        public Criteria andServiceNrlxQzsphIn(List<String> values) {
            addCriterion("service_nrlx_qzsph in", values, "serviceNrlxQzsph");
            return (Criteria) this;
        }

        public Criteria andServiceNrlxQzsphNotIn(List<String> values) {
            addCriterion("service_nrlx_qzsph not in", values, "serviceNrlxQzsph");
            return (Criteria) this;
        }

        public Criteria andServiceNrlxQzsphBetween(String value1, String value2) {
            addCriterion("service_nrlx_qzsph between", value1, value2, "serviceNrlxQzsph");
            return (Criteria) this;
        }

        public Criteria andServiceNrlxQzsphNotBetween(String value1, String value2) {
            addCriterion("service_nrlx_qzsph not between", value1, value2, "serviceNrlxQzsph");
            return (Criteria) this;
        }

        public Criteria andServiceNrlxSpwjIsNull() {
            addCriterion("service_nrlx_spwj is null");
            return (Criteria) this;
        }

        public Criteria andServiceNrlxSpwjIsNotNull() {
            addCriterion("service_nrlx_spwj is not null");
            return (Criteria) this;
        }

        public Criteria andServiceNrlxSpwjEqualTo(String value) {
            addCriterion("service_nrlx_spwj =", value, "serviceNrlxSpwj");
            return (Criteria) this;
        }

        public Criteria andServiceNrlxSpwjNotEqualTo(String value) {
            addCriterion("service_nrlx_spwj <>", value, "serviceNrlxSpwj");
            return (Criteria) this;
        }

        public Criteria andServiceNrlxSpwjGreaterThan(String value) {
            addCriterion("service_nrlx_spwj >", value, "serviceNrlxSpwj");
            return (Criteria) this;
        }

        public Criteria andServiceNrlxSpwjGreaterThanOrEqualTo(String value) {
            addCriterion("service_nrlx_spwj >=", value, "serviceNrlxSpwj");
            return (Criteria) this;
        }

        public Criteria andServiceNrlxSpwjLessThan(String value) {
            addCriterion("service_nrlx_spwj <", value, "serviceNrlxSpwj");
            return (Criteria) this;
        }

        public Criteria andServiceNrlxSpwjLessThanOrEqualTo(String value) {
            addCriterion("service_nrlx_spwj <=", value, "serviceNrlxSpwj");
            return (Criteria) this;
        }

        public Criteria andServiceNrlxSpwjLike(String value) {
            addCriterion("service_nrlx_spwj like", value, "serviceNrlxSpwj");
            return (Criteria) this;
        }

        public Criteria andServiceNrlxSpwjNotLike(String value) {
            addCriterion("service_nrlx_spwj not like", value, "serviceNrlxSpwj");
            return (Criteria) this;
        }

        public Criteria andServiceNrlxSpwjIn(List<String> values) {
            addCriterion("service_nrlx_spwj in", values, "serviceNrlxSpwj");
            return (Criteria) this;
        }

        public Criteria andServiceNrlxSpwjNotIn(List<String> values) {
            addCriterion("service_nrlx_spwj not in", values, "serviceNrlxSpwj");
            return (Criteria) this;
        }

        public Criteria andServiceNrlxSpwjBetween(String value1, String value2) {
            addCriterion("service_nrlx_spwj between", value1, value2, "serviceNrlxSpwj");
            return (Criteria) this;
        }

        public Criteria andServiceNrlxSpwjNotBetween(String value1, String value2) {
            addCriterion("service_nrlx_spwj not between", value1, value2, "serviceNrlxSpwj");
            return (Criteria) this;
        }

        public Criteria andServiceFwnrIdIsNull() {
            addCriterion("service_fwnr_id is null");
            return (Criteria) this;
        }

        public Criteria andServiceFwnrIdIsNotNull() {
            addCriterion("service_fwnr_id is not null");
            return (Criteria) this;
        }

        public Criteria andServiceFwnrIdEqualTo(Long value) {
            addCriterion("service_fwnr_id =", value, "serviceFwnrId");
            return (Criteria) this;
        }

        public Criteria andServiceFwnrIdNotEqualTo(Long value) {
            addCriterion("service_fwnr_id <>", value, "serviceFwnrId");
            return (Criteria) this;
        }

        public Criteria andServiceFwnrIdGreaterThan(Long value) {
            addCriterion("service_fwnr_id >", value, "serviceFwnrId");
            return (Criteria) this;
        }

        public Criteria andServiceFwnrIdGreaterThanOrEqualTo(Long value) {
            addCriterion("service_fwnr_id >=", value, "serviceFwnrId");
            return (Criteria) this;
        }

        public Criteria andServiceFwnrIdLessThan(Long value) {
            addCriterion("service_fwnr_id <", value, "serviceFwnrId");
            return (Criteria) this;
        }

        public Criteria andServiceFwnrIdLessThanOrEqualTo(Long value) {
            addCriterion("service_fwnr_id <=", value, "serviceFwnrId");
            return (Criteria) this;
        }

        public Criteria andServiceFwnrIdIn(List<Long> values) {
            addCriterion("service_fwnr_id in", values, "serviceFwnrId");
            return (Criteria) this;
        }

        public Criteria andServiceFwnrIdNotIn(List<Long> values) {
            addCriterion("service_fwnr_id not in", values, "serviceFwnrId");
            return (Criteria) this;
        }

        public Criteria andServiceFwnrIdBetween(Long value1, Long value2) {
            addCriterion("service_fwnr_id between", value1, value2, "serviceFwnrId");
            return (Criteria) this;
        }

        public Criteria andServiceFwnrIdNotBetween(Long value1, Long value2) {
            addCriterion("service_fwnr_id not between", value1, value2, "serviceFwnrId");
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

        public Criteria andServiceYylbIdIsNull() {
            addCriterion("service_yylb_id is null");
            return (Criteria) this;
        }

        public Criteria andServiceYylbIdIsNotNull() {
            addCriterion("service_yylb_id is not null");
            return (Criteria) this;
        }

        public Criteria andServiceYylbIdEqualTo(Long value) {
            addCriterion("service_yylb_id =", value, "serviceYylbId");
            return (Criteria) this;
        }

        public Criteria andServiceYylbIdNotEqualTo(Long value) {
            addCriterion("service_yylb_id <>", value, "serviceYylbId");
            return (Criteria) this;
        }

        public Criteria andServiceYylbIdGreaterThan(Long value) {
            addCriterion("service_yylb_id >", value, "serviceYylbId");
            return (Criteria) this;
        }

        public Criteria andServiceYylbIdGreaterThanOrEqualTo(Long value) {
            addCriterion("service_yylb_id >=", value, "serviceYylbId");
            return (Criteria) this;
        }

        public Criteria andServiceYylbIdLessThan(Long value) {
            addCriterion("service_yylb_id <", value, "serviceYylbId");
            return (Criteria) this;
        }

        public Criteria andServiceYylbIdLessThanOrEqualTo(Long value) {
            addCriterion("service_yylb_id <=", value, "serviceYylbId");
            return (Criteria) this;
        }

        public Criteria andServiceYylbIdIn(List<Long> values) {
            addCriterion("service_yylb_id in", values, "serviceYylbId");
            return (Criteria) this;
        }

        public Criteria andServiceYylbIdNotIn(List<Long> values) {
            addCriterion("service_yylb_id not in", values, "serviceYylbId");
            return (Criteria) this;
        }

        public Criteria andServiceYylbIdBetween(Long value1, Long value2) {
            addCriterion("service_yylb_id between", value1, value2, "serviceYylbId");
            return (Criteria) this;
        }

        public Criteria andServiceYylbIdNotBetween(Long value1, Long value2) {
            addCriterion("service_yylb_id not between", value1, value2, "serviceYylbId");
            return (Criteria) this;
        }

        public Criteria andServiceFzrXmIsNull() {
            addCriterion("service_fzr_xm is null");
            return (Criteria) this;
        }

        public Criteria andServiceFzrXmIsNotNull() {
            addCriterion("service_fzr_xm is not null");
            return (Criteria) this;
        }

        public Criteria andServiceFzrXmEqualTo(String value) {
            addCriterion("service_fzr_xm =", value, "serviceFzrXm");
            return (Criteria) this;
        }

        public Criteria andServiceFzrXmNotEqualTo(String value) {
            addCriterion("service_fzr_xm <>", value, "serviceFzrXm");
            return (Criteria) this;
        }

        public Criteria andServiceFzrXmGreaterThan(String value) {
            addCriterion("service_fzr_xm >", value, "serviceFzrXm");
            return (Criteria) this;
        }

        public Criteria andServiceFzrXmGreaterThanOrEqualTo(String value) {
            addCriterion("service_fzr_xm >=", value, "serviceFzrXm");
            return (Criteria) this;
        }

        public Criteria andServiceFzrXmLessThan(String value) {
            addCriterion("service_fzr_xm <", value, "serviceFzrXm");
            return (Criteria) this;
        }

        public Criteria andServiceFzrXmLessThanOrEqualTo(String value) {
            addCriterion("service_fzr_xm <=", value, "serviceFzrXm");
            return (Criteria) this;
        }

        public Criteria andServiceFzrXmLike(String value) {
            addCriterion("service_fzr_xm like", value, "serviceFzrXm");
            return (Criteria) this;
        }

        public Criteria andServiceFzrXmNotLike(String value) {
            addCriterion("service_fzr_xm not like", value, "serviceFzrXm");
            return (Criteria) this;
        }

        public Criteria andServiceFzrXmIn(List<String> values) {
            addCriterion("service_fzr_xm in", values, "serviceFzrXm");
            return (Criteria) this;
        }

        public Criteria andServiceFzrXmNotIn(List<String> values) {
            addCriterion("service_fzr_xm not in", values, "serviceFzrXm");
            return (Criteria) this;
        }

        public Criteria andServiceFzrXmBetween(String value1, String value2) {
            addCriterion("service_fzr_xm between", value1, value2, "serviceFzrXm");
            return (Criteria) this;
        }

        public Criteria andServiceFzrXmNotBetween(String value1, String value2) {
            addCriterion("service_fzr_xm not between", value1, value2, "serviceFzrXm");
            return (Criteria) this;
        }

        public Criteria andServiceFzrZjlxIsNull() {
            addCriterion("service_fzr_zjlx is null");
            return (Criteria) this;
        }

        public Criteria andServiceFzrZjlxIsNotNull() {
            addCriterion("service_fzr_zjlx is not null");
            return (Criteria) this;
        }

        public Criteria andServiceFzrZjlxEqualTo(Long value) {
            addCriterion("service_fzr_zjlx =", value, "serviceFzrZjlx");
            return (Criteria) this;
        }

        public Criteria andServiceFzrZjlxNotEqualTo(Long value) {
            addCriterion("service_fzr_zjlx <>", value, "serviceFzrZjlx");
            return (Criteria) this;
        }

        public Criteria andServiceFzrZjlxGreaterThan(Long value) {
            addCriterion("service_fzr_zjlx >", value, "serviceFzrZjlx");
            return (Criteria) this;
        }

        public Criteria andServiceFzrZjlxGreaterThanOrEqualTo(Long value) {
            addCriterion("service_fzr_zjlx >=", value, "serviceFzrZjlx");
            return (Criteria) this;
        }

        public Criteria andServiceFzrZjlxLessThan(Long value) {
            addCriterion("service_fzr_zjlx <", value, "serviceFzrZjlx");
            return (Criteria) this;
        }

        public Criteria andServiceFzrZjlxLessThanOrEqualTo(Long value) {
            addCriterion("service_fzr_zjlx <=", value, "serviceFzrZjlx");
            return (Criteria) this;
        }

        public Criteria andServiceFzrZjlxIn(List<Long> values) {
            addCriterion("service_fzr_zjlx in", values, "serviceFzrZjlx");
            return (Criteria) this;
        }

        public Criteria andServiceFzrZjlxNotIn(List<Long> values) {
            addCriterion("service_fzr_zjlx not in", values, "serviceFzrZjlx");
            return (Criteria) this;
        }

        public Criteria andServiceFzrZjlxBetween(Long value1, Long value2) {
            addCriterion("service_fzr_zjlx between", value1, value2, "serviceFzrZjlx");
            return (Criteria) this;
        }

        public Criteria andServiceFzrZjlxNotBetween(Long value1, Long value2) {
            addCriterion("service_fzr_zjlx not between", value1, value2, "serviceFzrZjlx");
            return (Criteria) this;
        }

        public Criteria andServiceFzrZjhmIsNull() {
            addCriterion("service_fzr_zjhm is null");
            return (Criteria) this;
        }

        public Criteria andServiceFzrZjhmIsNotNull() {
            addCriterion("service_fzr_zjhm is not null");
            return (Criteria) this;
        }

        public Criteria andServiceFzrZjhmEqualTo(String value) {
            addCriterion("service_fzr_zjhm =", value, "serviceFzrZjhm");
            return (Criteria) this;
        }

        public Criteria andServiceFzrZjhmNotEqualTo(String value) {
            addCriterion("service_fzr_zjhm <>", value, "serviceFzrZjhm");
            return (Criteria) this;
        }

        public Criteria andServiceFzrZjhmGreaterThan(String value) {
            addCriterion("service_fzr_zjhm >", value, "serviceFzrZjhm");
            return (Criteria) this;
        }

        public Criteria andServiceFzrZjhmGreaterThanOrEqualTo(String value) {
            addCriterion("service_fzr_zjhm >=", value, "serviceFzrZjhm");
            return (Criteria) this;
        }

        public Criteria andServiceFzrZjhmLessThan(String value) {
            addCriterion("service_fzr_zjhm <", value, "serviceFzrZjhm");
            return (Criteria) this;
        }

        public Criteria andServiceFzrZjhmLessThanOrEqualTo(String value) {
            addCriterion("service_fzr_zjhm <=", value, "serviceFzrZjhm");
            return (Criteria) this;
        }

        public Criteria andServiceFzrZjhmLike(String value) {
            addCriterion("service_fzr_zjhm like", value, "serviceFzrZjhm");
            return (Criteria) this;
        }

        public Criteria andServiceFzrZjhmNotLike(String value) {
            addCriterion("service_fzr_zjhm not like", value, "serviceFzrZjhm");
            return (Criteria) this;
        }

        public Criteria andServiceFzrZjhmIn(List<String> values) {
            addCriterion("service_fzr_zjhm in", values, "serviceFzrZjhm");
            return (Criteria) this;
        }

        public Criteria andServiceFzrZjhmNotIn(List<String> values) {
            addCriterion("service_fzr_zjhm not in", values, "serviceFzrZjhm");
            return (Criteria) this;
        }

        public Criteria andServiceFzrZjhmBetween(String value1, String value2) {
            addCriterion("service_fzr_zjhm between", value1, value2, "serviceFzrZjhm");
            return (Criteria) this;
        }

        public Criteria andServiceFzrZjhmNotBetween(String value1, String value2) {
            addCriterion("service_fzr_zjhm not between", value1, value2, "serviceFzrZjhm");
            return (Criteria) this;
        }

        public Criteria andServiceFzrDzyjIsNull() {
            addCriterion("service_fzr_dzyj is null");
            return (Criteria) this;
        }

        public Criteria andServiceFzrDzyjIsNotNull() {
            addCriterion("service_fzr_dzyj is not null");
            return (Criteria) this;
        }

        public Criteria andServiceFzrDzyjEqualTo(String value) {
            addCriterion("service_fzr_dzyj =", value, "serviceFzrDzyj");
            return (Criteria) this;
        }

        public Criteria andServiceFzrDzyjNotEqualTo(String value) {
            addCriterion("service_fzr_dzyj <>", value, "serviceFzrDzyj");
            return (Criteria) this;
        }

        public Criteria andServiceFzrDzyjGreaterThan(String value) {
            addCriterion("service_fzr_dzyj >", value, "serviceFzrDzyj");
            return (Criteria) this;
        }

        public Criteria andServiceFzrDzyjGreaterThanOrEqualTo(String value) {
            addCriterion("service_fzr_dzyj >=", value, "serviceFzrDzyj");
            return (Criteria) this;
        }

        public Criteria andServiceFzrDzyjLessThan(String value) {
            addCriterion("service_fzr_dzyj <", value, "serviceFzrDzyj");
            return (Criteria) this;
        }

        public Criteria andServiceFzrDzyjLessThanOrEqualTo(String value) {
            addCriterion("service_fzr_dzyj <=", value, "serviceFzrDzyj");
            return (Criteria) this;
        }

        public Criteria andServiceFzrDzyjLike(String value) {
            addCriterion("service_fzr_dzyj like", value, "serviceFzrDzyj");
            return (Criteria) this;
        }

        public Criteria andServiceFzrDzyjNotLike(String value) {
            addCriterion("service_fzr_dzyj not like", value, "serviceFzrDzyj");
            return (Criteria) this;
        }

        public Criteria andServiceFzrDzyjIn(List<String> values) {
            addCriterion("service_fzr_dzyj in", values, "serviceFzrDzyj");
            return (Criteria) this;
        }

        public Criteria andServiceFzrDzyjNotIn(List<String> values) {
            addCriterion("service_fzr_dzyj not in", values, "serviceFzrDzyj");
            return (Criteria) this;
        }

        public Criteria andServiceFzrDzyjBetween(String value1, String value2) {
            addCriterion("service_fzr_dzyj between", value1, value2, "serviceFzrDzyj");
            return (Criteria) this;
        }

        public Criteria andServiceFzrDzyjNotBetween(String value1, String value2) {
            addCriterion("service_fzr_dzyj not between", value1, value2, "serviceFzrDzyj");
            return (Criteria) this;
        }

        public Criteria andServiceFzrLxfs1IsNull() {
            addCriterion("service_fzr_lxfs1 is null");
            return (Criteria) this;
        }

        public Criteria andServiceFzrLxfs1IsNotNull() {
            addCriterion("service_fzr_lxfs1 is not null");
            return (Criteria) this;
        }

        public Criteria andServiceFzrLxfs1EqualTo(String value) {
            addCriterion("service_fzr_lxfs1 =", value, "serviceFzrLxfs1");
            return (Criteria) this;
        }

        public Criteria andServiceFzrLxfs1NotEqualTo(String value) {
            addCriterion("service_fzr_lxfs1 <>", value, "serviceFzrLxfs1");
            return (Criteria) this;
        }

        public Criteria andServiceFzrLxfs1GreaterThan(String value) {
            addCriterion("service_fzr_lxfs1 >", value, "serviceFzrLxfs1");
            return (Criteria) this;
        }

        public Criteria andServiceFzrLxfs1GreaterThanOrEqualTo(String value) {
            addCriterion("service_fzr_lxfs1 >=", value, "serviceFzrLxfs1");
            return (Criteria) this;
        }

        public Criteria andServiceFzrLxfs1LessThan(String value) {
            addCriterion("service_fzr_lxfs1 <", value, "serviceFzrLxfs1");
            return (Criteria) this;
        }

        public Criteria andServiceFzrLxfs1LessThanOrEqualTo(String value) {
            addCriterion("service_fzr_lxfs1 <=", value, "serviceFzrLxfs1");
            return (Criteria) this;
        }

        public Criteria andServiceFzrLxfs1Like(String value) {
            addCriterion("service_fzr_lxfs1 like", value, "serviceFzrLxfs1");
            return (Criteria) this;
        }

        public Criteria andServiceFzrLxfs1NotLike(String value) {
            addCriterion("service_fzr_lxfs1 not like", value, "serviceFzrLxfs1");
            return (Criteria) this;
        }

        public Criteria andServiceFzrLxfs1In(List<String> values) {
            addCriterion("service_fzr_lxfs1 in", values, "serviceFzrLxfs1");
            return (Criteria) this;
        }

        public Criteria andServiceFzrLxfs1NotIn(List<String> values) {
            addCriterion("service_fzr_lxfs1 not in", values, "serviceFzrLxfs1");
            return (Criteria) this;
        }

        public Criteria andServiceFzrLxfs1Between(String value1, String value2) {
            addCriterion("service_fzr_lxfs1 between", value1, value2, "serviceFzrLxfs1");
            return (Criteria) this;
        }

        public Criteria andServiceFzrLxfs1NotBetween(String value1, String value2) {
            addCriterion("service_fzr_lxfs1 not between", value1, value2, "serviceFzrLxfs1");
            return (Criteria) this;
        }

        public Criteria andServiceFzrLxfs2IsNull() {
            addCriterion("service_fzr_lxfs2 is null");
            return (Criteria) this;
        }

        public Criteria andServiceFzrLxfs2IsNotNull() {
            addCriterion("service_fzr_lxfs2 is not null");
            return (Criteria) this;
        }

        public Criteria andServiceFzrLxfs2EqualTo(String value) {
            addCriterion("service_fzr_lxfs2 =", value, "serviceFzrLxfs2");
            return (Criteria) this;
        }

        public Criteria andServiceFzrLxfs2NotEqualTo(String value) {
            addCriterion("service_fzr_lxfs2 <>", value, "serviceFzrLxfs2");
            return (Criteria) this;
        }

        public Criteria andServiceFzrLxfs2GreaterThan(String value) {
            addCriterion("service_fzr_lxfs2 >", value, "serviceFzrLxfs2");
            return (Criteria) this;
        }

        public Criteria andServiceFzrLxfs2GreaterThanOrEqualTo(String value) {
            addCriterion("service_fzr_lxfs2 >=", value, "serviceFzrLxfs2");
            return (Criteria) this;
        }

        public Criteria andServiceFzrLxfs2LessThan(String value) {
            addCriterion("service_fzr_lxfs2 <", value, "serviceFzrLxfs2");
            return (Criteria) this;
        }

        public Criteria andServiceFzrLxfs2LessThanOrEqualTo(String value) {
            addCriterion("service_fzr_lxfs2 <=", value, "serviceFzrLxfs2");
            return (Criteria) this;
        }

        public Criteria andServiceFzrLxfs2Like(String value) {
            addCriterion("service_fzr_lxfs2 like", value, "serviceFzrLxfs2");
            return (Criteria) this;
        }

        public Criteria andServiceFzrLxfs2NotLike(String value) {
            addCriterion("service_fzr_lxfs2 not like", value, "serviceFzrLxfs2");
            return (Criteria) this;
        }

        public Criteria andServiceFzrLxfs2In(List<String> values) {
            addCriterion("service_fzr_lxfs2 in", values, "serviceFzrLxfs2");
            return (Criteria) this;
        }

        public Criteria andServiceFzrLxfs2NotIn(List<String> values) {
            addCriterion("service_fzr_lxfs2 not in", values, "serviceFzrLxfs2");
            return (Criteria) this;
        }

        public Criteria andServiceFzrLxfs2Between(String value1, String value2) {
            addCriterion("service_fzr_lxfs2 between", value1, value2, "serviceFzrLxfs2");
            return (Criteria) this;
        }

        public Criteria andServiceFzrLxfs2NotBetween(String value1, String value2) {
            addCriterion("service_fzr_lxfs2 not between", value1, value2, "serviceFzrLxfs2");
            return (Criteria) this;
        }

        public Criteria andServiceFzrYjdhIsNull() {
            addCriterion("service_fzr_yjdh is null");
            return (Criteria) this;
        }

        public Criteria andServiceFzrYjdhIsNotNull() {
            addCriterion("service_fzr_yjdh is not null");
            return (Criteria) this;
        }

        public Criteria andServiceFzrYjdhEqualTo(String value) {
            addCriterion("service_fzr_yjdh =", value, "serviceFzrYjdh");
            return (Criteria) this;
        }

        public Criteria andServiceFzrYjdhNotEqualTo(String value) {
            addCriterion("service_fzr_yjdh <>", value, "serviceFzrYjdh");
            return (Criteria) this;
        }

        public Criteria andServiceFzrYjdhGreaterThan(String value) {
            addCriterion("service_fzr_yjdh >", value, "serviceFzrYjdh");
            return (Criteria) this;
        }

        public Criteria andServiceFzrYjdhGreaterThanOrEqualTo(String value) {
            addCriterion("service_fzr_yjdh >=", value, "serviceFzrYjdh");
            return (Criteria) this;
        }

        public Criteria andServiceFzrYjdhLessThan(String value) {
            addCriterion("service_fzr_yjdh <", value, "serviceFzrYjdh");
            return (Criteria) this;
        }

        public Criteria andServiceFzrYjdhLessThanOrEqualTo(String value) {
            addCriterion("service_fzr_yjdh <=", value, "serviceFzrYjdh");
            return (Criteria) this;
        }

        public Criteria andServiceFzrYjdhLike(String value) {
            addCriterion("service_fzr_yjdh like", value, "serviceFzrYjdh");
            return (Criteria) this;
        }

        public Criteria andServiceFzrYjdhNotLike(String value) {
            addCriterion("service_fzr_yjdh not like", value, "serviceFzrYjdh");
            return (Criteria) this;
        }

        public Criteria andServiceFzrYjdhIn(List<String> values) {
            addCriterion("service_fzr_yjdh in", values, "serviceFzrYjdh");
            return (Criteria) this;
        }

        public Criteria andServiceFzrYjdhNotIn(List<String> values) {
            addCriterion("service_fzr_yjdh not in", values, "serviceFzrYjdh");
            return (Criteria) this;
        }

        public Criteria andServiceFzrYjdhBetween(String value1, String value2) {
            addCriterion("service_fzr_yjdh between", value1, value2, "serviceFzrYjdh");
            return (Criteria) this;
        }

        public Criteria andServiceFzrYjdhNotBetween(String value1, String value2) {
            addCriterion("service_fzr_yjdh not between", value1, value2, "serviceFzrYjdh");
            return (Criteria) this;
        }

        public Criteria andServiceFzrJstxLxIsNull() {
            addCriterion("service_fzr_jstx_lx is null");
            return (Criteria) this;
        }

        public Criteria andServiceFzrJstxLxIsNotNull() {
            addCriterion("service_fzr_jstx_lx is not null");
            return (Criteria) this;
        }

        public Criteria andServiceFzrJstxLxEqualTo(Long value) {
            addCriterion("service_fzr_jstx_lx =", value, "serviceFzrJstxLx");
            return (Criteria) this;
        }

        public Criteria andServiceFzrJstxLxNotEqualTo(Long value) {
            addCriterion("service_fzr_jstx_lx <>", value, "serviceFzrJstxLx");
            return (Criteria) this;
        }

        public Criteria andServiceFzrJstxLxGreaterThan(Long value) {
            addCriterion("service_fzr_jstx_lx >", value, "serviceFzrJstxLx");
            return (Criteria) this;
        }

        public Criteria andServiceFzrJstxLxGreaterThanOrEqualTo(Long value) {
            addCriterion("service_fzr_jstx_lx >=", value, "serviceFzrJstxLx");
            return (Criteria) this;
        }

        public Criteria andServiceFzrJstxLxLessThan(Long value) {
            addCriterion("service_fzr_jstx_lx <", value, "serviceFzrJstxLx");
            return (Criteria) this;
        }

        public Criteria andServiceFzrJstxLxLessThanOrEqualTo(Long value) {
            addCriterion("service_fzr_jstx_lx <=", value, "serviceFzrJstxLx");
            return (Criteria) this;
        }

        public Criteria andServiceFzrJstxLxIn(List<Long> values) {
            addCriterion("service_fzr_jstx_lx in", values, "serviceFzrJstxLx");
            return (Criteria) this;
        }

        public Criteria andServiceFzrJstxLxNotIn(List<Long> values) {
            addCriterion("service_fzr_jstx_lx not in", values, "serviceFzrJstxLx");
            return (Criteria) this;
        }

        public Criteria andServiceFzrJstxLxBetween(Long value1, Long value2) {
            addCriterion("service_fzr_jstx_lx between", value1, value2, "serviceFzrJstxLx");
            return (Criteria) this;
        }

        public Criteria andServiceFzrJstxLxNotBetween(Long value1, Long value2) {
            addCriterion("service_fzr_jstx_lx not between", value1, value2, "serviceFzrJstxLx");
            return (Criteria) this;
        }

        public Criteria andServiceFzrJstxZhIsNull() {
            addCriterion("service_fzr_jstx_zh is null");
            return (Criteria) this;
        }

        public Criteria andServiceFzrJstxZhIsNotNull() {
            addCriterion("service_fzr_jstx_zh is not null");
            return (Criteria) this;
        }

        public Criteria andServiceFzrJstxZhEqualTo(String value) {
            addCriterion("service_fzr_jstx_zh =", value, "serviceFzrJstxZh");
            return (Criteria) this;
        }

        public Criteria andServiceFzrJstxZhNotEqualTo(String value) {
            addCriterion("service_fzr_jstx_zh <>", value, "serviceFzrJstxZh");
            return (Criteria) this;
        }

        public Criteria andServiceFzrJstxZhGreaterThan(String value) {
            addCriterion("service_fzr_jstx_zh >", value, "serviceFzrJstxZh");
            return (Criteria) this;
        }

        public Criteria andServiceFzrJstxZhGreaterThanOrEqualTo(String value) {
            addCriterion("service_fzr_jstx_zh >=", value, "serviceFzrJstxZh");
            return (Criteria) this;
        }

        public Criteria andServiceFzrJstxZhLessThan(String value) {
            addCriterion("service_fzr_jstx_zh <", value, "serviceFzrJstxZh");
            return (Criteria) this;
        }

        public Criteria andServiceFzrJstxZhLessThanOrEqualTo(String value) {
            addCriterion("service_fzr_jstx_zh <=", value, "serviceFzrJstxZh");
            return (Criteria) this;
        }

        public Criteria andServiceFzrJstxZhLike(String value) {
            addCriterion("service_fzr_jstx_zh like", value, "serviceFzrJstxZh");
            return (Criteria) this;
        }

        public Criteria andServiceFzrJstxZhNotLike(String value) {
            addCriterion("service_fzr_jstx_zh not like", value, "serviceFzrJstxZh");
            return (Criteria) this;
        }

        public Criteria andServiceFzrJstxZhIn(List<String> values) {
            addCriterion("service_fzr_jstx_zh in", values, "serviceFzrJstxZh");
            return (Criteria) this;
        }

        public Criteria andServiceFzrJstxZhNotIn(List<String> values) {
            addCriterion("service_fzr_jstx_zh not in", values, "serviceFzrJstxZh");
            return (Criteria) this;
        }

        public Criteria andServiceFzrJstxZhBetween(String value1, String value2) {
            addCriterion("service_fzr_jstx_zh between", value1, value2, "serviceFzrJstxZh");
            return (Criteria) this;
        }

        public Criteria andServiceFzrJstxZhNotBetween(String value1, String value2) {
            addCriterion("service_fzr_jstx_zh not between", value1, value2, "serviceFzrJstxZh");
            return (Criteria) this;
        }

        public Criteria andServiceFzrZjyxqIsNull() {
            addCriterion("service_fzr_zjyxq is null");
            return (Criteria) this;
        }

        public Criteria andServiceFzrZjyxqIsNotNull() {
            addCriterion("service_fzr_zjyxq is not null");
            return (Criteria) this;
        }

        public Criteria andServiceFzrZjyxqEqualTo(String value) {
            addCriterion("service_fzr_zjyxq =", value, "serviceFzrZjyxq");
            return (Criteria) this;
        }

        public Criteria andServiceFzrZjyxqNotEqualTo(String value) {
            addCriterion("service_fzr_zjyxq <>", value, "serviceFzrZjyxq");
            return (Criteria) this;
        }

        public Criteria andServiceFzrZjyxqGreaterThan(String value) {
            addCriterion("service_fzr_zjyxq >", value, "serviceFzrZjyxq");
            return (Criteria) this;
        }

        public Criteria andServiceFzrZjyxqGreaterThanOrEqualTo(String value) {
            addCriterion("service_fzr_zjyxq >=", value, "serviceFzrZjyxq");
            return (Criteria) this;
        }

        public Criteria andServiceFzrZjyxqLessThan(String value) {
            addCriterion("service_fzr_zjyxq <", value, "serviceFzrZjyxq");
            return (Criteria) this;
        }

        public Criteria andServiceFzrZjyxqLessThanOrEqualTo(String value) {
            addCriterion("service_fzr_zjyxq <=", value, "serviceFzrZjyxq");
            return (Criteria) this;
        }

        public Criteria andServiceFzrZjyxqLike(String value) {
            addCriterion("service_fzr_zjyxq like", value, "serviceFzrZjyxq");
            return (Criteria) this;
        }

        public Criteria andServiceFzrZjyxqNotLike(String value) {
            addCriterion("service_fzr_zjyxq not like", value, "serviceFzrZjyxq");
            return (Criteria) this;
        }

        public Criteria andServiceFzrZjyxqIn(List<String> values) {
            addCriterion("service_fzr_zjyxq in", values, "serviceFzrZjyxq");
            return (Criteria) this;
        }

        public Criteria andServiceFzrZjyxqNotIn(List<String> values) {
            addCriterion("service_fzr_zjyxq not in", values, "serviceFzrZjyxq");
            return (Criteria) this;
        }

        public Criteria andServiceFzrZjyxqBetween(String value1, String value2) {
            addCriterion("service_fzr_zjyxq between", value1, value2, "serviceFzrZjyxq");
            return (Criteria) this;
        }

        public Criteria andServiceFzrZjyxqNotBetween(String value1, String value2) {
            addCriterion("service_fzr_zjyxq not between", value1, value2, "serviceFzrZjyxq");
            return (Criteria) this;
        }

        public Criteria andServiceWzBzIsNull() {
            addCriterion("service_wz_bz is null");
            return (Criteria) this;
        }

        public Criteria andServiceWzBzIsNotNull() {
            addCriterion("service_wz_bz is not null");
            return (Criteria) this;
        }

        public Criteria andServiceWzBzEqualTo(String value) {
            addCriterion("service_wz_bz =", value, "serviceWzBz");
            return (Criteria) this;
        }

        public Criteria andServiceWzBzNotEqualTo(String value) {
            addCriterion("service_wz_bz <>", value, "serviceWzBz");
            return (Criteria) this;
        }

        public Criteria andServiceWzBzGreaterThan(String value) {
            addCriterion("service_wz_bz >", value, "serviceWzBz");
            return (Criteria) this;
        }

        public Criteria andServiceWzBzGreaterThanOrEqualTo(String value) {
            addCriterion("service_wz_bz >=", value, "serviceWzBz");
            return (Criteria) this;
        }

        public Criteria andServiceWzBzLessThan(String value) {
            addCriterion("service_wz_bz <", value, "serviceWzBz");
            return (Criteria) this;
        }

        public Criteria andServiceWzBzLessThanOrEqualTo(String value) {
            addCriterion("service_wz_bz <=", value, "serviceWzBz");
            return (Criteria) this;
        }

        public Criteria andServiceWzBzLike(String value) {
            addCriterion("service_wz_bz like", value, "serviceWzBz");
            return (Criteria) this;
        }

        public Criteria andServiceWzBzNotLike(String value) {
            addCriterion("service_wz_bz not like", value, "serviceWzBz");
            return (Criteria) this;
        }

        public Criteria andServiceWzBzIn(List<String> values) {
            addCriterion("service_wz_bz in", values, "serviceWzBz");
            return (Criteria) this;
        }

        public Criteria andServiceWzBzNotIn(List<String> values) {
            addCriterion("service_wz_bz not in", values, "serviceWzBz");
            return (Criteria) this;
        }

        public Criteria andServiceWzBzBetween(String value1, String value2) {
            addCriterion("service_wz_bz between", value1, value2, "serviceWzBz");
            return (Criteria) this;
        }

        public Criteria andServiceWzBzNotBetween(String value1, String value2) {
            addCriterion("service_wz_bz not between", value1, value2, "serviceWzBz");
            return (Criteria) this;
        }

        public Criteria andServiceXcxIdIsNull() {
            addCriterion("service_xcx_id is null");
            return (Criteria) this;
        }

        public Criteria andServiceXcxIdIsNotNull() {
            addCriterion("service_xcx_id is not null");
            return (Criteria) this;
        }

        public Criteria andServiceXcxIdEqualTo(String value) {
            addCriterion("service_xcx_id =", value, "serviceXcxId");
            return (Criteria) this;
        }

        public Criteria andServiceXcxIdNotEqualTo(String value) {
            addCriterion("service_xcx_id <>", value, "serviceXcxId");
            return (Criteria) this;
        }

        public Criteria andServiceXcxIdGreaterThan(String value) {
            addCriterion("service_xcx_id >", value, "serviceXcxId");
            return (Criteria) this;
        }

        public Criteria andServiceXcxIdGreaterThanOrEqualTo(String value) {
            addCriterion("service_xcx_id >=", value, "serviceXcxId");
            return (Criteria) this;
        }

        public Criteria andServiceXcxIdLessThan(String value) {
            addCriterion("service_xcx_id <", value, "serviceXcxId");
            return (Criteria) this;
        }

        public Criteria andServiceXcxIdLessThanOrEqualTo(String value) {
            addCriterion("service_xcx_id <=", value, "serviceXcxId");
            return (Criteria) this;
        }

        public Criteria andServiceXcxIdLike(String value) {
            addCriterion("service_xcx_id like", value, "serviceXcxId");
            return (Criteria) this;
        }

        public Criteria andServiceXcxIdNotLike(String value) {
            addCriterion("service_xcx_id not like", value, "serviceXcxId");
            return (Criteria) this;
        }

        public Criteria andServiceXcxIdIn(List<String> values) {
            addCriterion("service_xcx_id in", values, "serviceXcxId");
            return (Criteria) this;
        }

        public Criteria andServiceXcxIdNotIn(List<String> values) {
            addCriterion("service_xcx_id not in", values, "serviceXcxId");
            return (Criteria) this;
        }

        public Criteria andServiceXcxIdBetween(String value1, String value2) {
            addCriterion("service_xcx_id between", value1, value2, "serviceXcxId");
            return (Criteria) this;
        }

        public Criteria andServiceXcxIdNotBetween(String value1, String value2) {
            addCriterion("service_xcx_id not between", value1, value2, "serviceXcxId");
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

        public Criteria andAnnexFjssdxSsdxlxIsNull() {
            addCriterion("annex_fjssdx_ssdxlx is null");
            return (Criteria) this;
        }

        public Criteria andAnnexFjssdxSsdxlxIsNotNull() {
            addCriterion("annex_fjssdx_ssdxlx is not null");
            return (Criteria) this;
        }

        public Criteria andAnnexFjssdxSsdxlxEqualTo(Long value) {
            addCriterion("annex_fjssdx_ssdxlx =", value, "annexFjssdxSsdxlx");
            return (Criteria) this;
        }

        public Criteria andAnnexFjssdxSsdxlxNotEqualTo(Long value) {
            addCriterion("annex_fjssdx_ssdxlx <>", value, "annexFjssdxSsdxlx");
            return (Criteria) this;
        }

        public Criteria andAnnexFjssdxSsdxlxGreaterThan(Long value) {
            addCriterion("annex_fjssdx_ssdxlx >", value, "annexFjssdxSsdxlx");
            return (Criteria) this;
        }

        public Criteria andAnnexFjssdxSsdxlxGreaterThanOrEqualTo(Long value) {
            addCriterion("annex_fjssdx_ssdxlx >=", value, "annexFjssdxSsdxlx");
            return (Criteria) this;
        }

        public Criteria andAnnexFjssdxSsdxlxLessThan(Long value) {
            addCriterion("annex_fjssdx_ssdxlx <", value, "annexFjssdxSsdxlx");
            return (Criteria) this;
        }

        public Criteria andAnnexFjssdxSsdxlxLessThanOrEqualTo(Long value) {
            addCriterion("annex_fjssdx_ssdxlx <=", value, "annexFjssdxSsdxlx");
            return (Criteria) this;
        }

        public Criteria andAnnexFjssdxSsdxlxIn(List<Long> values) {
            addCriterion("annex_fjssdx_ssdxlx in", values, "annexFjssdxSsdxlx");
            return (Criteria) this;
        }

        public Criteria andAnnexFjssdxSsdxlxNotIn(List<Long> values) {
            addCriterion("annex_fjssdx_ssdxlx not in", values, "annexFjssdxSsdxlx");
            return (Criteria) this;
        }

        public Criteria andAnnexFjssdxSsdxlxBetween(Long value1, Long value2) {
            addCriterion("annex_fjssdx_ssdxlx between", value1, value2, "annexFjssdxSsdxlx");
            return (Criteria) this;
        }

        public Criteria andAnnexFjssdxSsdxlxNotBetween(Long value1, Long value2) {
            addCriterion("annex_fjssdx_ssdxlx not between", value1, value2, "annexFjssdxSsdxlx");
            return (Criteria) this;
        }

        public Criteria andAnnexFjssdxSsdxbsIsNull() {
            addCriterion("annex_fjssdx_ssdxbs is null");
            return (Criteria) this;
        }

        public Criteria andAnnexFjssdxSsdxbsIsNotNull() {
            addCriterion("annex_fjssdx_ssdxbs is not null");
            return (Criteria) this;
        }

        public Criteria andAnnexFjssdxSsdxbsEqualTo(String value) {
            addCriterion("annex_fjssdx_ssdxbs =", value, "annexFjssdxSsdxbs");
            return (Criteria) this;
        }

        public Criteria andAnnexFjssdxSsdxbsNotEqualTo(String value) {
            addCriterion("annex_fjssdx_ssdxbs <>", value, "annexFjssdxSsdxbs");
            return (Criteria) this;
        }

        public Criteria andAnnexFjssdxSsdxbsGreaterThan(String value) {
            addCriterion("annex_fjssdx_ssdxbs >", value, "annexFjssdxSsdxbs");
            return (Criteria) this;
        }

        public Criteria andAnnexFjssdxSsdxbsGreaterThanOrEqualTo(String value) {
            addCriterion("annex_fjssdx_ssdxbs >=", value, "annexFjssdxSsdxbs");
            return (Criteria) this;
        }

        public Criteria andAnnexFjssdxSsdxbsLessThan(String value) {
            addCriterion("annex_fjssdx_ssdxbs <", value, "annexFjssdxSsdxbs");
            return (Criteria) this;
        }

        public Criteria andAnnexFjssdxSsdxbsLessThanOrEqualTo(String value) {
            addCriterion("annex_fjssdx_ssdxbs <=", value, "annexFjssdxSsdxbs");
            return (Criteria) this;
        }

        public Criteria andAnnexFjssdxSsdxbsLike(String value) {
            addCriterion("annex_fjssdx_ssdxbs like", value, "annexFjssdxSsdxbs");
            return (Criteria) this;
        }

        public Criteria andAnnexFjssdxSsdxbsNotLike(String value) {
            addCriterion("annex_fjssdx_ssdxbs not like", value, "annexFjssdxSsdxbs");
            return (Criteria) this;
        }

        public Criteria andAnnexFjssdxSsdxbsIn(List<String> values) {
            addCriterion("annex_fjssdx_ssdxbs in", values, "annexFjssdxSsdxbs");
            return (Criteria) this;
        }

        public Criteria andAnnexFjssdxSsdxbsNotIn(List<String> values) {
            addCriterion("annex_fjssdx_ssdxbs not in", values, "annexFjssdxSsdxbs");
            return (Criteria) this;
        }

        public Criteria andAnnexFjssdxSsdxbsBetween(String value1, String value2) {
            addCriterion("annex_fjssdx_ssdxbs between", value1, value2, "annexFjssdxSsdxbs");
            return (Criteria) this;
        }

        public Criteria andAnnexFjssdxSsdxbsNotBetween(String value1, String value2) {
            addCriterion("annex_fjssdx_ssdxbs not between", value1, value2, "annexFjssdxSsdxbs");
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