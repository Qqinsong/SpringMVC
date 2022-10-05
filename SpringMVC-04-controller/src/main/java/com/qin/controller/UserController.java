package com.qin.controller;

import com.qin.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class UserController {
    @GetMapping("/t1")

    // 在方法的参数中，这样设置，提交的域名称和处理方法的参数名必须一致
    // @RequestParam("username") 参数，不管前端用不用,这个参数都要加上
    public String test1(@RequestParam("username") String name, Model model){
        //1 接受前端参数
        System.out.println("接收到前端的参数为："+name);
        // 2 将返回的结果传递给前端
        model.addAttribute("msg",name);
        // 3 视图跳转
        return "test";
    }
    // 以上都是前端接收一个参数

    // 还有一种情况，就是前端接收一个对象： id,name,age;
    // http://localhost:8080/user/t2?id=1&name=qin&age=3
    /*
    1. 接收前端用户传递的参数，判断参数的名字，假设名字直接在方法上，可以直接使用；
    2. 假设传递的是一个对象user;匹配user对象中的字段名，如果名字一致则ok,否则，匹配不到！
    */

    // 如果使用对象的话，前端传递的参数名和对象名必须一致，否则就是null
    @GetMapping("/t2")
    public String test2(User user, Model model){
        //1 接受前端参数
        System.out.println(user);
        // 2 将返回的结果传递给前端

        // 3 视图跳转
        return "test";
    }
}
