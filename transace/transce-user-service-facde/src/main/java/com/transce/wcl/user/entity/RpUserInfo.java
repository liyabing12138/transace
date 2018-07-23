package com.transce.wcl.user.entity;

import com.pay.common.core.entity.BaseEntity;

public class RpUserInfo extends BaseEntity {
 
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
     * @字段:status VARCHAR(36)  
     */	
	private java.lang.String status;

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
     * @字段:account_no VARCHAR(50)  
     */	
	private java.lang.String accountNo;
	public RpUserInfo(){
	}

	public RpUserInfo(
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
	 
	public void setStatus(java.lang.String status) {
		this.status = status;
	}
	 
	public java.lang.String getStatus() {
		return this.status;
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
	public void setAccountNo(java.lang.String accountNo) {
		this.accountNo = accountNo;
	}
	 
	public java.lang.String getAccountNo() {
		return this.accountNo;
	}
}
