package com.qin.controller;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.qin.pojo.User;
import com.qin.utils.JsonUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//@Controller 它会走视图解析器，如果不想走视图解析器，配合@ResponseBody 注解来使用
@RestController // 返回json字符串统一解决，这个类里面的所有方法都返回字符串
// 不用在每一个都添加@ResponseBody 的注解了，我们在前后端分离的项目中，一般都使用RestController
// 前后端分离的项目在开发的过程中，肯定不会走视图解析器了
public class UserController {

    // 传统的解决乱码的方式
    // @RequestMapping(value="/json1",produces = "application/json;charset=utf-8")
    @RequestMapping("/json1")
    // @ResponseBody
    // 使用这个注解以后，程序就不会走这个视图解析器了，会直接返回一个字符串给前端
    public String json1() throws JsonProcessingException {

        // 创建一个Jackson的对象映射器，用来解析数据
        ObjectMapper mapper =new ObjectMapper();
        // 创建一个对象
        User user = new User("请假1号", 3, "男");
        // 将我们的对象解析成json格式
        String str =mapper.writeValueAsString(user);
        // 由于@ResponseBody注解，这里会将str转换成json格式返回；十分方便
        return str;

    }




    // 测试集合的输出
    @RequestMapping("/json2")
    public String json2() throws JsonProcessingException {

        // 创建一个Jackson的对象映射器，用来解析数据
        ObjectMapper mapper =new ObjectMapper();
        // 创建多个对象
        User user1 = new User("请假1号", 3, "男");
        User user2 = new User("请假2号", 3, "男");
        User user3 = new User("请假3号", 3, "男");
        User user4 = new User("请假4号", 3, "男");
        List<User> list = new ArrayList<User>();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);

        // 将我们的对象解析成json格式
        String str =mapper.writeValueAsString(list);
        // 由于@ResponseBody注解，这里会将str转换成json格式返回；十分方便
        return str;

    }

    // 测试时间的输出
    @RequestMapping("/json3")
    public String json3() throws JsonProcessingException {

        // 创建一个Jackson的对象映射器，用来解析数据
        ObjectMapper mapper =new ObjectMapper();
        //不使用时间戳的方式
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        // 自定义日期的格式
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // 指定日期的格式
        mapper.setDateFormat(sdf);
        // 创建一个时间对象
        Date date = new Date();

        // 将我们的对象解析成json格式
        String str =mapper.writeValueAsString(date);
        // 由于@ResponseBody注解，这里会将str转换成json格式返回；十分方便
        return str;

    }

    // 使用工具类测试时间的输出
    @RequestMapping("/json4")
    public String json4() throws JsonProcessingException {

        // 创建一个新的时间对象
        Date date = new Date();
        // 调用工具类
        String str = JsonUtils.getJson(date);
        return str;

    }
    // 使用工具类测试集合的输出
    @RequestMapping("/json5")
    public String json5() throws JsonProcessingException {


        // 创建多个对象
        User user1 = new User("请假1号", 3, "男");
        User user2 = new User("请假2号", 3, "男");
        User user3 = new User("请假3号", 3, "男");
        User user4 = new User("请假4号", 3, "男");
        List<User> list = new ArrayList<User>();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);


        return JsonUtils.getJson(list);

    }

    // 使用fastjson测试集合的输出
    @RequestMapping("/json6")
    public String json6() throws JsonProcessingException {


        // 创建多个对象
        User user1 = new User("请假1号", 3, "男");
        User user2 = new User("请假2号", 3, "男");
        User user3 = new User("请假3号", 3, "男");
        User user4 = new User("请假4号", 3, "男");
        List<User> list = new ArrayList<User>();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);


        return JSON.toJSONString(list);

    }
}
