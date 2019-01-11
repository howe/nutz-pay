package org.nutz.pay.bean.bills.req;

/**
 * Copyright 2018 Freshplay Co ltd
 *
 * @author howechiang
 */
public class SecureCancelReq extends BaseReq {

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

    public SecureCancelReq(){
        this.setMsgType("bills.secureCancel");
    }
}
