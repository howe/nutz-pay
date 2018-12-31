package org.nutz.pay.bean.biz;

/**
 * 在传分账标记的情况下，若传子商户号，子商户分账金额必传，即ubOrders每个元素的mid和totalAmount非空 且 mid不超过20个。（分账方案subOrders里子商户分账总额+platformAmount要与支付总额totalAmount相等）。
 * 详见接口下方备注部分
 * Created by Jianghao on 2018/12/15
 *
 * @howechiang
 */
public class SubOrder {

    /**
     * 子商户号
     */
    private String mid;

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    /**
     * 子商户分账金额
     */
    private Integer totalAmount;

    public Integer getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
    }
}
