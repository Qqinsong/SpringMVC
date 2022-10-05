package com.qin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController  // 直接返回字符串,不走这个视图解析器，以json字符串的形式返回
public class AjaxController {

    @RequestMapping("/t1")
    public  String test(){
        return "hello";
    }
    @RequestMapping("/a1")
    public void a1(String name, HttpServletResponse response) throws IOException {
        System.out.println("name is=="+name);
        if("qin".equals(name)){
            response.getWriter().println("true");
        }else {
            response.getWriter().println("false");
        }
    }
    @RequestMapping("/aj3")
    public String ajax3(String name,String pwd){
        String msg =" ";
        // 模拟数据库中存在的数据
        if(name!=null){
            if("admin".equals(name)){
                msg = "OK";
            }else {
                msg = "用户名输入错误";
            }
        }
        if (pwd!=null){
            if("123456".equals(pwd)){
                msg = "OK";
            }else {
                msg = "密码输入有误";
            }
        }
        return msg;
    }
}
