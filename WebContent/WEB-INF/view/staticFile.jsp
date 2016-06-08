<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>静态文件</title>
</head>
<body>
<h>图片访问</h>
<div>    
<img alt="图片" src="../img/struts2.png"><!-- 拿不到图片，被拦截而没有返回结果 -->
</div>
</body>
</html>