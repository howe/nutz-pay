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
     * 1、系统返回码
     * 0000	正常
     * 1000	认证失败
     * 1001	授权失败
     * 9001	参数校验失败
     * 9999	系统错误
     *
     * 2、常见交易返回码
     * 00	交易成功
     * 03	无效商户
     * 13	无效金额
     * 22	原交易不存在
     * 25	找不到原始交易
     * 30	报文格式错误
     * 57	不允许此交易
     * 61	超出金额限制
     * 64	原始金额错误
     * 92	发卡方线路异常
     * 94	重复交易
     * 96	交换中心异常
     * 97	终端号未登记
     * A7	安全处理失败
     * ER	参见具体返回信息
     * FF	查不到交易信息
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
