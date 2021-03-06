package org.nutz.pay.bean.webpay.resp;

import org.nutz.json.JsonField;

/**
 * Created by Jianghao on 2019/1/9
 *
 * @@author Freshplay Inc.
 */
public class QueryResp extends BaseResp {

    /**
     * 业务类型
     */
    private String instMid;

    public String getInstMid() {
        return instMid;
    }

    public void setInstMid(String instMid) {
        this.instMid = instMid;
    }

    /**
     * 附加数据
     */
    private String attachedData;

    public String getAttachedData() {
        return attachedData;
    }

    public void setAttachedData(String attachedData) {
        this.attachedData = attachedData;
    }

    /**
     * 平台流水号，类似检索参考号
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
     * 检索参考号，用在银联体系交易中
     */
    private String refId;

    public String getRefId() {
        return refId;
    }

    public void setRefId(String refId) {
        this.refId = refId;
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
     * 支付总金额
     */
    private Long totalAmount;

    public Long getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Long totalAmount) {
        this.totalAmount = totalAmount;
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
     * 第三方订单号
     */
    private String targetOrderId;

    public String getTargetOrderId() {
        return targetOrderId;
    }

    public void setTargetOrderId(String targetOrderId) {
        this.targetOrderId = targetOrderId;
    }

    /**
     * 目标平台代码
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
     * 支付银行信息
     */
    private String bankCardNo;

    public String getBankCardNo() {
        return bankCardNo;
    }

    public void setBankCardNo(String bankCardNo) {
        this.bankCardNo = bankCardNo;
    }

    /**
     * 支付渠道商户号，各渠道情况不同，酌情转换。
     */
    private String targetMid;

    public String getTargetMid() {
        return targetMid;
    }

    public void setTargetMid(String targetMid) {
        this.targetMid = targetMid;
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
     * 支付渠道列表 示例：支付宝余额:33|优惠券:55
     */
    private String billFunds;

    public String getBillFunds() {
        return billFunds;
    }

    public void setBillFunds(String billFunds) {
        this.billFunds = billFunds;
    }

    /**
     * 支付渠道描述
     */
    private String billFundsDesc;

    public String getBillFundsDesc() {
        return billFundsDesc;
    }

    public void setBillFundsDesc(String billFundsDesc) {
        this.billFundsDesc = billFundsDesc;
    }

    /**
     * 买家付款的金额，支付宝会有
     */
    private Long buyerPayAmount;

    public Long getBuyerPayAmount() {
        return buyerPayAmount;
    }

    public void setBuyerPayAmount(Long buyerPayAmount) {
        this.buyerPayAmount = buyerPayAmount;
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
     * 网付计算的优惠金额
     */
    private Long couponAmount;

    public Long getCouponAmount() {
        return couponAmount;
    }

    public void setCouponAmount(Long couponAmount) {
        this.couponAmount = couponAmount;
    }

    /**
     * 交易中可给用户开具发票的金额
     */
    private Long invoiceAmount;

    public Long getInvoiceAmount() {
        return invoiceAmount;
    }

    public void setInvoiceAmount(Long invoiceAmount) {
        this.invoiceAmount = invoiceAmount;
    }

    /**
     * 支付时间，格式yyyy-MM-dd HH:mm:ss
     */
    @JsonField(dataFormat = "yyyy-MM-dd HH:mm:ss")
    private String payTime;

    public String getPayTime() {
        return payTime;
    }

    public void setPayTime(String payTime) {
        this.payTime = payTime;
    }

    /**
     * 实收金额
     */
    private Long receiptAmount;

    public Long getReceiptAmount() {
        return receiptAmount;
    }

    public void setReceiptAmount(Long receiptAmount) {
        this.receiptAmount = receiptAmount;
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
     * 子买家ID，比如微信的subOpenId
     */
    private String subBuyerId;

    public String getSubBuyerId() {
        return subBuyerId;
    }

    public void setSubBuyerId(String subBuyerId) {
        this.subBuyerId = subBuyerId;
    }

    /**
     * 微信活动ID
     */
    private String activityIds;

    public String getActivityIds() {
        return activityIds;
    }

    public void setActivityIds(String activityIds) {
        this.activityIds = activityIds;
    }

    /**
     * 营销联盟优惠金额
     */
    private Long yxlmAmount;

    public Long getYxlmAmount() {
        return yxlmAmount;
    }

    public void setYxlmAmount(Long yxlmAmount) {
        this.yxlmAmount = yxlmAmount;
    }
}
