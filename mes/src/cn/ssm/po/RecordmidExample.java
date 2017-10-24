package cn.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class RecordmidExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RecordmidExample() {
        oredCriteria = new ArrayList<Criteria>();
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
            criteria = new ArrayList<Criterion>();
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andRecordmidunidIsNull() {
            addCriterion("RECORDMIDUNID is null");
            return (Criteria) this;
        }

        public Criteria andRecordmidunidIsNotNull() {
            addCriterion("RECORDMIDUNID is not null");
            return (Criteria) this;
        }

        public Criteria andRecordmidunidEqualTo(Integer value) {
            addCriterion("RECORDMIDUNID =", value, "recordmidunid");
            return (Criteria) this;
        }

        public Criteria andRecordmidunidNotEqualTo(Integer value) {
            addCriterion("RECORDMIDUNID <>", value, "recordmidunid");
            return (Criteria) this;
        }

        public Criteria andRecordmidunidGreaterThan(Integer value) {
            addCriterion("RECORDMIDUNID >", value, "recordmidunid");
            return (Criteria) this;
        }

        public Criteria andRecordmidunidGreaterThanOrEqualTo(Integer value) {
            addCriterion("RECORDMIDUNID >=", value, "recordmidunid");
            return (Criteria) this;
        }

        public Criteria andRecordmidunidLessThan(Integer value) {
            addCriterion("RECORDMIDUNID <", value, "recordmidunid");
            return (Criteria) this;
        }

        public Criteria andRecordmidunidLessThanOrEqualTo(Integer value) {
            addCriterion("RECORDMIDUNID <=", value, "recordmidunid");
            return (Criteria) this;
        }

        public Criteria andRecordmidunidIn(List<Integer> values) {
            addCriterion("RECORDMIDUNID in", values, "recordmidunid");
            return (Criteria) this;
        }

        public Criteria andRecordmidunidNotIn(List<Integer> values) {
            addCriterion("RECORDMIDUNID not in", values, "recordmidunid");
            return (Criteria) this;
        }

        public Criteria andRecordmidunidBetween(Integer value1, Integer value2) {
            addCriterion("RECORDMIDUNID between", value1, value2, "recordmidunid");
            return (Criteria) this;
        }

        public Criteria andRecordmidunidNotBetween(Integer value1, Integer value2) {
            addCriterion("RECORDMIDUNID not between", value1, value2, "recordmidunid");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNull() {
            addCriterion("DEPARTMENT is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNotNull() {
            addCriterion("DEPARTMENT is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentEqualTo(String value) {
            addCriterion("DEPARTMENT =", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotEqualTo(String value) {
            addCriterion("DEPARTMENT <>", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThan(String value) {
            addCriterion("DEPARTMENT >", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("DEPARTMENT >=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThan(String value) {
            addCriterion("DEPARTMENT <", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThanOrEqualTo(String value) {
            addCriterion("DEPARTMENT <=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLike(String value) {
            addCriterion("DEPARTMENT like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotLike(String value) {
            addCriterion("DEPARTMENT not like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentIn(List<String> values) {
            addCriterion("DEPARTMENT in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotIn(List<String> values) {
            addCriterion("DEPARTMENT not in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentBetween(String value1, String value2) {
            addCriterion("DEPARTMENT between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotBetween(String value1, String value2) {
            addCriterion("DEPARTMENT not between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andPiprofessionIsNull() {
            addCriterion("PIPROFESSION is null");
            return (Criteria) this;
        }

        public Criteria andPiprofessionIsNotNull() {
            addCriterion("PIPROFESSION is not null");
            return (Criteria) this;
        }

        public Criteria andPiprofessionEqualTo(String value) {
            addCriterion("PIPROFESSION =", value, "piprofession");
            return (Criteria) this;
        }

        public Criteria andPiprofessionNotEqualTo(String value) {
            addCriterion("PIPROFESSION <>", value, "piprofession");
            return (Criteria) this;
        }

        public Criteria andPiprofessionGreaterThan(String value) {
            addCriterion("PIPROFESSION >", value, "piprofession");
            return (Criteria) this;
        }

        public Criteria andPiprofessionGreaterThanOrEqualTo(String value) {
            addCriterion("PIPROFESSION >=", value, "piprofession");
            return (Criteria) this;
        }

        public Criteria andPiprofessionLessThan(String value) {
            addCriterion("PIPROFESSION <", value, "piprofession");
            return (Criteria) this;
        }

        public Criteria andPiprofessionLessThanOrEqualTo(String value) {
            addCriterion("PIPROFESSION <=", value, "piprofession");
            return (Criteria) this;
        }

        public Criteria andPiprofessionLike(String value) {
            addCriterion("PIPROFESSION like", value, "piprofession");
            return (Criteria) this;
        }

        public Criteria andPiprofessionNotLike(String value) {
            addCriterion("PIPROFESSION not like", value, "piprofession");
            return (Criteria) this;
        }

        public Criteria andPiprofessionIn(List<String> values) {
            addCriterion("PIPROFESSION in", values, "piprofession");
            return (Criteria) this;
        }

        public Criteria andPiprofessionNotIn(List<String> values) {
            addCriterion("PIPROFESSION not in", values, "piprofession");
            return (Criteria) this;
        }

        public Criteria andPiprofessionBetween(String value1, String value2) {
            addCriterion("PIPROFESSION between", value1, value2, "piprofession");
            return (Criteria) this;
        }

        public Criteria andPiprofessionNotBetween(String value1, String value2) {
            addCriterion("PIPROFESSION not between", value1, value2, "piprofession");
            return (Criteria) this;
        }

        public Criteria andPitypeIsNull() {
            addCriterion("PITYPE is null");
            return (Criteria) this;
        }

        public Criteria andPitypeIsNotNull() {
            addCriterion("PITYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPitypeEqualTo(String value) {
            addCriterion("PITYPE =", value, "pitype");
            return (Criteria) this;
        }

        public Criteria andPitypeNotEqualTo(String value) {
            addCriterion("PITYPE <>", value, "pitype");
            return (Criteria) this;
        }

        public Criteria andPitypeGreaterThan(String value) {
            addCriterion("PITYPE >", value, "pitype");
            return (Criteria) this;
        }

        public Criteria andPitypeGreaterThanOrEqualTo(String value) {
            addCriterion("PITYPE >=", value, "pitype");
            return (Criteria) this;
        }

        public Criteria andPitypeLessThan(String value) {
            addCriterion("PITYPE <", value, "pitype");
            return (Criteria) this;
        }

        public Criteria andPitypeLessThanOrEqualTo(String value) {
            addCriterion("PITYPE <=", value, "pitype");
            return (Criteria) this;
        }

        public Criteria andPitypeLike(String value) {
            addCriterion("PITYPE like", value, "pitype");
            return (Criteria) this;
        }

        public Criteria andPitypeNotLike(String value) {
            addCriterion("PITYPE not like", value, "pitype");
            return (Criteria) this;
        }

        public Criteria andPitypeIn(List<String> values) {
            addCriterion("PITYPE in", values, "pitype");
            return (Criteria) this;
        }

        public Criteria andPitypeNotIn(List<String> values) {
            addCriterion("PITYPE not in", values, "pitype");
            return (Criteria) this;
        }

        public Criteria andPitypeBetween(String value1, String value2) {
            addCriterion("PITYPE between", value1, value2, "pitype");
            return (Criteria) this;
        }

        public Criteria andPitypeNotBetween(String value1, String value2) {
            addCriterion("PITYPE not between", value1, value2, "pitype");
            return (Criteria) this;
        }

        public Criteria andPiplannumIsNull() {
            addCriterion("PIPLANNUM is null");
            return (Criteria) this;
        }

        public Criteria andPiplannumIsNotNull() {
            addCriterion("PIPLANNUM is not null");
            return (Criteria) this;
        }

        public Criteria andPiplannumEqualTo(String value) {
            addCriterion("PIPLANNUM =", value, "piplannum");
            return (Criteria) this;
        }

        public Criteria andPiplannumNotEqualTo(String value) {
            addCriterion("PIPLANNUM <>", value, "piplannum");
            return (Criteria) this;
        }

        public Criteria andPiplannumGreaterThan(String value) {
            addCriterion("PIPLANNUM >", value, "piplannum");
            return (Criteria) this;
        }

        public Criteria andPiplannumGreaterThanOrEqualTo(String value) {
            addCriterion("PIPLANNUM >=", value, "piplannum");
            return (Criteria) this;
        }

        public Criteria andPiplannumLessThan(String value) {
            addCriterion("PIPLANNUM <", value, "piplannum");
            return (Criteria) this;
        }

        public Criteria andPiplannumLessThanOrEqualTo(String value) {
            addCriterion("PIPLANNUM <=", value, "piplannum");
            return (Criteria) this;
        }

        public Criteria andPiplannumLike(String value) {
            addCriterion("PIPLANNUM like", value, "piplannum");
            return (Criteria) this;
        }

        public Criteria andPiplannumNotLike(String value) {
            addCriterion("PIPLANNUM not like", value, "piplannum");
            return (Criteria) this;
        }

        public Criteria andPiplannumIn(List<String> values) {
            addCriterion("PIPLANNUM in", values, "piplannum");
            return (Criteria) this;
        }

        public Criteria andPiplannumNotIn(List<String> values) {
            addCriterion("PIPLANNUM not in", values, "piplannum");
            return (Criteria) this;
        }

        public Criteria andPiplannumBetween(String value1, String value2) {
            addCriterion("PIPLANNUM between", value1, value2, "piplannum");
            return (Criteria) this;
        }

        public Criteria andPiplannumNotBetween(String value1, String value2) {
            addCriterion("PIPLANNUM not between", value1, value2, "piplannum");
            return (Criteria) this;
        }

        public Criteria andPiplandateIsNull() {
            addCriterion("PIPLANDATE is null");
            return (Criteria) this;
        }

        public Criteria andPiplandateIsNotNull() {
            addCriterion("PIPLANDATE is not null");
            return (Criteria) this;
        }

        public Criteria andPiplandateEqualTo(Date value) {
            addCriterionForJDBCDate("PIPLANDATE =", value, "piplandate");
            return (Criteria) this;
        }

        public Criteria andPiplandateNotEqualTo(Date value) {
            addCriterionForJDBCDate("PIPLANDATE <>", value, "piplandate");
            return (Criteria) this;
        }

        public Criteria andPiplandateGreaterThan(Date value) {
            addCriterionForJDBCDate("PIPLANDATE >", value, "piplandate");
            return (Criteria) this;
        }

        public Criteria andPiplandateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PIPLANDATE >=", value, "piplandate");
            return (Criteria) this;
        }

        public Criteria andPiplandateLessThan(Date value) {
            addCriterionForJDBCDate("PIPLANDATE <", value, "piplandate");
            return (Criteria) this;
        }

        public Criteria andPiplandateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PIPLANDATE <=", value, "piplandate");
            return (Criteria) this;
        }

        public Criteria andPiplandateIn(List<Date> values) {
            addCriterionForJDBCDate("PIPLANDATE in", values, "piplandate");
            return (Criteria) this;
        }

        public Criteria andPiplandateNotIn(List<Date> values) {
            addCriterionForJDBCDate("PIPLANDATE not in", values, "piplandate");
            return (Criteria) this;
        }

        public Criteria andPiplandateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PIPLANDATE between", value1, value2, "piplandate");
            return (Criteria) this;
        }

        public Criteria andPiplandateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PIPLANDATE not between", value1, value2, "piplandate");
            return (Criteria) this;
        }

        public Criteria andPibyIsNull() {
            addCriterion("PIBY is null");
            return (Criteria) this;
        }

        public Criteria andPibyIsNotNull() {
            addCriterion("PIBY is not null");
            return (Criteria) this;
        }

        public Criteria andPibyEqualTo(String value) {
            addCriterion("PIBY =", value, "piby");
            return (Criteria) this;
        }

        public Criteria andPibyNotEqualTo(String value) {
            addCriterion("PIBY <>", value, "piby");
            return (Criteria) this;
        }

        public Criteria andPibyGreaterThan(String value) {
            addCriterion("PIBY >", value, "piby");
            return (Criteria) this;
        }

        public Criteria andPibyGreaterThanOrEqualTo(String value) {
            addCriterion("PIBY >=", value, "piby");
            return (Criteria) this;
        }

        public Criteria andPibyLessThan(String value) {
            addCriterion("PIBY <", value, "piby");
            return (Criteria) this;
        }

        public Criteria andPibyLessThanOrEqualTo(String value) {
            addCriterion("PIBY <=", value, "piby");
            return (Criteria) this;
        }

        public Criteria andPibyLike(String value) {
            addCriterion("PIBY like", value, "piby");
            return (Criteria) this;
        }

        public Criteria andPibyNotLike(String value) {
            addCriterion("PIBY not like", value, "piby");
            return (Criteria) this;
        }

        public Criteria andPibyIn(List<String> values) {
            addCriterion("PIBY in", values, "piby");
            return (Criteria) this;
        }

        public Criteria andPibyNotIn(List<String> values) {
            addCriterion("PIBY not in", values, "piby");
            return (Criteria) this;
        }

        public Criteria andPibyBetween(String value1, String value2) {
            addCriterion("PIBY between", value1, value2, "piby");
            return (Criteria) this;
        }

        public Criteria andPibyNotBetween(String value1, String value2) {
            addCriterion("PIBY not between", value1, value2, "piby");
            return (Criteria) this;
        }

        public Criteria andEnterbyIsNull() {
            addCriterion("ENTERBY is null");
            return (Criteria) this;
        }

        public Criteria andEnterbyIsNotNull() {
            addCriterion("ENTERBY is not null");
            return (Criteria) this;
        }

        public Criteria andEnterbyEqualTo(String value) {
            addCriterion("ENTERBY =", value, "enterby");
            return (Criteria) this;
        }

        public Criteria andEnterbyNotEqualTo(String value) {
            addCriterion("ENTERBY <>", value, "enterby");
            return (Criteria) this;
        }

        public Criteria andEnterbyGreaterThan(String value) {
            addCriterion("ENTERBY >", value, "enterby");
            return (Criteria) this;
        }

        public Criteria andEnterbyGreaterThanOrEqualTo(String value) {
            addCriterion("ENTERBY >=", value, "enterby");
            return (Criteria) this;
        }

        public Criteria andEnterbyLessThan(String value) {
            addCriterion("ENTERBY <", value, "enterby");
            return (Criteria) this;
        }

        public Criteria andEnterbyLessThanOrEqualTo(String value) {
            addCriterion("ENTERBY <=", value, "enterby");
            return (Criteria) this;
        }

        public Criteria andEnterbyLike(String value) {
            addCriterion("ENTERBY like", value, "enterby");
            return (Criteria) this;
        }

        public Criteria andEnterbyNotLike(String value) {
            addCriterion("ENTERBY not like", value, "enterby");
            return (Criteria) this;
        }

        public Criteria andEnterbyIn(List<String> values) {
            addCriterion("ENTERBY in", values, "enterby");
            return (Criteria) this;
        }

        public Criteria andEnterbyNotIn(List<String> values) {
            addCriterion("ENTERBY not in", values, "enterby");
            return (Criteria) this;
        }

        public Criteria andEnterbyBetween(String value1, String value2) {
            addCriterion("ENTERBY between", value1, value2, "enterby");
            return (Criteria) this;
        }

        public Criteria andEnterbyNotBetween(String value1, String value2) {
            addCriterion("ENTERBY not between", value1, value2, "enterby");
            return (Criteria) this;
        }

        public Criteria andEnterdateIsNull() {
            addCriterion("ENTERDATE is null");
            return (Criteria) this;
        }

        public Criteria andEnterdateIsNotNull() {
            addCriterion("ENTERDATE is not null");
            return (Criteria) this;
        }

        public Criteria andEnterdateEqualTo(Date value) {
            addCriterion("ENTERDATE =", value, "enterdate");
            return (Criteria) this;
        }

        public Criteria andEnterdateNotEqualTo(Date value) {
            addCriterion("ENTERDATE <>", value, "enterdate");
            return (Criteria) this;
        }

        public Criteria andEnterdateGreaterThan(Date value) {
            addCriterion("ENTERDATE >", value, "enterdate");
            return (Criteria) this;
        }

        public Criteria andEnterdateGreaterThanOrEqualTo(Date value) {
            addCriterion("ENTERDATE >=", value, "enterdate");
            return (Criteria) this;
        }

        public Criteria andEnterdateLessThan(Date value) {
            addCriterion("ENTERDATE <", value, "enterdate");
            return (Criteria) this;
        }

        public Criteria andEnterdateLessThanOrEqualTo(Date value) {
            addCriterion("ENTERDATE <=", value, "enterdate");
            return (Criteria) this;
        }

        public Criteria andEnterdateIn(List<Date> values) {
            addCriterion("ENTERDATE in", values, "enterdate");
            return (Criteria) this;
        }

        public Criteria andEnterdateNotIn(List<Date> values) {
            addCriterion("ENTERDATE not in", values, "enterdate");
            return (Criteria) this;
        }

        public Criteria andEnterdateBetween(Date value1, Date value2) {
            addCriterion("ENTERDATE between", value1, value2, "enterdate");
            return (Criteria) this;
        }

        public Criteria andEnterdateNotBetween(Date value1, Date value2) {
            addCriterion("ENTERDATE not between", value1, value2, "enterdate");
            return (Criteria) this;
        }

        public Criteria andPirecordnumIsNull() {
            addCriterion("PIRECORDNUM is null");
            return (Criteria) this;
        }

        public Criteria andPirecordnumIsNotNull() {
            addCriterion("PIRECORDNUM is not null");
            return (Criteria) this;
        }

        public Criteria andPirecordnumEqualTo(String value) {
            addCriterion("PIRECORDNUM =", value, "pirecordnum");
            return (Criteria) this;
        }

        public Criteria andPirecordnumNotEqualTo(String value) {
            addCriterion("PIRECORDNUM <>", value, "pirecordnum");
            return (Criteria) this;
        }

        public Criteria andPirecordnumGreaterThan(String value) {
            addCriterion("PIRECORDNUM >", value, "pirecordnum");
            return (Criteria) this;
        }

        public Criteria andPirecordnumGreaterThanOrEqualTo(String value) {
            addCriterion("PIRECORDNUM >=", value, "pirecordnum");
            return (Criteria) this;
        }

        public Criteria andPirecordnumLessThan(String value) {
            addCriterion("PIRECORDNUM <", value, "pirecordnum");
            return (Criteria) this;
        }

        public Criteria andPirecordnumLessThanOrEqualTo(String value) {
            addCriterion("PIRECORDNUM <=", value, "pirecordnum");
            return (Criteria) this;
        }

        public Criteria andPirecordnumLike(String value) {
            addCriterion("PIRECORDNUM like", value, "pirecordnum");
            return (Criteria) this;
        }

        public Criteria andPirecordnumNotLike(String value) {
            addCriterion("PIRECORDNUM not like", value, "pirecordnum");
            return (Criteria) this;
        }

        public Criteria andPirecordnumIn(List<String> values) {
            addCriterion("PIRECORDNUM in", values, "pirecordnum");
            return (Criteria) this;
        }

        public Criteria andPirecordnumNotIn(List<String> values) {
            addCriterion("PIRECORDNUM not in", values, "pirecordnum");
            return (Criteria) this;
        }

        public Criteria andPirecordnumBetween(String value1, String value2) {
            addCriterion("PIRECORDNUM between", value1, value2, "pirecordnum");
            return (Criteria) this;
        }

        public Criteria andPirecordnumNotBetween(String value1, String value2) {
            addCriterion("PIRECORDNUM not between", value1, value2, "pirecordnum");
            return (Criteria) this;
        }

        public Criteria andAssetnumIsNull() {
            addCriterion("ASSETNUM is null");
            return (Criteria) this;
        }

        public Criteria andAssetnumIsNotNull() {
            addCriterion("ASSETNUM is not null");
            return (Criteria) this;
        }

        public Criteria andAssetnumEqualTo(String value) {
            addCriterion("ASSETNUM =", value, "assetnum");
            return (Criteria) this;
        }

        public Criteria andAssetnumNotEqualTo(String value) {
            addCriterion("ASSETNUM <>", value, "assetnum");
            return (Criteria) this;
        }

        public Criteria andAssetnumGreaterThan(String value) {
            addCriterion("ASSETNUM >", value, "assetnum");
            return (Criteria) this;
        }

        public Criteria andAssetnumGreaterThanOrEqualTo(String value) {
            addCriterion("ASSETNUM >=", value, "assetnum");
            return (Criteria) this;
        }

        public Criteria andAssetnumLessThan(String value) {
            addCriterion("ASSETNUM <", value, "assetnum");
            return (Criteria) this;
        }

        public Criteria andAssetnumLessThanOrEqualTo(String value) {
            addCriterion("ASSETNUM <=", value, "assetnum");
            return (Criteria) this;
        }

        public Criteria andAssetnumLike(String value) {
            addCriterion("ASSETNUM like", value, "assetnum");
            return (Criteria) this;
        }

        public Criteria andAssetnumNotLike(String value) {
            addCriterion("ASSETNUM not like", value, "assetnum");
            return (Criteria) this;
        }

        public Criteria andAssetnumIn(List<String> values) {
            addCriterion("ASSETNUM in", values, "assetnum");
            return (Criteria) this;
        }

        public Criteria andAssetnumNotIn(List<String> values) {
            addCriterion("ASSETNUM not in", values, "assetnum");
            return (Criteria) this;
        }

        public Criteria andAssetnumBetween(String value1, String value2) {
            addCriterion("ASSETNUM between", value1, value2, "assetnum");
            return (Criteria) this;
        }

        public Criteria andAssetnumNotBetween(String value1, String value2) {
            addCriterion("ASSETNUM not between", value1, value2, "assetnum");
            return (Criteria) this;
        }

        public Criteria andLocationIsNull() {
            addCriterion("LOCATION is null");
            return (Criteria) this;
        }

        public Criteria andLocationIsNotNull() {
            addCriterion("LOCATION is not null");
            return (Criteria) this;
        }

        public Criteria andLocationEqualTo(String value) {
            addCriterion("LOCATION =", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotEqualTo(String value) {
            addCriterion("LOCATION <>", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThan(String value) {
            addCriterion("LOCATION >", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThanOrEqualTo(String value) {
            addCriterion("LOCATION >=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThan(String value) {
            addCriterion("LOCATION <", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThanOrEqualTo(String value) {
            addCriterion("LOCATION <=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLike(String value) {
            addCriterion("LOCATION like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotLike(String value) {
            addCriterion("LOCATION not like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationIn(List<String> values) {
            addCriterion("LOCATION in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotIn(List<String> values) {
            addCriterion("LOCATION not in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationBetween(String value1, String value2) {
            addCriterion("LOCATION between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotBetween(String value1, String value2) {
            addCriterion("LOCATION not between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andPidateIsNull() {
            addCriterion("PIDATE is null");
            return (Criteria) this;
        }

        public Criteria andPidateIsNotNull() {
            addCriterion("PIDATE is not null");
            return (Criteria) this;
        }

        public Criteria andPidateEqualTo(Date value) {
            addCriterionForJDBCDate("PIDATE =", value, "pidate");
            return (Criteria) this;
        }

        public Criteria andPidateNotEqualTo(Date value) {
            addCriterionForJDBCDate("PIDATE <>", value, "pidate");
            return (Criteria) this;
        }

        public Criteria andPidateGreaterThan(Date value) {
            addCriterionForJDBCDate("PIDATE >", value, "pidate");
            return (Criteria) this;
        }

        public Criteria andPidateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PIDATE >=", value, "pidate");
            return (Criteria) this;
        }

        public Criteria andPidateLessThan(Date value) {
            addCriterionForJDBCDate("PIDATE <", value, "pidate");
            return (Criteria) this;
        }

        public Criteria andPidateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PIDATE <=", value, "pidate");
            return (Criteria) this;
        }

        public Criteria andPidateIn(List<Date> values) {
            addCriterionForJDBCDate("PIDATE in", values, "pidate");
            return (Criteria) this;
        }

        public Criteria andPidateNotIn(List<Date> values) {
            addCriterionForJDBCDate("PIDATE not in", values, "pidate");
            return (Criteria) this;
        }

        public Criteria andPidateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PIDATE between", value1, value2, "pidate");
            return (Criteria) this;
        }

        public Criteria andPidateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PIDATE not between", value1, value2, "pidate");
            return (Criteria) this;
        }

        public Criteria andIsstopIsNull() {
            addCriterion("ISSTOP is null");
            return (Criteria) this;
        }

        public Criteria andIsstopIsNotNull() {
            addCriterion("ISSTOP is not null");
            return (Criteria) this;
        }

        public Criteria andIsstopEqualTo(Integer value) {
            addCriterion("ISSTOP =", value, "isstop");
            return (Criteria) this;
        }

        public Criteria andIsstopNotEqualTo(Integer value) {
            addCriterion("ISSTOP <>", value, "isstop");
            return (Criteria) this;
        }

        public Criteria andIsstopGreaterThan(Integer value) {
            addCriterion("ISSTOP >", value, "isstop");
            return (Criteria) this;
        }

        public Criteria andIsstopGreaterThanOrEqualTo(Integer value) {
            addCriterion("ISSTOP >=", value, "isstop");
            return (Criteria) this;
        }

        public Criteria andIsstopLessThan(Integer value) {
            addCriterion("ISSTOP <", value, "isstop");
            return (Criteria) this;
        }

        public Criteria andIsstopLessThanOrEqualTo(Integer value) {
            addCriterion("ISSTOP <=", value, "isstop");
            return (Criteria) this;
        }

        public Criteria andIsstopIn(List<Integer> values) {
            addCriterion("ISSTOP in", values, "isstop");
            return (Criteria) this;
        }

        public Criteria andIsstopNotIn(List<Integer> values) {
            addCriterion("ISSTOP not in", values, "isstop");
            return (Criteria) this;
        }

        public Criteria andIsstopBetween(Integer value1, Integer value2) {
            addCriterion("ISSTOP between", value1, value2, "isstop");
            return (Criteria) this;
        }

        public Criteria andIsstopNotBetween(Integer value1, Integer value2) {
            addCriterion("ISSTOP not between", value1, value2, "isstop");
            return (Criteria) this;
        }

        public Criteria andPlateformIsNull() {
            addCriterion("PLATEFORM is null");
            return (Criteria) this;
        }

        public Criteria andPlateformIsNotNull() {
            addCriterion("PLATEFORM is not null");
            return (Criteria) this;
        }

        public Criteria andPlateformEqualTo(String value) {
            addCriterion("PLATEFORM =", value, "plateform");
            return (Criteria) this;
        }

        public Criteria andPlateformNotEqualTo(String value) {
            addCriterion("PLATEFORM <>", value, "plateform");
            return (Criteria) this;
        }

        public Criteria andPlateformGreaterThan(String value) {
            addCriterion("PLATEFORM >", value, "plateform");
            return (Criteria) this;
        }

        public Criteria andPlateformGreaterThanOrEqualTo(String value) {
            addCriterion("PLATEFORM >=", value, "plateform");
            return (Criteria) this;
        }

        public Criteria andPlateformLessThan(String value) {
            addCriterion("PLATEFORM <", value, "plateform");
            return (Criteria) this;
        }

        public Criteria andPlateformLessThanOrEqualTo(String value) {
            addCriterion("PLATEFORM <=", value, "plateform");
            return (Criteria) this;
        }

        public Criteria andPlateformLike(String value) {
            addCriterion("PLATEFORM like", value, "plateform");
            return (Criteria) this;
        }

        public Criteria andPlateformNotLike(String value) {
            addCriterion("PLATEFORM not like", value, "plateform");
            return (Criteria) this;
        }

        public Criteria andPlateformIn(List<String> values) {
            addCriterion("PLATEFORM in", values, "plateform");
            return (Criteria) this;
        }

        public Criteria andPlateformNotIn(List<String> values) {
            addCriterion("PLATEFORM not in", values, "plateform");
            return (Criteria) this;
        }

        public Criteria andPlateformBetween(String value1, String value2) {
            addCriterion("PLATEFORM between", value1, value2, "plateform");
            return (Criteria) this;
        }

        public Criteria andPlateformNotBetween(String value1, String value2) {
            addCriterion("PLATEFORM not between", value1, value2, "plateform");
            return (Criteria) this;
        }

        public Criteria andPirecordlinenumIsNull() {
            addCriterion("PIRECORDLINENUM is null");
            return (Criteria) this;
        }

        public Criteria andPirecordlinenumIsNotNull() {
            addCriterion("PIRECORDLINENUM is not null");
            return (Criteria) this;
        }

        public Criteria andPirecordlinenumEqualTo(Integer value) {
            addCriterion("PIRECORDLINENUM =", value, "pirecordlinenum");
            return (Criteria) this;
        }

        public Criteria andPirecordlinenumNotEqualTo(Integer value) {
            addCriterion("PIRECORDLINENUM <>", value, "pirecordlinenum");
            return (Criteria) this;
        }

        public Criteria andPirecordlinenumGreaterThan(Integer value) {
            addCriterion("PIRECORDLINENUM >", value, "pirecordlinenum");
            return (Criteria) this;
        }

        public Criteria andPirecordlinenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("PIRECORDLINENUM >=", value, "pirecordlinenum");
            return (Criteria) this;
        }

        public Criteria andPirecordlinenumLessThan(Integer value) {
            addCriterion("PIRECORDLINENUM <", value, "pirecordlinenum");
            return (Criteria) this;
        }

        public Criteria andPirecordlinenumLessThanOrEqualTo(Integer value) {
            addCriterion("PIRECORDLINENUM <=", value, "pirecordlinenum");
            return (Criteria) this;
        }

        public Criteria andPirecordlinenumIn(List<Integer> values) {
            addCriterion("PIRECORDLINENUM in", values, "pirecordlinenum");
            return (Criteria) this;
        }

        public Criteria andPirecordlinenumNotIn(List<Integer> values) {
            addCriterion("PIRECORDLINENUM not in", values, "pirecordlinenum");
            return (Criteria) this;
        }

        public Criteria andPirecordlinenumBetween(Integer value1, Integer value2) {
            addCriterion("PIRECORDLINENUM between", value1, value2, "pirecordlinenum");
            return (Criteria) this;
        }

        public Criteria andPirecordlinenumNotBetween(Integer value1, Integer value2) {
            addCriterion("PIRECORDLINENUM not between", value1, value2, "pirecordlinenum");
            return (Criteria) this;
        }

        public Criteria andPartlocIsNull() {
            addCriterion("PARTLOC is null");
            return (Criteria) this;
        }

        public Criteria andPartlocIsNotNull() {
            addCriterion("PARTLOC is not null");
            return (Criteria) this;
        }

        public Criteria andPartlocEqualTo(String value) {
            addCriterion("PARTLOC =", value, "partloc");
            return (Criteria) this;
        }

        public Criteria andPartlocNotEqualTo(String value) {
            addCriterion("PARTLOC <>", value, "partloc");
            return (Criteria) this;
        }

        public Criteria andPartlocGreaterThan(String value) {
            addCriterion("PARTLOC >", value, "partloc");
            return (Criteria) this;
        }

        public Criteria andPartlocGreaterThanOrEqualTo(String value) {
            addCriterion("PARTLOC >=", value, "partloc");
            return (Criteria) this;
        }

        public Criteria andPartlocLessThan(String value) {
            addCriterion("PARTLOC <", value, "partloc");
            return (Criteria) this;
        }

        public Criteria andPartlocLessThanOrEqualTo(String value) {
            addCriterion("PARTLOC <=", value, "partloc");
            return (Criteria) this;
        }

        public Criteria andPartlocLike(String value) {
            addCriterion("PARTLOC like", value, "partloc");
            return (Criteria) this;
        }

        public Criteria andPartlocNotLike(String value) {
            addCriterion("PARTLOC not like", value, "partloc");
            return (Criteria) this;
        }

        public Criteria andPartlocIn(List<String> values) {
            addCriterion("PARTLOC in", values, "partloc");
            return (Criteria) this;
        }

        public Criteria andPartlocNotIn(List<String> values) {
            addCriterion("PARTLOC not in", values, "partloc");
            return (Criteria) this;
        }

        public Criteria andPartlocBetween(String value1, String value2) {
            addCriterion("PARTLOC between", value1, value2, "partloc");
            return (Criteria) this;
        }

        public Criteria andPartlocNotBetween(String value1, String value2) {
            addCriterion("PARTLOC not between", value1, value2, "partloc");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("CONTENT =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("CONTENT <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("CONTENT >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("CONTENT >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("CONTENT <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("CONTENT <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("CONTENT like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("CONTENT not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("CONTENT in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("CONTENT not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("CONTENT between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("CONTENT not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andMethodIsNull() {
            addCriterion("METHOD is null");
            return (Criteria) this;
        }

        public Criteria andMethodIsNotNull() {
            addCriterion("METHOD is not null");
            return (Criteria) this;
        }

        public Criteria andMethodEqualTo(String value) {
            addCriterion("METHOD =", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodNotEqualTo(String value) {
            addCriterion("METHOD <>", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodGreaterThan(String value) {
            addCriterion("METHOD >", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodGreaterThanOrEqualTo(String value) {
            addCriterion("METHOD >=", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodLessThan(String value) {
            addCriterion("METHOD <", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodLessThanOrEqualTo(String value) {
            addCriterion("METHOD <=", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodLike(String value) {
            addCriterion("METHOD like", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodNotLike(String value) {
            addCriterion("METHOD not like", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodIn(List<String> values) {
            addCriterion("METHOD in", values, "method");
            return (Criteria) this;
        }

        public Criteria andMethodNotIn(List<String> values) {
            addCriterion("METHOD not in", values, "method");
            return (Criteria) this;
        }

        public Criteria andMethodBetween(String value1, String value2) {
            addCriterion("METHOD between", value1, value2, "method");
            return (Criteria) this;
        }

        public Criteria andMethodNotBetween(String value1, String value2) {
            addCriterion("METHOD not between", value1, value2, "method");
            return (Criteria) this;
        }

        public Criteria andStandardIsNull() {
            addCriterion("STANDARD is null");
            return (Criteria) this;
        }

        public Criteria andStandardIsNotNull() {
            addCriterion("STANDARD is not null");
            return (Criteria) this;
        }

        public Criteria andStandardEqualTo(String value) {
            addCriterion("STANDARD =", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotEqualTo(String value) {
            addCriterion("STANDARD <>", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardGreaterThan(String value) {
            addCriterion("STANDARD >", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardGreaterThanOrEqualTo(String value) {
            addCriterion("STANDARD >=", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardLessThan(String value) {
            addCriterion("STANDARD <", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardLessThanOrEqualTo(String value) {
            addCriterion("STANDARD <=", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardLike(String value) {
            addCriterion("STANDARD like", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotLike(String value) {
            addCriterion("STANDARD not like", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardIn(List<String> values) {
            addCriterion("STANDARD in", values, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotIn(List<String> values) {
            addCriterion("STANDARD not in", values, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardBetween(String value1, String value2) {
            addCriterion("STANDARD between", value1, value2, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotBetween(String value1, String value2) {
            addCriterion("STANDARD not between", value1, value2, "standard");
            return (Criteria) this;
        }

        public Criteria andPeriodIsNull() {
            addCriterion("PERIOD is null");
            return (Criteria) this;
        }

        public Criteria andPeriodIsNotNull() {
            addCriterion("PERIOD is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodEqualTo(String value) {
            addCriterion("PERIOD =", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodNotEqualTo(String value) {
            addCriterion("PERIOD <>", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodGreaterThan(String value) {
            addCriterion("PERIOD >", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodGreaterThanOrEqualTo(String value) {
            addCriterion("PERIOD >=", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodLessThan(String value) {
            addCriterion("PERIOD <", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodLessThanOrEqualTo(String value) {
            addCriterion("PERIOD <=", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodLike(String value) {
            addCriterion("PERIOD like", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodNotLike(String value) {
            addCriterion("PERIOD not like", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodIn(List<String> values) {
            addCriterion("PERIOD in", values, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodNotIn(List<String> values) {
            addCriterion("PERIOD not in", values, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodBetween(String value1, String value2) {
            addCriterion("PERIOD between", value1, value2, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodNotBetween(String value1, String value2) {
            addCriterion("PERIOD not between", value1, value2, "period");
            return (Criteria) this;
        }

        public Criteria andResultIsNull() {
            addCriterion("RESULT is null");
            return (Criteria) this;
        }

        public Criteria andResultIsNotNull() {
            addCriterion("RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andResultEqualTo(String value) {
            addCriterion("RESULT =", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotEqualTo(String value) {
            addCriterion("RESULT <>", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThan(String value) {
            addCriterion("RESULT >", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThanOrEqualTo(String value) {
            addCriterion("RESULT >=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThan(String value) {
            addCriterion("RESULT <", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThanOrEqualTo(String value) {
            addCriterion("RESULT <=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLike(String value) {
            addCriterion("RESULT like", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotLike(String value) {
            addCriterion("RESULT not like", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultIn(List<String> values) {
            addCriterion("RESULT in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotIn(List<String> values) {
            addCriterion("RESULT not in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultBetween(String value1, String value2) {
            addCriterion("RESULT between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotBetween(String value1, String value2) {
            addCriterion("RESULT not between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andRecordIsNull() {
            addCriterion("RECORD is null");
            return (Criteria) this;
        }

        public Criteria andRecordIsNotNull() {
            addCriterion("RECORD is not null");
            return (Criteria) this;
        }

        public Criteria andRecordEqualTo(String value) {
            addCriterion("RECORD =", value, "record");
            return (Criteria) this;
        }

        public Criteria andRecordNotEqualTo(String value) {
            addCriterion("RECORD <>", value, "record");
            return (Criteria) this;
        }

        public Criteria andRecordGreaterThan(String value) {
            addCriterion("RECORD >", value, "record");
            return (Criteria) this;
        }

        public Criteria andRecordGreaterThanOrEqualTo(String value) {
            addCriterion("RECORD >=", value, "record");
            return (Criteria) this;
        }

        public Criteria andRecordLessThan(String value) {
            addCriterion("RECORD <", value, "record");
            return (Criteria) this;
        }

        public Criteria andRecordLessThanOrEqualTo(String value) {
            addCriterion("RECORD <=", value, "record");
            return (Criteria) this;
        }

        public Criteria andRecordLike(String value) {
            addCriterion("RECORD like", value, "record");
            return (Criteria) this;
        }

        public Criteria andRecordNotLike(String value) {
            addCriterion("RECORD not like", value, "record");
            return (Criteria) this;
        }

        public Criteria andRecordIn(List<String> values) {
            addCriterion("RECORD in", values, "record");
            return (Criteria) this;
        }

        public Criteria andRecordNotIn(List<String> values) {
            addCriterion("RECORD not in", values, "record");
            return (Criteria) this;
        }

        public Criteria andRecordBetween(String value1, String value2) {
            addCriterion("RECORD between", value1, value2, "record");
            return (Criteria) this;
        }

        public Criteria andRecordNotBetween(String value1, String value2) {
            addCriterion("RECORD not between", value1, value2, "record");
            return (Criteria) this;
        }

        public Criteria andUndoneIsNull() {
            addCriterion("UNDONE is null");
            return (Criteria) this;
        }

        public Criteria andUndoneIsNotNull() {
            addCriterion("UNDONE is not null");
            return (Criteria) this;
        }

        public Criteria andUndoneEqualTo(Integer value) {
            addCriterion("UNDONE =", value, "undone");
            return (Criteria) this;
        }

        public Criteria andUndoneNotEqualTo(Integer value) {
            addCriterion("UNDONE <>", value, "undone");
            return (Criteria) this;
        }

        public Criteria andUndoneGreaterThan(Integer value) {
            addCriterion("UNDONE >", value, "undone");
            return (Criteria) this;
        }

        public Criteria andUndoneGreaterThanOrEqualTo(Integer value) {
            addCriterion("UNDONE >=", value, "undone");
            return (Criteria) this;
        }

        public Criteria andUndoneLessThan(Integer value) {
            addCriterion("UNDONE <", value, "undone");
            return (Criteria) this;
        }

        public Criteria andUndoneLessThanOrEqualTo(Integer value) {
            addCriterion("UNDONE <=", value, "undone");
            return (Criteria) this;
        }

        public Criteria andUndoneIn(List<Integer> values) {
            addCriterion("UNDONE in", values, "undone");
            return (Criteria) this;
        }

        public Criteria andUndoneNotIn(List<Integer> values) {
            addCriterion("UNDONE not in", values, "undone");
            return (Criteria) this;
        }

        public Criteria andUndoneBetween(Integer value1, Integer value2) {
            addCriterion("UNDONE between", value1, value2, "undone");
            return (Criteria) this;
        }

        public Criteria andUndoneNotBetween(Integer value1, Integer value2) {
            addCriterion("UNDONE not between", value1, value2, "undone");
            return (Criteria) this;
        }

        public Criteria andReadstatusIsNull() {
            addCriterion("READSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andReadstatusIsNotNull() {
            addCriterion("READSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andReadstatusEqualTo(Integer value) {
            addCriterion("READSTATUS =", value, "readstatus");
            return (Criteria) this;
        }

        public Criteria andReadstatusNotEqualTo(Integer value) {
            addCriterion("READSTATUS <>", value, "readstatus");
            return (Criteria) this;
        }

        public Criteria andReadstatusGreaterThan(Integer value) {
            addCriterion("READSTATUS >", value, "readstatus");
            return (Criteria) this;
        }

        public Criteria andReadstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("READSTATUS >=", value, "readstatus");
            return (Criteria) this;
        }

        public Criteria andReadstatusLessThan(Integer value) {
            addCriterion("READSTATUS <", value, "readstatus");
            return (Criteria) this;
        }

        public Criteria andReadstatusLessThanOrEqualTo(Integer value) {
            addCriterion("READSTATUS <=", value, "readstatus");
            return (Criteria) this;
        }

        public Criteria andReadstatusIn(List<Integer> values) {
            addCriterion("READSTATUS in", values, "readstatus");
            return (Criteria) this;
        }

        public Criteria andReadstatusNotIn(List<Integer> values) {
            addCriterion("READSTATUS not in", values, "readstatus");
            return (Criteria) this;
        }

        public Criteria andReadstatusBetween(Integer value1, Integer value2) {
            addCriterion("READSTATUS between", value1, value2, "readstatus");
            return (Criteria) this;
        }

        public Criteria andReadstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("READSTATUS not between", value1, value2, "readstatus");
            return (Criteria) this;
        }

        public Criteria andReadtimeIsNull() {
            addCriterion("READTIME is null");
            return (Criteria) this;
        }

        public Criteria andReadtimeIsNotNull() {
            addCriterion("READTIME is not null");
            return (Criteria) this;
        }

        public Criteria andReadtimeEqualTo(Date value) {
            addCriterion("READTIME =", value, "readtime");
            return (Criteria) this;
        }

        public Criteria andReadtimeNotEqualTo(Date value) {
            addCriterion("READTIME <>", value, "readtime");
            return (Criteria) this;
        }

        public Criteria andReadtimeGreaterThan(Date value) {
            addCriterion("READTIME >", value, "readtime");
            return (Criteria) this;
        }

        public Criteria andReadtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("READTIME >=", value, "readtime");
            return (Criteria) this;
        }

        public Criteria andReadtimeLessThan(Date value) {
            addCriterion("READTIME <", value, "readtime");
            return (Criteria) this;
        }

        public Criteria andReadtimeLessThanOrEqualTo(Date value) {
            addCriterion("READTIME <=", value, "readtime");
            return (Criteria) this;
        }

        public Criteria andReadtimeIn(List<Date> values) {
            addCriterion("READTIME in", values, "readtime");
            return (Criteria) this;
        }

        public Criteria andReadtimeNotIn(List<Date> values) {
            addCriterion("READTIME not in", values, "readtime");
            return (Criteria) this;
        }

        public Criteria andReadtimeBetween(Date value1, Date value2) {
            addCriterion("READTIME between", value1, value2, "readtime");
            return (Criteria) this;
        }

        public Criteria andReadtimeNotBetween(Date value1, Date value2) {
            addCriterion("READTIME not between", value1, value2, "readtime");
            return (Criteria) this;
        }

        public Criteria andOpstatusIsNull() {
            addCriterion("OPSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andOpstatusIsNotNull() {
            addCriterion("OPSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andOpstatusEqualTo(String value) {
            addCriterion("OPSTATUS =", value, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusNotEqualTo(String value) {
            addCriterion("OPSTATUS <>", value, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusGreaterThan(String value) {
            addCriterion("OPSTATUS >", value, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusGreaterThanOrEqualTo(String value) {
            addCriterion("OPSTATUS >=", value, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusLessThan(String value) {
            addCriterion("OPSTATUS <", value, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusLessThanOrEqualTo(String value) {
            addCriterion("OPSTATUS <=", value, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusLike(String value) {
            addCriterion("OPSTATUS like", value, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusNotLike(String value) {
            addCriterion("OPSTATUS not like", value, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusIn(List<String> values) {
            addCriterion("OPSTATUS in", values, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusNotIn(List<String> values) {
            addCriterion("OPSTATUS not in", values, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusBetween(String value1, String value2) {
            addCriterion("OPSTATUS between", value1, value2, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusNotBetween(String value1, String value2) {
            addCriterion("OPSTATUS not between", value1, value2, "opstatus");
            return (Criteria) this;
        }

        public Criteria andSiteidIsNull() {
            addCriterion("SITEID is null");
            return (Criteria) this;
        }

        public Criteria andSiteidIsNotNull() {
            addCriterion("SITEID is not null");
            return (Criteria) this;
        }

        public Criteria andSiteidEqualTo(String value) {
            addCriterion("SITEID =", value, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidNotEqualTo(String value) {
            addCriterion("SITEID <>", value, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidGreaterThan(String value) {
            addCriterion("SITEID >", value, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidGreaterThanOrEqualTo(String value) {
            addCriterion("SITEID >=", value, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidLessThan(String value) {
            addCriterion("SITEID <", value, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidLessThanOrEqualTo(String value) {
            addCriterion("SITEID <=", value, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidLike(String value) {
            addCriterion("SITEID like", value, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidNotLike(String value) {
            addCriterion("SITEID not like", value, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidIn(List<String> values) {
            addCriterion("SITEID in", values, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidNotIn(List<String> values) {
            addCriterion("SITEID not in", values, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidBetween(String value1, String value2) {
            addCriterion("SITEID between", value1, value2, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidNotBetween(String value1, String value2) {
            addCriterion("SITEID not between", value1, value2, "siteid");
            return (Criteria) this;
        }

        public Criteria andOrgidIsNull() {
            addCriterion("ORGID is null");
            return (Criteria) this;
        }

        public Criteria andOrgidIsNotNull() {
            addCriterion("ORGID is not null");
            return (Criteria) this;
        }

        public Criteria andOrgidEqualTo(String value) {
            addCriterion("ORGID =", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotEqualTo(String value) {
            addCriterion("ORGID <>", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidGreaterThan(String value) {
            addCriterion("ORGID >", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidGreaterThanOrEqualTo(String value) {
            addCriterion("ORGID >=", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidLessThan(String value) {
            addCriterion("ORGID <", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidLessThanOrEqualTo(String value) {
            addCriterion("ORGID <=", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidLike(String value) {
            addCriterion("ORGID like", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotLike(String value) {
            addCriterion("ORGID not like", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidIn(List<String> values) {
            addCriterion("ORGID in", values, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotIn(List<String> values) {
            addCriterion("ORGID not in", values, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidBetween(String value1, String value2) {
            addCriterion("ORGID between", value1, value2, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotBetween(String value1, String value2) {
            addCriterion("ORGID not between", value1, value2, "orgid");
            return (Criteria) this;
        }

        public Criteria andUploadflagIsNull() {
            addCriterion("UPLOADFLAG is null");
            return (Criteria) this;
        }

        public Criteria andUploadflagIsNotNull() {
            addCriterion("UPLOADFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andUploadflagEqualTo(Boolean value) {
            addCriterion("UPLOADFLAG =", value, "uploadflag");
            return (Criteria) this;
        }

        public Criteria andUploadflagNotEqualTo(Boolean value) {
            addCriterion("UPLOADFLAG <>", value, "uploadflag");
            return (Criteria) this;
        }

        public Criteria andUploadflagGreaterThan(Boolean value) {
            addCriterion("UPLOADFLAG >", value, "uploadflag");
            return (Criteria) this;
        }

        public Criteria andUploadflagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("UPLOADFLAG >=", value, "uploadflag");
            return (Criteria) this;
        }

        public Criteria andUploadflagLessThan(Boolean value) {
            addCriterion("UPLOADFLAG <", value, "uploadflag");
            return (Criteria) this;
        }

        public Criteria andUploadflagLessThanOrEqualTo(Boolean value) {
            addCriterion("UPLOADFLAG <=", value, "uploadflag");
            return (Criteria) this;
        }

        public Criteria andUploadflagIn(List<Boolean> values) {
            addCriterion("UPLOADFLAG in", values, "uploadflag");
            return (Criteria) this;
        }

        public Criteria andUploadflagNotIn(List<Boolean> values) {
            addCriterion("UPLOADFLAG not in", values, "uploadflag");
            return (Criteria) this;
        }

        public Criteria andUploadflagBetween(Boolean value1, Boolean value2) {
            addCriterion("UPLOADFLAG between", value1, value2, "uploadflag");
            return (Criteria) this;
        }

        public Criteria andUploadflagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("UPLOADFLAG not between", value1, value2, "uploadflag");
            return (Criteria) this;
        }

        public Criteria andUploadtimeIsNull() {
            addCriterion("UPLOADTIME is null");
            return (Criteria) this;
        }

        public Criteria andUploadtimeIsNotNull() {
            addCriterion("UPLOADTIME is not null");
            return (Criteria) this;
        }

        public Criteria andUploadtimeEqualTo(Date value) {
            addCriterion("UPLOADTIME =", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeNotEqualTo(Date value) {
            addCriterion("UPLOADTIME <>", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeGreaterThan(Date value) {
            addCriterion("UPLOADTIME >", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPLOADTIME >=", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeLessThan(Date value) {
            addCriterion("UPLOADTIME <", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeLessThanOrEqualTo(Date value) {
            addCriterion("UPLOADTIME <=", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeIn(List<Date> values) {
            addCriterion("UPLOADTIME in", values, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeNotIn(List<Date> values) {
            addCriterion("UPLOADTIME not in", values, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeBetween(Date value1, Date value2) {
            addCriterion("UPLOADTIME between", value1, value2, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeNotBetween(Date value1, Date value2) {
            addCriterion("UPLOADTIME not between", value1, value2, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andActionIsNull() {
            addCriterion("ACTION is null");
            return (Criteria) this;
        }

        public Criteria andActionIsNotNull() {
            addCriterion("ACTION is not null");
            return (Criteria) this;
        }

        public Criteria andActionEqualTo(String value) {
            addCriterion("ACTION =", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionNotEqualTo(String value) {
            addCriterion("ACTION <>", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionGreaterThan(String value) {
            addCriterion("ACTION >", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionGreaterThanOrEqualTo(String value) {
            addCriterion("ACTION >=", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionLessThan(String value) {
            addCriterion("ACTION <", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionLessThanOrEqualTo(String value) {
            addCriterion("ACTION <=", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionLike(String value) {
            addCriterion("ACTION like", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionNotLike(String value) {
            addCriterion("ACTION not like", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionIn(List<String> values) {
            addCriterion("ACTION in", values, "action");
            return (Criteria) this;
        }

        public Criteria andActionNotIn(List<String> values) {
            addCriterion("ACTION not in", values, "action");
            return (Criteria) this;
        }

        public Criteria andActionBetween(String value1, String value2) {
            addCriterion("ACTION between", value1, value2, "action");
            return (Criteria) this;
        }

        public Criteria andActionNotBetween(String value1, String value2) {
            addCriterion("ACTION not between", value1, value2, "action");
            return (Criteria) this;
        }

        public Criteria andActiontimeIsNull() {
            addCriterion("ACTIONTIME is null");
            return (Criteria) this;
        }

        public Criteria andActiontimeIsNotNull() {
            addCriterion("ACTIONTIME is not null");
            return (Criteria) this;
        }

        public Criteria andActiontimeEqualTo(Date value) {
            addCriterion("ACTIONTIME =", value, "actiontime");
            return (Criteria) this;
        }

        public Criteria andActiontimeNotEqualTo(Date value) {
            addCriterion("ACTIONTIME <>", value, "actiontime");
            return (Criteria) this;
        }

        public Criteria andActiontimeGreaterThan(Date value) {
            addCriterion("ACTIONTIME >", value, "actiontime");
            return (Criteria) this;
        }

        public Criteria andActiontimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ACTIONTIME >=", value, "actiontime");
            return (Criteria) this;
        }

        public Criteria andActiontimeLessThan(Date value) {
            addCriterion("ACTIONTIME <", value, "actiontime");
            return (Criteria) this;
        }

        public Criteria andActiontimeLessThanOrEqualTo(Date value) {
            addCriterion("ACTIONTIME <=", value, "actiontime");
            return (Criteria) this;
        }

        public Criteria andActiontimeIn(List<Date> values) {
            addCriterion("ACTIONTIME in", values, "actiontime");
            return (Criteria) this;
        }

        public Criteria andActiontimeNotIn(List<Date> values) {
            addCriterion("ACTIONTIME not in", values, "actiontime");
            return (Criteria) this;
        }

        public Criteria andActiontimeBetween(Date value1, Date value2) {
            addCriterion("ACTIONTIME between", value1, value2, "actiontime");
            return (Criteria) this;
        }

        public Criteria andActiontimeNotBetween(Date value1, Date value2) {
            addCriterion("ACTIONTIME not between", value1, value2, "actiontime");
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