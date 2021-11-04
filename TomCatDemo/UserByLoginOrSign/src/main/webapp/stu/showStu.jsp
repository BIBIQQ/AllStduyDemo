<%@ page import="java.io.PrintWriter" %>
<%@ page import="com.ff.pojo.Stu" %>
<%@ page import="org.apache.ibatis.session.SqlSessionFactory" %>
<%@ page import="com.ff.until.GetSqlSessionFactory" %>
<%@ page import="org.apache.ibatis.session.SqlSession" %>
<%@ page import="com.ff.mapper.StuByAddOrShow" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: hasee
  Date: 2021/10/29
  Time: 10:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    List<Stu> stus = (List<Stu>)request.getAttribute("stus");
%>

<table border="1" cellspacing="0">
    <tr>
        <th>学生学号</th>
        <th>学生姓名</th>
        <th>学生年龄</th>
        <th>学生成绩</th>
    </tr>
    <% for (Stu stu : stus) { %>
        <tr>
            <td><%=stu.getStuName()%></td>
            <td><%=stu.getStuName()%></td>
            <td><%=stu.getStuAge()%></td>
            <td><%=stu.getStuScore()%></td>
        </tr>

    <%}%>
</table>
</body>
</html>
