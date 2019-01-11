package org.nutz.pay.bean.bills.resp;

import org.nutz.pay.bean.biz.BillPayment;
import org.nutz.pay.bean.biz.RefundBillPayment;

/**
 * Copyright 2018 Freshplay Co ltd
 *
 * @author howechiang
 */
public class QueryResp extends BaseResp {

    /**
     * 账单号
     */
    private String billNo;

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }

    /**
     * 账单日期，格式yyyy-MM-dd
     */
    private String billDate;

    public String getBillDate() {
        return billDate;
    }

    public void setBillDate(String billDate) {
        this.billDate = billDate;
    }

    /**
     * 账单创建时间，格式yyyy-MM-dd HH:mm:ss
     */
    private String createTime;

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * 账单状态
     * NEW_ORDER 	新订单
     * UNKNOWN 	不明确的交易状态
     * TRADE_CLOSED 	在指定时间段内未支付时关闭的交易；在交易完成全额退款成功时关闭的交易；支付失败的交易。	TRADE_CLOSED的交易不允许进行任何操作。
     * WAIT_BUYER_PAY 	交易创建，等待买家付款。
     * TRADE_SUCCESS	支付成功
     * TRADE_REFUND	订单转入退货流程	退货可能是部分也可能是全部。
     */
    private String billStatus;

    public String getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(String billStatus) {
        this.billStatus = billStatus;
    }

    /**
     * 账单描述
     */
    private String billDesc;

    public String getBillDesc() {
        return billDesc;
    }

    public void setBillDesc(String billDesc) {
        this.billDesc = billDesc;
    }

    /**
     * 账单总金额
     * 若涉及营销联盟优惠，则此为优惠前总金额
     */
    private Integer totalAmount;

    public Integer getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * 账单二维码
     */
    private String billQRCode;

    public String getBillQRCode() {
        return billQRCode;
    }

    public void setBillQRCode(String billQRCode) {
        this.billQRCode = billQRCode;
    }

    /**
     * 会员号
     */
    private String memberId;

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getMemberId() {
        return memberId;
    }

    /**
     * 桌号
     */
    private String counterNo;

    public String getCounterNo() {
        return counterNo;
    }

    public void setCounterNo(String counterNo) {
        this.counterNo = counterNo;
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
     * 付款附言
     */
    private String memo;

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    /**
     * 担保状态
     * UNCOMPLETED 	担保未完成	担保未完成的交易不允许直接做反交易
     * PARTLY_COMPLETED	担保已完成，部分完成
     * ALL_COMPLETED	担保已完成，全部完成
     * CANCELED	担保已撤销
     */
    private String secureStatus;

    public String getSecureStatus() {
        return secureStatus;
    }

    public void setSecureStatus(String secureStatus) {
        this.secureStatus = secureStatus;
    }

    /**
     * 担保完成金额（分）
     */
    private Integer completeAmount;

    public Integer getCompleteAmount() {
        return completeAmount;
    }

    public void setCompleteAmount(Integer completeAmount) {
        this.completeAmount = completeAmount;
    }

    /**
     * 若涉及营销联盟优惠，则账单流水总金额为优惠后的总金额
     */
    private BillPayment billPayment;

    public BillPayment getBillPayment() {
        return billPayment;
    }

    public void setBillPayment(BillPayment billPayment) {
        this.billPayment = billPayment;
    }

    /**
     * 已执行退款 且查询请求中上送了refundOrderId时才会返回
     */
    private RefundBillPayment refundBillPayment;

    public RefundBillPayment getRefundBillPayment() {
        return refundBillPayment;
    }

    public void setRefundBillPayment(RefundBillPayment refundBillPayment) {
        this.refundBillPayment = refundBillPayment;
    }
}
