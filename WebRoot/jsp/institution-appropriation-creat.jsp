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
<link href="<%=basePath %>css/main.css" rel="stylesheet" type="text/css" media="all" />
<script src="<%=basePath %>js/jquery-1.4.2.min.js" type="text/javascript"></script>
<script type="text/javascript">
	function formsubmit() {
	
		$("#institutionCreat").submit();
	}
</script>
</head>

<body class="content-pages-body">


	<div class="content-pages-wrap">
		<div class="commonTitle">
			<h2>
				&gt;&gt; <a href="institution-list.jsp">机构管理</a> - 机构财政拨款
			</h2>
		</div>
		<table border="0" cellspacing="1" cellpadding="0" class="commonTable">
			<form id="institutionCreat" name="institutionCreat" action="<%=basePath%>fundservlet?type=create&orgid=<%=request.getParameter("orgid") %>&orgname=<%=request.getParameter("orgname") %>&orgno=<%=request.getParameter("orgno") %>&orgcode=<%=request.getParameter("orgcode") %>" method="post">
				<tr>
					<td rowspan="2" align="right"><span class="required">*</span>选择年度：</td>
					<td rowspan="2" align="left"><select name="yearly" id="yearly">
							<option value="2020">2020</option>
							<option value="2019">2019</option>
							<option value="2018">2018</option>
							<option value="2017">2017</option>
							<option value="2015">2015</option>
							<option value="2014">2014</option>
							<option value="2013">2013</option>
							<option value="2012">2012</option>
							<option value="2011">2011</option>
							<option value="2010">2010</option>
					</select></td>
					<td align="right">人员经费（万元）：</td>
					<td align="left"><input name="preFund" type="text"
						class="inputTextNormal" id="preFund" /></td>
					<td align="right">公务费（万元）：</td>
					<td align="left"><input name="businessFund" type="text"
						class="inputTextNormal" id="businessFund" /></td>
				</tr>
				<tr>
					<td align="right">业务经费（万元）：</td>
					<td align="left"><input name="dutyFund" type="text"
						class="inputTextNormal" id="dutyFund" /></td>
					<td align="right">基本建设资金（万元）：</td>
					<td align="left"><input name="buildFund" type="text"
						class="inputTextNormal" id="buildFund" /></td>
				</tr>
			</form>
		</table>
		<!--//commonTable-->
		<div id="formPageButton">
			<ul>
				<li><a href="institution-view.jsp" title="保存" class="btnShort">保存</a></li>
				<li><a href="javascript:void(0)" onclick="formsubmit()"
					title="提交" class="btnShort">提交</a></li>
				<li><a href="javascript:window.history.go(-1)" title="返回"
					class="btnShort">返回</a></li>
			</ul>
		</div>
		<!--//commonToolBar-->
	</div>
	<!--//content pages wrap-->
</body>
</html>
