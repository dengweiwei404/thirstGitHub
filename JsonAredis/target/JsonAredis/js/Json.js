$(document).ready(function () {
    $("#hh").click(function () {
        $.ajax({
            url: "/selectAllForm",//地址
            type: "POST",//数据提交的方式
            contentType:"application/json;charset=utf-8",
            datatype: "json",//数据的类型
            data:{},
            success: function (data) {//找到相应地址后,会在相应URL的返回值放在result中
                var studentlist = eval(data);//如果result是集合或数组，那么用eval去遍历他们
                alert("studentlist的长度:"+studentlist.length);
                for (var i = 0; i < studentlist.length; i++) {
                    var addtr = document.createElement("tr");
                    var addtd1 = document.createElement("td");
                    addtd1.innerHTML = studentlist[i].id;
                    var addtd2 = document.createElement("td");
                    addtd2.innerHTML = studentlist[i].name;
                    var addtd3 = document.createElement("td");
                    addtd3.innerHTML = studentlist[i].sex;
                    var addtd4 = document.createElement("td");
                    addtd4.innerHTML = studentlist[i].age;
                    addtr.appendChild(addtd1);
                    addtr.appendChild(addtd2);
                    addtr.appendChild(addtd3);
                    addtr.appendChild(addtd4);
                    document.getElementById("tableredis").appendChild(addtr);
                }
            }
        });
    });
})


$("#Byidname").click(function () {
    var id=$("#earnid").val();
    $.ajax({
        url:"/toJsonRedis",
        type:'post',
        dataType:"json",
        contentType:"application/json;charset=utf-8",
        data:JSON.stringify({"id":id}),
        success:function (results) {
            console.log(results);
            var str='<table>'+'<tr>'+'<td>学号</td>'+'<td>名字</td>'+'<td>性别</td>'+'<td>年龄</td>'+'</tr>';
                       str += '<tr>' +
                      '<td>' + results.id + '</td>' +
                      '<td>' + results.name + '</td>' +
                      '<td>' + results.sex + '</td>' +
                      '<td>' + results.age + '</td>' +
                      '</tr>';
              str+='</table>';
            $('#ff').append(str);
        }
    })
});


$(function(){
    $('#tabs a').click(function(e) {
        e.preventDefault();
        $('#tabs li').removeClass("current").removeClass("hoverItem");
        $(this).parent().addClass("current");
        $("#content div").removeClass("show");
        $('#' + $(this).attr('title')).addClass('show');
    });

    $('#tabs a').hover(function(){
        if(!$(this).parent().hasClass("current")){
            $(this).parent().addClass("hoverItem");
        }
    },function(){
        $(this).parent().removeClass("hoverItem");
    });
});

