package com.transce.wcl.accounting.entity;

import com.pay.common.core.entity.BaseEntity;

public class RpAccountingVoucher extends BaseEntity {
 
	private static final long serialVersionUID = 1L;



	/**
     * @备注:创建时间     
     * @字段:create_time DATETIME(19)  
     */	
	private java.util.Date createTime;

	/**
     * @备注:最后修改时间     
     * @字段:edit_time DATETIME(19)  
     */	
	private java.util.Date editTime;

	/**
     * @备注:会计分录类型     
     * @字段:entry_type SMALLINT(5)  
     */	
	private Integer entryType;

	/**
     * @备注:请求号     
     * @字段:request_no VARCHAR(32)  
     */	
	private java.lang.String requestNo;

	/**
     * @备注:来源系统     
     * @字段:from_system SMALLINT(5)  
     */	
	private Integer fromSystem;

	/**
     * @备注:原始凭证号     
     * @字段:voucher_no VARCHAR(32)  
     */	
	private java.lang.String voucherNo;

	/**
     * @备注:会计日期     
     * @字段:accounting_date DATE(10)  
     */	
	private java.util.Date accountingDate;

	/**
     * @备注:平台银行帐户变动金额     
     * @字段:bank_change_amount DECIMAL(24)  
     */	
	private Long bankChangeAmount;

	/**
     * @备注:付款方账号     
     * @字段:payer_account_no VARCHAR(20)  
     */	
	private java.lang.String payerAccountNo;

	/**
     * @备注:收款方账号     
     * @字段:receiver_account_no VARCHAR(20)  
     */	
	private java.lang.String receiverAccountNo;

	/**
     * @备注:银行账户     
     * @字段:bank_account VARCHAR(20)  
     */	
	private java.lang.String bankAccount;

	/**
     * @备注:银行渠道编码     
     * @字段:bank_channel_code VARCHAR(32)  
     */	
	private java.lang.String bankChannelCode;

	/**
     * @备注:付款方账户变动金额     
     * @字段:payer_change_amount DECIMAL(24)  
     */	
	private Long payerChangeAmount;

	/**
     * @备注:收款方账户变动金额     
     * @字段:receiver_change_amount DECIMAL(24)  
     */	
	private Long receiverChangeAmount;

	/**
     * @备注:利润     
     * @字段:profit DECIMAL(24)  
     */	
	private Long profit;

	/**
     * @备注:收入     
     * @字段:income DECIMAL(24)  
     */	
	private Long income;

	/**
     * @备注:成本     
     * @字段:cost DECIMAL(24)  
     */	
	private Long cost;

	/**
     * @备注:备注     
     * @字段:remark VARCHAR(128)  
     */	
	private java.lang.String remark;

	/**
     * @备注:银行订单号     
     * @字段:bank_order_no VARCHAR(32)  
     */	
	private java.lang.String bankOrderNo;

	/**
     * @备注:付款方帐户类型     
     * @字段:payer_account_type SMALLINT(5)  
     */	
	private Integer payerAccountType;

	/**
     * @备注:支付金额     
     * @字段:pay_amount DECIMAL(20)  
     */	
	private Long payAmount;

	/**
     * @备注:收款方帐户类型     
     * @字段:receiver_account_type SMALLINT(5)  
     */	
	private Integer receiverAccountType;

	/**
     * @备注:收款方手续费     
     * @字段:receiver_fee DECIMAL(20)  
     */	
	private Long receiverFee;

