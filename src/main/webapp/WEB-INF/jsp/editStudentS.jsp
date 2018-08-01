<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" import="java.util.*"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div style="width:500px;margin:0px auto;text-align:center">


    <div style="text-align:center;margin-top:40px">

        <form method="post" action="${pageContext.request.contextPath}/studentS/${c.id}">
            ID：<input name="id" value="${c.id}" type="text"> <br><br>
            年龄:<input name="age" value="${c.age}" type="text" ><br><br>
            姓名:<input name="name" value="${c.name}" type="text"><br><br>
            <input type="submit" value="点击修改">
        </form>

    </div>
</div>