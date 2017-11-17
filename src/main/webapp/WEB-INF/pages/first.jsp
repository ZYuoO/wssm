<%@ page contentType="text/html; charset=utf-8"%>
<html>
<head>
   <%@ include file="/common/common.jsp" %>
</head>
<body>
<div id="bg" >
   <form role="form" id="createUser">
         <div class="mycenter">
            <div class="mysign">
               <div class="col-lg-11 text-center text-info">
                  <h2>请登录</h2>
               </div>
               <div class="col-lg-10">
                  <input type="text" class="form-control" name="userId" placeholder="请输入账户名" required autofocus/>
               </div>
               <div class="col-lg-10"></div>
               <div class="col-lg-10">
                  <input type="password" class="form-control" name="password" placeholder="请输入密码" required autofocus/>
               </div>
               <div class="col-lg-10"></div>
               <div class="col-lg-10 mycheckbox checkbox">
                  <input type="checkbox" class="col-lg-1" style="margin-left: 20px;">记住密码</input>
               </div>
               <div class="col-lg-10"></div>
               <div class="col-lg-10">
                  <button type="button" class="btn btn-success col-lg-12" onclick="login();">登录</button>
               </div>
            </div>
         </div>
   </form>
</div>
</body>
<script>
    function login() {
        ajaxMethod("/test/test.do",$('#createUser').serialize(),
            function (returnData) {
            if (returnData.code=="0000"){
                window.location.href=path+'/toJsp/goMainPage.do';
            }else {
                alert("系统错误")
            }
            }
        );
    }
</script>
</html>