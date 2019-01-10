package org.nutz.pay.api.bills;

import org.nutz.json.Json;
import org.nutz.json.JsonFormat;
import org.nutz.lang.Strings;
import org.nutz.pay.bean.bills.req.GetQRCodeReq;
import org.nutz.pay.bean.bills.resp.GetQRCodeResp;
import org.nutz.pay.bean.biz.Dict;
import org.nutz.pay.util.HttpUtil;

/**
 * Copyright 2018 Freshplay Co ltd
 *
 * @author howechiang
 */
public class BillsUtil {

    /**
     * 获取二维码
     *
     * @param req
     * @return
     */
    public static GetQRCodeResp getQRCode(GetQRCodeReq req) {

        if (Strings.isBlank(req.getMsgSrc())) {
            throw new NullPointerException("msgSrc为空");
        } else if (Strings.isBlank(req.getRequestTimestamp())) {
            throw new NullPointerException("requestTimestamp为空");
        } else if (Strings.isBlank(req.getMid())) {
            throw new NullPointerException("mid为空");
        } else if (Strings.isBlank(req.getTid())) {
            throw new NullPointerException("tid为空");
        } else if (Strings.isBlank(req.getInstMid())) {
            throw new NullPointerException("instMid为空");
        } else if (!Strings.equalsIgnoreCase(req.getMsgType(), "bills.getQRCode")) {
            throw new NullPointerException("msgType错误");
        } else if (Strings.isBlank(req.getSignType())) {
            throw new NullPointerException("signType为空");
        } else if (Strings.isBlank(req.getSign())) {
            throw new NullPointerException("sign为空");
        } else {
            String json = HttpUtil.post(Dict.UMS_WEBPAY_API_POST_DEV_GATEWAY, Json.toJson(req, JsonFormat.compact()));
            System.out.println(json);
            if (json.indexOf("errCode") > 0) {
                return Json.fromJson(GetQRCodeResp.class, json);
            } else {
                throw new RuntimeException(json);
            }
        }
    }
}
