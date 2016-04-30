<%@ page contentType="text/html;charset=UTF-8"%>
<%@ page
	import="org.apache.shiro.web.filter.authc.FormAuthenticationFilter"%>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>分布式精细农业监测系统</title>
<style type="text/css">
@charset "utf-8";

html, body {
	margin: 0;
	padding: 0;
	width: 100%;
}

body {
	font-size: 12px;
	font-family: "微软雅黑";
	color: #333;
	line-height: 160%;
	background: url(images/login-bg.jpg) center top repeat-x #FFF;
	height: 100%;
}

p, ul, .name, .pwd, dd, h1, h2, h3, form, input, select, textarea {
	margin: 0;
	padding: 0;
	border: 0;
	font-family: "微软雅黑";
	line-height: 150%;
}

ul, li {
	list-style: none;
}

div, p {
	word-wrap: break-word;
}

img {
	border: none;
}

input, button, select, textarea {
	outline: none
}

/*login*/
.login {
	padding: 1px 0 0 0;
	background: url(${ctxStatic}/images/login-bg.jpg) center top no-repeat
		#FFF;
	padding: 150px 0 0 0;
}

.login input.submit {
	border: none;
	font-weight: bold;
	color: #FFF;
	margin: 25px 0 0 150px;
	-webkit-border-radius: 3px;
	-moz-border-radius: 3px;
	border-radius: 3px;
	-webkit-box-shadow: #CCC 0px 0px 5px;
	-moz-box-shadow: #CCC 0px 0px 5px;
	box-shadow: #CCC 0px 0px 5px;
	background: #31b6e7;
	cursor: pointer;
}

.login input.submit:hover {
	background: #ff9229;
}

.login input.submit {
	padding: 6px 20px;
}

.login .box {
	position: relative;
	z-index: 100;
	margin: 0 auto;
	width: 700px;
	height: 320px;
	background: url(${ctxStatic}/images/login.png) center top no-repeat;
}

.login .log {
	position: relative;
	width: 370px;
	height: 260px;
	margin: 0 auto;
	padding: 90px 0 0 20px;
}

.login .logo {
	height: 85px;
	position: absolute;
	top: 15px;
	left: 180px;
	background: url(${ctxStatic}/images/logo-login.png) no-repeat;
	width: 350px;
	height: 50px;
}

.login label {
	display: inline-block;
	width: 70px;
	text-align: right;
	padding-right: 20px;
	vertical-align: middle;
}

.login .name {
	padding: 10px 5px;
	font-size: 14px;
}

.login .pwd {
	padding: 10px 5px;
	font-size: 14px;
}

.login .alt {
	position: absolute;
	top: 43px;
	left: 260px;
	font-size: 20px;
}

.login .text {
	filter: alpha(opacity = 80);
	-moz-opacity: 0.8;
	opacity: 0.8;
}

.login .copyright {
	position: absolute;
	left: 0;
	width: 100%;
	bottom: -40px;
	text-align: center;
	color: #AAA;
}

.login .air-balloon {
	position: absolute;
	top: -100px;
	left: -100px;
	z-index: 50;
}

.login .air-balloon.ab-1 {
	width: 43px;
	height: 78px;
	background: url(${ctxStatic}/images/air-balloon-1.png) no-repeat;
}

.login .air-balloon.ab-2 {
	width: 24px;
	height: 31px;
	background: url(${ctxStatic}/images/air-balloon-2.png) no-repeat;
}

.login .footer {
	position: fixed;
	left: 0;
	bottom: 0;
	z-index: -1;
	width: 100%;
	height: 198px;
	background: url(${ctxStatic}/images/login-foot.jpg) center bottom
		repeat-x;
}

.text {
	border: 1px solid #CCC;
	padding: 5px;
	background-color: #FCFCFC;
	line-height: 14px;
	width: 220px;
	font-size: 12px;
	-webkit-border-radius: 4px;
	-moz-border-radius: 4px;
	border-radius: 4px;
	-webkit-box-shadow: #CCC 0px 0px 5px;
	-moz-box-shadow: #CCC 0px 0px 5px;
	box-shadow: #CCC 0px 0px 5px;
	border: 1px solid #CCC;
	font-size: 12px;
}

