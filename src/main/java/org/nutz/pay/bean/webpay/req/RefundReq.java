package org.nutz.pay.bean.webpay.req;

import org.nutz.pay.bean.biz.SubOrder;

import java.util.List;

/**
 * 退款
 * Created by Jianghao on 2018/12/15
 *
 * @howechiang
 */
public class RefundReq extends BaseReq {

    /**
     * 要退货的金额
     * 必填
     * 若下单接口中上送了分钟标记字段divisionFlag，则该字段refundAmount等于platformAmount加上subOrders中totalAmount
     */
    private Long refundAmount;

    public Long getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(Long refundAmount) {
        this.refundAmount = refundAmount;
    }

    /**
     * 针对平台商户分账金额的退款金额
     * 选填
     * 若下单接口中上送了分账标记字段divisionFlag，则该字段必传
     * 且退款接口platformAmount小于下单接口中上送的platformAmount
     */
    private Long platformAmount;

    public Long getPlatformAmount() {
        return platformAmount;
    }

    public void setPlatformAmount(Long platformAmount) {
        this.platformAmount = platformAmount;
    }

    /**
     * 若下单接口中上送了分账标记字段divisionFlag，则该字段必传
     * 且退款接口totalAmount小于下单接口中上送的subOrders中对应mid下的totalAmount。
     * 另外：每次只能针对subOrders中的一个子商户号进行退款。
     */
    private List<SubOrder> subOrders;

    public List<SubOrder> getSubOrders() {
        return subOrders;
    }

    public void setSubOrders(List<SubOrder> subOrders) {
        this.subOrders = subOrders;
    }

    /**
     * 退货说明
     * 选填
     */
    private String refundDesc;

    public String getRefundDesc() {
        return refundDesc;
    }

    public void setRefundDesc(String refundDesc) {
        this.refundDesc = refundDesc;
    }

    /**
     * 退货交易的订单号，如不指定，则系统自动生成。
     * 选填
     * 若多次退货，且后续退货上送的merOrderId和refundOrderId字段与之前退货上送的值一致，将不会走退货逻辑，而是返回已有退货订单的退货信息
     */
    private String refundOrderId;

    public String getRefundOrderId() {
        return refundOrderId;
    }

    public void setRefundOrderId(String refundOrderId) {
        this.refundOrderId = refundOrderId;
    }

    public RefundReq() {
        this.setMsgType("refund");
    }
}
