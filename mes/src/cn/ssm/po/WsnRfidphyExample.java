package cn.ssm.po;

import java.util.ArrayList;
import java.util.List;

public class WsnRfidphyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WsnRfidphyExample() {
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

        public Criteria andUnidrfidphyIsNull() {
            addCriterion("UNIDRFIDPHY is null");
            return (Criteria) this;
        }

        public Criteria andUnidrfidphyIsNotNull() {
            addCriterion("UNIDRFIDPHY is not null");
            return (Criteria) this;
        }

        public Criteria andUnidrfidphyEqualTo(Integer value) {
            addCriterion("UNIDRFIDPHY =", value, "unidrfidphy");
            return (Criteria) this;
        }

        public Criteria andUnidrfidphyNotEqualTo(Integer value) {
            addCriterion("UNIDRFIDPHY <>", value, "unidrfidphy");
            return (Criteria) this;
        }

        public Criteria andUnidrfidphyGreaterThan(Integer value) {
            addCriterion("UNIDRFIDPHY >", value, "unidrfidphy");
            return (Criteria) this;
        }

        public Criteria andUnidrfidphyGreaterThanOrEqualTo(Integer value) {
            addCriterion("UNIDRFIDPHY >=", value, "unidrfidphy");
            return (Criteria) this;
        }

        public Criteria andUnidrfidphyLessThan(Integer value) {
            addCriterion("UNIDRFIDPHY <", value, "unidrfidphy");
            return (Criteria) this;
        }

        public Criteria andUnidrfidphyLessThanOrEqualTo(Integer value) {
            addCriterion("UNIDRFIDPHY <=", value, "unidrfidphy");
            return (Criteria) this;
        }

        public Criteria andUnidrfidphyIn(List<Integer> values) {
            addCriterion("UNIDRFIDPHY in", values, "unidrfidphy");
            return (Criteria) this;
        }

        public Criteria andUnidrfidphyNotIn(List<Integer> values) {
            addCriterion("UNIDRFIDPHY not in", values, "unidrfidphy");
            return (Criteria) this;
        }

        public Criteria andUnidrfidphyBetween(Integer value1, Integer value2) {
            addCriterion("UNIDRFIDPHY between", value1, value2, "unidrfidphy");
            return (Criteria) this;
        }

        public Criteria andUnidrfidphyNotBetween(Integer value1, Integer value2) {
            addCriterion("UNIDRFIDPHY not between", value1, value2, "unidrfidphy");
            return (Criteria) this;
        }

        public Criteria andRfidIsNull() {
            addCriterion("RFID is null");
            return (Criteria) this;
        }

        public Criteria andRfidIsNotNull() {
            addCriterion("RFID is not null");
            return (Criteria) this;
        }

        public Criteria andRfidEqualTo(String value) {
            addCriterion("RFID =", value, "rfid");
            return (Criteria) this;
        }

        public Criteria andRfidNotEqualTo(String value) {
            addCriterion("RFID <>", value, "rfid");
            return (Criteria) this;
        }

        public Criteria andRfidGreaterThan(String value) {
            addCriterion("RFID >", value, "rfid");
            return (Criteria) this;
        }

        public Criteria andRfidGreaterThanOrEqualTo(String value) {
            addCriterion("RFID >=", value, "rfid");
            return (Criteria) this;
        }

        public Criteria andRfidLessThan(String value) {
            addCriterion("RFID <", value, "rfid");
            return (Criteria) this;
        }

        public Criteria andRfidLessThanOrEqualTo(String value) {
            addCriterion("RFID <=", value, "rfid");
            return (Criteria) this;
        }

        public Criteria andRfidLike(String value) {
            addCriterion("RFID like", value, "rfid");
            return (Criteria) this;
        }

        public Criteria andRfidNotLike(String value) {
            addCriterion("RFID not like", value, "rfid");
            return (Criteria) this;
        }

        public Criteria andRfidIn(List<String> values) {
            addCriterion("RFID in", values, "rfid");
            return (Criteria) this;
        }

        public Criteria andRfidNotIn(List<String> values) {
            addCriterion("RFID not in", values, "rfid");
            return (Criteria) this;
        }

        public Criteria andRfidBetween(String value1, String value2) {
            addCriterion("RFID between", value1, value2, "rfid");
            return (Criteria) this;
        }

        public Criteria andRfidNotBetween(String value1, String value2) {
            addCriterion("RFID not between", value1, value2, "rfid");
            return (Criteria) this;
        }

        public Criteria andPhynumIsNull() {
            addCriterion("PHYNUM is null");
            return (Criteria) this;
        }

        public Criteria andPhynumIsNotNull() {
            addCriterion("PHYNUM is not null");
            return (Criteria) this;
        }

        public Criteria andPhynumEqualTo(String value) {
            addCriterion("PHYNUM =", value, "phynum");
            return (Criteria) this;
        }

        public Criteria andPhynumNotEqualTo(String value) {
            addCriterion("PHYNUM <>", value, "phynum");
            return (Criteria) this;
        }

        public Criteria andPhynumGreaterThan(String value) {
            addCriterion("PHYNUM >", value, "phynum");
            return (Criteria) this;
        }

        public Criteria andPhynumGreaterThanOrEqualTo(String value) {
            addCriterion("PHYNUM >=", value, "phynum");
            return (Criteria) this;
        }

        public Criteria andPhynumLessThan(String value) {
            addCriterion("PHYNUM <", value, "phynum");
            return (Criteria) this;
        }

        public Criteria andPhynumLessThanOrEqualTo(String value) {
            addCriterion("PHYNUM <=", value, "phynum");
            return (Criteria) this;
        }

        public Criteria andPhynumLike(String value) {
            addCriterion("PHYNUM like", value, "phynum");
            return (Criteria) this;
        }

        public Criteria andPhynumNotLike(String value) {
            addCriterion("PHYNUM not like", value, "phynum");
            return (Criteria) this;
        }

        public Criteria andPhynumIn(List<String> values) {
            addCriterion("PHYNUM in", values, "phynum");
            return (Criteria) this;
        }

        public Criteria andPhynumNotIn(List<String> values) {
            addCriterion("PHYNUM not in", values, "phynum");
            return (Criteria) this;
        }

        public Criteria andPhynumBetween(String value1, String value2) {
            addCriterion("PHYNUM between", value1, value2, "phynum");
            return (Criteria) this;
        }

        public Criteria andPhynumNotBetween(String value1, String value2) {
            addCriterion("PHYNUM not between", value1, value2, "phynum");
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