package com.lix7.bossserver.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TcFilingsBasicExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TcFilingsBasicExample() {
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

        public Criteria andDmsIdIsNull() {
            addCriterion("dms_id is null");
            return (Criteria) this;
        }

        public Criteria andDmsIdIsNotNull() {
            addCriterion("dms_id is not null");
            return (Criteria) this;
        }

        public Criteria andDmsIdEqualTo(Long value) {
            addCriterion("dms_id =", value, "dmsId");
            return (Criteria) this;
        }

        public Criteria andDmsIdNotEqualTo(Long value) {
            addCriterion("dms_id <>", value, "dmsId");
            return (Criteria) this;
        }

        public Criteria andDmsIdGreaterThan(Long value) {
            addCriterion("dms_id >", value, "dmsId");
            return (Criteria) this;
        }

        public Criteria andDmsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("dms_id >=", value, "dmsId");
            return (Criteria) this;
        }

        public Criteria andDmsIdLessThan(Long value) {
            addCriterion("dms_id <", value, "dmsId");
            return (Criteria) this;
        }

        public Criteria andDmsIdLessThanOrEqualTo(Long value) {
            addCriterion("dms_id <=", value, "dmsId");
            return (Criteria) this;
        }

        public Criteria andDmsIdIn(List<Long> values) {
            addCriterion("dms_id in", values, "dmsId");
            return (Criteria) this;
        }

        public Criteria andDmsIdNotIn(List<Long> values) {
            addCriterion("dms_id not in", values, "dmsId");
            return (Criteria) this;
        }

        public Criteria andDmsIdBetween(Long value1, Long value2) {
            addCriterion("dms_id between", value1, value2, "dmsId");
            return (Criteria) this;
        }

        public Criteria andDmsIdNotBetween(Long value1, Long value2) {
            addCriterion("dms_id not between", value1, value2, "dmsId");
            return (Criteria) this;
        }

        public Criteria andYsidIsNull() {
            addCriterion("ysid is null");
            return (Criteria) this;
        }

        public Criteria andYsidIsNotNull() {
            addCriterion("ysid is not null");
            return (Criteria) this;
        }

        public Criteria andYsidEqualTo(Long value) {
            addCriterion("ysid =", value, "ysid");
            return (Criteria) this;
        }

        public Criteria andYsidNotEqualTo(Long value) {
            addCriterion("ysid <>", value, "ysid");
            return (Criteria) this;
        }

        public Criteria andYsidGreaterThan(Long value) {
            addCriterion("ysid >", value, "ysid");
            return (Criteria) this;
        }

        public Criteria andYsidGreaterThanOrEqualTo(Long value) {
            addCriterion("ysid >=", value, "ysid");
            return (Criteria) this;
        }

        public Criteria andYsidLessThan(Long value) {
            addCriterion("ysid <", value, "ysid");
            return (Criteria) this;
        }

        public Criteria andYsidLessThanOrEqualTo(Long value) {
            addCriterion("ysid <=", value, "ysid");
            return (Criteria) this;
        }

        public Criteria andYsidIn(List<Long> values) {
            addCriterion("ysid in", values, "ysid");
            return (Criteria) this;
        }

        public Criteria andYsidNotIn(List<Long> values) {
            addCriterion("ysid not in", values, "ysid");
            return (Criteria) this;
        }

        public Criteria andYsidBetween(Long value1, Long value2) {
            addCriterion("ysid between", value1, value2, "ysid");
            return (Criteria) this;
        }

        public Criteria andYsidNotBetween(Long value1, Long value2) {
            addCriterion("ysid not between", value1, value2, "ysid");
            return (Criteria) this;
        }

        public Criteria andBmIsNull() {
            addCriterion("bm is null");
            return (Criteria) this;
        }

        public Criteria andBmIsNotNull() {
            addCriterion("bm is not null");
            return (Criteria) this;
        }

        public Criteria andBmEqualTo(String value) {
            addCriterion("bm =", value, "bm");
            return (Criteria) this;
        }

        public Criteria andBmNotEqualTo(String value) {
            addCriterion("bm <>", value, "bm");
            return (Criteria) this;
        }

        public Criteria andBmGreaterThan(String value) {
            addCriterion("bm >", value, "bm");
            return (Criteria) this;
        }

        public Criteria andBmGreaterThanOrEqualTo(String value) {
            addCriterion("bm >=", value, "bm");
            return (Criteria) this;
        }

        public Criteria andBmLessThan(String value) {
            addCriterion("bm <", value, "bm");
            return (Criteria) this;
        }

        public Criteria andBmLessThanOrEqualTo(String value) {
            addCriterion("bm <=", value, "bm");
            return (Criteria) this;
        }

        public Criteria andBmLike(String value) {
            addCriterion("bm like", value, "bm");
            return (Criteria) this;
        }

        public Criteria andBmNotLike(String value) {
            addCriterion("bm not like", value, "bm");
            return (Criteria) this;
        }

        public Criteria andBmIn(List<String> values) {
            addCriterion("bm in", values, "bm");
            return (Criteria) this;
        }

        public Criteria andBmNotIn(List<String> values) {
            addCriterion("bm not in", values, "bm");
            return (Criteria) this;
        }

        public Criteria andBmBetween(String value1, String value2) {
            addCriterion("bm between", value1, value2, "bm");
            return (Criteria) this;
        }

        public Criteria andBmNotBetween(String value1, String value2) {
            addCriterion("bm not between", value1, value2, "bm");
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

        public Criteria andShengjcIsNull() {
            addCriterion("shengjc is null");
            return (Criteria) this;
        }

        public Criteria andShengjcIsNotNull() {
            addCriterion("shengjc is not null");
            return (Criteria) this;
        }

        public Criteria andShengjcEqualTo(String value) {
            addCriterion("shengjc =", value, "shengjc");
            return (Criteria) this;
        }

        public Criteria andShengjcNotEqualTo(String value) {
            addCriterion("shengjc <>", value, "shengjc");
            return (Criteria) this;
        }

        public Criteria andShengjcGreaterThan(String value) {
            addCriterion("shengjc >", value, "shengjc");
            return (Criteria) this;
        }

        public Criteria andShengjcGreaterThanOrEqualTo(String value) {
            addCriterion("shengjc >=", value, "shengjc");
            return (Criteria) this;
        }

        public Criteria andShengjcLessThan(String value) {
            addCriterion("shengjc <", value, "shengjc");
            return (Criteria) this;
        }

        public Criteria andShengjcLessThanOrEqualTo(String value) {
            addCriterion("shengjc <=", value, "shengjc");
            return (Criteria) this;
        }

        public Criteria andShengjcLike(String value) {
            addCriterion("shengjc like", value, "shengjc");
            return (Criteria) this;
        }

        public Criteria andShengjcNotLike(String value) {
            addCriterion("shengjc not like", value, "shengjc");
            return (Criteria) this;
        }

        public Criteria andShengjcIn(List<String> values) {
            addCriterion("shengjc in", values, "shengjc");
            return (Criteria) this;
        }

        public Criteria andShengjcNotIn(List<String> values) {
            addCriterion("shengjc not in", values, "shengjc");
            return (Criteria) this;
        }

        public Criteria andShengjcBetween(String value1, String value2) {
            addCriterion("shengjc between", value1, value2, "shengjc");
            return (Criteria) this;
        }

        public Criteria andShengjcNotBetween(String value1, String value2) {
            addCriterion("shengjc not between", value1, value2, "shengjc");
            return (Criteria) this;
        }

        public Criteria andDwflidIsNull() {
            addCriterion("dwflid is null");
            return (Criteria) this;
        }

        public Criteria andDwflidIsNotNull() {
            addCriterion("dwflid is not null");
            return (Criteria) this;
        }

        public Criteria andDwflidEqualTo(Long value) {
            addCriterion("dwflid =", value, "dwflid");
            return (Criteria) this;
        }

        public Criteria andDwflidNotEqualTo(Long value) {
            addCriterion("dwflid <>", value, "dwflid");
            return (Criteria) this;
        }

        public Criteria andDwflidGreaterThan(Long value) {
            addCriterion("dwflid >", value, "dwflid");
            return (Criteria) this;
        }

        public Criteria andDwflidGreaterThanOrEqualTo(Long value) {
            addCriterion("dwflid >=", value, "dwflid");
            return (Criteria) this;
        }

        public Criteria andDwflidLessThan(Long value) {
            addCriterion("dwflid <", value, "dwflid");
            return (Criteria) this;
        }

        public Criteria andDwflidLessThanOrEqualTo(Long value) {
            addCriterion("dwflid <=", value, "dwflid");
            return (Criteria) this;
        }

        public Criteria andDwflidIn(List<Long> values) {
            addCriterion("dwflid in", values, "dwflid");
            return (Criteria) this;
        }

        public Criteria andDwflidNotIn(List<Long> values) {
            addCriterion("dwflid not in", values, "dwflid");
            return (Criteria) this;
        }

        public Criteria andDwflidBetween(Long value1, Long value2) {
            addCriterion("dwflid between", value1, value2, "dwflid");
            return (Criteria) this;
        }

        public Criteria andDwflidNotBetween(Long value1, Long value2) {
            addCriterion("dwflid not between", value1, value2, "dwflid");
            return (Criteria) this;
        }

        public Criteria andPidIsNull() {
            addCriterion("pid is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("pid is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(Long value) {
            addCriterion("pid =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(Long value) {
            addCriterion("pid <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(Long value) {
            addCriterion("pid >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(Long value) {
            addCriterion("pid >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(Long value) {
            addCriterion("pid <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(Long value) {
            addCriterion("pid <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<Long> values) {
            addCriterion("pid in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<Long> values) {
            addCriterion("pid not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(Long value1, Long value2) {
            addCriterion("pid between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(Long value1, Long value2) {
            addCriterion("pid not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andMcIsNull() {
            addCriterion("mc is null");
            return (Criteria) this;
        }

        public Criteria andMcIsNotNull() {
            addCriterion("mc is not null");
            return (Criteria) this;
        }

        public Criteria andMcEqualTo(String value) {
            addCriterion("mc =", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcNotEqualTo(String value) {
            addCriterion("mc <>", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcGreaterThan(String value) {
            addCriterion("mc >", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcGreaterThanOrEqualTo(String value) {
            addCriterion("mc >=", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcLessThan(String value) {
            addCriterion("mc <", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcLessThanOrEqualTo(String value) {
            addCriterion("mc <=", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcLike(String value) {
            addCriterion("mc like", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcNotLike(String value) {
            addCriterion("mc not like", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcIn(List<String> values) {
            addCriterion("mc in", values, "mc");
            return (Criteria) this;
        }

        public Criteria andMcNotIn(List<String> values) {
            addCriterion("mc not in", values, "mc");
            return (Criteria) this;
        }

        public Criteria andMcBetween(String value1, String value2) {
            addCriterion("mc between", value1, value2, "mc");
            return (Criteria) this;
        }

        public Criteria andMcNotBetween(String value1, String value2) {
            addCriterion("mc not between", value1, value2, "mc");
            return (Criteria) this;
        }

        public Criteria andSsdxlxIsNull() {
            addCriterion("ssdxlx is null");
            return (Criteria) this;
        }

        public Criteria andSsdxlxIsNotNull() {
            addCriterion("ssdxlx is not null");
            return (Criteria) this;
        }

        public Criteria andSsdxlxEqualTo(Long value) {
            addCriterion("ssdxlx =", value, "ssdxlx");
            return (Criteria) this;
        }

        public Criteria andSsdxlxNotEqualTo(Long value) {
            addCriterion("ssdxlx <>", value, "ssdxlx");
            return (Criteria) this;
        }

        public Criteria andSsdxlxGreaterThan(Long value) {
            addCriterion("ssdxlx >", value, "ssdxlx");
            return (Criteria) this;
        }

        public Criteria andSsdxlxGreaterThanOrEqualTo(Long value) {
            addCriterion("ssdxlx >=", value, "ssdxlx");
            return (Criteria) this;
        }

        public Criteria andSsdxlxLessThan(Long value) {
            addCriterion("ssdxlx <", value, "ssdxlx");
            return (Criteria) this;
        }

        public Criteria andSsdxlxLessThanOrEqualTo(Long value) {
            addCriterion("ssdxlx <=", value, "ssdxlx");
            return (Criteria) this;
        }

        public Criteria andSsdxlxIn(List<Long> values) {
            addCriterion("ssdxlx in", values, "ssdxlx");
            return (Criteria) this;
        }

        public Criteria andSsdxlxNotIn(List<Long> values) {
            addCriterion("ssdxlx not in", values, "ssdxlx");
            return (Criteria) this;
        }

        public Criteria andSsdxlxBetween(Long value1, Long value2) {
            addCriterion("ssdxlx between", value1, value2, "ssdxlx");
            return (Criteria) this;
        }

        public Criteria andSsdxlxNotBetween(Long value1, Long value2) {
            addCriterion("ssdxlx not between", value1, value2, "ssdxlx");
            return (Criteria) this;
        }

        public Criteria andSfqzspIsNull() {
            addCriterion("sfqzsp is null");
            return (Criteria) this;
        }

        public Criteria andSfqzspIsNotNull() {
            addCriterion("sfqzsp is not null");
            return (Criteria) this;
        }

        public Criteria andSfqzspEqualTo(Long value) {
            addCriterion("sfqzsp =", value, "sfqzsp");
            return (Criteria) this;
        }

        public Criteria andSfqzspNotEqualTo(Long value) {
            addCriterion("sfqzsp <>", value, "sfqzsp");
            return (Criteria) this;
        }

        public Criteria andSfqzspGreaterThan(Long value) {
            addCriterion("sfqzsp >", value, "sfqzsp");
            return (Criteria) this;
        }

        public Criteria andSfqzspGreaterThanOrEqualTo(Long value) {
            addCriterion("sfqzsp >=", value, "sfqzsp");
            return (Criteria) this;
        }

        public Criteria andSfqzspLessThan(Long value) {
            addCriterion("sfqzsp <", value, "sfqzsp");
            return (Criteria) this;
        }

        public Criteria andSfqzspLessThanOrEqualTo(Long value) {
            addCriterion("sfqzsp <=", value, "sfqzsp");
            return (Criteria) this;
        }

        public Criteria andSfqzspIn(List<Long> values) {
            addCriterion("sfqzsp in", values, "sfqzsp");
            return (Criteria) this;
        }

        public Criteria andSfqzspNotIn(List<Long> values) {
            addCriterion("sfqzsp not in", values, "sfqzsp");
            return (Criteria) this;
        }

        public Criteria andSfqzspBetween(Long value1, Long value2) {
            addCriterion("sfqzsp between", value1, value2, "sfqzsp");
            return (Criteria) this;
        }

        public Criteria andSfqzspNotBetween(Long value1, Long value2) {
            addCriterion("sfqzsp not between", value1, value2, "sfqzsp");
            return (Criteria) this;
        }

        public Criteria andLxIsNull() {
            addCriterion("lx is null");
            return (Criteria) this;
        }

        public Criteria andLxIsNotNull() {
            addCriterion("lx is not null");
            return (Criteria) this;
        }

        public Criteria andLxEqualTo(Long value) {
            addCriterion("lx =", value, "lx");
            return (Criteria) this;
        }

        public Criteria andLxNotEqualTo(Long value) {
            addCriterion("lx <>", value, "lx");
            return (Criteria) this;
        }

        public Criteria andLxGreaterThan(Long value) {
            addCriterion("lx >", value, "lx");
            return (Criteria) this;
        }

        public Criteria andLxGreaterThanOrEqualTo(Long value) {
            addCriterion("lx >=", value, "lx");
            return (Criteria) this;
        }

        public Criteria andLxLessThan(Long value) {
            addCriterion("lx <", value, "lx");
            return (Criteria) this;
        }

        public Criteria andLxLessThanOrEqualTo(Long value) {
            addCriterion("lx <=", value, "lx");
            return (Criteria) this;
        }

        public Criteria andLxIn(List<Long> values) {
            addCriterion("lx in", values, "lx");
            return (Criteria) this;
        }

        public Criteria andLxNotIn(List<Long> values) {
            addCriterion("lx not in", values, "lx");
            return (Criteria) this;
        }

        public Criteria andLxBetween(Long value1, Long value2) {
            addCriterion("lx between", value1, value2, "lx");
            return (Criteria) this;
        }

        public Criteria andLxNotBetween(Long value1, Long value2) {
            addCriterion("lx not between", value1, value2, "lx");
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

        public Criteria andSfyxIsNull() {
            addCriterion("sfyx is null");
            return (Criteria) this;
        }

        public Criteria andSfyxIsNotNull() {
            addCriterion("sfyx is not null");
            return (Criteria) this;
        }

        public Criteria andSfyxEqualTo(Long value) {
            addCriterion("sfyx =", value, "sfyx");
            return (Criteria) this;
        }

        public Criteria andSfyxNotEqualTo(Long value) {
            addCriterion("sfyx <>", value, "sfyx");
            return (Criteria) this;
        }

        public Criteria andSfyxGreaterThan(Long value) {
            addCriterion("sfyx >", value, "sfyx");
            return (Criteria) this;
        }

        public Criteria andSfyxGreaterThanOrEqualTo(Long value) {
            addCriterion("sfyx >=", value, "sfyx");
            return (Criteria) this;
        }

        public Criteria andSfyxLessThan(Long value) {
            addCriterion("sfyx <", value, "sfyx");
            return (Criteria) this;
        }

        public Criteria andSfyxLessThanOrEqualTo(Long value) {
            addCriterion("sfyx <=", value, "sfyx");
            return (Criteria) this;
        }

        public Criteria andSfyxIn(List<Long> values) {
            addCriterion("sfyx in", values, "sfyx");
            return (Criteria) this;
        }

        public Criteria andSfyxNotIn(List<Long> values) {
            addCriterion("sfyx not in", values, "sfyx");
            return (Criteria) this;
        }

        public Criteria andSfyxBetween(Long value1, Long value2) {
            addCriterion("sfyx between", value1, value2, "sfyx");
            return (Criteria) this;
        }

        public Criteria andSfyxNotBetween(Long value1, Long value2) {
            addCriterion("sfyx not between", value1, value2, "sfyx");
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

        public Criteria andVersionEqualTo(String value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(String value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(String value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(String value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(String value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(String value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLike(String value) {
            addCriterion("version like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotLike(String value) {
            addCriterion("version not like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<String> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<String> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(String value1, String value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(String value1, String value2) {
            addCriterion("version not between", value1, value2, "version");
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