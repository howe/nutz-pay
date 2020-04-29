package org.nutz.pay.bean.bills.req;

import org.nutz.pay.bean.biz.Good;
import org.nutz.pay.bean.biz.SubOrder;

import java.util.List;

/**
 * Copyright 2018 Freshplay Co ltd
 *
 * @author howechiang
 */
public class GetQRCodeReq extends BaseReq {

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

    /**
     * 分账标记
     * 默认值为false
     * 暂时只支持微信（WXPay.jsPay）和支付宝（trade.jsPay）支付。
     * 若为true，则goods字段和subOrders字段不能同时为空；
     * 且secureTransaction字段上送false或不上送。
     */
    private boolean divisionFlag;

    public boolean isDivisionFlag() {
        return divisionFlag;
    }

    public void setDivisionFlag(boolean divisionFlag) {
        this.divisionFlag = divisionFlag;
    }

    /**
     * 平台商户分账金额
     * 若分账标记传，则分账金额必传
     */
    private Integer platformAmount;

    public Integer getPlatformAmount() {
        return platformAmount;
    }

    public void setPlatformAmount(Integer platformAmount) {
        this.platformAmount = platformAmount;
    }

    /**
     * 在传分账标记的情况下，若传子商户号，子商户商品金额必传，即goods字段中每个元素中subMerchantId与subOrderAmount不能为空，元素不能超过20个。
     * （goods里所有子商户商品总额要与支付总额totalAmount相等）
     */
    private List<Good> goods;

    public List<Good> getGoods() {
        return goods;
    }

    public void setGoods(List<Good> goods) {
        this.goods = goods;
    }

    /**
     * 在传分账标记的情况下，若传子商户号，子商户分账金额必传，即ubOrders每个元素的mid和totalAmount非空 且 mid不超过20个。
     * （分账方案subOrders里子商户分账总额+platformAmount要与支付总额totalAmount相等）。
     */
    private List<SubOrder> subOrders;

    public List<SubOrder> getSubOrders() {
        return subOrders;
    }

    public void setSubOrders(List<SubOrder> subOrders) {
        this.subOrders = subOrders;
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
     * 二维码ID
     * 针对需要自行生成二维码的情况
     * {来源编号(4位)}{时间(yyyyMMddmmHHssSSS)(17位)}{7位随机数}
     */
    private String qrCodeId;

    public String getQrCodeId() {
        return qrCodeId;
    }

    public void setQrCodeId(String qrCodeId) {
        this.qrCodeId = qrCodeId;
    }

    /**
     * 担保交易标识
     * 取值：true或false，默认false
     */
    private boolean secureTransaction;

    public boolean isSecureTransaction() {
        return secureTransaction;
    }

    public void setSecureTransaction(boolean secureTransaction) {
        this.secureTransaction = secureTransaction;
    }

    /**
     * 钱包选项
     * 说明：1.单一钱包支付传SINGLE, 多钱包支付传MULTIPLE
     */
    private String walletOption;

    public String getWalletOption() {
        return walletOption;
    }

    public void setWalletOption(String walletOption) {
        this.walletOption = walletOption;
    }

    /**
     * 实名认证姓名
     * Base64编码
     */
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 实名认证手机号
     * Base64编码
     */
    private String mobile;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * 实名认证证件类型
     * 证件类型，微信支持身份证、支付宝支持身份证：IDENTITY_CARD、护照：PASSPORT、军官证：OFFICER_CARD、士兵证：SOLDIER_CARD、户口本：HOKOU
     */
    private String certType;

    public String getCertType() {
        return certType;
    }

    public void setCertType(String certType) {
        this.certType = certType;
    }

    /**
     * 实名认证证件号
     * Base64编码
     */
    private String certNo;

    public String getCertNo() {
        return certNo;
    }

    public void setCertNo(String certNo) {
        this.certNo = certNo;
    }

    /**
     * 是否需要实名认证
     * 需要实名认证时置为 T
     */
    private String fixBuyer;

    public String getFixBuyer() {
        return fixBuyer;
    }

    public void setFixBuyer(String fixBuyer) {
        this.fixBuyer = fixBuyer;
    }

    /**
     * 是否需要限制信用卡支付
     * 取值：true或false，默认false
     */
    private boolean limitCreditCard;

    public boolean isLimitCreditCard() {
        return limitCreditCard;
    }

    public void setLimitCreditCard(boolean limitCreditCard) {
        this.limitCreditCard = limitCreditCard;
    }

    public GetQRCodeReq() {
        this.setMsgType("bills.getQRCode");
        this.setInstMid("QRPAYDEFAULT");
    }
}
