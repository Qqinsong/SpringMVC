<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: 26287
  Date: 2022/6/9
  Time: 11:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>foreach的练习</title>
</head>
<body>
<%
    ArrayList<String> people = new ArrayList<>();
    people.add(0,"0号同学");
    people.add(1,"1号同学");
    people.add(2,"2号同学");
    people.add(3,"3号同学");
    people.add(4,"4号同学");
    request.setAttribute("list",people);
%>
<%--

注释详解
var,每一次遍历出来的变量
items,要遍历的对象
begin,哪里开始
end,到哪里结束
step,步长！！！

--%>
<c:forEach var="people" items="${list}">
    <c:out value="${people}"/>
    <br>
</c:forEach>

<c:forEach var="people" items="${list}" begin="1" end="3" step="1" >
    <c:out value="${people}"/> <br>
</c:forEach>

</body>
</html>
