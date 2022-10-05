<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 26287
  Date: 2022/6/9
  Time: 10:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>c:when标签</title>
</head>
<body>
<%--使用set先定义一个变量，值为85--%>
<c:set var="score" value="85"></c:set>
<%--下面使用choose when进行判断--%>
<c:choose>
    <c:when test="${score>=90}">
        你的成绩为优秀
    </c:when>
    <c:when test="${score>=80}">
        你的成绩为中等
    </c:when>
    <c:when test="${score>=60}">
        你的成绩为及格
    </c:when>
</c:choose>
</body>
</html>
