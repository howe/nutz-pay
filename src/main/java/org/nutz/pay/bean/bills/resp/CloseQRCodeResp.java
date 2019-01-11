package org.nutz.pay.bean.bills.resp;

/**
 * Copyright 2018 Freshplay Co ltd
 *
 * @author howechiang
 */
public class CloseQRCodeResp extends BaseResp {

    /**
     * 二维码ID
     */
    private String qrCodeId;

    public String getQrCodeId() {
        return qrCodeId;
    }

    public void setQrCodeId(String qrCodeId) {
        this.qrCodeId = qrCodeId;
    }
}
