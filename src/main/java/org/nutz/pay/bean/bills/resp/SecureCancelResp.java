package org.nutz.pay.bean.bills.resp;

/**
 * Copyright 2018 Freshplay Co ltd
 *
 * @author howechiang
 */
public class SecureCancelResp extends BaseResp {

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
     * 担保交易状态
     * UNCOMPLETED 	担保未完成	担保未完成的交易不允许直接做反交易
     * PARTLY_COMPLETED	担保已完成，部分完成
     * ALL_COMPLETED	担保已完成，全部完成
     * CANCELED	担保已撤销
     */
    private String secureStatus;

    public String getSecureStatus() {
        return secureStatus;
    }

    public void setSecureStatus(String secureStatus) {
        this.secureStatus = secureStatus;
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
}
