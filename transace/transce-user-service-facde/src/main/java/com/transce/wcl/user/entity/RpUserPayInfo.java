package com.transce.wcl.user.entity;

import com.pay.common.core.entity.BaseEntity;

public class RpUserPayInfo extends BaseEntity {
 
	private static final long serialVersionUID = 1L;

	/**
     * @备注:     
     * @字段:id_ VARCHAR(50)  
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
     * @字段:app_id VARCHAR(50)  
     */	
	private java.lang.String appId;

	/**
     * @备注:     
     * @字段:app_sectet VARCHAR(100)  
     */	
	private java.lang.String appSectet;

	/**
     * @备注:     
     * @字段:merchant_id VARCHAR(50)  
     */	
	private java.lang.String merchantId;

	/**
     * @备注:     
     * @字段:app_type VARCHAR(50)  
     */	
	private java.lang.String appType;

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
     * @字段:partner_key VARCHAR(100)  
     */	
	private java.lang.String partnerKey;

	/**
     * @备注:支付方式编号     
     * @字段:pay_way_code VARCHAR(50)  
     */	
	private java.lang.String payWayCode;

	/**
     * @备注:支付方式名称     
     * @字段:pay_way_name VARCHAR(100)  
     */	
	private java.lang.String payWayName;
	public RpUserPayInfo(){
	}

	public RpUserPayInfo(
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
	public void setAppId(java.lang.String appId) {
		this.appId = appId;
	}
	 
	public java.lang.String getAppId() {
		return this.appId;
	}
	public void setAppSectet(java.lang.String appSectet) {
		this.appSectet = appSectet;
	}
	 
	public java.lang.String getAppSectet() {
		return this.appSectet;
	}
	public void setMerchantId(java.lang.String merchantId) {
		this.merchantId = merchantId;
	}
	 
	public java.lang.String getMerchantId() {
		return this.merchantId;
	}
	public void setAppType(java.lang.String appType) {
		this.appType = appType;
	}
	 
	public java.lang.String getAppType() {
		return this.appType;
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
	public void setPartnerKey(java.lang.String partnerKey) {
		this.partnerKey = partnerKey;
	}
	 
	public java.lang.String getPartnerKey() {
		return this.partnerKey;
	}
	public void setPayWayCode(java.lang.String payWayCode) {
		this.payWayCode = payWayCode;
	}
	 
	public java.lang.String getPayWayCode() {
		return this.payWayCode;
	}
	public void setPayWayName(java.lang.String payWayName) {
		this.payWayName = payWayName;
	}
	 
	public java.lang.String getPayWayName() {
		return this.payWayName;
	}
}
