package com.transce.wcl.user.entity;

import com.pay.common.core.entity.BaseEntity;

public class RpUserPayConfig extends BaseEntity {
 
	private static final long serialVersionUID = 1L;

	/**
     * @备注:     
     * @字段:id VARCHAR(50)  
     */	
	private java.lang.String id;

	/**
     * @备注:     
     * @字段:create_time DATETIME(19)  
     */	
	private java.util.Date createTime;

	/**
     * @备注:     
     * @字段:edit_time DATETIME(19)  
     */	
	private java.util.Date editTime;

	/**
     * @备注:     
     * @字段:version BIGINT(19)  
     */	
	private java.lang.Long version;

	/**
     * @备注:     
     * @字段:remark VARCHAR(200)  
     */	
	private java.lang.String remark;

	/**
     * @备注:     
     * @字段:status VARCHAR(36)  
     */	
	private java.lang.String status;

	/**
     * @备注:     
     * @字段:audit_status VARCHAR(45)  
     */	
	private java.lang.String auditStatus;

	/**
     * @备注:     
     * @字段:is_auto_sett VARCHAR(36)  
     */	
	private java.lang.String isAutoSett;

	/**
     * @备注:支付产品编号     
     * @字段:product_code VARCHAR(50)  
     */	
	private java.lang.String productCode;

	/**
     * @备注:支付产品名称     
     * @字段:product_name VARCHAR(200)  
     */	
	private java.lang.String productName;

	/**
     * @备注:     
     * @字段:user_no VARCHAR(50)  
     */	
	private java.lang.String userNo;

	/**
     * @备注:     
     * @字段:user_name VARCHAR(100)  
     */	
	private java.lang.String userName;

	/**
     * @备注:     
     * @字段:risk_day INT(10)  
     */	
	private java.lang.Integer riskDay;

	/**
     * @备注:     
     * @字段:pay_key VARCHAR(50)  
     */	
	private java.lang.String payKey;

	/**
     * @备注:     
     * @字段:fund_into_type VARCHAR(50)  
     */	
	private java.lang.String fundIntoType;

	/**
     * @备注:     
     * @字段:pay_secret VARCHAR(50)  
     */	
	private java.lang.String paySecret;
	public RpUserPayConfig(){
	}

	public RpUserPayConfig(
		java.lang.String id
	){
		this.id = id;
	}

	public void setId(java.lang.String id) {
		this.id = id;
	}
	 
	public java.lang.String getId() {
		return this.id;
	}
	public void setCreateTime(java.util.Date createTime) {
		this.createTime = createTime;
	}
	 
	public java.util.Date getCreateTime() {
		return this.createTime;
	}
	 
	public void setEditTime(java.util.Date editTime) {
		this.editTime = editTime;
	}
	 
	public java.util.Date getEditTime() {
		return this.editTime;
	}
	 
	public void setVersion(java.lang.Long version) {
		this.version = version;
	}
	 

	public void setRemark(java.lang.String remark) {
		this.remark = remark;
	}
	 
	public java.lang.String getRemark() {
		return this.remark;
	}
	public void setStatus(java.lang.String status) {
		this.status = status;
	}
	 
	public java.lang.String getStatus() {
		return this.status;
	}
	public void setAuditStatus(java.lang.String auditStatus) {
		this.auditStatus = auditStatus;
	}
	 
	public java.lang.String getAuditStatus() {
		return this.auditStatus;
	}
	public void setIsAutoSett(java.lang.String isAutoSett) {
		this.isAutoSett = isAutoSett;
	}
	 
	public java.lang.String getIsAutoSett() {
		return this.isAutoSett;
	}
	public void setProductCode(java.lang.String productCode) {
		this.productCode = productCode;
	}
	 
	public java.lang.String getProductCode() {
		return this.productCode;
	}
	public void setProductName(java.lang.String productName) {
		this.productName = productName;
	}
	 
	public java.lang.String getProductName() {
		return this.productName;
	}
	public void setUserNo(java.lang.String userNo) {
		this.userNo = userNo;
	}
	 
	public java.lang.String getUserNo() {
		return this.userNo;
	}
	public void setUserName(java.lang.String userName) {
		this.userName = userName;
	}
	 
	public java.lang.String getUserName() {
		return this.userName;
	}
	public void setRiskDay(java.lang.Integer riskDay) {
		this.riskDay = riskDay;
	}
	 
	public java.lang.Integer getRiskDay() {
		return this.riskDay;
	}
	public void setPayKey(java.lang.String payKey) {
		this.payKey = payKey;
	}
	 
	public java.lang.String getPayKey() {
		return this.payKey;
	}
	public void setFundIntoType(java.lang.String fundIntoType) {
		this.fundIntoType = fundIntoType;
	}
	 
	public java.lang.String getFundIntoType() {
		return this.fundIntoType;
	}
	public void setPaySecret(java.lang.String paySecret) {
		this.paySecret = paySecret;
	}
	 
	public java.lang.String getPaySecret() {
		return this.paySecret;
	}
}
