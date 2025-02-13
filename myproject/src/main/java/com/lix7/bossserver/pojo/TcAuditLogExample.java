package com.lix7.bossserver.pojo;

import java.util.ArrayList;
import java.util.List;

public class TcAuditLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TcAuditLogExample() {
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

        public Criteria andEventidIsNull() {
            addCriterion("EventId is null");
            return (Criteria) this;
        }

        public Criteria andEventidIsNotNull() {
            addCriterion("EventId is not null");
            return (Criteria) this;
        }

        public Criteria andEventidEqualTo(String value) {
            addCriterion("EventId =", value, "eventid");
            return (Criteria) this;
        }

        public Criteria andEventidNotEqualTo(String value) {
            addCriterion("EventId <>", value, "eventid");
            return (Criteria) this;
        }

        public Criteria andEventidGreaterThan(String value) {
            addCriterion("EventId >", value, "eventid");
            return (Criteria) this;
        }

        public Criteria andEventidGreaterThanOrEqualTo(String value) {
            addCriterion("EventId >=", value, "eventid");
            return (Criteria) this;
        }

        public Criteria andEventidLessThan(String value) {
            addCriterion("EventId <", value, "eventid");
            return (Criteria) this;
        }

        public Criteria andEventidLessThanOrEqualTo(String value) {
            addCriterion("EventId <=", value, "eventid");
            return (Criteria) this;
        }

        public Criteria andEventidLike(String value) {
            addCriterion("EventId like", value, "eventid");
            return (Criteria) this;
        }

        public Criteria andEventidNotLike(String value) {
            addCriterion("EventId not like", value, "eventid");
            return (Criteria) this;
        }

        public Criteria andEventidIn(List<String> values) {
            addCriterion("EventId in", values, "eventid");
            return (Criteria) this;
        }

        public Criteria andEventidNotIn(List<String> values) {
            addCriterion("EventId not in", values, "eventid");
            return (Criteria) this;
        }

        public Criteria andEventidBetween(String value1, String value2) {
            addCriterion("EventId between", value1, value2, "eventid");
            return (Criteria) this;
        }

        public Criteria andEventidNotBetween(String value1, String value2) {
            addCriterion("EventId not between", value1, value2, "eventid");
            return (Criteria) this;
        }

        public Criteria andTimestampIsNull() {
            addCriterion("Timestamp is null");
            return (Criteria) this;
        }

        public Criteria andTimestampIsNotNull() {
            addCriterion("Timestamp is not null");
            return (Criteria) this;
        }

