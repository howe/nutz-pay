package org.nutz.pay.bean.webpay.req;

import org.nutz.lang.Times;

import java.io.Serializable;

/**
 * Created by Jianghao on 2018/12/14
 *
 * @howechiang
 */
public class BaseReq implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 消息ID，原样返回
     * 选填
     */
    private String msgId;

    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

    /**
     * 消息来源
     * 必填
     */
    private String msgSrc;

    public String getMsgSrc() {
        return msgSrc;
    }

    public void setMsgSrc(String msgSrc) {
        this.msgSrc = msgSrc;
    }

    /**
     * 消息类型
     * 创建订单时：WXPay.jsPay :微信公众号支付
     * 创建订单时：trade.jsPay :支付宝
     * 创建订单时：qmf.jspay :全民付
     * 创建订单时：qmf.webPay :无卡
     * 创建订单时：acp.jsPay :银联云闪付
     * 微信小程序: wx.unifiedOrder
     * 支付宝小程序: trade.create
     * ---------------------------------------
     * 订单查询时：  query
     * 担保撤销时：  secureCancel
     * 担保完成时：  secureComplete
     * 订单退款时：  refund
     * 退货查询接口：refundQuery
     * 订单关闭时：  close
     * 必填
     */
    private String msgType;

    public String getMsgType() {
        return msgType;
    }

    public void setMsgType(String msgType) {
        this.msgType = msgType;
    }

    /**
     * 报文请求时间，格式yyyy-MM-dd HH:mm:ss
     * 必填
     */
    private String requestTimestamp = Times.getNowSDT();

    public String getRequestTimestamp() {
        return requestTimestamp;
    }

    public void setRequestTimestamp(String requestTimestamp) {
        this.requestTimestamp = requestTimestamp;
    }


    /**
     * 商户订单号
     * 商户需自行生成merOrderId。此时merOrderId需要符合银商规范，以银商分配的4位来源编号（msgSrcId）作为订单号的前4位，且在商户系统中此订单号保证唯一。总长度需大于6位，小于32位。
     * 必填
     */
    private String merOrderId;

    public String getMerOrderId() {
        return merOrderId;
    }

    public void setMerOrderId(String merOrderId) {
        this.merOrderId = merOrderId;
    }

    /**
     * 请求系统预留字段
     * 必填
     */
    private String srcReserve;

    public String getSrcReserve() {
        return srcReserve;
    }

    public void setSrcReserve(String srcReserve) {
        this.srcReserve = srcReserve;
    }

    /**
     * 商户号
     * 必填
     */
    private String mid;

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    /**
     * 终端号
     * 必填
     */
    private String tid;

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    /**
     * 业务类型
     * YUEDANDEFAULT
     * 必填
     */
    private String instMid;

    public String getInstMid() {
        return instMid;
    }

    public void setInstMid(String instMid) {
        this.instMid = instMid;
    }

    /**
     * 签名算法
     * 选填
     * 值为：MD5或 SHA256；若不上送默认为MD5
     */
    private String signType;

    public String getSignType() {
        return signType;
    }

    public void setSignType(String signType) {
        this.signType = signType;
    }

    /**
     * 签名
     * 必填
     */
    private String sign;

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

}
