package com.lix7.bossserver.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TcFilingsServiceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TcFilingsServiceExample() {
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

        public Criteria andNrlxIdIsNull() {
            addCriterion("nrlx_id is null");
            return (Criteria) this;
        }

        public Criteria andNrlxIdIsNotNull() {
            addCriterion("nrlx_id is not null");
            return (Criteria) this;
        }

        public Criteria andNrlxIdEqualTo(Long value) {
            addCriterion("nrlx_id =", value, "nrlxId");
            return (Criteria) this;
        }

        public Criteria andNrlxIdNotEqualTo(Long value) {
            addCriterion("nrlx_id <>", value, "nrlxId");
            return (Criteria) this;
        }

        public Criteria andNrlxIdGreaterThan(Long value) {
            addCriterion("nrlx_id >", value, "nrlxId");
            return (Criteria) this;
        }

        public Criteria andNrlxIdGreaterThanOrEqualTo(Long value) {
            addCriterion("nrlx_id >=", value, "nrlxId");
            return (Criteria) this;
        }

        public Criteria andNrlxIdLessThan(Long value) {
            addCriterion("nrlx_id <", value, "nrlxId");
            return (Criteria) this;
        }

        public Criteria andNrlxIdLessThanOrEqualTo(Long value) {
            addCriterion("nrlx_id <=", value, "nrlxId");
            return (Criteria) this;
        }

        public Criteria andNrlxIdIn(List<Long> values) {
            addCriterion("nrlx_id in", values, "nrlxId");
            return (Criteria) this;
        }

        public Criteria andNrlxIdNotIn(List<Long> values) {
            addCriterion("nrlx_id not in", values, "nrlxId");
            return (Criteria) this;
        }

        public Criteria andNrlxIdBetween(Long value1, Long value2) {
            addCriterion("nrlx_id between", value1, value2, "nrlxId");
            return (Criteria) this;
        }

        public Criteria andNrlxIdNotBetween(Long value1, Long value2) {
            addCriterion("nrlx_id not between", value1, value2, "nrlxId");
            return (Criteria) this;
        }

        public Criteria andNrlxQzsphIsNull() {
            addCriterion("nrlx_qzsph is null");
            return (Criteria) this;
        }

        public Criteria andNrlxQzsphIsNotNull() {
            addCriterion("nrlx_qzsph is not null");
            return (Criteria) this;
        }

        public Criteria andNrlxQzsphEqualTo(String value) {
            addCriterion("nrlx_qzsph =", value, "nrlxQzsph");
            return (Criteria) this;
        }

        public Criteria andNrlxQzsphNotEqualTo(String value) {
            addCriterion("nrlx_qzsph <>", value, "nrlxQzsph");
            return (Criteria) this;
        }

        public Criteria andNrlxQzsphGreaterThan(String value) {
            addCriterion("nrlx_qzsph >", value, "nrlxQzsph");
            return (Criteria) this;
        }

        public Criteria andNrlxQzsphGreaterThanOrEqualTo(String value) {
            addCriterion("nrlx_qzsph >=", value, "nrlxQzsph");
            return (Criteria) this;
        }

        public Criteria andNrlxQzsphLessThan(String value) {
            addCriterion("nrlx_qzsph <", value, "nrlxQzsph");
            return (Criteria) this;
        }

        public Criteria andNrlxQzsphLessThanOrEqualTo(String value) {
            addCriterion("nrlx_qzsph <=", value, "nrlxQzsph");
            return (Criteria) this;
        }

        public Criteria andNrlxQzsphLike(String value) {
            addCriterion("nrlx_qzsph like", value, "nrlxQzsph");
            return (Criteria) this;
        }

        public Criteria andNrlxQzsphNotLike(String value) {
            addCriterion("nrlx_qzsph not like", value, "nrlxQzsph");
            return (Criteria) this;
        }

        public Criteria andNrlxQzsphIn(List<String> values) {
            addCriterion("nrlx_qzsph in", values, "nrlxQzsph");
            return (Criteria) this;
        }

        public Criteria andNrlxQzsphNotIn(List<String> values) {
            addCriterion("nrlx_qzsph not in", values, "nrlxQzsph");
            return (Criteria) this;
        }

        public Criteria andNrlxQzsphBetween(String value1, String value2) {
            addCriterion("nrlx_qzsph between", value1, value2, "nrlxQzsph");
            return (Criteria) this;
        }

        public Criteria andNrlxQzsphNotBetween(String value1, String value2) {
            addCriterion("nrlx_qzsph not between", value1, value2, "nrlxQzsph");
            return (Criteria) this;
        }

        public Criteria andNrlxSpwjIsNull() {
            addCriterion("nrlx_spwj is null");
            return (Criteria) this;
        }

        public Criteria andNrlxSpwjIsNotNull() {
            addCriterion("nrlx_spwj is not null");
            return (Criteria) this;
        }

        public Criteria andNrlxSpwjEqualTo(String value) {
            addCriterion("nrlx_spwj =", value, "nrlxSpwj");
            return (Criteria) this;
        }

        public Criteria andNrlxSpwjNotEqualTo(String value) {
            addCriterion("nrlx_spwj <>", value, "nrlxSpwj");
            return (Criteria) this;
        }

        public Criteria andNrlxSpwjGreaterThan(String value) {
            addCriterion("nrlx_spwj >", value, "nrlxSpwj");
            return (Criteria) this;
        }

        public Criteria andNrlxSpwjGreaterThanOrEqualTo(String value) {
            addCriterion("nrlx_spwj >=", value, "nrlxSpwj");
            return (Criteria) this;
        }

        public Criteria andNrlxSpwjLessThan(String value) {
            addCriterion("nrlx_spwj <", value, "nrlxSpwj");
            return (Criteria) this;
        }

        public Criteria andNrlxSpwjLessThanOrEqualTo(String value) {
            addCriterion("nrlx_spwj <=", value, "nrlxSpwj");
            return (Criteria) this;
        }

        public Criteria andNrlxSpwjLike(String value) {
            addCriterion("nrlx_spwj like", value, "nrlxSpwj");
            return (Criteria) this;
        }

        public Criteria andNrlxSpwjNotLike(String value) {
            addCriterion("nrlx_spwj not like", value, "nrlxSpwj");
            return (Criteria) this;
        }

        public Criteria andNrlxSpwjIn(List<String> values) {
            addCriterion("nrlx_spwj in", values, "nrlxSpwj");
            return (Criteria) this;
        }

        public Criteria andNrlxSpwjNotIn(List<String> values) {
            addCriterion("nrlx_spwj not in", values, "nrlxSpwj");
            return (Criteria) this;
        }

        public Criteria andNrlxSpwjBetween(String value1, String value2) {
            addCriterion("nrlx_spwj between", value1, value2, "nrlxSpwj");
            return (Criteria) this;
        }

        public Criteria andNrlxSpwjNotBetween(String value1, String value2) {
            addCriterion("nrlx_spwj not between", value1, value2, "nrlxSpwj");
            return (Criteria) this;
        }

        public Criteria andFwnrIdIsNull() {
            addCriterion("fwnr_id is null");
            return (Criteria) this;
        }

        public Criteria andFwnrIdIsNotNull() {
            addCriterion("fwnr_id is not null");
            return (Criteria) this;
        }

        public Criteria andFwnrIdEqualTo(Long value) {
            addCriterion("fwnr_id =", value, "fwnrId");
            return (Criteria) this;
        }

        public Criteria andFwnrIdNotEqualTo(Long value) {
            addCriterion("fwnr_id <>", value, "fwnrId");
            return (Criteria) this;
        }

        public Criteria andFwnrIdGreaterThan(Long value) {
            addCriterion("fwnr_id >", value, "fwnrId");
            return (Criteria) this;
        }

        public Criteria andFwnrIdGreaterThanOrEqualTo(Long value) {
            addCriterion("fwnr_id >=", value, "fwnrId");
            return (Criteria) this;
        }

        public Criteria andFwnrIdLessThan(Long value) {
            addCriterion("fwnr_id <", value, "fwnrId");
            return (Criteria) this;
        }

        public Criteria andFwnrIdLessThanOrEqualTo(Long value) {
            addCriterion("fwnr_id <=", value, "fwnrId");
            return (Criteria) this;
        }

        public Criteria andFwnrIdIn(List<Long> values) {
            addCriterion("fwnr_id in", values, "fwnrId");
            return (Criteria) this;
        }

        public Criteria andFwnrIdNotIn(List<Long> values) {
            addCriterion("fwnr_id not in", values, "fwnrId");
            return (Criteria) this;
        }

        public Criteria andFwnrIdBetween(Long value1, Long value2) {
            addCriterion("fwnr_id between", value1, value2, "fwnrId");
            return (Criteria) this;
        }

        public Criteria andFwnrIdNotBetween(Long value1, Long value2) {
            addCriterion("fwnr_id not between", value1, value2, "fwnrId");
            return (Criteria) this;
        }

        public Criteria andYylbIdIsNull() {
            addCriterion("yylb_id is null");
            return (Criteria) this;
        }

        public Criteria andYylbIdIsNotNull() {
            addCriterion("yylb_id is not null");
            return (Criteria) this;
        }

        public Criteria andYylbIdEqualTo(Long value) {
            addCriterion("yylb_id =", value, "yylbId");
            return (Criteria) this;
        }

        public Criteria andYylbIdNotEqualTo(Long value) {
            addCriterion("yylb_id <>", value, "yylbId");
            return (Criteria) this;
        }

        public Criteria andYylbIdGreaterThan(Long value) {
            addCriterion("yylb_id >", value, "yylbId");
            return (Criteria) this;
        }

        public Criteria andYylbIdGreaterThanOrEqualTo(Long value) {
            addCriterion("yylb_id >=", value, "yylbId");
            return (Criteria) this;
        }

        public Criteria andYylbIdLessThan(Long value) {
            addCriterion("yylb_id <", value, "yylbId");
            return (Criteria) this;
        }

        public Criteria andYylbIdLessThanOrEqualTo(Long value) {
            addCriterion("yylb_id <=", value, "yylbId");
            return (Criteria) this;
        }

        public Criteria andYylbIdIn(List<Long> values) {
            addCriterion("yylb_id in", values, "yylbId");
            return (Criteria) this;
        }

        public Criteria andYylbIdNotIn(List<Long> values) {
            addCriterion("yylb_id not in", values, "yylbId");
            return (Criteria) this;
        }

        public Criteria andYylbIdBetween(Long value1, Long value2) {
            addCriterion("yylb_id between", value1, value2, "yylbId");
            return (Criteria) this;
        }

        public Criteria andYylbIdNotBetween(Long value1, Long value2) {
            addCriterion("yylb_id not between", value1, value2, "yylbId");
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

        public Criteria andWzBzIsNull() {
            addCriterion("wz_bz is null");
            return (Criteria) this;
        }

        public Criteria andWzBzIsNotNull() {
            addCriterion("wz_bz is not null");
            return (Criteria) this;
        }

        public Criteria andWzBzEqualTo(String value) {
            addCriterion("wz_bz =", value, "wzBz");
            return (Criteria) this;
        }

        public Criteria andWzBzNotEqualTo(String value) {
            addCriterion("wz_bz <>", value, "wzBz");
            return (Criteria) this;
        }

        public Criteria andWzBzGreaterThan(String value) {
            addCriterion("wz_bz >", value, "wzBz");
            return (Criteria) this;
        }

        public Criteria andWzBzGreaterThanOrEqualTo(String value) {
            addCriterion("wz_bz >=", value, "wzBz");
            return (Criteria) this;
        }

        public Criteria andWzBzLessThan(String value) {
            addCriterion("wz_bz <", value, "wzBz");
            return (Criteria) this;
        }

        public Criteria andWzBzLessThanOrEqualTo(String value) {
            addCriterion("wz_bz <=", value, "wzBz");
            return (Criteria) this;
        }

        public Criteria andWzBzLike(String value) {
            addCriterion("wz_bz like", value, "wzBz");
            return (Criteria) this;
        }

        public Criteria andWzBzNotLike(String value) {
            addCriterion("wz_bz not like", value, "wzBz");
            return (Criteria) this;
        }

        public Criteria andWzBzIn(List<String> values) {
            addCriterion("wz_bz in", values, "wzBz");
            return (Criteria) this;
        }

        public Criteria andWzBzNotIn(List<String> values) {
            addCriterion("wz_bz not in", values, "wzBz");
            return (Criteria) this;
        }

        public Criteria andWzBzBetween(String value1, String value2) {
            addCriterion("wz_bz between", value1, value2, "wzBz");
            return (Criteria) this;
        }

        public Criteria andWzBzNotBetween(String value1, String value2) {
            addCriterion("wz_bz not between", value1, value2, "wzBz");
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