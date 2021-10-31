<%@ page import="java.util.List" %>
<%@ page import="com.itheima.pojo.Brand" %><%--
  User: FF
  Date: 2021/10/29
  Time: 14:41
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@  taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


<table border="1" cellspacing="0">
    <tr>
        <th>编号</th>
        <th>姓名</th>
        <th>年龄</th>
        <th>状态</th>
    </tr>

<c:forEach items="${brands}" var="brand" varStatus="status">
    <tr>
        <%--
            status.count  序号从"1"开始
            status.index  序号从"0"开始
        --%>
        <td>${status.count}</td>
        <td>${brand.name}</td>
        <td>${brand.age}</td>
        <td>
            <c:if test="${brand.status == 1}">学生</c:if>
            <c:if test="${brand.status == 0}">老师</c:if>
        </td>
    </tr>

</c:forEach>
</table>
<%--排序号--%>
<c:forEach begin="1" end="10" step="1" var="id">
    <a href="#" style="text-decoration:none">${id}</a>
</c:forEach>
</body>
</html>
