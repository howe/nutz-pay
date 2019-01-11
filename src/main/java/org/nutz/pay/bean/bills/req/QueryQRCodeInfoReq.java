package org.nutz.pay.bean.bills.req;

/**
 * Copyright 2018 Freshplay Co ltd
 *
 * @author howechiang
 */
public class QueryQRCodeInfoReq extends BaseReq {

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

    public QueryQRCodeInfoReq(){
        this.setMsgType("bills.queryQRCodeInfo");
    }
}
