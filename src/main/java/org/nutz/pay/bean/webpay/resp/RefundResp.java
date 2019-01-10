package org.nutz.pay.bean.webpay.resp;

import org.nutz.pay.bean.BaseResp;

/**
 * Created by Jianghao on 2019/1/9
 *
 * @@author Freshplay Inc.
 */
public class RefundResp extends BaseResp {

    private String merName;

    public String getMerName() {
        return merName;
    }

    public void setMerName(String merName) {
        this.merName = merName;
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
     * 订单状态
     * NEW_ORDER 	新订单
     * UNKNOWN 	不明确的交易状态
     * TRADE_CLOSED 	在指定时间段内未支付时关闭的交易；在交易完成全额退款成功时关闭的交易；支付失败的交易。	TRADE_CLOSED的交易不允许进行任何操作。
     * WAIT_BUYER_PAY 	交易创建，等待买家付款。
     * TRADE_SUCCESS	支付成功
     * TRADE_REFUND	订单转入退货流程	退货可能是部分也可能是全部。
     */
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
