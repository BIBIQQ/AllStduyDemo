<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>修改品牌</title>
</head>
<body>
<h3>修改品牌</h3>
<form action="/modifyBrandervlet" method="post">

    <%--隐藏域，提交id--%>
        <input type="hidden" id="id" name="id" value="">
        品牌名称：<input id="brandName" name="brandName"><br>
        企业名称：<input id="companyName" name="companyName"><br>
        排序：<input id="ordered" name="ordered"><br>
        描述信息：<textarea rows="5" cols="20" id="description" name="description"></textarea><br>
        状态：
        <input type="radio" name="status" value="0">禁用
        <input type="radio" name="status" value="1">启用<br>

    <input type="submit" value="提交">
</form>
<script src="js/axios-0.18.0.js"></script>
<script>
    window.onload=function () {
    //1.获得请求的id
    var id =  getQueryVariable("id");

    //2.异步请求后端获得这个id的信息   返回 JSON
    axios({
        method:"get",
        url:"http://localhost:8848/seletBrandByIdServlet?id="+id,
    }).then(function (resp) {
        var brand = resp.data;
        //3.拼接标签
        // 设置表格数据
        document.getElementById("brandName").value=brand.brandName;
        document.getElementById("id").value=brand.id;
        document.getElementById("companyName").value=brand.companyName;
        document.getElementById("ordered").value=brand.ordered;
        document.getElementById("description").value=brand.description;
        var statuss = document.getElementsByName("status");
        if(brand.status == 0){
            statuss[0].checked = true;
        }else{
            statuss[1].checked = true;
        }
    });
    }

    function getQueryVariable(variable)
    {
        var query = window.location.search.substring(1);
        var vars = query.split("&");
        for (var i=0;i<vars.length;i++) {
            var pair = vars[i].split("=");
            if(pair[0] == variable){return pair[1];}
        }
        return(false);
    }
</script>
</body>
</html>