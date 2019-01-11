package org.nutz.pay.bean.bills.resp;

/**
 * Copyright 2018 Freshplay Co ltd
 *
 * @author howechiang
 */
public class RefundResp extends BaseResp {

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
     * 账单状态
     */
    private String billStatus;

    public String getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(String billStatus) {
        this.billStatus = billStatus;
    }

    /**
     * 原订单商户订单号
     */
    private String merOrderId;

    public String getMerOrderId() {
        return merOrderId;
    }

    public void setMerOrderId(String merOrderId) {
        this.merOrderId = merOrderId;
    }

    /**
     * 退款订单号
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

    /**
     * 退款时间
     */
    private String refundPayTime;

    public String getRefundPayTime() {
        return refundPayTime;
    }

    public void setRefundPayTime(String refundPayTime) {
        this.refundPayTime = refundPayTime;
    }

    /**
     * 退款结果
     * SUCCESS成功
     * FAIL失败
     * PROCESSING处理中
     * UNKNOWN异常
     */
    private String refundStatus;

    public String getRefundStatus() {
        return refundStatus;
    }

    public void setRefundStatus(String refundStatus) {
        this.refundStatus = refundStatus;
    }
}
