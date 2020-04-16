package org.nutz.pay.api.poslink;

import org.nutz.http.Header;
import org.nutz.json.Json;
import org.nutz.json.JsonFormat;
import org.nutz.lang.Lang;
import org.nutz.lang.Strings;
import org.nutz.pay.bean.biz.Dict;
import org.nutz.pay.bean.poslink.req.*;
import org.nutz.pay.bean.poslink.resp.*;
import org.nutz.pay.util.HttpUtil;

/**
 * Copyright 2018 Freshplay Co ltd
 *
 * @author howechiang
 */
public class PoslinkApi {

    /**
     * AccessToken获取
     *
     * @param req
     * @return
     */
    public static GetAccessTokenResp getAccessToken(GetAccessTokenReq req) {

        try {

            if (Strings.isBlank(req.getAppId())) {
                throw new NullPointerException("appId为空");
            } else if (Strings.isBlank(req.getTimestamp())) {
                throw new NullPointerException("timestamp为空");
            } else if (Strings.isBlank(req.getNonce())) {
                throw new NullPointerException("nonce为空");
            } else if (Strings.isBlank(req.getSignature())) {
                throw new NullPointerException("signature为空");
            } else {
                String json = HttpUtil.post(Dict.UMS_TOKEN_API_POST_DEV_GATEWAY, Json.toJson(req, JsonFormat.compact()));
                if (json.indexOf("errCode") > 0) {
                    return Json.fromJson(GetAccessTokenResp.class, json);
                } else {
                    throw new RuntimeException(json);
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    /**
     * 激活终端
     *
     * @param req
     * @return
     */
    public static ActiveterminalResp activeterminal(ActiveterminalReq req) {
        try {
            if (Strings.isBlank(req.getAuthorization())) {
                throw new NullPointerException("authorization为空");
            } else if (Strings.isBlank(req.getMerchantCode())) {
                throw new NullPointerException("merchantCode为空");
            } else if (Strings.isBlank(req.getTerminalCode())) {
                throw new NullPointerException("terminalCode为空");
            } else {
                Header header = Header.create();
                header.set("OPEN-ACCESS-TOKEN AccessToken", req.getAuthorization());
                String json = HttpUtil.post(Dict.UMS_POSLINK_API_POST_GATEWAY + "transaction/activeterminal", header, Json.toJson(req, JsonFormat.compact()));
                if (json.indexOf("errCode") > 0) {
                    return Json.fromJson(ActiveterminalResp.class, json);
                } else {
                    throw new RuntimeException(json);
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    /**
     * 支付
     *
     * @param req
     * @return
     */
    public static PayResp pay(PayReq req) {
        try {
            if (Strings.isBlank(req.getAuthorization())) {
                throw new NullPointerException("authorization为空");
            } else if (Strings.isBlank(req.getMerchantCode())) {
                throw new NullPointerException("merchantCode为空");
            } else if (Strings.isBlank(req.getTerminalCode())) {
                throw new NullPointerException("terminalCode为空");
            } else if (Lang.isEmpty(req.getTransactionAmount())) {
                throw new NullPointerException("transactionAmount为空");
            } else if (!Strings.equalsIgnoreCase(req.getTransactionCurrencyCode(), Dict.POSLINK_TRANSACTIONCURRENCYCODE)) {
                throw new NullPointerException("transactionCurrencyCode只支持" + Dict.POSLINK_TRANSACTIONCURRENCYCODE);
            } else if (Strings.isBlank(req.getMerchantOrderId())) {
                throw new NullPointerException("merchantOrderId为空");
            } else if (Strings.isBlank(req.getMerchantRemark())) {
                throw new NullPointerException("merchantRemark为空");
            } else if (Strings.isBlank(req.getPayMode())) {
                throw new NullPointerException("payMode为空");
            } else if (Strings.isBlank(req.getPayCode())) {
                throw new NullPointerException("payCode为空");
            } else {
                Header header = Header.create();
                header.set("OPEN-ACCESS-TOKEN AccessToken", req.getAuthorization());
                String json = HttpUtil.post(Dict.UMS_POSLINK_API_POST_GATEWAY + "transaction/pay", header, Json.toJson(req, JsonFormat.compact()));
                if (json.indexOf("errCode") > 0) {
                    return Json.fromJson(PayResp.class, json);
                } else {
                    throw new RuntimeException(json);
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    /**
     * 支付冲正
     *
     * @param req
     * @return
     */
    public static ReversepaymentResp reversepayment(ReversepaymentReq req) {
        try {
            if (Strings.isBlank(req.getAuthorization())) {
                throw new NullPointerException("authorization为空");
            } else if (Strings.isBlank(req.getMerchantCode())) {
                throw new NullPointerException("merchantCode为空");
            } else if (Strings.isBlank(req.getTerminalCode())) {
                throw new NullPointerException("terminalCode为空");
            } else if (Lang.isEmpty(req.getTransactionAmount())) {
                throw new NullPointerException("transactionAmount为空");
            } else if (!Strings.equalsIgnoreCase(req.getTransactionCurrencyCode(), Dict.POSLINK_TRANSACTIONCURRENCYCODE)) {
                throw new NullPointerException("transactionCurrencyCode只支持" + Dict.POSLINK_TRANSACTIONCURRENCYCODE);
            } else if (Strings.isBlank(req.getMerchantOrderId())) {
                throw new NullPointerException("merchantOrderId为空");
            } else {
                Header header = Header.create();
                header.set("OPEN-ACCESS-TOKEN AccessToken", req.getAuthorization());
                String json = HttpUtil.post(Dict.UMS_POSLINK_API_POST_GATEWAY + "transaction/reversepayment", header, Json.toJson(req, JsonFormat.compact()));
                if (json.indexOf("errCode") > 0) {
                    return Json.fromJson(ReversepaymentResp.class, json);
                } else {
                    throw new RuntimeException(json);
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    /**
     * 支付撤销
     *
     * @param req
     * @return
     */
    public static VoidpaymentResp voidpayment(VoidpaymentReq req) {
        try {
            if (Strings.isBlank(req.getAuthorization())) {
                throw new NullPointerException("authorization为空");
            } else if (Strings.isBlank(req.getMerchantCode())) {
                throw new NullPointerException("merchantCode为空");
            } else if (Strings.isBlank(req.getTerminalCode())) {
                throw new NullPointerException("terminalCode为空");
            } else if (Strings.isBlank(req.getMerchantOrderId()) && Strings.isBlank(req.getOriginalOrderId())) {
                throw new NullPointerException("merchantOrderId与originalOrderId不能都为空");
            } else {
                Header header = Header.create();
                header.set("OPEN-ACCESS-TOKEN AccessToken", req.getAuthorization());
                String json = HttpUtil.post(Dict.UMS_POSLINK_API_POST_GATEWAY + "transaction/voidpayment", header, Json.toJson(req, JsonFormat.compact()));
                if (json.indexOf("errCode") > 0) {
                    return Json.fromJson(VoidpaymentResp.class, json);
                } else {
                    throw new RuntimeException(json);
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    /**
     * 交易退款
     *
     * @param req
     * @return
     */
    public static RefundResp refund(RefundReq req) {
        try {
            if (Strings.isBlank(req.getAuthorization())) {
                throw new NullPointerException("authorization为空");
            } else if (Strings.isBlank(req.getMerchantCode())) {
                throw new NullPointerException("merchantCode为空");
            } else if (Strings.isBlank(req.getTerminalCode())) {
                throw new NullPointerException("terminalCode为空");
            } else if (Strings.isBlank(req.getMerchantOrderId()) && Strings.isBlank(req.getOriginalOrderId())) {
                throw new NullPointerException("merchantOrderId与originalOrderId不能都为空");
            } else if (Strings.isBlank(req.getRefundRequestId())) {
                throw new NullPointerException("refundRequestId为空");
            } else if (Lang.isEmpty(req.getTransactionAmount())) {
                throw new NullPointerException("transactionAmount为空");
            } else {
                Header header = Header.create();
                header.set("OPEN-ACCESS-TOKEN AccessToken", req.getAuthorization());
                String json = HttpUtil.post(Dict.UMS_POSLINK_API_POST_GATEWAY + "transaction/voidpayment", header, Json.toJson(req, JsonFormat.compact()));
                if (json.indexOf("errCode") > 0) {
                    return Json.fromJson(RefundResp.class, json);
                } else {
                    throw new RuntimeException(json);
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    /**
     * 交易状态查询
     *
     * @param req
     * @return
     */
    public static QueryResp query(QueryReq req) {
        try {
            if (Strings.isBlank(req.getAuthorization())) {
                throw new NullPointerException("authorization为空");
            } else if (Strings.isBlank(req.getMerchantCode())) {
                throw new NullPointerException("merchantCode为空");
            } else if (Strings.isBlank(req.getTerminalCode())) {
                throw new NullPointerException("terminalCode为空");
            } else if (Strings.isBlank(req.getMerchantOrderId()) && Strings.isBlank(req.getOriginalOrderId())) {
                throw new NullPointerException("merchantOrderId与originalOrderId不能都为空");
            } else {
                Header header = Header.create();
                header.set("OPEN-ACCESS-TOKEN AccessToken", req.getAuthorization());
                String json = HttpUtil.post(Dict.UMS_POSLINK_API_POST_GATEWAY + "transaction/query", header, Json.toJson(req, JsonFormat.compact()));
                if (json.indexOf("errCode") > 0) {
                    return Json.fromJson(QueryResp.class, json);
                } else {
                    throw new RuntimeException(json);
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    /**
     * 交易退款查询
     *
     * @param req
     * @return
     */
    public static QueryRefundResp queryRefund(QueryRefundReq req) {
        try {
            if (Strings.isBlank(req.getAuthorization())) {
                throw new NullPointerException("authorization为空");
            } else if (Strings.isBlank(req.getMerchantCode())) {
                throw new NullPointerException("merchantCode为空");
            } else if (Strings.isBlank(req.getTerminalCode())) {
                throw new NullPointerException("terminalCode为空");
            } else if (Strings.isBlank(req.getMerchantOrderId()) && Strings.isBlank(req.getOriginalOrderId())) {
                throw new NullPointerException("merchantOrderId与originalOrderId不能都为空");
            } else if (Strings.isBlank(req.getRefundRequestId())) {
                throw new NullPointerException("refundRequestId为空");
            } else {
                Header header = Header.create();
                header.set("OPEN-ACCESS-TOKEN AccessToken", req.getAuthorization());
                String json = HttpUtil.post(Dict.UMS_POSLINK_API_POST_GATEWAY + "transaction/query-refund", header, Json.toJson(req, JsonFormat.compact()));
                if (json.indexOf("errCode") > 0) {
                    return Json.fromJson(QueryRefundResp.class, json);
                } else {
                    throw new RuntimeException(json);
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
