package org.nutz.pay.bean.webpay.resp;

import java.util.Date;

/**
 * Copyright 2018 Freshplay Co ltd
 *
 * @author howechiang
 */
public class RefundQueryResp extends BaseResp {

    /**
     * 退款状态
     */
    private String refundStatus;

    public String getRefundStatus() {
        return refundStatus;
    }

    public void setRefundStatus(String refundStatus) {
        this.refundStatus = refundStatus;
    }

    /**
     * 系统交易流水号
     */
    private String seqId;

    public String getSeqId() {
        return seqId;
    }

    public void setSeqId(String seqId) {
        this.seqId = seqId;
    }

    /**
     * 清分ID，如果来源方传了bankRefId就等于bankRefId，否则等于seqId
     */
    private String settleRefId;

    public String getSettleRefId() {
        return settleRefId;
    }

    public void setSettleRefId(String settleRefId) {
        this.settleRefId = settleRefId;
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
     * 银行卡号，如果有的话
     */
    private String bankCardNo;

    public String getBankCardNo() {
        return bankCardNo;
    }

    public void setBankCardNo(String bankCardNo) {
        this.bankCardNo = bankCardNo;
    }

    /**
     * 银行信息
     */
    private String bankInfo;

    public String getBankInfo() {
        return bankInfo;
    }

    public void setBankInfo(String bankInfo) {
        this.bankInfo = bankInfo;
    }

    /**
     * 支付渠道商户号
     */
    private String targetMid;

    public String getTargetMid() {
        return targetMid;
    }

    public void setTargetMid(String targetMid) {
        this.targetMid = targetMid;
    }

    /**
     * 渠道订单号
     */
    private String targetOrderId;

    public String getTargetOrderId() {
        return targetOrderId;
    }

    public void setTargetOrderId(String targetOrderId) {
        this.targetOrderId = targetOrderId;
    }

    /**
     * 目标平台的状态
     */
    private String targetStatus;

    public String getTargetStatus() {
        return targetStatus;
    }

    public void setTargetStatus(String targetStatus) {
        this.targetStatus = targetStatus;
    }

    /**
     * 支付渠道
     * Alipay 1.0	支付宝1.0协议	比较少用
     * Alipay 2.0	支付宝2.0协议	主流
     * WXPay	微信
     * YQB	壹钱包
     * QMF	全民付远程快捷
     * UnionPay	银联钱包
     * BaiDu	百度钱包
     * JD	京东钱包
     * SF	顺丰顺手付
     * COMM	交通银行
     * BestPay	翼支付
     * ACP	银联全渠道立码付
     * NetPayBills	银商网付平台账单模块
     * NetPayGtwy	银商网付平台网关模块
     * QmfWebPay	POS通插件WEB版
     */
    private String targetSys;

    public String getTargetSys() {
        return targetSys;
    }

    public void setTargetSys(String targetSys) {
        this.targetSys = targetSys;
    }

    /**
     * 商户名称
     */
    private String merName;

    public String getMerName() {
        return merName;
    }

    public void setMerName(String merName) {
        this.merName = merName;
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
     * 结算日期，格式yyyy-MM-dd
     */
    private String settleDate;

    public String getSettleDate() {
        return settleDate;
    }

    public void setSettleDate(String settleDate) {
        this.settleDate = settleDate;
    }

    /**
     * 商户实退金额
     */
    private Integer sendBackAmount;

    public Integer getSendBackAmount() {
        return sendBackAmount;
    }

    public void setSendBackAmount(Integer sendBackAmount) {
        this.sendBackAmount = sendBackAmount;
    }

    /**
     * 支付总金额
     */
    private Integer totalAmount;

    public Integer getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * 总退款金额
     */
    private Integer refundAmount;

    public Integer getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(Integer refundAmount) {
        this.refundAmount = refundAmount;
    }

    /**
     * 退款渠道列表
     */
    private String refundFunds;

    public String getRefundFunds() {
        return refundFunds;
    }

    public void setRefundFunds(String refundFunds) {
        this.refundFunds = refundFunds;
    }

    /**
     * 退款渠道描述
     */
    private String refundFundsDesc;

    public String getRefundFundsDesc() {
        return refundFundsDesc;
    }

    public void setRefundFundsDesc(String refundFundsDesc) {
        this.refundFundsDesc = refundFundsDesc;
    }

    /**
     * 实付部分退款金额
     */
    private Integer refundInvoiceAmount;

    public Integer getRefundInvoiceAmount() {
        return refundInvoiceAmount;
    }

    public void setRefundInvoiceAmount(Integer refundInvoiceAmount) {
        this.refundInvoiceAmount = refundInvoiceAmount;
    }

    /**
     * 退货订单号
     */
    private String refundOrderId;

    public String getRefundOrderId() {
        return refundOrderId;
    }

    public void setRefundOrderId(String refundOrderId) {
        this.refundOrderId = refundOrderId;
    }

    /**
     * 目标系统退货订单号
     */
    private String refundTargetOrderId;

    public String getRefundTargetOrderId() {
        return refundTargetOrderId;
    }

    public void setRefundTargetOrderId(String refundTargetOrderId) {
        this.refundTargetOrderId = refundTargetOrderId;
    }
}
