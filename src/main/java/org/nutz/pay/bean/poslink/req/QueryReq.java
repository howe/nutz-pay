package org.nutz.pay.bean.poslink.req;

/**
 * Copyright 2018 Freshplay Co ltd
 *
 * @author howechiang
 */
public class QueryReq extends BaseReq {

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
}
