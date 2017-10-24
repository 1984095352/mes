package cn.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PirecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PirecordExample() {
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

        public Criteria andPiplanidIsNull() {
            addCriterion("PIPLANID is null");
            return (Criteria) this;
        }

        public Criteria andPiplanidIsNotNull() {
            addCriterion("PIPLANID is not null");
            return (Criteria) this;
        }

        public Criteria andPiplanidEqualTo(Long value) {
            addCriterion("PIPLANID =", value, "piplanid");
            return (Criteria) this;
        }

        public Criteria andPiplanidNotEqualTo(Long value) {
            addCriterion("PIPLANID <>", value, "piplanid");
            return (Criteria) this;
        }

        public Criteria andPiplanidGreaterThan(Long value) {
            addCriterion("PIPLANID >", value, "piplanid");
            return (Criteria) this;
        }

        public Criteria andPiplanidGreaterThanOrEqualTo(Long value) {
            addCriterion("PIPLANID >=", value, "piplanid");
            return (Criteria) this;
        }

        public Criteria andPiplanidLessThan(Long value) {
            addCriterion("PIPLANID <", value, "piplanid");
            return (Criteria) this;
        }

        public Criteria andPiplanidLessThanOrEqualTo(Long value) {
            addCriterion("PIPLANID <=", value, "piplanid");
            return (Criteria) this;
        }

        public Criteria andPiplanidIn(List<Long> values) {
            addCriterion("PIPLANID in", values, "piplanid");
            return (Criteria) this;
        }

        public Criteria andPiplanidNotIn(List<Long> values) {
            addCriterion("PIPLANID not in", values, "piplanid");
            return (Criteria) this;
        }

        public Criteria andPiplanidBetween(Long value1, Long value2) {
            addCriterion("PIPLANID between", value1, value2, "piplanid");
            return (Criteria) this;
        }

        public Criteria andPiplanidNotBetween(Long value1, Long value2) {
            addCriterion("PIPLANID not between", value1, value2, "piplanid");
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

        public Criteria andDayIsNull() {
            addCriterion("DAY is null");
            return (Criteria) this;
        }

        public Criteria andDayIsNotNull() {
            addCriterion("DAY is not null");
            return (Criteria) this;
        }

        public Criteria andDayEqualTo(Integer value) {
            addCriterion("DAY =", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayNotEqualTo(Integer value) {
            addCriterion("DAY <>", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayGreaterThan(Integer value) {
            addCriterion("DAY >", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("DAY >=", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayLessThan(Integer value) {
            addCriterion("DAY <", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayLessThanOrEqualTo(Integer value) {
            addCriterion("DAY <=", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayIn(List<Integer> values) {
            addCriterion("DAY in", values, "day");
            return (Criteria) this;
        }

        public Criteria andDayNotIn(List<Integer> values) {
            addCriterion("DAY not in", values, "day");
            return (Criteria) this;
        }

        public Criteria andDayBetween(Integer value1, Integer value2) {
            addCriterion("DAY between", value1, value2, "day");
            return (Criteria) this;
        }

        public Criteria andDayNotBetween(Integer value1, Integer value2) {
            addCriterion("DAY not between", value1, value2, "day");
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

        public Criteria andDrawupbyIsNull() {
            addCriterion("DRAWUPBY is null");
            return (Criteria) this;
        }

        public Criteria andDrawupbyIsNotNull() {
            addCriterion("DRAWUPBY is not null");
            return (Criteria) this;
        }

        public Criteria andDrawupbyEqualTo(String value) {
            addCriterion("DRAWUPBY =", value, "drawupby");
            return (Criteria) this;
        }

        public Criteria andDrawupbyNotEqualTo(String value) {
            addCriterion("DRAWUPBY <>", value, "drawupby");
            return (Criteria) this;
        }

        public Criteria andDrawupbyGreaterThan(String value) {
            addCriterion("DRAWUPBY >", value, "drawupby");
            return (Criteria) this;
        }

        public Criteria andDrawupbyGreaterThanOrEqualTo(String value) {
            addCriterion("DRAWUPBY >=", value, "drawupby");
            return (Criteria) this;
        }

        public Criteria andDrawupbyLessThan(String value) {
            addCriterion("DRAWUPBY <", value, "drawupby");
            return (Criteria) this;
        }

        public Criteria andDrawupbyLessThanOrEqualTo(String value) {
            addCriterion("DRAWUPBY <=", value, "drawupby");
            return (Criteria) this;
        }

        public Criteria andDrawupbyLike(String value) {
            addCriterion("DRAWUPBY like", value, "drawupby");
            return (Criteria) this;
        }

        public Criteria andDrawupbyNotLike(String value) {
            addCriterion("DRAWUPBY not like", value, "drawupby");
            return (Criteria) this;
        }

        public Criteria andDrawupbyIn(List<String> values) {
            addCriterion("DRAWUPBY in", values, "drawupby");
            return (Criteria) this;
        }

        public Criteria andDrawupbyNotIn(List<String> values) {
            addCriterion("DRAWUPBY not in", values, "drawupby");
            return (Criteria) this;
        }

        public Criteria andDrawupbyBetween(String value1, String value2) {
            addCriterion("DRAWUPBY between", value1, value2, "drawupby");
            return (Criteria) this;
        }

        public Criteria andDrawupbyNotBetween(String value1, String value2) {
            addCriterion("DRAWUPBY not between", value1, value2, "drawupby");
            return (Criteria) this;
        }

        public Criteria andDrawupdateIsNull() {
            addCriterion("DRAWUPDATE is null");
            return (Criteria) this;
        }

        public Criteria andDrawupdateIsNotNull() {
            addCriterion("DRAWUPDATE is not null");
            return (Criteria) this;
        }

        public Criteria andDrawupdateEqualTo(Date value) {
            addCriterion("DRAWUPDATE =", value, "drawupdate");
            return (Criteria) this;
        }

        public Criteria andDrawupdateNotEqualTo(Date value) {
            addCriterion("DRAWUPDATE <>", value, "drawupdate");
            return (Criteria) this;
        }

        public Criteria andDrawupdateGreaterThan(Date value) {
            addCriterion("DRAWUPDATE >", value, "drawupdate");
            return (Criteria) this;
        }

        public Criteria andDrawupdateGreaterThanOrEqualTo(Date value) {
            addCriterion("DRAWUPDATE >=", value, "drawupdate");
            return (Criteria) this;
        }

        public Criteria andDrawupdateLessThan(Date value) {
            addCriterion("DRAWUPDATE <", value, "drawupdate");
            return (Criteria) this;
        }

        public Criteria andDrawupdateLessThanOrEqualTo(Date value) {
            addCriterion("DRAWUPDATE <=", value, "drawupdate");
            return (Criteria) this;
        }

        public Criteria andDrawupdateIn(List<Date> values) {
            addCriterion("DRAWUPDATE in", values, "drawupdate");
            return (Criteria) this;
        }

        public Criteria andDrawupdateNotIn(List<Date> values) {
            addCriterion("DRAWUPDATE not in", values, "drawupdate");
            return (Criteria) this;
        }

        public Criteria andDrawupdateBetween(Date value1, Date value2) {
            addCriterion("DRAWUPDATE between", value1, value2, "drawupdate");
            return (Criteria) this;
        }

        public Criteria andDrawupdateNotBetween(Date value1, Date value2) {
            addCriterion("DRAWUPDATE not between", value1, value2, "drawupdate");
            return (Criteria) this;
        }

        public Criteria andExecutebyIsNull() {
            addCriterion("EXECUTEBY is null");
            return (Criteria) this;
        }

        public Criteria andExecutebyIsNotNull() {
            addCriterion("EXECUTEBY is not null");
            return (Criteria) this;
        }

        public Criteria andExecutebyEqualTo(String value) {
            addCriterion("EXECUTEBY =", value, "executeby");
            return (Criteria) this;
        }

        public Criteria andExecutebyNotEqualTo(String value) {
            addCriterion("EXECUTEBY <>", value, "executeby");
            return (Criteria) this;
        }

        public Criteria andExecutebyGreaterThan(String value) {
            addCriterion("EXECUTEBY >", value, "executeby");
            return (Criteria) this;
        }

        public Criteria andExecutebyGreaterThanOrEqualTo(String value) {
            addCriterion("EXECUTEBY >=", value, "executeby");
            return (Criteria) this;
        }

        public Criteria andExecutebyLessThan(String value) {
            addCriterion("EXECUTEBY <", value, "executeby");
            return (Criteria) this;
        }

        public Criteria andExecutebyLessThanOrEqualTo(String value) {
            addCriterion("EXECUTEBY <=", value, "executeby");
            return (Criteria) this;
        }

        public Criteria andExecutebyLike(String value) {
            addCriterion("EXECUTEBY like", value, "executeby");
            return (Criteria) this;
        }

        public Criteria andExecutebyNotLike(String value) {
            addCriterion("EXECUTEBY not like", value, "executeby");
            return (Criteria) this;
        }

        public Criteria andExecutebyIn(List<String> values) {
            addCriterion("EXECUTEBY in", values, "executeby");
            return (Criteria) this;
        }

        public Criteria andExecutebyNotIn(List<String> values) {
            addCriterion("EXECUTEBY not in", values, "executeby");
            return (Criteria) this;
        }

        public Criteria andExecutebyBetween(String value1, String value2) {
            addCriterion("EXECUTEBY between", value1, value2, "executeby");
            return (Criteria) this;
        }

        public Criteria andExecutebyNotBetween(String value1, String value2) {
            addCriterion("EXECUTEBY not between", value1, value2, "executeby");
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

        public Criteria andPistdnumIsNull() {
            addCriterion("PISTDNUM is null");
            return (Criteria) this;
        }

        public Criteria andPistdnumIsNotNull() {
            addCriterion("PISTDNUM is not null");
            return (Criteria) this;
        }

        public Criteria andPistdnumEqualTo(String value) {
            addCriterion("PISTDNUM =", value, "pistdnum");
            return (Criteria) this;
        }

        public Criteria andPistdnumNotEqualTo(String value) {
            addCriterion("PISTDNUM <>", value, "pistdnum");
            return (Criteria) this;
        }

        public Criteria andPistdnumGreaterThan(String value) {
            addCriterion("PISTDNUM >", value, "pistdnum");
            return (Criteria) this;
        }

        public Criteria andPistdnumGreaterThanOrEqualTo(String value) {
            addCriterion("PISTDNUM >=", value, "pistdnum");
            return (Criteria) this;
        }

        public Criteria andPistdnumLessThan(String value) {
            addCriterion("PISTDNUM <", value, "pistdnum");
            return (Criteria) this;
        }

        public Criteria andPistdnumLessThanOrEqualTo(String value) {
            addCriterion("PISTDNUM <=", value, "pistdnum");
            return (Criteria) this;
        }

        public Criteria andPistdnumLike(String value) {
            addCriterion("PISTDNUM like", value, "pistdnum");
            return (Criteria) this;
        }

        public Criteria andPistdnumNotLike(String value) {
            addCriterion("PISTDNUM not like", value, "pistdnum");
            return (Criteria) this;
        }

        public Criteria andPistdnumIn(List<String> values) {
            addCriterion("PISTDNUM in", values, "pistdnum");
            return (Criteria) this;
        }

        public Criteria andPistdnumNotIn(List<String> values) {
            addCriterion("PISTDNUM not in", values, "pistdnum");
            return (Criteria) this;
        }

        public Criteria andPistdnumBetween(String value1, String value2) {
            addCriterion("PISTDNUM between", value1, value2, "pistdnum");
            return (Criteria) this;
        }

        public Criteria andPistdnumNotBetween(String value1, String value2) {
            addCriterion("PISTDNUM not between", value1, value2, "pistdnum");
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

        public Criteria andPlatefromIsNull() {
            addCriterion("PLATEFROM is null");
            return (Criteria) this;
        }

        public Criteria andPlatefromIsNotNull() {
            addCriterion("PLATEFROM is not null");
            return (Criteria) this;
        }

        public Criteria andPlatefromEqualTo(String value) {
            addCriterion("PLATEFROM =", value, "platefrom");
            return (Criteria) this;
        }

        public Criteria andPlatefromNotEqualTo(String value) {
            addCriterion("PLATEFROM <>", value, "platefrom");
            return (Criteria) this;
        }

        public Criteria andPlatefromGreaterThan(String value) {
            addCriterion("PLATEFROM >", value, "platefrom");
            return (Criteria) this;
        }

        public Criteria andPlatefromGreaterThanOrEqualTo(String value) {
            addCriterion("PLATEFROM >=", value, "platefrom");
            return (Criteria) this;
        }

        public Criteria andPlatefromLessThan(String value) {
            addCriterion("PLATEFROM <", value, "platefrom");
            return (Criteria) this;
        }

        public Criteria andPlatefromLessThanOrEqualTo(String value) {
            addCriterion("PLATEFROM <=", value, "platefrom");
            return (Criteria) this;
        }

        public Criteria andPlatefromLike(String value) {
            addCriterion("PLATEFROM like", value, "platefrom");
            return (Criteria) this;
        }

        public Criteria andPlatefromNotLike(String value) {
            addCriterion("PLATEFROM not like", value, "platefrom");
            return (Criteria) this;
        }

        public Criteria andPlatefromIn(List<String> values) {
            addCriterion("PLATEFROM in", values, "platefrom");
            return (Criteria) this;
        }

        public Criteria andPlatefromNotIn(List<String> values) {
            addCriterion("PLATEFROM not in", values, "platefrom");
            return (Criteria) this;
        }

        public Criteria andPlatefromBetween(String value1, String value2) {
            addCriterion("PLATEFROM between", value1, value2, "platefrom");
            return (Criteria) this;
        }

        public Criteria andPlatefromNotBetween(String value1, String value2) {
            addCriterion("PLATEFROM not between", value1, value2, "platefrom");
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