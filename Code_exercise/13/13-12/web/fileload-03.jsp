<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文件上传和下载</title>
</head>
<body>
<table border="1">
    <tr>
        <td height="100">
            <form action="${pageContext.request.contextPath}/fileload03"
                  method="post" enctype="multipart/form-data">
				用户名：<input type="text" name="username" /><br/>
				密&nbsp;&nbsp;&nbsp;码：<input type="text" name="password" /><br/>
                <input type="file" name="files" multiple="multiple"><br/>
                <input type="reset" value="清空"/>
                <input type="submit" value="提交"/>
            </form>
        </td>
    </tr>
</table>
</body>
</html>

