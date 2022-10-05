package com.qin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class LoginController {

    @RequestMapping("/login")
    public String login(HttpSession session, String username, String password, Model model){

        // 把用户的信息存在session中
        session.setAttribute("userLoginInfo",username);// 拿到session！
        model.addAttribute("username",username);
        return "main";
    }
    // 跳转到登录页面
    @RequestMapping("/goLogin")
    public String goLogin(){
        return "login";
    }

    // 跳转到主页面
    @RequestMapping("/main")
    public String main(){
        return "main";
    }
    // 用户点击注销以后，将session移除，并跳转到登录页面
    @RequestMapping("/goOut")
    public String goOut(HttpSession session){
        // 把session的信息移除
        session.removeAttribute("userLoginInfo");

        return "login"; // 跳转到主页，然后没有session以后，拦截器也会自动的拦截
        // 此处优化的时候，可以进行重定向，或者转发，转发到首页或者是登录页面
    }
}
