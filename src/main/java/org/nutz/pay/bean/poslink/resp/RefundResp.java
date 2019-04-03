package org.nutz.pay.bean.poslink.resp;

/**
 * Copyright 2018 Freshplay Co ltd
 *
 * @author howechiang
 */
public class RefundResp extends BaseResp {

    /**
     * 交易时间
     * 格式：hhmmss
     */
    private String transactionTime;

    public String getTransactionTime() {
        return transactionTime;
    }

    public void setTransactionTime(String transactionTime) {
        this.transactionTime = transactionTime;
    }

    /**
     * 交易日期
     * 格式：MMdd
     */
    private String transactionDate;

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    /**
     * 结算日期
     * 格式：MMdd
     */
    private String settlementDate;

    public String getSettlementDate() {
        return settlementDate;
    }

    public void setSettlementDate(String settlementDate) {
        this.settlementDate = settlementDate;
    }

    /**
     * 检索参考号
     * 长度12位
     */
    private String retrievalRefNum;

    public String getRetrievalRefNum() {
        return retrievalRefNum;
    }

    public void setRetrievalRefNum(String retrievalRefNum) {
        this.retrievalRefNum = retrievalRefNum;
    }

    /**
     * 第三方名称
     * 仅仅退款成功的存在该字段
     */
    private String thirdPartyName;

    public String getThirdPartyName() {
        return thirdPartyName;
    }

    public void setThirdPartyName(String thirdPartyName) {
        this.thirdPartyName = thirdPartyName;
    }
}
