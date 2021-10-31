<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@  taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<style>
    a{
       text-decoration:none;
    }
</style>
<body>
<a href="addBrand.html"><input type="button" value="新增"> </a><br>
<a href="/findAllBrandsServlet"><input type="button" value="搜索所有"> </a><br>
<hr>
<table border="1" cellspacing="0" width="85%" style="font-size: 20px" align="center" >
    <caption><b>商品大类</b></caption>
    <tr>
        <th>序号</th>
        <th>品牌名称</th>
        <th>企业名称</th>
        <th>排序</th>
        <th>品牌介绍</th>
        <th>状态</th>
        <th>操作</th>

    </tr>
    <c:forEach items="${brands}" var="brands">
        <tr align="center">
            <td>${brands.id}</td>
            <td>${brands.brandName}</td>
            <td>${brands.companyName}</td>
            <td>${brands.ordered}</td>
            <td>${brands.description}</td>
            <td>
                <c:if test="${brands.status == 1}">启用</c:if>
                <c:if test="${brands.status == 0}">禁用</c:if>
            </td>
            <td><a href="showByIdServlet?id=${brands.id}" >修改</a>
                <a  href="/DelectBrandServlet?id=${brands.id}" >删除</a></td>
        </tr>
        
    </c:forEach>


</table>

</body>
</html>

<script>
    function openResult(){    /* 绑定事件 */
        var r = confirm("您确定取消该商品吗？")
        if (r == true) {
            window.location.href="/DelectBrandServlet"
        }else {
            window.location.href="#"
        }
    }

</script>