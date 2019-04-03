package org.nutz.pay.bean.poslink.resp;

import org.nutz.pay.bean.poslink.biz.Promotion;

import java.util.List;

/**
 * Copyright 2018 Freshplay Co ltd
 *
 * @author howechiang
 */
public class QueryResp extends BaseResp {

    /**
     * 原始交易时间
     * 格式：YYYYMMDDHHmmSS
     */
    private String originalTransactionTime;

    public String getOriginalTransactionTime() {
        return originalTransactionTime;
    }

    public void setOriginalTransactionTime(String originalTransactionTime) {
        this.originalTransactionTime = originalTransactionTime;
    }

    /**
     * 查询结果
     * 0：成功
     * 1：超时
     * 2：已撤销
     * 3：已退货
     * 4：已冲正
     * 5：失败（失败情况，后面追加失败描述
     * FF：交易状态未知
     */
    private String queryResCode;

    public String getQueryResCode() {
        return queryResCode;
    }

    public void setQueryResCode(String queryResCode) {
        this.queryResCode = queryResCode;
    }

    /**
     * 查询结果描述
     * 最大长度32位
     */
    private String queryResDesc;

    public String getQueryResDesc() {
        return queryResDesc;
    }

    public void setQueryResDesc(String queryResDesc) {
        this.queryResDesc = queryResDesc;
    }

    /**
     * 原交易付款码
     * 最大长度12位
     */
    private String originalPayCode;

    public String getOriginalPayCode() {
        return originalPayCode;
    }

    public void setOriginalPayCode(String originalPayCode) {
        this.originalPayCode = originalPayCode;
    }

    /**
     * 原交易批次号
     * 最大长度6位
     */
    private String originalBatchNo;

    public String getOriginalBatchNo() {
        return originalBatchNo;
    }

    public void setOriginalBatchNo(String originalBatchNo) {
        this.originalBatchNo = originalBatchNo;
    }

    /**
     * 原交易流水号
     * 最大长度6位
     */
    private String originalSystemTraceNum;

    public String getOriginalSystemTraceNum() {
        return originalSystemTraceNum;
    }

    public void setOriginalSystemTraceNum(String originalSystemTraceNum) {
        this.originalSystemTraceNum = originalSystemTraceNum;
    }

    /**
     * 原检索参考号
     * 最大长度12位
     */
    private String origialRetrievalRefNum;

    public String getOrigialRetrievalRefNum() {
        return origialRetrievalRefNum;
    }

    public void setOrigialRetrievalRefNum(String origialRetrievalRefNum) {
        this.origialRetrievalRefNum = origialRetrievalRefNum;
    }

    /**
     * 原交易金额
     * 最大长度12位
     */
    private Integer originalTransactionAmount;

    public Integer getOriginalTransactionAmount() {
        return originalTransactionAmount;
    }

    public void setOriginalTransactionAmount(Integer originalTransactionAmount) {
        this.originalTransactionAmount = originalTransactionAmount;
    }

    /**
     * 商户订单号
     * 最大长度50位
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
     * 最大长度26位
     */
    private String orderId;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * 已退货金额
     * 退货交易的已退货金额
     */
    private Integer refundedAmount;

    public Integer getRefundedAmount() {
        return refundedAmount;
    }

    public void setRefundedAmount(Integer refundedAmount) {
        this.refundedAmount = refundedAmount;
    }

    /**
     * 营销联盟优惠后交易金额
     * 最大长度12位
     */
    private Integer actualTransactionAmount;

    public Integer getActualTransactionAmount() {
        return actualTransactionAmount;
    }

    public void setActualTransactionAmount(Integer actualTransactionAmount) {
        this.actualTransactionAmount = actualTransactionAmount;
    }

    /**
     * 用户实际支付金额
     */
    private Integer amount;

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    /**
     * 交易营销联盟优惠说明
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

    /**
     * 优惠金额（合计）
     */
    private Integer totalDiscountAmount;

    public Integer getTotalDiscountAmount() {
        return totalDiscountAmount;
    }

    public void setTotalDiscountAmount(Integer totalDiscountAmount) {
        this.totalDiscountAmount = totalDiscountAmount;
    }

    /**
     * 优惠状态
     * 1：订单有优惠但未找到
     * 2：订单有优惠且找到
     */
    private String discountStatus;

    public String getDiscountStatus() {
        return discountStatus;
    }

    public void setDiscountStatus(String discountStatus) {
        this.discountStatus = discountStatus;
    }

    /**
     * 优惠活动活动列表
     * 单品营销优惠活动列表
     */
    private List<Promotion> promotionList;

    public List<Promotion> getPromotionList() {
        return promotionList;
    }

    public void setPromotionList(List<Promotion> promotionList) {
        this.promotionList = promotionList;
    }
}