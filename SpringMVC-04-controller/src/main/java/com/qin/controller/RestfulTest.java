package com.qin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class RestfulTest {

    // 传统的url:请求地址 http://localhost:8080/r/t1?a=1&b=1
    @RequestMapping("/r/t1")
    public String sayHello(int a,int b,Model model){
        //向模型中添加属性msg与值，可以在JSP页面中取出并渲染
        int s = a+b;
        model.addAttribute("msg","结果为："+s);
        //web-inf/jsp/test.jsp
        return "test";  // 跳转到页面
    }

    //  在Spring MVC中可以使用 @PathVariable 注解，让方法参数的值对应绑定到一个URI模板变量
    //上。
    // Restful风格 http://localhost:8080/r/t2/2/3
    @RequestMapping("/r/t2/{a}/{b}")
    public String sayHello2(@PathVariable int a, @PathVariable int b, Model model){
        //向模型中添加属性msg与值，可以在JSP页面中取出并渲染
        int s = a+b;
        model.addAttribute("msg","结果为："+s);
        //web-inf/jsp/test.jsp
        return "test";  // 跳转到页面
    }

    // 使用用method属性指定请求类型，从而实现URL的复用
    @GetMapping("/r/t2/{a}/{b}")
    public String sayHello3(@PathVariable int a, @PathVariable int b, Model model){
        //向模型中添加属性msg与值，可以在JSP页面中取出并渲染
        int s = a+b;
        model.addAttribute("msg","结果为："+s);
        //web-inf/jsp/test.jsp
        return "test";  // 跳转到页面
    }
    // sayHello3 和 sayHello4 的URL的地址一样，但是请求的方式不一样，从而达到URL地址的复用
    @PostMapping("/r/t2/{a}/{b}")
    public String sayHello4(@PathVariable int a, @PathVariable int b, Model model){
        //向模型中添加属性msg与值，可以在JSP页面中取出并渲染
        int s = a+b;
        model.addAttribute("msg","结果为："+s);
        //web-inf/jsp/test.jsp
        return "test";  // 跳转到页面
    }


}