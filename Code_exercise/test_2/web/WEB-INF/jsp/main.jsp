<%--
  Created by IntelliJ IDEA.
  User: sghcmy
  Date: 2022/10/12
  Time: 20:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>主页面</title>
</head>
<body>
<h2>${message}</h2>

<form action="test3" method="post">
    用户名:<input type="text" name="username"> <br/>
    密&nbsp;&nbsp;码:<input type="password" name="password"> <br/>
    <input type="submit" value="注册">
</form>

</body>
</html>
