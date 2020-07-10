
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<html>
<script src="/js/jquery-1.7.2.min.js" type="text/javascript"></script>
<body>
<h2>Hello World!</h2>
<input type="text" name="idd" id="idd"/>
<input type="button" value="查找" onclick="aa()"/>
<table width="300px" id="classna">
    <tr>
        <td>学号</td>
        <td>姓名</td>
        <td>性别</td>
        <td>年龄</td>
    </tr>
</table>
</body>
<script type="text/javascript">
    function aa(){
        var id=$('#idd').val();
        alert(id);
        $.ajax({
            type:"post",
            dataType:"json",
            url:"/TestRedis1",
            contentType:"application/json",
            data:JSON.stringify({id:id}),
            success:function(data){
                alert("我进来了");
                var itemtotal="";
                $.each(data,function(i,item){
                    var classid=item.id;
                    alert(classid);
                    var classname=item.name;
                    var teacherid1=item.sex;
                    var age=item.age;
                    var item1="<tr><td>"+classid+"</td><td>"+classname+"</td><td>"+teacherid1+"</td><td>"+age+"</td></tr>";
                    itemtotal=itemtotal+item1;
                });
                $("#classna").append(itemtotal);

            },
            error:function(e){

            }
        });
    }
</script>
</html>
