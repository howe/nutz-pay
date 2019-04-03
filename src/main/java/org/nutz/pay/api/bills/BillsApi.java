package org.nutz.pay.api.bills;

import org.nutz.json.Json;
import org.nutz.json.JsonFormat;
import org.nutz.lang.Lang;
import org.nutz.lang.Strings;
import org.nutz.pay.bean.bills.req.*;
import org.nutz.pay.bean.bills.resp.*;
import org.nutz.pay.bean.biz.Dict;
import org.nutz.pay.util.HttpUtil;

/**
 * Copyright 2018 Freshplay Co ltd
 *
 * @author howechiang
 */
public class BillsApi {

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
        } else if (Lang.isEmpty(req.getTotalAmount())) {
            throw new NullPointerException("totalAmount为空");
        } else if (Strings.isBlank(req.getSign())) {
            throw new NullPointerException("sign为空");
        } else {
            String json = HttpUtil.post(Dict.UMS_WEBPAY_API_POST_GATEWAY, Json.toJson(req, JsonFormat.compact()));
            if (json.indexOf("errCode") > 0) {
                return Json.fromJson(GetQRCodeResp.class, json);
            } else {
                throw new RuntimeException(json);
            }
        }
    }

    /**
     * 更新二维码
     *
     * @param req
     * @return
     */
    public static UpdateQRCodeResp updateQRCode(UpdateQRCodeReq req) {

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
        } else if (!Strings.equalsIgnoreCase(req.getMsgType(), "bills.updateQRCode")) {
            throw new NullPointerException("msgType错误");
        } else if (Strings.isBlank(req.getSignType())) {
            throw new NullPointerException("signType为空");
        } else if (Lang.isEmpty(req.getTotalAmount())) {
            throw new NullPointerException("totalAmount为空");
        } else if (Strings.isBlank(req.getSign())) {
            throw new NullPointerException("sign为空");
        } else {
            String json = HttpUtil.post(Dict.UMS_WEBPAY_API_POST_GATEWAY, Json.toJson(req, JsonFormat.compact()));
            if (json.indexOf("errCode") > 0) {
                return Json.fromJson(UpdateQRCodeResp.class, json);
            } else {
                throw new RuntimeException(json);
            }
        }
    }

    /**
     * 关闭二维码
     *
     * @param req
     * @return
     */
    public static CloseQRCodeResp closeQRCode(CloseQRCodeReq req) {
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
        } else if (!Strings.equalsIgnoreCase(req.getMsgType(), "bills.closeQRCode")) {
            throw new NullPointerException("msgType错误");
        } else if (Strings.isBlank(req.getQrCodeId())) {
            throw new NullPointerException("qrCodeId为空");
        } else if (Strings.isBlank(req.getSignType())) {
            throw new NullPointerException("signType为空");
        } else if (Strings.isBlank(req.getSign())) {
            throw new NullPointerException("sign为空");
        } else {
            String json = HttpUtil.post(Dict.UMS_WEBPAY_API_POST_GATEWAY, Json.toJson(req, JsonFormat.compact()));
            if (json.indexOf("errCode") > 0) {
                return Json.fromJson(CloseQRCodeResp.class, json);
            } else {
                throw new RuntimeException(json);
            }
        }
    }

    /**
     * 账单状态查询
     *
     * @param req
     * @return
     */
    public static QueryResp query(QueryReq req) {
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
        } else if (!Strings.equalsIgnoreCase(req.getMsgType(), "bills.query")) {
            throw new NullPointerException("msgType错误");
        } else if (Strings.isBlank(req.getBillNo())) {
            throw new NullPointerException("billNo为空");
        } else if (Strings.isBlank(req.getBillDate())) {
            throw new NullPointerException("billDate为空");
        } else if (Strings.isBlank(req.getSignType())) {
            throw new NullPointerException("signType为空");
        } else if (Strings.isBlank(req.getSign())) {
            throw new NullPointerException("sign为空");
        } else {
            String json = HttpUtil.post(Dict.UMS_WEBPAY_API_POST_GATEWAY, Json.toJson(req, JsonFormat.compact()));
            if (json.indexOf("errCode") > 0) {
                return Json.fromJson(QueryResp.class, json);
            } else {
                throw new RuntimeException(json);
            }
        }
    }

    /**
     * 退款
     *
     * @param req
     * @return
     */
    public static RefundResp refund(RefundReq req) {
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
        } else if (!Strings.equalsIgnoreCase(req.getMsgType(), "bills.refund")) {
            throw new NullPointerException("msgType错误");
        } else if (Strings.isBlank(req.getBillNo())) {
            throw new NullPointerException("billNo为空");
        } else if (Strings.isBlank(req.getBillDate())) {
            throw new NullPointerException("billDate为空");
        } else if (Strings.isBlank(req.getSignType())) {
            throw new NullPointerException("signType为空");
        } else if (Strings.isBlank(req.getSign())) {
            throw new NullPointerException("sign为空");
        } else if (Strings.isBlank(req.getRefundOrderId())) {
            throw new NullPointerException("refundOrderId为空");
        } else if (Lang.isEmpty(req.getRefundAmount())) {
            throw new NullPointerException("refundAmount为空");
        } else if (Strings.isBlank(req.getSign())) {
            throw new NullPointerException("sign为空");
        } else {
            String json = HttpUtil.post(Dict.UMS_WEBPAY_API_POST_GATEWAY, Json.toJson(req, JsonFormat.compact()));
            if (json.indexOf("errCode") > 0) {
                return Json.fromJson(RefundResp.class, json);
            } else {
                throw new RuntimeException(json);
            }
        }
    }

    /**
     * 查询二维码静态信息
     *
     * @param req
     * @return
     */
    public static QueryQRCodeInfoResp queryQRCodeInfo(QueryQRCodeInfoReq req) {
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
        } else if (!Strings.equalsIgnoreCase(req.getMsgType(), "bills.queryQRCodeInfo")) {
            throw new NullPointerException("msgType错误");
        } else if (Strings.isBlank(req.getQrCodeId())) {
            throw new NullPointerException("qrCodeId为空");
        } else if (Strings.isBlank(req.getSignType())) {
            throw new NullPointerException("signType为空");
        } else if (Strings.isBlank(req.getSign())) {
            throw new NullPointerException("sign为空");
        } else if (Strings.isBlank(req.getSign())) {
            throw new NullPointerException("sign为空");
        } else {
            String json = HttpUtil.post(Dict.UMS_WEBPAY_API_POST_GATEWAY, Json.toJson(req, JsonFormat.compact()));
            if (json.indexOf("errCode") > 0) {
                return Json.fromJson(QueryQRCodeInfoResp.class, json);
            } else {
                throw new RuntimeException(json);
            }
        }
    }

    /**
     * 担保撤销
     *
     * @param req
     * @return
     */
    public static SecureCancelResp secureCancel(SecureCancelReq req) {
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
        } else if (!Strings.equalsIgnoreCase(req.getMsgType(), "bills.secureCancel")) {
            throw new NullPointerException("msgType错误");
        } else if (Strings.isBlank(req.getMerOrderId())) {
            throw new NullPointerException("merOrderId为空");
        } else if (Strings.isBlank(req.getSignType())) {
            throw new NullPointerException("signType为空");
        } else if (Strings.isBlank(req.getSign())) {
            throw new NullPointerException("sign为空");
        } else if (Strings.isBlank(req.getSign())) {
            throw new NullPointerException("sign为空");
        } else {
            String json = HttpUtil.post(Dict.UMS_WEBPAY_API_POST_GATEWAY, Json.toJson(req, JsonFormat.compact()));
            if (json.indexOf("errCode") > 0) {
                return Json.fromJson(SecureCancelResp.class, json);
            } else {
                throw new RuntimeException(json);
            }
        }
    }

    /**
     * 担保完成
     *
     * @param req
     * @return
     */
    public static SecureCompleteResp secureComplete(SecureCompleteReq req) {
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
        } else if (!Strings.equalsIgnoreCase(req.getMsgType(), "bills.secureComplete")) {
            throw new NullPointerException("msgType错误");
        } else if (Strings.isBlank(req.getMerOrderId())) {
            throw new NullPointerException("merOrderId为空");
        } else if (Strings.isBlank(req.getSignType())) {
            throw new NullPointerException("signType为空");
        } else if (Lang.isEmpty(req.getCompletedAmount())) {
            throw new NullPointerException("completedAmount为空");
        } else if (Strings.isBlank(req.getSign())) {
            throw new NullPointerException("sign为空");
        } else if (Strings.isBlank(req.getSign())) {
            throw new NullPointerException("sign为空");
        } else {
            String json = HttpUtil.post(Dict.UMS_WEBPAY_API_POST_GATEWAY, Json.toJson(req, JsonFormat.compact()));
            if (json.indexOf("errCode") > 0) {
                return Json.fromJson(SecureCompleteResp.class, json);
            } else {
                throw new RuntimeException(json);
            }
        }
    }
}
