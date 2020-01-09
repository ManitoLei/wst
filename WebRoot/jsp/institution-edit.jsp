<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
<link href="../css/main.css" rel="stylesheet" type="text/css"
	media="all" />
<script src="../js/jquery-1.4.2.min.js" type="text/javascript"></script>
</head>

<body class="content-pages-body">
	<div class="content-pages-wrap">
		<div class="commonTitle">
			<h2>
				&gt;&gt; <a href="institution-list.html">机构管理</a> - 机构更新
			</h2>
		</div>
		<table border="0" cellspacing="1" cellpadding="0" class="commonTable">
			<form id="institutionCreat" name="institutionCreat" action=""
				method="post">
				<tr>
					<td align="right">机构编码：</td>
					<td align="left"><input name="textfield" type="text"
						class="inputTextNormal" id="textfield" value="0123456-01" /><span
						class="required">*</span></td>
					<td align="right">机构名称：</td>
					<td align="left"><input name="textfield2" type="text"
						class="inputTextMiddle" id="textfield2" value="江苏省卫生监督所" /><span
						class="required">*</span></td>
					<td align="right">行政类别：</td>
					<td align="left"><input name="radio1" type="radio" id="radio5"
						value="radio5" checked="checked" />行政部门 <input type="radio"
						name="radio1" id="radio6" value="radio6" />卫生监督机构 <input
						type="radio" name="radio1" id="radio7" value="radio7" />协作单位 <span
						class="required">*</span></td>
				</tr>
				<tr>
					<td align="right">地址</td>
					<td colspan="3" align="left"><input name="textfield5"
						type="text" class="inputTextLong" id="textfield5"
						value="南京市中央路42号" /></td>
					<td align="right">邮编</td>
					<td align="left"><input name="textfield4" type="text"
						class="inputTextNormal" id="textfield4" value="210008" /></td>
				</tr>
				<tr>
					<td align="right">挂牌日期：</td>
					<td align="left"><input name="textfield6" type="text"
						class="inputTextNormal" id="textfield6" value="2010-2-2" /></td>
					<td align="right">独立运行日期：</td>
					<td align="left"><input name="textfield7" type="text"
						class="inputTextNormal" id="textfield7" value="2010-2-2" /></td>
					<td align="right">行政区类别：</td>
					<td align="left"><input name="radio" type="radio" id="radio1"
						value="radio1" checked="checked" />省 <input type="radio"
						name="radio" id="radio2" value="radio2" />市 <input type="radio"
						name="radio" id="radio3" value="radio3" />县 <input type="radio"
						name="radio" id="radio4" value="radio4" />区 <span
						class="required">*</span></td>
				</tr>
				<tr>
					<td align="right">在职人数：</td>
					<td align="left"><input name="textfield8" type="text"
						class="inputTextNormal" id="textfield8" value="210" /></td>
					<td align="right">卫生监督员数：</td>
					<td align="left"><input name="textfield9" type="text"
						class="inputTextNormal" id="textfield9" value="128" /></td>
					<td align="left">&nbsp;</td>
					<td align="left">&nbsp;</td>
				</tr>
			</form>
		</table>
		<!--//commonTable-->
		<div id="formPageButton">
			<ul>
				<li><a href="institution-list.jsp" title="保存" class="btnShort">保存</a></li>
				<li><a href="javascript:window.history.go(-1)" title="返回"
					class="btnShort">返回</a></li>
			</ul>
		</div>
		<!--//commonToolBar-->
	</div>
	<!--//content pages wrap-->
</body>
</html>
