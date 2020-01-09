<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" isELIgnored="false"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=7" />
<title>江苏省卫生监督业务系统</title>
<link href="css/main.css" rel="stylesheet" type="text/css" media="all" />
<script language="javascript" src="js/jquery-1.4.2.min.js"
	type="application/javascript"></script>
</head>

<body>
	<div id="header">
		<div class="logo-title">
			<h1>江苏省卫生监督业务系统</h1>
		</div>
		<div class="logout user-icon">
			欢迎登录，<span class="user-text">管理员:${username }</span> [<span class="signout-text"><a
				href="javascript:void(0);"
				onclick="window.opener=null; window.parent.close();" title="退出系统">退出系统</a></span>]
		</div>
	</div>
</body>
</html>
