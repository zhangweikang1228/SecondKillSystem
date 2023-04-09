package com.kang.seckillmall.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @projectName: secKillMall
 * @package: com.kang.seckillmall.pojo
 * @className: User
 * @author: Weikang Zhang
 * @description: TODO
 * @date: 09/04/2023 22:11
 * @version: 1.0
 */
@TableName("t_user")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    /** 用户ID,手机号码 **/

    private Long id;

    private String nickname;

    /** MD5(MD5(pass明文+固定salt)+salt) **/

    private String password;

    private String salt;

    /** 头像 **/

    private String head;

    /** 注册时间 **/

    private Date registerDate;

    /** 最后一次登录事件 **/

    private Date lastLoginDate;

    /** 登录次数 **/

    private Integer loginCount;

}
