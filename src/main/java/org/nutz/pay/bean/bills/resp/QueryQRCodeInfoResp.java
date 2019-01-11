package org.nutz.pay.bean.bills.resp;

import org.nutz.pay.bean.biz.Good;

import java.util.List;

/**
 * Copyright 2018 Freshplay Co ltd
 *
 * @author howechiang
 */
public class QueryQRCodeInfoResp extends BaseResp {

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
     * 会员号
     * 支付通知里原样返回
     */
    private String memberId;

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
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
     * 支付总金额
     */
    private Integer totalAmount;

    public Integer getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
    }

    private List<Good> goods;

    public List<Good> getGoods() {
        return goods;
    }

    public void setGoods(List<Good> goods) {
        this.goods = goods;
    }

    /**
     * 桌号、柜台号、房间号
     * 支付通知里原样返回
     */
    private String counterNo;

    public String getCounterNo() {
        return counterNo;
    }

    public void setCounterNo(String counterNo) {
        this.counterNo = counterNo;
    }

    /**
     * 账单过期时间，为空则不过期，格式yyyy-MM-dd HH:mm:ss
     * 一次性二维码的默认过期时间为30分钟，固定码无期限
     */
    private String expireTime;

    public String getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    /**
     * 支付结果通知地址
     */
    private String notifyUrl;

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    /**
     * 网页跳转地址
     */
    private String returnUrl;

    public String getReturnUrl() {
        return returnUrl;
    }

    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
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
     * 二维码
     */
    private String qrCodeUrl;

    public String getQrCodeUrl() {
        return qrCodeUrl;
    }

    public void setQrCodeUrl(String qrCodeUrl) {
        this.qrCodeUrl = qrCodeUrl;
    }
}
