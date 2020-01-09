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
			$("#orgname").html(s);
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
			<h2>&gt;&gt; 机构管理 - 仪器设备配置情况表</h2>
		</div>
		<table width="100%" border="0" cellspacing="0" cellpadding="0"
			class="commonTableSearch">
			<form id="form-search" name="form-search" action="infoservlet?type=query" method="post">
				<tr>
					<th align="right">监督机构：</th>
					<td><select name="orgname" id="orgname">
						
					</select></td>
					<td align="right"><button onclick="query()">检索</button>&nbsp;&nbsp;&nbsp;
						<button>导出</button></td>
				</tr>
			</form>
		</table>
		<table border="0" align="center" cellpadding="0" cellspacing="1"
			class="commonTable">
			<tr>
				<td width="14%" rowspan="2" align="center">单位</td>
				<td align="center" colspan="3">千元以上检测仪器设备台数</td>
				<td align="center" colspan="3">车辆（辆）</td>
				<td align="center" colspan="3">执法取证工具（台数）</td>
				<td align="center" colspan="7">办公及信息化设备（台数）</td>
			</tr>
			<tr>
				<td width="8%" align="center">小于等于一万</td>
				<td width="7%" align="center">一万到十万</td>
				<td width="7%" align="center">大于等于十万</td>
				<td align="center">汽车(不含快速检测车)</td>
				<td width="4%" align="center">快速检测车</td>
				<td width="4%" align="center">摩托车</td>
				<td width="5%" align="center">照相机</td>
				<td width="5%" align="center">摄像机</td>
				<td width="4%" align="center">录音笔</td>
				<td width="6%" align="center">台式电脑</td>
				<td width="7%" align="center">笔记本电脑</td>
				<td width="4%" align="center">服务器</td>
				<td width="4%" align="center">交换机</td>
				<td width="4%" align="center">传真机</td>
				<td width="4%" align="center">投影仪</td>
				<td width="6%" align="center">复印机</td>
			</tr>
			<c:forEach items="${data }" var="d">
			<tr>
				<td align="center">${d.orgName }</td>
				<td align="center">${d.equ3Count }</td>
				<td align="center">${d.equ2Count }</td>
				<td align="center">${d.equ1Count }</td>
				<td align="center">${d.busCount }</td>
				<td align="center">${d.rapidtestvehicleCount }</td>
				<td align="center">${d.motorCount }</td>
				<td align="center">${d.cameraCount }</td>
				<td align="center">${d.videoCount }</td>
				<td align="center">${d.VRCOUNT }</td>
				<td align="center">${d.computerNum }</td>
				<td align="center">${d.notepadNum }</td>
				<td align="center">${d.serverCount }</td>
				<td align="center">${d.pbxCount }</td>
				<td align="center">${d.faxCount }</td>
				<td align="center">${d.ohpCount }</td>
				<td align="center">${d.copycatNum }</td>
			</tr>
			</c:forEach>
			
		</table>
		<!--//content pages wrap-->
</body>
</html>
