<%@ page import="com.itheima.pojo.Brand" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: hasee
  Date: 2021/10/29
  Time: 9:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%

    List<Brand> brands = (List<Brand>) request.getAttribute("brands");
%>
<table border="1" cellspacing="0">
    <tr>
        <th>姓名</th>
        <th>年龄</th>
    </tr>

<% for (Brand brand : brands) { %>

    <tr>
        <td><%= brand.getName()%>
        </td>
        <td><%=brand.getAge()%>
        </td>
    </tr>
    <%}%>

</table>
</body>
</html>
