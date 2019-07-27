package com.maker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: 【zhangjian】
 * @Date: 2019/7/27
 * @Description: com.maker.controller
 * @version: 1.0
 */
@Controller
public class ThymeleafController {

    @RequestMapping("/test")
    public String test(Model model){
        model.addAttribute("name","张三");
        return "test";
    }
}
