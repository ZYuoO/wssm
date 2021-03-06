<%
    String path = request.getContextPath();
    String basePath = "";
    String port = String.valueOf(request.getServerPort());
    if("80".equals(port)){
        basePath = request.getScheme() + "://" + request.getServerName() + path + "/";
    }else{
        basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()+ path + "/";
    }
    request.setAttribute("path", path);
    request.setAttribute("basePath", basePath);
%>
<script type="text/javascript">
    var path = "<%=request.getContextPath()%>";
    var basePath = "<%=basePath%>";
</script>

    <%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
    <%--<meta name="viewport" content="width=device-width, initial-scale=1.0">--%>
    <!-- 新 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css">

    <!-- 可选的Bootstrap主题文件（一般不用引入） -->
    <link rel="stylesheet" href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">

    <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
    <script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>

    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

    <script type="text/javascript" src="../javascript/AjaxUtils.js" ></script>