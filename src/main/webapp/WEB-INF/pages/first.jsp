<%@ page contentType="text/html; charset=utf-8"%>
<html>
<head>
   <%@ include file="/common/common.jsp" %>
</head>
<body>
<div id="bg" style="width: 100px;height: 100px">
<img src="<%=path%>/images/background.jpg">
</div>
</body>
<script>
    $(function(){
        $.ajax({
            type: "POST",
            url: "http://localhost:8080/test/test.do",
            success: function(data){
                alert("111");
            }
    });
    });
</script>
</html>