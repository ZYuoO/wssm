<%@ page contentType="text/html; charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
   <%@ include file="/common/common.jsp" %>

   <title>导航菜单</title>
   <style type="text/css">
      *{margin:0; padding:0; font-size:14px;}
      a{color:#333;text-decoration:none}
      .nav{list-style:none; height:30px; border-bottom:10px solid #F60; margin-top:20px; padding-left:50px;}
      .nav li{float:left}
      .nav li a{display:block; height:30px;text-align:center; line-height:30px; width:80px; background:#efefef; margin-left:1px;}
      .nav li a.on, .nav li a:hover{background:#F60;color:#fff; }
   </style>
</head>
<body>
<ul class="nav">
   <li><a class="on" href="#">首　　页</a></li>
   <li><a href="#">关于我们</a></li>
   <li><a href="#">产品展示</a></li>
   <li><a href="#">售后服务</a></li>
   <li><a href="#">联系我们</a></li>
</ul>
</body>
</html>
