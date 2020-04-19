import org.junit.Test;
import org.nutz.json.Json;
import org.nutz.lang.Lang;
import org.nutz.lang.Times;
import org.nutz.lang.random.R;
import org.nutz.pay.api.bills.BillsApi;
import org.nutz.pay.bean.bills.req.GetQRCodeReq;
import org.nutz.pay.util.Util;

/**
 * Copyright 2018 Freshplay Co ltd
 *
 * @author howechiang
 */
public class BillsTest {

    protected static String APPID = "f0ec96ad2c3848b5b810e7aadf369e2f";
    protected static String APPKEY = "775481e2556e4564985f5439a5e6a277";
    protected static String MERCHANTCODE = "123456789900081";
    protected static String TERMINALCODE = "00810001";
    protected static String ACCESSTOKEN = "b602fd01d67d4f0b9e9d25f0e9077a23";

    protected static String mid = "898340149000005";
    protected static String tid = "88880001";
    protected static String instMid = "QRPAYDEFAULT";
    protected static String msgSrc = "WWW.TEST.COM";
    protected static String msgSrcId = "3194";
    protected static String key = "fcAmtnx7MwismjWNhNKdHC44mNXtnEQeJkRrhKJwyrW2ysRR";

    @Test
    public void getQRCode(){

        GetQRCodeReq req = new GetQRCodeReq();
        req.setBillDate(Times.format("yyyy-MM-dd", Times.now()));
        req.setBillNo(R.UU32());
        req.setTid(tid);
        req.setMsgType("bills.getQRCode");
        req.setMid(mid);
        req.setInstMid(instMid);
        req.setRequestTimestamp(Times.getNowSDT());
        req.setMsgSrc(msgSrc);
        req.setMsgId(msgSrcId);
        req.setExpireTime(Times.format("yyyy-MM-dd HH:mm:ss", Times.nextMinute(Times.now(), 10)));
        req.setTotalAmount(1);
        req.setSignType("MD5");
        req.setSign(Util.getSign(Lang.obj2nutmap(req), key, "MD5", "sign"));
        System.out.println(Json.toJson(req));
        System.out.println(Json.toJson(BillsApi.getQRCode(req)));
    }
}
