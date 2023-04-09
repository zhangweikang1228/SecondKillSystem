package com.kang.seckillmall.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kang.seckillmall.pojo.User;
import com.kang.seckillmall.vo.LoginVo;
import com.kang.seckillmall.vo.RespBean;

/**
 * @projectName: secKillMall
 * @package: com.kang.seckillmall.service.impl
 * @className: UserService
 * @author: Weikang Zhang
 * @description: TODO
 * @date: 09/04/2023 22:14
 * @version: 1.0
 */

public interface IUserService extends IService<User> {

    RespBean doLogin(LoginVo loginVo);
}
