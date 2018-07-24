package com.transce.wcl.trade.entity;

import com.pay.common.core.entity.BaseEntity;

public class RpTradePaymentRecord extends BaseEntity {
 
	private static final long serialVersionUID = 1L;

	/**
     * @备注:ID     
     * @字段:id VARCHAR(50)  
     */	
	private java.lang.String id;

	/**
     * @备注:版本号     
     * @字段:version INT(10)  
     */	
	private java.lang.Integer version;

	/**
     * @备注:创建时间     
     * @字段:create_time DATETIME(19)  
     */	
	private java.util.Date createTime;

	/**
     * @备注:状态(参考枚举:PaymentRecordStatusEnum)     
     * @字段:status VARCHAR(30)  
     */	
	private java.lang.String status;

	/**
     * @备注:修改者     
     * @字段:editor VARCHAR(100)  
     */	
	private java.lang.String editor;

	/**
     * @备注:创建者     
     * @字段:creater VARCHAR(100)  
     */	
	private java.lang.String creater;

	/**
     * @备注:最后修改时间     
     * @字段:edit_time DATETIME(19)  
     */	
	private java.util.Date editTime;

	/**
     * @备注:商品名称     
     * @字段:product_name VARCHAR(50)  
     */	
	private java.lang.String productName;

	/**
     * @备注:商户订单号     
     * @字段:merchant_order_no VARCHAR(50)  
     */	
	private java.lang.String merchantOrderNo;

	/**
     * @备注:支付流水号     
     * @字段:trx_no VARCHAR(50)  
     */	
	private java.lang.String trxNo;

	/**
     * @备注:银行订单号     
     * @字段:bank_order_no VARCHAR(50)  
     */	
	private java.lang.String bankOrderNo;

	/**
     * @备注:银行流水号     
     * @字段:bank_trx_no VARCHAR(50)  
     */	
	private java.lang.String bankTrxNo;

	/**
     * @备注:商家名称     
     * @字段:merchant_name VARCHAR(300)  
     */	
	private java.lang.String merchantName;

	/**
     * @备注:商家编号     
     * @字段:merchant_no VARCHAR(50)  
     */	
	private java.lang.String merchantNo;

	/**
     * @备注:付款人编号     
     * @字段:payer_user_no VARCHAR(50)  
     */	
	private java.lang.String payerUserNo;

	/**
     * @备注:付款人名称     
     * @字段:payer_name VARCHAR(60)  
     */	
	private java.lang.String payerName;

	/**
     * @备注:付款方支付金额     
     * @字段:payer_pay_amount DECIMAL(20)  
     */	
	private Long payerPayAmount;

	/**
     * @备注:付款方手续费     
     * @字段:payer_fee DECIMAL(20)  
     */	
	private Long payerFee;

	/**
     * @备注:付款方账户类型(参考账户类型枚举:AccountTypeEnum)     
     * @字段:payer_account_type VARCHAR(30)  
     */	
	private java.lang.String payerAccountType;

	/**
     * @备注:收款人编号     
     * @字段:receiver_user_no VARCHAR(15)  
     */	
	private java.lang.String receiverUserNo;

	/**
     * @备注:收款人名称     
     * @字段:receiver_name VARCHAR(60)  
     */	
	private java.lang.String receiverName;

	/**
     * @备注:收款方支付金额     
     * @字段:receiver_pay_amount DECIMAL(20)  
     */	
	private Long receiverPayAmount;

	/**
     * @备注:收款方手续费     
     * @字段:receiver_fee DECIMAL(20)  
     */	
	private Long receiverFee;

	/**
     * @备注:收款方账户类型(参考账户类型枚举:AccountTypeEnum)     
     * @字段:receiver_account_type VARCHAR(30)  
     */	
	private java.lang.String receiverAccountType;

	/**
     * @备注:下单IP(客户端IP,从网关中获取)     
     * @字段:order_ip VARCHAR(30)  
     */	
	private java.lang.String orderIp;

	/**
     * @备注:从哪个页面链接过来的(可用于防诈骗)     
     * @字段:order_referer_url VARCHAR(100)  
     */	
	private java.lang.String orderRefererUrl;

