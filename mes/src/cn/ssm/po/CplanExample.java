package cn.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CplanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CplanExample() {
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

        public Criteria andUnidcplanIsNull() {
            addCriterion("UNIDCPLAN is null");
            return (Criteria) this;
        }

        public Criteria andUnidcplanIsNotNull() {
            addCriterion("UNIDCPLAN is not null");
            return (Criteria) this;
        }

        public Criteria andUnidcplanEqualTo(Integer value) {
            addCriterion("UNIDCPLAN =", value, "unidcplan");
            return (Criteria) this;
        }

        public Criteria andUnidcplanNotEqualTo(Integer value) {
            addCriterion("UNIDCPLAN <>", value, "unidcplan");
            return (Criteria) this;
        }

        public Criteria andUnidcplanGreaterThan(Integer value) {
            addCriterion("UNIDCPLAN >", value, "unidcplan");
            return (Criteria) this;
        }

        public Criteria andUnidcplanGreaterThanOrEqualTo(Integer value) {
            addCriterion("UNIDCPLAN >=", value, "unidcplan");
            return (Criteria) this;
        }

        public Criteria andUnidcplanLessThan(Integer value) {
            addCriterion("UNIDCPLAN <", value, "unidcplan");
            return (Criteria) this;
        }

        public Criteria andUnidcplanLessThanOrEqualTo(Integer value) {
            addCriterion("UNIDCPLAN <=", value, "unidcplan");
            return (Criteria) this;
        }

        public Criteria andUnidcplanIn(List<Integer> values) {
            addCriterion("UNIDCPLAN in", values, "unidcplan");
            return (Criteria) this;
        }

        public Criteria andUnidcplanNotIn(List<Integer> values) {
            addCriterion("UNIDCPLAN not in", values, "unidcplan");
            return (Criteria) this;
        }

        public Criteria andUnidcplanBetween(Integer value1, Integer value2) {
            addCriterion("UNIDCPLAN between", value1, value2, "unidcplan");
            return (Criteria) this;
        }

        public Criteria andUnidcplanNotBetween(Integer value1, Integer value2) {
            addCriterion("UNIDCPLAN not between", value1, value2, "unidcplan");
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

        public Criteria andRegularIsNull() {
            addCriterion("REGULAR is null");
            return (Criteria) this;
        }

        public Criteria andRegularIsNotNull() {
            addCriterion("REGULAR is not null");
            return (Criteria) this;
        }

        public Criteria andRegularEqualTo(String value) {
            addCriterion("REGULAR =", value, "regular");
            return (Criteria) this;
        }

        public Criteria andRegularNotEqualTo(String value) {
            addCriterion("REGULAR <>", value, "regular");
            return (Criteria) this;
        }

        public Criteria andRegularGreaterThan(String value) {
            addCriterion("REGULAR >", value, "regular");
            return (Criteria) this;
        }

        public Criteria andRegularGreaterThanOrEqualTo(String value) {
            addCriterion("REGULAR >=", value, "regular");
            return (Criteria) this;
        }

        public Criteria andRegularLessThan(String value) {
            addCriterion("REGULAR <", value, "regular");
            return (Criteria) this;
        }

        public Criteria andRegularLessThanOrEqualTo(String value) {
            addCriterion("REGULAR <=", value, "regular");
            return (Criteria) this;
        }

        public Criteria andRegularLike(String value) {
            addCriterion("REGULAR like", value, "regular");
            return (Criteria) this;
        }

        public Criteria andRegularNotLike(String value) {
            addCriterion("REGULAR not like", value, "regular");
            return (Criteria) this;
        }

        public Criteria andRegularIn(List<String> values) {
            addCriterion("REGULAR in", values, "regular");
            return (Criteria) this;
        }

        public Criteria andRegularNotIn(List<String> values) {
            addCriterion("REGULAR not in", values, "regular");
            return (Criteria) this;
        }

        public Criteria andRegularBetween(String value1, String value2) {
            addCriterion("REGULAR between", value1, value2, "regular");
            return (Criteria) this;
        }

        public Criteria andRegularNotBetween(String value1, String value2) {
            addCriterion("REGULAR not between", value1, value2, "regular");
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

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("TYPE =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("TYPE <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("TYPE >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TYPE >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("TYPE <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("TYPE <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("TYPE like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("TYPE not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("TYPE in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("TYPE not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("TYPE between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("TYPE not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andDevicenoteIsNull() {
            addCriterion("DEVICENOTE is null");
            return (Criteria) this;
        }

        public Criteria andDevicenoteIsNotNull() {
            addCriterion("DEVICENOTE is not null");
            return (Criteria) this;
        }

        public Criteria andDevicenoteEqualTo(String value) {
            addCriterion("DEVICENOTE =", value, "devicenote");
            return (Criteria) this;
        }

        public Criteria andDevicenoteNotEqualTo(String value) {
            addCriterion("DEVICENOTE <>", value, "devicenote");
            return (Criteria) this;
        }

        public Criteria andDevicenoteGreaterThan(String value) {
            addCriterion("DEVICENOTE >", value, "devicenote");
            return (Criteria) this;
        }

        public Criteria andDevicenoteGreaterThanOrEqualTo(String value) {
            addCriterion("DEVICENOTE >=", value, "devicenote");
            return (Criteria) this;
        }

        public Criteria andDevicenoteLessThan(String value) {
            addCriterion("DEVICENOTE <", value, "devicenote");
            return (Criteria) this;
        }

        public Criteria andDevicenoteLessThanOrEqualTo(String value) {
            addCriterion("DEVICENOTE <=", value, "devicenote");
            return (Criteria) this;
        }

        public Criteria andDevicenoteLike(String value) {
            addCriterion("DEVICENOTE like", value, "devicenote");
            return (Criteria) this;
        }

        public Criteria andDevicenoteNotLike(String value) {
            addCriterion("DEVICENOTE not like", value, "devicenote");
            return (Criteria) this;
        }

        public Criteria andDevicenoteIn(List<String> values) {
            addCriterion("DEVICENOTE in", values, "devicenote");
            return (Criteria) this;
        }

        public Criteria andDevicenoteNotIn(List<String> values) {
            addCriterion("DEVICENOTE not in", values, "devicenote");
            return (Criteria) this;
        }

        public Criteria andDevicenoteBetween(String value1, String value2) {
            addCriterion("DEVICENOTE between", value1, value2, "devicenote");
            return (Criteria) this;
        }

        public Criteria andDevicenoteNotBetween(String value1, String value2) {
            addCriterion("DEVICENOTE not between", value1, value2, "devicenote");
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