package com.qin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 返回一个json字符串的格式
public class TestController {

    @RequestMapping("/t1")
    public String test(){
        System.out.println("========TestController中的test()方法执行了=======");
        return "ok";
    }
}
