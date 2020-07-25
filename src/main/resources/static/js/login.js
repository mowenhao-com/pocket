

$(function(){
	//手机号码登录按钮事件
	$("#phone").click(function(){
		$(".div1").hide();
		$(".div3").hide();
		$(".div2").show();
	});
	
	//账号密码登录按钮事件
	$("#userName").click(function(){
		$(".div2").hide();
		$(".div3").hide();
		$(".div1").show();
	});
	//注册登录按钮事件
	$("#register").click(function(){
		$(".div1").hide();
		$(".div2").hide();
		$(".div3").show();
	});
	 
	 //账号密码登录
	 $("#UserNameLogin").click(function(){
	 	var userName1 = $(" input[ name='userName' ] ").val();
		var password1 = $(" input[ name='password' ] ").val();
		debugger
	 	$.ajax({
	 	    url: "http://127.0.0.1:3600/user/loginAndUserName",
	 	    data: {
				userName: userName1,
				password: password1,
			},
	 	    type: "POST",
	 	    dataType: "json",
	 	    success: function(data) {
	 	        console.log(data)
	 	    }
	 	});
	 });
})