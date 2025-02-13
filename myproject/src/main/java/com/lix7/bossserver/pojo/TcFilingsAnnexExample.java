package com.lix7.bossserver.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TcFilingsAnnexExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TcFilingsAnnexExample() {
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

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andCjmIsNull() {
            addCriterion("cjm is null");
            return (Criteria) this;
        }

        public Criteria andCjmIsNotNull() {
            addCriterion("cjm is not null");
            return (Criteria) this;
        }

        public Criteria andCjmEqualTo(String value) {
            addCriterion("cjm =", value, "cjm");
            return (Criteria) this;
        }

        public Criteria andCjmNotEqualTo(String value) {
            addCriterion("cjm <>", value, "cjm");
            return (Criteria) this;
        }

        public Criteria andCjmGreaterThan(String value) {
            addCriterion("cjm >", value, "cjm");
            return (Criteria) this;
        }

        public Criteria andCjmGreaterThanOrEqualTo(String value) {
            addCriterion("cjm >=", value, "cjm");
            return (Criteria) this;
        }

        public Criteria andCjmLessThan(String value) {
            addCriterion("cjm <", value, "cjm");
            return (Criteria) this;
        }

        public Criteria andCjmLessThanOrEqualTo(String value) {
            addCriterion("cjm <=", value, "cjm");
            return (Criteria) this;
        }

        public Criteria andCjmLike(String value) {
            addCriterion("cjm like", value, "cjm");
            return (Criteria) this;
        }

        public Criteria andCjmNotLike(String value) {
            addCriterion("cjm not like", value, "cjm");
            return (Criteria) this;
        }

        public Criteria andCjmIn(List<String> values) {
            addCriterion("cjm in", values, "cjm");
            return (Criteria) this;
        }

        public Criteria andCjmNotIn(List<String> values) {
            addCriterion("cjm not in", values, "cjm");
            return (Criteria) this;
        }

        public Criteria andCjmBetween(String value1, String value2) {
            addCriterion("cjm between", value1, value2, "cjm");
            return (Criteria) this;
        }

        public Criteria andCjmNotBetween(String value1, String value2) {
            addCriterion("cjm not between", value1, value2, "cjm");
            return (Criteria) this;
        }

        public Criteria andHyclbsIsNull() {
            addCriterion("hyclbs is null");
            return (Criteria) this;
        }

        public Criteria andHyclbsIsNotNull() {
            addCriterion("hyclbs is not null");
            return (Criteria) this;
        }

        public Criteria andHyclbsEqualTo(Long value) {
            addCriterion("hyclbs =", value, "hyclbs");
            return (Criteria) this;
        }

        public Criteria andHyclbsNotEqualTo(Long value) {
            addCriterion("hyclbs <>", value, "hyclbs");
            return (Criteria) this;
        }

        public Criteria andHyclbsGreaterThan(Long value) {
            addCriterion("hyclbs >", value, "hyclbs");
            return (Criteria) this;
        }

        public Criteria andHyclbsGreaterThanOrEqualTo(Long value) {
            addCriterion("hyclbs >=", value, "hyclbs");
            return (Criteria) this;
        }

        public Criteria andHyclbsLessThan(Long value) {
            addCriterion("hyclbs <", value, "hyclbs");
            return (Criteria) this;
        }

        public Criteria andHyclbsLessThanOrEqualTo(Long value) {
            addCriterion("hyclbs <=", value, "hyclbs");
            return (Criteria) this;
        }

        public Criteria andHyclbsIn(List<Long> values) {
            addCriterion("hyclbs in", values, "hyclbs");
            return (Criteria) this;
        }

        public Criteria andHyclbsNotIn(List<Long> values) {
            addCriterion("hyclbs not in", values, "hyclbs");
            return (Criteria) this;
        }

        public Criteria andHyclbsBetween(Long value1, Long value2) {
            addCriterion("hyclbs between", value1, value2, "hyclbs");
            return (Criteria) this;
        }

        public Criteria andHyclbsNotBetween(Long value1, Long value2) {
            addCriterion("hyclbs not between", value1, value2, "hyclbs");
            return (Criteria) this;
        }

        public Criteria andFjwjgsIsNull() {
            addCriterion("fjwjgs is null");
            return (Criteria) this;
        }

        public Criteria andFjwjgsIsNotNull() {
            addCriterion("fjwjgs is not null");
            return (Criteria) this;
        }

        public Criteria andFjwjgsEqualTo(Long value) {
            addCriterion("fjwjgs =", value, "fjwjgs");
            return (Criteria) this;
        }

        public Criteria andFjwjgsNotEqualTo(Long value) {
            addCriterion("fjwjgs <>", value, "fjwjgs");
            return (Criteria) this;
        }

        public Criteria andFjwjgsGreaterThan(Long value) {
            addCriterion("fjwjgs >", value, "fjwjgs");
            return (Criteria) this;
        }

        public Criteria andFjwjgsGreaterThanOrEqualTo(Long value) {
            addCriterion("fjwjgs >=", value, "fjwjgs");
            return (Criteria) this;
        }

        public Criteria andFjwjgsLessThan(Long value) {
            addCriterion("fjwjgs <", value, "fjwjgs");
            return (Criteria) this;
        }

        public Criteria andFjwjgsLessThanOrEqualTo(Long value) {
            addCriterion("fjwjgs <=", value, "fjwjgs");
            return (Criteria) this;
        }

        public Criteria andFjwjgsIn(List<Long> values) {
            addCriterion("fjwjgs in", values, "fjwjgs");
            return (Criteria) this;
        }

        public Criteria andFjwjgsNotIn(List<Long> values) {
            addCriterion("fjwjgs not in", values, "fjwjgs");
            return (Criteria) this;
        }

        public Criteria andFjwjgsBetween(Long value1, Long value2) {
            addCriterion("fjwjgs between", value1, value2, "fjwjgs");
            return (Criteria) this;
        }

        public Criteria andFjwjgsNotBetween(Long value1, Long value2) {
            addCriterion("fjwjgs not between", value1, value2, "fjwjgs");
            return (Criteria) this;
        }

        public Criteria andFjytIsNull() {
            addCriterion("fjyt is null");
            return (Criteria) this;
        }

        public Criteria andFjytIsNotNull() {
            addCriterion("fjyt is not null");
            return (Criteria) this;
        }

        public Criteria andFjytEqualTo(Long value) {
            addCriterion("fjyt =", value, "fjyt");
            return (Criteria) this;
        }

        public Criteria andFjytNotEqualTo(Long value) {
            addCriterion("fjyt <>", value, "fjyt");
            return (Criteria) this;
        }

        public Criteria andFjytGreaterThan(Long value) {
            addCriterion("fjyt >", value, "fjyt");
            return (Criteria) this;
        }

        public Criteria andFjytGreaterThanOrEqualTo(Long value) {
            addCriterion("fjyt >=", value, "fjyt");
            return (Criteria) this;
        }

        public Criteria andFjytLessThan(Long value) {
            addCriterion("fjyt <", value, "fjyt");
            return (Criteria) this;
        }

        public Criteria andFjytLessThanOrEqualTo(Long value) {
            addCriterion("fjyt <=", value, "fjyt");
            return (Criteria) this;
        }

        public Criteria andFjytIn(List<Long> values) {
            addCriterion("fjyt in", values, "fjyt");
            return (Criteria) this;
        }

        public Criteria andFjytNotIn(List<Long> values) {
            addCriterion("fjyt not in", values, "fjyt");
            return (Criteria) this;
        }

        public Criteria andFjytBetween(Long value1, Long value2) {
            addCriterion("fjyt between", value1, value2, "fjyt");
            return (Criteria) this;
        }

        public Criteria andFjytNotBetween(Long value1, Long value2) {
            addCriterion("fjyt not between", value1, value2, "fjyt");
            return (Criteria) this;
        }

        public Criteria andFjnrIsNull() {
            addCriterion("fjnr is null");
            return (Criteria) this;
        }

        public Criteria andFjnrIsNotNull() {
            addCriterion("fjnr is not null");
            return (Criteria) this;
        }

        public Criteria andFjnrEqualTo(String value) {
            addCriterion("fjnr =", value, "fjnr");
            return (Criteria) this;
        }

        public Criteria andFjnrNotEqualTo(String value) {
            addCriterion("fjnr <>", value, "fjnr");
            return (Criteria) this;
        }

        public Criteria andFjnrGreaterThan(String value) {
            addCriterion("fjnr >", value, "fjnr");
            return (Criteria) this;
        }

        public Criteria andFjnrGreaterThanOrEqualTo(String value) {
            addCriterion("fjnr >=", value, "fjnr");
            return (Criteria) this;
        }

        public Criteria andFjnrLessThan(String value) {
            addCriterion("fjnr <", value, "fjnr");
            return (Criteria) this;
        }

        public Criteria andFjnrLessThanOrEqualTo(String value) {
            addCriterion("fjnr <=", value, "fjnr");
            return (Criteria) this;
        }

        public Criteria andFjnrLike(String value) {
            addCriterion("fjnr like", value, "fjnr");
            return (Criteria) this;
        }

        public Criteria andFjnrNotLike(String value) {
            addCriterion("fjnr not like", value, "fjnr");
            return (Criteria) this;
        }

        public Criteria andFjnrIn(List<String> values) {
            addCriterion("fjnr in", values, "fjnr");
            return (Criteria) this;
        }

        public Criteria andFjnrNotIn(List<String> values) {
            addCriterion("fjnr not in", values, "fjnr");
            return (Criteria) this;
        }

        public Criteria andFjnrBetween(String value1, String value2) {
            addCriterion("fjnr between", value1, value2, "fjnr");
            return (Criteria) this;
        }

        public Criteria andFjnrNotBetween(String value1, String value2) {
            addCriterion("fjnr not between", value1, value2, "fjnr");
            return (Criteria) this;
        }

        public Criteria andFjssdxSsdxlxIsNull() {
            addCriterion("fjssdx_ssdxlx is null");
            return (Criteria) this;
        }

        public Criteria andFjssdxSsdxlxIsNotNull() {
            addCriterion("fjssdx_ssdxlx is not null");
            return (Criteria) this;
        }

        public Criteria andFjssdxSsdxlxEqualTo(Long value) {
            addCriterion("fjssdx_ssdxlx =", value, "fjssdxSsdxlx");
            return (Criteria) this;
        }

        public Criteria andFjssdxSsdxlxNotEqualTo(Long value) {
            addCriterion("fjssdx_ssdxlx <>", value, "fjssdxSsdxlx");
            return (Criteria) this;
        }

        public Criteria andFjssdxSsdxlxGreaterThan(Long value) {
            addCriterion("fjssdx_ssdxlx >", value, "fjssdxSsdxlx");
            return (Criteria) this;
        }

        public Criteria andFjssdxSsdxlxGreaterThanOrEqualTo(Long value) {
            addCriterion("fjssdx_ssdxlx >=", value, "fjssdxSsdxlx");
            return (Criteria) this;
        }

        public Criteria andFjssdxSsdxlxLessThan(Long value) {
            addCriterion("fjssdx_ssdxlx <", value, "fjssdxSsdxlx");
            return (Criteria) this;
        }

        public Criteria andFjssdxSsdxlxLessThanOrEqualTo(Long value) {
            addCriterion("fjssdx_ssdxlx <=", value, "fjssdxSsdxlx");
            return (Criteria) this;
        }

        public Criteria andFjssdxSsdxlxIn(List<Long> values) {
            addCriterion("fjssdx_ssdxlx in", values, "fjssdxSsdxlx");
            return (Criteria) this;
        }

        public Criteria andFjssdxSsdxlxNotIn(List<Long> values) {
            addCriterion("fjssdx_ssdxlx not in", values, "fjssdxSsdxlx");
            return (Criteria) this;
        }

        public Criteria andFjssdxSsdxlxBetween(Long value1, Long value2) {
            addCriterion("fjssdx_ssdxlx between", value1, value2, "fjssdxSsdxlx");
            return (Criteria) this;
        }

        public Criteria andFjssdxSsdxlxNotBetween(Long value1, Long value2) {
            addCriterion("fjssdx_ssdxlx not between", value1, value2, "fjssdxSsdxlx");
            return (Criteria) this;
        }

        public Criteria andFjssdxSsdxbsIsNull() {
            addCriterion("fjssdx_ssdxbs is null");
            return (Criteria) this;
        }

        public Criteria andFjssdxSsdxbsIsNotNull() {
            addCriterion("fjssdx_ssdxbs is not null");
            return (Criteria) this;
        }

        public Criteria andFjssdxSsdxbsEqualTo(String value) {
            addCriterion("fjssdx_ssdxbs =", value, "fjssdxSsdxbs");
            return (Criteria) this;
        }

        public Criteria andFjssdxSsdxbsNotEqualTo(String value) {
            addCriterion("fjssdx_ssdxbs <>", value, "fjssdxSsdxbs");
            return (Criteria) this;
        }

        public Criteria andFjssdxSsdxbsGreaterThan(String value) {
            addCriterion("fjssdx_ssdxbs >", value, "fjssdxSsdxbs");
            return (Criteria) this;
        }

        public Criteria andFjssdxSsdxbsGreaterThanOrEqualTo(String value) {
            addCriterion("fjssdx_ssdxbs >=", value, "fjssdxSsdxbs");
            return (Criteria) this;
        }

        public Criteria andFjssdxSsdxbsLessThan(String value) {
            addCriterion("fjssdx_ssdxbs <", value, "fjssdxSsdxbs");
            return (Criteria) this;
        }

        public Criteria andFjssdxSsdxbsLessThanOrEqualTo(String value) {
            addCriterion("fjssdx_ssdxbs <=", value, "fjssdxSsdxbs");
            return (Criteria) this;
        }

        public Criteria andFjssdxSsdxbsLike(String value) {
            addCriterion("fjssdx_ssdxbs like", value, "fjssdxSsdxbs");
            return (Criteria) this;
        }

        public Criteria andFjssdxSsdxbsNotLike(String value) {
            addCriterion("fjssdx_ssdxbs not like", value, "fjssdxSsdxbs");
            return (Criteria) this;
        }

        public Criteria andFjssdxSsdxbsIn(List<String> values) {
            addCriterion("fjssdx_ssdxbs in", values, "fjssdxSsdxbs");
            return (Criteria) this;
        }

        public Criteria andFjssdxSsdxbsNotIn(List<String> values) {
            addCriterion("fjssdx_ssdxbs not in", values, "fjssdxSsdxbs");
            return (Criteria) this;
        }

        public Criteria andFjssdxSsdxbsBetween(String value1, String value2) {
            addCriterion("fjssdx_ssdxbs between", value1, value2, "fjssdxSsdxbs");
            return (Criteria) this;
        }

        public Criteria andFjssdxSsdxbsNotBetween(String value1, String value2) {
            addCriterion("fjssdx_ssdxbs not between", value1, value2, "fjssdxSsdxbs");
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