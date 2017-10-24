package cn.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CrecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CrecordExample() {
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

        public Criteria andUnidcrecordIsNull() {
            addCriterion("UNIDCRECORD is null");
            return (Criteria) this;
        }

        public Criteria andUnidcrecordIsNotNull() {
            addCriterion("UNIDCRECORD is not null");
            return (Criteria) this;
        }

        public Criteria andUnidcrecordEqualTo(Integer value) {
            addCriterion("UNIDCRECORD =", value, "unidcrecord");
            return (Criteria) this;
        }

        public Criteria andUnidcrecordNotEqualTo(Integer value) {
            addCriterion("UNIDCRECORD <>", value, "unidcrecord");
            return (Criteria) this;
        }

        public Criteria andUnidcrecordGreaterThan(Integer value) {
            addCriterion("UNIDCRECORD >", value, "unidcrecord");
            return (Criteria) this;
        }

        public Criteria andUnidcrecordGreaterThanOrEqualTo(Integer value) {
            addCriterion("UNIDCRECORD >=", value, "unidcrecord");
            return (Criteria) this;
        }

        public Criteria andUnidcrecordLessThan(Integer value) {
            addCriterion("UNIDCRECORD <", value, "unidcrecord");
            return (Criteria) this;
        }

        public Criteria andUnidcrecordLessThanOrEqualTo(Integer value) {
            addCriterion("UNIDCRECORD <=", value, "unidcrecord");
            return (Criteria) this;
        }

        public Criteria andUnidcrecordIn(List<Integer> values) {
            addCriterion("UNIDCRECORD in", values, "unidcrecord");
            return (Criteria) this;
        }

        public Criteria andUnidcrecordNotIn(List<Integer> values) {
            addCriterion("UNIDCRECORD not in", values, "unidcrecord");
            return (Criteria) this;
        }

        public Criteria andUnidcrecordBetween(Integer value1, Integer value2) {
            addCriterion("UNIDCRECORD between", value1, value2, "unidcrecord");
            return (Criteria) this;
        }

        public Criteria andUnidcrecordNotBetween(Integer value1, Integer value2) {
            addCriterion("UNIDCRECORD not between", value1, value2, "unidcrecord");
            return (Criteria) this;
        }

        public Criteria andCplannumIsNull() {
            addCriterion("CPLANNUM is null");
            return (Criteria) this;
        }

        public Criteria andCplannumIsNotNull() {
            addCriterion("CPLANNUM is not null");
            return (Criteria) this;
        }

        public Criteria andCplannumEqualTo(String value) {
            addCriterion("CPLANNUM =", value, "cplannum");
            return (Criteria) this;
        }

        public Criteria andCplannumNotEqualTo(String value) {
            addCriterion("CPLANNUM <>", value, "cplannum");
            return (Criteria) this;
        }

        public Criteria andCplannumGreaterThan(String value) {
            addCriterion("CPLANNUM >", value, "cplannum");
            return (Criteria) this;
        }

        public Criteria andCplannumGreaterThanOrEqualTo(String value) {
            addCriterion("CPLANNUM >=", value, "cplannum");
            return (Criteria) this;
        }

        public Criteria andCplannumLessThan(String value) {
            addCriterion("CPLANNUM <", value, "cplannum");
            return (Criteria) this;
        }

        public Criteria andCplannumLessThanOrEqualTo(String value) {
            addCriterion("CPLANNUM <=", value, "cplannum");
            return (Criteria) this;
        }

        public Criteria andCplannumLike(String value) {
            addCriterion("CPLANNUM like", value, "cplannum");
            return (Criteria) this;
        }

        public Criteria andCplannumNotLike(String value) {
            addCriterion("CPLANNUM not like", value, "cplannum");
            return (Criteria) this;
        }

        public Criteria andCplannumIn(List<String> values) {
            addCriterion("CPLANNUM in", values, "cplannum");
            return (Criteria) this;
        }

        public Criteria andCplannumNotIn(List<String> values) {
            addCriterion("CPLANNUM not in", values, "cplannum");
            return (Criteria) this;
        }

        public Criteria andCplannumBetween(String value1, String value2) {
            addCriterion("CPLANNUM between", value1, value2, "cplannum");
            return (Criteria) this;
        }

        public Criteria andCplannumNotBetween(String value1, String value2) {
            addCriterion("CPLANNUM not between", value1, value2, "cplannum");
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

        public Criteria andDodateIsNull() {
            addCriterion("DODATE is null");
            return (Criteria) this;
        }

        public Criteria andDodateIsNotNull() {
            addCriterion("DODATE is not null");
            return (Criteria) this;
        }

        public Criteria andDodateEqualTo(Date value) {
            addCriterionForJDBCDate("DODATE =", value, "dodate");
            return (Criteria) this;
        }

        public Criteria andDodateNotEqualTo(Date value) {
            addCriterionForJDBCDate("DODATE <>", value, "dodate");
            return (Criteria) this;
        }

        public Criteria andDodateGreaterThan(Date value) {
            addCriterionForJDBCDate("DODATE >", value, "dodate");
            return (Criteria) this;
        }

        public Criteria andDodateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DODATE >=", value, "dodate");
            return (Criteria) this;
        }

        public Criteria andDodateLessThan(Date value) {
            addCriterionForJDBCDate("DODATE <", value, "dodate");
            return (Criteria) this;
        }

        public Criteria andDodateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DODATE <=", value, "dodate");
            return (Criteria) this;
        }

        public Criteria andDodateIn(List<Date> values) {
            addCriterionForJDBCDate("DODATE in", values, "dodate");
            return (Criteria) this;
        }

        public Criteria andDodateNotIn(List<Date> values) {
            addCriterionForJDBCDate("DODATE not in", values, "dodate");
            return (Criteria) this;
        }

        public Criteria andDodateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DODATE between", value1, value2, "dodate");
            return (Criteria) this;
        }

        public Criteria andDodateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DODATE not between", value1, value2, "dodate");
            return (Criteria) this;
        }

        public Criteria andDoregularIsNull() {
            addCriterion("DOREGULAR is null");
            return (Criteria) this;
        }

        public Criteria andDoregularIsNotNull() {
            addCriterion("DOREGULAR is not null");
            return (Criteria) this;
        }

        public Criteria andDoregularEqualTo(String value) {
            addCriterion("DOREGULAR =", value, "doregular");
            return (Criteria) this;
        }

        public Criteria andDoregularNotEqualTo(String value) {
            addCriterion("DOREGULAR <>", value, "doregular");
            return (Criteria) this;
        }

        public Criteria andDoregularGreaterThan(String value) {
            addCriterion("DOREGULAR >", value, "doregular");
            return (Criteria) this;
        }

        public Criteria andDoregularGreaterThanOrEqualTo(String value) {
            addCriterion("DOREGULAR >=", value, "doregular");
            return (Criteria) this;
        }

        public Criteria andDoregularLessThan(String value) {
            addCriterion("DOREGULAR <", value, "doregular");
            return (Criteria) this;
        }

        public Criteria andDoregularLessThanOrEqualTo(String value) {
            addCriterion("DOREGULAR <=", value, "doregular");
            return (Criteria) this;
        }

        public Criteria andDoregularLike(String value) {
            addCriterion("DOREGULAR like", value, "doregular");
            return (Criteria) this;
        }

        public Criteria andDoregularNotLike(String value) {
            addCriterion("DOREGULAR not like", value, "doregular");
            return (Criteria) this;
        }

        public Criteria andDoregularIn(List<String> values) {
            addCriterion("DOREGULAR in", values, "doregular");
            return (Criteria) this;
        }

        public Criteria andDoregularNotIn(List<String> values) {
            addCriterion("DOREGULAR not in", values, "doregular");
            return (Criteria) this;
        }

        public Criteria andDoregularBetween(String value1, String value2) {
            addCriterion("DOREGULAR between", value1, value2, "doregular");
            return (Criteria) this;
        }

        public Criteria andDoregularNotBetween(String value1, String value2) {
            addCriterion("DOREGULAR not between", value1, value2, "doregular");
            return (Criteria) this;
        }

        public Criteria andClinenumIsNull() {
            addCriterion("CLINENUM is null");
            return (Criteria) this;
        }

        public Criteria andClinenumIsNotNull() {
            addCriterion("CLINENUM is not null");
            return (Criteria) this;
        }

        public Criteria andClinenumEqualTo(Integer value) {
            addCriterion("CLINENUM =", value, "clinenum");
            return (Criteria) this;
        }

        public Criteria andClinenumNotEqualTo(Integer value) {
            addCriterion("CLINENUM <>", value, "clinenum");
            return (Criteria) this;
        }

        public Criteria andClinenumGreaterThan(Integer value) {
            addCriterion("CLINENUM >", value, "clinenum");
            return (Criteria) this;
        }

        public Criteria andClinenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("CLINENUM >=", value, "clinenum");
            return (Criteria) this;
        }

        public Criteria andClinenumLessThan(Integer value) {
            addCriterion("CLINENUM <", value, "clinenum");
            return (Criteria) this;
        }

        public Criteria andClinenumLessThanOrEqualTo(Integer value) {
            addCriterion("CLINENUM <=", value, "clinenum");
            return (Criteria) this;
        }

        public Criteria andClinenumIn(List<Integer> values) {
            addCriterion("CLINENUM in", values, "clinenum");
            return (Criteria) this;
        }

        public Criteria andClinenumNotIn(List<Integer> values) {
            addCriterion("CLINENUM not in", values, "clinenum");
            return (Criteria) this;
        }

        public Criteria andClinenumBetween(Integer value1, Integer value2) {
            addCriterion("CLINENUM between", value1, value2, "clinenum");
            return (Criteria) this;
        }

        public Criteria andClinenumNotBetween(Integer value1, Integer value2) {
            addCriterion("CLINENUM not between", value1, value2, "clinenum");
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

        public Criteria andResult1IsNull() {
            addCriterion("RESULT1 is null");
            return (Criteria) this;
        }

        public Criteria andResult1IsNotNull() {
            addCriterion("RESULT1 is not null");
            return (Criteria) this;
        }

        public Criteria andResult1EqualTo(String value) {
            addCriterion("RESULT1 =", value, "result1");
            return (Criteria) this;
        }

        public Criteria andResult1NotEqualTo(String value) {
            addCriterion("RESULT1 <>", value, "result1");
            return (Criteria) this;
        }

        public Criteria andResult1GreaterThan(String value) {
            addCriterion("RESULT1 >", value, "result1");
            return (Criteria) this;
        }

        public Criteria andResult1GreaterThanOrEqualTo(String value) {
            addCriterion("RESULT1 >=", value, "result1");
            return (Criteria) this;
        }

        public Criteria andResult1LessThan(String value) {
            addCriterion("RESULT1 <", value, "result1");
            return (Criteria) this;
        }

        public Criteria andResult1LessThanOrEqualTo(String value) {
            addCriterion("RESULT1 <=", value, "result1");
            return (Criteria) this;
        }

        public Criteria andResult1Like(String value) {
            addCriterion("RESULT1 like", value, "result1");
            return (Criteria) this;
        }

        public Criteria andResult1NotLike(String value) {
            addCriterion("RESULT1 not like", value, "result1");
            return (Criteria) this;
        }

        public Criteria andResult1In(List<String> values) {
            addCriterion("RESULT1 in", values, "result1");
            return (Criteria) this;
        }

        public Criteria andResult1NotIn(List<String> values) {
            addCriterion("RESULT1 not in", values, "result1");
            return (Criteria) this;
        }

        public Criteria andResult1Between(String value1, String value2) {
            addCriterion("RESULT1 between", value1, value2, "result1");
            return (Criteria) this;
        }

        public Criteria andResult1NotBetween(String value1, String value2) {
            addCriterion("RESULT1 not between", value1, value2, "result1");
            return (Criteria) this;
        }

        public Criteria andRecord1IsNull() {
            addCriterion("RECORD1 is null");
            return (Criteria) this;
        }

        public Criteria andRecord1IsNotNull() {
            addCriterion("RECORD1 is not null");
            return (Criteria) this;
        }

        public Criteria andRecord1EqualTo(String value) {
            addCriterion("RECORD1 =", value, "record1");
            return (Criteria) this;
        }

        public Criteria andRecord1NotEqualTo(String value) {
            addCriterion("RECORD1 <>", value, "record1");
            return (Criteria) this;
        }

        public Criteria andRecord1GreaterThan(String value) {
            addCriterion("RECORD1 >", value, "record1");
            return (Criteria) this;
        }

        public Criteria andRecord1GreaterThanOrEqualTo(String value) {
            addCriterion("RECORD1 >=", value, "record1");
            return (Criteria) this;
        }

        public Criteria andRecord1LessThan(String value) {
            addCriterion("RECORD1 <", value, "record1");
            return (Criteria) this;
        }

        public Criteria andRecord1LessThanOrEqualTo(String value) {
            addCriterion("RECORD1 <=", value, "record1");
            return (Criteria) this;
        }

        public Criteria andRecord1Like(String value) {
            addCriterion("RECORD1 like", value, "record1");
            return (Criteria) this;
        }

        public Criteria andRecord1NotLike(String value) {
            addCriterion("RECORD1 not like", value, "record1");
            return (Criteria) this;
        }

        public Criteria andRecord1In(List<String> values) {
            addCriterion("RECORD1 in", values, "record1");
            return (Criteria) this;
        }

        public Criteria andRecord1NotIn(List<String> values) {
            addCriterion("RECORD1 not in", values, "record1");
            return (Criteria) this;
        }

        public Criteria andRecord1Between(String value1, String value2) {
            addCriterion("RECORD1 between", value1, value2, "record1");
            return (Criteria) this;
        }

        public Criteria andRecord1NotBetween(String value1, String value2) {
            addCriterion("RECORD1 not between", value1, value2, "record1");
            return (Criteria) this;
        }

        public Criteria andTime1IsNull() {
            addCriterion("TIME1 is null");
            return (Criteria) this;
        }

        public Criteria andTime1IsNotNull() {
            addCriterion("TIME1 is not null");
            return (Criteria) this;
        }

        public Criteria andTime1EqualTo(Date value) {
            addCriterion("TIME1 =", value, "time1");
            return (Criteria) this;
        }

        public Criteria andTime1NotEqualTo(Date value) {
            addCriterion("TIME1 <>", value, "time1");
            return (Criteria) this;
        }

        public Criteria andTime1GreaterThan(Date value) {
            addCriterion("TIME1 >", value, "time1");
            return (Criteria) this;
        }

        public Criteria andTime1GreaterThanOrEqualTo(Date value) {
            addCriterion("TIME1 >=", value, "time1");
            return (Criteria) this;
        }

        public Criteria andTime1LessThan(Date value) {
            addCriterion("TIME1 <", value, "time1");
            return (Criteria) this;
        }

        public Criteria andTime1LessThanOrEqualTo(Date value) {
            addCriterion("TIME1 <=", value, "time1");
            return (Criteria) this;
        }

        public Criteria andTime1In(List<Date> values) {
            addCriterion("TIME1 in", values, "time1");
            return (Criteria) this;
        }

        public Criteria andTime1NotIn(List<Date> values) {
            addCriterion("TIME1 not in", values, "time1");
            return (Criteria) this;
        }

        public Criteria andTime1Between(Date value1, Date value2) {
            addCriterion("TIME1 between", value1, value2, "time1");
            return (Criteria) this;
        }

        public Criteria andTime1NotBetween(Date value1, Date value2) {
            addCriterion("TIME1 not between", value1, value2, "time1");
            return (Criteria) this;
        }

        public Criteria andResult2IsNull() {
            addCriterion("RESULT2 is null");
            return (Criteria) this;
        }

        public Criteria andResult2IsNotNull() {
            addCriterion("RESULT2 is not null");
            return (Criteria) this;
        }

        public Criteria andResult2EqualTo(String value) {
            addCriterion("RESULT2 =", value, "result2");
            return (Criteria) this;
        }

        public Criteria andResult2NotEqualTo(String value) {
            addCriterion("RESULT2 <>", value, "result2");
            return (Criteria) this;
        }

        public Criteria andResult2GreaterThan(String value) {
            addCriterion("RESULT2 >", value, "result2");
            return (Criteria) this;
        }

        public Criteria andResult2GreaterThanOrEqualTo(String value) {
            addCriterion("RESULT2 >=", value, "result2");
            return (Criteria) this;
        }

        public Criteria andResult2LessThan(String value) {
            addCriterion("RESULT2 <", value, "result2");
            return (Criteria) this;
        }

        public Criteria andResult2LessThanOrEqualTo(String value) {
            addCriterion("RESULT2 <=", value, "result2");
            return (Criteria) this;
        }

        public Criteria andResult2Like(String value) {
            addCriterion("RESULT2 like", value, "result2");
            return (Criteria) this;
        }

        public Criteria andResult2NotLike(String value) {
            addCriterion("RESULT2 not like", value, "result2");
            return (Criteria) this;
        }

        public Criteria andResult2In(List<String> values) {
            addCriterion("RESULT2 in", values, "result2");
            return (Criteria) this;
        }

        public Criteria andResult2NotIn(List<String> values) {
            addCriterion("RESULT2 not in", values, "result2");
            return (Criteria) this;
        }

        public Criteria andResult2Between(String value1, String value2) {
            addCriterion("RESULT2 between", value1, value2, "result2");
            return (Criteria) this;
        }

        public Criteria andResult2NotBetween(String value1, String value2) {
            addCriterion("RESULT2 not between", value1, value2, "result2");
            return (Criteria) this;
        }

        public Criteria andRecord2IsNull() {
            addCriterion("RECORD2 is null");
            return (Criteria) this;
        }

        public Criteria andRecord2IsNotNull() {
            addCriterion("RECORD2 is not null");
            return (Criteria) this;
        }

        public Criteria andRecord2EqualTo(String value) {
            addCriterion("RECORD2 =", value, "record2");
            return (Criteria) this;
        }

        public Criteria andRecord2NotEqualTo(String value) {
            addCriterion("RECORD2 <>", value, "record2");
            return (Criteria) this;
        }

        public Criteria andRecord2GreaterThan(String value) {
            addCriterion("RECORD2 >", value, "record2");
            return (Criteria) this;
        }

        public Criteria andRecord2GreaterThanOrEqualTo(String value) {
            addCriterion("RECORD2 >=", value, "record2");
            return (Criteria) this;
        }

        public Criteria andRecord2LessThan(String value) {
            addCriterion("RECORD2 <", value, "record2");
            return (Criteria) this;
        }

        public Criteria andRecord2LessThanOrEqualTo(String value) {
            addCriterion("RECORD2 <=", value, "record2");
            return (Criteria) this;
        }

        public Criteria andRecord2Like(String value) {
            addCriterion("RECORD2 like", value, "record2");
            return (Criteria) this;
        }

        public Criteria andRecord2NotLike(String value) {
            addCriterion("RECORD2 not like", value, "record2");
            return (Criteria) this;
        }

        public Criteria andRecord2In(List<String> values) {
            addCriterion("RECORD2 in", values, "record2");
            return (Criteria) this;
        }

        public Criteria andRecord2NotIn(List<String> values) {
            addCriterion("RECORD2 not in", values, "record2");
            return (Criteria) this;
        }

        public Criteria andRecord2Between(String value1, String value2) {
            addCriterion("RECORD2 between", value1, value2, "record2");
            return (Criteria) this;
        }

        public Criteria andRecord2NotBetween(String value1, String value2) {
            addCriterion("RECORD2 not between", value1, value2, "record2");
            return (Criteria) this;
        }

        public Criteria andTime2IsNull() {
            addCriterion("TIME2 is null");
            return (Criteria) this;
        }

        public Criteria andTime2IsNotNull() {
            addCriterion("TIME2 is not null");
            return (Criteria) this;
        }

        public Criteria andTime2EqualTo(Date value) {
            addCriterion("TIME2 =", value, "time2");
            return (Criteria) this;
        }

        public Criteria andTime2NotEqualTo(Date value) {
            addCriterion("TIME2 <>", value, "time2");
            return (Criteria) this;
        }

        public Criteria andTime2GreaterThan(Date value) {
            addCriterion("TIME2 >", value, "time2");
            return (Criteria) this;
        }

        public Criteria andTime2GreaterThanOrEqualTo(Date value) {
            addCriterion("TIME2 >=", value, "time2");
            return (Criteria) this;
        }

        public Criteria andTime2LessThan(Date value) {
            addCriterion("TIME2 <", value, "time2");
            return (Criteria) this;
        }

        public Criteria andTime2LessThanOrEqualTo(Date value) {
            addCriterion("TIME2 <=", value, "time2");
            return (Criteria) this;
        }

        public Criteria andTime2In(List<Date> values) {
            addCriterion("TIME2 in", values, "time2");
            return (Criteria) this;
        }

        public Criteria andTime2NotIn(List<Date> values) {
            addCriterion("TIME2 not in", values, "time2");
            return (Criteria) this;
        }

        public Criteria andTime2Between(Date value1, Date value2) {
            addCriterion("TIME2 between", value1, value2, "time2");
            return (Criteria) this;
        }

        public Criteria andTime2NotBetween(Date value1, Date value2) {
            addCriterion("TIME2 not between", value1, value2, "time2");
            return (Criteria) this;
        }

        public Criteria andResult3IsNull() {
            addCriterion("RESULT3 is null");
            return (Criteria) this;
        }

        public Criteria andResult3IsNotNull() {
            addCriterion("RESULT3 is not null");
            return (Criteria) this;
        }

        public Criteria andResult3EqualTo(String value) {
            addCriterion("RESULT3 =", value, "result3");
            return (Criteria) this;
        }

        public Criteria andResult3NotEqualTo(String value) {
            addCriterion("RESULT3 <>", value, "result3");
            return (Criteria) this;
        }

        public Criteria andResult3GreaterThan(String value) {
            addCriterion("RESULT3 >", value, "result3");
            return (Criteria) this;
        }

        public Criteria andResult3GreaterThanOrEqualTo(String value) {
            addCriterion("RESULT3 >=", value, "result3");
            return (Criteria) this;
        }

        public Criteria andResult3LessThan(String value) {
            addCriterion("RESULT3 <", value, "result3");
            return (Criteria) this;
        }

        public Criteria andResult3LessThanOrEqualTo(String value) {
            addCriterion("RESULT3 <=", value, "result3");
            return (Criteria) this;
        }

        public Criteria andResult3Like(String value) {
            addCriterion("RESULT3 like", value, "result3");
            return (Criteria) this;
        }

        public Criteria andResult3NotLike(String value) {
            addCriterion("RESULT3 not like", value, "result3");
            return (Criteria) this;
        }

        public Criteria andResult3In(List<String> values) {
            addCriterion("RESULT3 in", values, "result3");
            return (Criteria) this;
        }

        public Criteria andResult3NotIn(List<String> values) {
            addCriterion("RESULT3 not in", values, "result3");
            return (Criteria) this;
        }

        public Criteria andResult3Between(String value1, String value2) {
            addCriterion("RESULT3 between", value1, value2, "result3");
            return (Criteria) this;
        }

        public Criteria andResult3NotBetween(String value1, String value2) {
            addCriterion("RESULT3 not between", value1, value2, "result3");
            return (Criteria) this;
        }

        public Criteria andRecord3IsNull() {
            addCriterion("RECORD3 is null");
            return (Criteria) this;
        }

        public Criteria andRecord3IsNotNull() {
            addCriterion("RECORD3 is not null");
            return (Criteria) this;
        }

        public Criteria andRecord3EqualTo(String value) {
            addCriterion("RECORD3 =", value, "record3");
            return (Criteria) this;
        }

        public Criteria andRecord3NotEqualTo(String value) {
            addCriterion("RECORD3 <>", value, "record3");
            return (Criteria) this;
        }

        public Criteria andRecord3GreaterThan(String value) {
            addCriterion("RECORD3 >", value, "record3");
            return (Criteria) this;
        }

        public Criteria andRecord3GreaterThanOrEqualTo(String value) {
            addCriterion("RECORD3 >=", value, "record3");
            return (Criteria) this;
        }

        public Criteria andRecord3LessThan(String value) {
            addCriterion("RECORD3 <", value, "record3");
            return (Criteria) this;
        }

        public Criteria andRecord3LessThanOrEqualTo(String value) {
            addCriterion("RECORD3 <=", value, "record3");
            return (Criteria) this;
        }

        public Criteria andRecord3Like(String value) {
            addCriterion("RECORD3 like", value, "record3");
            return (Criteria) this;
        }

        public Criteria andRecord3NotLike(String value) {
            addCriterion("RECORD3 not like", value, "record3");
            return (Criteria) this;
        }

        public Criteria andRecord3In(List<String> values) {
            addCriterion("RECORD3 in", values, "record3");
            return (Criteria) this;
        }

        public Criteria andRecord3NotIn(List<String> values) {
            addCriterion("RECORD3 not in", values, "record3");
            return (Criteria) this;
        }

        public Criteria andRecord3Between(String value1, String value2) {
            addCriterion("RECORD3 between", value1, value2, "record3");
            return (Criteria) this;
        }

        public Criteria andRecord3NotBetween(String value1, String value2) {
            addCriterion("RECORD3 not between", value1, value2, "record3");
            return (Criteria) this;
        }

        public Criteria andTime3IsNull() {
            addCriterion("TIME3 is null");
            return (Criteria) this;
        }

        public Criteria andTime3IsNotNull() {
            addCriterion("TIME3 is not null");
            return (Criteria) this;
        }

        public Criteria andTime3EqualTo(Date value) {
            addCriterion("TIME3 =", value, "time3");
            return (Criteria) this;
        }

        public Criteria andTime3NotEqualTo(Date value) {
            addCriterion("TIME3 <>", value, "time3");
            return (Criteria) this;
        }

        public Criteria andTime3GreaterThan(Date value) {
            addCriterion("TIME3 >", value, "time3");
            return (Criteria) this;
        }

        public Criteria andTime3GreaterThanOrEqualTo(Date value) {
            addCriterion("TIME3 >=", value, "time3");
            return (Criteria) this;
        }

        public Criteria andTime3LessThan(Date value) {
            addCriterion("TIME3 <", value, "time3");
            return (Criteria) this;
        }

        public Criteria andTime3LessThanOrEqualTo(Date value) {
            addCriterion("TIME3 <=", value, "time3");
            return (Criteria) this;
        }

        public Criteria andTime3In(List<Date> values) {
            addCriterion("TIME3 in", values, "time3");
            return (Criteria) this;
        }

        public Criteria andTime3NotIn(List<Date> values) {
            addCriterion("TIME3 not in", values, "time3");
            return (Criteria) this;
        }

        public Criteria andTime3Between(Date value1, Date value2) {
            addCriterion("TIME3 between", value1, value2, "time3");
            return (Criteria) this;
        }

        public Criteria andTime3NotBetween(Date value1, Date value2) {
            addCriterion("TIME3 not between", value1, value2, "time3");
            return (Criteria) this;
        }

        public Criteria andResult4IsNull() {
            addCriterion("RESULT4 is null");
            return (Criteria) this;
        }

        public Criteria andResult4IsNotNull() {
            addCriterion("RESULT4 is not null");
            return (Criteria) this;
        }

        public Criteria andResult4EqualTo(String value) {
            addCriterion("RESULT4 =", value, "result4");
            return (Criteria) this;
        }

        public Criteria andResult4NotEqualTo(String value) {
            addCriterion("RESULT4 <>", value, "result4");
            return (Criteria) this;
        }

        public Criteria andResult4GreaterThan(String value) {
            addCriterion("RESULT4 >", value, "result4");
            return (Criteria) this;
        }

        public Criteria andResult4GreaterThanOrEqualTo(String value) {
            addCriterion("RESULT4 >=", value, "result4");
            return (Criteria) this;
        }

        public Criteria andResult4LessThan(String value) {
            addCriterion("RESULT4 <", value, "result4");
            return (Criteria) this;
        }

        public Criteria andResult4LessThanOrEqualTo(String value) {
            addCriterion("RESULT4 <=", value, "result4");
            return (Criteria) this;
        }

        public Criteria andResult4Like(String value) {
            addCriterion("RESULT4 like", value, "result4");
            return (Criteria) this;
        }

        public Criteria andResult4NotLike(String value) {
            addCriterion("RESULT4 not like", value, "result4");
            return (Criteria) this;
        }

        public Criteria andResult4In(List<String> values) {
            addCriterion("RESULT4 in", values, "result4");
            return (Criteria) this;
        }

        public Criteria andResult4NotIn(List<String> values) {
            addCriterion("RESULT4 not in", values, "result4");
            return (Criteria) this;
        }

        public Criteria andResult4Between(String value1, String value2) {
            addCriterion("RESULT4 between", value1, value2, "result4");
            return (Criteria) this;
        }

        public Criteria andResult4NotBetween(String value1, String value2) {
            addCriterion("RESULT4 not between", value1, value2, "result4");
            return (Criteria) this;
        }

        public Criteria andRecord4IsNull() {
            addCriterion("RECORD4 is null");
            return (Criteria) this;
        }

        public Criteria andRecord4IsNotNull() {
            addCriterion("RECORD4 is not null");
            return (Criteria) this;
        }

        public Criteria andRecord4EqualTo(String value) {
            addCriterion("RECORD4 =", value, "record4");
            return (Criteria) this;
        }

        public Criteria andRecord4NotEqualTo(String value) {
            addCriterion("RECORD4 <>", value, "record4");
            return (Criteria) this;
        }

        public Criteria andRecord4GreaterThan(String value) {
            addCriterion("RECORD4 >", value, "record4");
            return (Criteria) this;
        }

        public Criteria andRecord4GreaterThanOrEqualTo(String value) {
            addCriterion("RECORD4 >=", value, "record4");
            return (Criteria) this;
        }

        public Criteria andRecord4LessThan(String value) {
            addCriterion("RECORD4 <", value, "record4");
            return (Criteria) this;
        }

        public Criteria andRecord4LessThanOrEqualTo(String value) {
            addCriterion("RECORD4 <=", value, "record4");
            return (Criteria) this;
        }

        public Criteria andRecord4Like(String value) {
            addCriterion("RECORD4 like", value, "record4");
            return (Criteria) this;
        }

        public Criteria andRecord4NotLike(String value) {
            addCriterion("RECORD4 not like", value, "record4");
            return (Criteria) this;
        }

        public Criteria andRecord4In(List<String> values) {
            addCriterion("RECORD4 in", values, "record4");
            return (Criteria) this;
        }

        public Criteria andRecord4NotIn(List<String> values) {
            addCriterion("RECORD4 not in", values, "record4");
            return (Criteria) this;
        }

        public Criteria andRecord4Between(String value1, String value2) {
            addCriterion("RECORD4 between", value1, value2, "record4");
            return (Criteria) this;
        }

        public Criteria andRecord4NotBetween(String value1, String value2) {
            addCriterion("RECORD4 not between", value1, value2, "record4");
            return (Criteria) this;
        }

        public Criteria andTime4IsNull() {
            addCriterion("TIME4 is null");
            return (Criteria) this;
        }

        public Criteria andTime4IsNotNull() {
            addCriterion("TIME4 is not null");
            return (Criteria) this;
        }

        public Criteria andTime4EqualTo(Date value) {
            addCriterion("TIME4 =", value, "time4");
            return (Criteria) this;
        }

        public Criteria andTime4NotEqualTo(Date value) {
            addCriterion("TIME4 <>", value, "time4");
            return (Criteria) this;
        }

        public Criteria andTime4GreaterThan(Date value) {
            addCriterion("TIME4 >", value, "time4");
            return (Criteria) this;
        }

        public Criteria andTime4GreaterThanOrEqualTo(Date value) {
            addCriterion("TIME4 >=", value, "time4");
            return (Criteria) this;
        }

        public Criteria andTime4LessThan(Date value) {
            addCriterion("TIME4 <", value, "time4");
            return (Criteria) this;
        }

        public Criteria andTime4LessThanOrEqualTo(Date value) {
            addCriterion("TIME4 <=", value, "time4");
            return (Criteria) this;
        }

        public Criteria andTime4In(List<Date> values) {
            addCriterion("TIME4 in", values, "time4");
            return (Criteria) this;
        }

        public Criteria andTime4NotIn(List<Date> values) {
            addCriterion("TIME4 not in", values, "time4");
            return (Criteria) this;
        }

        public Criteria andTime4Between(Date value1, Date value2) {
            addCriterion("TIME4 between", value1, value2, "time4");
            return (Criteria) this;
        }

        public Criteria andTime4NotBetween(Date value1, Date value2) {
            addCriterion("TIME4 not between", value1, value2, "time4");
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