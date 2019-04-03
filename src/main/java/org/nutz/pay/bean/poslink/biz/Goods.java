package org.nutz.pay.bean.poslink.biz;

/**
 * Copyright 2018 Freshplay Co ltd
 *
 * @author howechiang
 */
public class Goods {

    /**
     * 商品编号
     */
    private String goodsId;

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * 单品优惠金额
     */
    private Integer discountAmount;

    public Integer getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(Integer discountAmount) {
        this.discountAmount = discountAmount;
    }

    /**
     * 商品数量
     */
    private Integer goodsNumber;

    public Integer getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(Integer goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    /**
     * 商品价格
     */
    private Integer goodsPrice;

    public Integer getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(Integer goodsPrice) {
        this.goodsPrice = goodsPrice;
    }
}
