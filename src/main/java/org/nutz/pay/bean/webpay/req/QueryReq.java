package org.nutz.pay.bean.webpay.req;

/**
 * 查询支付订单
 * Created by Jianghao on 2018/12/15
 *
 * @howechiang
 */
public class QueryReq extends BaseReq {

    public QueryReq() {
        this.setMsgType("query");
    }
}
