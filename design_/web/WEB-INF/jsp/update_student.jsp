<%--
Created by IntelliJ IDEA.
User: sghcmy
Date: 2022/8/9
Time: 9:27
To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>学生信息管理系统</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<h2 style="text-align: center">
    更新学生信息
</h2>
<hr/>

<br/><br/><br/><br/>
<div class="container">
    <div class="row">
        <div class="col-md-8 col-md-offset-4">
            <form class="form-horizontal" role="form" method="post" action="update_Student">
                <div class="form-group">
                    <label for="id_update" class="col-md-2 control-label">id</label>
                    <div class="col-md-5">
                        <input type="text" name="id"  class="form-control" id="id_update" placeholder="请输入更新之后的学生编号" value="${before.id}">
                    </div>
                </div>
                <div class="form-group">
                    <label for="name_update" class="col-md-2 control-label">name</label>
                    <div class="col-md-5">
                        <input type="text" name="name"  class="form-control" id="name_update" placeholder="请输入更新之后的学生姓名" value="${before.name}">
                    </div>
                </div>
                <div class="form-group">
                    <label for="age_update" class="col-md-2 control-label">age</label>
                    <div class="col-md-5">
                        <input type="text" name="age"  class="form-control" id="age_update" placeholder="请输入更新之后的学生年龄" value="${before.age}">
                    </div>
                </div>
                <div class="form-group">
                  <%--@declare id="sex_update"--%><label for="sex_update" class="col-md-2 control-label">sex</label>
                    <div class="col-md-5">
                    <label class="radio-inline">
                        <input type="radio" name="sex" id="sex_update_1" value="男"${"男".equals(before.sex.trim())?"checked":""}> 男
                    </label>
                    <label class="radio-inline">
                        <input type="radio" name="sex" id="sex_update_2"  value="女"${"女".equals(before.sex.trim())?"checked":""}> 女
                    </label>
                    </div>
                </div>


                <div class="form-group">
                <%--@declare id="cno_update"--%><label for="cno_update" class="col-md-2 control-label">cno</label>
                    <div class="col-md-5">
                        <select class="form-control" name="cno">
                            <option>----请选择班级----</option>
                            <option <c:if test="${before.cno.trim().equals('1')}">selected</c:if> >1</option>
                            <option <c:if test="${before.cno.trim().equals('2')}">selected</c:if> >2</option>
                            <option <c:if test="${before.cno.trim().equals('3')}">selected</c:if> >3</option>
                            <option <c:if test="${before.cno.trim().equals('4')}">selected</c:if> >4</option>
                            <option <c:if test="${before.cno.trim().equals('5')}">selected</c:if> >5</option>

                        </select>
                    </div>
                </div>


                <div class="form-group">
                    <div class="col-md-3 col-md-offset-2">
                        <a class="btn bg-primary" href="query_Student">取消</a>  &nbsp;&nbsp;&nbsp;&nbsp;
                        <input type="submit" name="update" value="更新" class="btn btn-success">
                    </div>
                </div>

            </form>
        </div>
    </div>

</div>




</body>
</html>

