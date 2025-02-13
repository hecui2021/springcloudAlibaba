package com.lix7.bossserver.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TcProgramBasicInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TcProgramBasicInfoExample() {
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

        public Criteria andProgramIdIsNull() {
            addCriterion("program_id is null");
            return (Criteria) this;
        }

        public Criteria andProgramIdIsNotNull() {
            addCriterion("program_id is not null");
            return (Criteria) this;
        }

        public Criteria andProgramIdEqualTo(String value) {
            addCriterion("program_id =", value, "programId");
            return (Criteria) this;
        }

        public Criteria andProgramIdNotEqualTo(String value) {
            addCriterion("program_id <>", value, "programId");
            return (Criteria) this;
        }

        public Criteria andProgramIdGreaterThan(String value) {
            addCriterion("program_id >", value, "programId");
            return (Criteria) this;
        }

        public Criteria andProgramIdGreaterThanOrEqualTo(String value) {
            addCriterion("program_id >=", value, "programId");
            return (Criteria) this;
        }

        public Criteria andProgramIdLessThan(String value) {
            addCriterion("program_id <", value, "programId");
            return (Criteria) this;
        }

        public Criteria andProgramIdLessThanOrEqualTo(String value) {
            addCriterion("program_id <=", value, "programId");
            return (Criteria) this;
        }

        public Criteria andProgramIdLike(String value) {
            addCriterion("program_id like", value, "programId");
            return (Criteria) this;
        }

        public Criteria andProgramIdNotLike(String value) {
            addCriterion("program_id not like", value, "programId");
            return (Criteria) this;
        }

        public Criteria andProgramIdIn(List<String> values) {
            addCriterion("program_id in", values, "programId");
            return (Criteria) this;
        }

        public Criteria andProgramIdNotIn(List<String> values) {
            addCriterion("program_id not in", values, "programId");
            return (Criteria) this;
        }

        public Criteria andProgramIdBetween(String value1, String value2) {
            addCriterion("program_id between", value1, value2, "programId");
            return (Criteria) this;
        }

        public Criteria andProgramIdNotBetween(String value1, String value2) {
            addCriterion("program_id not between", value1, value2, "programId");
            return (Criteria) this;
        }

        public Criteria andProgramNameIsNull() {
            addCriterion("program_name is null");
            return (Criteria) this;
        }

        public Criteria andProgramNameIsNotNull() {
            addCriterion("program_name is not null");
            return (Criteria) this;
        }

        public Criteria andProgramNameEqualTo(String value) {
            addCriterion("program_name =", value, "programName");
            return (Criteria) this;
        }

        public Criteria andProgramNameNotEqualTo(String value) {
            addCriterion("program_name <>", value, "programName");
            return (Criteria) this;
        }

        public Criteria andProgramNameGreaterThan(String value) {
            addCriterion("program_name >", value, "programName");
            return (Criteria) this;
        }

        public Criteria andProgramNameGreaterThanOrEqualTo(String value) {
            addCriterion("program_name >=", value, "programName");
            return (Criteria) this;
        }

        public Criteria andProgramNameLessThan(String value) {
            addCriterion("program_name <", value, "programName");
            return (Criteria) this;
        }

        public Criteria andProgramNameLessThanOrEqualTo(String value) {
            addCriterion("program_name <=", value, "programName");
            return (Criteria) this;
        }

        public Criteria andProgramNameLike(String value) {
            addCriterion("program_name like", value, "programName");
            return (Criteria) this;
        }

        public Criteria andProgramNameNotLike(String value) {
            addCriterion("program_name not like", value, "programName");
            return (Criteria) this;
        }

        public Criteria andProgramNameIn(List<String> values) {
            addCriterion("program_name in", values, "programName");
            return (Criteria) this;
        }

        public Criteria andProgramNameNotIn(List<String> values) {
            addCriterion("program_name not in", values, "programName");
            return (Criteria) this;
        }

        public Criteria andProgramNameBetween(String value1, String value2) {
            addCriterion("program_name between", value1, value2, "programName");
            return (Criteria) this;
        }

        public Criteria andProgramNameNotBetween(String value1, String value2) {
            addCriterion("program_name not between", value1, value2, "programName");
            return (Criteria) this;
        }

        public Criteria andProgramAbbreviationIsNull() {
            addCriterion("program_abbreviation is null");
            return (Criteria) this;
        }

        public Criteria andProgramAbbreviationIsNotNull() {
            addCriterion("program_abbreviation is not null");
            return (Criteria) this;
        }

        public Criteria andProgramAbbreviationEqualTo(String value) {
            addCriterion("program_abbreviation =", value, "programAbbreviation");
            return (Criteria) this;
        }

        public Criteria andProgramAbbreviationNotEqualTo(String value) {
            addCriterion("program_abbreviation <>", value, "programAbbreviation");
            return (Criteria) this;
        }

        public Criteria andProgramAbbreviationGreaterThan(String value) {
            addCriterion("program_abbreviation >", value, "programAbbreviation");
            return (Criteria) this;
        }

        public Criteria andProgramAbbreviationGreaterThanOrEqualTo(String value) {
            addCriterion("program_abbreviation >=", value, "programAbbreviation");
            return (Criteria) this;
        }

        public Criteria andProgramAbbreviationLessThan(String value) {
            addCriterion("program_abbreviation <", value, "programAbbreviation");
            return (Criteria) this;
        }

        public Criteria andProgramAbbreviationLessThanOrEqualTo(String value) {
            addCriterion("program_abbreviation <=", value, "programAbbreviation");
            return (Criteria) this;
        }

        public Criteria andProgramAbbreviationLike(String value) {
            addCriterion("program_abbreviation like", value, "programAbbreviation");
            return (Criteria) this;
        }

        public Criteria andProgramAbbreviationNotLike(String value) {
            addCriterion("program_abbreviation not like", value, "programAbbreviation");
            return (Criteria) this;
        }

        public Criteria andProgramAbbreviationIn(List<String> values) {
            addCriterion("program_abbreviation in", values, "programAbbreviation");
            return (Criteria) this;
        }

        public Criteria andProgramAbbreviationNotIn(List<String> values) {
            addCriterion("program_abbreviation not in", values, "programAbbreviation");
            return (Criteria) this;
        }

        public Criteria andProgramAbbreviationBetween(String value1, String value2) {
            addCriterion("program_abbreviation between", value1, value2, "programAbbreviation");
            return (Criteria) this;
        }

        public Criteria andProgramAbbreviationNotBetween(String value1, String value2) {
            addCriterion("program_abbreviation not between", value1, value2, "programAbbreviation");
            return (Criteria) this;
        }

        public Criteria andProgramEnNameIsNull() {
            addCriterion("program_en_name is null");
            return (Criteria) this;
        }

        public Criteria andProgramEnNameIsNotNull() {
            addCriterion("program_en_name is not null");
            return (Criteria) this;
        }

        public Criteria andProgramEnNameEqualTo(String value) {
            addCriterion("program_en_name =", value, "programEnName");
            return (Criteria) this;
        }

        public Criteria andProgramEnNameNotEqualTo(String value) {
            addCriterion("program_en_name <>", value, "programEnName");
            return (Criteria) this;
        }

        public Criteria andProgramEnNameGreaterThan(String value) {
            addCriterion("program_en_name >", value, "programEnName");
            return (Criteria) this;
        }

        public Criteria andProgramEnNameGreaterThanOrEqualTo(String value) {
            addCriterion("program_en_name >=", value, "programEnName");
            return (Criteria) this;
        }

        public Criteria andProgramEnNameLessThan(String value) {
            addCriterion("program_en_name <", value, "programEnName");
            return (Criteria) this;
        }

        public Criteria andProgramEnNameLessThanOrEqualTo(String value) {
            addCriterion("program_en_name <=", value, "programEnName");
            return (Criteria) this;
        }

        public Criteria andProgramEnNameLike(String value) {
            addCriterion("program_en_name like", value, "programEnName");
            return (Criteria) this;
        }

        public Criteria andProgramEnNameNotLike(String value) {
            addCriterion("program_en_name not like", value, "programEnName");
            return (Criteria) this;
        }

        public Criteria andProgramEnNameIn(List<String> values) {
            addCriterion("program_en_name in", values, "programEnName");
            return (Criteria) this;
        }

        public Criteria andProgramEnNameNotIn(List<String> values) {
            addCriterion("program_en_name not in", values, "programEnName");
            return (Criteria) this;
        }

        public Criteria andProgramEnNameBetween(String value1, String value2) {
            addCriterion("program_en_name between", value1, value2, "programEnName");
            return (Criteria) this;
        }

        public Criteria andProgramEnNameNotBetween(String value1, String value2) {
            addCriterion("program_en_name not between", value1, value2, "programEnName");
            return (Criteria) this;
        }

        public Criteria andIconKeyIsNull() {
            addCriterion("icon_key is null");
            return (Criteria) this;
        }

        public Criteria andIconKeyIsNotNull() {
            addCriterion("icon_key is not null");
            return (Criteria) this;
        }

        public Criteria andIconKeyEqualTo(String value) {
            addCriterion("icon_key =", value, "iconKey");
            return (Criteria) this;
        }

        public Criteria andIconKeyNotEqualTo(String value) {
            addCriterion("icon_key <>", value, "iconKey");
            return (Criteria) this;
        }

        public Criteria andIconKeyGreaterThan(String value) {
            addCriterion("icon_key >", value, "iconKey");
            return (Criteria) this;
        }

        public Criteria andIconKeyGreaterThanOrEqualTo(String value) {
            addCriterion("icon_key >=", value, "iconKey");
            return (Criteria) this;
        }

        public Criteria andIconKeyLessThan(String value) {
            addCriterion("icon_key <", value, "iconKey");
            return (Criteria) this;
        }

        public Criteria andIconKeyLessThanOrEqualTo(String value) {
            addCriterion("icon_key <=", value, "iconKey");
            return (Criteria) this;
        }

        public Criteria andIconKeyLike(String value) {
            addCriterion("icon_key like", value, "iconKey");
            return (Criteria) this;
        }

        public Criteria andIconKeyNotLike(String value) {
            addCriterion("icon_key not like", value, "iconKey");
            return (Criteria) this;
        }

        public Criteria andIconKeyIn(List<String> values) {
            addCriterion("icon_key in", values, "iconKey");
            return (Criteria) this;
        }

        public Criteria andIconKeyNotIn(List<String> values) {
            addCriterion("icon_key not in", values, "iconKey");
            return (Criteria) this;
        }

        public Criteria andIconKeyBetween(String value1, String value2) {
            addCriterion("icon_key between", value1, value2, "iconKey");
            return (Criteria) this;
        }

        public Criteria andIconKeyNotBetween(String value1, String value2) {
            addCriterion("icon_key not between", value1, value2, "iconKey");
            return (Criteria) this;
        }

        public Criteria andProgramIntroIsNull() {
            addCriterion("program_intro is null");
            return (Criteria) this;
        }

        public Criteria andProgramIntroIsNotNull() {
            addCriterion("program_intro is not null");
            return (Criteria) this;
        }

        public Criteria andProgramIntroEqualTo(String value) {
            addCriterion("program_intro =", value, "programIntro");
            return (Criteria) this;
        }

        public Criteria andProgramIntroNotEqualTo(String value) {
            addCriterion("program_intro <>", value, "programIntro");
            return (Criteria) this;
        }

        public Criteria andProgramIntroGreaterThan(String value) {
            addCriterion("program_intro >", value, "programIntro");
            return (Criteria) this;
        }

        public Criteria andProgramIntroGreaterThanOrEqualTo(String value) {
            addCriterion("program_intro >=", value, "programIntro");
            return (Criteria) this;
        }

        public Criteria andProgramIntroLessThan(String value) {
            addCriterion("program_intro <", value, "programIntro");
            return (Criteria) this;
        }

        public Criteria andProgramIntroLessThanOrEqualTo(String value) {
            addCriterion("program_intro <=", value, "programIntro");
            return (Criteria) this;
        }

        public Criteria andProgramIntroLike(String value) {
            addCriterion("program_intro like", value, "programIntro");
            return (Criteria) this;
        }

        public Criteria andProgramIntroNotLike(String value) {
            addCriterion("program_intro not like", value, "programIntro");
            return (Criteria) this;
        }

        public Criteria andProgramIntroIn(List<String> values) {
            addCriterion("program_intro in", values, "programIntro");
            return (Criteria) this;
        }

        public Criteria andProgramIntroNotIn(List<String> values) {
            addCriterion("program_intro not in", values, "programIntro");
            return (Criteria) this;
        }

        public Criteria andProgramIntroBetween(String value1, String value2) {
            addCriterion("program_intro between", value1, value2, "programIntro");
            return (Criteria) this;
        }

        public Criteria andProgramIntroNotBetween(String value1, String value2) {
            addCriterion("program_intro not between", value1, value2, "programIntro");
            return (Criteria) this;
        }

        public Criteria andProgramSubheadingIsNull() {
            addCriterion("program_subheading is null");
            return (Criteria) this;
        }

        public Criteria andProgramSubheadingIsNotNull() {
            addCriterion("program_subheading is not null");
            return (Criteria) this;
        }

        public Criteria andProgramSubheadingEqualTo(String value) {
            addCriterion("program_subheading =", value, "programSubheading");
            return (Criteria) this;
        }

        public Criteria andProgramSubheadingNotEqualTo(String value) {
            addCriterion("program_subheading <>", value, "programSubheading");
            return (Criteria) this;
        }

        public Criteria andProgramSubheadingGreaterThan(String value) {
            addCriterion("program_subheading >", value, "programSubheading");
            return (Criteria) this;
        }

        public Criteria andProgramSubheadingGreaterThanOrEqualTo(String value) {
            addCriterion("program_subheading >=", value, "programSubheading");
            return (Criteria) this;
        }

        public Criteria andProgramSubheadingLessThan(String value) {
            addCriterion("program_subheading <", value, "programSubheading");
            return (Criteria) this;
        }

        public Criteria andProgramSubheadingLessThanOrEqualTo(String value) {
            addCriterion("program_subheading <=", value, "programSubheading");
            return (Criteria) this;
        }

        public Criteria andProgramSubheadingLike(String value) {
            addCriterion("program_subheading like", value, "programSubheading");
            return (Criteria) this;
        }

        public Criteria andProgramSubheadingNotLike(String value) {
            addCriterion("program_subheading not like", value, "programSubheading");
            return (Criteria) this;
        }

        public Criteria andProgramSubheadingIn(List<String> values) {
            addCriterion("program_subheading in", values, "programSubheading");
            return (Criteria) this;
        }

        public Criteria andProgramSubheadingNotIn(List<String> values) {
            addCriterion("program_subheading not in", values, "programSubheading");
            return (Criteria) this;
        }

        public Criteria andProgramSubheadingBetween(String value1, String value2) {
            addCriterion("program_subheading between", value1, value2, "programSubheading");
            return (Criteria) this;
        }

        public Criteria andProgramSubheadingNotBetween(String value1, String value2) {
            addCriterion("program_subheading not between", value1, value2, "programSubheading");
            return (Criteria) this;
        }

        public Criteria andProgramPosterIsNull() {
            addCriterion("program_poster is null");
            return (Criteria) this;
        }

        public Criteria andProgramPosterIsNotNull() {
            addCriterion("program_poster is not null");
            return (Criteria) this;
        }

        public Criteria andProgramPosterEqualTo(String value) {
            addCriterion("program_poster =", value, "programPoster");
            return (Criteria) this;
        }

        public Criteria andProgramPosterNotEqualTo(String value) {
            addCriterion("program_poster <>", value, "programPoster");
            return (Criteria) this;
        }

        public Criteria andProgramPosterGreaterThan(String value) {
            addCriterion("program_poster >", value, "programPoster");
            return (Criteria) this;
        }

        public Criteria andProgramPosterGreaterThanOrEqualTo(String value) {
            addCriterion("program_poster >=", value, "programPoster");
            return (Criteria) this;
        }

        public Criteria andProgramPosterLessThan(String value) {
            addCriterion("program_poster <", value, "programPoster");
            return (Criteria) this;
        }

        public Criteria andProgramPosterLessThanOrEqualTo(String value) {
            addCriterion("program_poster <=", value, "programPoster");
            return (Criteria) this;
        }

        public Criteria andProgramPosterLike(String value) {
            addCriterion("program_poster like", value, "programPoster");
            return (Criteria) this;
        }

        public Criteria andProgramPosterNotLike(String value) {
            addCriterion("program_poster not like", value, "programPoster");
            return (Criteria) this;
        }

        public Criteria andProgramPosterIn(List<String> values) {
            addCriterion("program_poster in", values, "programPoster");
            return (Criteria) this;
        }

        public Criteria andProgramPosterNotIn(List<String> values) {
            addCriterion("program_poster not in", values, "programPoster");
            return (Criteria) this;
        }

        public Criteria andProgramPosterBetween(String value1, String value2) {
            addCriterion("program_poster between", value1, value2, "programPoster");
            return (Criteria) this;
        }

        public Criteria andProgramPosterNotBetween(String value1, String value2) {
            addCriterion("program_poster not between", value1, value2, "programPoster");
            return (Criteria) this;
        }

        public Criteria andProgramBigPosterIsNull() {
            addCriterion("program_big_poster is null");
            return (Criteria) this;
        }

        public Criteria andProgramBigPosterIsNotNull() {
            addCriterion("program_big_poster is not null");
            return (Criteria) this;
        }

        public Criteria andProgramBigPosterEqualTo(String value) {
            addCriterion("program_big_poster =", value, "programBigPoster");
            return (Criteria) this;
        }

        public Criteria andProgramBigPosterNotEqualTo(String value) {
            addCriterion("program_big_poster <>", value, "programBigPoster");
            return (Criteria) this;
        }

        public Criteria andProgramBigPosterGreaterThan(String value) {
            addCriterion("program_big_poster >", value, "programBigPoster");
            return (Criteria) this;
        }

        public Criteria andProgramBigPosterGreaterThanOrEqualTo(String value) {
            addCriterion("program_big_poster >=", value, "programBigPoster");
            return (Criteria) this;
        }

        public Criteria andProgramBigPosterLessThan(String value) {
            addCriterion("program_big_poster <", value, "programBigPoster");
            return (Criteria) this;
        }

        public Criteria andProgramBigPosterLessThanOrEqualTo(String value) {
            addCriterion("program_big_poster <=", value, "programBigPoster");
            return (Criteria) this;
        }

        public Criteria andProgramBigPosterLike(String value) {
            addCriterion("program_big_poster like", value, "programBigPoster");
            return (Criteria) this;
        }

        public Criteria andProgramBigPosterNotLike(String value) {
            addCriterion("program_big_poster not like", value, "programBigPoster");
            return (Criteria) this;
        }

        public Criteria andProgramBigPosterIn(List<String> values) {
            addCriterion("program_big_poster in", values, "programBigPoster");
            return (Criteria) this;
        }

        public Criteria andProgramBigPosterNotIn(List<String> values) {
            addCriterion("program_big_poster not in", values, "programBigPoster");
            return (Criteria) this;
        }

        public Criteria andProgramBigPosterBetween(String value1, String value2) {
            addCriterion("program_big_poster between", value1, value2, "programBigPoster");
            return (Criteria) this;
        }

        public Criteria andProgramBigPosterNotBetween(String value1, String value2) {
            addCriterion("program_big_poster not between", value1, value2, "programBigPoster");
            return (Criteria) this;
        }

        public Criteria andProgramTypeIsNull() {
            addCriterion("program_type is null");
            return (Criteria) this;
        }

        public Criteria andProgramTypeIsNotNull() {
            addCriterion("program_type is not null");
            return (Criteria) this;
        }

        public Criteria andProgramTypeEqualTo(Byte value) {
            addCriterion("program_type =", value, "programType");
            return (Criteria) this;
        }

        public Criteria andProgramTypeNotEqualTo(Byte value) {
            addCriterion("program_type <>", value, "programType");
            return (Criteria) this;
        }

        public Criteria andProgramTypeGreaterThan(Byte value) {
            addCriterion("program_type >", value, "programType");
            return (Criteria) this;
        }

        public Criteria andProgramTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("program_type >=", value, "programType");
            return (Criteria) this;
        }

        public Criteria andProgramTypeLessThan(Byte value) {
            addCriterion("program_type <", value, "programType");
            return (Criteria) this;
        }

        public Criteria andProgramTypeLessThanOrEqualTo(Byte value) {
            addCriterion("program_type <=", value, "programType");
            return (Criteria) this;
        }

        public Criteria andProgramTypeIn(List<Byte> values) {
            addCriterion("program_type in", values, "programType");
            return (Criteria) this;
        }

        public Criteria andProgramTypeNotIn(List<Byte> values) {
            addCriterion("program_type not in", values, "programType");
            return (Criteria) this;
        }

        public Criteria andProgramTypeBetween(Byte value1, Byte value2) {
            addCriterion("program_type between", value1, value2, "programType");
            return (Criteria) this;
        }

        public Criteria andProgramTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("program_type not between", value1, value2, "programType");
            return (Criteria) this;
        }

        public Criteria andVendorTypeIsNull() {
            addCriterion("vendor_type is null");
            return (Criteria) this;
        }

        public Criteria andVendorTypeIsNotNull() {
            addCriterion("vendor_type is not null");
            return (Criteria) this;
        }

        public Criteria andVendorTypeEqualTo(Byte value) {
            addCriterion("vendor_type =", value, "vendorType");
            return (Criteria) this;
        }

        public Criteria andVendorTypeNotEqualTo(Byte value) {
            addCriterion("vendor_type <>", value, "vendorType");
            return (Criteria) this;
        }

        public Criteria andVendorTypeGreaterThan(Byte value) {
            addCriterion("vendor_type >", value, "vendorType");
            return (Criteria) this;
        }

        public Criteria andVendorTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("vendor_type >=", value, "vendorType");
            return (Criteria) this;
        }

        public Criteria andVendorTypeLessThan(Byte value) {
            addCriterion("vendor_type <", value, "vendorType");
            return (Criteria) this;
        }

        public Criteria andVendorTypeLessThanOrEqualTo(Byte value) {
            addCriterion("vendor_type <=", value, "vendorType");
            return (Criteria) this;
        }

        public Criteria andVendorTypeIn(List<Byte> values) {
            addCriterion("vendor_type in", values, "vendorType");
            return (Criteria) this;
        }

        public Criteria andVendorTypeNotIn(List<Byte> values) {
            addCriterion("vendor_type not in", values, "vendorType");
            return (Criteria) this;
        }

        public Criteria andVendorTypeBetween(Byte value1, Byte value2) {
            addCriterion("vendor_type between", value1, value2, "vendorType");
            return (Criteria) this;
        }

        public Criteria andVendorTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("vendor_type not between", value1, value2, "vendorType");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNull() {
            addCriterion("category is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNotNull() {
            addCriterion("category is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryEqualTo(String value) {
            addCriterion("category =", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotEqualTo(String value) {
            addCriterion("category <>", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThan(String value) {
            addCriterion("category >", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("category >=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThan(String value) {
            addCriterion("category <", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThanOrEqualTo(String value) {
            addCriterion("category <=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLike(String value) {
            addCriterion("category like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotLike(String value) {
            addCriterion("category not like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryIn(List<String> values) {
            addCriterion("category in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotIn(List<String> values) {
            addCriterion("category not in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryBetween(String value1, String value2) {
            addCriterion("category between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotBetween(String value1, String value2) {
            addCriterion("category not between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNull() {
            addCriterion("category_id is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNotNull() {
            addCriterion("category_id is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdEqualTo(String value) {
            addCriterion("category_id =", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotEqualTo(String value) {
            addCriterion("category_id <>", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThan(String value) {
            addCriterion("category_id >", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThanOrEqualTo(String value) {
            addCriterion("category_id >=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThan(String value) {
            addCriterion("category_id <", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThanOrEqualTo(String value) {
            addCriterion("category_id <=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLike(String value) {
            addCriterion("category_id like", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotLike(String value) {
            addCriterion("category_id not like", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIn(List<String> values) {
            addCriterion("category_id in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotIn(List<String> values) {
            addCriterion("category_id not in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdBetween(String value1, String value2) {
            addCriterion("category_id between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotBetween(String value1, String value2) {
            addCriterion("category_id not between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryFirstIdIsNull() {
            addCriterion("category_first_id is null");
            return (Criteria) this;
        }

        public Criteria andCategoryFirstIdIsNotNull() {
            addCriterion("category_first_id is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryFirstIdEqualTo(String value) {
            addCriterion("category_first_id =", value, "categoryFirstId");
            return (Criteria) this;
        }

        public Criteria andCategoryFirstIdNotEqualTo(String value) {
            addCriterion("category_first_id <>", value, "categoryFirstId");
            return (Criteria) this;
        }

        public Criteria andCategoryFirstIdGreaterThan(String value) {
            addCriterion("category_first_id >", value, "categoryFirstId");
            return (Criteria) this;
        }

        public Criteria andCategoryFirstIdGreaterThanOrEqualTo(String value) {
            addCriterion("category_first_id >=", value, "categoryFirstId");
            return (Criteria) this;
        }

        public Criteria andCategoryFirstIdLessThan(String value) {
            addCriterion("category_first_id <", value, "categoryFirstId");
            return (Criteria) this;
        }

        public Criteria andCategoryFirstIdLessThanOrEqualTo(String value) {
            addCriterion("category_first_id <=", value, "categoryFirstId");
            return (Criteria) this;
        }

        public Criteria andCategoryFirstIdLike(String value) {
            addCriterion("category_first_id like", value, "categoryFirstId");
            return (Criteria) this;
        }

        public Criteria andCategoryFirstIdNotLike(String value) {
            addCriterion("category_first_id not like", value, "categoryFirstId");
            return (Criteria) this;
        }

        public Criteria andCategoryFirstIdIn(List<String> values) {
            addCriterion("category_first_id in", values, "categoryFirstId");
            return (Criteria) this;
        }

        public Criteria andCategoryFirstIdNotIn(List<String> values) {
            addCriterion("category_first_id not in", values, "categoryFirstId");
            return (Criteria) this;
        }

        public Criteria andCategoryFirstIdBetween(String value1, String value2) {
            addCriterion("category_first_id between", value1, value2, "categoryFirstId");
            return (Criteria) this;
        }

        public Criteria andCategoryFirstIdNotBetween(String value1, String value2) {
            addCriterion("category_first_id not between", value1, value2, "categoryFirstId");
            return (Criteria) this;
        }

        public Criteria andCategorySecondIdIsNull() {
            addCriterion("category_second_id is null");
            return (Criteria) this;
        }

        public Criteria andCategorySecondIdIsNotNull() {
            addCriterion("category_second_id is not null");
            return (Criteria) this;
        }

        public Criteria andCategorySecondIdEqualTo(String value) {
            addCriterion("category_second_id =", value, "categorySecondId");
            return (Criteria) this;
        }

        public Criteria andCategorySecondIdNotEqualTo(String value) {
            addCriterion("category_second_id <>", value, "categorySecondId");
            return (Criteria) this;
        }

        public Criteria andCategorySecondIdGreaterThan(String value) {
            addCriterion("category_second_id >", value, "categorySecondId");
            return (Criteria) this;
        }

        public Criteria andCategorySecondIdGreaterThanOrEqualTo(String value) {
            addCriterion("category_second_id >=", value, "categorySecondId");
            return (Criteria) this;
        }

        public Criteria andCategorySecondIdLessThan(String value) {
            addCriterion("category_second_id <", value, "categorySecondId");
            return (Criteria) this;
        }

        public Criteria andCategorySecondIdLessThanOrEqualTo(String value) {
            addCriterion("category_second_id <=", value, "categorySecondId");
            return (Criteria) this;
        }

        public Criteria andCategorySecondIdLike(String value) {
            addCriterion("category_second_id like", value, "categorySecondId");
            return (Criteria) this;
        }

        public Criteria andCategorySecondIdNotLike(String value) {
            addCriterion("category_second_id not like", value, "categorySecondId");
            return (Criteria) this;
        }

        public Criteria andCategorySecondIdIn(List<String> values) {
            addCriterion("category_second_id in", values, "categorySecondId");
            return (Criteria) this;
        }

        public Criteria andCategorySecondIdNotIn(List<String> values) {
            addCriterion("category_second_id not in", values, "categorySecondId");
            return (Criteria) this;
        }

        public Criteria andCategorySecondIdBetween(String value1, String value2) {
            addCriterion("category_second_id between", value1, value2, "categorySecondId");
            return (Criteria) this;
        }

        public Criteria andCategorySecondIdNotBetween(String value1, String value2) {
            addCriterion("category_second_id not between", value1, value2, "categorySecondId");
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

        public Criteria andProgramSecretIdIsNull() {
            addCriterion("program_secret_id is null");
            return (Criteria) this;
        }

        public Criteria andProgramSecretIdIsNotNull() {
            addCriterion("program_secret_id is not null");
            return (Criteria) this;
        }

        public Criteria andProgramSecretIdEqualTo(String value) {
            addCriterion("program_secret_id =", value, "programSecretId");
            return (Criteria) this;
        }

        public Criteria andProgramSecretIdNotEqualTo(String value) {
            addCriterion("program_secret_id <>", value, "programSecretId");
            return (Criteria) this;
        }

        public Criteria andProgramSecretIdGreaterThan(String value) {
            addCriterion("program_secret_id >", value, "programSecretId");
            return (Criteria) this;
        }

        public Criteria andProgramSecretIdGreaterThanOrEqualTo(String value) {
            addCriterion("program_secret_id >=", value, "programSecretId");
            return (Criteria) this;
        }

        public Criteria andProgramSecretIdLessThan(String value) {
            addCriterion("program_secret_id <", value, "programSecretId");
            return (Criteria) this;
        }

        public Criteria andProgramSecretIdLessThanOrEqualTo(String value) {
            addCriterion("program_secret_id <=", value, "programSecretId");
            return (Criteria) this;
        }

        public Criteria andProgramSecretIdLike(String value) {
            addCriterion("program_secret_id like", value, "programSecretId");
            return (Criteria) this;
        }

        public Criteria andProgramSecretIdNotLike(String value) {
            addCriterion("program_secret_id not like", value, "programSecretId");
            return (Criteria) this;
        }

        public Criteria andProgramSecretIdIn(List<String> values) {
            addCriterion("program_secret_id in", values, "programSecretId");
            return (Criteria) this;
        }

        public Criteria andProgramSecretIdNotIn(List<String> values) {
            addCriterion("program_secret_id not in", values, "programSecretId");
            return (Criteria) this;
        }

        public Criteria andProgramSecretIdBetween(String value1, String value2) {
            addCriterion("program_secret_id between", value1, value2, "programSecretId");
            return (Criteria) this;
        }

        public Criteria andProgramSecretIdNotBetween(String value1, String value2) {
            addCriterion("program_secret_id not between", value1, value2, "programSecretId");
            return (Criteria) this;
        }

        public Criteria andPrivPkgNameIsNull() {
            addCriterion("priv_pkg_name is null");
            return (Criteria) this;
        }

        public Criteria andPrivPkgNameIsNotNull() {
            addCriterion("priv_pkg_name is not null");
            return (Criteria) this;
        }

        public Criteria andPrivPkgNameEqualTo(String value) {
            addCriterion("priv_pkg_name =", value, "privPkgName");
            return (Criteria) this;
        }

        public Criteria andPrivPkgNameNotEqualTo(String value) {
            addCriterion("priv_pkg_name <>", value, "privPkgName");
            return (Criteria) this;
        }

        public Criteria andPrivPkgNameGreaterThan(String value) {
            addCriterion("priv_pkg_name >", value, "privPkgName");
            return (Criteria) this;
        }

        public Criteria andPrivPkgNameGreaterThanOrEqualTo(String value) {
            addCriterion("priv_pkg_name >=", value, "privPkgName");
            return (Criteria) this;
        }

        public Criteria andPrivPkgNameLessThan(String value) {
            addCriterion("priv_pkg_name <", value, "privPkgName");
            return (Criteria) this;
        }

        public Criteria andPrivPkgNameLessThanOrEqualTo(String value) {
            addCriterion("priv_pkg_name <=", value, "privPkgName");
            return (Criteria) this;
        }

        public Criteria andPrivPkgNameLike(String value) {
            addCriterion("priv_pkg_name like", value, "privPkgName");
            return (Criteria) this;
        }

        public Criteria andPrivPkgNameNotLike(String value) {
            addCriterion("priv_pkg_name not like", value, "privPkgName");
            return (Criteria) this;
        }

        public Criteria andPrivPkgNameIn(List<String> values) {
            addCriterion("priv_pkg_name in", values, "privPkgName");
            return (Criteria) this;
        }

        public Criteria andPrivPkgNameNotIn(List<String> values) {
            addCriterion("priv_pkg_name not in", values, "privPkgName");
            return (Criteria) this;
        }

        public Criteria andPrivPkgNameBetween(String value1, String value2) {
            addCriterion("priv_pkg_name between", value1, value2, "privPkgName");
            return (Criteria) this;
        }

        public Criteria andPrivPkgNameNotBetween(String value1, String value2) {
            addCriterion("priv_pkg_name not between", value1, value2, "privPkgName");
            return (Criteria) this;
        }

        public Criteria andOnlineVersionIsNull() {
            addCriterion("online_version is null");
            return (Criteria) this;
        }

        public Criteria andOnlineVersionIsNotNull() {
            addCriterion("online_version is not null");
            return (Criteria) this;
        }

        public Criteria andOnlineVersionEqualTo(String value) {
            addCriterion("online_version =", value, "onlineVersion");
            return (Criteria) this;
        }

        public Criteria andOnlineVersionNotEqualTo(String value) {
            addCriterion("online_version <>", value, "onlineVersion");
            return (Criteria) this;
        }

        public Criteria andOnlineVersionGreaterThan(String value) {
            addCriterion("online_version >", value, "onlineVersion");
            return (Criteria) this;
        }

        public Criteria andOnlineVersionGreaterThanOrEqualTo(String value) {
            addCriterion("online_version >=", value, "onlineVersion");
            return (Criteria) this;
        }

        public Criteria andOnlineVersionLessThan(String value) {
            addCriterion("online_version <", value, "onlineVersion");
            return (Criteria) this;
        }

        public Criteria andOnlineVersionLessThanOrEqualTo(String value) {
            addCriterion("online_version <=", value, "onlineVersion");
            return (Criteria) this;
        }

        public Criteria andOnlineVersionLike(String value) {
            addCriterion("online_version like", value, "onlineVersion");
            return (Criteria) this;
        }

        public Criteria andOnlineVersionNotLike(String value) {
            addCriterion("online_version not like", value, "onlineVersion");
            return (Criteria) this;
        }

        public Criteria andOnlineVersionIn(List<String> values) {
            addCriterion("online_version in", values, "onlineVersion");
            return (Criteria) this;
        }

        public Criteria andOnlineVersionNotIn(List<String> values) {
            addCriterion("online_version not in", values, "onlineVersion");
            return (Criteria) this;
        }

        public Criteria andOnlineVersionBetween(String value1, String value2) {
            addCriterion("online_version between", value1, value2, "onlineVersion");
            return (Criteria) this;
        }

        public Criteria andOnlineVersionNotBetween(String value1, String value2) {
            addCriterion("online_version not between", value1, value2, "onlineVersion");
            return (Criteria) this;
        }

        public Criteria andOnlineVersionIdIsNull() {
            addCriterion("online_version_id is null");
            return (Criteria) this;
        }

        public Criteria andOnlineVersionIdIsNotNull() {
            addCriterion("online_version_id is not null");
            return (Criteria) this;
        }

        public Criteria andOnlineVersionIdEqualTo(String value) {
            addCriterion("online_version_id =", value, "onlineVersionId");
            return (Criteria) this;
        }

        public Criteria andOnlineVersionIdNotEqualTo(String value) {
            addCriterion("online_version_id <>", value, "onlineVersionId");
            return (Criteria) this;
        }

        public Criteria andOnlineVersionIdGreaterThan(String value) {
            addCriterion("online_version_id >", value, "onlineVersionId");
            return (Criteria) this;
        }

        public Criteria andOnlineVersionIdGreaterThanOrEqualTo(String value) {
            addCriterion("online_version_id >=", value, "onlineVersionId");
            return (Criteria) this;
        }

        public Criteria andOnlineVersionIdLessThan(String value) {
            addCriterion("online_version_id <", value, "onlineVersionId");
            return (Criteria) this;
        }

        public Criteria andOnlineVersionIdLessThanOrEqualTo(String value) {
            addCriterion("online_version_id <=", value, "onlineVersionId");
            return (Criteria) this;
        }

        public Criteria andOnlineVersionIdLike(String value) {
            addCriterion("online_version_id like", value, "onlineVersionId");
            return (Criteria) this;
        }

        public Criteria andOnlineVersionIdNotLike(String value) {
            addCriterion("online_version_id not like", value, "onlineVersionId");
            return (Criteria) this;
        }

        public Criteria andOnlineVersionIdIn(List<String> values) {
            addCriterion("online_version_id in", values, "onlineVersionId");
            return (Criteria) this;
        }

        public Criteria andOnlineVersionIdNotIn(List<String> values) {
            addCriterion("online_version_id not in", values, "onlineVersionId");
            return (Criteria) this;
        }

        public Criteria andOnlineVersionIdBetween(String value1, String value2) {
            addCriterion("online_version_id between", value1, value2, "onlineVersionId");
            return (Criteria) this;
        }

        public Criteria andOnlineVersionIdNotBetween(String value1, String value2) {
            addCriterion("online_version_id not between", value1, value2, "onlineVersionId");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNull() {
            addCriterion("priority is null");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNotNull() {
            addCriterion("priority is not null");
            return (Criteria) this;
        }

        public Criteria andPriorityEqualTo(Integer value) {
            addCriterion("priority =", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotEqualTo(Integer value) {
            addCriterion("priority <>", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThan(Integer value) {
            addCriterion("priority >", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThanOrEqualTo(Integer value) {
            addCriterion("priority >=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThan(Integer value) {
            addCriterion("priority <", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThanOrEqualTo(Integer value) {
            addCriterion("priority <=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityIn(List<Integer> values) {
            addCriterion("priority in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotIn(List<Integer> values) {
            addCriterion("priority not in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityBetween(Integer value1, Integer value2) {
            addCriterion("priority between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotBetween(Integer value1, Integer value2) {
            addCriterion("priority not between", value1, value2, "priority");
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

        public Criteria andDeveloperIdIsNull() {
            addCriterion("developer_id is null");
            return (Criteria) this;
        }

        public Criteria andDeveloperIdIsNotNull() {
            addCriterion("developer_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeveloperIdEqualTo(String value) {
            addCriterion("developer_id =", value, "developerId");
            return (Criteria) this;
        }

        public Criteria andDeveloperIdNotEqualTo(String value) {
            addCriterion("developer_id <>", value, "developerId");
            return (Criteria) this;
        }

        public Criteria andDeveloperIdGreaterThan(String value) {
            addCriterion("developer_id >", value, "developerId");
            return (Criteria) this;
        }

        public Criteria andDeveloperIdGreaterThanOrEqualTo(String value) {
            addCriterion("developer_id >=", value, "developerId");
            return (Criteria) this;
        }

        public Criteria andDeveloperIdLessThan(String value) {
            addCriterion("developer_id <", value, "developerId");
            return (Criteria) this;
        }

        public Criteria andDeveloperIdLessThanOrEqualTo(String value) {
            addCriterion("developer_id <=", value, "developerId");
            return (Criteria) this;
        }

        public Criteria andDeveloperIdLike(String value) {
            addCriterion("developer_id like", value, "developerId");
            return (Criteria) this;
        }

        public Criteria andDeveloperIdNotLike(String value) {
            addCriterion("developer_id not like", value, "developerId");
            return (Criteria) this;
        }

        public Criteria andDeveloperIdIn(List<String> values) {
            addCriterion("developer_id in", values, "developerId");
            return (Criteria) this;
        }

        public Criteria andDeveloperIdNotIn(List<String> values) {
            addCriterion("developer_id not in", values, "developerId");
            return (Criteria) this;
        }

        public Criteria andDeveloperIdBetween(String value1, String value2) {
            addCriterion("developer_id between", value1, value2, "developerId");
            return (Criteria) this;
        }

        public Criteria andDeveloperIdNotBetween(String value1, String value2) {
            addCriterion("developer_id not between", value1, value2, "developerId");
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