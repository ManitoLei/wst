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
</head>

<body class="content-pages-body">
	<div class="content-pages-wrap">
		<div class="commonTitle">
			<h2>&gt;&gt; 所级领导名录管理 - 领导名录详细信息</h2>
		</div>
		<table border="0" cellspacing="1" cellpadding="0" class="commonTable">
			<form id="institutionCreat" name="institutionCreat" action=""
				method="post">
				<tr>
					<td width="12%" align="right" class="title">填表人姓名：</td>
					<td width="21%" align="left">${leader.formFillingMan }</td>
					<td width="12%" align="right" class="title">填表人电话：</td>
					<td width="21%" align="left">${leader.linkTel }</td>
					<td width="12%" align="right"></td>
					<td align="left"></td>
				</tr>
				<tr>
					<td width="16%" align="right" class="title"><span
						class="required">*</span>领导姓名：</td>
					<td width="17%" align="left">${leader.leaderName }</td>
					<td width="16%" class="title" align="right"><span
						class="required">*</span>性别：</td>
					<td width="17%" align="left">${leader.gender }</td>
					<td width="15%" align="right" class="title"><span
						class="required">*</span>民族：</td>
					<td width="19%" align="left">${leader.folk }</td>
				</tr>
				<tr>
					<td align="right" class="title">出生年月：</td>
					<td align="left">${leader.birthDate }</td>
					<td align="right" class="title">政治面貌：</td>
					<td align="left">${leader.pol }</td>
					<td align="right" class="title"><span class="required">*</span>学历：</td>
					<td align="left">${leader.edu }</td>
				</tr>
				<tr>
					<td align="right" class="title">学位：</td>
					<td align="left">${leader.degree }</td>
					<td align="right" class="title">职务：</td>
					<td align="left">${leader.manageJob }</td>
					<td align="right" class="title">职级：</td>
					<td align="left">${leader.title }</td>
				</tr>
				<tr>
					<td align="right" class="title">备注 ：</td>
					<td align="left" colspan="5">${leader.memo }</td>
				</tr>
			</form>
		</table>
		<!--//commonTable-->
		<div id="formPageButton">
			<ul>
				<li><a href="leadership-creat.jsp" title="修改" class="btnShort">修改</a></li>
				<li><a href="javascript:window.history.go(-1)" title="返回"
					class="btnShort">返回</a></li>
			</ul>
		</div>
		<!--//commonToolBar-->
		<!--//commonToolBar-->
		<!--//commonTableSearch-->
		<!--//commonTable-->
	</div>
	<!--//content pages wrap-->
</body>
</html>
