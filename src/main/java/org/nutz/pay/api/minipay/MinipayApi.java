package org.nutz.pay.api.minipay;

import org.nutz.json.Json;
import org.nutz.json.JsonFormat;
import org.nutz.lang.Lang;
import org.nutz.lang.Strings;
import org.nutz.pay.bean.biz.Comm;
import org.nutz.pay.bean.minipay.req.CreateReq;
import org.nutz.pay.bean.minipay.resp.CreateResp;
import org.nutz.pay.util.HttpUtil;
import org.nutz.pay.util.Util;

/**
 * 下单请求
 * Copyright 2018 Freshplay Co ltd
 *
 * @author howechiang
 */
public class MinipayApi {

    public static CreateResp create(CreateReq req) {
        if (Strings.isBlank(req.getMsgSrc())) {
            throw new NullPointerException("msgSrc为空");
        } else if (Strings.isBlank(req.getRequestTimestamp())) {
            throw new NullPointerException("requestTimestamp为空");
        } else if (!Util.equals(req.getMsgType(), Comm.MSGTYPE_WX_UNIFIEDORDER, Comm.MSGTYPE_TRADE_CREATE)) {
            throw new NullPointerException("msgType错误");
        } else if (Strings.isBlank(req.getMerOrderId())) {
            throw new NullPointerException("merOrderId为空");
        } else if (Strings.isBlank(req.getMid())) {
            throw new NullPointerException("mid为空");
        } else if (Strings.isBlank(req.getTid())) {
            throw new NullPointerException("tid为空");
        } else if (Strings.isBlank(req.getInstMid())) {
            throw new NullPointerException("instMid为空");
        } else if (Strings.isBlank(req.getSignType())) {
            throw new NullPointerException("signType为空");
        } else if (Strings.isBlank(req.getSign())) {
            throw new NullPointerException("sign为空");
        } else if (Lang.isEmpty(req.getTotalAmount())) {
            throw new NullPointerException("totalAmount为空");
        } else if (Strings.equalsIgnoreCase(req.getMsgType(), Comm.MSGTYPE_WX_UNIFIEDORDER) && Strings.isBlank(req.getOpenid())) {
            throw new NullPointerException("subOpenId为空");
        } else if (Strings.equalsIgnoreCase(req.getMsgType(), Comm.MSGTYPE_TRADE_CREATE) && Strings.isBlank(req.getUserId())) {
            throw new NullPointerException("userId为空");
        } else {
            String json = HttpUtil.post(Comm.UMS_WEBPAY_API_POST_GATEWAY, Json.toJson(req, JsonFormat.compact()));
            if (json.indexOf("errCode") > 0) {
                return Json.fromJson(CreateResp.class, json);
            } else {
                throw new RuntimeException(json);
            }
        }
    }
}