package org.nutz.pay.bean.bills.req;

/**
 * Copyright 2018 Freshplay Co ltd
 *
 * @author howechiang
 */
public class CloseQRCodeReq extends BaseReq {

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

    /**
     * 是否关闭二维码的同时发起退货
     */
    private boolean attachRefund;

    public boolean isAttachRefund() {
        return attachRefund;
    }

    public void setAttachRefund(boolean attachRefund) {
        this.attachRefund = attachRefund;
    }

    public CloseQRCodeReq(){
        this.setMsgType("bills.closeQRCode");
    }
}
