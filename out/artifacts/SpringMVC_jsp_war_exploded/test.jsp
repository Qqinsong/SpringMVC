<%--
  Created by IntelliJ IDEA.
  User: 26287
  Date: 2022/6/8
  Time: 19:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试</title>
</head>
<body>
Hello World
<br/>
<%--jsp基本的语法--%>
<%
out.print("ip地址为："+request.getRemoteAddr());
%>
<%--我是jsp的注释--%>
<hr/>
<%--JSP表达式
作用：用来将程序的输出，输出到客户端
<%= 变量或者表达式%>
--%>
<%= new java.util.Date()%>
<hr/>
<%--jsp声明--%>
<%!
    public void kuang(){
        System.out.println("进入了方法框");
    }
%>
<%
    kuang();
%>


</body>
</html>
