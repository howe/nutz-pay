package org.nutz.pay.bean.bills.resp;

/**
 * Copyright 2018 Freshplay Co ltd
 *
 * @author howechiang
 */
public class CreateResp extends BaseResp {

    /**
     * 账单号，原样返回
     */
    private String billNo;

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }

    /**
     * 账单日期，原样返回
     */
    private String billDate;

    public String getBillDate() {
        return billDate;
    }

    public void setBillDate(String billDate) {
        this.billDate = billDate;
    }

    /**
     * 账单二维码
     */
    private String billQRCode;

    public String getBillQRCode() {
        return billQRCode;
    }

    public void setBillQRCode(String billQRCode) {
        this.billQRCode = billQRCode;
    }

    /**
     * 二维码地址
     */
    private String billQRCodeUrl;

    public String getBillQRCodeUrl() {
        return billQRCodeUrl;
    }

    public void setBillQRCodeUrl(String billQRCodeUrl) {
        this.billQRCodeUrl = billQRCodeUrl;
    }
}