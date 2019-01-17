package org.nutz.pay.bean.webpay.biz;

/**
 * Created by Jianghao on 2019/1/9
 *
 * @@author Freshplay Inc.
 */
public class CreateReturn {

    /**
     * 商户号
     */
    private String mid;

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    /**
     * 终端号
     */
    private String tid;

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

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
     * 商户订单号
     */
    private String merOrderId;

    public String getMerOrderId() {
        return merOrderId;
    }

    public void setMerOrderId(String merOrderId) {
        this.merOrderId = merOrderId;
    }

    /**
     * 签名
     */
    private String sign;

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
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
     * 资金渠道
     */
    private String billFunds;

    public String getBillFunds() {
        return billFunds;
    }

    public void setBillFunds(String billFunds) {
        this.billFunds = billFunds;
    }

    /**
     * 资金渠道说明
     */
    private String billFundsDesc;

    public String getBillFundsDesc() {
        return billFundsDesc;
    }

    public void setBillFundsDesc(String billFundsDesc) {
        this.billFundsDesc = billFundsDesc;
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
     * 网付计算的优惠金额
     */
    private Integer couponAmount;

    public Integer getCouponAmount() {
        return couponAmount;
    }

    public void setCouponAmount(Integer couponAmount) {
        this.couponAmount = couponAmount;
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
     * 订单金额，单位分
     */
    private int totalAmount;

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * 开票金额
     */
    private int invoiceAmount;

    public int getInvoiceAmount() {
        return invoiceAmount;
    }

    public void setInvoiceAmount(int invoiceAmount) {
        this.invoiceAmount = invoiceAmount;
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
     * 实收金额
     */
    private Integer receiptAmount;

    public Integer getReceiptAmount() {
        return receiptAmount;
    }

    public void setReceiptAmount(Integer receiptAmount) {
        this.receiptAmount = receiptAmount;
    }

    /**
     * 支付银行卡参考号
     */
    private String refId;

    public String getRefId() {
        return refId;
    }

    public void setRefId(String refId) {
        this.refId = refId;
    }

    /**
     * 退款金额
     */
    private Integer refundAmount;

    public Integer getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(Integer refundAmount) {
        this.refundAmount = refundAmount;
    }

    /**
     * 退款说明
     */
    private String refundDesc;

    public String getRefundDesc() {
        return refundDesc;
    }

    public void setRefundDesc(String refundDesc) {
        this.refundDesc = refundDesc;
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
     * 买家子ID
     */
    private String subBuyerId;

    public String getSubBuyerId() {
        return subBuyerId;
    }

    public void setSubBuyerId(String subBuyerId) {
        this.subBuyerId = subBuyerId;
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

    private String subInst;

    public String getSubInst() {
        return subInst;
    }

    public void setSubInst(String subInst) {
        this.subInst = subInst;
    }
}
