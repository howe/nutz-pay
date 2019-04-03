package org.nutz.pay.bean.poslink.req;

import org.nutz.pay.bean.biz.Good;

import java.util.List;

/**
 * Copyright 2018 Freshplay Co ltd
 *
 * @author howechiang
 */
public class RefundReq extends BaseReq {

    /**
     * 商户订单号
     * 商户订单号与银商订单号至少存在一个，如均存在，以银商订单号为准，忽略商户订单号
     */
    private String merchantOrderId;

    public String getMerchantOrderId() {
        return merchantOrderId;
    }

    public void setMerchantOrderId(String merchantOrderId) {
        this.merchantOrderId = merchantOrderId;
    }

    /**
     * 银商订单号
     * 必须与原支付交易返回的订单号一致
     */
    private String originalOrderId;

    public String getOriginalOrderId() {
        return originalOrderId;
    }

    public void setOriginalOrderId(String originalOrderId) {
        this.originalOrderId = originalOrderId;
    }

    /**
     * 退款请求标识
     * 标识一次退款请求，同一笔订单多次退款需要保证唯一，长度不超过50位
     */
    private String refundRequestId;

    public String getRefundRequestId() {
        return refundRequestId;
    }

    public void setRefundRequestId(String refundRequestId) {
        this.refundRequestId = refundRequestId;
    }

    /**
     * 交易金额
     * 单位：分
     * 退货金额
     */
    private Integer transactionAmount;

    public Integer getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(Integer transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    /**
     * 是否限制跨终端
     * true : 不可以跨终端
     * false: 可以跨终端
     */
    private boolean limitCrossDevice;

    public boolean isLimitCrossDevice() {
        return limitCrossDevice;
    }

    public void setLimitCrossDevice(boolean limitCrossDevice) {
        this.limitCrossDevice = limitCrossDevice;
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
