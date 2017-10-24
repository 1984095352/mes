package cn.ssm.po;

import java.util.ArrayList;
import java.util.List;

public class Pistdline3Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Pistdline3Example() {
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

        public Criteria andPistdlineidIsNull() {
            addCriterion("PISTDLINEID is null");
            return (Criteria) this;
        }

        public Criteria andPistdlineidIsNotNull() {
            addCriterion("PISTDLINEID is not null");
            return (Criteria) this;
        }

        public Criteria andPistdlineidEqualTo(Long value) {
            addCriterion("PISTDLINEID =", value, "pistdlineid");
            return (Criteria) this;
        }

        public Criteria andPistdlineidNotEqualTo(Long value) {
            addCriterion("PISTDLINEID <>", value, "pistdlineid");
            return (Criteria) this;
        }

        public Criteria andPistdlineidGreaterThan(Long value) {
            addCriterion("PISTDLINEID >", value, "pistdlineid");
            return (Criteria) this;
        }

        public Criteria andPistdlineidGreaterThanOrEqualTo(Long value) {
            addCriterion("PISTDLINEID >=", value, "pistdlineid");
            return (Criteria) this;
        }

        public Criteria andPistdlineidLessThan(Long value) {
            addCriterion("PISTDLINEID <", value, "pistdlineid");
            return (Criteria) this;
        }

        public Criteria andPistdlineidLessThanOrEqualTo(Long value) {
            addCriterion("PISTDLINEID <=", value, "pistdlineid");
            return (Criteria) this;
        }

        public Criteria andPistdlineidIn(List<Long> values) {
            addCriterion("PISTDLINEID in", values, "pistdlineid");
            return (Criteria) this;
        }

        public Criteria andPistdlineidNotIn(List<Long> values) {
            addCriterion("PISTDLINEID not in", values, "pistdlineid");
            return (Criteria) this;
        }

        public Criteria andPistdlineidBetween(Long value1, Long value2) {
            addCriterion("PISTDLINEID between", value1, value2, "pistdlineid");
            return (Criteria) this;
        }

        public Criteria andPistdlineidNotBetween(Long value1, Long value2) {
            addCriterion("PISTDLINEID not between", value1, value2, "pistdlineid");
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

        public Criteria andPistdlinenumIsNull() {
            addCriterion("PISTDLINENUM is null");
            return (Criteria) this;
        }

        public Criteria andPistdlinenumIsNotNull() {
            addCriterion("PISTDLINENUM is not null");
            return (Criteria) this;
        }

        public Criteria andPistdlinenumEqualTo(Integer value) {
            addCriterion("PISTDLINENUM =", value, "pistdlinenum");
            return (Criteria) this;
        }

        public Criteria andPistdlinenumNotEqualTo(Integer value) {
            addCriterion("PISTDLINENUM <>", value, "pistdlinenum");
            return (Criteria) this;
        }

        public Criteria andPistdlinenumGreaterThan(Integer value) {
            addCriterion("PISTDLINENUM >", value, "pistdlinenum");
            return (Criteria) this;
        }

        public Criteria andPistdlinenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("PISTDLINENUM >=", value, "pistdlinenum");
            return (Criteria) this;
        }

        public Criteria andPistdlinenumLessThan(Integer value) {
            addCriterion("PISTDLINENUM <", value, "pistdlinenum");
            return (Criteria) this;
        }

        public Criteria andPistdlinenumLessThanOrEqualTo(Integer value) {
            addCriterion("PISTDLINENUM <=", value, "pistdlinenum");
            return (Criteria) this;
        }

        public Criteria andPistdlinenumIn(List<Integer> values) {
            addCriterion("PISTDLINENUM in", values, "pistdlinenum");
            return (Criteria) this;
        }

        public Criteria andPistdlinenumNotIn(List<Integer> values) {
            addCriterion("PISTDLINENUM not in", values, "pistdlinenum");
            return (Criteria) this;
        }

        public Criteria andPistdlinenumBetween(Integer value1, Integer value2) {
            addCriterion("PISTDLINENUM between", value1, value2, "pistdlinenum");
            return (Criteria) this;
        }

        public Criteria andPistdlinenumNotBetween(Integer value1, Integer value2) {
            addCriterion("PISTDLINENUM not between", value1, value2, "pistdlinenum");
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

        public Criteria andDisabledIsNull() {
            addCriterion("DISABLED is null");
            return (Criteria) this;
        }

        public Criteria andDisabledIsNotNull() {
            addCriterion("DISABLED is not null");
            return (Criteria) this;
        }

        public Criteria andDisabledEqualTo(Integer value) {
            addCriterion("DISABLED =", value, "disabled");
            return (Criteria) this;
        }

        public Criteria andDisabledNotEqualTo(Integer value) {
            addCriterion("DISABLED <>", value, "disabled");
            return (Criteria) this;
        }

        public Criteria andDisabledGreaterThan(Integer value) {
            addCriterion("DISABLED >", value, "disabled");
            return (Criteria) this;
        }

        public Criteria andDisabledGreaterThanOrEqualTo(Integer value) {
            addCriterion("DISABLED >=", value, "disabled");
            return (Criteria) this;
        }

        public Criteria andDisabledLessThan(Integer value) {
            addCriterion("DISABLED <", value, "disabled");
            return (Criteria) this;
        }

        public Criteria andDisabledLessThanOrEqualTo(Integer value) {
            addCriterion("DISABLED <=", value, "disabled");
            return (Criteria) this;
        }

        public Criteria andDisabledIn(List<Integer> values) {
            addCriterion("DISABLED in", values, "disabled");
            return (Criteria) this;
        }

        public Criteria andDisabledNotIn(List<Integer> values) {
            addCriterion("DISABLED not in", values, "disabled");
            return (Criteria) this;
        }

        public Criteria andDisabledBetween(Integer value1, Integer value2) {
            addCriterion("DISABLED between", value1, value2, "disabled");
            return (Criteria) this;
        }

        public Criteria andDisabledNotBetween(Integer value1, Integer value2) {
            addCriterion("DISABLED not between", value1, value2, "disabled");
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