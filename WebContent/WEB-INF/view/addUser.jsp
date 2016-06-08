<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>参数传递</title>
<script type="text/javascript">
function addform(){
	var form=document.forms[0];
	form.action="/springMVC/user/adduser";
	form.method="get";
	form.submit();
	
}
</script>
</head>
<body>
<!-- 方法1 -->
<h>添加用户</h>
<form action="/springMVC10/User/addUser"  method="post">
姓名:<input type="text" name="username"/><!-- name自动与相同字符实例化 -->
密码:<input type="text" name="password"/>
<input type="submit" value="添加" />
</form>
<!-- 方法2 -->
<!-- <h>添加用户</h>
<form action="">
姓名:<input type="text" name="username"/>name自动与相同字符实例化
年龄:<input type="text" name="age"/>
<input type="button" value="添加" onclick="addform"/> -->
</body>
</html>