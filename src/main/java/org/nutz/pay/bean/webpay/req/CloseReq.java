package org.nutz.pay.bean.webpay.req;

/**
 * 订单关闭
 * Created by Jianghao on 2018/12/15
 *
 * @howechiang
 */
public class CloseReq extends BaseReq {

    public CloseReq() {
        this.setMsgType("close");
        this.setInstMid("YUEDANDEFAULT");
    }
}
