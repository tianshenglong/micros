package com.study.microsvehicle.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VehicleAuditExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VehicleAuditExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(Integer value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(Integer value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(Integer value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(Integer value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(Integer value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(Integer value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<Integer> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<Integer> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(Integer value1, Integer value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(Integer value1, Integer value2) {
            addCriterion("version not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andAuditTypeIsNull() {
            addCriterion("audit_type is null");
            return (Criteria) this;
        }

        public Criteria andAuditTypeIsNotNull() {
            addCriterion("audit_type is not null");
            return (Criteria) this;
        }

        public Criteria andAuditTypeEqualTo(Byte value) {
            addCriterion("audit_type =", value, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditTypeNotEqualTo(Byte value) {
            addCriterion("audit_type <>", value, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditTypeGreaterThan(Byte value) {
            addCriterion("audit_type >", value, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("audit_type >=", value, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditTypeLessThan(Byte value) {
            addCriterion("audit_type <", value, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditTypeLessThanOrEqualTo(Byte value) {
            addCriterion("audit_type <=", value, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditTypeIn(List<Byte> values) {
            addCriterion("audit_type in", values, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditTypeNotIn(List<Byte> values) {
            addCriterion("audit_type not in", values, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditTypeBetween(Byte value1, Byte value2) {
            addCriterion("audit_type between", value1, value2, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("audit_type not between", value1, value2, "auditType");
            return (Criteria) this;
        }

        public Criteria andChannelIsNull() {
            addCriterion("channel is null");
            return (Criteria) this;
        }

        public Criteria andChannelIsNotNull() {
            addCriterion("channel is not null");
            return (Criteria) this;
        }

        public Criteria andChannelEqualTo(Byte value) {
            addCriterion("channel =", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotEqualTo(Byte value) {
            addCriterion("channel <>", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThan(Byte value) {
            addCriterion("channel >", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThanOrEqualTo(Byte value) {
            addCriterion("channel >=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThan(Byte value) {
            addCriterion("channel <", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThanOrEqualTo(Byte value) {
            addCriterion("channel <=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelIn(List<Byte> values) {
            addCriterion("channel in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotIn(List<Byte> values) {
            addCriterion("channel not in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelBetween(Byte value1, Byte value2) {
            addCriterion("channel between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotBetween(Byte value1, Byte value2) {
            addCriterion("channel not between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andDealerCodeIsNull() {
            addCriterion("dealer_code is null");
            return (Criteria) this;
        }

        public Criteria andDealerCodeIsNotNull() {
            addCriterion("dealer_code is not null");
            return (Criteria) this;
        }

        public Criteria andDealerCodeEqualTo(String value) {
            addCriterion("dealer_code =", value, "dealerCode");
            return (Criteria) this;
        }

        public Criteria andDealerCodeNotEqualTo(String value) {
            addCriterion("dealer_code <>", value, "dealerCode");
            return (Criteria) this;
        }

        public Criteria andDealerCodeGreaterThan(String value) {
            addCriterion("dealer_code >", value, "dealerCode");
            return (Criteria) this;
        }

        public Criteria andDealerCodeGreaterThanOrEqualTo(String value) {
            addCriterion("dealer_code >=", value, "dealerCode");
            return (Criteria) this;
        }

        public Criteria andDealerCodeLessThan(String value) {
            addCriterion("dealer_code <", value, "dealerCode");
            return (Criteria) this;
        }

        public Criteria andDealerCodeLessThanOrEqualTo(String value) {
            addCriterion("dealer_code <=", value, "dealerCode");
            return (Criteria) this;
        }

        public Criteria andDealerCodeLike(String value) {
            addCriterion("dealer_code like", value, "dealerCode");
            return (Criteria) this;
        }

        public Criteria andDealerCodeNotLike(String value) {
            addCriterion("dealer_code not like", value, "dealerCode");
            return (Criteria) this;
        }

        public Criteria andDealerCodeIn(List<String> values) {
            addCriterion("dealer_code in", values, "dealerCode");
            return (Criteria) this;
        }

        public Criteria andDealerCodeNotIn(List<String> values) {
            addCriterion("dealer_code not in", values, "dealerCode");
            return (Criteria) this;
        }

        public Criteria andDealerCodeBetween(String value1, String value2) {
            addCriterion("dealer_code between", value1, value2, "dealerCode");
            return (Criteria) this;
        }

        public Criteria andDealerCodeNotBetween(String value1, String value2) {
            addCriterion("dealer_code not between", value1, value2, "dealerCode");
            return (Criteria) this;
        }

        public Criteria andDealerIdIsNull() {
            addCriterion("dealer_id is null");
            return (Criteria) this;
        }

        public Criteria andDealerIdIsNotNull() {
            addCriterion("dealer_id is not null");
            return (Criteria) this;
        }

        public Criteria andDealerIdEqualTo(String value) {
            addCriterion("dealer_id =", value, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdNotEqualTo(String value) {
            addCriterion("dealer_id <>", value, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdGreaterThan(String value) {
            addCriterion("dealer_id >", value, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdGreaterThanOrEqualTo(String value) {
            addCriterion("dealer_id >=", value, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdLessThan(String value) {
            addCriterion("dealer_id <", value, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdLessThanOrEqualTo(String value) {
            addCriterion("dealer_id <=", value, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdLike(String value) {
            addCriterion("dealer_id like", value, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdNotLike(String value) {
            addCriterion("dealer_id not like", value, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdIn(List<String> values) {
            addCriterion("dealer_id in", values, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdNotIn(List<String> values) {
            addCriterion("dealer_id not in", values, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdBetween(String value1, String value2) {
            addCriterion("dealer_id between", value1, value2, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdNotBetween(String value1, String value2) {
            addCriterion("dealer_id not between", value1, value2, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerNameIsNull() {
            addCriterion("dealer_name is null");
            return (Criteria) this;
        }

        public Criteria andDealerNameIsNotNull() {
            addCriterion("dealer_name is not null");
            return (Criteria) this;
        }

        public Criteria andDealerNameEqualTo(String value) {
            addCriterion("dealer_name =", value, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameNotEqualTo(String value) {
            addCriterion("dealer_name <>", value, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameGreaterThan(String value) {
            addCriterion("dealer_name >", value, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameGreaterThanOrEqualTo(String value) {
            addCriterion("dealer_name >=", value, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameLessThan(String value) {
            addCriterion("dealer_name <", value, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameLessThanOrEqualTo(String value) {
            addCriterion("dealer_name <=", value, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameLike(String value) {
            addCriterion("dealer_name like", value, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameNotLike(String value) {
            addCriterion("dealer_name not like", value, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameIn(List<String> values) {
            addCriterion("dealer_name in", values, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameNotIn(List<String> values) {
            addCriterion("dealer_name not in", values, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameBetween(String value1, String value2) {
            addCriterion("dealer_name between", value1, value2, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameNotBetween(String value1, String value2) {
            addCriterion("dealer_name not between", value1, value2, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDrivingImgUrlIsNull() {
            addCriterion("driving_img_url is null");
            return (Criteria) this;
        }

        public Criteria andDrivingImgUrlIsNotNull() {
            addCriterion("driving_img_url is not null");
            return (Criteria) this;
        }

        public Criteria andDrivingImgUrlEqualTo(String value) {
            addCriterion("driving_img_url =", value, "drivingImgUrl");
            return (Criteria) this;
        }

        public Criteria andDrivingImgUrlNotEqualTo(String value) {
            addCriterion("driving_img_url <>", value, "drivingImgUrl");
            return (Criteria) this;
        }

        public Criteria andDrivingImgUrlGreaterThan(String value) {
            addCriterion("driving_img_url >", value, "drivingImgUrl");
            return (Criteria) this;
        }

        public Criteria andDrivingImgUrlGreaterThanOrEqualTo(String value) {
            addCriterion("driving_img_url >=", value, "drivingImgUrl");
            return (Criteria) this;
        }

        public Criteria andDrivingImgUrlLessThan(String value) {
            addCriterion("driving_img_url <", value, "drivingImgUrl");
            return (Criteria) this;
        }

        public Criteria andDrivingImgUrlLessThanOrEqualTo(String value) {
            addCriterion("driving_img_url <=", value, "drivingImgUrl");
            return (Criteria) this;
        }

        public Criteria andDrivingImgUrlLike(String value) {
            addCriterion("driving_img_url like", value, "drivingImgUrl");
            return (Criteria) this;
        }

        public Criteria andDrivingImgUrlNotLike(String value) {
            addCriterion("driving_img_url not like", value, "drivingImgUrl");
            return (Criteria) this;
        }

        public Criteria andDrivingImgUrlIn(List<String> values) {
            addCriterion("driving_img_url in", values, "drivingImgUrl");
            return (Criteria) this;
        }

        public Criteria andDrivingImgUrlNotIn(List<String> values) {
            addCriterion("driving_img_url not in", values, "drivingImgUrl");
            return (Criteria) this;
        }

        public Criteria andDrivingImgUrlBetween(String value1, String value2) {
            addCriterion("driving_img_url between", value1, value2, "drivingImgUrl");
            return (Criteria) this;
        }

        public Criteria andDrivingImgUrlNotBetween(String value1, String value2) {
            addCriterion("driving_img_url not between", value1, value2, "drivingImgUrl");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNull() {
            addCriterion("idcard is null");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNotNull() {
            addCriterion("idcard is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardEqualTo(String value) {
            addCriterion("idcard =", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotEqualTo(String value) {
            addCriterion("idcard <>", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThan(String value) {
            addCriterion("idcard >", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("idcard >=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThan(String value) {
            addCriterion("idcard <", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThanOrEqualTo(String value) {
            addCriterion("idcard <=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLike(String value) {
            addCriterion("idcard like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotLike(String value) {
            addCriterion("idcard not like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardIn(List<String> values) {
            addCriterion("idcard in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotIn(List<String> values) {
            addCriterion("idcard not in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardBetween(String value1, String value2) {
            addCriterion("idcard between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotBetween(String value1, String value2) {
            addCriterion("idcard not between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardImgUrlIsNull() {
            addCriterion("idcard_img_url is null");
            return (Criteria) this;
        }

        public Criteria andIdcardImgUrlIsNotNull() {
            addCriterion("idcard_img_url is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardImgUrlEqualTo(String value) {
            addCriterion("idcard_img_url =", value, "idcardImgUrl");
            return (Criteria) this;
        }

        public Criteria andIdcardImgUrlNotEqualTo(String value) {
            addCriterion("idcard_img_url <>", value, "idcardImgUrl");
            return (Criteria) this;
        }

        public Criteria andIdcardImgUrlGreaterThan(String value) {
            addCriterion("idcard_img_url >", value, "idcardImgUrl");
            return (Criteria) this;
        }

        public Criteria andIdcardImgUrlGreaterThanOrEqualTo(String value) {
            addCriterion("idcard_img_url >=", value, "idcardImgUrl");
            return (Criteria) this;
        }

        public Criteria andIdcardImgUrlLessThan(String value) {
            addCriterion("idcard_img_url <", value, "idcardImgUrl");
            return (Criteria) this;
        }

        public Criteria andIdcardImgUrlLessThanOrEqualTo(String value) {
            addCriterion("idcard_img_url <=", value, "idcardImgUrl");
            return (Criteria) this;
        }

        public Criteria andIdcardImgUrlLike(String value) {
            addCriterion("idcard_img_url like", value, "idcardImgUrl");
            return (Criteria) this;
        }

        public Criteria andIdcardImgUrlNotLike(String value) {
            addCriterion("idcard_img_url not like", value, "idcardImgUrl");
            return (Criteria) this;
        }

        public Criteria andIdcardImgUrlIn(List<String> values) {
            addCriterion("idcard_img_url in", values, "idcardImgUrl");
            return (Criteria) this;
        }

        public Criteria andIdcardImgUrlNotIn(List<String> values) {
            addCriterion("idcard_img_url not in", values, "idcardImgUrl");
            return (Criteria) this;
        }

        public Criteria andIdcardImgUrlBetween(String value1, String value2) {
            addCriterion("idcard_img_url between", value1, value2, "idcardImgUrl");
            return (Criteria) this;
        }

        public Criteria andIdcardImgUrlNotBetween(String value1, String value2) {
            addCriterion("idcard_img_url not between", value1, value2, "idcardImgUrl");
            return (Criteria) this;
        }

        public Criteria andInvoiceImgUrlIsNull() {
            addCriterion("invoice_img_url is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceImgUrlIsNotNull() {
            addCriterion("invoice_img_url is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceImgUrlEqualTo(String value) {
            addCriterion("invoice_img_url =", value, "invoiceImgUrl");
            return (Criteria) this;
        }

        public Criteria andInvoiceImgUrlNotEqualTo(String value) {
            addCriterion("invoice_img_url <>", value, "invoiceImgUrl");
            return (Criteria) this;
        }

        public Criteria andInvoiceImgUrlGreaterThan(String value) {
            addCriterion("invoice_img_url >", value, "invoiceImgUrl");
            return (Criteria) this;
        }

        public Criteria andInvoiceImgUrlGreaterThanOrEqualTo(String value) {
            addCriterion("invoice_img_url >=", value, "invoiceImgUrl");
            return (Criteria) this;
        }

        public Criteria andInvoiceImgUrlLessThan(String value) {
            addCriterion("invoice_img_url <", value, "invoiceImgUrl");
            return (Criteria) this;
        }

        public Criteria andInvoiceImgUrlLessThanOrEqualTo(String value) {
            addCriterion("invoice_img_url <=", value, "invoiceImgUrl");
            return (Criteria) this;
        }

        public Criteria andInvoiceImgUrlLike(String value) {
            addCriterion("invoice_img_url like", value, "invoiceImgUrl");
            return (Criteria) this;
        }

        public Criteria andInvoiceImgUrlNotLike(String value) {
            addCriterion("invoice_img_url not like", value, "invoiceImgUrl");
            return (Criteria) this;
        }

        public Criteria andInvoiceImgUrlIn(List<String> values) {
            addCriterion("invoice_img_url in", values, "invoiceImgUrl");
            return (Criteria) this;
        }

        public Criteria andInvoiceImgUrlNotIn(List<String> values) {
            addCriterion("invoice_img_url not in", values, "invoiceImgUrl");
            return (Criteria) this;
        }

        public Criteria andInvoiceImgUrlBetween(String value1, String value2) {
            addCriterion("invoice_img_url between", value1, value2, "invoiceImgUrl");
            return (Criteria) this;
        }

        public Criteria andInvoiceImgUrlNotBetween(String value1, String value2) {
            addCriterion("invoice_img_url not between", value1, value2, "invoiceImgUrl");
            return (Criteria) this;
        }

        public Criteria andLpnIsNull() {
            addCriterion("lpn is null");
            return (Criteria) this;
        }

        public Criteria andLpnIsNotNull() {
            addCriterion("lpn is not null");
            return (Criteria) this;
        }

        public Criteria andLpnEqualTo(String value) {
            addCriterion("lpn =", value, "lpn");
            return (Criteria) this;
        }

        public Criteria andLpnNotEqualTo(String value) {
            addCriterion("lpn <>", value, "lpn");
            return (Criteria) this;
        }

        public Criteria andLpnGreaterThan(String value) {
            addCriterion("lpn >", value, "lpn");
            return (Criteria) this;
        }

        public Criteria andLpnGreaterThanOrEqualTo(String value) {
            addCriterion("lpn >=", value, "lpn");
            return (Criteria) this;
        }

        public Criteria andLpnLessThan(String value) {
            addCriterion("lpn <", value, "lpn");
            return (Criteria) this;
        }

        public Criteria andLpnLessThanOrEqualTo(String value) {
            addCriterion("lpn <=", value, "lpn");
            return (Criteria) this;
        }

        public Criteria andLpnLike(String value) {
            addCriterion("lpn like", value, "lpn");
            return (Criteria) this;
        }

        public Criteria andLpnNotLike(String value) {
            addCriterion("lpn not like", value, "lpn");
            return (Criteria) this;
        }

        public Criteria andLpnIn(List<String> values) {
            addCriterion("lpn in", values, "lpn");
            return (Criteria) this;
        }

        public Criteria andLpnNotIn(List<String> values) {
            addCriterion("lpn not in", values, "lpn");
            return (Criteria) this;
        }

        public Criteria andLpnBetween(String value1, String value2) {
            addCriterion("lpn between", value1, value2, "lpn");
            return (Criteria) this;
        }

        public Criteria andLpnNotBetween(String value1, String value2) {
            addCriterion("lpn not between", value1, value2, "lpn");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNull() {
            addCriterion("operator is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNotNull() {
            addCriterion("operator is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorEqualTo(String value) {
            addCriterion("operator =", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotEqualTo(String value) {
            addCriterion("operator <>", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThan(String value) {
            addCriterion("operator >", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("operator >=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThan(String value) {
            addCriterion("operator <", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThanOrEqualTo(String value) {
            addCriterion("operator <=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLike(String value) {
            addCriterion("operator like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotLike(String value) {
            addCriterion("operator not like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorIn(List<String> values) {
            addCriterion("operator in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotIn(List<String> values) {
            addCriterion("operator not in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorBetween(String value1, String value2) {
            addCriterion("operator between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotBetween(String value1, String value2) {
            addCriterion("operator not between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andPublishableIsNull() {
            addCriterion("publishable is null");
            return (Criteria) this;
        }

        public Criteria andPublishableIsNotNull() {
            addCriterion("publishable is not null");
            return (Criteria) this;
        }

        public Criteria andPublishableEqualTo(Byte value) {
            addCriterion("publishable =", value, "publishable");
            return (Criteria) this;
        }

        public Criteria andPublishableNotEqualTo(Byte value) {
            addCriterion("publishable <>", value, "publishable");
            return (Criteria) this;
        }

        public Criteria andPublishableGreaterThan(Byte value) {
            addCriterion("publishable >", value, "publishable");
            return (Criteria) this;
        }

        public Criteria andPublishableGreaterThanOrEqualTo(Byte value) {
            addCriterion("publishable >=", value, "publishable");
            return (Criteria) this;
        }

        public Criteria andPublishableLessThan(Byte value) {
            addCriterion("publishable <", value, "publishable");
            return (Criteria) this;
        }

        public Criteria andPublishableLessThanOrEqualTo(Byte value) {
            addCriterion("publishable <=", value, "publishable");
            return (Criteria) this;
        }

        public Criteria andPublishableIn(List<Byte> values) {
            addCriterion("publishable in", values, "publishable");
            return (Criteria) this;
        }

        public Criteria andPublishableNotIn(List<Byte> values) {
            addCriterion("publishable not in", values, "publishable");
            return (Criteria) this;
        }

        public Criteria andPublishableBetween(Byte value1, Byte value2) {
            addCriterion("publishable between", value1, value2, "publishable");
            return (Criteria) this;
        }

        public Criteria andPublishableNotBetween(Byte value1, Byte value2) {
            addCriterion("publishable not between", value1, value2, "publishable");
            return (Criteria) this;
        }

        public Criteria andRecommenderMobileIsNull() {
            addCriterion("recommender_mobile is null");
            return (Criteria) this;
        }

        public Criteria andRecommenderMobileIsNotNull() {
            addCriterion("recommender_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andRecommenderMobileEqualTo(String value) {
            addCriterion("recommender_mobile =", value, "recommenderMobile");
            return (Criteria) this;
        }

        public Criteria andRecommenderMobileNotEqualTo(String value) {
            addCriterion("recommender_mobile <>", value, "recommenderMobile");
            return (Criteria) this;
        }

        public Criteria andRecommenderMobileGreaterThan(String value) {
            addCriterion("recommender_mobile >", value, "recommenderMobile");
            return (Criteria) this;
        }

        public Criteria andRecommenderMobileGreaterThanOrEqualTo(String value) {
            addCriterion("recommender_mobile >=", value, "recommenderMobile");
            return (Criteria) this;
        }

        public Criteria andRecommenderMobileLessThan(String value) {
            addCriterion("recommender_mobile <", value, "recommenderMobile");
            return (Criteria) this;
        }

        public Criteria andRecommenderMobileLessThanOrEqualTo(String value) {
            addCriterion("recommender_mobile <=", value, "recommenderMobile");
            return (Criteria) this;
        }

        public Criteria andRecommenderMobileLike(String value) {
            addCriterion("recommender_mobile like", value, "recommenderMobile");
            return (Criteria) this;
        }

        public Criteria andRecommenderMobileNotLike(String value) {
            addCriterion("recommender_mobile not like", value, "recommenderMobile");
            return (Criteria) this;
        }

        public Criteria andRecommenderMobileIn(List<String> values) {
            addCriterion("recommender_mobile in", values, "recommenderMobile");
            return (Criteria) this;
        }

        public Criteria andRecommenderMobileNotIn(List<String> values) {
            addCriterion("recommender_mobile not in", values, "recommenderMobile");
            return (Criteria) this;
        }

        public Criteria andRecommenderMobileBetween(String value1, String value2) {
            addCriterion("recommender_mobile between", value1, value2, "recommenderMobile");
            return (Criteria) this;
        }

        public Criteria andRecommenderMobileNotBetween(String value1, String value2) {
            addCriterion("recommender_mobile not between", value1, value2, "recommenderMobile");
            return (Criteria) this;
        }

        public Criteria andReviewResultIsNull() {
            addCriterion("review_result is null");
            return (Criteria) this;
        }

        public Criteria andReviewResultIsNotNull() {
            addCriterion("review_result is not null");
            return (Criteria) this;
        }

        public Criteria andReviewResultEqualTo(Byte value) {
            addCriterion("review_result =", value, "reviewResult");
            return (Criteria) this;
        }

        public Criteria andReviewResultNotEqualTo(Byte value) {
            addCriterion("review_result <>", value, "reviewResult");
            return (Criteria) this;
        }

        public Criteria andReviewResultGreaterThan(Byte value) {
            addCriterion("review_result >", value, "reviewResult");
            return (Criteria) this;
        }

        public Criteria andReviewResultGreaterThanOrEqualTo(Byte value) {
            addCriterion("review_result >=", value, "reviewResult");
            return (Criteria) this;
        }

        public Criteria andReviewResultLessThan(Byte value) {
            addCriterion("review_result <", value, "reviewResult");
            return (Criteria) this;
        }

        public Criteria andReviewResultLessThanOrEqualTo(Byte value) {
            addCriterion("review_result <=", value, "reviewResult");
            return (Criteria) this;
        }

        public Criteria andReviewResultIn(List<Byte> values) {
            addCriterion("review_result in", values, "reviewResult");
            return (Criteria) this;
        }

        public Criteria andReviewResultNotIn(List<Byte> values) {
            addCriterion("review_result not in", values, "reviewResult");
            return (Criteria) this;
        }

        public Criteria andReviewResultBetween(Byte value1, Byte value2) {
            addCriterion("review_result between", value1, value2, "reviewResult");
            return (Criteria) this;
        }

        public Criteria andReviewResultNotBetween(Byte value1, Byte value2) {
            addCriterion("review_result not between", value1, value2, "reviewResult");
            return (Criteria) this;
        }

        public Criteria andReviewTypeIsNull() {
            addCriterion("review_type is null");
            return (Criteria) this;
        }

        public Criteria andReviewTypeIsNotNull() {
            addCriterion("review_type is not null");
            return (Criteria) this;
        }

        public Criteria andReviewTypeEqualTo(Byte value) {
            addCriterion("review_type =", value, "reviewType");
            return (Criteria) this;
        }

        public Criteria andReviewTypeNotEqualTo(Byte value) {
            addCriterion("review_type <>", value, "reviewType");
            return (Criteria) this;
        }

        public Criteria andReviewTypeGreaterThan(Byte value) {
            addCriterion("review_type >", value, "reviewType");
            return (Criteria) this;
        }

        public Criteria andReviewTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("review_type >=", value, "reviewType");
            return (Criteria) this;
        }

        public Criteria andReviewTypeLessThan(Byte value) {
            addCriterion("review_type <", value, "reviewType");
            return (Criteria) this;
        }

        public Criteria andReviewTypeLessThanOrEqualTo(Byte value) {
            addCriterion("review_type <=", value, "reviewType");
            return (Criteria) this;
        }

        public Criteria andReviewTypeIn(List<Byte> values) {
            addCriterion("review_type in", values, "reviewType");
            return (Criteria) this;
        }

        public Criteria andReviewTypeNotIn(List<Byte> values) {
            addCriterion("review_type not in", values, "reviewType");
            return (Criteria) this;
        }

        public Criteria andReviewTypeBetween(Byte value1, Byte value2) {
            addCriterion("review_type between", value1, value2, "reviewType");
            return (Criteria) this;
        }

        public Criteria andReviewTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("review_type not between", value1, value2, "reviewType");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdIsNull() {
            addCriterion("vehicle_id is null");
            return (Criteria) this;
        }

        public Criteria andVehicleIdIsNotNull() {
            addCriterion("vehicle_id is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleIdEqualTo(String value) {
            addCriterion("vehicle_id =", value, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdNotEqualTo(String value) {
            addCriterion("vehicle_id <>", value, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdGreaterThan(String value) {
            addCriterion("vehicle_id >", value, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdGreaterThanOrEqualTo(String value) {
            addCriterion("vehicle_id >=", value, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdLessThan(String value) {
            addCriterion("vehicle_id <", value, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdLessThanOrEqualTo(String value) {
            addCriterion("vehicle_id <=", value, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdLike(String value) {
            addCriterion("vehicle_id like", value, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdNotLike(String value) {
            addCriterion("vehicle_id not like", value, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdIn(List<String> values) {
            addCriterion("vehicle_id in", values, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdNotIn(List<String> values) {
            addCriterion("vehicle_id not in", values, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdBetween(String value1, String value2) {
            addCriterion("vehicle_id between", value1, value2, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdNotBetween(String value1, String value2) {
            addCriterion("vehicle_id not between", value1, value2, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVinIsNull() {
            addCriterion("vin is null");
            return (Criteria) this;
        }

        public Criteria andVinIsNotNull() {
            addCriterion("vin is not null");
            return (Criteria) this;
        }

        public Criteria andVinEqualTo(String value) {
            addCriterion("vin =", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinNotEqualTo(String value) {
            addCriterion("vin <>", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinGreaterThan(String value) {
            addCriterion("vin >", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinGreaterThanOrEqualTo(String value) {
            addCriterion("vin >=", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinLessThan(String value) {
            addCriterion("vin <", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinLessThanOrEqualTo(String value) {
            addCriterion("vin <=", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinLike(String value) {
            addCriterion("vin like", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinNotLike(String value) {
            addCriterion("vin not like", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinIn(List<String> values) {
            addCriterion("vin in", values, "vin");
            return (Criteria) this;
        }

        public Criteria andVinNotIn(List<String> values) {
            addCriterion("vin not in", values, "vin");
            return (Criteria) this;
        }

        public Criteria andVinBetween(String value1, String value2) {
            addCriterion("vin between", value1, value2, "vin");
            return (Criteria) this;
        }

        public Criteria andVinNotBetween(String value1, String value2) {
            addCriterion("vin not between", value1, value2, "vin");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andCtrlCarIsNull() {
            addCriterion("ctrl_car is null");
            return (Criteria) this;
        }

        public Criteria andCtrlCarIsNotNull() {
            addCriterion("ctrl_car is not null");
            return (Criteria) this;
        }

        public Criteria andCtrlCarEqualTo(Byte value) {
            addCriterion("ctrl_car =", value, "ctrlCar");
            return (Criteria) this;
        }

        public Criteria andCtrlCarNotEqualTo(Byte value) {
            addCriterion("ctrl_car <>", value, "ctrlCar");
            return (Criteria) this;
        }

        public Criteria andCtrlCarGreaterThan(Byte value) {
            addCriterion("ctrl_car >", value, "ctrlCar");
            return (Criteria) this;
        }

        public Criteria andCtrlCarGreaterThanOrEqualTo(Byte value) {
            addCriterion("ctrl_car >=", value, "ctrlCar");
            return (Criteria) this;
        }

        public Criteria andCtrlCarLessThan(Byte value) {
            addCriterion("ctrl_car <", value, "ctrlCar");
            return (Criteria) this;
        }

        public Criteria andCtrlCarLessThanOrEqualTo(Byte value) {
            addCriterion("ctrl_car <=", value, "ctrlCar");
            return (Criteria) this;
        }

        public Criteria andCtrlCarIn(List<Byte> values) {
            addCriterion("ctrl_car in", values, "ctrlCar");
            return (Criteria) this;
        }

        public Criteria andCtrlCarNotIn(List<Byte> values) {
            addCriterion("ctrl_car not in", values, "ctrlCar");
            return (Criteria) this;
        }

        public Criteria andCtrlCarBetween(Byte value1, Byte value2) {
            addCriterion("ctrl_car between", value1, value2, "ctrlCar");
            return (Criteria) this;
        }

        public Criteria andCtrlCarNotBetween(Byte value1, Byte value2) {
            addCriterion("ctrl_car not between", value1, value2, "ctrlCar");
            return (Criteria) this;
        }

        public Criteria andDefaultCarIsNull() {
            addCriterion("default_car is null");
            return (Criteria) this;
        }

        public Criteria andDefaultCarIsNotNull() {
            addCriterion("default_car is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultCarEqualTo(Byte value) {
            addCriterion("default_car =", value, "defaultCar");
            return (Criteria) this;
        }

        public Criteria andDefaultCarNotEqualTo(Byte value) {
            addCriterion("default_car <>", value, "defaultCar");
            return (Criteria) this;
        }

        public Criteria andDefaultCarGreaterThan(Byte value) {
            addCriterion("default_car >", value, "defaultCar");
            return (Criteria) this;
        }

        public Criteria andDefaultCarGreaterThanOrEqualTo(Byte value) {
            addCriterion("default_car >=", value, "defaultCar");
            return (Criteria) this;
        }

        public Criteria andDefaultCarLessThan(Byte value) {
            addCriterion("default_car <", value, "defaultCar");
            return (Criteria) this;
        }

        public Criteria andDefaultCarLessThanOrEqualTo(Byte value) {
            addCriterion("default_car <=", value, "defaultCar");
            return (Criteria) this;
        }

        public Criteria andDefaultCarIn(List<Byte> values) {
            addCriterion("default_car in", values, "defaultCar");
            return (Criteria) this;
        }

        public Criteria andDefaultCarNotIn(List<Byte> values) {
            addCriterion("default_car not in", values, "defaultCar");
            return (Criteria) this;
        }

        public Criteria andDefaultCarBetween(Byte value1, Byte value2) {
            addCriterion("default_car between", value1, value2, "defaultCar");
            return (Criteria) this;
        }

        public Criteria andDefaultCarNotBetween(Byte value1, Byte value2) {
            addCriterion("default_car not between", value1, value2, "defaultCar");
            return (Criteria) this;
        }

        public Criteria andShowCarIsNull() {
            addCriterion("show_car is null");
            return (Criteria) this;
        }

        public Criteria andShowCarIsNotNull() {
            addCriterion("show_car is not null");
            return (Criteria) this;
        }

        public Criteria andShowCarEqualTo(Byte value) {
            addCriterion("show_car =", value, "showCar");
            return (Criteria) this;
        }

        public Criteria andShowCarNotEqualTo(Byte value) {
            addCriterion("show_car <>", value, "showCar");
            return (Criteria) this;
        }

        public Criteria andShowCarGreaterThan(Byte value) {
            addCriterion("show_car >", value, "showCar");
            return (Criteria) this;
        }

        public Criteria andShowCarGreaterThanOrEqualTo(Byte value) {
            addCriterion("show_car >=", value, "showCar");
            return (Criteria) this;
        }

        public Criteria andShowCarLessThan(Byte value) {
            addCriterion("show_car <", value, "showCar");
            return (Criteria) this;
        }

        public Criteria andShowCarLessThanOrEqualTo(Byte value) {
            addCriterion("show_car <=", value, "showCar");
            return (Criteria) this;
        }

        public Criteria andShowCarIn(List<Byte> values) {
            addCriterion("show_car in", values, "showCar");
            return (Criteria) this;
        }

        public Criteria andShowCarNotIn(List<Byte> values) {
            addCriterion("show_car not in", values, "showCar");
            return (Criteria) this;
        }

        public Criteria andShowCarBetween(Byte value1, Byte value2) {
            addCriterion("show_car between", value1, value2, "showCar");
            return (Criteria) this;
        }

        public Criteria andShowCarNotBetween(Byte value1, Byte value2) {
            addCriterion("show_car not between", value1, value2, "showCar");
            return (Criteria) this;
        }

        public Criteria andReplenishIsNull() {
            addCriterion("replenish is null");
            return (Criteria) this;
        }

        public Criteria andReplenishIsNotNull() {
            addCriterion("replenish is not null");
            return (Criteria) this;
        }

        public Criteria andReplenishEqualTo(Byte value) {
            addCriterion("replenish =", value, "replenish");
            return (Criteria) this;
        }

        public Criteria andReplenishNotEqualTo(Byte value) {
            addCriterion("replenish <>", value, "replenish");
            return (Criteria) this;
        }

        public Criteria andReplenishGreaterThan(Byte value) {
            addCriterion("replenish >", value, "replenish");
            return (Criteria) this;
        }

        public Criteria andReplenishGreaterThanOrEqualTo(Byte value) {
            addCriterion("replenish >=", value, "replenish");
            return (Criteria) this;
        }

        public Criteria andReplenishLessThan(Byte value) {
            addCriterion("replenish <", value, "replenish");
            return (Criteria) this;
        }

        public Criteria andReplenishLessThanOrEqualTo(Byte value) {
            addCriterion("replenish <=", value, "replenish");
            return (Criteria) this;
        }

        public Criteria andReplenishIn(List<Byte> values) {
            addCriterion("replenish in", values, "replenish");
            return (Criteria) this;
        }

        public Criteria andReplenishNotIn(List<Byte> values) {
            addCriterion("replenish not in", values, "replenish");
            return (Criteria) this;
        }

        public Criteria andReplenishBetween(Byte value1, Byte value2) {
            addCriterion("replenish between", value1, value2, "replenish");
            return (Criteria) this;
        }

        public Criteria andReplenishNotBetween(Byte value1, Byte value2) {
            addCriterion("replenish not between", value1, value2, "replenish");
            return (Criteria) this;
        }

        public Criteria andIdcardNameIsNull() {
            addCriterion("idcard_name is null");
            return (Criteria) this;
        }

        public Criteria andIdcardNameIsNotNull() {
            addCriterion("idcard_name is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardNameEqualTo(String value) {
            addCriterion("idcard_name =", value, "idcardName");
            return (Criteria) this;
        }

        public Criteria andIdcardNameNotEqualTo(String value) {
            addCriterion("idcard_name <>", value, "idcardName");
            return (Criteria) this;
        }

        public Criteria andIdcardNameGreaterThan(String value) {
            addCriterion("idcard_name >", value, "idcardName");
            return (Criteria) this;
        }

        public Criteria andIdcardNameGreaterThanOrEqualTo(String value) {
            addCriterion("idcard_name >=", value, "idcardName");
            return (Criteria) this;
        }

        public Criteria andIdcardNameLessThan(String value) {
            addCriterion("idcard_name <", value, "idcardName");
            return (Criteria) this;
        }

        public Criteria andIdcardNameLessThanOrEqualTo(String value) {
            addCriterion("idcard_name <=", value, "idcardName");
            return (Criteria) this;
        }

        public Criteria andIdcardNameLike(String value) {
            addCriterion("idcard_name like", value, "idcardName");
            return (Criteria) this;
        }

        public Criteria andIdcardNameNotLike(String value) {
            addCriterion("idcard_name not like", value, "idcardName");
            return (Criteria) this;
        }

        public Criteria andIdcardNameIn(List<String> values) {
            addCriterion("idcard_name in", values, "idcardName");
            return (Criteria) this;
        }

        public Criteria andIdcardNameNotIn(List<String> values) {
            addCriterion("idcard_name not in", values, "idcardName");
            return (Criteria) this;
        }

        public Criteria andIdcardNameBetween(String value1, String value2) {
            addCriterion("idcard_name between", value1, value2, "idcardName");
            return (Criteria) this;
        }

        public Criteria andIdcardNameNotBetween(String value1, String value2) {
            addCriterion("idcard_name not between", value1, value2, "idcardName");
            return (Criteria) this;
        }

        public Criteria andIdcardCodeIsNull() {
            addCriterion("idcard_code is null");
            return (Criteria) this;
        }

        public Criteria andIdcardCodeIsNotNull() {
            addCriterion("idcard_code is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardCodeEqualTo(String value) {
            addCriterion("idcard_code =", value, "idcardCode");
            return (Criteria) this;
        }

        public Criteria andIdcardCodeNotEqualTo(String value) {
            addCriterion("idcard_code <>", value, "idcardCode");
            return (Criteria) this;
        }

        public Criteria andIdcardCodeGreaterThan(String value) {
            addCriterion("idcard_code >", value, "idcardCode");
            return (Criteria) this;
        }

        public Criteria andIdcardCodeGreaterThanOrEqualTo(String value) {
            addCriterion("idcard_code >=", value, "idcardCode");
            return (Criteria) this;
        }

        public Criteria andIdcardCodeLessThan(String value) {
            addCriterion("idcard_code <", value, "idcardCode");
            return (Criteria) this;
        }

        public Criteria andIdcardCodeLessThanOrEqualTo(String value) {
            addCriterion("idcard_code <=", value, "idcardCode");
            return (Criteria) this;
        }

        public Criteria andIdcardCodeLike(String value) {
            addCriterion("idcard_code like", value, "idcardCode");
            return (Criteria) this;
        }

        public Criteria andIdcardCodeNotLike(String value) {
            addCriterion("idcard_code not like", value, "idcardCode");
            return (Criteria) this;
        }

        public Criteria andIdcardCodeIn(List<String> values) {
            addCriterion("idcard_code in", values, "idcardCode");
            return (Criteria) this;
        }

        public Criteria andIdcardCodeNotIn(List<String> values) {
            addCriterion("idcard_code not in", values, "idcardCode");
            return (Criteria) this;
        }

        public Criteria andIdcardCodeBetween(String value1, String value2) {
            addCriterion("idcard_code between", value1, value2, "idcardCode");
            return (Criteria) this;
        }

        public Criteria andIdcardCodeNotBetween(String value1, String value2) {
            addCriterion("idcard_code not between", value1, value2, "idcardCode");
            return (Criteria) this;
        }

        public Criteria andDrivingNameIsNull() {
            addCriterion("driving_name is null");
            return (Criteria) this;
        }

        public Criteria andDrivingNameIsNotNull() {
            addCriterion("driving_name is not null");
            return (Criteria) this;
        }

        public Criteria andDrivingNameEqualTo(String value) {
            addCriterion("driving_name =", value, "drivingName");
            return (Criteria) this;
        }

        public Criteria andDrivingNameNotEqualTo(String value) {
            addCriterion("driving_name <>", value, "drivingName");
            return (Criteria) this;
        }

        public Criteria andDrivingNameGreaterThan(String value) {
            addCriterion("driving_name >", value, "drivingName");
            return (Criteria) this;
        }

        public Criteria andDrivingNameGreaterThanOrEqualTo(String value) {
            addCriterion("driving_name >=", value, "drivingName");
            return (Criteria) this;
        }

        public Criteria andDrivingNameLessThan(String value) {
            addCriterion("driving_name <", value, "drivingName");
            return (Criteria) this;
        }

        public Criteria andDrivingNameLessThanOrEqualTo(String value) {
            addCriterion("driving_name <=", value, "drivingName");
            return (Criteria) this;
        }

        public Criteria andDrivingNameLike(String value) {
            addCriterion("driving_name like", value, "drivingName");
            return (Criteria) this;
        }

        public Criteria andDrivingNameNotLike(String value) {
            addCriterion("driving_name not like", value, "drivingName");
            return (Criteria) this;
        }

        public Criteria andDrivingNameIn(List<String> values) {
            addCriterion("driving_name in", values, "drivingName");
            return (Criteria) this;
        }

        public Criteria andDrivingNameNotIn(List<String> values) {
            addCriterion("driving_name not in", values, "drivingName");
            return (Criteria) this;
        }

        public Criteria andDrivingNameBetween(String value1, String value2) {
            addCriterion("driving_name between", value1, value2, "drivingName");
            return (Criteria) this;
        }

        public Criteria andDrivingNameNotBetween(String value1, String value2) {
            addCriterion("driving_name not between", value1, value2, "drivingName");
            return (Criteria) this;
        }

        public Criteria andDrivingVinIsNull() {
            addCriterion("driving_vin is null");
            return (Criteria) this;
        }

        public Criteria andDrivingVinIsNotNull() {
            addCriterion("driving_vin is not null");
            return (Criteria) this;
        }

        public Criteria andDrivingVinEqualTo(String value) {
            addCriterion("driving_vin =", value, "drivingVin");
            return (Criteria) this;
        }

        public Criteria andDrivingVinNotEqualTo(String value) {
            addCriterion("driving_vin <>", value, "drivingVin");
            return (Criteria) this;
        }

        public Criteria andDrivingVinGreaterThan(String value) {
            addCriterion("driving_vin >", value, "drivingVin");
            return (Criteria) this;
        }

        public Criteria andDrivingVinGreaterThanOrEqualTo(String value) {
            addCriterion("driving_vin >=", value, "drivingVin");
            return (Criteria) this;
        }

        public Criteria andDrivingVinLessThan(String value) {
            addCriterion("driving_vin <", value, "drivingVin");
            return (Criteria) this;
        }

        public Criteria andDrivingVinLessThanOrEqualTo(String value) {
            addCriterion("driving_vin <=", value, "drivingVin");
            return (Criteria) this;
        }

        public Criteria andDrivingVinLike(String value) {
            addCriterion("driving_vin like", value, "drivingVin");
            return (Criteria) this;
        }

        public Criteria andDrivingVinNotLike(String value) {
            addCriterion("driving_vin not like", value, "drivingVin");
            return (Criteria) this;
        }

        public Criteria andDrivingVinIn(List<String> values) {
            addCriterion("driving_vin in", values, "drivingVin");
            return (Criteria) this;
        }

        public Criteria andDrivingVinNotIn(List<String> values) {
            addCriterion("driving_vin not in", values, "drivingVin");
            return (Criteria) this;
        }

        public Criteria andDrivingVinBetween(String value1, String value2) {
            addCriterion("driving_vin between", value1, value2, "drivingVin");
            return (Criteria) this;
        }

        public Criteria andDrivingVinNotBetween(String value1, String value2) {
            addCriterion("driving_vin not between", value1, value2, "drivingVin");
            return (Criteria) this;
        }

        public Criteria andInvoiceNameIsNull() {
            addCriterion("invoice_name is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceNameIsNotNull() {
            addCriterion("invoice_name is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceNameEqualTo(String value) {
            addCriterion("invoice_name =", value, "invoiceName");
            return (Criteria) this;
        }

        public Criteria andInvoiceNameNotEqualTo(String value) {
            addCriterion("invoice_name <>", value, "invoiceName");
            return (Criteria) this;
        }

        public Criteria andInvoiceNameGreaterThan(String value) {
            addCriterion("invoice_name >", value, "invoiceName");
            return (Criteria) this;
        }

        public Criteria andInvoiceNameGreaterThanOrEqualTo(String value) {
            addCriterion("invoice_name >=", value, "invoiceName");
            return (Criteria) this;
        }

        public Criteria andInvoiceNameLessThan(String value) {
            addCriterion("invoice_name <", value, "invoiceName");
            return (Criteria) this;
        }

        public Criteria andInvoiceNameLessThanOrEqualTo(String value) {
            addCriterion("invoice_name <=", value, "invoiceName");
            return (Criteria) this;
        }

        public Criteria andInvoiceNameLike(String value) {
            addCriterion("invoice_name like", value, "invoiceName");
            return (Criteria) this;
        }

        public Criteria andInvoiceNameNotLike(String value) {
            addCriterion("invoice_name not like", value, "invoiceName");
            return (Criteria) this;
        }

        public Criteria andInvoiceNameIn(List<String> values) {
            addCriterion("invoice_name in", values, "invoiceName");
            return (Criteria) this;
        }

        public Criteria andInvoiceNameNotIn(List<String> values) {
            addCriterion("invoice_name not in", values, "invoiceName");
            return (Criteria) this;
        }

        public Criteria andInvoiceNameBetween(String value1, String value2) {
            addCriterion("invoice_name between", value1, value2, "invoiceName");
            return (Criteria) this;
        }

        public Criteria andInvoiceNameNotBetween(String value1, String value2) {
            addCriterion("invoice_name not between", value1, value2, "invoiceName");
            return (Criteria) this;
        }

        public Criteria andInvoiceVinIsNull() {
            addCriterion("invoice_vin is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceVinIsNotNull() {
            addCriterion("invoice_vin is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceVinEqualTo(String value) {
            addCriterion("invoice_vin =", value, "invoiceVin");
            return (Criteria) this;
        }

        public Criteria andInvoiceVinNotEqualTo(String value) {
            addCriterion("invoice_vin <>", value, "invoiceVin");
            return (Criteria) this;
        }

        public Criteria andInvoiceVinGreaterThan(String value) {
            addCriterion("invoice_vin >", value, "invoiceVin");
            return (Criteria) this;
        }

        public Criteria andInvoiceVinGreaterThanOrEqualTo(String value) {
            addCriterion("invoice_vin >=", value, "invoiceVin");
            return (Criteria) this;
        }

        public Criteria andInvoiceVinLessThan(String value) {
            addCriterion("invoice_vin <", value, "invoiceVin");
            return (Criteria) this;
        }

        public Criteria andInvoiceVinLessThanOrEqualTo(String value) {
            addCriterion("invoice_vin <=", value, "invoiceVin");
            return (Criteria) this;
        }

        public Criteria andInvoiceVinLike(String value) {
            addCriterion("invoice_vin like", value, "invoiceVin");
            return (Criteria) this;
        }

        public Criteria andInvoiceVinNotLike(String value) {
            addCriterion("invoice_vin not like", value, "invoiceVin");
            return (Criteria) this;
        }

        public Criteria andInvoiceVinIn(List<String> values) {
            addCriterion("invoice_vin in", values, "invoiceVin");
            return (Criteria) this;
        }

        public Criteria andInvoiceVinNotIn(List<String> values) {
            addCriterion("invoice_vin not in", values, "invoiceVin");
            return (Criteria) this;
        }

        public Criteria andInvoiceVinBetween(String value1, String value2) {
            addCriterion("invoice_vin between", value1, value2, "invoiceVin");
            return (Criteria) this;
        }

        public Criteria andInvoiceVinNotBetween(String value1, String value2) {
            addCriterion("invoice_vin not between", value1, value2, "invoiceVin");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeIsNull() {
            addCriterion("vehicle_type is null");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeIsNotNull() {
            addCriterion("vehicle_type is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeEqualTo(String value) {
            addCriterion("vehicle_type =", value, "vehicleType");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeNotEqualTo(String value) {
            addCriterion("vehicle_type <>", value, "vehicleType");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeGreaterThan(String value) {
            addCriterion("vehicle_type >", value, "vehicleType");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeGreaterThanOrEqualTo(String value) {
            addCriterion("vehicle_type >=", value, "vehicleType");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeLessThan(String value) {
            addCriterion("vehicle_type <", value, "vehicleType");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeLessThanOrEqualTo(String value) {
            addCriterion("vehicle_type <=", value, "vehicleType");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeLike(String value) {
            addCriterion("vehicle_type like", value, "vehicleType");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeNotLike(String value) {
            addCriterion("vehicle_type not like", value, "vehicleType");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeIn(List<String> values) {
            addCriterion("vehicle_type in", values, "vehicleType");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeNotIn(List<String> values) {
            addCriterion("vehicle_type not in", values, "vehicleType");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeBetween(String value1, String value2) {
            addCriterion("vehicle_type between", value1, value2, "vehicleType");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeNotBetween(String value1, String value2) {
            addCriterion("vehicle_type not between", value1, value2, "vehicleType");
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