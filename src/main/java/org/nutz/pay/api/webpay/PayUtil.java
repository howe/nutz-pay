package org.nutz.pay.api.webpay;

import org.nutz.lang.Lang;
import org.nutz.lang.Strings;
import org.nutz.pay.bean.biz.Dict;
import org.nutz.pay.bean.webpay.req.CreateReq;
import org.nutz.pay.util.Util;

/**
 * Created by Jianghao on 2018/12/31
 *
 * @@author Freshplay Inc.
 */
public class PayUtil {

    /**
     * 下单请求
     *
     * @param req
     * @return 跳转地址
     */
    public static String create(CreateReq req) {
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
        } else {
            return Dict.UMS_WEBPAY_API_GET_GATEWAY + "?" + Util.buildParmas(Lang.obj2map(req));
        }
    }
}
