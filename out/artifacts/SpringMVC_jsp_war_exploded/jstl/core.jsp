<%--
  Created by IntelliJ IDEA.
  User: 26287
  Date: 2022/6/9
  Time: 10:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>jstl核心标签</title>
</head>
<body>

<form action="core.jsp" method="get">
    <%--
    EL表达式获取表单中的数据
    ${param.参数名}
    --%>
    <input type="text" name="username" value="${param.username}">
    <input type="submit" value="登录">
</form>
<%--判断用户提交的用户是不是管理员--%>
<c:if test="${param.username=='admin'}" var="isadmin">
    <c:out value="管理员欢迎您!"/>
</c:if>
<%--下面使用自闭和的标签--%>
<c:out value="${isadmin}"/>
</body>
</html>
