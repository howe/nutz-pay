package org.nutz.pay.api.h5pay;

import org.nutz.lang.Lang;
import org.nutz.lang.Strings;
import org.nutz.pay.bean.biz.Comm;
import org.nutz.pay.bean.h5pay.req.PayReq;
import org.nutz.pay.util.Util;

/**
 * Copyright 2018 Freshplay Co ltd
 *
 * @author howechiang
 */
public class H5payApi {

    /**
     * 下单
     *
     * @param req
     * @return
     */
    public static String pay(PayReq req) {
        if (Strings.isBlank(req.getMsgSrc())) {
            throw new NullPointerException("msgSrc为空");
        } else if (Strings.isBlank(req.getRequestTimestamp())) {
            throw new NullPointerException("requestTimestamp为空");
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
        } else if (Strings.equalsIgnoreCase(req.getMsgType(), Comm.MSGTYPE_WXPAY_H5PAY) && Strings.isBlank(req.getSceneType()) && Strings.isBlank(req.getMerAppId()) && Strings.isBlank(req.getMerAppName())) {
            throw new NullPointerException("缺少微信H5参数");
        } else {
            return Comm.UMS_WEBPAY_API_GET_GATEWAY + "?" + Util.buildParmas(Lang.obj2map(req));
        }
    }
}
