<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>登陆界面</title>
<style>
body {
	background-image:url(img/back4.png);
	text-align:center;
	margin-top:200px;
}
</style>

</head>
<body>
	<h1>请输入您的姓名和密码</h1>
	<form method="post" action="UserServlet">
		姓名：<input name="name"/>
		<br><br>
		密码：<input type="password" name="pass"/>
		<br><br>
		<input type="hidden" name="flg" value="log"/>
		<br>
		<input type="submit" value="提交"/>
	</form>
</body>
</html>