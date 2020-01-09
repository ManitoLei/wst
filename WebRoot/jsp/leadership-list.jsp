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
	function req(page) {
		//currentPage = page;
		//alert(currentPage);
		$.getJSON("leaderservlet","type=list3&page="+page,function(data){
				//alert(data);
		    		var s='<table border="0" cellspacing="1" cellpadding="0" class="commonTable">'+
			'<tr align="center"><th>填表人</th><th>填表人联系电话</th><th>领导姓名</th>'+
				'<th>性别</th><th>民族</th><th>出生年月</th><th>政治面貌</th><th>学历</th>'+
				'<th>职务</th><th>职称</th><th class="editColDefault">操作</th></tr>';
		    		$.each(data,function(i,leader){
		    		
		    			s+='<tr align="center"><td>'+leader.formFillingMan +'</td>'+
				'<td>'+leader.linkTel +'</td><td>'+leader.leaderName +'</td><td>'+leader.gender +'</td>'+
				'<td>'+leader.folk +'</td><td>'+leader.birthDate +'</td><td>'+leader.pol +'</td>'+
				'<td>'+leader.degree +'</td><td>'+leader.manageJob +'</td><td>'+leader.title +'</td>'+
				'<td><a href="<%=basePath %>jsp/leadership-view.jsp" class="btnIconView"'+
					'title="查看详情"></a> <a href="<%=basePath %>jsp/leadership-creat.jsp"'+
					'class="btnIconEdit" title="更新"></a> <a href="#" class="btnIconDel"'+
					'title="注销"></a></td></tr>';
		    		});
		    		s+="</table>";
		    		$("#ttt").html(s);
		 });
		var num = $("[class='current']").html();
		//alert(num);
		$("[class='current']").replaceWith("<a class='aa' href='javascript:void(0)' onclick='fenye(this)'>" + num + "</a>");
		$("[class='aa']").each(function() {
			if ($(this).html() == page) {
				//	alert($(this).html())
				$(this).replaceWith("<a class='current'>" + page  + "</a>");
			}
		});
	}
	function fenye(obj) {
		var page = obj.innerHTML;
		//alert(page);
		req(page);
	}
	function shangyiye() {
		if (currentPage >= 2) {
			req(currentPage - 1);
		}
	}

	function xiayiye() {
		if (currentPage <= 7) {
			req(currentPage + 1);
		}
	}
	
	function query(){
		$("#form-search").submit();
	}
</script>
</head>

<body class="content-pages-body">
	<div class="content-pages-wrap">
		<div class="commonTitle">
			<h2>&gt;&gt; 所级领导名录管理</h2>
		</div>
		<!--//commonTableSearch-->
		<table width="100%" border="0" cellspacing="0" cellpadding="0"
			class="commonTableSearch">
			<form id="form-search" name="form-search" action="leaderservlet?type=query" method="post">
				<tr>
					<td align="right">年份：</td>
					<td><select name="select" id="select">
							<option value="">2010</option>
							<option value="">2009</option>
							<option value="">2008</option>
							<option value="">...</option>
					</select></td>
					<th align="right">监督机构：</th>
					<td><select name="orgName" id="orgName">
							
					</select></td>
					<td align="right">
						<button onclick="query()">查询</button>
					</td>
				</tr>
			</form>
		</table>
		<div class="btnBar">
			<ul class="clearfix">
				<li><a href="#" title="复制名录" class="btnNormal">复制名录</a></li>
				<li><a href="<%=basePath %>jsp/leadership-creat.jsp" title="填写信息"
					class="btnNormal">填写名录信息</a></li>
			</ul>
		</div>
		<div id="ttt">
		<table border="0" cellspacing="1" cellpadding="0" class="commonTable">
			<tr align="center">
				<th>填表人</th>
				<th>填表人联系电话</th>
				<th>领导姓名</th>
				<th>性别</th>
				<th>民族</th>
				<th>出生年月</th>
				<th>政治面貌</th>
				<th>学历</th>
				<th>职务</th>
				<th>职称</th>
				<th class="editColDefault">操作</th>
			</tr>
			<c:forEach items="${data }" var="leader">
			<tr align="center">
				<td>${leader.formFillingMan }</td>
				<td>${leader.linkTel }</td>
				<td>${leader.leaderName }</td>
				<td>${leader.gender }</td>
				<td>${leader.folk }</td>
				<td>${leader.birthDate }</td>
				<td>${leader.pol }</td>
				<td>${leader.degree }</td>
				<td>${leader.manageJob }</td>
				<td>${leader.title }</td>
				<td><a href="<%=basePath %>leaderservlet?type=query2&id=${leader.id }" class="btnIconView"
					title="查看详情"></a> <a href="<%=basePath %>jsp/leadership-creat.jsp"
					class="btnIconEdit" title="更新"></a> <a href="#" class="btnIconDel"
					title="注销"></a></td>
			</tr>
			</c:forEach>
		</table>
		</div>
		<!--//commonTable-->
		<div id="pagelist">
			<ul class="clearfix">
				<li><a href='javascript:void(0)' onclick="req(1)">首页</a></li>
				<li><a href='javascript:void(0)' onclick="shangyiye(this)">上页</a></li>
				<!-- <li><a href='javascript:void(0)' onclick="fenye(this)">1</a></li> -->
				<li><a class="current">1</a></li>
				<li><a class="aa" href='javascript:void(0)'
					onclick="fenye(this)">2</a></li>
				<li><a class="aa" href='javascript:void(0)'
					onclick="fenye(this)">3</a></li>
				<li><a class="aa" href='javascript:void(0)'
					onclick="fenye(this)">4</a></li>
				<li><a class="aa" href='javascript:void(0)'
					onclick="fenye(this)">5</a></li>
				<li><a href='javascript:void(0)' onclick="xiayiye(this)">下页</a></li>
				<li><a href='javascript:void(0)' onclick="req(8)">尾页</a></li>
				<li class="pageinfo">第3页</li>
				<li class="pageinfo">共8页</li>
			</ul>
		</div>
	</div>
	<!--//content pages wrap-->
</body>
</html>
