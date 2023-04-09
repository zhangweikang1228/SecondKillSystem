package com.kang.seckillmall.controller;

import com.kang.seckillmall.service.IUserService;
import com.kang.seckillmall.vo.LoginVo;
import com.kang.seckillmall.vo.RespBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @projectName: secKillMall
 * @package: com.kang.seckillmall.controller
 * @className: LoginController
 * @author: Weikang Zhang
 * @description: TODO
 * @date: 09/04/2023 22:15
 * @version: 1.0
 */
@Controller
@Slf4j
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private IUserService userService;

    @RequestMapping("/toLogin")
    public String toLogin() {
        return "login";
    }


    @RequestMapping("/doLogin")
    @ResponseBody
    public RespBean doLogin(LoginVo loginVo) {

        return userService.doLogin(loginVo);
    }
}
