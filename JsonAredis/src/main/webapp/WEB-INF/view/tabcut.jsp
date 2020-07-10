<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/7/9 0009
  Time: 14:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="/css/tabcutMore.css"/>
</head>
<body>
<div class="tab-contain">
    <!-- tab栏 -->
    <ul id="tabs">
        <li class="current"><a href="#" rel="external nofollow" title="tab1">One</a></li>
        <li><a href="#"  rel="external nofollow" title="tab2">Two</a></li>
        <li><a href="#"  rel="external nofollow" title="tab3">Three</a></li>
        <li><a href="#" rel="external nofollow" title="tab4">Four</a></li>
    </ul>
    <!-- 对应显示内容 -->
    <div id="content">
        <div id="tab1" class="item show">
            <h2>title 11111</h2>
            <p>text here!!!text here!!!text here!!!text here!!!text here!!!</p>
            <p>text here!!!text here!!!text here!!!text here!!!text here!!!text here!!!text here!!!text here!!!text here!!!text here!!!</p>
        </div>
        <div id="tab2" class="item">
            <h2>title 2222</h2>
            <p>text here!!!text here!!!text here!!</p>
            <p>text here!!!text here!!!text here!!!text here!text here!!!text here!!!text here!!!</p>
        </div>
        <div id="tab3" class="item">
            <h2>title 33333</h2>
            <p>text here!!!</p>
            <p>text here!!!text here!!!text here!!!text here!!!text here!!!text here!!!text here!!!text here!!!text here!!!text here!!!</p>
        </div>
        <div id="tab4" class="item">
            <h2>title 44444</h2>
            <p>text here!!!text here!!!text here!!!text here!!!text here!!!</p>
            <p>text here!!!text </p>
        </div>
    </div>
</div>
<script src="http://libs.baidu.com/jquery/1.10.2/jquery.min.js"></script>
<script type="text/javascript" src="/js/Json.js"></script>
</body>
</html>
