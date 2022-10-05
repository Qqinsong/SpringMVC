package com.qin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ResultSpringMVC {

    @RequestMapping("/rsm2/t1")
    public String test1(){
        // 转发
        // 转发url的地址不会发生变化
        return "test"; // 转发

    }
    @RequestMapping("/rsm2/t2")
    public String test2(){
        // 重定向，不需要视图解析器，本质就是重新请求一个新的地址
        // 重定向，的URL的地址会发生变化
        return "redirect:/index.jsp";
    }

}