	/**
     * @备注:付款方手续费     
     * @字段:payer_fee DECIMAL(20)  
     */	
	private Long payerFee;
	public RpAccountingVoucher(){
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
	 
	public void setEntryType(Integer entryType) {
		this.entryType = entryType;
	}
	 
	public Integer getEntryType() {
		return this.entryType;
	}
	public void setRequestNo(java.lang.String requestNo) {
		this.requestNo = requestNo;
	}
	 
	public java.lang.String getRequestNo() {
		return this.requestNo;
	}
	public void setFromSystem(Integer fromSystem) {
		this.fromSystem = fromSystem;
	}
	 
	public Integer getFromSystem() {
		return this.fromSystem;
	}
	public void setVoucherNo(java.lang.String voucherNo) {
		this.voucherNo = voucherNo;
	}
	 
	public java.lang.String getVoucherNo() {
		return this.voucherNo;
	}
	public void setAccountingDate(java.util.Date accountingDate) {
		this.accountingDate = accountingDate;
	}
	 
	public java.util.Date getAccountingDate() {
		return this.accountingDate;
	}
	 
	public void setBankChangeAmount(Long bankChangeAmount) {
		this.bankChangeAmount = bankChangeAmount;
	}
	 
	public Long getBankChangeAmount() {
		return this.bankChangeAmount;
	}
	public void setPayerAccountNo(java.lang.String payerAccountNo) {
		this.payerAccountNo = payerAccountNo;
	}
	 
	public java.lang.String getPayerAccountNo() {
		return this.payerAccountNo;
	}
	public void setReceiverAccountNo(java.lang.String receiverAccountNo) {
		this.receiverAccountNo = receiverAccountNo;
	}
	 
	public java.lang.String getReceiverAccountNo() {
		return this.receiverAccountNo;
	}
	public void setBankAccount(java.lang.String bankAccount) {
		this.bankAccount = bankAccount;
	}
	 
	public java.lang.String getBankAccount() {
		return this.bankAccount;
	}
	public void setBankChannelCode(java.lang.String bankChannelCode) {
		this.bankChannelCode = bankChannelCode;
	}
	 
	public java.lang.String getBankChannelCode() {
		return this.bankChannelCode;
	}
	public void setPayerChangeAmount(Long payerChangeAmount) {
		this.payerChangeAmount = payerChangeAmount;
	}
	 
	public Long getPayerChangeAmount() {
		return this.payerChangeAmount;
	}
	public void setReceiverChangeAmount(Long receiverChangeAmount) {
		this.receiverChangeAmount = receiverChangeAmount;
	}
	 
	public Long getReceiverChangeAmount() {
		return this.receiverChangeAmount;
	}
	public void setProfit(Long profit) {
		this.profit = profit;
	}
	 
	public Long getProfit() {
		return this.profit;
	}
	public void setIncome(Long income) {
		this.income = income;
	}
	 
	public Long getIncome() {
		return this.income;
	}
	public void setCost(Long cost) {
		this.cost = cost;
	}
	 
	public Long getCost() {
		return this.cost;
	}
	public void setRemark(java.lang.String remark) {
		this.remark = remark;
	}
	 
	public java.lang.String getRemark() {
		return this.remark;
	}
	public void setBankOrderNo(java.lang.String bankOrderNo) {
		this.bankOrderNo = bankOrderNo;
	}
	 
	public java.lang.String getBankOrderNo() {
		return this.bankOrderNo;
	}
	public void setPayerAccountType(Integer payerAccountType) {
		this.payerAccountType = payerAccountType;
	}
	 
	public Integer getPayerAccountType() {
		return this.payerAccountType;
	}
	public void setPayAmount(Long payAmount) {
		this.payAmount = payAmount;
	}
	 
	public Long getPayAmount() {
		return this.payAmount;
	}
	public void setReceiverAccountType(Integer receiverAccountType) {
		this.receiverAccountType = receiverAccountType;
	}
	 
	public Integer getReceiverAccountType() {
		return this.receiverAccountType;
	}
	public void setReceiverFee(Long receiverFee) {
		this.receiverFee = receiverFee;
	}
	 
	public Long getReceiverFee() {
		return this.receiverFee;
	}
	public void setPayerFee(Long payerFee) {
		this.payerFee = payerFee;
	}
	 
	public Long getPayerFee() {
		return this.payerFee;
	}
}
