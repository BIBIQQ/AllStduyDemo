<%@ page import="com.itheima.pojo.Brand" %>
<%@ page import="java.util.List" %>
<%--
  User: FF
  Date: 2021/10/29
  Time: 11:34
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@  taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%  List<Brand> brands = (List<Brand>) request.getAttribute("brands");
    String name = (String)request.getAttribute("name");
%>

<h1>欢迎${name}来了</h1>
<table border="1" cellspacing="0">
    <tr>
        <th>姓名</th>
        <th>年龄</th>
        <th>状态</th>
    </tr>
        <% for (Brand brand : brands) {
        request.setAttribute("brand",brand);%>
    <tr>
        <td>${brand.name}
        </td>
        <td>${brand.age}
        </td>
        <c:if test="${brand.status ==1}"><td>学生</td></c:if>
        <c:if test="${brand.status ==0}"><td>老师</td></c:if>
    </tr>
        <%}%>
</table>
</body>
</html>
