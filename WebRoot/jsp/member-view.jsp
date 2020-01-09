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
				&gt;&gt; <a href="member-list.html">人员管理</a> - 人员信息
			</h2>
		</div>
		<table border="0" cellspacing="1" cellpadding="0" class="commonTable">
			<form id="institutionCreat" name="institutionCreat" action=""
				method="post">
				<tr>
					<td width="12%" class="title">人员编码</td>
					<td width="21%">${stuff.sectionId }</td>
					<td width="12%" class="title">姓名</td>
					<td width="21%">${stuff.repManName }</td>
					<td width="12%" class="title">性别</td>
					<td>${stuff.gender }</td>
				</tr>
				<tr>
					<td class="title">出生年月：</td>
					<td>${stuff.birthDate }</td>
					<td class="title">民族：</td>
					<td>${stuff.folk }</td>
					<td class="title">政治面貌：</td>
					<td>${stuff.pol }</td>
				</tr>
				<tr>
					<td class="title">手机：</td>
					<td>${stuff.mobile }</td>
					<td class="title">电话：</td>
					<td>${stuff.workTel }</td>
					<td class="title">电子邮件：</td>
					<td>${stuff.email }</td>
				</tr>
				<tr>
					<td class="title">学历：</td>
					<td>${stuff.edu }</td>
					<td class="title">毕业学校：</td>
					<td>${stuff.graCollege }</td>
					<td class="title">所选专业：</td>
					<td>${stuff.choiceSpe }</td>
				</tr>
				<tr>
					<td class="title">所学专业类型：</td>
					<td>${stuff.spe }</td>
					<td class="title">建所前从事专业：</td>
					<td>${stuff.beforeSpe }</td>
					<td class="title">何时参加工作：</td>
					<td>${stuff.beginWorkDate }</td>

				</tr>
				<tr>
					<td class="title">职务：</td>
					<td>${stuff.manageJob }</td>
					<td class="title">职级：</td>
					<td>${stuff.manageJob }</td>
					<td class="title">职称：</td>
					<td>${stuff.title }</td>
				</tr>
				<tr>
					<td class="title">何时进卫生监督所：</td>
					<td>${stuff.getInDate }</td>
					<td class="title">人员性质：</td>
					<td>${stuff.perPro }</td>
					<td class="title">类型：</td>
					<td>${stuff.perType }</td>
				</tr>
				<tr>
					<td class="title">行政执法证号：</td>
					<td>${stuff.enfCardNo }</td>
					<td class="title">何时取得行政执法证：</td>
					<td>${stuff.getCardDate }</td>
					<td class="title">卫生监督胸牌号：</td>
					<td>${stuff.healthCardNo }</td>
				</tr>
				<tr>
					<td class="title">何时取得卫生监督员资格：</td>
					<td>${stuff.getQuaDate }</td>
					<td class="title">目前持有有效的监督员证号：</td>
					<td>${stuff.perCode }</td>
					<td class="title">目前所持有效监督员证的有效时间：</td>
					<td>${stuff.cardDay }</td>
				</tr>
				<tr>
					<td class="title">是否为在编人员：</td>
					<td>${stuff.ifStaffPer }</td>
					<td class="title"></td>
					<td colspan="3"></td>
				</tr>
			</form>
		</table>
		<!--//commonTable-->
		<div id="formPageButton">
			<ul>
				<li><a href="member-edit.jsp" title="修改" class="btnShort">修改</a></li>
				<li><a href="javascript:window.history.go(-1)" title="返回"
					class="btnShort">返回</a></li>
			</ul>
		</div>
		<!--//commonToolBar-->
	</div>
	<!--//content pages wrap-->
</body>
</html>
