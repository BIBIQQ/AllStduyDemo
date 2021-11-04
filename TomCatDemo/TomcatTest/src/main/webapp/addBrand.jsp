<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>添加品牌</title>
</head>
<body>
<h3>添加品牌</h3>
<form action="#" method="post">
    品牌名称：<input name="brandName" id="brandName"><br>
    企业名称：<input name="companyName"  id="companyName"><br>
    排序：<input name="ordered"  id="ordered"><br>
    描述信息：<textarea rows="5" cols="20" name="description"  id="description"></textarea><br>
    状态：
    <input type="radio" name="status" value="0"  >禁用
    <input type="radio" name="status" value="1"  >启用<br>

    <input type="button" value="提交" id="btn">
</form>
</body>
</html>

<script src="js/axios-0.18.0.js"></script>
<script>
    document.getElementById("btn").onclick = function () {
        //生成JSON
        var brandJson = {
            brandName:document.getElementById("brandName").value,
            companyName:document.getElementById("companyName").value,
            ordered:document.getElementById("ordered").value,
            description:document.getElementById("description").value,
            status:"",
    };
        let status =   document.getElementsByName("status");
        for( let i=0;i<status.length;i++){
            if(status[i].checked){
                brandJson.status = status[i].value;
            }
        }
        //发送给AXIOS
        axios({
            method:"post",
            url:"http://localhost:8848/addBrandServlet",
            data:brandJson
        }).then(function (resp) {
            var result = resp.data;
            if(result){
                location.href = "http://localhost:8848/brand.html";
            }
        })
    }

</script>