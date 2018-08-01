<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/2/26
  Time: 11:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title>Title</title>
</head>
<body>
<div style="width:500px;margin:0px auto;text-align:center">
    <table align='center' border='1' cellspacing='0'>
        <tr>
            <td>id</td>
            <td>name</td>
            <td>age</td>
            <td>编辑</td>
            <td>删除</td>
        </tr>
        <c:forEach items="${cs}" var="c" varStatus="st">
            <tr>
                <td>${c.id}</td>
                <td>${c.name}</td>
                <td>${c.age}</td>
                <td><a href="editStudentS?id=${c.id}">编辑</a></td>
                <td><a href="deleteStudentS?id=${c.id}">删除</a></td>

            </tr>
        </c:forEach>
    </table>
    <div style="text-align:center;margin-top:40px">

        <form method="post" action="addStudentS">
            分类名称： <input name="name" value="" type="text"> <br><br>
            <input name="age" value="${c.age}" type="text">
            <input name="id" value="${c.id}" type="text" >
            <input type="submit" value="增加分类">
        </form>

    </div>


</div>
</body>
</html>
