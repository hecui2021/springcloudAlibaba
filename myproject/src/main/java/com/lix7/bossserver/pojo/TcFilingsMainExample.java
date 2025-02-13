package com.lix7.bossserver.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TcFilingsMainExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TcFilingsMainExample() {
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

        public Criteria andInfoIdIsNull() {
            addCriterion("info_id is null");
            return (Criteria) this;
        }

        public Criteria andInfoIdIsNotNull() {
            addCriterion("info_id is not null");
            return (Criteria) this;
        }

        public Criteria andInfoIdEqualTo(Integer value) {
            addCriterion("info_id =", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdNotEqualTo(Integer value) {
            addCriterion("info_id <>", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdGreaterThan(Integer value) {
            addCriterion("info_id >", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("info_id >=", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdLessThan(Integer value) {
            addCriterion("info_id <", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdLessThanOrEqualTo(Integer value) {
            addCriterion("info_id <=", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdIn(List<Integer> values) {
            addCriterion("info_id in", values, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdNotIn(List<Integer> values) {
            addCriterion("info_id not in", values, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdBetween(Integer value1, Integer value2) {
            addCriterion("info_id between", value1, value2, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("info_id not between", value1, value2, "infoId");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andDwxzIsNull() {
            addCriterion("dwxz is null");
            return (Criteria) this;
        }

        public Criteria andDwxzIsNotNull() {
            addCriterion("dwxz is not null");
            return (Criteria) this;
        }

        public Criteria andDwxzEqualTo(Long value) {
            addCriterion("dwxz =", value, "dwxz");
            return (Criteria) this;
        }

        public Criteria andDwxzNotEqualTo(Long value) {
            addCriterion("dwxz <>", value, "dwxz");
            return (Criteria) this;
        }

        public Criteria andDwxzGreaterThan(Long value) {
            addCriterion("dwxz >", value, "dwxz");
            return (Criteria) this;
        }

        public Criteria andDwxzGreaterThanOrEqualTo(Long value) {
            addCriterion("dwxz >=", value, "dwxz");
            return (Criteria) this;
        }

        public Criteria andDwxzLessThan(Long value) {
            addCriterion("dwxz <", value, "dwxz");
            return (Criteria) this;
        }

        public Criteria andDwxzLessThanOrEqualTo(Long value) {
            addCriterion("dwxz <=", value, "dwxz");
            return (Criteria) this;
        }

        public Criteria andDwxzIn(List<Long> values) {
            addCriterion("dwxz in", values, "dwxz");
            return (Criteria) this;
        }

        public Criteria andDwxzNotIn(List<Long> values) {
            addCriterion("dwxz not in", values, "dwxz");
            return (Criteria) this;
        }

        public Criteria andDwxzBetween(Long value1, Long value2) {
            addCriterion("dwxz between", value1, value2, "dwxz");
            return (Criteria) this;
        }

        public Criteria andDwxzNotBetween(Long value1, Long value2) {
            addCriterion("dwxz not between", value1, value2, "dwxz");
            return (Criteria) this;
        }

        public Criteria andZjlxIsNull() {
            addCriterion("zjlx is null");
            return (Criteria) this;
        }

        public Criteria andZjlxIsNotNull() {
            addCriterion("zjlx is not null");
            return (Criteria) this;
        }

        public Criteria andZjlxEqualTo(Long value) {
            addCriterion("zjlx =", value, "zjlx");
            return (Criteria) this;
        }

        public Criteria andZjlxNotEqualTo(Long value) {
            addCriterion("zjlx <>", value, "zjlx");
            return (Criteria) this;
        }

        public Criteria andZjlxGreaterThan(Long value) {
            addCriterion("zjlx >", value, "zjlx");
            return (Criteria) this;
        }

        public Criteria andZjlxGreaterThanOrEqualTo(Long value) {
            addCriterion("zjlx >=", value, "zjlx");
            return (Criteria) this;
        }

        public Criteria andZjlxLessThan(Long value) {
            addCriterion("zjlx <", value, "zjlx");
            return (Criteria) this;
        }

        public Criteria andZjlxLessThanOrEqualTo(Long value) {
            addCriterion("zjlx <=", value, "zjlx");
            return (Criteria) this;
        }

        public Criteria andZjlxIn(List<Long> values) {
            addCriterion("zjlx in", values, "zjlx");
            return (Criteria) this;
        }

        public Criteria andZjlxNotIn(List<Long> values) {
            addCriterion("zjlx not in", values, "zjlx");
            return (Criteria) this;
        }

        public Criteria andZjlxBetween(Long value1, Long value2) {
            addCriterion("zjlx between", value1, value2, "zjlx");
            return (Criteria) this;
        }

        public Criteria andZjlxNotBetween(Long value1, Long value2) {
            addCriterion("zjlx not between", value1, value2, "zjlx");
            return (Criteria) this;
        }

        public Criteria andZjhmIsNull() {
            addCriterion("zjhm is null");
            return (Criteria) this;
        }

        public Criteria andZjhmIsNotNull() {
            addCriterion("zjhm is not null");
            return (Criteria) this;
        }

        public Criteria andZjhmEqualTo(String value) {
            addCriterion("zjhm =", value, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmNotEqualTo(String value) {
            addCriterion("zjhm <>", value, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmGreaterThan(String value) {
            addCriterion("zjhm >", value, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmGreaterThanOrEqualTo(String value) {
            addCriterion("zjhm >=", value, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmLessThan(String value) {
            addCriterion("zjhm <", value, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmLessThanOrEqualTo(String value) {
            addCriterion("zjhm <=", value, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmLike(String value) {
            addCriterion("zjhm like", value, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmNotLike(String value) {
            addCriterion("zjhm not like", value, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmIn(List<String> values) {
            addCriterion("zjhm in", values, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmNotIn(List<String> values) {
            addCriterion("zjhm not in", values, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmBetween(String value1, String value2) {
            addCriterion("zjhm between", value1, value2, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmNotBetween(String value1, String value2) {
            addCriterion("zjhm not between", value1, value2, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjzsIsNull() {
            addCriterion("zjzs is null");
            return (Criteria) this;
        }

        public Criteria andZjzsIsNotNull() {
            addCriterion("zjzs is not null");
            return (Criteria) this;
        }

        public Criteria andZjzsEqualTo(String value) {
            addCriterion("zjzs =", value, "zjzs");
            return (Criteria) this;
        }

        public Criteria andZjzsNotEqualTo(String value) {
            addCriterion("zjzs <>", value, "zjzs");
            return (Criteria) this;
        }

        public Criteria andZjzsGreaterThan(String value) {
            addCriterion("zjzs >", value, "zjzs");
            return (Criteria) this;
        }

        public Criteria andZjzsGreaterThanOrEqualTo(String value) {
            addCriterion("zjzs >=", value, "zjzs");
            return (Criteria) this;
        }

        public Criteria andZjzsLessThan(String value) {
            addCriterion("zjzs <", value, "zjzs");
            return (Criteria) this;
        }

        public Criteria andZjzsLessThanOrEqualTo(String value) {
            addCriterion("zjzs <=", value, "zjzs");
            return (Criteria) this;
        }

        public Criteria andZjzsLike(String value) {
            addCriterion("zjzs like", value, "zjzs");
            return (Criteria) this;
        }

        public Criteria andZjzsNotLike(String value) {
            addCriterion("zjzs not like", value, "zjzs");
            return (Criteria) this;
        }

        public Criteria andZjzsIn(List<String> values) {
            addCriterion("zjzs in", values, "zjzs");
            return (Criteria) this;
        }

        public Criteria andZjzsNotIn(List<String> values) {
            addCriterion("zjzs not in", values, "zjzs");
            return (Criteria) this;
        }

        public Criteria andZjzsBetween(String value1, String value2) {
            addCriterion("zjzs between", value1, value2, "zjzs");
            return (Criteria) this;
        }

        public Criteria andZjzsNotBetween(String value1, String value2) {
            addCriterion("zjzs not between", value1, value2, "zjzs");
            return (Criteria) this;
        }

        public Criteria andShengidIsNull() {
            addCriterion("shengid is null");
            return (Criteria) this;
        }

        public Criteria andShengidIsNotNull() {
            addCriterion("shengid is not null");
            return (Criteria) this;
        }

        public Criteria andShengidEqualTo(Long value) {
            addCriterion("shengid =", value, "shengid");
            return (Criteria) this;
        }

        public Criteria andShengidNotEqualTo(Long value) {
            addCriterion("shengid <>", value, "shengid");
            return (Criteria) this;
        }

        public Criteria andShengidGreaterThan(Long value) {
            addCriterion("shengid >", value, "shengid");
            return (Criteria) this;
        }

        public Criteria andShengidGreaterThanOrEqualTo(Long value) {
            addCriterion("shengid >=", value, "shengid");
            return (Criteria) this;
        }

        public Criteria andShengidLessThan(Long value) {
            addCriterion("shengid <", value, "shengid");
            return (Criteria) this;
        }

        public Criteria andShengidLessThanOrEqualTo(Long value) {
            addCriterion("shengid <=", value, "shengid");
            return (Criteria) this;
        }

        public Criteria andShengidIn(List<Long> values) {
            addCriterion("shengid in", values, "shengid");
            return (Criteria) this;
        }

        public Criteria andShengidNotIn(List<Long> values) {
            addCriterion("shengid not in", values, "shengid");
            return (Criteria) this;
        }

        public Criteria andShengidBetween(Long value1, Long value2) {
            addCriterion("shengid between", value1, value2, "shengid");
            return (Criteria) this;
        }

        public Criteria andShengidNotBetween(Long value1, Long value2) {
            addCriterion("shengid not between", value1, value2, "shengid");
            return (Criteria) this;
        }

        public Criteria andShiidIsNull() {
            addCriterion("shiid is null");
            return (Criteria) this;
        }

        public Criteria andShiidIsNotNull() {
            addCriterion("shiid is not null");
            return (Criteria) this;
        }

        public Criteria andShiidEqualTo(Long value) {
            addCriterion("shiid =", value, "shiid");
            return (Criteria) this;
        }

        public Criteria andShiidNotEqualTo(Long value) {
            addCriterion("shiid <>", value, "shiid");
            return (Criteria) this;
        }

        public Criteria andShiidGreaterThan(Long value) {
            addCriterion("shiid >", value, "shiid");
            return (Criteria) this;
        }

        public Criteria andShiidGreaterThanOrEqualTo(Long value) {
            addCriterion("shiid >=", value, "shiid");
            return (Criteria) this;
        }

        public Criteria andShiidLessThan(Long value) {
            addCriterion("shiid <", value, "shiid");
            return (Criteria) this;
        }

        public Criteria andShiidLessThanOrEqualTo(Long value) {
            addCriterion("shiid <=", value, "shiid");
            return (Criteria) this;
        }

        public Criteria andShiidIn(List<Long> values) {
            addCriterion("shiid in", values, "shiid");
            return (Criteria) this;
        }

        public Criteria andShiidNotIn(List<Long> values) {
            addCriterion("shiid not in", values, "shiid");
            return (Criteria) this;
        }

        public Criteria andShiidBetween(Long value1, Long value2) {
            addCriterion("shiid between", value1, value2, "shiid");
            return (Criteria) this;
        }

        public Criteria andShiidNotBetween(Long value1, Long value2) {
            addCriterion("shiid not between", value1, value2, "shiid");
            return (Criteria) this;
        }

        public Criteria andXianidIsNull() {
            addCriterion("xianid is null");
            return (Criteria) this;
        }

        public Criteria andXianidIsNotNull() {
            addCriterion("xianid is not null");
            return (Criteria) this;
        }

        public Criteria andXianidEqualTo(Long value) {
            addCriterion("xianid =", value, "xianid");
            return (Criteria) this;
        }

        public Criteria andXianidNotEqualTo(Long value) {
            addCriterion("xianid <>", value, "xianid");
            return (Criteria) this;
        }

        public Criteria andXianidGreaterThan(Long value) {
            addCriterion("xianid >", value, "xianid");
            return (Criteria) this;
        }

        public Criteria andXianidGreaterThanOrEqualTo(Long value) {
            addCriterion("xianid >=", value, "xianid");
            return (Criteria) this;
        }

        public Criteria andXianidLessThan(Long value) {
            addCriterion("xianid <", value, "xianid");
            return (Criteria) this;
        }

        public Criteria andXianidLessThanOrEqualTo(Long value) {
            addCriterion("xianid <=", value, "xianid");
            return (Criteria) this;
        }

        public Criteria andXianidIn(List<Long> values) {
            addCriterion("xianid in", values, "xianid");
            return (Criteria) this;
        }

        public Criteria andXianidNotIn(List<Long> values) {
            addCriterion("xianid not in", values, "xianid");
            return (Criteria) this;
        }

        public Criteria andXianidBetween(Long value1, Long value2) {
            addCriterion("xianid between", value1, value2, "xianid");
            return (Criteria) this;
        }

        public Criteria andXianidNotBetween(Long value1, Long value2) {
            addCriterion("xianid not between", value1, value2, "xianid");
            return (Criteria) this;
        }

        public Criteria andShengshixianIsNull() {
            addCriterion("shengshixian is null");
            return (Criteria) this;
        }

        public Criteria andShengshixianIsNotNull() {
            addCriterion("shengshixian is not null");
            return (Criteria) this;
        }

        public Criteria andShengshixianEqualTo(String value) {
            addCriterion("shengshixian =", value, "shengshixian");
            return (Criteria) this;
        }

        public Criteria andShengshixianNotEqualTo(String value) {
            addCriterion("shengshixian <>", value, "shengshixian");
            return (Criteria) this;
        }

        public Criteria andShengshixianGreaterThan(String value) {
            addCriterion("shengshixian >", value, "shengshixian");
            return (Criteria) this;
        }

        public Criteria andShengshixianGreaterThanOrEqualTo(String value) {
            addCriterion("shengshixian >=", value, "shengshixian");
            return (Criteria) this;
        }

        public Criteria andShengshixianLessThan(String value) {
            addCriterion("shengshixian <", value, "shengshixian");
            return (Criteria) this;
        }

        public Criteria andShengshixianLessThanOrEqualTo(String value) {
            addCriterion("shengshixian <=", value, "shengshixian");
            return (Criteria) this;
        }

        public Criteria andShengshixianLike(String value) {
            addCriterion("shengshixian like", value, "shengshixian");
            return (Criteria) this;
        }

        public Criteria andShengshixianNotLike(String value) {
            addCriterion("shengshixian not like", value, "shengshixian");
            return (Criteria) this;
        }

        public Criteria andShengshixianIn(List<String> values) {
            addCriterion("shengshixian in", values, "shengshixian");
            return (Criteria) this;
        }

        public Criteria andShengshixianNotIn(List<String> values) {
            addCriterion("shengshixian not in", values, "shengshixian");
            return (Criteria) this;
        }

        public Criteria andShengshixianBetween(String value1, String value2) {
            addCriterion("shengshixian between", value1, value2, "shengshixian");
            return (Criteria) this;
        }

        public Criteria andShengshixianNotBetween(String value1, String value2) {
            addCriterion("shengshixian not between", value1, value2, "shengshixian");
            return (Criteria) this;
        }

        public Criteria andXxdzIsNull() {
            addCriterion("xxdz is null");
            return (Criteria) this;
        }

        public Criteria andXxdzIsNotNull() {
            addCriterion("xxdz is not null");
            return (Criteria) this;
        }

        public Criteria andXxdzEqualTo(String value) {
            addCriterion("xxdz =", value, "xxdz");
            return (Criteria) this;
        }

        public Criteria andXxdzNotEqualTo(String value) {
            addCriterion("xxdz <>", value, "xxdz");
            return (Criteria) this;
        }

        public Criteria andXxdzGreaterThan(String value) {
            addCriterion("xxdz >", value, "xxdz");
            return (Criteria) this;
        }

        public Criteria andXxdzGreaterThanOrEqualTo(String value) {
            addCriterion("xxdz >=", value, "xxdz");
            return (Criteria) this;
        }

        public Criteria andXxdzLessThan(String value) {
            addCriterion("xxdz <", value, "xxdz");
            return (Criteria) this;
        }

        public Criteria andXxdzLessThanOrEqualTo(String value) {
            addCriterion("xxdz <=", value, "xxdz");
            return (Criteria) this;
        }

        public Criteria andXxdzLike(String value) {
            addCriterion("xxdz like", value, "xxdz");
            return (Criteria) this;
        }

        public Criteria andXxdzNotLike(String value) {
            addCriterion("xxdz not like", value, "xxdz");
            return (Criteria) this;
        }

        public Criteria andXxdzIn(List<String> values) {
            addCriterion("xxdz in", values, "xxdz");
            return (Criteria) this;
        }

        public Criteria andXxdzNotIn(List<String> values) {
            addCriterion("xxdz not in", values, "xxdz");
            return (Criteria) this;
        }

        public Criteria andXxdzBetween(String value1, String value2) {
            addCriterion("xxdz between", value1, value2, "xxdz");
            return (Criteria) this;
        }

        public Criteria andXxdzNotBetween(String value1, String value2) {
            addCriterion("xxdz not between", value1, value2, "xxdz");
            return (Criteria) this;
        }

        public Criteria andFzrXmIsNull() {
            addCriterion("fzr_xm is null");
            return (Criteria) this;
        }

        public Criteria andFzrXmIsNotNull() {
            addCriterion("fzr_xm is not null");
            return (Criteria) this;
        }

        public Criteria andFzrXmEqualTo(String value) {
            addCriterion("fzr_xm =", value, "fzrXm");
            return (Criteria) this;
        }

        public Criteria andFzrXmNotEqualTo(String value) {
            addCriterion("fzr_xm <>", value, "fzrXm");
            return (Criteria) this;
        }

        public Criteria andFzrXmGreaterThan(String value) {
            addCriterion("fzr_xm >", value, "fzrXm");
            return (Criteria) this;
        }

        public Criteria andFzrXmGreaterThanOrEqualTo(String value) {
            addCriterion("fzr_xm >=", value, "fzrXm");
            return (Criteria) this;
        }

        public Criteria andFzrXmLessThan(String value) {
            addCriterion("fzr_xm <", value, "fzrXm");
            return (Criteria) this;
        }

        public Criteria andFzrXmLessThanOrEqualTo(String value) {
            addCriterion("fzr_xm <=", value, "fzrXm");
            return (Criteria) this;
        }

        public Criteria andFzrXmLike(String value) {
            addCriterion("fzr_xm like", value, "fzrXm");
            return (Criteria) this;
        }

        public Criteria andFzrXmNotLike(String value) {
            addCriterion("fzr_xm not like", value, "fzrXm");
            return (Criteria) this;
        }

        public Criteria andFzrXmIn(List<String> values) {
            addCriterion("fzr_xm in", values, "fzrXm");
            return (Criteria) this;
        }

        public Criteria andFzrXmNotIn(List<String> values) {
            addCriterion("fzr_xm not in", values, "fzrXm");
            return (Criteria) this;
        }

        public Criteria andFzrXmBetween(String value1, String value2) {
            addCriterion("fzr_xm between", value1, value2, "fzrXm");
            return (Criteria) this;
        }

        public Criteria andFzrXmNotBetween(String value1, String value2) {
            addCriterion("fzr_xm not between", value1, value2, "fzrXm");
            return (Criteria) this;
        }

        public Criteria andFzrZjlxIsNull() {
            addCriterion("fzr_zjlx is null");
            return (Criteria) this;
        }

        public Criteria andFzrZjlxIsNotNull() {
            addCriterion("fzr_zjlx is not null");
            return (Criteria) this;
        }

        public Criteria andFzrZjlxEqualTo(Long value) {
            addCriterion("fzr_zjlx =", value, "fzrZjlx");
            return (Criteria) this;
        }

        public Criteria andFzrZjlxNotEqualTo(Long value) {
            addCriterion("fzr_zjlx <>", value, "fzrZjlx");
            return (Criteria) this;
        }

        public Criteria andFzrZjlxGreaterThan(Long value) {
            addCriterion("fzr_zjlx >", value, "fzrZjlx");
            return (Criteria) this;
        }

        public Criteria andFzrZjlxGreaterThanOrEqualTo(Long value) {
            addCriterion("fzr_zjlx >=", value, "fzrZjlx");
            return (Criteria) this;
        }

        public Criteria andFzrZjlxLessThan(Long value) {
            addCriterion("fzr_zjlx <", value, "fzrZjlx");
            return (Criteria) this;
        }

        public Criteria andFzrZjlxLessThanOrEqualTo(Long value) {
            addCriterion("fzr_zjlx <=", value, "fzrZjlx");
            return (Criteria) this;
        }

        public Criteria andFzrZjlxIn(List<Long> values) {
            addCriterion("fzr_zjlx in", values, "fzrZjlx");
            return (Criteria) this;
        }

        public Criteria andFzrZjlxNotIn(List<Long> values) {
            addCriterion("fzr_zjlx not in", values, "fzrZjlx");
            return (Criteria) this;
        }

        public Criteria andFzrZjlxBetween(Long value1, Long value2) {
            addCriterion("fzr_zjlx between", value1, value2, "fzrZjlx");
            return (Criteria) this;
        }

        public Criteria andFzrZjlxNotBetween(Long value1, Long value2) {
            addCriterion("fzr_zjlx not between", value1, value2, "fzrZjlx");
            return (Criteria) this;
        }

        public Criteria andFzrZjhmIsNull() {
            addCriterion("fzr_zjhm is null");
            return (Criteria) this;
        }

        public Criteria andFzrZjhmIsNotNull() {
            addCriterion("fzr_zjhm is not null");
            return (Criteria) this;
        }

        public Criteria andFzrZjhmEqualTo(String value) {
            addCriterion("fzr_zjhm =", value, "fzrZjhm");
            return (Criteria) this;
        }

        public Criteria andFzrZjhmNotEqualTo(String value) {
            addCriterion("fzr_zjhm <>", value, "fzrZjhm");
            return (Criteria) this;
        }

        public Criteria andFzrZjhmGreaterThan(String value) {
            addCriterion("fzr_zjhm >", value, "fzrZjhm");
            return (Criteria) this;
        }

        public Criteria andFzrZjhmGreaterThanOrEqualTo(String value) {
            addCriterion("fzr_zjhm >=", value, "fzrZjhm");
            return (Criteria) this;
        }

        public Criteria andFzrZjhmLessThan(String value) {
            addCriterion("fzr_zjhm <", value, "fzrZjhm");
            return (Criteria) this;
        }

        public Criteria andFzrZjhmLessThanOrEqualTo(String value) {
            addCriterion("fzr_zjhm <=", value, "fzrZjhm");
            return (Criteria) this;
        }

        public Criteria andFzrZjhmLike(String value) {
            addCriterion("fzr_zjhm like", value, "fzrZjhm");
            return (Criteria) this;
        }

        public Criteria andFzrZjhmNotLike(String value) {
            addCriterion("fzr_zjhm not like", value, "fzrZjhm");
            return (Criteria) this;
        }

        public Criteria andFzrZjhmIn(List<String> values) {
            addCriterion("fzr_zjhm in", values, "fzrZjhm");
            return (Criteria) this;
        }

        public Criteria andFzrZjhmNotIn(List<String> values) {
            addCriterion("fzr_zjhm not in", values, "fzrZjhm");
            return (Criteria) this;
        }

        public Criteria andFzrZjhmBetween(String value1, String value2) {
            addCriterion("fzr_zjhm between", value1, value2, "fzrZjhm");
            return (Criteria) this;
        }

        public Criteria andFzrZjhmNotBetween(String value1, String value2) {
            addCriterion("fzr_zjhm not between", value1, value2, "fzrZjhm");
            return (Criteria) this;
        }

        public Criteria andFzrDzyjIsNull() {
            addCriterion("fzr_dzyj is null");
            return (Criteria) this;
        }

        public Criteria andFzrDzyjIsNotNull() {
            addCriterion("fzr_dzyj is not null");
            return (Criteria) this;
        }

        public Criteria andFzrDzyjEqualTo(String value) {
            addCriterion("fzr_dzyj =", value, "fzrDzyj");
            return (Criteria) this;
        }

        public Criteria andFzrDzyjNotEqualTo(String value) {
            addCriterion("fzr_dzyj <>", value, "fzrDzyj");
            return (Criteria) this;
        }

        public Criteria andFzrDzyjGreaterThan(String value) {
            addCriterion("fzr_dzyj >", value, "fzrDzyj");
            return (Criteria) this;
        }

        public Criteria andFzrDzyjGreaterThanOrEqualTo(String value) {
            addCriterion("fzr_dzyj >=", value, "fzrDzyj");
            return (Criteria) this;
        }

        public Criteria andFzrDzyjLessThan(String value) {
            addCriterion("fzr_dzyj <", value, "fzrDzyj");
            return (Criteria) this;
        }

        public Criteria andFzrDzyjLessThanOrEqualTo(String value) {
            addCriterion("fzr_dzyj <=", value, "fzrDzyj");
            return (Criteria) this;
        }

        public Criteria andFzrDzyjLike(String value) {
            addCriterion("fzr_dzyj like", value, "fzrDzyj");
            return (Criteria) this;
        }

        public Criteria andFzrDzyjNotLike(String value) {
            addCriterion("fzr_dzyj not like", value, "fzrDzyj");
            return (Criteria) this;
        }

        public Criteria andFzrDzyjIn(List<String> values) {
            addCriterion("fzr_dzyj in", values, "fzrDzyj");
            return (Criteria) this;
        }

        public Criteria andFzrDzyjNotIn(List<String> values) {
            addCriterion("fzr_dzyj not in", values, "fzrDzyj");
            return (Criteria) this;
        }

        public Criteria andFzrDzyjBetween(String value1, String value2) {
            addCriterion("fzr_dzyj between", value1, value2, "fzrDzyj");
            return (Criteria) this;
        }

        public Criteria andFzrDzyjNotBetween(String value1, String value2) {
            addCriterion("fzr_dzyj not between", value1, value2, "fzrDzyj");
            return (Criteria) this;
        }

        public Criteria andFzrLxfs1IsNull() {
            addCriterion("fzr_lxfs1 is null");
            return (Criteria) this;
        }

        public Criteria andFzrLxfs1IsNotNull() {
            addCriterion("fzr_lxfs1 is not null");
            return (Criteria) this;
        }

        public Criteria andFzrLxfs1EqualTo(String value) {
            addCriterion("fzr_lxfs1 =", value, "fzrLxfs1");
            return (Criteria) this;
        }

        public Criteria andFzrLxfs1NotEqualTo(String value) {
            addCriterion("fzr_lxfs1 <>", value, "fzrLxfs1");
            return (Criteria) this;
        }

        public Criteria andFzrLxfs1GreaterThan(String value) {
            addCriterion("fzr_lxfs1 >", value, "fzrLxfs1");
            return (Criteria) this;
        }

        public Criteria andFzrLxfs1GreaterThanOrEqualTo(String value) {
            addCriterion("fzr_lxfs1 >=", value, "fzrLxfs1");
            return (Criteria) this;
        }

        public Criteria andFzrLxfs1LessThan(String value) {
            addCriterion("fzr_lxfs1 <", value, "fzrLxfs1");
            return (Criteria) this;
        }

        public Criteria andFzrLxfs1LessThanOrEqualTo(String value) {
            addCriterion("fzr_lxfs1 <=", value, "fzrLxfs1");
            return (Criteria) this;
        }

        public Criteria andFzrLxfs1Like(String value) {
            addCriterion("fzr_lxfs1 like", value, "fzrLxfs1");
            return (Criteria) this;
        }

        public Criteria andFzrLxfs1NotLike(String value) {
            addCriterion("fzr_lxfs1 not like", value, "fzrLxfs1");
            return (Criteria) this;
        }

        public Criteria andFzrLxfs1In(List<String> values) {
            addCriterion("fzr_lxfs1 in", values, "fzrLxfs1");
            return (Criteria) this;
        }

        public Criteria andFzrLxfs1NotIn(List<String> values) {
            addCriterion("fzr_lxfs1 not in", values, "fzrLxfs1");
            return (Criteria) this;
        }

        public Criteria andFzrLxfs1Between(String value1, String value2) {
            addCriterion("fzr_lxfs1 between", value1, value2, "fzrLxfs1");
            return (Criteria) this;
        }

        public Criteria andFzrLxfs1NotBetween(String value1, String value2) {
            addCriterion("fzr_lxfs1 not between", value1, value2, "fzrLxfs1");
            return (Criteria) this;
        }

        public Criteria andFzrLxfs2IsNull() {
            addCriterion("fzr_lxfs2 is null");
            return (Criteria) this;
        }

        public Criteria andFzrLxfs2IsNotNull() {
            addCriterion("fzr_lxfs2 is not null");
            return (Criteria) this;
        }

        public Criteria andFzrLxfs2EqualTo(String value) {
            addCriterion("fzr_lxfs2 =", value, "fzrLxfs2");
            return (Criteria) this;
        }

        public Criteria andFzrLxfs2NotEqualTo(String value) {
            addCriterion("fzr_lxfs2 <>", value, "fzrLxfs2");
            return (Criteria) this;
        }

        public Criteria andFzrLxfs2GreaterThan(String value) {
            addCriterion("fzr_lxfs2 >", value, "fzrLxfs2");
            return (Criteria) this;
        }

        public Criteria andFzrLxfs2GreaterThanOrEqualTo(String value) {
            addCriterion("fzr_lxfs2 >=", value, "fzrLxfs2");
            return (Criteria) this;
        }

        public Criteria andFzrLxfs2LessThan(String value) {
            addCriterion("fzr_lxfs2 <", value, "fzrLxfs2");
            return (Criteria) this;
        }

        public Criteria andFzrLxfs2LessThanOrEqualTo(String value) {
            addCriterion("fzr_lxfs2 <=", value, "fzrLxfs2");
            return (Criteria) this;
        }

        public Criteria andFzrLxfs2Like(String value) {
            addCriterion("fzr_lxfs2 like", value, "fzrLxfs2");
            return (Criteria) this;
        }

        public Criteria andFzrLxfs2NotLike(String value) {
            addCriterion("fzr_lxfs2 not like", value, "fzrLxfs2");
            return (Criteria) this;
        }

        public Criteria andFzrLxfs2In(List<String> values) {
            addCriterion("fzr_lxfs2 in", values, "fzrLxfs2");
            return (Criteria) this;
        }

        public Criteria andFzrLxfs2NotIn(List<String> values) {
            addCriterion("fzr_lxfs2 not in", values, "fzrLxfs2");
            return (Criteria) this;
        }

        public Criteria andFzrLxfs2Between(String value1, String value2) {
            addCriterion("fzr_lxfs2 between", value1, value2, "fzrLxfs2");
            return (Criteria) this;
        }

        public Criteria andFzrLxfs2NotBetween(String value1, String value2) {
            addCriterion("fzr_lxfs2 not between", value1, value2, "fzrLxfs2");
            return (Criteria) this;
        }

        public Criteria andFzrYjdhIsNull() {
            addCriterion("fzr_yjdh is null");
            return (Criteria) this;
        }

        public Criteria andFzrYjdhIsNotNull() {
            addCriterion("fzr_yjdh is not null");
            return (Criteria) this;
        }

        public Criteria andFzrYjdhEqualTo(String value) {
            addCriterion("fzr_yjdh =", value, "fzrYjdh");
            return (Criteria) this;
        }

        public Criteria andFzrYjdhNotEqualTo(String value) {
            addCriterion("fzr_yjdh <>", value, "fzrYjdh");
            return (Criteria) this;
        }

        public Criteria andFzrYjdhGreaterThan(String value) {
            addCriterion("fzr_yjdh >", value, "fzrYjdh");
            return (Criteria) this;
        }

        public Criteria andFzrYjdhGreaterThanOrEqualTo(String value) {
            addCriterion("fzr_yjdh >=", value, "fzrYjdh");
            return (Criteria) this;
        }

        public Criteria andFzrYjdhLessThan(String value) {
            addCriterion("fzr_yjdh <", value, "fzrYjdh");
            return (Criteria) this;
        }

        public Criteria andFzrYjdhLessThanOrEqualTo(String value) {
            addCriterion("fzr_yjdh <=", value, "fzrYjdh");
            return (Criteria) this;
        }

        public Criteria andFzrYjdhLike(String value) {
            addCriterion("fzr_yjdh like", value, "fzrYjdh");
            return (Criteria) this;
        }

        public Criteria andFzrYjdhNotLike(String value) {
            addCriterion("fzr_yjdh not like", value, "fzrYjdh");
            return (Criteria) this;
        }

        public Criteria andFzrYjdhIn(List<String> values) {
            addCriterion("fzr_yjdh in", values, "fzrYjdh");
            return (Criteria) this;
        }

        public Criteria andFzrYjdhNotIn(List<String> values) {
            addCriterion("fzr_yjdh not in", values, "fzrYjdh");
            return (Criteria) this;
        }

        public Criteria andFzrYjdhBetween(String value1, String value2) {
            addCriterion("fzr_yjdh between", value1, value2, "fzrYjdh");
            return (Criteria) this;
        }

        public Criteria andFzrYjdhNotBetween(String value1, String value2) {
            addCriterion("fzr_yjdh not between", value1, value2, "fzrYjdh");
            return (Criteria) this;
        }

        public Criteria andFzrJstxLxIsNull() {
            addCriterion("fzr_jstx_lx is null");
            return (Criteria) this;
        }

        public Criteria andFzrJstxLxIsNotNull() {
            addCriterion("fzr_jstx_lx is not null");
            return (Criteria) this;
        }

        public Criteria andFzrJstxLxEqualTo(Long value) {
            addCriterion("fzr_jstx_lx =", value, "fzrJstxLx");
            return (Criteria) this;
        }

        public Criteria andFzrJstxLxNotEqualTo(Long value) {
            addCriterion("fzr_jstx_lx <>", value, "fzrJstxLx");
            return (Criteria) this;
        }

        public Criteria andFzrJstxLxGreaterThan(Long value) {
            addCriterion("fzr_jstx_lx >", value, "fzrJstxLx");
            return (Criteria) this;
        }

        public Criteria andFzrJstxLxGreaterThanOrEqualTo(Long value) {
            addCriterion("fzr_jstx_lx >=", value, "fzrJstxLx");
            return (Criteria) this;
        }

        public Criteria andFzrJstxLxLessThan(Long value) {
            addCriterion("fzr_jstx_lx <", value, "fzrJstxLx");
            return (Criteria) this;
        }

        public Criteria andFzrJstxLxLessThanOrEqualTo(Long value) {
            addCriterion("fzr_jstx_lx <=", value, "fzrJstxLx");
            return (Criteria) this;
        }

        public Criteria andFzrJstxLxIn(List<Long> values) {
            addCriterion("fzr_jstx_lx in", values, "fzrJstxLx");
            return (Criteria) this;
        }

        public Criteria andFzrJstxLxNotIn(List<Long> values) {
            addCriterion("fzr_jstx_lx not in", values, "fzrJstxLx");
            return (Criteria) this;
        }

        public Criteria andFzrJstxLxBetween(Long value1, Long value2) {
            addCriterion("fzr_jstx_lx between", value1, value2, "fzrJstxLx");
            return (Criteria) this;
        }

        public Criteria andFzrJstxLxNotBetween(Long value1, Long value2) {
            addCriterion("fzr_jstx_lx not between", value1, value2, "fzrJstxLx");
            return (Criteria) this;
        }

        public Criteria andFzrJstxZhIsNull() {
            addCriterion("fzr_jstx_zh is null");
            return (Criteria) this;
        }

        public Criteria andFzrJstxZhIsNotNull() {
            addCriterion("fzr_jstx_zh is not null");
            return (Criteria) this;
        }

        public Criteria andFzrJstxZhEqualTo(String value) {
            addCriterion("fzr_jstx_zh =", value, "fzrJstxZh");
            return (Criteria) this;
        }

        public Criteria andFzrJstxZhNotEqualTo(String value) {
            addCriterion("fzr_jstx_zh <>", value, "fzrJstxZh");
            return (Criteria) this;
        }

        public Criteria andFzrJstxZhGreaterThan(String value) {
            addCriterion("fzr_jstx_zh >", value, "fzrJstxZh");
            return (Criteria) this;
        }

        public Criteria andFzrJstxZhGreaterThanOrEqualTo(String value) {
            addCriterion("fzr_jstx_zh >=", value, "fzrJstxZh");
            return (Criteria) this;
        }

        public Criteria andFzrJstxZhLessThan(String value) {
            addCriterion("fzr_jstx_zh <", value, "fzrJstxZh");
            return (Criteria) this;
        }

        public Criteria andFzrJstxZhLessThanOrEqualTo(String value) {
            addCriterion("fzr_jstx_zh <=", value, "fzrJstxZh");
            return (Criteria) this;
        }

        public Criteria andFzrJstxZhLike(String value) {
            addCriterion("fzr_jstx_zh like", value, "fzrJstxZh");
            return (Criteria) this;
        }

        public Criteria andFzrJstxZhNotLike(String value) {
            addCriterion("fzr_jstx_zh not like", value, "fzrJstxZh");
            return (Criteria) this;
        }

        public Criteria andFzrJstxZhIn(List<String> values) {
            addCriterion("fzr_jstx_zh in", values, "fzrJstxZh");
            return (Criteria) this;
        }

        public Criteria andFzrJstxZhNotIn(List<String> values) {
            addCriterion("fzr_jstx_zh not in", values, "fzrJstxZh");
            return (Criteria) this;
        }

        public Criteria andFzrJstxZhBetween(String value1, String value2) {
            addCriterion("fzr_jstx_zh between", value1, value2, "fzrJstxZh");
            return (Criteria) this;
        }

        public Criteria andFzrJstxZhNotBetween(String value1, String value2) {
            addCriterion("fzr_jstx_zh not between", value1, value2, "fzrJstxZh");
            return (Criteria) this;
        }

        public Criteria andFzrZjyxqIsNull() {
            addCriterion("fzr_zjyxq is null");
            return (Criteria) this;
        }

        public Criteria andFzrZjyxqIsNotNull() {
            addCriterion("fzr_zjyxq is not null");
            return (Criteria) this;
        }

        public Criteria andFzrZjyxqEqualTo(String value) {
            addCriterion("fzr_zjyxq =", value, "fzrZjyxq");
            return (Criteria) this;
        }

        public Criteria andFzrZjyxqNotEqualTo(String value) {
            addCriterion("fzr_zjyxq <>", value, "fzrZjyxq");
            return (Criteria) this;
        }

        public Criteria andFzrZjyxqGreaterThan(String value) {
            addCriterion("fzr_zjyxq >", value, "fzrZjyxq");
            return (Criteria) this;
        }

        public Criteria andFzrZjyxqGreaterThanOrEqualTo(String value) {
            addCriterion("fzr_zjyxq >=", value, "fzrZjyxq");
            return (Criteria) this;
        }

        public Criteria andFzrZjyxqLessThan(String value) {
            addCriterion("fzr_zjyxq <", value, "fzrZjyxq");
            return (Criteria) this;
        }

        public Criteria andFzrZjyxqLessThanOrEqualTo(String value) {
            addCriterion("fzr_zjyxq <=", value, "fzrZjyxq");
            return (Criteria) this;
        }

        public Criteria andFzrZjyxqLike(String value) {
            addCriterion("fzr_zjyxq like", value, "fzrZjyxq");
            return (Criteria) this;
        }

        public Criteria andFzrZjyxqNotLike(String value) {
            addCriterion("fzr_zjyxq not like", value, "fzrZjyxq");
            return (Criteria) this;
        }

        public Criteria andFzrZjyxqIn(List<String> values) {
            addCriterion("fzr_zjyxq in", values, "fzrZjyxq");
            return (Criteria) this;
        }

        public Criteria andFzrZjyxqNotIn(List<String> values) {
            addCriterion("fzr_zjyxq not in", values, "fzrZjyxq");
            return (Criteria) this;
        }

        public Criteria andFzrZjyxqBetween(String value1, String value2) {
            addCriterion("fzr_zjyxq between", value1, value2, "fzrZjyxq");
            return (Criteria) this;
        }

        public Criteria andFzrZjyxqNotBetween(String value1, String value2) {
            addCriterion("fzr_zjyxq not between", value1, value2, "fzrZjyxq");
            return (Criteria) this;
        }

        public Criteria andBbfsIsNull() {
            addCriterion("bbfs is null");
            return (Criteria) this;
        }

        public Criteria andBbfsIsNotNull() {
            addCriterion("bbfs is not null");
            return (Criteria) this;
        }

        public Criteria andBbfsEqualTo(Long value) {
            addCriterion("bbfs =", value, "bbfs");
            return (Criteria) this;
        }

        public Criteria andBbfsNotEqualTo(Long value) {
            addCriterion("bbfs <>", value, "bbfs");
            return (Criteria) this;
        }

        public Criteria andBbfsGreaterThan(Long value) {
            addCriterion("bbfs >", value, "bbfs");
            return (Criteria) this;
        }

        public Criteria andBbfsGreaterThanOrEqualTo(Long value) {
            addCriterion("bbfs >=", value, "bbfs");
            return (Criteria) this;
        }

        public Criteria andBbfsLessThan(Long value) {
            addCriterion("bbfs <", value, "bbfs");
            return (Criteria) this;
        }

        public Criteria andBbfsLessThanOrEqualTo(Long value) {
            addCriterion("bbfs <=", value, "bbfs");
            return (Criteria) this;
        }

        public Criteria andBbfsIn(List<Long> values) {
            addCriterion("bbfs in", values, "bbfs");
            return (Criteria) this;
        }

        public Criteria andBbfsNotIn(List<Long> values) {
            addCriterion("bbfs not in", values, "bbfs");
            return (Criteria) this;
        }

        public Criteria andBbfsBetween(Long value1, Long value2) {
            addCriterion("bbfs between", value1, value2, "bbfs");
            return (Criteria) this;
        }

        public Criteria andBbfsNotBetween(Long value1, Long value2) {
            addCriterion("bbfs not between", value1, value2, "bbfs");
            return (Criteria) this;
        }

        public Criteria andBzIsNull() {
            addCriterion("bz is null");
            return (Criteria) this;
        }

        public Criteria andBzIsNotNull() {
            addCriterion("bz is not null");
            return (Criteria) this;
        }

        public Criteria andBzEqualTo(String value) {
            addCriterion("bz =", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotEqualTo(String value) {
            addCriterion("bz <>", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzGreaterThan(String value) {
            addCriterion("bz >", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzGreaterThanOrEqualTo(String value) {
            addCriterion("bz >=", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLessThan(String value) {
            addCriterion("bz <", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLessThanOrEqualTo(String value) {
            addCriterion("bz <=", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLike(String value) {
            addCriterion("bz like", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotLike(String value) {
            addCriterion("bz not like", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzIn(List<String> values) {
            addCriterion("bz in", values, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotIn(List<String> values) {
            addCriterion("bz not in", values, "bz");
            return (Criteria) this;
        }

        public Criteria andBzBetween(String value1, String value2) {
            addCriterion("bz between", value1, value2, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotBetween(String value1, String value2) {
            addCriterion("bz not between", value1, value2, "bz");
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