.text:focus {
	border: 1px solid #31b6e7;
	background-color: #FFF;
	-webkit-box-shadow: #CCC 0px 0px 5px;
	-moz-box-shadow: #CCC 0px 0px 5px;
	box-shadow: #0178a4 0px 0px 5px;
}

.text:hover {
	background-color: #FFF;
}
</style>

<script type="text/javascript">
		$(document).ready(function() {
			$("#loginForm").validate({
				rules: {
					validateCode: {remote: "${pageContext.request.contextPath}/servlet/validateCodeServlet"}
				},
				messages: {
					username: {required: "请填写用户名."},password: {required: "请填写密码."},
					validateCode: {remote: "验证码不正确.", required: "请填写验证码."}
				},
				errorLabelContainer: "#messageBox",
				errorPlacement: function(error, element) {
					error.appendTo($("#loginError").parent());
				} 
			});
			$(window).resize();
		});
		// 如果在框架或在对话框中，则弹出提示并跳转到首页
		if(self.frameElement && self.frameElement.tagName == "IFRAME" || $('#left').length > 0 || $('.jbox').length > 0){
			alert('未登录或登录超时。请重新登录，谢谢！');
			top.location = "${ctx}";
		}
		$(window).resize(function(){
			$('body').height($(window).height());
			var top = $('body').height() / 2 - $('.form-signin').height() / 2 - 39;
			var left = $('body').width() / 2 - $('.form-signin').width() / 2 - 14;
			$('.form-signin').css({'top':top,'left':left});
			$('.footer').css({'top':top+250,'left':left+30});
		});
	</script>
</head>
<body>
	<!--[if lte IE 6]><br/><div class='alert alert-block' style="text-align:left;padding-bottom:10px;"><a class="close" data-dismiss="alert">x</a><h4>温馨提示：</h4><p>你使用的浏览器版本过低。为了获得更好的浏览体验，我们强烈建议您 <a href="http://browsehappy.com" target="_blank">升级</a> 到最新版本的IE浏览器，或者使用较新版本的 Chrome、Firefox、Safari 等。</p></div><![endif]-->
	<div class="header">
		<div id="messageBox"
			class="alert alert-error ${empty message ? 'hide' : ''}">
			<button data-dismiss="alert" class="close">×</button>
			<label id="loginError" class="error">${message}</label>
		</div>
	</div>

	<div class="login">
		<div class="box png">
			<div class="logo png"></div>
			<div class="input">
				<div class="log">

					<form id="loginForm" class="form-signin"
						action="/createbling/f/login" method="post">
						<div class="name">
							<label class="input-label" for="username">用户名</label> <input
								type="text" class="text" id="username" name="username"
								placeholder="用户名" tabindex="1">
						</div>
						<div class="pwd">
							<label class="input-label" for="password">密 码</label> <input
								type="password" class="text" id="password" name="password"
								placeholder="密码" tabindex="2"> <c:if
									test="${isValidateCodeLogin}">
									<div class="validateCode">
										<label class="input-label mid" for="validateCode">验证码</label>
										<sys:validateCode name="validateCode"
											inputCssStyle="margin-bottom:0;" />
									</div>
								</c:if> <input type="submit" class="submit" tabindex="3" value="登录" />
								<label for="rememberMe" title="下次不需要再登录"> <input
									type="checkbox" id="rememberMe" name="rememberMe"
									${rememberMe ? 'checked' : ''} /> 记住我
							</label>
								<div class="check"></div>
						</div>
					</form>
					<div class="tip"></div>
				</div>
			</div>
		</div>
		<div class="air-balloon ab-1 png"></div>
		<div class="air-balloon ab-2 png"></div>
		<div class="footer"></div>
	</div>

	<script type="text/javascript" src="${ctxStatic}/js/jQuery.js"></script>
	<script type="text/javascript" src="${ctxStatic}/js/fun.base.js"></script>
	<script type="text/javascript" src="${ctxStatic}/js/script.js"></script>
	<script src="${ctxStatic}/flash/zoom.min.js" type="text/javascript"></script>
	<div
		style="text-align: center; margin: 50px 0; font: normal 14px/24px 'MicroSoft YaHei';">

		<p>©版权所有：CreateBling团队</p>
	</div>
</body>
</html>