package cn.ssm.po;

import java.util.ArrayList;
import java.util.List;

public class Pistd2Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Pistd2Example() {
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

        public Criteria andPistdidIsNull() {
            addCriterion("PISTDID is null");
            return (Criteria) this;
        }

        public Criteria andPistdidIsNotNull() {
            addCriterion("PISTDID is not null");
            return (Criteria) this;
        }

        public Criteria andPistdidEqualTo(Long value) {
            addCriterion("PISTDID =", value, "pistdid");
            return (Criteria) this;
        }

        public Criteria andPistdidNotEqualTo(Long value) {
            addCriterion("PISTDID <>", value, "pistdid");
            return (Criteria) this;
        }

        public Criteria andPistdidGreaterThan(Long value) {
            addCriterion("PISTDID >", value, "pistdid");
            return (Criteria) this;
        }

        public Criteria andPistdidGreaterThanOrEqualTo(Long value) {
            addCriterion("PISTDID >=", value, "pistdid");
            return (Criteria) this;
        }

        public Criteria andPistdidLessThan(Long value) {
            addCriterion("PISTDID <", value, "pistdid");
            return (Criteria) this;
        }

        public Criteria andPistdidLessThanOrEqualTo(Long value) {
            addCriterion("PISTDID <=", value, "pistdid");
            return (Criteria) this;
        }

        public Criteria andPistdidIn(List<Long> values) {
            addCriterion("PISTDID in", values, "pistdid");
            return (Criteria) this;
        }

        public Criteria andPistdidNotIn(List<Long> values) {
            addCriterion("PISTDID not in", values, "pistdid");
            return (Criteria) this;
        }

        public Criteria andPistdidBetween(Long value1, Long value2) {
            addCriterion("PISTDID between", value1, value2, "pistdid");
            return (Criteria) this;
        }

        public Criteria andPistdidNotBetween(Long value1, Long value2) {
            addCriterion("PISTDID not between", value1, value2, "pistdid");
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