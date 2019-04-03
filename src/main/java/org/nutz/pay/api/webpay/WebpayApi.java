package org.nutz.pay.api.webpay;

import org.nutz.img.Images;
import org.nutz.json.Json;
import org.nutz.json.JsonFormat;
import org.nutz.lang.Lang;
import org.nutz.lang.Strings;
import org.nutz.pay.bean.biz.Dict;
import org.nutz.pay.bean.webpay.req.*;
import org.nutz.pay.bean.webpay.resp.*;
import org.nutz.pay.util.HttpUtil;
import org.nutz.pay.util.Util;
import org.nutz.qrcode.QRCode;
import org.nutz.qrcode.QRCodeFormat;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.util.Base64;

/**
 * Created by Jianghao on 2018/12/31
 *
 * @@author Freshplay Inc.
 */
public class WebpayApi {

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
        } else if (Lang.isEmpty(req.getTotalAmount())) {
            throw new NullPointerException("totalAmount为空");
        } else if (Strings.isBlank(req.getSubOpenId())) {
            throw new NullPointerException("subOpenId为空");
        } else {
            return Dict.UMS_WEBPAY_API_GET_GATEWAY + "?" + Util.buildParmas(Lang.obj2map(req));
        }
    }

    /**
     * 查询订单
     *
     * @param req
     * @return
     */
    public static QueryResp query(QueryReq req) {
        if (Strings.isBlank(req.getMsgSrc())) {
            throw new NullPointerException("msgSrc为空");
        } else if (Strings.isBlank(req.getRequestTimestamp())) {
            throw new NullPointerException("requestTimestamp为空");
        } else if (!Strings.equalsIgnoreCase(req.getMsgType(), "query")) {
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
        } else if (!Strings.equalsIgnoreCase(req.getMsgType(), "secureCancel")) {
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
        } else if (!Strings.equalsIgnoreCase(req.getMsgType(), "secureComplete")) {
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
        } else if (Lang.isEmpty(req.getCompletedAmount())) {
            throw new NullPointerException("completedAmount为空");
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

    /**
     * 订单退款
     *
     * @param req
     * @return
     */
    public static RefundResp refund(RefundReq req) {
        if (Strings.isBlank(req.getMsgSrc())) {
            throw new NullPointerException("msgSrc为空");
        } else if (Strings.isBlank(req.getRequestTimestamp())) {
            throw new NullPointerException("requestTimestamp为空");
        } else if (!Strings.equalsIgnoreCase(req.getMsgType(), "refund")) {
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
     * 订单关闭
     *
     * @param req
     * @return
     */
    public static CloseResp close(CloseReq req) {
        if (Strings.isBlank(req.getMsgSrc())) {
            throw new NullPointerException("msgSrc为空");
        } else if (Strings.isBlank(req.getRequestTimestamp())) {
            throw new NullPointerException("requestTimestamp为空");
        } else if (!Strings.equalsIgnoreCase(req.getMsgType(), "close")) {
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
        } else {
            String json = HttpUtil.post(Dict.UMS_WEBPAY_API_POST_GATEWAY, Json.toJson(req, JsonFormat.compact()));
            if (json.indexOf("errCode") > 0) {
                return Json.fromJson(CloseResp.class, json);
            } else {
                throw new RuntimeException(json);
            }
        }
    }

    /**
     * 在原有下单功能上改造成创建支付二维码
     *
     * @param req
     * @return
     */
    public static String createQRCode(CreateQRReq req) {
        try {
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
            } else if (Strings.isBlank(req.getSubOpenId())) {
                throw new NullPointerException("subOpenId为空");
            } else {
                QRCodeFormat format = QRCodeFormat.NEW();
                format.setSize(Lang.isEmpty(req.getSize()) ? 250 : req.getSize())
                        .setEncode("UTF-8")
                        .setErrorCorrectionLevel('H')
                        .setForeGroundColor("#000000")
                        .setBackGroundColor("#FFFFFF")
                        .setImageFormat("jpg")
                        .setMargin(1)
                        .setIcon(Images.read(WebpayApi.class.getClassLoader().getResourceAsStream(req.getIconName())));
                BufferedImage image = QRCode.toQRCode(Dict.UMS_WEBPAY_API_GET_GATEWAY + "?" + Util.buildParmas(Lang.obj2map(req)), format);
                ByteArrayOutputStream bos = new ByteArrayOutputStream();
                ImageIO.write(image, "jpg", bos);
                byte[] imageBytes = bos.toByteArray();
                Base64.Encoder encoder = Base64.getEncoder();
                String imageString = encoder.encodeToString(imageBytes);
                bos.close();
                return "data:image/jpeg;base64," + imageString;
            }
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
