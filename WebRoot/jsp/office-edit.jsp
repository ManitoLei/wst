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
			<h2>
				&gt;&gt; <a href="office-list.html">科室管理</a> - 科室更新
			</h2>
		</div>
		<table border="0" cellspacing="1" cellpadding="0" class="commonTable">
			<form id="institutionCreat" name="institutionCreat" action=""
				method="post">
				<tr>
					<td align="right">机构名称：</td>
					<td colspan="5" align="left"><input name="textfield"
						type="text" class="inputTextLong inputTextReadonly" id="textfield"
						readonly="readonly" value="江苏省卫生监督所" /><span class="required">*</span></td>
				</tr>
				<tr>
					<td align="right">科室编码：</td>
					<td align="left"><input name="textfield3" type="text"
						class="inputTextNormal" id="textfield3" value="0123456-01-232323" /><span
						class="required">*</span></td>
					<td align="right">科室名称：</td>
					<td align="left"><input name="textfield4" type="text"
						class="inputTextMiddle" id="textfield4" value="办公室" /><span
						class="required">*</span></td>
					<td align="right"><span class="required">*</span>是否为分所：</td>
					<td align="left"><input type="radio" name="myradio" value=""
						checked />是<input type="radio" name="myradio" value="" />否</td>
				</tr>
				<tr>
					<td align="right">电话号码：</td>
					<td align="left"><input name="textfield6" type="text"
						class="inputTextNormal" id="textfield6" value="025-83620785" /></td>
					<td align="right">传真号码：</td>
					<td align="left"><input name="textfield7" type="text"
						class="inputTextNormal" id="textfield7" value="025-83620785" /></td>
					<td align="right">门号：</td>
					<td align="left"><input name="textfield2" type="text"
						class="inputTextNormal" id="textfield2" value="501" /></td>
				</tr>
			</form>
		</table>
		<!--//commonTable-->
		<div id="formPageButton">
			<ul>
				<li><a href="office-list.html" title="保存" class="btnShort">保存</a></li>
				<li><a href="javascript:window.history.go(-1)" title="返回"
					class="btnShort">返回</a></li>
			</ul>
		</div>
		<!--//commonToolBar-->
	</div>
	<!--//content pages wrap-->
</body>
</html>
