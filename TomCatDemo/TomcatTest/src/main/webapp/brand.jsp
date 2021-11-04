<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>

<h1>${user.username},欢迎您</h1>

<input type="button" value="新增" id="add"><br>
<hr>
<table border="1" cellspacing="0" width="80%" id="brandtable">
    <tr>
        <th>序号</th>
        <th>品牌名称</th>
        <th>企业名称</th>
        <th>排序</th>
        <th>品牌介绍</th>
        <th>状态</th>
        <th>操作</th>
    </tr>


</table>

<script>
    document.getElementById("add").onclick = function () {
        location.href = "/addBrand.jsp";
    }

   window.onload = function () {
        // 发送axios请求




        //将表格书写到页面
        document.getElementById("brandtable").innerHTML += " <tr align=\"center\">\n" +
            "        <%--<td>${brand.id}</td>--%>\n" +
            "        <td>1</td>\n" +
            "        <td>1</td>\n" +
            "        <td>2</td>\n" +
            "        <td>3</td>\n" +
            "        <td>4</td>\n" +
            "\n" +
            "        <td><a href=\"#\">修改</a> <a href=\"#\">删除</a></td>\n" +
            "    </tr> "
    }
</script>
</body>
</html>