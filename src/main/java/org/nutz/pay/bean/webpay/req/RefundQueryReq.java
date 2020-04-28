package org.nutz.pay.bean.webpay.req;

import org.nutz.pay.bean.bills.req.BaseReq;

/**
 * Copyright 2018 Freshplay Co ltd
 *
 * @author howechiang
 */
public class RefundQueryReq extends BaseReq {

    public RefundQueryReq() {
        this.setMsgType("refundQuery");
        this.setInstMid("YUEDANDEFAULT");
    }

    /**
     * 商户订单号
     * 这里需要填入退货订单号
     */
    private String merOrderId;

    public String getMerOrderId() {
        return merOrderId;
    }

    public void setMerOrderId(String merOrderId) {
        this.merOrderId = merOrderId;
    }
}
