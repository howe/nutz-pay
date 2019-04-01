package org.nutz.pay.bean.biz;

/**
 * 在传分账标记的情况下，若传子商户号，子商户商品金额必传，即goods字段中每个元素中subMerchantId与subOrderAmount不能为空，元素不能超过20个。
 * （goods里所有子商户商品总额要与支付总额totalAmount相等）。
 * Created by Jianghao on 2018/12/15
 *
 * @howechiang
 */
public class Good {

    /**
     * 商品ID
     */
    private String goodsId;

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * 商品名称
     */
    private String goodsName;

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    /**
     * 商品数量
     */
    private Integer quantity;

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * 商品单价（分）
     */
    private Integer price;

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    /**
     * 商品分类
     */
    private String goodsCategory;

    public String getGoodsCategory() {
        return goodsCategory;
    }

    public void setGoodsCategory(String goodsCategory) {
        this.goodsCategory = goodsCategory;
    }

    /**
     * 商品说明
     */
    private String body;

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    /**
     * 子商户号
     */
    private String subMerchantId;

    public String getSubMerchantId() {
        return subMerchantId;
    }

    public void setSubMerchantId(String subMerchantId) {
        this.subMerchantId = subMerchantId;
    }

    /**
     * 子商户商品总额
     */
    private Integer subOrderAmount;

    public Integer getSubOrderAmount() {
        return subOrderAmount;
    }

    public void setSubOrderAmount(Integer subOrderAmount) {
        this.subOrderAmount = subOrderAmount;
    }

    /**
     * 商品折扣
     * 单位：分
     */
    private Integer discount;

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }
}
