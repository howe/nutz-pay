import org.junit.Test;
import org.nutz.json.Json;
import org.nutz.json.JsonFormat;
import org.nutz.lang.Times;
import org.nutz.lang.random.R;
import org.nutz.pay.api.poslink.PoslinkApi;
import org.nutz.pay.bean.biz.Comm;
import org.nutz.pay.bean.poslink.req.ActiveterminalReq;
import org.nutz.pay.bean.poslink.req.GetAccessTokenReq;
import org.nutz.pay.bean.poslink.req.PayReq;
import org.nutz.pay.util.Util;

/**
 * Copyright 2018 Freshplay Co ltd
 *
 * @author howechiang
 */
public class PoslinkTest {

    protected static String APPID = "f0ec96ad2c3848b5b810e7aadf369e2f";
    protected static String APPKEY = "775481e2556e4564985f5439a5e6a277";
    protected static String MERCHANTCODE = "123456789900081";
    protected static String TERMINALCODE = "00810001";
    protected static String ACCESSTOKEN = "b602fd01d67d4f0b9e9d25f0e9077a23";

//    {
//        "accessToken": "ac4559fd11134896abbce0363dec9dec",
//        "expiresIn": 3600,
//        "errCode": "0000",
//        "errInfo": "正常"
//    }
    @Test
    public void getAccessToken(){
        GetAccessTokenReq req = new GetAccessTokenReq();
        req.setAppId(APPID);
        req.setNonce(R.UU64());
        req.setTimestamp(Times.format(Comm.DATE_FORMART_FULL_BASE, Times.now()));
        req.setSignature(Util.getSign(req, APPKEY));
        System.out.println(Json.toJson(req, JsonFormat.compact()));
        System.out.println(Json.toJson(PoslinkApi.getAccessToken(req)));
    }

    @Test
    public void activeterminal(){
        ActiveterminalReq req = new ActiveterminalReq();
        req.setMerchantCode(MERCHANTCODE);
        req.setAuthorization(ACCESSTOKEN);
        req.setTerminalCode(TERMINALCODE);
        System.out.println(Json.toJson(req, JsonFormat.compact()));
        System.out.println(Json.toJson(PoslinkApi.activeterminal(req)));
    }

    @Test
    public void pay(){
        PayReq req = new PayReq();
        req.setAuthorization(ACCESSTOKEN);
        req.setTerminalCode(TERMINALCODE);
        req.setMerchantCode(MERCHANTCODE);
        req.setTransactionAmount(1);
        req.setTransactionCurrencyCode(Comm.POSLINK_TRANSACTIONCURRENCYCODE);
        req.setMerchantOrderId(R.captchaNumber(10));
        req.setMerchantRemark("测试");
        req.setPayMode(Comm.POSLINK_TRANSACTIONCURRENCYCODE_CODE_SCAN);
        req.setPayCode("134618135488267319");
        System.out.println(Json.toJson(req, JsonFormat.compact()));
        System.out.println(Json.toJson(PoslinkApi.pay(req)));
    }
}
