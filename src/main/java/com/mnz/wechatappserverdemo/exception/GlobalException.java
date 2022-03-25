package com.mnz.wechatappserverdemo.exception;

import com.mnz.wechatappserverdemo.vo.RespBeanEnum;

/**
 * @Classname GlobalException
 * @Author MNZ
 * @Date 2022/3/25 10:30 AM
 * @Description
 **/
public class GlobalException extends  RuntimeException{

    private RespBeanEnum respBeanEnum;

    public RespBeanEnum getRespBeanEnum() {
        return respBeanEnum;
    }

    public void setRespBeanEnum(RespBeanEnum respBeanEnum) {
        this.respBeanEnum = respBeanEnum;
    }

    public GlobalException(RespBeanEnum respBeanEnum) {
        this.respBeanEnum = respBeanEnum;
    }
}
