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
    private Long completedAmount;

    public Long getCompletedAmount() {
        return completedAmount;
    }

    public void setCompletedAmount(Long completedAmount) {
        this.completedAmount = completedAmount;
    }

    public SecureCompleteReq() {
        this.setMsgType("secureComplete");
    }
}
