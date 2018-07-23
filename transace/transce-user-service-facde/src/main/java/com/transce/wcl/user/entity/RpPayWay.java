package com.transce.wcl.user.entity;

import com.pay.common.core.entity.BaseEntity;

public class RpPayWay extends BaseEntity {
 
	private static final long serialVersionUID = 1L;

	/**
     * @备注:ID     
     * @字段:ID VARCHAR(50)  
     */	
	private java.lang.String id;

	/**
     * @备注:version     
     * @字段:version BIGINT(19)  
     */	
	private java.lang.Long version;

	/**
     * @备注:创建时间     
     * @字段:create_time DATETIME(19)  
     */	
	private java.util.Date createTime;

	/**
     * @备注:修改时间     
     * @字段:edit_time DATETIME(19)  
     */	
	private java.util.Date editTime;

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

	/**
     * @备注:支付类型编号     
     * @字段:pay_type_code VARCHAR(50)  
     */	
	private java.lang.String payTypeCode;

	/**
     * @备注:支付类型名称     
     * @字段:pay_type_name VARCHAR(100)  
     */	
	private java.lang.String payTypeName;

	/**
     * @备注:支付产品编号     
     * @字段:pay_product_code VARCHAR(50)  
     */	
	private java.lang.String payProductCode;

	/**
     * @备注:状态(100:正常状态,101非正常状态)     
     * @字段:status VARCHAR(36)  
     */	
	private java.lang.String status;

	/**
     * @备注:排序(倒序排序,默认值1000)     
     * @字段:sorts INT(10)  
     */	
	private java.lang.Integer sorts;

	/**
     * @备注:商户支付费率     
     * @字段:pay_rate DOUBLE(22)  
     */	
	private java.lang.Double payRate;
	public RpPayWay(){
	}

	public RpPayWay(
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
	public void setVersion(java.lang.Long version) {
		this.version = version;
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
	public void setPayTypeCode(java.lang.String payTypeCode) {
		this.payTypeCode = payTypeCode;
	}
	 
	public java.lang.String getPayTypeCode() {
		return this.payTypeCode;
	}
	public void setPayTypeName(java.lang.String payTypeName) {
		this.payTypeName = payTypeName;
	}
	 
	public java.lang.String getPayTypeName() {
		return this.payTypeName;
	}
	public void setPayProductCode(java.lang.String payProductCode) {
		this.payProductCode = payProductCode;
	}
	 
	public java.lang.String getPayProductCode() {
		return this.payProductCode;
	}
	public void setStatus(java.lang.String status) {
		this.status = status;
	}
	 
	public java.lang.String getStatus() {
		return this.status;
	}
	public void setSorts(java.lang.Integer sorts) {
		this.sorts = sorts;
	}
	 
	public java.lang.Integer getSorts() {
		return this.sorts;
	}
	public void setPayRate(java.lang.Double payRate) {
		this.payRate = payRate;
	}
	 
	public java.lang.Double getPayRate() {
		return this.payRate;
	}
}
