<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<link href="css/myCss.css" rel="stylesheet"/>
<script src="js/myJs.js">
</script>
<style>
body {
	background-image:url(img/back.png);
}
</style>
</head>
<body onload="fun_showTime()">
<form action="UserServlet" method="post" onsubmit="return fun_valid();">

<table align="center" class="table" cellpadding="0">
	<tr>
		<td class="center" colspan="2" >
		<span class="title"><b>用户注册</b></span>
		</td>
	</tr>
	<tr>
	<td  class="small">
	欢迎来到大米手机商城<span id="time_span"></span>
	</td>
	<td></td>
	</tr>
	<tr>
		<td class="right">
		用&nbsp;&nbsp;户：
		</td>
		<td>
			<input name="name" class="dash"/>&nbsp;<span class="red">*</span>&nbsp;&nbsp;用户名应大于6位小于18位
		</td>
	</tr>
	
	
	<tr>
		<td class="right">
		密&nbsp;&nbsp;码：
		</td>
		<td>
			<input name="pass" type="password" class="dash"/>&nbsp;<span class="red">*</span>&nbsp;&nbsp;密码应大于6位小于14位
		</td>
	</tr>
	
	<tr>
		<td class="right">
		确认密码：
		</td>
		<td>
			<input name="pass2" type="password" class="dash"/>&nbsp;<span class="red">*</span>&nbsp;&nbsp;确认密码应与密码一致
		</td>
	</tr>
	
	<tr>
		<td class="right">
		密码问题：
		</td>
		<td>
			<input name="que" class="dash"/>&nbsp;<span class="red">*</span>&nbsp;&nbsp;密码问题应大于6位小于18位
		</td>
	</tr>
	
	<tr>
		<td class="right">
		密码回答：
		</td>
		<td>
			<input name="ans" class="dash"/>&nbsp;<span class="red">*</span>&nbsp;&nbsp;密码问题应大于6位小于18位
		</td>
	</tr>
	
	<tr>
		<td class="right">
		电子邮箱：
		</td>
		<td>
			<input name="email" class="dash"/>&nbsp;<span class="red">*</span>&nbsp;&nbsp;邮箱格式应为邮箱常用地址
		</td>
	</tr>
	
	<tr>
		<td class="right">
		真实姓名：
		</td>
		<td>
			<input name="realname" class="dash"/>&nbsp;<span class="red">*</span>
		</td>
	</tr>
	
	<tr>
		<td class="right">
		性&nbsp;&nbsp;别：
		</td>
		<td>
			<input type="radio" name="sex"   value="男" checked/>男
			<input type="radio"  name="sex" value="女"/>女
			<input type="radio" name="sex"  value="null"/>保密
		</td>
	</tr>
	
	<tr>
		<td class="right">
		身份证号：
		</td>
		<td>
			<input name="iden" class="dash"/>&nbsp;<span class="red">*</span>
		</td>
	</tr>
	
	<tr>
		<td class="right">
		手&nbsp;&nbsp;机：
		</td>
		<td>
			<input name="tel" class="dash"/>&nbsp;<span class="red">*</span>
		</td>
	</tr>
	
	<tr>
		<td class="right">
		地&nbsp;&nbsp;区：
		</td>
		<td>
			<select name="area" onchange="fun_create_city ()">
			<option value="" >请选择</option>
				<option value="河南">河南</option>
				<option value="直辖市">直辖市</option>
				
			</select>		
			<select name="area_city" onchange="fun_create_city2 ()">
			<option value="">请选择</option>
			</select>
			<select name="area_city2" >
			<option value="">请选择</option>
			</select>
			</td>
	</tr>
	
	<tr>
		<td class="right">
		详细地址：
		</td>
		<td>
			<input name="address" class="dash"/>&nbsp;<span class="red">*</span>
		</td>
	</tr>
	
	<tr>
		<td class="right">
		邮政编码：
		</td>
		<td>
			<input name="post" class="dash"/>&nbsp;<span class="red">*</span>
		</td>
	</tr>
	
	<tr>
		<td class="right">
		验&nbsp;&nbsp;证：
		</td>
		<td>
			<input name="yan" class="dash_short"/>&nbsp;<span class="red">*</span>&nbsp;<input type="button" name="yan_gen" onclick="fun_create_code()"/>
		</td>
	</tr>
	
	<tr>
		<td class="center" colspan="2">
		<input type="submit" value="提交"/>&nbsp;
		<input type="reset" value="重置"/>
		</td>

	</tr>
		
</table>
<input type="hidden" name="flg" value="add"/>
</form>
</body>
</html>