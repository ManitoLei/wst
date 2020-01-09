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
</head>

<body class="content-pages-body">
	<div class="content-pages-wrap">
		<div class="commonTitle">
			<h2>&gt;&gt; 被授权人确认</h2>
		</div>
		<!--//commonTableSearch-->
		<div class="btnBar">
			<ul class="clearfix">
				<li><a href="staff-entrust-creat2.html" title="确认授权"
					class="btnNormal">确认授权</a></li>
			</ul>
		</div>
		<table border="0" cellspacing="1" cellpadding="0" class="commonTable">
			<tr>
				<th>选择<input type="checkbox" name="" value="" /></th>
				<th>授权人</th>
				<th>被授权开始时间</th>
				<th>被授权终止时间</th>
				<th>是否确认授权</th>
				<th>确认时间</th>
				<th class="editColS">编辑</th>
			</tr>
			<c:forEach items="${data }" var="pri">
			<tr>
				<td align="center">${pri.name }</td>
				<td align="center">${pri.starttime }</td>
				<td align="center">${pri.endtime }</td>
				<td align="center">是</td>
				<td align="center">是</td>
				<td align="center">${pri.starttime }</td>
				<td align="center"><a href="jsp/staff-entrust-view2.jsp"
					class="btnIconView" title="查看详情"></a> <a href="#"
					class="btnIconDel" title="注销"></a></td>
			</tr>
		</c:forEach>
	
		</table>
		<!--//commonTable-->
		<!-- <div id="pagelist">
			<ul class="clearfix">
				<li><a href="#">首页</a></li>
				<li><a href="#">上页</a></li>
				<li><a href="#">1</a></li>
				<li><a href="#">2</a></li>
				<li class="current">3</li>
				<li><a href="#">4</a></li>
				<li><a href="#">5</a></li>
				<li><a href="#">下页</a></li>
				<li><a href="#">尾页</a></li>
				<li class="pageinfo">第3页</li>
				<li class="pageinfo">共8页</li>
			</ul>
		</div> -->
	</div>
	<!--//content pages wrap-->
</body>
</html>