function ajaxMethod(url,data,successfun,errorfun) {
    $.ajax({
        async: false,
        type : "post",
        ataType:'json',
        data:data,
        url : path+url,
        // complete: function(msg){
        //     alert('complete');
        // },
        success : function(returnData) {
            successfun(returnData);
        },
        error:
            function (returnData) {
                if (errorfun() != null) {
                    errorfun(1);
                }else {
                    alert("系统错误，请重试")
                }
            }
    });
}