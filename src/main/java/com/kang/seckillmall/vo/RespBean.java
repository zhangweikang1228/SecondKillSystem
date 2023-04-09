package com.kang.seckillmall.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @projectName: secKillMall
 * @package: com.kang.seckillmall.vo
 * @className: RespBean
 * @author: Weikang Zhang
 * @description: 公共返回对象
 * @date: 09/04/2023 22:24
 * @version: 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Slf4j
public class RespBean {

    private long code;
    private String message;
    private Object obj;

    /**
     * 成功的返回结果
     * @return
     */
    public static RespBean success(){
        return new RespBean(RespBeanEnum.SUCCESS.getCode(),RespBeanEnum.SUCCESS.getMessage(), null);
    }

    public static RespBean success(Object obj){
        return new RespBean(RespBeanEnum.SUCCESS.getCode(),RespBeanEnum.SUCCESS.getMessage(), obj);
    }



    public static RespBean error(RespBeanEnum respBeanEnum){

        return new RespBean(respBeanEnum.getCode(),respBeanEnum.getMessage(), null);
    }


    public static RespBean error(RespBeanEnum respBeanEnum, Object obj){
        return new RespBean(respBeanEnum.getCode(),respBeanEnum.getMessage(), obj);
    }
}
