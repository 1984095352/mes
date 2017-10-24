package cn.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PirecordlineExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PirecordlineExample() {
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

        public Criteria andPirecordlineidIsNull() {
            addCriterion("PIRECORDLINEID is null");
            return (Criteria) this;
        }

        public Criteria andPirecordlineidIsNotNull() {
            addCriterion("PIRECORDLINEID is not null");
            return (Criteria) this;
        }

        public Criteria andPirecordlineidEqualTo(Long value) {
            addCriterion("PIRECORDLINEID =", value, "pirecordlineid");
            return (Criteria) this;
        }

        public Criteria andPirecordlineidNotEqualTo(Long value) {
            addCriterion("PIRECORDLINEID <>", value, "pirecordlineid");
            return (Criteria) this;
        }

        public Criteria andPirecordlineidGreaterThan(Long value) {
            addCriterion("PIRECORDLINEID >", value, "pirecordlineid");
            return (Criteria) this;
        }

        public Criteria andPirecordlineidGreaterThanOrEqualTo(Long value) {
            addCriterion("PIRECORDLINEID >=", value, "pirecordlineid");
            return (Criteria) this;
        }

        public Criteria andPirecordlineidLessThan(Long value) {
            addCriterion("PIRECORDLINEID <", value, "pirecordlineid");
            return (Criteria) this;
        }

        public Criteria andPirecordlineidLessThanOrEqualTo(Long value) {
            addCriterion("PIRECORDLINEID <=", value, "pirecordlineid");
            return (Criteria) this;
        }

        public Criteria andPirecordlineidIn(List<Long> values) {
            addCriterion("PIRECORDLINEID in", values, "pirecordlineid");
            return (Criteria) this;
        }

        public Criteria andPirecordlineidNotIn(List<Long> values) {
            addCriterion("PIRECORDLINEID not in", values, "pirecordlineid");
            return (Criteria) this;
        }

        public Criteria andPirecordlineidBetween(Long value1, Long value2) {
            addCriterion("PIRECORDLINEID between", value1, value2, "pirecordlineid");
            return (Criteria) this;
        }

        public Criteria andPirecordlineidNotBetween(Long value1, Long value2) {
            addCriterion("PIRECORDLINEID not between", value1, value2, "pirecordlineid");
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