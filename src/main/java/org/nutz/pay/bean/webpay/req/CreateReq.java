package org.nutz.pay.bean.webpay.req;

import org.nutz.pay.bean.biz.Good;
import org.nutz.pay.bean.biz.SubOrder;

import java.util.List;

/**
 * 创建支付订单
 * Created by Jianghao on 2018/12/14
 *
 * @howechiang
 */
public class CreateReq extends BaseReq {

    /**
     * 分账标记
     * 选填
     * 暂时只支持微信（WXPay.jsPay）、支付宝
     * （trade.jsPay）支付 和 银联云闪付（acp.jsPay）。
     * 若为true，则goods字段和subOrders字段不能同时为空；且secureTransaction字段上送false或不上送。
     */
    private boolean divisionFlag;

    public boolean isDivisionFlag() {
        return divisionFlag;
    }

    public void setDivisionFlag(boolean divisionFlag) {
        this.divisionFlag = divisionFlag;
    }

    /**
     * 微信子商户appId
     */
    private String subAppId;

    public String getSubAppId() {
        return subAppId;
    }

    public void setSubAppId(String subAppId) {
        this.subAppId = subAppId;
    }

    /**
     * 平台商户分账金额
     * 若分账标记传，则分账金额必传
     * 选填
     */
    private Integer platformAmount;

    public Integer getPlatformAmount() {
        return platformAmount;
    }

    public void setPlatformAmount(Integer platformAmount) {
        this.platformAmount = platformAmount;
    }

    /**
     * 在传分账标记的情况下，若传子商户号，子商户商品金额必传，即goods字段中每个元素中subMerchantId与subOrderAmount不能为空，元素不能超过20个。
     * （goods里所有子商户商品总额要与支付总额totalAmount相等）
     */
    private List<Good> goods;

    public List<Good> getGoods() {
        return goods;
    }

    public void setGoods(List<Good> goods) {
        this.goods = goods;
    }

    /**
     * 在传分账标记的情况下，若传子商户号，子商户分账金额必传，即ubOrders每个元素的mid和totalAmount非空 且 mid不超过20个。
     * （分账方案subOrders里子商户分账总额+platformAmount要与支付总额totalAmount相等）。
     */
    private List<SubOrder> subOrders;

    public List<SubOrder> getSubOrders() {
        return subOrders;
    }

    public void setSubOrders(List<SubOrder> subOrders) {
        this.subOrders = subOrders;
    }

    /**
     * 商户附加数据
     * 选填
     */
    private String attachedData;

    public String getAttachedData() {
        return attachedData;
    }

    public void setAttachedData(String attachedData) {
        this.attachedData = attachedData;
    }

    /**
     * 账单描述
     * 选填
     */
    private String orderDesc;

    public String getOrderDesc() {
        return orderDesc;
    }

    public void setOrderDesc(String orderDesc) {
        this.orderDesc = orderDesc;
    }

    /**
     * 商品标记，用于优惠活动
     * 选填
     */
    private String goodsTag;

    public String getGoodsTag() {
        return goodsTag;
    }

    public void setGoodsTag(String goodsTag) {
        this.goodsTag = goodsTag;
    }

    /**
     * 订单原始金额，单位分，用于记录前端系统打折前的金额
     * 选填
     */
    private Integer originalAmount;

    public Integer getOriginalAmount() {
        return originalAmount;
    }

    public void setOriginalAmount(Integer originalAmount) {
        this.originalAmount = originalAmount;
    }

    /**
     * 支付总金额
     * <p>
     * 单位分
     * 若divisionFlag为true，则：totalAmount = subOrders字段中的所有totalAmount值之和加上 platformAmount值 = goods中的所有subOrderAmount值之和。
     */
    private Integer totalAmount;

    public Integer getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * 支付结果通知地址
     * 选填
     */
    private String notifyUrl;

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    /**
     * 网页跳转地址
     * 选填
     */
    private String returnUrl;

    public String getReturnUrl() {
        return returnUrl;
    }

    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
    }

    /**
     * 系统ID
     * 选填
     */
    private String systemId;

    public String getSystemId() {
        return systemId;
    }

    public void setSystemId(String systemId) {
        this.systemId = systemId;
    }

    /**
     * 商户自己公众号appid下的用户openid，可以通过微信oauth接口获取。必填字段，否则交易可能失败。
     * 必填
     */
    private String subOpenId;

    public String getSubOpenId() {
        return subOpenId;
    }

    public void setSubOpenId(String subOpenId) {
        this.subOpenId = subOpenId;
    }

    /**
     * 实名认证姓名
     * 选填
     * Base64编码
     */
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 实名认证手机号
     * 选填
     * Base64编码
     */
    private String mobile;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * 实名认证证件类型
     * 选填
     * 证件类型，微信支持身份证、支付宝支持身份证：IDENTITY_CARD、护照：PASSPORT、军官证：OFFICER_CARD、士兵证：SOLDIER_CARD、户口本：HOKOU
     */
    private String certType;

    public String getCertType() {
        return certType;
    }

    public void setCertType(String certType) {
        this.certType = certType;
    }

    /**
     * 实名认证证件号
     * 选填
     * Base64编码
     */
    private String certNo;

    public String getCertNo() {
        return certNo;
    }

    public void setCertNo(String certNo) {
        this.certNo = certNo;
    }

    /**
     * 是否需要实名认证
     * 选填
     * 需要实名认证时置为 T
     */
    private String fixBuyer;

    public String getFixBuyer() {
        return fixBuyer;
    }

    public void setFixBuyer(String fixBuyer) {
        this.fixBuyer = fixBuyer;
    }

    /**
     * 是否需要限制信用卡支付
     * 选填
     * 取值：true或false，默认false
     */
    private boolean limitCreditCard;

    public boolean isLimitCreditCard() {
        return limitCreditCard;
    }

    public void setLimitCreditCard(boolean limitCreditCard) {
        this.limitCreditCard = limitCreditCard;
    }

    /**
     * 标识是否是担保交易
     * 选填
     * 取值：true或false，默认false
     * 若上送为true，则交易的金额将会被暂缓结算。
     * 调用担保完成接口后，完成部分金额会在t+1日结算给商户，剩余部分金额退还用户。
     * 调用担保撤销接口，则全部资金退还给用户。
     * 30天后 没有主动调用担保完成 且 没有主动调用担保撤销的交易 将会自动按撤销处理。
     */
    private boolean secureTransaction;

    public boolean isSecureTransaction() {
        return secureTransaction;
    }

    public void setSecureTransaction(boolean secureTransaction) {
        this.secureTransaction = secureTransaction;
    }

    /**
     * 订单过期时间，为空则使用系统默认过期时间（30分钟），格式yyyy-MM-dd HH:mm:ss
     * qmf.webPay :无卡 暂不支持上送expireTime
     */
    private String expireTime;

    public String getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }
}

