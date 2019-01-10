package org.nutz.pay.bean.webpay.req;

/**
 * 担保完成
 * Created by Jianghao on 2018/12/15
 *
 * @howechiang
 */
public class SecureCompleteReq extends BaseReq {

    /**
     * 担保完成金额
     * 必填
     */
    private Integer completedAmount;

    public Integer getCompletedAmount() {
        return completedAmount;
    }

    public void setCompletedAmount(Integer completedAmount) {
        this.completedAmount = completedAmount;
    }

    public SecureCompleteReq() {
        this.setMsgType("secureComplete");
    }
}
