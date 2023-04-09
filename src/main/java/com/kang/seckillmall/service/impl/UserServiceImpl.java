package com.kang.seckillmall.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kang.seckillmall.mapper.UserMapper;
import com.kang.seckillmall.pojo.User;
import com.kang.seckillmall.service.IUserService;
import com.kang.seckillmall.utils.MD5Util;
import com.kang.seckillmall.utils.ValidatorUtil;
import com.kang.seckillmall.vo.LoginVo;
import com.kang.seckillmall.vo.RespBean;
import com.kang.seckillmall.vo.RespBeanEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.util.StringUtils;

/**
 * @projectName: secKillMall
 * @package: com.kang.seckillmall.service.impl
 * @className: UserServiceImpl
 * @author: Weikang Zhang
 * @description: TODO
 * @date: 09/04/2023 22:15
 * @version: 1.0
 */
@Service
@Slf4j
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 登陆
     *
     * @param loginVo
     * @return
     */
    @Override
    public RespBean doLogin(LoginVo loginVo) {
        log.info("{}", "doLogin进来了");

        String mobile = loginVo.getMobile();
        String password = loginVo.getPassword();
        log.info("{}", loginVo.toString());
        if (StringUtils.isEmpty(mobile) || StringUtils.isEmpty(password)) {
            log.info("loginVo为空");
            return RespBean.error(RespBeanEnum.LOGIN_ERROR);
        }
/*        if (ValidatorUtil.isMobile(mobile)) {
            log.info("手机号有问题");
            return RespBean.error(RespBeanEnum.LOGIN_MOBILE_ERROR);
        }*/

        log.info("马上查user");
        User user = userMapper.selectById(mobile);

        if (user == null) {
            log.info("user为空");
            return RespBean.error(RespBeanEnum.LOGIN_ERROR);
        }
        log.info("user不为空");
        // 判断密码是否正确
        log.info("{}", MD5Util.formPassToDBPass(password, user.getSalt()));
        if (!MD5Util.formPassToDBPass(password, user.getSalt()).equals(user.getPassword())) {
            return RespBean.error(RespBeanEnum.LOGIN_ERROR);
        }


        return RespBean.success();
    }
}
