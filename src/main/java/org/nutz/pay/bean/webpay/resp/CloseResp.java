package org.nutz.pay.bean.webpay.resp;

/**
 * Created by Jianghao on 2019/1/9
 *
 * @@author Freshplay Inc.
 */
public class CloseResp extends BaseResp {

    /**
     * 链接系统
     */
    private String connectSys;

    public String getConnectSys() {
        return connectSys;
    }

    public void setConnectSys(String connectSys) {
        this.connectSys = connectSys;
    }

    /**
     * 结算时间
     * 报文响应时间，格式yyyy-MM-dd
     */
    private String settleDate;

    public String getSettleDate() {
        return settleDate;
    }

    public void setSettleDate(String settleDate) {
        this.settleDate = settleDate;
    }

    /**
     * 清分ID，如果来源方传了bankRefId就等于bankRefId，否则等于seqId
     */
    private String settleRefId;

    public String getSettleRefId() {
        return settleRefId;
    }

    public void setSettleRefId(String settleRefId) {
        this.settleRefId = settleRefId;
    }

    /**
     * 支付渠道商户号，各渠道情况不同，酌情转换。
     */
    private String targetMid;

    public String getTargetMid() {
        return targetMid;
    }

    public void setTargetMid(String targetMid) {
        this.targetMid = targetMid;
    }

    /**
     * 商户名称
     */
    private String merName;

    public String getMerName() {
        return merName;
    }

    public void setMerName(String merName) {
        this.merName = merName;
    }

    /**
     * 系统交易流水号
     */
    private String seqId;

    public String getSeqId() {
        return seqId;
    }

    public void setSeqId(String seqId) {
        this.seqId = seqId;
    }

    /**
     * 订单状态
     * NEW_ORDER 	新订单
     * UNKNOWN 	不明确的交易状态
     * TRADE_CLOSED 	在指定时间段内未支付时关闭的交易；在交易完成全额退款成功时关闭的交易；支付失败的交易。	TRADE_CLOSED的交易不允许进行任何操作。
     * WAIT_BUYER_PAY 	交易创建，等待买家付款。
     * TRADE_SUCCESS	支付成功
     * TRADE_REFUND	订单转入退货流程	退货可能是部分也可能是全部。
     */
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 担保交易状态
     * NEW_ORDER 	新订单
     * UNKNOWN 	不明确的交易状态
     * TRADE_CLOSED 	在指定时间段内未支付时关闭的交易；在交易完成全额退款成功时关闭的交易；支付失败的交易。	TRADE_CLOSED的交易不允许进行任何操作。
     * WAIT_BUYER_PAY 	交易创建，等待买家付款。
     * TRADE_SUCCESS	支付成功
     * TRADE_REFUND	订单转入退货流程	退货可能是部分也可能是全部。
     */
    private String secureStatus;

    public String getSecureStatus() {
        return secureStatus;
    }

    public void setSecureStatus(String secureStatus) {
        this.secureStatus = secureStatus;
    }

    /**
     * 支付渠道
     * Alipay 1.0	支付宝1.0协议	比较少用
     * Alipay 2.0	支付宝2.0协议	主流
     * WXPay	微信
     * YQB	壹钱包
     * QMF	全民付远程快捷
     * UnionPay	银联钱包
     * BaiDu	百度钱包
     * JD	京东钱包
     * SF	顺丰顺手付
     * COMM	交通银行
     * BestPay	翼支付
     * ACP	银联全渠道立码付
     * NetPayBills	银商网付平台账单模块
     * NetPayGtwy	银商网付平台网关模块
     * QmfWebPay	POS通插件WEB版
     */
    private String targetSys;

    public String getTargetSys() {
        return targetSys;
    }

    public void setTargetSys(String targetSys) {
        this.targetSys = targetSys;
    }

    /**
     * 支付总金额
     */
    private Long totalAmount;

    public Long getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Long totalAmount) {
        this.totalAmount = totalAmount;
    }
}
