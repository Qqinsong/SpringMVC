<%--
  Created by IntelliJ IDEA.
  User: 26287
  Date: 2022/5/20
  Time: 19:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
<%--    <script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>--%>
    <script src="${pageContext.request.contextPath}/statics/js/jquery-3.6.0.js"></script>
    <script>
        function a1(){
            $.post({
                url:"${pageContext.request.contextPath}/a1", //请求的地址
                data:{"name":$("#name").val()},   // 传递的参数，传递给后端的参数：传递给前端的参数(通过jQuery从前端中获取！)
                success:function (data){
                    alert(data);
                }
                })
        }

    </script>
  </head>
  <body>
<%--  失去焦点的时候，发起一个请求--%>
  用户名：<input type="text" id="name" onblur="a1()"/>
  </body>

</html>
