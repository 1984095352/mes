package cn.ssm.po;

import java.util.ArrayList;
import java.util.List;

public class CstdExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CstdExample() {
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

        public Criteria andCstdunidIsNull() {
            addCriterion("CSTDUNID is null");
            return (Criteria) this;
        }

        public Criteria andCstdunidIsNotNull() {
            addCriterion("CSTDUNID is not null");
            return (Criteria) this;
        }

        public Criteria andCstdunidEqualTo(Integer value) {
            addCriterion("CSTDUNID =", value, "cstdunid");
            return (Criteria) this;
        }

        public Criteria andCstdunidNotEqualTo(Integer value) {
            addCriterion("CSTDUNID <>", value, "cstdunid");
            return (Criteria) this;
        }

        public Criteria andCstdunidGreaterThan(Integer value) {
            addCriterion("CSTDUNID >", value, "cstdunid");
            return (Criteria) this;
        }

        public Criteria andCstdunidGreaterThanOrEqualTo(Integer value) {
            addCriterion("CSTDUNID >=", value, "cstdunid");
            return (Criteria) this;
        }

        public Criteria andCstdunidLessThan(Integer value) {
            addCriterion("CSTDUNID <", value, "cstdunid");
            return (Criteria) this;
        }

        public Criteria andCstdunidLessThanOrEqualTo(Integer value) {
            addCriterion("CSTDUNID <=", value, "cstdunid");
            return (Criteria) this;
        }

        public Criteria andCstdunidIn(List<Integer> values) {
            addCriterion("CSTDUNID in", values, "cstdunid");
            return (Criteria) this;
        }

        public Criteria andCstdunidNotIn(List<Integer> values) {
            addCriterion("CSTDUNID not in", values, "cstdunid");
            return (Criteria) this;
        }

        public Criteria andCstdunidBetween(Integer value1, Integer value2) {
            addCriterion("CSTDUNID between", value1, value2, "cstdunid");
            return (Criteria) this;
        }

        public Criteria andCstdunidNotBetween(Integer value1, Integer value2) {
            addCriterion("CSTDUNID not between", value1, value2, "cstdunid");
            return (Criteria) this;
        }

        public Criteria andCstdnumIsNull() {
            addCriterion("CSTDNUM is null");
            return (Criteria) this;
        }

        public Criteria andCstdnumIsNotNull() {
            addCriterion("CSTDNUM is not null");
            return (Criteria) this;
        }

        public Criteria andCstdnumEqualTo(String value) {
            addCriterion("CSTDNUM =", value, "cstdnum");
            return (Criteria) this;
        }

        public Criteria andCstdnumNotEqualTo(String value) {
            addCriterion("CSTDNUM <>", value, "cstdnum");
            return (Criteria) this;
        }

        public Criteria andCstdnumGreaterThan(String value) {
            addCriterion("CSTDNUM >", value, "cstdnum");
            return (Criteria) this;
        }

        public Criteria andCstdnumGreaterThanOrEqualTo(String value) {
            addCriterion("CSTDNUM >=", value, "cstdnum");
            return (Criteria) this;
        }

        public Criteria andCstdnumLessThan(String value) {
            addCriterion("CSTDNUM <", value, "cstdnum");
            return (Criteria) this;
        }

        public Criteria andCstdnumLessThanOrEqualTo(String value) {
            addCriterion("CSTDNUM <=", value, "cstdnum");
            return (Criteria) this;
        }

        public Criteria andCstdnumLike(String value) {
            addCriterion("CSTDNUM like", value, "cstdnum");
            return (Criteria) this;
        }

        public Criteria andCstdnumNotLike(String value) {
            addCriterion("CSTDNUM not like", value, "cstdnum");
            return (Criteria) this;
        }

        public Criteria andCstdnumIn(List<String> values) {
            addCriterion("CSTDNUM in", values, "cstdnum");
            return (Criteria) this;
        }

        public Criteria andCstdnumNotIn(List<String> values) {
            addCriterion("CSTDNUM not in", values, "cstdnum");
            return (Criteria) this;
        }

        public Criteria andCstdnumBetween(String value1, String value2) {
            addCriterion("CSTDNUM between", value1, value2, "cstdnum");
            return (Criteria) this;
        }

        public Criteria andCstdnumNotBetween(String value1, String value2) {
            addCriterion("CSTDNUM not between", value1, value2, "cstdnum");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("DESCRIPTION =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("DESCRIPTION <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("DESCRIPTION >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("DESCRIPTION <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("DESCRIPTION like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("DESCRIPTION not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("DESCRIPTION in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("DESCRIPTION not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("DESCRIPTION between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("DESCRIPTION not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andProfessionIsNull() {
            addCriterion("PROFESSION is null");
            return (Criteria) this;
        }

        public Criteria andProfessionIsNotNull() {
            addCriterion("PROFESSION is not null");
            return (Criteria) this;
        }

        public Criteria andProfessionEqualTo(String value) {
            addCriterion("PROFESSION =", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionNotEqualTo(String value) {
            addCriterion("PROFESSION <>", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionGreaterThan(String value) {
            addCriterion("PROFESSION >", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionGreaterThanOrEqualTo(String value) {
            addCriterion("PROFESSION >=", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionLessThan(String value) {
            addCriterion("PROFESSION <", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionLessThanOrEqualTo(String value) {
            addCriterion("PROFESSION <=", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionLike(String value) {
            addCriterion("PROFESSION like", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionNotLike(String value) {
            addCriterion("PROFESSION not like", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionIn(List<String> values) {
            addCriterion("PROFESSION in", values, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionNotIn(List<String> values) {
            addCriterion("PROFESSION not in", values, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionBetween(String value1, String value2) {
            addCriterion("PROFESSION between", value1, value2, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionNotBetween(String value1, String value2) {
            addCriterion("PROFESSION not between", value1, value2, "profession");
            return (Criteria) this;
        }

        public Criteria andCishuIsNull() {
            addCriterion("CISHU is null");
            return (Criteria) this;
        }

        public Criteria andCishuIsNotNull() {
            addCriterion("CISHU is not null");
            return (Criteria) this;
        }

        public Criteria andCishuEqualTo(Integer value) {
            addCriterion("CISHU =", value, "cishu");
            return (Criteria) this;
        }

        public Criteria andCishuNotEqualTo(Integer value) {
            addCriterion("CISHU <>", value, "cishu");
            return (Criteria) this;
        }

        public Criteria andCishuGreaterThan(Integer value) {
            addCriterion("CISHU >", value, "cishu");
            return (Criteria) this;
        }

        public Criteria andCishuGreaterThanOrEqualTo(Integer value) {
            addCriterion("CISHU >=", value, "cishu");
            return (Criteria) this;
        }

        public Criteria andCishuLessThan(Integer value) {
            addCriterion("CISHU <", value, "cishu");
            return (Criteria) this;
        }

        public Criteria andCishuLessThanOrEqualTo(Integer value) {
            addCriterion("CISHU <=", value, "cishu");
            return (Criteria) this;
        }

        public Criteria andCishuIn(List<Integer> values) {
            addCriterion("CISHU in", values, "cishu");
            return (Criteria) this;
        }

        public Criteria andCishuNotIn(List<Integer> values) {
            addCriterion("CISHU not in", values, "cishu");
            return (Criteria) this;
        }

        public Criteria andCishuBetween(Integer value1, Integer value2) {
            addCriterion("CISHU between", value1, value2, "cishu");
            return (Criteria) this;
        }

        public Criteria andCishuNotBetween(Integer value1, Integer value2) {
            addCriterion("CISHU not between", value1, value2, "cishu");
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