        public Criteria andTimestampEqualTo(Long value) {
            addCriterion("Timestamp =", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampNotEqualTo(Long value) {
            addCriterion("Timestamp <>", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampGreaterThan(Long value) {
            addCriterion("Timestamp >", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampGreaterThanOrEqualTo(Long value) {
            addCriterion("Timestamp >=", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampLessThan(Long value) {
            addCriterion("Timestamp <", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampLessThanOrEqualTo(Long value) {
            addCriterion("Timestamp <=", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampIn(List<Long> values) {
            addCriterion("Timestamp in", values, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampNotIn(List<Long> values) {
            addCriterion("Timestamp not in", values, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampBetween(Long value1, Long value2) {
            addCriterion("Timestamp between", value1, value2, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampNotBetween(Long value1, Long value2) {
            addCriterion("Timestamp not between", value1, value2, "timestamp");
            return (Criteria) this;
        }

        public Criteria andSystemnameIsNull() {
            addCriterion("SystemName is null");
            return (Criteria) this;
        }

        public Criteria andSystemnameIsNotNull() {
            addCriterion("SystemName is not null");
            return (Criteria) this;
        }

        public Criteria andSystemnameEqualTo(String value) {
            addCriterion("SystemName =", value, "systemname");
            return (Criteria) this;
        }

        public Criteria andSystemnameNotEqualTo(String value) {
            addCriterion("SystemName <>", value, "systemname");
            return (Criteria) this;
        }

        public Criteria andSystemnameGreaterThan(String value) {
            addCriterion("SystemName >", value, "systemname");
            return (Criteria) this;
        }

        public Criteria andSystemnameGreaterThanOrEqualTo(String value) {
            addCriterion("SystemName >=", value, "systemname");
            return (Criteria) this;
        }

        public Criteria andSystemnameLessThan(String value) {
            addCriterion("SystemName <", value, "systemname");
            return (Criteria) this;
        }

        public Criteria andSystemnameLessThanOrEqualTo(String value) {
            addCriterion("SystemName <=", value, "systemname");
            return (Criteria) this;
        }

        public Criteria andSystemnameLike(String value) {
            addCriterion("SystemName like", value, "systemname");
            return (Criteria) this;
        }

        public Criteria andSystemnameNotLike(String value) {
            addCriterion("SystemName not like", value, "systemname");
            return (Criteria) this;
        }

        public Criteria andSystemnameIn(List<String> values) {
            addCriterion("SystemName in", values, "systemname");
            return (Criteria) this;
        }

        public Criteria andSystemnameNotIn(List<String> values) {
            addCriterion("SystemName not in", values, "systemname");
            return (Criteria) this;
        }

        public Criteria andSystemnameBetween(String value1, String value2) {
            addCriterion("SystemName between", value1, value2, "systemname");
            return (Criteria) this;
        }

        public Criteria andSystemnameNotBetween(String value1, String value2) {
            addCriterion("SystemName not between", value1, value2, "systemname");
            return (Criteria) this;
        }

        public Criteria andHostIsNull() {
            addCriterion("Host is null");
            return (Criteria) this;
        }

        public Criteria andHostIsNotNull() {
            addCriterion("Host is not null");
            return (Criteria) this;
        }

        public Criteria andHostEqualTo(String value) {
            addCriterion("Host =", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostNotEqualTo(String value) {
            addCriterion("Host <>", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostGreaterThan(String value) {
            addCriterion("Host >", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostGreaterThanOrEqualTo(String value) {
            addCriterion("Host >=", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostLessThan(String value) {
            addCriterion("Host <", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostLessThanOrEqualTo(String value) {
            addCriterion("Host <=", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostLike(String value) {
            addCriterion("Host like", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostNotLike(String value) {
            addCriterion("Host not like", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostIn(List<String> values) {
            addCriterion("Host in", values, "host");
            return (Criteria) this;
        }

        public Criteria andHostNotIn(List<String> values) {
            addCriterion("Host not in", values, "host");
            return (Criteria) this;
        }

        public Criteria andHostBetween(String value1, String value2) {
            addCriterion("Host between", value1, value2, "host");
            return (Criteria) this;
        }

        public Criteria andHostNotBetween(String value1, String value2) {
            addCriterion("Host not between", value1, value2, "host");
            return (Criteria) this;
        }

        public Criteria andSourceipIsNull() {
            addCriterion("SourceIp is null");
            return (Criteria) this;
        }

        public Criteria andSourceipIsNotNull() {
            addCriterion("SourceIp is not null");
            return (Criteria) this;
        }

        public Criteria andSourceipEqualTo(String value) {
            addCriterion("SourceIp =", value, "sourceip");
            return (Criteria) this;
        }

        public Criteria andSourceipNotEqualTo(String value) {
            addCriterion("SourceIp <>", value, "sourceip");
            return (Criteria) this;
        }

        public Criteria andSourceipGreaterThan(String value) {
            addCriterion("SourceIp >", value, "sourceip");
            return (Criteria) this;
        }

        public Criteria andSourceipGreaterThanOrEqualTo(String value) {
            addCriterion("SourceIp >=", value, "sourceip");
            return (Criteria) this;
        }

        public Criteria andSourceipLessThan(String value) {
            addCriterion("SourceIp <", value, "sourceip");
            return (Criteria) this;
        }

        public Criteria andSourceipLessThanOrEqualTo(String value) {
            addCriterion("SourceIp <=", value, "sourceip");
            return (Criteria) this;
        }

        public Criteria andSourceipLike(String value) {
            addCriterion("SourceIp like", value, "sourceip");
            return (Criteria) this;
        }

        public Criteria andSourceipNotLike(String value) {
            addCriterion("SourceIp not like", value, "sourceip");
            return (Criteria) this;
        }

        public Criteria andSourceipIn(List<String> values) {
            addCriterion("SourceIp in", values, "sourceip");
            return (Criteria) this;
        }

        public Criteria andSourceipNotIn(List<String> values) {
            addCriterion("SourceIp not in", values, "sourceip");
            return (Criteria) this;
        }

        public Criteria andSourceipBetween(String value1, String value2) {
            addCriterion("SourceIp between", value1, value2, "sourceip");
            return (Criteria) this;
        }

        public Criteria andSourceipNotBetween(String value1, String value2) {
            addCriterion("SourceIp not between", value1, value2, "sourceip");
            return (Criteria) this;
        }

        public Criteria andTargetipIsNull() {
            addCriterion("TargetIp is null");
            return (Criteria) this;
        }

        public Criteria andTargetipIsNotNull() {
            addCriterion("TargetIp is not null");
            return (Criteria) this;
        }

        public Criteria andTargetipEqualTo(String value) {
            addCriterion("TargetIp =", value, "targetip");
            return (Criteria) this;
        }

        public Criteria andTargetipNotEqualTo(String value) {
            addCriterion("TargetIp <>", value, "targetip");
            return (Criteria) this;
        }

        public Criteria andTargetipGreaterThan(String value) {
            addCriterion("TargetIp >", value, "targetip");
            return (Criteria) this;
        }

        public Criteria andTargetipGreaterThanOrEqualTo(String value) {
            addCriterion("TargetIp >=", value, "targetip");
            return (Criteria) this;
        }

        public Criteria andTargetipLessThan(String value) {
            addCriterion("TargetIp <", value, "targetip");
            return (Criteria) this;
        }

        public Criteria andTargetipLessThanOrEqualTo(String value) {
            addCriterion("TargetIp <=", value, "targetip");
            return (Criteria) this;
        }

        public Criteria andTargetipLike(String value) {
            addCriterion("TargetIp like", value, "targetip");
            return (Criteria) this;
        }

        public Criteria andTargetipNotLike(String value) {
            addCriterion("TargetIp not like", value, "targetip");
            return (Criteria) this;
        }

        public Criteria andTargetipIn(List<String> values) {
            addCriterion("TargetIp in", values, "targetip");
            return (Criteria) this;
        }

        public Criteria andTargetipNotIn(List<String> values) {
            addCriterion("TargetIp not in", values, "targetip");
            return (Criteria) this;
        }

        public Criteria andTargetipBetween(String value1, String value2) {
            addCriterion("TargetIp between", value1, value2, "targetip");
            return (Criteria) this;
        }

        public Criteria andTargetipNotBetween(String value1, String value2) {
            addCriterion("TargetIp not between", value1, value2, "targetip");
            return (Criteria) this;
        }

        public Criteria andRtxIsNull() {
            addCriterion("Rtx is null");
            return (Criteria) this;
        }

        public Criteria andRtxIsNotNull() {
            addCriterion("Rtx is not null");
            return (Criteria) this;
        }

        public Criteria andRtxEqualTo(String value) {
            addCriterion("Rtx =", value, "rtx");
            return (Criteria) this;
        }

        public Criteria andRtxNotEqualTo(String value) {
            addCriterion("Rtx <>", value, "rtx");
            return (Criteria) this;
        }

        public Criteria andRtxGreaterThan(String value) {
            addCriterion("Rtx >", value, "rtx");
            return (Criteria) this;
        }

        public Criteria andRtxGreaterThanOrEqualTo(String value) {
            addCriterion("Rtx >=", value, "rtx");
            return (Criteria) this;
        }

        public Criteria andRtxLessThan(String value) {
            addCriterion("Rtx <", value, "rtx");
            return (Criteria) this;
        }

        public Criteria andRtxLessThanOrEqualTo(String value) {
            addCriterion("Rtx <=", value, "rtx");
            return (Criteria) this;
        }

        public Criteria andRtxLike(String value) {
            addCriterion("Rtx like", value, "rtx");
            return (Criteria) this;
        }

        public Criteria andRtxNotLike(String value) {
            addCriterion("Rtx not like", value, "rtx");
            return (Criteria) this;
        }

        public Criteria andRtxIn(List<String> values) {
            addCriterion("Rtx in", values, "rtx");
            return (Criteria) this;
        }

        public Criteria andRtxNotIn(List<String> values) {
            addCriterion("Rtx not in", values, "rtx");
            return (Criteria) this;
        }

        public Criteria andRtxBetween(String value1, String value2) {
            addCriterion("Rtx between", value1, value2, "rtx");
            return (Criteria) this;
        }

        public Criteria andRtxNotBetween(String value1, String value2) {
            addCriterion("Rtx not between", value1, value2, "rtx");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("URL is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("URL is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("URL =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("URL <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("URL >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("URL >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("URL <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("URL <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("URL like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("URL not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("URL in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("URL not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("URL between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("URL not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andHttpmethodIsNull() {
            addCriterion("HTTPMethod is null");
            return (Criteria) this;
        }

        public Criteria andHttpmethodIsNotNull() {
            addCriterion("HTTPMethod is not null");
            return (Criteria) this;
        }

        public Criteria andHttpmethodEqualTo(String value) {
            addCriterion("HTTPMethod =", value, "httpmethod");
            return (Criteria) this;
        }

        public Criteria andHttpmethodNotEqualTo(String value) {
            addCriterion("HTTPMethod <>", value, "httpmethod");
            return (Criteria) this;
        }

        public Criteria andHttpmethodGreaterThan(String value) {
            addCriterion("HTTPMethod >", value, "httpmethod");
            return (Criteria) this;
        }

        public Criteria andHttpmethodGreaterThanOrEqualTo(String value) {
            addCriterion("HTTPMethod >=", value, "httpmethod");
            return (Criteria) this;
        }

        public Criteria andHttpmethodLessThan(String value) {
            addCriterion("HTTPMethod <", value, "httpmethod");
            return (Criteria) this;
        }

        public Criteria andHttpmethodLessThanOrEqualTo(String value) {
            addCriterion("HTTPMethod <=", value, "httpmethod");
            return (Criteria) this;
        }

        public Criteria andHttpmethodLike(String value) {
            addCriterion("HTTPMethod like", value, "httpmethod");
            return (Criteria) this;
        }

        public Criteria andHttpmethodNotLike(String value) {
            addCriterion("HTTPMethod not like", value, "httpmethod");
            return (Criteria) this;
        }

        public Criteria andHttpmethodIn(List<String> values) {
            addCriterion("HTTPMethod in", values, "httpmethod");
            return (Criteria) this;
        }

        public Criteria andHttpmethodNotIn(List<String> values) {
            addCriterion("HTTPMethod not in", values, "httpmethod");
            return (Criteria) this;
        }

        public Criteria andHttpmethodBetween(String value1, String value2) {
            addCriterion("HTTPMethod between", value1, value2, "httpmethod");
            return (Criteria) this;
        }

        public Criteria andHttpmethodNotBetween(String value1, String value2) {
            addCriterion("HTTPMethod not between", value1, value2, "httpmethod");
            return (Criteria) this;
        }

        public Criteria andRequestsourceIsNull() {
            addCriterion("RequestSource is null");
            return (Criteria) this;
        }

        public Criteria andRequestsourceIsNotNull() {
            addCriterion("RequestSource is not null");
            return (Criteria) this;
        }

        public Criteria andRequestsourceEqualTo(String value) {
            addCriterion("RequestSource =", value, "requestsource");
            return (Criteria) this;
        }

        public Criteria andRequestsourceNotEqualTo(String value) {
            addCriterion("RequestSource <>", value, "requestsource");
            return (Criteria) this;
        }

        public Criteria andRequestsourceGreaterThan(String value) {
            addCriterion("RequestSource >", value, "requestsource");
            return (Criteria) this;
        }

        public Criteria andRequestsourceGreaterThanOrEqualTo(String value) {
            addCriterion("RequestSource >=", value, "requestsource");
            return (Criteria) this;
        }

        public Criteria andRequestsourceLessThan(String value) {
            addCriterion("RequestSource <", value, "requestsource");
            return (Criteria) this;
        }

        public Criteria andRequestsourceLessThanOrEqualTo(String value) {
            addCriterion("RequestSource <=", value, "requestsource");
            return (Criteria) this;
        }

        public Criteria andRequestsourceLike(String value) {
            addCriterion("RequestSource like", value, "requestsource");
            return (Criteria) this;
        }

        public Criteria andRequestsourceNotLike(String value) {
            addCriterion("RequestSource not like", value, "requestsource");
            return (Criteria) this;
        }

        public Criteria andRequestsourceIn(List<String> values) {
            addCriterion("RequestSource in", values, "requestsource");
            return (Criteria) this;
        }

        public Criteria andRequestsourceNotIn(List<String> values) {
            addCriterion("RequestSource not in", values, "requestsource");
            return (Criteria) this;
        }

        public Criteria andRequestsourceBetween(String value1, String value2) {
            addCriterion("RequestSource between", value1, value2, "requestsource");
            return (Criteria) this;
        }

        public Criteria andRequestsourceNotBetween(String value1, String value2) {
            addCriterion("RequestSource not between", value1, value2, "requestsource");
            return (Criteria) this;
        }

        public Criteria andStatuscodeIsNull() {
            addCriterion("StatusCode is null");
            return (Criteria) this;
        }

        public Criteria andStatuscodeIsNotNull() {
            addCriterion("StatusCode is not null");
            return (Criteria) this;
        }

        public Criteria andStatuscodeEqualTo(String value) {
            addCriterion("StatusCode =", value, "statuscode");
            return (Criteria) this;
        }

        public Criteria andStatuscodeNotEqualTo(String value) {
            addCriterion("StatusCode <>", value, "statuscode");
            return (Criteria) this;
        }

        public Criteria andStatuscodeGreaterThan(String value) {
            addCriterion("StatusCode >", value, "statuscode");
            return (Criteria) this;
        }

        public Criteria andStatuscodeGreaterThanOrEqualTo(String value) {
            addCriterion("StatusCode >=", value, "statuscode");
            return (Criteria) this;
        }

        public Criteria andStatuscodeLessThan(String value) {
            addCriterion("StatusCode <", value, "statuscode");
            return (Criteria) this;
        }

        public Criteria andStatuscodeLessThanOrEqualTo(String value) {
            addCriterion("StatusCode <=", value, "statuscode");
            return (Criteria) this;
        }

        public Criteria andStatuscodeLike(String value) {
            addCriterion("StatusCode like", value, "statuscode");
            return (Criteria) this;
        }

        public Criteria andStatuscodeNotLike(String value) {
            addCriterion("StatusCode not like", value, "statuscode");
            return (Criteria) this;
        }

        public Criteria andStatuscodeIn(List<String> values) {
            addCriterion("StatusCode in", values, "statuscode");
            return (Criteria) this;
        }

        public Criteria andStatuscodeNotIn(List<String> values) {
            addCriterion("StatusCode not in", values, "statuscode");
            return (Criteria) this;
        }

        public Criteria andStatuscodeBetween(String value1, String value2) {
            addCriterion("StatusCode between", value1, value2, "statuscode");
            return (Criteria) this;
        }

        public Criteria andStatuscodeNotBetween(String value1, String value2) {
            addCriterion("StatusCode not between", value1, value2, "statuscode");
            return (Criteria) this;
        }

        public Criteria andStatusmessageIsNull() {
            addCriterion("StatusMessage is null");
            return (Criteria) this;
        }

        public Criteria andStatusmessageIsNotNull() {
            addCriterion("StatusMessage is not null");
            return (Criteria) this;
        }

        public Criteria andStatusmessageEqualTo(String value) {
            addCriterion("StatusMessage =", value, "statusmessage");
            return (Criteria) this;
        }

        public Criteria andStatusmessageNotEqualTo(String value) {
            addCriterion("StatusMessage <>", value, "statusmessage");
            return (Criteria) this;
        }

        public Criteria andStatusmessageGreaterThan(String value) {
            addCriterion("StatusMessage >", value, "statusmessage");
            return (Criteria) this;
        }

        public Criteria andStatusmessageGreaterThanOrEqualTo(String value) {
            addCriterion("StatusMessage >=", value, "statusmessage");
            return (Criteria) this;
        }

        public Criteria andStatusmessageLessThan(String value) {
            addCriterion("StatusMessage <", value, "statusmessage");
            return (Criteria) this;
        }

        public Criteria andStatusmessageLessThanOrEqualTo(String value) {
            addCriterion("StatusMessage <=", value, "statusmessage");
            return (Criteria) this;
        }

        public Criteria andStatusmessageLike(String value) {
            addCriterion("StatusMessage like", value, "statusmessage");
            return (Criteria) this;
        }

        public Criteria andStatusmessageNotLike(String value) {
            addCriterion("StatusMessage not like", value, "statusmessage");
            return (Criteria) this;
        }

        public Criteria andStatusmessageIn(List<String> values) {
            addCriterion("StatusMessage in", values, "statusmessage");
            return (Criteria) this;
        }

        public Criteria andStatusmessageNotIn(List<String> values) {
            addCriterion("StatusMessage not in", values, "statusmessage");
            return (Criteria) this;
        }

        public Criteria andStatusmessageBetween(String value1, String value2) {
            addCriterion("StatusMessage between", value1, value2, "statusmessage");
            return (Criteria) this;
        }

        public Criteria andStatusmessageNotBetween(String value1, String value2) {
            addCriterion("StatusMessage not between", value1, value2, "statusmessage");
            return (Criteria) this;
        }

        public Criteria andAppidIsNull() {
            addCriterion("Appid is null");
            return (Criteria) this;
        }

        public Criteria andAppidIsNotNull() {
            addCriterion("Appid is not null");
            return (Criteria) this;
        }

        public Criteria andAppidEqualTo(String value) {
            addCriterion("Appid =", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotEqualTo(String value) {
            addCriterion("Appid <>", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidGreaterThan(String value) {
            addCriterion("Appid >", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidGreaterThanOrEqualTo(String value) {
            addCriterion("Appid >=", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidLessThan(String value) {
            addCriterion("Appid <", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidLessThanOrEqualTo(String value) {
            addCriterion("Appid <=", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidLike(String value) {
            addCriterion("Appid like", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotLike(String value) {
            addCriterion("Appid not like", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidIn(List<String> values) {
            addCriterion("Appid in", values, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotIn(List<String> values) {
            addCriterion("Appid not in", values, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidBetween(String value1, String value2) {
            addCriterion("Appid between", value1, value2, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotBetween(String value1, String value2) {
            addCriterion("Appid not between", value1, value2, "appid");
            return (Criteria) this;
        }

        public Criteria andUinIsNull() {
            addCriterion("Uin is null");
            return (Criteria) this;
        }

        public Criteria andUinIsNotNull() {
            addCriterion("Uin is not null");
            return (Criteria) this;
        }

        public Criteria andUinEqualTo(String value) {
            addCriterion("Uin =", value, "uin");
            return (Criteria) this;
        }

        public Criteria andUinNotEqualTo(String value) {
            addCriterion("Uin <>", value, "uin");
            return (Criteria) this;
        }

        public Criteria andUinGreaterThan(String value) {
            addCriterion("Uin >", value, "uin");
            return (Criteria) this;
        }

        public Criteria andUinGreaterThanOrEqualTo(String value) {
            addCriterion("Uin >=", value, "uin");
            return (Criteria) this;
        }

        public Criteria andUinLessThan(String value) {
            addCriterion("Uin <", value, "uin");
            return (Criteria) this;
        }

        public Criteria andUinLessThanOrEqualTo(String value) {
            addCriterion("Uin <=", value, "uin");
            return (Criteria) this;
        }

        public Criteria andUinLike(String value) {
            addCriterion("Uin like", value, "uin");
            return (Criteria) this;
        }

        public Criteria andUinNotLike(String value) {
            addCriterion("Uin not like", value, "uin");
            return (Criteria) this;
        }

        public Criteria andUinIn(List<String> values) {
            addCriterion("Uin in", values, "uin");
            return (Criteria) this;
        }

        public Criteria andUinNotIn(List<String> values) {
            addCriterion("Uin not in", values, "uin");
            return (Criteria) this;
        }

        public Criteria andUinBetween(String value1, String value2) {
            addCriterion("Uin between", value1, value2, "uin");
            return (Criteria) this;
        }

        public Criteria andUinNotBetween(String value1, String value2) {
            addCriterion("Uin not between", value1, value2, "uin");
            return (Criteria) this;
        }

        public Criteria andSubuinIsNull() {
            addCriterion("SubUin is null");
            return (Criteria) this;
        }

        public Criteria andSubuinIsNotNull() {
            addCriterion("SubUin is not null");
            return (Criteria) this;
        }

        public Criteria andSubuinEqualTo(String value) {
            addCriterion("SubUin =", value, "subuin");
            return (Criteria) this;
        }

        public Criteria andSubuinNotEqualTo(String value) {
            addCriterion("SubUin <>", value, "subuin");
            return (Criteria) this;
        }

        public Criteria andSubuinGreaterThan(String value) {
            addCriterion("SubUin >", value, "subuin");
            return (Criteria) this;
        }

        public Criteria andSubuinGreaterThanOrEqualTo(String value) {
            addCriterion("SubUin >=", value, "subuin");
            return (Criteria) this;
        }

        public Criteria andSubuinLessThan(String value) {
            addCriterion("SubUin <", value, "subuin");
            return (Criteria) this;
        }

        public Criteria andSubuinLessThanOrEqualTo(String value) {
            addCriterion("SubUin <=", value, "subuin");
            return (Criteria) this;
        }

        public Criteria andSubuinLike(String value) {
            addCriterion("SubUin like", value, "subuin");
            return (Criteria) this;
        }

        public Criteria andSubuinNotLike(String value) {
            addCriterion("SubUin not like", value, "subuin");
            return (Criteria) this;
        }

        public Criteria andSubuinIn(List<String> values) {
            addCriterion("SubUin in", values, "subuin");
            return (Criteria) this;
        }

        public Criteria andSubuinNotIn(List<String> values) {
            addCriterion("SubUin not in", values, "subuin");
            return (Criteria) this;
        }

        public Criteria andSubuinBetween(String value1, String value2) {
            addCriterion("SubUin between", value1, value2, "subuin");
            return (Criteria) this;
        }

        public Criteria andSubuinNotBetween(String value1, String value2) {
            addCriterion("SubUin not between", value1, value2, "subuin");
            return (Criteria) this;
        }

        public Criteria andUaIsNull() {
            addCriterion("UA is null");
            return (Criteria) this;
        }

        public Criteria andUaIsNotNull() {
            addCriterion("UA is not null");
            return (Criteria) this;
        }

        public Criteria andUaEqualTo(String value) {
            addCriterion("UA =", value, "ua");
            return (Criteria) this;
        }

        public Criteria andUaNotEqualTo(String value) {
            addCriterion("UA <>", value, "ua");
            return (Criteria) this;
        }

        public Criteria andUaGreaterThan(String value) {
            addCriterion("UA >", value, "ua");
            return (Criteria) this;
        }

        public Criteria andUaGreaterThanOrEqualTo(String value) {
            addCriterion("UA >=", value, "ua");
            return (Criteria) this;
        }

        public Criteria andUaLessThan(String value) {
            addCriterion("UA <", value, "ua");
            return (Criteria) this;
        }

        public Criteria andUaLessThanOrEqualTo(String value) {
            addCriterion("UA <=", value, "ua");
            return (Criteria) this;
        }

        public Criteria andUaLike(String value) {
            addCriterion("UA like", value, "ua");
            return (Criteria) this;
        }

        public Criteria andUaNotLike(String value) {
            addCriterion("UA not like", value, "ua");
            return (Criteria) this;
        }

        public Criteria andUaIn(List<String> values) {
            addCriterion("UA in", values, "ua");
            return (Criteria) this;
        }

        public Criteria andUaNotIn(List<String> values) {
            addCriterion("UA not in", values, "ua");
            return (Criteria) this;
        }

        public Criteria andUaBetween(String value1, String value2) {
            addCriterion("UA between", value1, value2, "ua");
            return (Criteria) this;
        }

        public Criteria andUaNotBetween(String value1, String value2) {
            addCriterion("UA not between", value1, value2, "ua");
            return (Criteria) this;
        }

        public Criteria andRefererIsNull() {
            addCriterion("Referer is null");
            return (Criteria) this;
        }

        public Criteria andRefererIsNotNull() {
            addCriterion("Referer is not null");
            return (Criteria) this;
        }

        public Criteria andRefererEqualTo(String value) {
            addCriterion("Referer =", value, "referer");
            return (Criteria) this;
        }

        public Criteria andRefererNotEqualTo(String value) {
            addCriterion("Referer <>", value, "referer");
            return (Criteria) this;
        }

        public Criteria andRefererGreaterThan(String value) {
            addCriterion("Referer >", value, "referer");
            return (Criteria) this;
        }

        public Criteria andRefererGreaterThanOrEqualTo(String value) {
            addCriterion("Referer >=", value, "referer");
            return (Criteria) this;
        }

        public Criteria andRefererLessThan(String value) {
            addCriterion("Referer <", value, "referer");
            return (Criteria) this;
        }

        public Criteria andRefererLessThanOrEqualTo(String value) {
            addCriterion("Referer <=", value, "referer");
            return (Criteria) this;
        }

        public Criteria andRefererLike(String value) {
            addCriterion("Referer like", value, "referer");
            return (Criteria) this;
        }

        public Criteria andRefererNotLike(String value) {
            addCriterion("Referer not like", value, "referer");
            return (Criteria) this;
        }

        public Criteria andRefererIn(List<String> values) {
            addCriterion("Referer in", values, "referer");
            return (Criteria) this;
        }

        public Criteria andRefererNotIn(List<String> values) {
            addCriterion("Referer not in", values, "referer");
            return (Criteria) this;
        }

        public Criteria andRefererBetween(String value1, String value2) {
            addCriterion("Referer between", value1, value2, "referer");
            return (Criteria) this;
        }

        public Criteria andRefererNotBetween(String value1, String value2) {
            addCriterion("Referer not between", value1, value2, "referer");
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