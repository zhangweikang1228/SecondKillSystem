package com.kang.seckillmall.vo;

import lombok.*;

/**
 * @projectName: secKillMall
 * @package: com.kang.seckillmall.vo
 * @className: RespBeanEnum
 * @author: Weikang Zhang
 * @description: 公共返回对象枚举
 * @date: 09/04/2023 22:24
 * @version: 1.0
 */
@Getter
@ToString
@AllArgsConstructor
public enum RespBeanEnum {


    SUCCESS(200, "SUCCESS"),
    ERROR(500, "服务端异常"),
    //登陆模块
    LOGIN_ERROR(500001,"用户名或密码错误"),
    LOGIN_MOBILE_ERROR(500002,"用户名或密码错误");

    private final Integer code;
    private final String message;


}
