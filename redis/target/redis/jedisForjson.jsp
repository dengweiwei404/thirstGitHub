<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/7/8 0008
  Time: 16:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<script src="/js/jquery-1.7.2.min.js" type="text/javascript"></script>
<script type="text/javascript">
    function aa(){
        var id=$("#Jsonid").val();
        $.ajax({
            type:"post",
            url:"/FormJedisOneStudent",
            dataType:"json",
            contentType:"application/json",
            data:JSON.stringify({id:id}),
            success:function (results) {
                var jsonType="";
                $.each(results,function (i,item) {
                    var id=item.id;
                    var name=item.name;
                    var sex=item.sex;
                    var age=item.age;
                    var item1="<tr><td>"+id+"</td><td>"+name+"</td><td>"+sex+"</td><td>"+age+"</td></tr>";
                    jsonType=jsonType+item1;
                });

                $('#Jsontab').append(jsonType);
            },
            error:function (e) {
            }});}
</script>
<body>
<input type="text" name="id" id="Jsonid"/>
<input type="button" value="查询" onclick="aa()"/>

<table id="Jsontab" style="width: 300px;border-width: 1px;border-style: solid;border-color: aqua">
    <tr>
        <td>学号</td>
        <td>姓名</td>
        <td>性别</td>
        <td>年龄</td>
    </tr>
</table>
</body>
</html>
