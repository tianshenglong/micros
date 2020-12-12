package com.study.microsvehicle.model;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

public class VehicleAudit implements Serializable {
    @ApiModelProperty(value = "id")
    private String id;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "修改时间")
    private Date updateTime;

    private Integer version;

    @ApiModelProperty(value = "认证类型")
    private Byte auditType;

    @ApiModelProperty(value = "认证渠道")
    private Byte channel;

    @ApiModelProperty(value = "经销商编码")
    private String dealerCode;

    @ApiModelProperty(value = "经销商id")
    private String dealerId;

    @ApiModelProperty(value = "经销商名称")
    private String dealerName;

    @ApiModelProperty(value = "行驶证图片地址")
    private String drivingImgUrl;

    @ApiModelProperty(value = "身份证号码")
    private String idcard;

    @ApiModelProperty(value = "身份证图片地址")
    private String idcardImgUrl;

    @ApiModelProperty(value = "购车发票图片地址")
    private String invoiceImgUrl;

    @ApiModelProperty(value = "车牌号")
    private String lpn;

    @ApiModelProperty(value = "操作人")
    private String operator;

    @ApiModelProperty(value = "认证方式")
    private Byte publishable;

    @ApiModelProperty(value = "推荐人手机号")
    private String recommenderMobile;

    @ApiModelProperty(value = "认证结果")
    private Byte reviewResult;

    @ApiModelProperty(value = "认证状态")
    private Byte reviewType;

    @ApiModelProperty(value = "用户id")
    private String userId;

    @ApiModelProperty(value = "车辆id")
    private String vehicleId;

    @ApiModelProperty(value = "vin")
    private String vin;

    @ApiModelProperty(value = "手机号")
    private String mobile;

    @ApiModelProperty(value = "姓名")
    private String name;

    @ApiModelProperty(value = "控车0否1是")
    private Byte ctrlCar;

    @ApiModelProperty(value = "默认车辆0否1是")
    private Byte defaultCar;

    @ApiModelProperty(value = "爱车展示")
    private Byte showCar;

    @ApiModelProperty(value = "是否是补传身份证验证1是2否")
    private Byte replenish;

    @ApiModelProperty(value = "系统识别身份证姓名")
    private String idcardName;

    @ApiModelProperty(value = "系统识别身份证号")
    private String idcardCode;

    @ApiModelProperty(value = "系统识别行驶证姓名")
    private String drivingName;

    @ApiModelProperty(value = "系统识别行驶证VIN")
    private String drivingVin;

    @ApiModelProperty(value = "系统识别购车发票姓名")
    private String invoiceName;

    @ApiModelProperty(value = "系统识别购车发票VIN")
    private String invoiceVin;

    @ApiModelProperty(value = "认证车型id")
    private String vehicleType;

    @ApiModelProperty(value = "行驶证识别信息")
    private String driving;

    @ApiModelProperty(value = "发票识别信息")
    private String invoice;

    @ApiModelProperty(value = "身份证识别信息")
    private String idcardDiscern;

    @ApiModelProperty(value = "行驶证识别信息")
    private String drivingDiscern;

    @ApiModelProperty(value = "发票识别信息")
    private String invoiceDiscern;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Byte getAuditType() {
        return auditType;
    }

    public void setAuditType(Byte auditType) {
        this.auditType = auditType;
    }

    public Byte getChannel() {
        return channel;
    }

    public void setChannel(Byte channel) {
        this.channel = channel;
    }

    public String getDealerCode() {
        return dealerCode;
    }

    public void setDealerCode(String dealerCode) {
        this.dealerCode = dealerCode;
    }

    public String getDealerId() {
        return dealerId;
    }

    public void setDealerId(String dealerId) {
        this.dealerId = dealerId;
    }

    public String getDealerName() {
        return dealerName;
    }

    public void setDealerName(String dealerName) {
        this.dealerName = dealerName;
    }

    public String getDrivingImgUrl() {
        return drivingImgUrl;
    }

    public void setDrivingImgUrl(String drivingImgUrl) {
        this.drivingImgUrl = drivingImgUrl;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public String getIdcardImgUrl() {
        return idcardImgUrl;
    }

    public void setIdcardImgUrl(String idcardImgUrl) {
        this.idcardImgUrl = idcardImgUrl;
    }

    public String getInvoiceImgUrl() {
        return invoiceImgUrl;
    }

    public void setInvoiceImgUrl(String invoiceImgUrl) {
        this.invoiceImgUrl = invoiceImgUrl;
    }

    public String getLpn() {
        return lpn;
    }

    public void setLpn(String lpn) {
        this.lpn = lpn;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Byte getPublishable() {
        return publishable;
    }

    public void setPublishable(Byte publishable) {
        this.publishable = publishable;
    }

    public String getRecommenderMobile() {
        return recommenderMobile;
    }

    public void setRecommenderMobile(String recommenderMobile) {
        this.recommenderMobile = recommenderMobile;
    }

    public Byte getReviewResult() {
        return reviewResult;
    }

    public void setReviewResult(Byte reviewResult) {
        this.reviewResult = reviewResult;
    }

    public Byte getReviewType() {
        return reviewType;
    }

    public void setReviewType(Byte reviewType) {
        this.reviewType = reviewType;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Byte getCtrlCar() {
        return ctrlCar;
    }

    public void setCtrlCar(Byte ctrlCar) {
        this.ctrlCar = ctrlCar;
    }

    public Byte getDefaultCar() {
        return defaultCar;
    }

    public void setDefaultCar(Byte defaultCar) {
        this.defaultCar = defaultCar;
    }

    public Byte getShowCar() {
        return showCar;
    }

    public void setShowCar(Byte showCar) {
        this.showCar = showCar;
    }

    public Byte getReplenish() {
        return replenish;
    }

    public void setReplenish(Byte replenish) {
        this.replenish = replenish;
    }

    public String getIdcardName() {
        return idcardName;
    }

    public void setIdcardName(String idcardName) {
        this.idcardName = idcardName;
    }

    public String getIdcardCode() {
        return idcardCode;
    }

    public void setIdcardCode(String idcardCode) {
        this.idcardCode = idcardCode;
    }

    public String getDrivingName() {
        return drivingName;
    }

    public void setDrivingName(String drivingName) {
        this.drivingName = drivingName;
    }

    public String getDrivingVin() {
        return drivingVin;
    }

    public void setDrivingVin(String drivingVin) {
        this.drivingVin = drivingVin;
    }

    public String getInvoiceName() {
        return invoiceName;
    }

    public void setInvoiceName(String invoiceName) {
        this.invoiceName = invoiceName;
    }

    public String getInvoiceVin() {
        return invoiceVin;
    }

    public void setInvoiceVin(String invoiceVin) {
        this.invoiceVin = invoiceVin;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getDriving() {
        return driving;
    }

    public void setDriving(String driving) {
        this.driving = driving;
    }

    public String getInvoice() {
        return invoice;
    }

    public void setInvoice(String invoice) {
        this.invoice = invoice;
    }

    public String getIdcardDiscern() {
        return idcardDiscern;
    }

    public void setIdcardDiscern(String idcardDiscern) {
        this.idcardDiscern = idcardDiscern;
    }

    public String getDrivingDiscern() {
        return drivingDiscern;
    }

    public void setDrivingDiscern(String drivingDiscern) {
        this.drivingDiscern = drivingDiscern;
    }

    public String getInvoiceDiscern() {
        return invoiceDiscern;
    }

    public void setInvoiceDiscern(String invoiceDiscern) {
        this.invoiceDiscern = invoiceDiscern;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", version=").append(version);
        sb.append(", auditType=").append(auditType);
        sb.append(", channel=").append(channel);
        sb.append(", dealerCode=").append(dealerCode);
        sb.append(", dealerId=").append(dealerId);
        sb.append(", dealerName=").append(dealerName);
        sb.append(", drivingImgUrl=").append(drivingImgUrl);
        sb.append(", idcard=").append(idcard);
        sb.append(", idcardImgUrl=").append(idcardImgUrl);
        sb.append(", invoiceImgUrl=").append(invoiceImgUrl);
        sb.append(", lpn=").append(lpn);
        sb.append(", operator=").append(operator);
        sb.append(", publishable=").append(publishable);
        sb.append(", recommenderMobile=").append(recommenderMobile);
        sb.append(", reviewResult=").append(reviewResult);
        sb.append(", reviewType=").append(reviewType);
        sb.append(", userId=").append(userId);
        sb.append(", vehicleId=").append(vehicleId);
        sb.append(", vin=").append(vin);
        sb.append(", mobile=").append(mobile);
        sb.append(", name=").append(name);
        sb.append(", ctrlCar=").append(ctrlCar);
        sb.append(", defaultCar=").append(defaultCar);
        sb.append(", showCar=").append(showCar);
        sb.append(", replenish=").append(replenish);
        sb.append(", idcardName=").append(idcardName);
        sb.append(", idcardCode=").append(idcardCode);
        sb.append(", drivingName=").append(drivingName);
        sb.append(", drivingVin=").append(drivingVin);
        sb.append(", invoiceName=").append(invoiceName);
        sb.append(", invoiceVin=").append(invoiceVin);
        sb.append(", vehicleType=").append(vehicleType);
        sb.append(", driving=").append(driving);
        sb.append(", invoice=").append(invoice);
        sb.append(", idcardDiscern=").append(idcardDiscern);
        sb.append(", drivingDiscern=").append(drivingDiscern);
        sb.append(", invoiceDiscern=").append(invoiceDiscern);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}