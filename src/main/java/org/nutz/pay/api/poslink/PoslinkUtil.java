package org.nutz.pay.api.poslink;

import org.nutz.json.Json;
import org.nutz.json.JsonFormat;
import org.nutz.lang.Strings;
import org.nutz.pay.bean.biz.Dict;
import org.nutz.pay.bean.poslink.req.GetAccessTokenReq;
import org.nutz.pay.bean.poslink.resp.GetAccessTokenResp;
import org.nutz.pay.util.HttpUtil;

/**
 * Copyright 2018 Freshplay Co ltd
 *
 * @author howechiang
 */
public class PoslinkUtil {

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
                String json = HttpUtil.post(Dict.UMS_TOKEN_API_POST_GATEWAY, Json.toJson(req, JsonFormat.compact()));
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
}
