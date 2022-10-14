<%--
Created by IntelliJ IDEA.
User: sghcmy
Date: 2022/8/9
Time: 9:27
To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生信息管理系统</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<h2 style="text-align: center">
    添加学生信息
</h2>
<hr/>

<br/><br/><br/><br/>
<div class="container">
    <div class="row">
        <div class="col-md-8 col-md-offset-4">
            <form class="form-horizontal" role="form" method="post" action="add_Student">
                <div class="form-group">
                    <label for="id_add" class="col-md-2 control-label">id</label>
                    <div class="col-md-5">
                        <input type="text" name="id"  class="form-control" id="id_add" placeholder="请输入添加的学生编号">
                    </div>
                </div>
                <div class="form-group">
                    <label for="name_add" class="col-md-2 control-label">name</label>
                    <div class="col-md-5">
                        <input type="text" name="name"  class="form-control" id="name_add" placeholder="请输入添加的学生姓名">
                    </div>
                </div>
                <div class="form-group">
                    <label for="age_add" class="col-md-2 control-label">age</label>
                    <div class="col-md-5">
                        <input type="text" name="age"  class="form-control" id="age_add" placeholder="请输入添加的学生年龄">
                    </div>
                </div>
                <div class="form-group">
                  <%--@declare id="sex_add"--%><label for="sex_add" class="col-md-2 control-label">sex</label>
                    <div class="col-md-5">
                    <label class="radio-inline">
                        <input type="radio" name="sex" id="sex_add_1" value="男"> 男
                    </label>
                    <label class="radio-inline">
                        <input type="radio" name="sex" id="sex_add_2"  value="女"> 女
                    </label>
                    </div>
                </div>


                <div class="form-group">
                 <%--@declare id="cno_add"--%><label for="cno_add" class="col-md-2 control-label">cno</label>
                    <div class="col-md-5">
                        <select class="form-control" name="cno">
                            <option>----请选择班级----</option>
                            <option>1</option>
                            <option>2</option>
                            <option>3</option>
                            <option>4</option>
                            <option>5</option>
                        </select>
                    </div>
                </div>


                <div class="form-group">
                    <div class="col-md-3 col-md-offset-2">
                        <a class="btn bg-primary" href="query_Student">取消</a>  &nbsp;&nbsp;&nbsp;&nbsp;
                        <input type="submit" name="add" value="添加" class="btn btn-success">
                    </div>
                </div>

            </form>
        </div>
    </div>

</div>




</body>
</html>

