<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/7/8 0008
  Time: 11:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<script src="/js/jquery-1.7.2.min.js" type="text/javascript"></script>
<body>
<input type="button" value="查找" onclick="bb()"/>
<table width="300px" id="fac">
    <tr>
        <td>学号</td>
        <td>姓名</td>
        <td>性别</td>
        <td>年龄</td>
    </tr>
</table>
</body>
<script type="text/javascript">
    function bb(){
        $.ajax({
            type:"post",
            dataType:"json",
            url:"/TestRedis3",
            data:{},
            success:function(data){
                var itemtotal = "";
                $.each(data,function(i,item){
                    alert("我进来了");
                    var classid = item.id;
                    alert(classid);
                    var classname = item.name;
                    var teacherid1 = item.sex;
                    var age = item.age;
                    var item1 = "<tr><td>"+classid+"</td><td>"+classname+"</td><td>"+teacherid1+"</td><td>"+age+"</td></tr>";
                    itemtotal = itemtotal + item1;
                });
                $("#fac").append(itemtotal);
            },
            error:function(e){

            }
        });
    }
</script>
</html>
