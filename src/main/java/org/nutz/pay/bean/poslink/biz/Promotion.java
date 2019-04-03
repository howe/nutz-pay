package org.nutz.pay.bean.poslink.biz;

import java.util.List;

/**
 * Copyright 2018 Freshplay Co ltd
 *
 * @author howechiang
 */
public class Promotion {

    /**
     * 渠道方
     * UNIONPAY：银联
     * UMS：银联商务
     * ALIPAY：支付宝
     * WXPAY：微信
     */
    private String channelName;

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    /**
     * 优惠流水ID
     */
    private String discountId;

    public String getDiscountId() {
        return discountId;
    }

    public void setDiscountId(String discountId) {
        this.discountId = discountId;
    }

    /**
     * 活动编号
     */
    private String eventNo;

    public String getEventNo() {
        return eventNo;
    }

    public void setEventNo(String eventNo) {
        this.eventNo = eventNo;
    }

    /**
     * 活动优惠金额
     */
    private Integer eventDiscountAmount;

    public Integer getEventDiscountAmount() {
        return eventDiscountAmount;
    }

    public void setEventDiscountAmount(Integer eventDiscountAmount) {
        this.eventDiscountAmount = eventDiscountAmount;
    }

    private List<Goods> goodsList;

    public List<Goods> getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(List<Goods> goodsList) {
        this.goodsList = goodsList;
    }
}
