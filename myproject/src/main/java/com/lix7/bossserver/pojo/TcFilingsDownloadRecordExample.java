package com.lix7.bossserver.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TcFilingsDownloadRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TcFilingsDownloadRecordExample() {
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

        public Criteria andRequestIdIsNull() {
            addCriterion("request_id is null");
            return (Criteria) this;
        }

        public Criteria andRequestIdIsNotNull() {
            addCriterion("request_id is not null");
            return (Criteria) this;
        }

        public Criteria andRequestIdEqualTo(String value) {
            addCriterion("request_id =", value, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdNotEqualTo(String value) {
            addCriterion("request_id <>", value, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdGreaterThan(String value) {
            addCriterion("request_id >", value, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdGreaterThanOrEqualTo(String value) {
            addCriterion("request_id >=", value, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdLessThan(String value) {
            addCriterion("request_id <", value, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdLessThanOrEqualTo(String value) {
            addCriterion("request_id <=", value, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdLike(String value) {
            addCriterion("request_id like", value, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdNotLike(String value) {
            addCriterion("request_id not like", value, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdIn(List<String> values) {
            addCriterion("request_id in", values, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdNotIn(List<String> values) {
            addCriterion("request_id not in", values, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdBetween(String value1, String value2) {
            addCriterion("request_id between", value1, value2, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdNotBetween(String value1, String value2) {
            addCriterion("request_id not between", value1, value2, "requestId");
            return (Criteria) this;
        }

        public Criteria andReturnFileNameIsNull() {
            addCriterion("return_file_name is null");
            return (Criteria) this;
        }

        public Criteria andReturnFileNameIsNotNull() {
            addCriterion("return_file_name is not null");
            return (Criteria) this;
        }

        public Criteria andReturnFileNameEqualTo(String value) {
            addCriterion("return_file_name =", value, "returnFileName");
            return (Criteria) this;
        }

        public Criteria andReturnFileNameNotEqualTo(String value) {
            addCriterion("return_file_name <>", value, "returnFileName");
            return (Criteria) this;
        }

        public Criteria andReturnFileNameGreaterThan(String value) {
            addCriterion("return_file_name >", value, "returnFileName");
            return (Criteria) this;
        }

        public Criteria andReturnFileNameGreaterThanOrEqualTo(String value) {
            addCriterion("return_file_name >=", value, "returnFileName");
            return (Criteria) this;
        }

        public Criteria andReturnFileNameLessThan(String value) {
            addCriterion("return_file_name <", value, "returnFileName");
            return (Criteria) this;
        }

        public Criteria andReturnFileNameLessThanOrEqualTo(String value) {
            addCriterion("return_file_name <=", value, "returnFileName");
            return (Criteria) this;
        }

        public Criteria andReturnFileNameLike(String value) {
            addCriterion("return_file_name like", value, "returnFileName");
            return (Criteria) this;
        }

        public Criteria andReturnFileNameNotLike(String value) {
            addCriterion("return_file_name not like", value, "returnFileName");
            return (Criteria) this;
        }

        public Criteria andReturnFileNameIn(List<String> values) {
            addCriterion("return_file_name in", values, "returnFileName");
            return (Criteria) this;
        }

        public Criteria andReturnFileNameNotIn(List<String> values) {
            addCriterion("return_file_name not in", values, "returnFileName");
            return (Criteria) this;
        }

        public Criteria andReturnFileNameBetween(String value1, String value2) {
            addCriterion("return_file_name between", value1, value2, "returnFileName");
            return (Criteria) this;
        }

        public Criteria andReturnFileNameNotBetween(String value1, String value2) {
            addCriterion("return_file_name not between", value1, value2, "returnFileName");
            return (Criteria) this;
        }

        public Criteria andBeianInfoHashIsNull() {
            addCriterion("beian_info_hash is null");
            return (Criteria) this;
        }

        public Criteria andBeianInfoHashIsNotNull() {
            addCriterion("beian_info_hash is not null");
            return (Criteria) this;
        }

        public Criteria andBeianInfoHashEqualTo(String value) {
            addCriterion("beian_info_hash =", value, "beianInfoHash");
            return (Criteria) this;
        }

        public Criteria andBeianInfoHashNotEqualTo(String value) {
            addCriterion("beian_info_hash <>", value, "beianInfoHash");
            return (Criteria) this;
        }

        public Criteria andBeianInfoHashGreaterThan(String value) {
            addCriterion("beian_info_hash >", value, "beianInfoHash");
            return (Criteria) this;
        }

        public Criteria andBeianInfoHashGreaterThanOrEqualTo(String value) {
            addCriterion("beian_info_hash >=", value, "beianInfoHash");
            return (Criteria) this;
        }

        public Criteria andBeianInfoHashLessThan(String value) {
            addCriterion("beian_info_hash <", value, "beianInfoHash");
            return (Criteria) this;
        }

        public Criteria andBeianInfoHashLessThanOrEqualTo(String value) {
            addCriterion("beian_info_hash <=", value, "beianInfoHash");
            return (Criteria) this;
        }

        public Criteria andBeianInfoHashLike(String value) {
            addCriterion("beian_info_hash like", value, "beianInfoHash");
            return (Criteria) this;
        }

        public Criteria andBeianInfoHashNotLike(String value) {
            addCriterion("beian_info_hash not like", value, "beianInfoHash");
            return (Criteria) this;
        }

        public Criteria andBeianInfoHashIn(List<String> values) {
            addCriterion("beian_info_hash in", values, "beianInfoHash");
            return (Criteria) this;
        }

        public Criteria andBeianInfoHashNotIn(List<String> values) {
            addCriterion("beian_info_hash not in", values, "beianInfoHash");
            return (Criteria) this;
        }

        public Criteria andBeianInfoHashBetween(String value1, String value2) {
            addCriterion("beian_info_hash between", value1, value2, "beianInfoHash");
            return (Criteria) this;
        }

        public Criteria andBeianInfoHashNotBetween(String value1, String value2) {
            addCriterion("beian_info_hash not between", value1, value2, "beianInfoHash");
            return (Criteria) this;
        }

        public Criteria andCompressionFormatIsNull() {
            addCriterion("compression_format is null");
            return (Criteria) this;
        }

        public Criteria andCompressionFormatIsNotNull() {
            addCriterion("compression_format is not null");
            return (Criteria) this;
        }

        public Criteria andCompressionFormatEqualTo(Integer value) {
            addCriterion("compression_format =", value, "compressionFormat");
            return (Criteria) this;
        }

        public Criteria andCompressionFormatNotEqualTo(Integer value) {
            addCriterion("compression_format <>", value, "compressionFormat");
            return (Criteria) this;
        }

        public Criteria andCompressionFormatGreaterThan(Integer value) {
            addCriterion("compression_format >", value, "compressionFormat");
            return (Criteria) this;
        }

        public Criteria andCompressionFormatGreaterThanOrEqualTo(Integer value) {
            addCriterion("compression_format >=", value, "compressionFormat");
            return (Criteria) this;
        }

        public Criteria andCompressionFormatLessThan(Integer value) {
            addCriterion("compression_format <", value, "compressionFormat");
            return (Criteria) this;
        }

        public Criteria andCompressionFormatLessThanOrEqualTo(Integer value) {
            addCriterion("compression_format <=", value, "compressionFormat");
            return (Criteria) this;
        }

        public Criteria andCompressionFormatIn(List<Integer> values) {
            addCriterion("compression_format in", values, "compressionFormat");
            return (Criteria) this;
        }

        public Criteria andCompressionFormatNotIn(List<Integer> values) {
            addCriterion("compression_format not in", values, "compressionFormat");
            return (Criteria) this;
        }

        public Criteria andCompressionFormatBetween(Integer value1, Integer value2) {
            addCriterion("compression_format between", value1, value2, "compressionFormat");
            return (Criteria) this;
        }

        public Criteria andCompressionFormatNotBetween(Integer value1, Integer value2) {
            addCriterion("compression_format not between", value1, value2, "compressionFormat");
            return (Criteria) this;
        }

        public Criteria andEncryptAlgorithmIsNull() {
            addCriterion("encrypt_algorithm is null");
            return (Criteria) this;
        }

        public Criteria andEncryptAlgorithmIsNotNull() {
            addCriterion("encrypt_algorithm is not null");
            return (Criteria) this;
        }

        public Criteria andEncryptAlgorithmEqualTo(Integer value) {
            addCriterion("encrypt_algorithm =", value, "encryptAlgorithm");
            return (Criteria) this;
        }

        public Criteria andEncryptAlgorithmNotEqualTo(Integer value) {
            addCriterion("encrypt_algorithm <>", value, "encryptAlgorithm");
            return (Criteria) this;
        }

        public Criteria andEncryptAlgorithmGreaterThan(Integer value) {
            addCriterion("encrypt_algorithm >", value, "encryptAlgorithm");
            return (Criteria) this;
        }

        public Criteria andEncryptAlgorithmGreaterThanOrEqualTo(Integer value) {
            addCriterion("encrypt_algorithm >=", value, "encryptAlgorithm");
            return (Criteria) this;
        }

        public Criteria andEncryptAlgorithmLessThan(Integer value) {
            addCriterion("encrypt_algorithm <", value, "encryptAlgorithm");
            return (Criteria) this;
        }

        public Criteria andEncryptAlgorithmLessThanOrEqualTo(Integer value) {
            addCriterion("encrypt_algorithm <=", value, "encryptAlgorithm");
            return (Criteria) this;
        }

        public Criteria andEncryptAlgorithmIn(List<Integer> values) {
            addCriterion("encrypt_algorithm in", values, "encryptAlgorithm");
            return (Criteria) this;
        }

        public Criteria andEncryptAlgorithmNotIn(List<Integer> values) {
            addCriterion("encrypt_algorithm not in", values, "encryptAlgorithm");
            return (Criteria) this;
        }

        public Criteria andEncryptAlgorithmBetween(Integer value1, Integer value2) {
            addCriterion("encrypt_algorithm between", value1, value2, "encryptAlgorithm");
            return (Criteria) this;
        }

        public Criteria andEncryptAlgorithmNotBetween(Integer value1, Integer value2) {
            addCriterion("encrypt_algorithm not between", value1, value2, "encryptAlgorithm");
            return (Criteria) this;
        }

        public Criteria andHashAlgorithmIsNull() {
            addCriterion("hash_algorithm is null");
            return (Criteria) this;
        }

        public Criteria andHashAlgorithmIsNotNull() {
            addCriterion("hash_algorithm is not null");
            return (Criteria) this;
        }

        public Criteria andHashAlgorithmEqualTo(Integer value) {
            addCriterion("hash_algorithm =", value, "hashAlgorithm");
            return (Criteria) this;
        }

        public Criteria andHashAlgorithmNotEqualTo(Integer value) {
            addCriterion("hash_algorithm <>", value, "hashAlgorithm");
            return (Criteria) this;
        }

        public Criteria andHashAlgorithmGreaterThan(Integer value) {
            addCriterion("hash_algorithm >", value, "hashAlgorithm");
            return (Criteria) this;
        }

        public Criteria andHashAlgorithmGreaterThanOrEqualTo(Integer value) {
            addCriterion("hash_algorithm >=", value, "hashAlgorithm");
            return (Criteria) this;
        }

        public Criteria andHashAlgorithmLessThan(Integer value) {
            addCriterion("hash_algorithm <", value, "hashAlgorithm");
            return (Criteria) this;
        }

        public Criteria andHashAlgorithmLessThanOrEqualTo(Integer value) {
            addCriterion("hash_algorithm <=", value, "hashAlgorithm");
            return (Criteria) this;
        }

        public Criteria andHashAlgorithmIn(List<Integer> values) {
            addCriterion("hash_algorithm in", values, "hashAlgorithm");
            return (Criteria) this;
        }

        public Criteria andHashAlgorithmNotIn(List<Integer> values) {
            addCriterion("hash_algorithm not in", values, "hashAlgorithm");
            return (Criteria) this;
        }

        public Criteria andHashAlgorithmBetween(Integer value1, Integer value2) {
            addCriterion("hash_algorithm between", value1, value2, "hashAlgorithm");
            return (Criteria) this;
        }

        public Criteria andHashAlgorithmNotBetween(Integer value1, Integer value2) {
            addCriterion("hash_algorithm not between", value1, value2, "hashAlgorithm");
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