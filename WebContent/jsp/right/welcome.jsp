<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>Insert title here</title>
</head>
<body>
<!-- 使用EL表达式获取session的对象值，来源在UserAction.java的getMain方法 -->
	<h2>欢迎${user.userName }来到户籍管理系统</h2>
<!-- 	<a href="../../huji/qwe">点我测试</a> -->
</body>
</html>