package com.transce.wcl.user.entity;

import com.pay.common.core.entity.BaseEntity;

public class RpPayProduct extends BaseEntity {
 
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
     * @字段:status VARCHAR(36)  
     */	
	private java.lang.String status;

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
     * @字段:audit_status VARCHAR(45)  
     */	
	private java.lang.String auditStatus;
	public RpPayProduct(){
	}

	public RpPayProduct(
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

	public void setStatus(java.lang.String status) {
		this.status = status;
	}
	 
	public java.lang.String getStatus() {
		return this.status;
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
	public void setAuditStatus(java.lang.String auditStatus) {
		this.auditStatus = auditStatus;
	}
	 
	public java.lang.String getAuditStatus() {
		return this.auditStatus;
	}
}
