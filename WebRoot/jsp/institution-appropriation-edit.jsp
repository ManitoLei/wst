<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

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
				&gt;&gt; <a href="institution-list.jsp">机构管理</a> - 机构财政拨款
			</h2>
		</div>
		<table border="0" cellspacing="1" cellpadding="0" class="commonTable">
			<form id="institutionCreat" name="institutionCreat" action=""
				method="post">
				<tr>
					<td rowspan="2" align="right">选择年度：</td>
					<td rowspan="2" align="left"><input name="textfield2"
						type="text" class="inputTextNormal" id="textfield2" value="2010" /></td>
					<td align="right">人员经费（万元）：</td>
					<td align="left"><input name="textfield7" type="text"
						class="inputTextNormal" id="textfield7" value="305.26" /></td>
					<td align="right">公务费（万元）：</td>
					<td align="left"><input name="textfield" type="text"
						class="inputTextNormal" id="textfield" value="1020.08" /></td>
				</tr>
				<tr>
					<td align="right">业务经费（万元）：</td>
					<td align="left"><input name="textfield9" type="text"
						class="inputTextNormal" id="textfield9" value="2089.82" /></td>
					<td align="right">基本建设资金（万元）：</td>
					<td align="left"><input name="textfield9" type="text"
						class="inputTextNormal" id="textfield9" value="6122.37" /></td>
				</tr>
			</form>
		</table>
		<!--//commonTable-->
		<div id="formPageButton">
			<ul>
				<li><a href="institution-view.jsp" title="保存" class="btnShort">保存</a></li>
				<li><a href="javascript:window.history.go(-1)" title="返回"
					class="btnShort">返回</a></li>
			</ul>
		</div>
		<!--//commonToolBar-->
	</div>
	<!--//content pages wrap-->
</body>
</html>
