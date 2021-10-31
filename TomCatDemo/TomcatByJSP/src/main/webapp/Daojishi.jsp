<%--
  User: FF
  Date: 2021/10/29
  Time: 18:50
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<script type="text/javascript">
    var t=3;
    setInterval("refer()",1000);
    function refer(){
        if(t==0){
            location.href="/findAllBrandsServlet";
        }
        document.getElementById('show').innerHTML="${falg}"+t+"秒后跳转...";
        t--;
    }
</script>
<span id="show"></span>
</body>
</html>
