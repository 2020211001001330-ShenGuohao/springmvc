<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册</title>
</head>
<body>
	 <form action="${ pageContext.request.contextPath }/test" method="post">
		请输入用户名：<input type="text" name="username"/>${map.username }<br/>
		请输入密码：<input type="password" name="password"/>${map.password }<br/>	
		请输入Email：<input type="text" name="email"/>${map.email }<br/>	
		请输入电话：<input type="text" name="phone"/>${map.phone }<br/>	
		<input type="submit" value="注册"/>
	</form>
	${map }


</body>
</html>