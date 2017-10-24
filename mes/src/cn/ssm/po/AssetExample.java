package cn.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AssetExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AssetExample() {
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

        public Criteria andAssetuidIsNull() {
            addCriterion("ASSETUID is null");
            return (Criteria) this;
        }

        public Criteria andAssetuidIsNotNull() {
            addCriterion("ASSETUID is not null");
            return (Criteria) this;
        }

        public Criteria andAssetuidEqualTo(Integer value) {
            addCriterion("ASSETUID =", value, "assetuid");
            return (Criteria) this;
        }

        public Criteria andAssetuidNotEqualTo(Integer value) {
            addCriterion("ASSETUID <>", value, "assetuid");
            return (Criteria) this;
        }

        public Criteria andAssetuidGreaterThan(Integer value) {
            addCriterion("ASSETUID >", value, "assetuid");
            return (Criteria) this;
        }

        public Criteria andAssetuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ASSETUID >=", value, "assetuid");
            return (Criteria) this;
        }

        public Criteria andAssetuidLessThan(Integer value) {
            addCriterion("ASSETUID <", value, "assetuid");
            return (Criteria) this;
        }

        public Criteria andAssetuidLessThanOrEqualTo(Integer value) {
            addCriterion("ASSETUID <=", value, "assetuid");
            return (Criteria) this;
        }

        public Criteria andAssetuidIn(List<Integer> values) {
            addCriterion("ASSETUID in", values, "assetuid");
            return (Criteria) this;
        }

        public Criteria andAssetuidNotIn(List<Integer> values) {
            addCriterion("ASSETUID not in", values, "assetuid");
            return (Criteria) this;
        }

        public Criteria andAssetuidBetween(Integer value1, Integer value2) {
            addCriterion("ASSETUID between", value1, value2, "assetuid");
            return (Criteria) this;
        }

        public Criteria andAssetuidNotBetween(Integer value1, Integer value2) {
            addCriterion("ASSETUID not between", value1, value2, "assetuid");
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

        public Criteria andActionIsNull() {
            addCriterion("ACTION is null");
            return (Criteria) this;
        }

        public Criteria andActionIsNotNull() {
            addCriterion("ACTION is not null");
            return (Criteria) this;
        }

        public Criteria andActionEqualTo(String value) {
            addCriterion("ACTION =", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionNotEqualTo(String value) {
            addCriterion("ACTION <>", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionGreaterThan(String value) {
            addCriterion("ACTION >", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionGreaterThanOrEqualTo(String value) {
            addCriterion("ACTION >=", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionLessThan(String value) {
            addCriterion("ACTION <", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionLessThanOrEqualTo(String value) {
            addCriterion("ACTION <=", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionLike(String value) {
            addCriterion("ACTION like", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionNotLike(String value) {
            addCriterion("ACTION not like", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionIn(List<String> values) {
            addCriterion("ACTION in", values, "action");
            return (Criteria) this;
        }

        public Criteria andActionNotIn(List<String> values) {
            addCriterion("ACTION not in", values, "action");
            return (Criteria) this;
        }

        public Criteria andActionBetween(String value1, String value2) {
            addCriterion("ACTION between", value1, value2, "action");
            return (Criteria) this;
        }

        public Criteria andActionNotBetween(String value1, String value2) {
            addCriterion("ACTION not between", value1, value2, "action");
            return (Criteria) this;
        }

        public Criteria andActionsideIsNull() {
            addCriterion("ACTIONSIDE is null");
            return (Criteria) this;
        }

        public Criteria andActionsideIsNotNull() {
            addCriterion("ACTIONSIDE is not null");
            return (Criteria) this;
        }

        public Criteria andActionsideEqualTo(String value) {
            addCriterion("ACTIONSIDE =", value, "actionside");
            return (Criteria) this;
        }

        public Criteria andActionsideNotEqualTo(String value) {
            addCriterion("ACTIONSIDE <>", value, "actionside");
            return (Criteria) this;
        }

        public Criteria andActionsideGreaterThan(String value) {
            addCriterion("ACTIONSIDE >", value, "actionside");
            return (Criteria) this;
        }

        public Criteria andActionsideGreaterThanOrEqualTo(String value) {
            addCriterion("ACTIONSIDE >=", value, "actionside");
            return (Criteria) this;
        }

        public Criteria andActionsideLessThan(String value) {
            addCriterion("ACTIONSIDE <", value, "actionside");
            return (Criteria) this;
        }

        public Criteria andActionsideLessThanOrEqualTo(String value) {
            addCriterion("ACTIONSIDE <=", value, "actionside");
            return (Criteria) this;
        }

        public Criteria andActionsideLike(String value) {
            addCriterion("ACTIONSIDE like", value, "actionside");
            return (Criteria) this;
        }

        public Criteria andActionsideNotLike(String value) {
            addCriterion("ACTIONSIDE not like", value, "actionside");
            return (Criteria) this;
        }

        public Criteria andActionsideIn(List<String> values) {
            addCriterion("ACTIONSIDE in", values, "actionside");
            return (Criteria) this;
        }

        public Criteria andActionsideNotIn(List<String> values) {
            addCriterion("ACTIONSIDE not in", values, "actionside");
            return (Criteria) this;
        }

        public Criteria andActionsideBetween(String value1, String value2) {
            addCriterion("ACTIONSIDE between", value1, value2, "actionside");
            return (Criteria) this;
        }

        public Criteria andActionsideNotBetween(String value1, String value2) {
            addCriterion("ACTIONSIDE not between", value1, value2, "actionside");
            return (Criteria) this;
        }

        public Criteria andActiontimeIsNull() {
            addCriterion("ACTIONTIME is null");
            return (Criteria) this;
        }

        public Criteria andActiontimeIsNotNull() {
            addCriterion("ACTIONTIME is not null");
            return (Criteria) this;
        }

        public Criteria andActiontimeEqualTo(Date value) {
            addCriterion("ACTIONTIME =", value, "actiontime");
            return (Criteria) this;
        }

        public Criteria andActiontimeNotEqualTo(Date value) {
            addCriterion("ACTIONTIME <>", value, "actiontime");
            return (Criteria) this;
        }

        public Criteria andActiontimeGreaterThan(Date value) {
            addCriterion("ACTIONTIME >", value, "actiontime");
            return (Criteria) this;
        }

        public Criteria andActiontimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ACTIONTIME >=", value, "actiontime");
            return (Criteria) this;
        }

        public Criteria andActiontimeLessThan(Date value) {
            addCriterion("ACTIONTIME <", value, "actiontime");
            return (Criteria) this;
        }

        public Criteria andActiontimeLessThanOrEqualTo(Date value) {
            addCriterion("ACTIONTIME <=", value, "actiontime");
            return (Criteria) this;
        }

        public Criteria andActiontimeIn(List<Date> values) {
            addCriterion("ACTIONTIME in", values, "actiontime");
            return (Criteria) this;
        }

        public Criteria andActiontimeNotIn(List<Date> values) {
            addCriterion("ACTIONTIME not in", values, "actiontime");
            return (Criteria) this;
        }

        public Criteria andActiontimeBetween(Date value1, Date value2) {
            addCriterion("ACTIONTIME between", value1, value2, "actiontime");
            return (Criteria) this;
        }

        public Criteria andActiontimeNotBetween(Date value1, Date value2) {
            addCriterion("ACTIONTIME not between", value1, value2, "actiontime");
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