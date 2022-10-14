<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: sghcmy
  Date: 2022/8/6
  Time: 9:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <title>用户登录</title>

    <link rel="stylesheet" href="css/bootstrap.min.css">
    <script src="js/jquery.min.js"></script>

    <script>

        <c:if test="${!empty message}">setTimeout('test()',500);</c:if>

        function test(){
            alert("${message}");
        }

        $(function (){
            $(".test").click(function (){
                alert("哈哈哈哈");
            })
        })
    </script>

</head>


<body>
<h1 style="text-align: center;">学生信息管理系统</h1>
<button class="test">点我试试</button>
<hr/>

<div style="margin-top: 200px">

    <form class="form-horizontal" role="form" action="login" method="post">
        <div class="form-group">
            <label for="username" class="col-md-2 control-label col-md-offset-3" >username</label>
            <div class="col-md-2 ">
                <input type="text" class="form-control" id="username" name="username" placeholder="请输入用户名" value="${username}">
            </div>
        </div>
        <div class="form-group">
            <label for="password" class="col-md-2 control-label col-md-offset-3">password</label>
            <div class="col-md-2 ">
                <input type="password" class="form-control" id="password" name="password" placeholder="请输入密码">
            </div>
        </div>

        <div class="form-group">
            <div class="col-md-offset-5 col-md-2">
                <a class="btn btn-warning" href="new_user">注册</a>  &nbsp;&nbsp;
                <button type="submit" class="btn btn-success">登录</button>

            </div>

        </div>

        

    </form>


</div>


</body>

</html>
