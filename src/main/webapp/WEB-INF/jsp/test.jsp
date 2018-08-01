<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/2/27
  Time: 18:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="GET" action="${pageContext.request.contextPath }/
s">

    ID：<input name="id" value="${id}" type="text"> <br><br>

    <input type="submit" value="点击查询">
</form>
</body>
</html>
