package org.nutz.pay.util;

import org.nutz.lang.Encoding;
import org.nutz.lang.Lang;
import org.nutz.lang.Strings;
import org.nutz.lang.util.NutMap;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Nutz Team on 2018/12/14
 *
 * @author howechiang
 */
public class Util {

    /**
     * 签名
     * <p>
     *
     * @param params   待签名字符串
     * @param key      加密钥
     * @param signType 加密方式
     * @return 签名
     */
    public static String getSign(NutMap params, String key, String signType, String signName) {

        try {
            if (Lang.isEmpty(params)) {
                throw new NullPointerException("待签名字符串为空");

            } else if (Strings.isBlank(key)) {
                throw new NullPointerException("加密钥为空");
            } else {
                if (Strings.equalsIgnoreCase(signType, "HMAC-SHA256")) {
                    return Lang.sha256(Util.buildParmas(params, new String[]{signName}) + key);
                } else {
                    return Lang.md5(Util.buildParmas(params, new String[]{signName}) + key).toUpperCase();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw Lang.wrapThrow(e);
        }
    }

    /**
     * 校验签名
     * <p>
     *
     * @param params 待签名字符串
     * @param key    加密钥
     * @return 结果
     */
    public static Boolean checkSign(NutMap params, String key, String signType, String signName) {

        String sign = params.getString("sign");
        if (Lang.isEmpty(params) || Strings.isBlank(key)) {
            return false;
        } else {
            if (Strings.equalsIgnoreCase(signType, "SHA256")) {
                if (Strings.equalsIgnoreCase(Lang.sha256(Util.buildParmas(params, new String[]{signName}) + key), sign)) {
                    return true;
                } else {
                    return false;
                }
            } else {
                if (Strings.equalsIgnoreCase(Lang.md5(Util.buildParmas(params, new String[]{signName}) + key), sign)) {
                    return true;
                } else {
                    return false;
                }
            }
        }
    }

    /**
     * Map排序
     * <p>
     *
     * @param params 待排序对象
     * @param order  排序方式
     * @return 排序后的对象
     */
    public static Map<String, Object> sorting(Map<String, Object> params, String order) {

        if (Lang.isEmpty(params)) {
            return null;
        } else {
            Map<String, Object> map = new LinkedHashMap<>();
            if (Strings.equalsIgnoreCase(order, "desc")) {
                params.entrySet().stream()
                        .sorted(Map.Entry.<String, Object>comparingByKey().reversed())
                        .forEachOrdered(x -> map.put(x.getKey(), x.getValue()));
            } else {
                params.entrySet().stream()
                        .sorted(Map.Entry.comparingByKey())
                        .forEachOrdered(x -> map.put(x.getKey(), x.getValue()));
            }
            return map;
        }
    }

    /**
     * 构建参数
     * <p>
     *
     * @param params 待构建的map
     * @param f      过滤字段
     * @return 构建过的字符串
     */
    public static String buildParmas(Map<String, Object> params, String[] f) {

        if (Lang.isEmpty(f)) {
            return buildParmas(params);
        } else {
            Arrays.asList(f).stream().forEach(params::remove);
            return buildParmas(params);
        }
    }

    /**
     * 构建参数
     * <p>
     *
     * @param params 待构建的map
     * @return 构建过的字符串
     */
    public static String buildParmas(Map<String, Object> params) {

        if (Lang.isEmpty(params)) {
            return null;
        } else {
            params = Util.sorting(params, "asc");
            StringBuffer sb = new StringBuffer();
            params.forEach((k, v) -> {
                if (!Lang.isEmpty(v)) {
                    sb.append(k + "=" + v + "&");
                }
            });
            return Strings.removeLast(sb.toString().replaceAll("$package", "package")
                    .replaceAll(" , ", ",").replaceAll(" ,", ",")
                    .replaceAll(", ", ","), '&');
        }
    }

    /**
     * URL转解码
     */
    public static class Url {
        /**
         * 加密
         * <p>
         *
         * @param s
         * @return
         */
        public static String encode(String s) {
            if (Strings.isBlank(s)) {
                throw new NullPointerException("s加密对象为空");
            } else {
                try {
                    return URLEncoder.encode(s, Encoding.UTF8);
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                    throw Lang.wrapThrow(e);
                }
            }
        }

        /**
         * 解密
         * <p>
         *
         * @param s
         * @return
         */
        public static String decode(String s) {
            if (Strings.isBlank(s)) {
                throw new NullPointerException("s解密对象为空");
            } else {
                try {
                    return URLDecoder.decode(s, Encoding.UTF8);
                } catch (Exception e) {
                    e.printStackTrace();
                    throw Lang.wrapThrow(e);
                }
            }
        }
    }

    /**
     * BASE64加解密
     */
    public static class Base64 {

        /**
         * 加密
         * <p>
         *
         * @param s
         * @return
         */
        public static String encode(String s) {
            try {
                if (Strings.isBlank(s)) {
                    throw new NullPointerException("s加密对象为空");
                } else {
                    return org.nutz.repo.Base64.encodeToString(s.getBytes(Encoding.CHARSET_UTF8), true);
                }
            } catch (Exception e) {
                e.printStackTrace();
                throw Lang.wrapThrow(e);
            }
        }

        /**
         * 解密
         * <p>
         *
         * @param s
         * @return
         */
        public static String decode(String s) {
            try {
                if (Strings.isBlank(s)) {
                    throw new NullPointerException("s解密对象为空");
                } else {
                    return new String(org.nutz.repo.Base64.decode(s));
                }
            } catch (Exception e) {
                e.printStackTrace();
                throw Lang.wrapThrow(e);
            }
        }
    }
}
