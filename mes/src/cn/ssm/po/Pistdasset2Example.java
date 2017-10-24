package cn.ssm.po;

import java.util.ArrayList;
import java.util.List;

public class Pistdasset2Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Pistdasset2Example() {
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

        public Criteria andPistdassetidIsNull() {
            addCriterion("PISTDASSETID is null");
            return (Criteria) this;
        }

        public Criteria andPistdassetidIsNotNull() {
            addCriterion("PISTDASSETID is not null");
            return (Criteria) this;
        }

        public Criteria andPistdassetidEqualTo(Long value) {
            addCriterion("PISTDASSETID =", value, "pistdassetid");
            return (Criteria) this;
        }

        public Criteria andPistdassetidNotEqualTo(Long value) {
            addCriterion("PISTDASSETID <>", value, "pistdassetid");
            return (Criteria) this;
        }

        public Criteria andPistdassetidGreaterThan(Long value) {
            addCriterion("PISTDASSETID >", value, "pistdassetid");
            return (Criteria) this;
        }

        public Criteria andPistdassetidGreaterThanOrEqualTo(Long value) {
            addCriterion("PISTDASSETID >=", value, "pistdassetid");
            return (Criteria) this;
        }

        public Criteria andPistdassetidLessThan(Long value) {
            addCriterion("PISTDASSETID <", value, "pistdassetid");
            return (Criteria) this;
        }

        public Criteria andPistdassetidLessThanOrEqualTo(Long value) {
            addCriterion("PISTDASSETID <=", value, "pistdassetid");
            return (Criteria) this;
        }

        public Criteria andPistdassetidIn(List<Long> values) {
            addCriterion("PISTDASSETID in", values, "pistdassetid");
            return (Criteria) this;
        }

        public Criteria andPistdassetidNotIn(List<Long> values) {
            addCriterion("PISTDASSETID not in", values, "pistdassetid");
            return (Criteria) this;
        }

        public Criteria andPistdassetidBetween(Long value1, Long value2) {
            addCriterion("PISTDASSETID between", value1, value2, "pistdassetid");
            return (Criteria) this;
        }

        public Criteria andPistdassetidNotBetween(Long value1, Long value2) {
            addCriterion("PISTDASSETID not between", value1, value2, "pistdassetid");
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