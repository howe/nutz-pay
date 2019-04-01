package org.nutz.pay.bean.poslink.req;

import org.nutz.pay.bean.biz.Good;

import java.util.List;

/**
 * Copyright 2018 Freshplay Co ltd
 *
 * @author howechiang
 */
public class ActiveterminalReq extends BaseReq {

    /**
     * 交易金额
     * 单位：分
     */
    private Integer transactionAmount;

    public Integer getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(Integer transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    /**
     * 交易币种
     * 需填入156
     */
    private String transactionCurrencyCode;

    public String getTransactionCurrencyCode() {
        return transactionCurrencyCode;
    }

    public void setTransactionCurrencyCode(String transactionCurrencyCode) {
        this.transactionCurrencyCode = transactionCurrencyCode;
    }

    /**
     * 商户订单号
     * 全局唯一，不可重复，长度不超过50位
     */
    private String merchantOrderId;

    public String getMerchantOrderId() {
        return merchantOrderId;
    }

    public void setMerchantOrderId(String merchantOrderId) {
        this.merchantOrderId = merchantOrderId;
    }

    /**
     * 商户备注
     */
    private String merchantRemark;

    public String getMerchantRemark() {
        return merchantRemark;
    }

    public void setMerchantRemark(String merchantRemark) {
        this.merchantRemark = merchantRemark;
    }

    /**
     * 支付方式
     * E_CASH – 电子现金
     * SOUNDWAVE – 声波
     * NFC – NFC
     * CODE_SCAN – 扫码
     * MANUAL – 手输
     */
    private String payMode;

    public String getPayMode() {
        return payMode;
    }

    public void setPayMode(String payMode) {
        this.payMode = payMode;
    }

    /**
     * 支付码
     */
    private String payCode;

    public String getPayCode() {
        return payCode;
    }

    public void setPayCode(String payCode) {
        this.payCode = payCode;
    }

    /**
     * 商品信息
     */
    private List<Good> goods;

    public List<Good> getGoods() {
        return goods;
    }

    public void setGoods(List<Good> goods) {
        this.goods = goods;
    }

    /**
     * 商户冗余信息
     * 用于多种用途，如在特定支付渠道下，冗余信息将被渠道利用 长度不超过255位
     */
    private String srcReserved;

    public String getSrcReserved() {
        return srcReserved;
    }

    public void setSrcReserved(String srcReserved) {
        this.srcReserved = srcReserved;
    }

    /**
     * 门店编号
     */
    private String storeId;

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    /**
     * 是否限制信用卡
     */
    private boolean limitCreditCard;

    public void setLimitCreditCard(boolean limitCreditCard) {
        this.limitCreditCard = limitCreditCard;
    }

    public boolean isLimitCreditCard() {
        return limitCreditCard;
    }

    /**
     * 操作员编号
     */
    private String operatorId;

    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    /**
     * 业务标识
     * 标识接入的具体业务 除非特殊说明，一般不需要上送
     */
    private String bizIdentifier;

    public String getBizIdentifier() {
        return bizIdentifier;
    }

    public void setBizIdentifier(String bizIdentifier) {
        this.bizIdentifier = bizIdentifier;
    }
}
