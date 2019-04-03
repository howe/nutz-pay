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

    public static String UMS_TOKEN_API_POST_DEV_GATEWAY = "http://58.247.0.18:29015/v1/token/access";
    public static String UMS_TOKEN_API_POST_GATEWAY = "https://api-mop.chinaums.com/v1/token/access";

    public static String UMS_POSLINK_API_POST_DEV_GATEWAY = "http://58.247.0.18:29015/v2/poslink/";
    public static String UMS_POSLINK_API_POST_GATEWAY = "https://api-mop.chinaums.com/v2/poslink/";

    public static final String DATE_FORMART_FULL = "yyyy-MM-dd HH:mm:ss";
    public static final String DATE_FORMART = "yyyy-MM-dd";
    public static final String DATE_FORMART_FULL_BASE = "yyyyMMddHHmmss";

    public static final String POSLINK_TRANSACTIONCURRENCYCODE = "156";

    public static final String POSLINK_TRANSACTIONCURRENCYCODE_E_CASH = "E_CASH";
    public static final String POSLINK_TRANSACTIONCURRENCYCODE_SOUNDWAVE = "SOUNDWAVE";
    public static final String POSLINK_TRANSACTIONCURRENCYCODE_NFC = "NFC";
    public static final String POSLINK_TRANSACTIONCURRENCYCODE_CODE_SCAN = "CODE_SCAN";
    public static final String POSLINK_TRANSACTIONCURRENCYCODE_MANUAL = "MANUAL";

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

    /**
     * 微信图标
     */
    public static String QRCODE_PAY_ICON_WEIXIN = "weixin.png";
    /**
     * 支付宝图标
     */
    public static String QRCODE_PAY_ICON_ALIPAY = "alipay.png";
    /**
     * 银联图标
     */
    public static String QRCODE_PAY_ICON_UNIONPAY = "unionpay.png";
}
