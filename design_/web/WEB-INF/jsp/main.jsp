<%--
  Created by IntelliJ IDEA.
  control.User: sghcmy
  Date: 2022/8/1
  Time: 21:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

%>
<html>
<head>
    <title>学生信息管理系统</title>
    <link rel="stylesheet" href="css/bootstrap.min.css">

    <script src="js/jquery.min.js"></script>
    <script src="js/needed.js"></script>

    <style type="text/css">
        th,td{ text-align: center;vertical-align: middle;}
    </style>


</head>
<body>
<div class="container">

    <div class="row" style="padding-top: 45px;height: 75%">

        <div class="col-md-9 col-md-offset-2">

            <div align="center" style="padding-top: 25px;">
                <h1>学生信息管理</h1>
                <div class="row">
                    <div class="col-md-12" style="background: red">

                        <form method="get" action="query_staff">
                            <a class="btn btn-primary" href="add_Student">添加</a>
                            <input name="query" type="submit" value="查询" class="btn btn-success">
                            Sno: <input name="query_sno" type="text" style="height: 20px;width: 100px">
                            Sname:<input name="query_sname" type="text" style="height: 20px;width: 100px">
                            &nbsp;&nbsp;&nbsp;&nbsp;
                            Ssex: <input name="query_ssex" type="radio" value="男" style="height: 20px;">男
                            <input name="query_ssex" type="radio"value="女" style="height: 20px;"> 女  <br/>
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

                            Sage:<input name="query_sage" type="text" style="height: 20px;width: 100px">

                            Sedu:<select  name="query_sedu">
                            <option value="">----请选择学历层次----</option>
                            <option>高中</option>
                            <option>专科</option>
                            <option>本科</option>
                            <option>研究生</option>
                            <option>博士</option>
                        </select>
                            Wno: <input name="query_wno" type="text" style="height: 20px;width: 100px">

                        </form>

                    </div>
                </div>

                <table class="table table-bordered table-striped " >
                    <tr>
                        <th>id</th>
                        <th>name</th>
                        <th>age</th>
                        <th>sex</th>
                        <th>cno</th>
                    </tr>
                    <c:choose>

                        <c:when test="${empty res}">

                            <tr>
                                <td colspan="5"><h3>没有找到</h3></td>
                            </tr>
                        </c:when>

                        <c:otherwise>
                            <c:forEach var="u" items="${res}">
                                <tr>

                                    <td>${u.id}</td>
                                    <td>${u.name}</td>
                                    <td>${u.age}</td>
                                    <td>${u.sex}</td>
                                    <td>${u.cno}</td>
                                    <td>
                                        <a class="btn btn-warning" href="update_Student?id=${u.id}">更新</a>

                                    </td>
                                    <td>

                                        <a class="btn btn-danger">删除</a>
                                    </td>
                                </tr>
                            </c:forEach>
                        </c:otherwise>
                    </c:choose>


                </table>

            </div>

        </div>
    </div>
    <div class="row">
        <div class="col-md-12">
            <hr style="height:1px;border:none;border-top:1px solid #ccc;"/>
            <div align="center" style="padding-top: 20px">
                software-ShenGuohao-1330<br/>
                +8613027256772   <br/>
                1964208075@qq.com
            </div>
        </div>
    </div>
</div>

<script>


    $(function (){
        <c:if test="${!empty message}"> alert("${message}");</c:if>
    }) ;

</script>
</body>
</html>
