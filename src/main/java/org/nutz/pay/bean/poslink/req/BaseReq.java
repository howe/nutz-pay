package org.nutz.pay.bean.poslink.req;

import java.io.Serializable;

/**
 * Copyright 2018 Freshplay Co ltd
 *
 * @author howechiang
 */
public class BaseReq implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 认证内容
     */
    private String authorization;

    public String getAuthorization() {
        return authorization;
    }

    public void setAuthorization(String authorization) {
        this.authorization = authorization;
    }

    /**
     * 商户号
     */
    private String merchantCode;

    public String getMerchantCode() {
        return merchantCode;
    }

    public void setMerchantCode(String merchantCode) {
        this.merchantCode = merchantCode;
    }

    /**
     * 终端号
     */
    private String terminalCode;

    public String getTerminalCode() {
        return terminalCode;
    }

    public void setTerminalCode(String terminalCode) {
        this.terminalCode = terminalCode;
    }
}
