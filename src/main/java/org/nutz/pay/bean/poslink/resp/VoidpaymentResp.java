package org.nutz.pay.bean.poslink.resp;

/**
 * Copyright 2018 Freshplay Co ltd
 *
 * @author howechiang
 */
public class VoidpaymentResp extends BaseResp {

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
     */
    private String retrievalRefNum;

    public String getRetrievalRefNum() {
        return retrievalRefNum;
    }

    public void setRetrievalRefNum(String retrievalRefNum) {
        this.retrievalRefNum = retrievalRefNum;
    }

    /**
     * 订单金额
     */
    private Integer transactionAmount;

    public Integer getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(Integer transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    /**
     * 实际交易金额
     */
    private Integer actualTransactionAmount;

    public Integer getActualTransactionAmount() {
        return actualTransactionAmount;
    }

    public void setActualTransactionAmount(Integer actualTransactionAmount) {
        this.actualTransactionAmount = actualTransactionAmount;
    }

    /**
     * 第三方名称
     */
    private String thirdPartyName;

    public String getThirdPartyName() {
        return thirdPartyName;
    }

    public void setThirdPartyName(String thirdPartyName) {
        this.thirdPartyName = thirdPartyName;
    }
}
