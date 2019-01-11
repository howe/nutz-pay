package org.nutz.pay.bean.bills.biz;

import org.nutz.pay.bean.biz.BillPayment;

/**
 * Copyright 2018 Freshplay Co ltd
 *
 * @author howechiang
 */
public class GetQRCodeReturn {

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
     */
    private Integer totalAmount;

    public Integer getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * 会员号
     */
    private String memberId;

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    /**
     * 桌号、柜台号、房间号
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
     * 签名
     */
    private String sign;

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }
}