	/**
     * @备注:订单金额     
     * @字段:order_amount DECIMAL(20)  
     */	
	private Long orderAmount;

	/**
     * @备注:平台收入     
     * @字段:plat_income DECIMAL(20)  
     */	
	private Long platIncome;

	/**
     * @备注:费率     
     * @字段:fee_rate DECIMAL(20)  
     */	
	private Long feeRate;

	/**
     * @备注:平台成本     
     * @字段:plat_cost DECIMAL(20)  
     */	
	private Long platCost;

	/**
     * @备注:平台利润     
     * @字段:plat_profit DECIMAL(20)  
     */	
	private Long platProfit;

	/**
     * @备注:页面回调通知URL     
     * @字段:return_url VARCHAR(600)  
     */	
	private java.lang.String returnUrl;

	/**
     * @备注:后台异步通知URL     
     * @字段:notify_url VARCHAR(600)  
     */	
	private java.lang.String notifyUrl;

	/**
     * @备注:支付通道编号     
     * @字段:pay_way_code VARCHAR(50)  
     */	
	private java.lang.String payWayCode;

	/**
     * @备注:支付通道名称     
     * @字段:pay_way_name VARCHAR(100)  
     */	
	private java.lang.String payWayName;

	/**
     * @备注:支付成功时间     
     * @字段:pay_success_time DATETIME(19)  
     */	
	private java.util.Date paySuccessTime;

	/**
     * @备注:完成时间     
     * @字段:complete_time DATETIME(19)  
     */	
	private java.util.Date completeTime;

	/**
     * @备注:是否退款(100:是,101:否,默认值为:101)     
     * @字段:is_refund VARCHAR(30)  
     */	
	private java.lang.String isRefund;

	/**
     * @备注:退款次数(默认值为:0)     
     * @字段:refund_times INT(10)  
     */	
	private java.lang.Integer refundTimes;

	/**
     * @备注:成功退款总金额     
     * @字段:success_refund_amount DECIMAL(20)  
     */	
	private Long successRefundAmount;

	/**
     * @备注:交易业务类型  ：消费、充值等     
     * @字段:trx_type VARCHAR(30)  
     */	
	private java.lang.String trxType;

	/**
     * @备注:订单来源     
     * @字段:order_from VARCHAR(30)  
     */	
	private java.lang.String orderFrom;

	/**
     * @备注:支付方式类型编号     
     * @字段:pay_type_code VARCHAR(50)  
     */	
	private java.lang.String payTypeCode;

	/**
     * @备注:支付方式类型名称     
     * @字段:pay_type_name VARCHAR(100)  
     */	
	private java.lang.String payTypeName;

	/**
     * @备注:资金流入类型     
     * @字段:fund_into_type VARCHAR(30)  
     */	
	private java.lang.String fundIntoType;

	/**
     * @备注:备注     
     * @字段:remark VARCHAR(3000)  
     */	
	private java.lang.String remark;

	/**
     * @备注:     
     * @字段:field1 VARCHAR(500)  
     */	
	private java.lang.String field1;

	/**
     * @备注:     
     * @字段:field2 VARCHAR(500)  
     */	
	private java.lang.String field2;

	/**
     * @备注:     
     * @字段:field3 VARCHAR(500)  
     */	
	private java.lang.String field3;

	/**
     * @备注:     
     * @字段:field4 VARCHAR(500)  
     */	
	private java.lang.String field4;

	/**
     * @备注:     
     * @字段:field5 VARCHAR(500)  
     */	
	private java.lang.String field5;

	/**
     * @备注:     
     * @字段:bank_return_msg VARCHAR(2000)  
     */	
	private java.lang.String bankReturnMsg;
	public RpTradePaymentRecord(){
	}

