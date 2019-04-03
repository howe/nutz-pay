package org.nutz.pay.util;

import org.nutz.http.*;
import org.nutz.lang.Lang;
import org.nutz.lang.Strings;
import org.nutz.mvc.upload.TempFile;

import java.util.Map;

/**
 * Created by Nutz Team on 2018/12/14
 *
 * @author howechiang
 */
public class HttpUtil {

    /**
     * 普通Get请求
     *
     * @param url
     * @return
     */
    public static String get(String url) {

        try {
            if (Strings.isBlank(url)) {
                throw new Exception("url为空");
            } else if (!Strings.isUrl(url)) {
                throw new Exception("url格式不正确");
            } else {
                return Http.get(url).getContent();
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw Lang.wrapThrow(e);
        }
    }

    /**
     * 普通Post请求
     *
     * @param url
     * @param parms
     * @return
     */

    public static String post(String url, Map<String, Object> parms) {

        try {
            if (Strings.isBlank(url)) {
                throw new Exception("url为空");
            } else if (!Strings.isUrl(url)) {
                throw new Exception("url格式不正确");
            } else if (parms.isEmpty()) {
                throw new Exception("parms为空");
            } else {
                return Http.post(url, parms, Sender.Default_Conn_Timeout);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw Lang.wrapThrow(e);
        }
    }

    /**
     * 普通Post请求
     *
     * @param url
     * @return
     */
    public static String post(String url) {

        try {
            if (Strings.isBlank(url)) {
                throw new Exception("url为空");
            } else if (!Strings.isUrl(url)) {
                throw new Exception("url格式不正确");
            } else {
                return Http.post(url, null, Sender.Default_Conn_Timeout);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw Lang.wrapThrow(e);
        }
    }

    /**
     * 带Header信息的Post请求
     *
     * @param url
     * @param header
     * @param parms
     * @return
     */
    public static String post(String url, Header header, Map<String, Object> parms) {

        try {
            if (Strings.isBlank(url)) {
                throw new Exception("url为空");
            } else if (!Strings.isUrl(url)) {
                throw new Exception("url格式不正确");
            } else if (Lang.isEmpty(header)) {
                throw new Exception("header为空");
            } else if (header.getAll().isEmpty()) {
                throw new Exception("header为空");
            } else if (parms.isEmpty()) {
                throw new Exception("parms为空");
            } else {
                header.set("Content-Type", "application/x-www-form-urlencoded");
                return Sender.create(Request.create(url, Request.METHOD.POST, parms, header))
                        .setTimeout(Sender.Default_Conn_Timeout).setConnTimeout(Sender.Default_Read_Timeout)
                        .send().getContent();
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw Lang.wrapThrow(e);
        }
    }

    /**
     * 带Header信息Get请求
     *
     * @param url
     * @param header
     * @return
     */
    public static String get(String url, Header header) {

        try {
            if (Strings.isBlank(url)) {
                throw new Exception("url为空");
            } else if (!Strings.isUrl(url)) {
                throw new Exception("url格式不正确");
            } else if (Lang.isEmpty(header)) {
                throw new Exception("header为空");
            } else if (header.getAll().isEmpty()) {
                throw new Exception("header为空");
            } else {
                return Http.get(url, header, Sender.Default_Conn_Timeout).getContent();
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw Lang.wrapThrow(e);
        }
    }

    /**
     * Post发送Json请求
     *
     * @param url
     * @param json
     * @return
     */
    public static String post(String url, String json) {
        try {
            if (Strings.isBlank(url)) {
                throw new Exception("url为空");
            } else if (!Strings.isUrl(url)) {
                throw new Exception("url格式不正确");
            } else if (Strings.isEmpty(json)) {
                throw new Exception("json为空");
            } else {
                Request req = Request.create(url, Request.METHOD.POST);
                req.getHeader().set("Content-Type", "application/json;charset=UTF-8");
                req.setData(json);
                Response resp = Sender.create(req).setSSLSocketFactory(Http.nopSSLSocketFactory()).send();
                return resp.getContent();
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw Lang.wrapThrow(e);
        }
    }

    /**
     * Post发送带Header信息的Json请求
     *
     * @param url
     * @param header
     * @param json
     * @return
     */
    public static String post(String url, Header header, String json) {
        try {
            if (Strings.isBlank(url)) {
                throw new Exception("url为空");
            } else if (!Strings.isUrl(url)) {
                throw new Exception("url格式不正确");
            } else if (Lang.isEmpty(header)) {
                throw new Exception("header为空");
            } else if (header.getAll().isEmpty()) {
                throw new Exception("header为空");
            } else if (Strings.isBlank(json)) {
                throw new Exception("json为空");
            } else {
                Request req = Request.create(url, Request.METHOD.POST);
                req.getHeader().set("Content-Type", "application/json;charset=UTF-8");
                req.setHeader(header);
                req.setData(json);
                Response resp = Sender.create(req).setSSLSocketFactory(Http.nopSSLSocketFactory()).send();
                return resp.getContent();
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw Lang.wrapThrow(e);
        }
    }

    /**
     * Post发送Xml请求
     *
     * @param url
     * @param xml
     * @return
     */
    public static String postXml(String url, String xml) {
        try {
            if (Strings.isBlank(url)) {
                throw new Exception("url为空");
            } else if (!Strings.isUrl(url)) {
                throw new Exception("url格式不正确");
            } else if (Lang.isEmpty(xml)) {
                throw new Exception("xml为空");
            } else {
                return Http.postXML(url, xml, Sender.Default_Conn_Timeout).getContent();
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw Lang.wrapThrow(e);
        }
    }

    /**
     * 上传文件
     *
     * @param url
     * @param name
     * @param file
     * @return
     */
    public static String upload(String url, String name, TempFile file) {
        try {
            if (Strings.isBlank(url)) {
                throw new Exception("url为空");
            } else if (!Strings.isUrl(url)) {
                throw new Exception("url格式不正确");
            } else if (Lang.isEmpty(file)) {
                throw new Exception("file为空");
            } else {
                Request req = Request.create(url, Request.METHOD.POST);
                req.getHeader().set("enctype", "multipart/form-data");
                req.getParams().put(Strings.isBlank(name) ? "file" : name, file);
                Response resp = Sender.create(req).setTimeout(Sender.Default_Conn_Timeout).send();
                return resp.getContent();
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw Lang.wrapThrow(e);
        }
    }
}
