<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文件上传和下载</title>
    <script src="${ pageContext.request.contextPath }/js/jquery-3.6.0.js" type="text/javascript"></script>
</head>
<body>
<table border="1">
    <tr>
        <td width="200" align="center">文件上传${msg}</td>
        <td width="300" align="center">下载列表</td>
    </tr>
    <tr>
        <td height="100">
            <form action="${pageContext.request.contextPath}/fileload02"
                  method="post" enctype="multipart/form-data">
                <input type="file" name="files" multiple="multiple"><br/>
                <input type="reset" value="清空"/>
                <input type="submit" value="提交"/>
            </form>
        </td>
    </tr>
</table>
</body>
</html>

