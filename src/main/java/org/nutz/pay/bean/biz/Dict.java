package org.nutz.pay.bean.biz;

/**
 * Created by Jianghao on 2018/12/31
 *
 * @@author Freshplay Inc.
 */
public class Dict {

    public static String UMS_WEBPAY_API_GET_GATEWAY = "https://qr.chinaums.com/netpay-portal/webpay/pay.do";
    public static String UMS_WEBPAY_API_GET_DEV_GATEWAY = "https://qr-test2.chinaums.com/netpay-portal/webpay/pay.do";
    public static String UMS_WEBPAY_API_POST_GATEWAY = "https://qr.chinaums.com/netpay-route-server/api/";
    public static String UMS_WEBPAY_API_POST_DEV_GATEWAY = "https://qr-test2.chinaums.com/netpay-route-server/api/";

    public static String UMS_QR_API_POST_GATEWAY = "https://qr.chinaums.com/bills/qrCode.do";
    public static String UMS_QR_API_POST_DEV_GATEWAY = "https://qr-test2.chinaums.com/bills/qrCode.do";


    /**
     * 微信公众号支付
     */
    public static String MSGTYPE_WXPAY_JSPAY = "WXPay.jsPay";
    /**
     * 支付宝
     */
    public static String MSGTYPE_TRADE_JSPAY = "trade.jsPay";
    /**
     * 全民付
     */
    public static String MSGTYPE_QMF_JSPAY = "qmf.jspay";
    /**
     * 无卡
     */
    public static String MSGTYPE_QMF_WEBPAY = "qmf.webPay";
    /**
     * 银联云闪付
     */
    public static String MSGTYPE_ACP_JSPAY = "acp.jsPay";

    /**
     * 微信小程序支付
     */
    public static String MSGTYPE_WX_UNIFIEDORDER = "wx.unifiedOrder";

    /**
     * MD5加密
     */
    public static String SIGNTYPE_MD5 = "MD5";

    /**
     * SHA256加密
     */
    public static String SIGNTYPE_SHA256 = "SHA256";

    /**
     * 身份证
     */
    public static String CERTTYPE_IDENTITY_CARD = "IDENTITY_CARD";

    /**
     * 护照
     */
    public static String CERTTYPE_PASSPORT = "PASSPORT";

    /**
     * 军官证
     */
    public static String CERTTYPE_OFFICER_CARD = "OFFICER_CARD";

    /**
     * 士兵证
     */
    public static String CERTTYPE_SOLDIER_CARD = "SOLDIER_CARD";

    /**
     * 户口本
     */
    public static String CERTTYPE_HUKOU = "HUKOU";
}
