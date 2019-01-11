package org.nutz.pay.bean.biz;

/**
 * Copyright 2018 Freshplay Co ltd
 *
 * @author howechiang
 */
public class RefundBillPayment {

    /**
     * 商户退款单号
     */
    private String merOrderId;

    public String getMerOrderId() {
        return merOrderId;
    }

    public void setMerOrderId(String merOrderId) {
        this.merOrderId = merOrderId;
    }

    /**
     * 账单业务类型
     */
    private String billBizType;

    public String getBillBizType() {
        return billBizType;
    }

    public void setBillBizType(String billBizType) {
        this.billBizType = billBizType;
    }

    /**
     * 交易参考号
     */
    private String paySeqId;

    public String getPaySeqId() {
        return paySeqId;
    }

    public void setPaySeqId(String paySeqId) {
        this.paySeqId = paySeqId;
    }

    /**
     * 账单流水总金额
     */
    private Integer totalAmount;

    public Integer getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * 实付金额
     */
    private Integer buyerPayAmount;

    public Integer getBuyerPayAmount() {
        return buyerPayAmount;
    }

    public void setBuyerPayAmount(Integer buyerPayAmount) {
        this.buyerPayAmount = buyerPayAmount;
    }

    /**
     * 开票金额
     */
    private Integer invoiceAmount;

    public Integer getInvoiceAmount() {
        return invoiceAmount;
    }

    public void setInvoiceAmount(Integer invoiceAmount) {
        this.invoiceAmount = invoiceAmount;
    }

    /**
     * 折扣金额
     */
    private Integer discountAmount;

    public Integer getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(Integer discountAmount) {
        this.discountAmount = discountAmount;
    }

    /**
     * 买家ID
     */
    private String buyerId;

    public String getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId;
    }

    /**
     * 买家用户名
     */
    private String buyerUsername;

    public String getBuyerUsername() {
        return buyerUsername;
    }

    public void setBuyerUsername(String buyerUsername) {
        this.buyerUsername = buyerUsername;
    }

    /**
     * 支付时间，格式yyyy-MM-dd HH:mm:ss
     */
    private String payTime;

    public String getPayTime() {
        return payTime;
    }

    public void setPayTime(String payTime) {
        this.payTime = payTime;
    }

    /**
     * 结算时间，格式yyyy-MM-dd
     */
    private String settleDate;

    public String getSettleDate() {
        return settleDate;
    }

    public void setSettleDate(String settleDate) {
        this.settleDate = settleDate;
    }

    /**
     * 交易状态
     */
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 目标平台单号
     */
    private String targetOrderId;

    public String getTargetOrderId() {
        return targetOrderId;
    }

    public void setTargetOrderId(String targetOrderId) {
        this.targetOrderId = targetOrderId;
    }

    /**
     * 目标系统
     */
    private String targetSys;

    public String getTargetSys() {
        return targetSys;
    }

    public void setTargetSys(String targetSys) {
        this.targetSys = targetSys;
    }
}
