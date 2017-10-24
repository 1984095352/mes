package cn.ssm.po;

import java.util.ArrayList;
import java.util.List;

public class CstdlineExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CstdlineExample() {
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

        public Criteria andUnidIsNull() {
            addCriterion("UNID is null");
            return (Criteria) this;
        }

        public Criteria andUnidIsNotNull() {
            addCriterion("UNID is not null");
            return (Criteria) this;
        }

        public Criteria andUnidEqualTo(Integer value) {
            addCriterion("UNID =", value, "unid");
            return (Criteria) this;
        }

        public Criteria andUnidNotEqualTo(Integer value) {
            addCriterion("UNID <>", value, "unid");
            return (Criteria) this;
        }

        public Criteria andUnidGreaterThan(Integer value) {
            addCriterion("UNID >", value, "unid");
            return (Criteria) this;
        }

        public Criteria andUnidGreaterThanOrEqualTo(Integer value) {
            addCriterion("UNID >=", value, "unid");
            return (Criteria) this;
        }

        public Criteria andUnidLessThan(Integer value) {
            addCriterion("UNID <", value, "unid");
            return (Criteria) this;
        }

        public Criteria andUnidLessThanOrEqualTo(Integer value) {
            addCriterion("UNID <=", value, "unid");
            return (Criteria) this;
        }

        public Criteria andUnidIn(List<Integer> values) {
            addCriterion("UNID in", values, "unid");
            return (Criteria) this;
        }

        public Criteria andUnidNotIn(List<Integer> values) {
            addCriterion("UNID not in", values, "unid");
            return (Criteria) this;
        }

        public Criteria andUnidBetween(Integer value1, Integer value2) {
            addCriterion("UNID between", value1, value2, "unid");
            return (Criteria) this;
        }

        public Criteria andUnidNotBetween(Integer value1, Integer value2) {
            addCriterion("UNID not between", value1, value2, "unid");
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

        public Criteria andContentflagIsNull() {
            addCriterion("CONTENTFLAG is null");
            return (Criteria) this;
        }

        public Criteria andContentflagIsNotNull() {
            addCriterion("CONTENTFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andContentflagEqualTo(String value) {
            addCriterion("CONTENTFLAG =", value, "contentflag");
            return (Criteria) this;
        }

        public Criteria andContentflagNotEqualTo(String value) {
            addCriterion("CONTENTFLAG <>", value, "contentflag");
            return (Criteria) this;
        }

        public Criteria andContentflagGreaterThan(String value) {
            addCriterion("CONTENTFLAG >", value, "contentflag");
            return (Criteria) this;
        }

        public Criteria andContentflagGreaterThanOrEqualTo(String value) {
            addCriterion("CONTENTFLAG >=", value, "contentflag");
            return (Criteria) this;
        }

        public Criteria andContentflagLessThan(String value) {
            addCriterion("CONTENTFLAG <", value, "contentflag");
            return (Criteria) this;
        }

        public Criteria andContentflagLessThanOrEqualTo(String value) {
            addCriterion("CONTENTFLAG <=", value, "contentflag");
            return (Criteria) this;
        }

        public Criteria andContentflagLike(String value) {
            addCriterion("CONTENTFLAG like", value, "contentflag");
            return (Criteria) this;
        }

        public Criteria andContentflagNotLike(String value) {
            addCriterion("CONTENTFLAG not like", value, "contentflag");
            return (Criteria) this;
        }

        public Criteria andContentflagIn(List<String> values) {
            addCriterion("CONTENTFLAG in", values, "contentflag");
            return (Criteria) this;
        }

        public Criteria andContentflagNotIn(List<String> values) {
            addCriterion("CONTENTFLAG not in", values, "contentflag");
            return (Criteria) this;
        }

        public Criteria andContentflagBetween(String value1, String value2) {
            addCriterion("CONTENTFLAG between", value1, value2, "contentflag");
            return (Criteria) this;
        }

        public Criteria andContentflagNotBetween(String value1, String value2) {
            addCriterion("CONTENTFLAG not between", value1, value2, "contentflag");
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