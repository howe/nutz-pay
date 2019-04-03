package org.nutz.pay.bean.poslink.resp;

/**
 * Copyright 2018 Freshplay Co ltd
 *
 * @author howechiang
 */
public class QueryRefundResp extends BaseResp {

    /**
     * 查询结果
     * 00：成功
     * 其余均为失败
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
     * 当queryResCode不为00时存在
     */
    private String queryResInfo;

    public String getQueryResInfo() {
        return queryResInfo;
    }

    public void setQueryResInfo(String queryResInfo) {
        this.queryResInfo = queryResInfo;
    }

    /**
     * 付款码
     */
    private String payCode;

    public String getPayCode() {
        return payCode;
    }

    public void setPayCode(String payCode) {
        this.payCode = payCode;
    }

    /**
     * 所查询交易交易日期
     */
    private String dealDate;

    public String getDealDate() {
        return dealDate;
    }

    public void setDealDate(String dealDate) {
        this.dealDate = dealDate;
    }

    /**
     * 所查询交易交易时间
     */
    private String dealTime;

    public String getDealTime() {
        return dealTime;
    }

    public void setDealTime(String dealTime) {
        this.dealTime = dealTime;
    }

    /**
     * 原终端上送金额
     */
    private Integer originalAmount;

    public Integer getOriginalAmount() {
        return originalAmount;
    }

    public void setOriginalAmount(Integer originalAmount) {
        this.originalAmount = originalAmount;
    }

    /**
     * 交易类型
     */
    private String dealType;

    public String getDealType() {
        return dealType;
    }

    public void setDealType(String dealType) {
        this.dealType = dealType;
    }

    /**
     * 所查询交易流水
     */
    private String dealSystemTraceNum;

    public String getDealSystemTraceNum() {
        return dealSystemTraceNum;
    }

    public void setDealSystemTraceNum(String dealSystemTraceNum) {
        this.dealSystemTraceNum = dealSystemTraceNum;
    }

    /**
     * 所查询交易系统参考号
     */
    private String dealRetrievalRefNum;

    public String getDealRetrievalRefNum() {
        return dealRetrievalRefNum;
    }

    public void setDealRetrievalRefNum(String dealRetrievalRefNum) {
        this.dealRetrievalRefNum = dealRetrievalRefNum;
    }

    /**
     * 批次号
     */
    private String batchNo;

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    /**
     * 原交易日期
     */
    private String originalTransactionDate;

    public String getOriginalTransactionDate() {
        return originalTransactionDate;
    }

    public void setOriginalTransactionDate(String originalTransactionDate) {
        this.originalTransactionDate = originalTransactionDate;
    }

    /**
     * 原交易系统参考号
     */
    private String origialRetrievalRefNum;

    public String getOrigialRetrievalRefNum() {
        return origialRetrievalRefNum;
    }

    public void setOrigialRetrievalRefNum(String origialRetrievalRefNum) {
        this.origialRetrievalRefNum = origialRetrievalRefNum;
    }
}
