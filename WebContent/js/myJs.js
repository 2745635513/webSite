/**
 * 
 */
function fun_showTime() {
		window.setInterval('fun_getTime()', 1000);
		 fun_create_code();
	}
function fun_getTime() {
		var date = new Date();
		document.getElementById('time_span').innerText = date;
	}
function fun_valid() {
	var v_name = document.getElementsByName("name")[0].value;
	if(v_name == '') {
		alert('用户名为空');
		return false;
		
	}
	if(v_name.length < 6 || v_name.length > 18) {
		alert('用户名应为大于6位小于18位');
		return false;
	}
	
	
	var v_pass = document.getElementsByName("pass")[0].value;
	if(v_pass == '') {
		alert('密码为空');
		return false;
		
	}
	if(v_name.length < 6 || v_name.length > 14) {
		alert('密码应为大于6位小于18位');
		return false;
	}

	var v_pass2 = document.getElementsByName("pass2")[0].value;
	if(v_pass2  != v_pass) {
		alert('确认密码应与密码一致');
		return false;
		
	}
	
	var v_que = document.getElementsByName("que")[0].value;
	if(v_pass == '') {
		alert('密码问题为空');
		return false;
		
	}
	if(v_name.length < 6 || v_name.length > 14) {
		alert('密码应为大于6位小于18位');
		return false;
	}
	
	var v_que = document.getElementsByName("que")[0].value;
	if(v_pass == '') {
		alert('密码答案为空');
		return false;
		
	}
	if(v_name.length < 6 || v_name.length > 14) {
		alert('密码答案应为大于6位小于18位');
		return false;
	}
	
	var v_email = document.getElementsByName("email")[0].value;
	if(v_pass == '') {
		alert('电子邮箱为空');
		return false;
		
	}
	
	//a@b.com
	//asdf@hotmail
	//正则表达式{1，}<=>+,=>一个或者多个
	var regexp = /^[a-zA-Z]+[@][a-zA-Z]+[.][a-zA-Z][.\w]*$/g;
	if(!regexp.test(v_email)){
		alert('邮箱格式应为常用的邮箱格式');
	}
	
	var v_realname = document.getElementsByName("realname")[0].value;
	if(v_realname == '') {
		alert('真实姓名为空');
		return false;
		
	}
	
	var v_iden = document.getElementsByName("iden")[0].value;
	if(v_iden == '') {
		alert('身份证号为空');
		return false;
		
	}
	
	var v_tel = document.getElementsByName("tel")[0].value;
	if(v_tel == '') {
		alert('手机为空');
		return false;
		
	}
	
	var v_area = document.getElementsByName("area")[0].value;
	if(v_area == '') {
		alert('地区为空');
		return false;
		
	}
	
	var v_area_city = document.getElementsByName("area_city")[0].value;
	if(v_area_city == '') {
		alert('市为空');
		return false;
		
	}
	
	var v_area_city2 = document.getElementsByName("area_city2")[0].value;
	if(v_area_city2 == '') {
		alert('县为空');
		return false;
		
	}
	
	var v_address = document.getElementsByName("address")[0].value;
	if(v_address == '') {
		alert('地址为空');
		return false;
		
	}
	
	var v_post = document.getElementsByName("post")[0].value;
	if(v_post == '') {
		alert('邮编为空');
		return false;
		
	}
	
	var v_yan = document.getElementsByName("yan")[0].value;
	var v_yan_gen = document.getElementsByName("yan_gen")[0].value;
	if(v_yan != v_yan_gen) {
		alert('验证不正确');
		return false;
		
	}
	
	
	
	return true;
}

var cities = new Array();
cities["河南"] = ["郑州","开封"];
cities["直辖市"] = ["上海","重庆"];
//
var cities2 = new Array();
cities2["郑州"] = ["郑州1","郑州2"];
cities2["开封"] = ["开封1","开封2"];
cities2["上海"] = ["上海1","上海2"];
cities2["重庆"] = ["重庆1","重庆2"];

function fun_create_city () {
	//定位城市，并且只保留第一项，其他项都清空
	document.getElementsByName("area_city")[0].options.length = 1;
	//确定要添加那个市的县
	var selectedPron = document.getElementsByName("area")[0].value;
	//确定向当前省添加所所对应的城市
	for (var index in cities[selectedPron]) { 
		var v = cities[selectedPron][index];
		var o = new Option(v,v);
		document.getElementsByName("area_city")[0].options.add(o);
	}
}

function fun_create_city2 () {
	//定位城市，并且只保留第一项，其他项都清空
	document.getElementsByName("area_city2")[0].options.length = 1;
	//确定要添加那个市的县
	var selectedPron = document.getElementsByName("area_city")[0].value;
	//确定向当前省添加所所对应的城市
	for (var index in cities2[selectedPron]) { 
		var v = cities2[selectedPron][index];
		var o = new Option(v,v);
		document.getElementsByName("area_city2")[0].options.add(o);
	}
}



function fun_create_code() {
	//[0,9000]=>[0,8999]
	//[0,8999] + 1000 =>[1000,9999]
	var v_yan = parseInt(Math.random() * 9000 + 1000);
	document.getElementsByName("yan_gen")[0].value = v_yan;
	
}