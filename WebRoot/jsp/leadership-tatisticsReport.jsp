<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
<script type="text/javascript">
	$(document).ready(function(){
		$.getJSON("infoservlet","type=ready",function(data){
			var s;//="<option value='0'>全部</option>";
			$.each(data,function(i,d){
				s+="<option value="+d.id+">"+d.orgName+"</option>"
			});
			$("#orgName").html(s);
		});	

	});
	function query(){
	
		$("#form-search").submit();
	}
</script>
</head>

<body class="content-pages-body">
	<div class="content-pages-wrap">
		<div class="commonTitle">
			<h2>&gt;&gt; 人员管理 - 所级领导名录统计表</h2>
		</div>
		<table width="100%" border="0" cellspacing="0" cellpadding="0"
			class="commonTableSearch">
			<form id="form-search" name="form-search" action="leaderservlet?type=query" method="post">
				<tr>
					<th align="right">监督机构：</th>
					<td><select name="orgName" id="orgName">
							
					</select></td>
					<th align="right">年份：</th>
					<td><select name="select" id="select">
							<option value="">2010</option>
							<option value="">2009</option>
							<option value="">2008</option>
							<option value="">...</option>
					</select></td>
					<td align="right"><button onclick="query()">检索</button>&nbsp;&nbsp;&nbsp;
						<button>导出</button></td>
				</tr>
			</form>
		</table>
		<table border="0" align="center" cellpadding="0" cellspacing="1"
			class="commonTable">
			<tr>
				<td align="center">单位</td>
				<td align="center">姓名</td>
				<td align="center">性别</td>
				<td align="center">民族</td>
				<td align="center">出生年月</td>
				<td align="center">政治面貌</td>
				<td align="center">学位</td>
				<td align="center">职务</td>
				<td align="center">职称</td>
				<td align="center">备注</td>
			</tr>
			<c:forEach items="${data }" var="d">
			<tr>
				<td align="center">${d.orgName }</td>
				<td align="center">${d.leaderName }</td>
				<td align="center">${d.gender }</td>
				<td align="center">${d.folk }</td>
				<td align="center">${d.birthDate }</td>
				<td align="center">${d.pol }</td>
				<td align="center">${d.degree }</td>
				<td align="center">${d.manageJob }</td>
				<td align="center">${d.title }</td>
				<td align="center">${d.memo }</td>
			</tr>
			</c:forEach>
		</table>
		<!--//content pages wrap-->
</body>
</html>
