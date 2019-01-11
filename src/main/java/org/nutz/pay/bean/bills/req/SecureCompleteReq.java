package org.nutz.pay.bean.bills.req;

/**
 * Copyright 2018 Freshplay Co ltd
 *
 * @author howechiang
 */
public class SecureCompleteReq extends BaseReq {

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

    /**
     * 担保完成金额
     */
    private Integer completedAmount;

    public Integer getCompletedAmount() {
        return completedAmount;
    }

    public void setCompletedAmount(Integer completedAmount) {
        this.completedAmount = completedAmount;
    }

    public SecureCompleteReq(){
        this.setMsgType("bills.secureComplete");
    }
}
