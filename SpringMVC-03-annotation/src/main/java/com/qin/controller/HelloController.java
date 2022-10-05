package com.qin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // 这个注解的的作用是，将类注册到SpringIOC中的bean中
// @RequestMapping("/HelloController")  // 可以添加在类上，也可以添加到方法上
// 添加到类上的时候，是为了增加一个路径
// Controller 这个注解代表这个类会被Spring接管
// 被这个注解的类，中的所有方法，如果返回值是String，并且有具体页面可以跳转，那么就会被视图解析器解析
public class HelloController {

    //真实访问地址 : 项目名/HelloController/h1
    @RequestMapping("/h1")
    public String sayHello(Model model){
        //向模型中添加属性msg与值，可以在JSP页面中取出并渲染
        model.addAttribute("msg","hello,SpringMVC");
        //web-inf/jsp/hello.jsp
        return "hello";  // 跳转到页面
    }
}