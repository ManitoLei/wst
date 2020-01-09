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
<link href="<%=basePath %>css/main.css" rel="stylesheet" type="text/css"
	media="all" />
<script src="<%=basePath %>js/jquery-1.4.2.min.js" type="text/javascript"></script>
<script language="javascript">
<!--
$().ready(function(){
	$(".btnShort").click(function(){$(".content-wrap-box").show()})
});
-->
</script>
<script type="text/javascript">
	
	function formsubmit() {
		
		var flag=0;
		
		//登录名:必填状态
		if($("#username").val()==""){
			$("#username").css("border","1px solid red");
			flag=1;//return;
		}else {
			$("#username").css("border","1px solid black");
		}
		//密码:必填状态
		if($("#password").val()==""){
			$("#password").css("border","1px solid red");
			flag=1;//return;
		}else {
			$("#password").css("border","1px solid black");
		}
		//确认密码:必填状态
		if($("#repassword").val()==""){
			$("#repassword").css("border","1px solid red");
			flag=1;//return;
		}else {
			$("#repassword").css("border","1px solid black");
		}
		if($("#password").val()!=$("#repassword").val() || $("#password").val()==""){
			$("#password").css("border","1px solid red");
			$("#repassword").css("border","1px solid red");
			flag=1;//return;
		}else {
			$("#password").css("border","1px solid black");
			$("#repassword").css("border","1px solid black");
		}
		
		
		
		if(flag==1){
			return;
		}
		//return;
		$("#institutionCreat").submit();
	}
</script>
</head>

<body class="content-pages-body">
	<div class="content-pages-wrap">
		<div class="commonTitle">
			<h2>
				&gt;&gt; <a href="userid-list.html">登录号管理</a> - 登录号创建
			</h2>
		</div>
		<table border="0" cellspacing="1" cellpadding="0" class="commonTable">
			<form id="institutionCreat" name="institutionCreat" action="<%=basePath%>userservlet?type=create"
				method="post">
				<tr>
					<td width="15%" align="right">科室：</td>
					<td width="35%"><input name="sectionroom" type="text"
						class="inputTextMiddle inputTextReadonly" id="sectionroom"
						value="办公室" readonly="readonly" /></td>
					<td width="15%" align="right">姓名：</td>
					<td><input name="name" type="text"
						class="inputTextNormal inputTextReadonly" id="name"
						value="<%=request.getParameter("repManName") %>" readonly="readonly" /></td>
				</tr>
			<!-- </form> -->
		</table>
		<div class="content-wrap-box">
			<table border="0" cellspacing="1" cellpadding="0" class="commonTable">
			<!-- 	<form id="useridCreat" name="useridCreat" action="" method="post"> -->
					<tr>
						<td width="15%" align="right"><span class="required">*</span>登录名：</td>
						<td width="35%" align="left"><input name="username"
							type="text" class="inputTextNormal" id="username" /></td>
						<td width="15%" align="right">描述：</td>
						<td align="left"><input name="desc" type="text"
							class="inputTextNormal" id="desc" /></td>
					</tr>
					<tr>
						<td align="right"><span class="required">*</span>密码：</td>
						<td align="left"><input name="password" type="text"
							class="inputTextNormal" id="password" /></td>
						<td align="right"><span class="required">*</span>确认密码：</td>
						<td align="left"><input name="repassword" type="text"
							class="inputTextNormal" id="repassword" /></td>
					</tr>
				</form>
			</table>
			<!--//commonTable-->
			<div id="formPageButton">
				<ul>
					<li><a href="userid-list.jsp" title="保存" class="btnShort">保存</a></li>
					<li><a href="javascript:void(0)" onclick="formsubmit()"
					title="提交" class="btnShort">提交</a></li>
					<li><a href="javascript:window.history.go(-1)" title="返回"
						class="btnShort">返回</a></li>
				</ul>
			</div>
			<!--//commonToolBar-->
		</div>
	</div>
	<!--//content pages wrap-->
</body>
</html>
