<%--
  Created by IntelliJ IDEA.
  User: 26287
  Date: 2022/6/8
  Time: 21:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--    这是第一中使用方式--%>
    <%@include file="common/header.jsp"%>
    <h1>我也网页主题</h1>
    <%@include file="common/footer.jsp"%>
<%--一般情况下会使用第二种方式--%>
<%--第二种方式jsp标签--%>
    <jsp:include page="/common/header.jsp"></jsp:include>

</body>
</html>
