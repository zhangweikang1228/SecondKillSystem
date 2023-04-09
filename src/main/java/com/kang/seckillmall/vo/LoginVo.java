package com.kang.seckillmall.vo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 登录传参
 *
 * @author: LC
 * @date 2022/3/2 2:01 下午
 * @ClassName: LoginVo
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginVo {


    private String mobile;

    private String password;

}