	public RpTradePaymentRecord(
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
	public void setVersion(java.lang.Integer version) {
		this.version = version;
	}
	 
	public java.lang.Integer getVersion() {
		return this.version;
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
	public void setEditor(java.lang.String editor) {
		this.editor = editor;
	}
	 
	public java.lang.String getEditor() {
		return this.editor;
	}
	public void setCreater(java.lang.String creater) {
		this.creater = creater;
	}
	 
	public java.lang.String getCreater() {
		return this.creater;
	}
	public void setEditTime(java.util.Date editTime) {
		this.editTime = editTime;
	}
	 
	public java.util.Date getEditTime() {
		return this.editTime;
	}
	 
	public void setProductName(java.lang.String productName) {
		this.productName = productName;
	}
	 
	public java.lang.String getProductName() {
		return this.productName;
	}
	public void setMerchantOrderNo(java.lang.String merchantOrderNo) {
		this.merchantOrderNo = merchantOrderNo;
	}
	 
	public java.lang.String getMerchantOrderNo() {
		return this.merchantOrderNo;
	}
	public void setTrxNo(java.lang.String trxNo) {
		this.trxNo = trxNo;
	}
	 
	public java.lang.String getTrxNo() {
		return this.trxNo;
	}
	public void setBankOrderNo(java.lang.String bankOrderNo) {
		this.bankOrderNo = bankOrderNo;
	}
	 
	public java.lang.String getBankOrderNo() {
		return this.bankOrderNo;
	}
	public void setBankTrxNo(java.lang.String bankTrxNo) {
		this.bankTrxNo = bankTrxNo;
	}
	 
	public java.lang.String getBankTrxNo() {
		return this.bankTrxNo;
	}
	public void setMerchantName(java.lang.String merchantName) {
		this.merchantName = merchantName;
	}
	 
	public java.lang.String getMerchantName() {
		return this.merchantName;
	}
	public void setMerchantNo(java.lang.String merchantNo) {
		this.merchantNo = merchantNo;
	}
	 
	public java.lang.String getMerchantNo() {
		return this.merchantNo;
	}
	public void setPayerUserNo(java.lang.String payerUserNo) {
		this.payerUserNo = payerUserNo;
	}
	 
	public java.lang.String getPayerUserNo() {
		return this.payerUserNo;
	}
	public void setPayerName(java.lang.String payerName) {
		this.payerName = payerName;
	}
	 
	public java.lang.String getPayerName() {
		return this.payerName;
	}
	public void setPayerPayAmount(Long payerPayAmount) {
		this.payerPayAmount = payerPayAmount;
	}
	 
	public Long getPayerPayAmount() {
		return this.payerPayAmount;
	}
	public void setPayerFee(Long payerFee) {
		this.payerFee = payerFee;
	}
	 
	public Long getPayerFee() {
		return this.payerFee;
	}
	public void setPayerAccountType(java.lang.String payerAccountType) {
		this.payerAccountType = payerAccountType;
	}
	 
	public java.lang.String getPayerAccountType() {
		return this.payerAccountType;
	}
	public void setReceiverUserNo(java.lang.String receiverUserNo) {
		this.receiverUserNo = receiverUserNo;
	}
	 
	public java.lang.String getReceiverUserNo() {
		return this.receiverUserNo;
	}
	public void setReceiverName(java.lang.String receiverName) {
		this.receiverName = receiverName;
	}
	 
	public java.lang.String getReceiverName() {
		return this.receiverName;
	}
	public void setReceiverPayAmount(Long receiverPayAmount) {
		this.receiverPayAmount = receiverPayAmount;
	}
	 
	public Long getReceiverPayAmount() {
		return this.receiverPayAmount;
	}
	public void setReceiverFee(Long receiverFee) {
		this.receiverFee = receiverFee;
	}
	 
	public Long getReceiverFee() {
		return this.receiverFee;
	}
	public void setReceiverAccountType(java.lang.String receiverAccountType) {
		this.receiverAccountType = receiverAccountType;
	}
	 
	public java.lang.String getReceiverAccountType() {
		return this.receiverAccountType;
	}
	public void setOrderIp(java.lang.String orderIp) {
		this.orderIp = orderIp;
	}
	 
	public java.lang.String getOrderIp() {
		return this.orderIp;
	}
	public void setOrderRefererUrl(java.lang.String orderRefererUrl) {
		this.orderRefererUrl = orderRefererUrl;
	}
	 
	public java.lang.String getOrderRefererUrl() {
		return this.orderRefererUrl;
	}
	public void setOrderAmount(Long orderAmount) {
		this.orderAmount = orderAmount;
	}
	 
	public Long getOrderAmount() {
		return this.orderAmount;
	}
	public void setPlatIncome(Long platIncome) {
		this.platIncome = platIncome;
	}
	 
	public Long getPlatIncome() {
		return this.platIncome;
	}
	public void setFeeRate(Long feeRate) {
		this.feeRate = feeRate;
	}
	 
	public Long getFeeRate() {
		return this.feeRate;
	}
	public void setPlatCost(Long platCost) {
		this.platCost = platCost;
	}
	 
	public Long getPlatCost() {
		return this.platCost;
	}
	public void setPlatProfit(Long platProfit) {
		this.platProfit = platProfit;
	}
	 
	public Long getPlatProfit() {
		return this.platProfit;
	}
	public void setReturnUrl(java.lang.String returnUrl) {
		this.returnUrl = returnUrl;
	}
	 
	public java.lang.String getReturnUrl() {
		return this.returnUrl;
	}
	public void setNotifyUrl(java.lang.String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}
	 
	public java.lang.String getNotifyUrl() {
		return this.notifyUrl;
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
	public void setPaySuccessTime(java.util.Date paySuccessTime) {
		this.paySuccessTime = paySuccessTime;
	}
	 
	public java.util.Date getPaySuccessTime() {
		return this.paySuccessTime;
	}
	 
	public void setCompleteTime(java.util.Date completeTime) {
		this.completeTime = completeTime;
	}
	 
	public java.util.Date getCompleteTime() {
		return this.completeTime;
	}
	 
	public void setIsRefund(java.lang.String isRefund) {
		this.isRefund = isRefund;
	}
	 
	public java.lang.String getIsRefund() {
		return this.isRefund;
	}
	public void setRefundTimes(java.lang.Integer refundTimes) {
		this.refundTimes = refundTimes;
	}
	 
	public java.lang.Integer getRefundTimes() {
		return this.refundTimes;
	}
	public void setSuccessRefundAmount(Long successRefundAmount) {
		this.successRefundAmount = successRefundAmount;
	}
	 
	public Long getSuccessRefundAmount() {
		return this.successRefundAmount;
	}
	public void setTrxType(java.lang.String trxType) {
		this.trxType = trxType;
	}
	 
	public java.lang.String getTrxType() {
		return this.trxType;
	}
	public void setOrderFrom(java.lang.String orderFrom) {
		this.orderFrom = orderFrom;
	}
	 
	public java.lang.String getOrderFrom() {
		return this.orderFrom;
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
	public void setFundIntoType(java.lang.String fundIntoType) {
		this.fundIntoType = fundIntoType;
	}
	 
	public java.lang.String getFundIntoType() {
		return this.fundIntoType;
	}
	public void setRemark(java.lang.String remark) {
		this.remark = remark;
	}
	 
	public java.lang.String getRemark() {
		return this.remark;
	}
	public void setField1(java.lang.String field1) {
		this.field1 = field1;
	}
	 
	public java.lang.String getField1() {
		return this.field1;
	}
	public void setField2(java.lang.String field2) {
		this.field2 = field2;
	}
	 
	public java.lang.String getField2() {
		return this.field2;
	}
	public void setField3(java.lang.String field3) {
		this.field3 = field3;
	}
	 
	public java.lang.String getField3() {
		return this.field3;
	}
	public void setField4(java.lang.String field4) {
		this.field4 = field4;
	}
	 
	public java.lang.String getField4() {
		return this.field4;
	}
	public void setField5(java.lang.String field5) {
		this.field5 = field5;
	}
	 
	public java.lang.String getField5() {
		return this.field5;
	}
	public void setBankReturnMsg(java.lang.String bankReturnMsg) {
		this.bankReturnMsg = bankReturnMsg;
	}
	 
	public java.lang.String getBankReturnMsg() {
		return this.bankReturnMsg;
	}
}
