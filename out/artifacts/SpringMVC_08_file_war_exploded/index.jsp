<%--
  Created by IntelliJ IDEA.
  User: 26287
  Date: 2022/5/22
  Time: 20:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <div>
    <form action="/upload" enctype="multipart/form-data" method="post">
      <input type="file" name="file"/>
      <input type="submit" value="upload">
    </form>
  </div>
  <div>
    <form action="/upload2" enctype="multipart/form-data" method="post">
      <input type="file" name="file"/>
      <input type="submit" value="upload">
    </form>
  </div>
  <div>
    <a href="${pageContext.request.contextPath}/statics/logo.png">点击下载</a>
  </div>
  </body>
</html>
