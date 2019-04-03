package org.nutz.pay.bean.poslink.resp;

/**
 * Copyright 2018 Freshplay Co ltd
 *
 * @author howechiang
 */
public class PayResp extends BaseResp {

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
     * 订单金额
     * 与交易请求金额一致
     */
    private Integer transactionAmount;

    public Integer getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(Integer transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    /**
     * 营销联盟优惠后交易金额
     * 营销联盟优惠后交易金额，最大长度12位
     */
    private Integer actualTransactionAmount;

    public Integer getActualTransactionAmount() {
        return actualTransactionAmount;
    }

    public void setActualTransactionAmount(Integer actualTransactionAmount) {
        this.actualTransactionAmount = actualTransactionAmount;
    }

    /**
     * 实际支付金额
     * 用户实际支付金额，最大长度12位
     */
    private Integer amount;

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    /**
     * 订单号
     */
    private String orderId;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * 营销联盟优惠说明
     */
    private String marketingAllianceDiscountInstruction;

    public String getMarketingAllianceDiscountInstruction() {
        return marketingAllianceDiscountInstruction;
    }

    public void setMarketingAllianceDiscountInstruction(String marketingAllianceDiscountInstruction) {
        this.marketingAllianceDiscountInstruction = marketingAllianceDiscountInstruction;
    }

    /**
     * 第三方优惠说明
     */
    private String thirdPartyDiscountInstruction;

    public String getThirdPartyDiscountInstruction() {
        return thirdPartyDiscountInstruction;
    }

    public void setThirdPartyDiscountInstruction(String thirdPartyDiscountInstruction) {
        this.thirdPartyDiscountInstruction = thirdPartyDiscountInstruction;
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

    /**
     * 第三方买家ID
     */
    private String thirdPartyBuyerId;

    public String getThirdPartyBuyerId() {
        return thirdPartyBuyerId;
    }

    public void setThirdPartyBuyerId(String thirdPartyBuyerId) {
        this.thirdPartyBuyerId = thirdPartyBuyerId;
    }

    /**
     * 第三方买家用户名
     */
    private String thirdPartyBuyerUserName;

    public String getThirdPartyBuyerUserName() {
        return thirdPartyBuyerUserName;
    }

    public void setThirdPartyBuyerUserName(String thirdPartyBuyerUserName) {
        this.thirdPartyBuyerUserName = thirdPartyBuyerUserName;
    }

    /**
     * 第三方订单号
     */
    private String thirdPartyOrderId;

    public String getThirdPartyOrderId() {
        return thirdPartyOrderId;
    }

    public void setThirdPartyOrderId(String thirdPartyOrderId) {
        this.thirdPartyOrderId = thirdPartyOrderId;
    }

    /**
     * 第三方支付信息
     * 格式为：
     * 方式:金额（单位：分）|方式:金额|……
     */
    private String thirdPartyPayInformation;

    public String getThirdPartyPayInformation() {
        return thirdPartyPayInformation;
    }

    public void setThirdPartyPayInformation(String thirdPartyPayInformation) {
        this.thirdPartyPayInformation = thirdPartyPayInformation;
    }
}