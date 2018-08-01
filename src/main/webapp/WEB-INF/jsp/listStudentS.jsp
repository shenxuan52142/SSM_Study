
<!--显示中文-->
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" import="java.util.*"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<script type="text/javascript" src="js/jquery.min.js"></script>



<script type="text/javascript">
    /*将post method 改变为delete*/
    $(function(){
        $(".delete").click(function(){
            var href=$(this).attr("href");
            $("#formdelete").attr("action",href).submit();
            return false;
        })
    })

</script>



<div style="width:500px;margin:0px auto;text-align:center">
<table align='center' border='1' cellspacing='0'>

    <body>
    <h2><img src="${pageContext.request.contextPath}/img/T10/xiaobawang.jpg"></h2>
    </body>

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
            <td><a href="${pageContext.request.contextPath }/studentS/${c.id}">编辑</a></td>
            <td><a class="GET" href="StudentS/${c.id}">删除</a></td>
            </tr>
    </c:forEach>
</table>
    <div style="text-align:center;margin-top:40px">

        <form method="post" action="${pageContext.request.contextPath}/studentS">
            <input type="hidden" name="_method" value="PUT">
            ID：<input name="id" value="" type="text"> <br><br>
            age:<input name="age" value="" type="text"><br><br>
            姓名:<input name="name" value="" type="text" ><br><br>
                 <input type="submit" value="点击注册">
        </form>


        <form method="GET" action="${pageContext.request.contextPath}/studentS/{c.id}">

            ID：<input name="id" value="${c.id}" type="text"> <br><br>
            <!--age:<input name="age" value="${c.age}" type="text"><br><br>-->
            <%--姓名:<input name="name" value="${c.name}" type="text" ><br><br>--%>
            <input type="submit" value="点击查询">
        </form>

    </div>
</div>
<form id="formdelete" action=""  method="POST">
   <input type="hidden" name="_method" value="DELETE">
</form>



