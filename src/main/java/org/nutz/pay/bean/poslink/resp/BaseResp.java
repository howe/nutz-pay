package org.nutz.pay.bean.poslink.resp;

import java.io.Serializable;

/**
 * Copyright 2018 Freshplay Co ltd
 *
 * @author howechiang
 */
public class BaseResp implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 错误代码
     * 0000为成功
     */
    private String errCode;

    public String getErrCode() {
        return errCode;
    }

    public void setErrCode(String errCode) {
        this.errCode = errCode;
    }

    /**
     * 错误说明
     */
    public String errInfo;

    public String getErrInfo() {
        return errInfo;
    }

    public void setErrInfo(String errInfo) {
        this.errInfo = errInfo;
    }
}
