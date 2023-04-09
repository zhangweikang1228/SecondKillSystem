package com.kang.seckillmall.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @projectName: secKillMall
 * @package: com.kang.seckillmall.controller
 * @className: Demo
 * @author: Weikang Zhang
 * @description: TODO
 * @date: 09/04/2023 21:28
 * @version: 1.0
 */
@Controller
@RequestMapping("/demo")
public class Demo {

    /**
     * 测试demo
     * @param model
     * @return
     */
    @RequestMapping("/hello")
    public String hello(Model model){
        model.addAttribute("name","hhhhhheeeelllo");
        return "hello";

    }

}
