package com.qin.config;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInterceptor implements HandlerInterceptor {
    // 做一些放行的判断

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session =request.getSession();// 获得session
        // 判断在什么条件下进行放行
        // 登录页面会放行
        if(request.getRequestURI().contains("goLogin")){
            return true;
        }
        // 提交页面会放行
        if(request.getRequestURI().contains("login")){
            return true;
        }
        // 用下面这个判断url的地址也可以，用上面两种方法判断url请求地址筛选过滤也可以
//        if(request.getRequestURI().contains("gin")){
//            return true;
//        }
        // 第一次登录，没有session,如果用户有session则进行放行
        if(session.getAttribute("userLoginInfo")!=null){
            return true;
        }

        // 如果以上条件都不满足，则跳转到登录界面
        request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request,response);
        return false;
    }
}
