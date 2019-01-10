package org.nutz.pay.bean.webpay.resp;

import java.io.Serializable;

/**
 * Copyright 2018 Freshplay Co ltd
 *
 * @author howechiang
 */
public class BaseResp implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 平台错误码
     * SUCCESS	成功	无。
     * INTERNAL_ERROR	内部错误	系统错误，请联系技术支持。
     * BAD_REQUEST	请求报文有错	报文格式有错误，请对照文档检查报文格式。
     * NO_SERVICE	没有能处理请求msgtype的服务	msgType错误，请检查文档，msgType是否拼写正确。
     * TIMEOUT	处理超时	处理超时，很可能是微信和支付宝的网络请求没应答，建议重试或者撤销交易。
     * NO_ORDER	找不到请求的原始订单	对应的mid+merOrderId不正确，无法找到原交易，请检查merOrderId是否跟原交易一致。
     * OPERATION_NOT_ALLOWED	当前不允许此操作	订单已经关闭，不能执行退货等操作。
     * TARGET_FAIL	支付宝方支付失败，如请求没有成功，或者请求成功，但是没有正确处理。	支付宝或者微信方业务失败，请根据返回信息确定具体原因。
     * DUP_ORDER	重复的订单请求	支付请求的merOrderId重复，请检查终端是否做过复位操作，导致流水号等重复。
     * NET_ERROR	跟支付包通讯出问题，包括请求发送异常，报文应答不是200，请求被取消，应答超时等。	通讯问题，联系运行检查网络情况。
     * NO_MERCHANT	找不到请求指定的商户	请求报文的mid在网付前置无法找到相关的配置，请确认终端的商户号是否正确在网付前置配置，是否经过转商户处理。
     * ORDER_PROCESSING	订单正在处理中，不允许并发操作。	当前订单的上一次操作没有完成，订单处于锁定状态，请等待一分钟后再试。
     * INACTIVE_MERCHANT	商户被置为inactive状态	交易商户在网付前置被冻结。
     * ABNORMAL_REQUEST_TIME	请求时间异常	请求终端或者平台的系统时间不正常，请检查系统时间。
     * TXN_DISCARDED	请求开始处理时间延迟过大，交易被丢弃。	系统负载过大，交易被丢弃，请联系运行。
     * BAD_SIGN	签名错误	报文签名错误，请联系技术指导签名算法。
     * INVALID_MSGSRC	商户来源错误	系统配置有问题，请联系技术。
     * INVALID_ORDER	订单信息异常	该订单支付时有异常，缺少关键数据，请先做一笔订单查询，补充关键数据后再次进行退货等操作。
     * NO_CROSS_DAY_TRADING	不允许跨日交易	可能某些渠道不支持跨日撤销，建议做退货。
     * DENIED_IP	不允许此IP交易	IP不在白名单中，请联系管理员确认。
     * INVLID_MERCHANT_CONFIG	错误的商户配置	商户配置参数有问题，请联系业务人员检查商户配置参数。
     * INVALID_RESPONSE	无效的应答报文	支付渠道方的应答报文有问题，比如验签失败、报文格式错误等。
     */
    private String errCode;

    public String getErrCode() {
        return errCode;
    }

    public void setErrCode(String errCode) {
        this.errCode = errCode;
    }

    /**
     * 平台错误信息
     */
    private String errMsg;

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    /**
     * 消息ID
     */
    private String msgId;

    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

    /**
     * 消息类型
     */
    private String msgType;

    public String getMsgType() {
        return msgType;
    }

    public void setMsgType(String msgType) {
        this.msgType = msgType;
    }

    /**
     * 消息来源
     */
    private String msgSrc;

    public String getMsgSrc() {
        return msgSrc;
    }

    public void setMsgSrc(String msgSrc) {
        this.msgSrc = msgSrc;
    }

    /**
     * 请求系统预留字段
     */
    private String srcReserve;

    public String getSrcReserve() {
        return srcReserve;
    }

    public void setSrcReserve(String srcReserve) {
        this.srcReserve = srcReserve;
    }

    /**
     * 报文响应时间，格式yyyy-MM-dd HH:mm:ss
     */
    private String responseTimestamp;

    public String getResponseTimestamp() {
        return responseTimestamp;
    }

    public void setResponseTimestamp(String responseTimestamp) {
        this.responseTimestamp = responseTimestamp;
    }

    /**
     * 商户号
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
     */
    private String tid;

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    /**
     * 商户订单号
     */
    private String merOrderId;

    public String getMerOrderId() {
        return merOrderId;
    }

    public void setMerOrderId(String merOrderId) {
        this.merOrderId = merOrderId;
    }


    private String connectSys;

    public String getConnectSys() {
        return connectSys;
    }

    public void setConnectSys(String connectSys) {
        this.connectSys = connectSys;
    }

    /**
     * 签名
     */
    private String sign;

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }
}
