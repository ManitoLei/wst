<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
	function req(page) {
		currentPage = page;
		//alert(currentPage);
		$.getJSON("userservlet","type=list&page="+page,function(data){
				//alert(data);
		    		var s='<table border="0" cellspacing="1" cellpadding="0" class="commonTable">'+
			'<tr><th>关联科室</th><th>姓名</th><th>登录名</th><th class="editColS">编辑</th></tr>';
		    		$.each(data,function(i,user){
		    		
		    			s+='<tr><td align="center">'+user.sectionroom +'</td><td align="left">'+user.name+'</td>'+
				'<td align="center">'+user.username+'</td><td align="center"><a href="userid-relation.html"'+
					'class="btnIconEdit" title="更新"></a> <a href="#" class="btnIconDel"title="删除"></a></td></tr>';
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
			<h2>&gt;&gt; 登录号管理</h2>
		</div>
		<table width="100%" border="0" cellspacing="0" cellpadding="0"
			class="commonTableSearch">
			<form id="form-search" name="form-search" action="userservlet?type=query" method="post">
				<tr>
					<td width="40" align="center"><img
						src="../images/icon-search.png" width="16" height="16" alt="检索" /></td>
					<th align="right">姓名：</th>
					<td><input name="name" type="text"
						class="inputTextNormal" id="name" /></td>
					<th>关联科室：</th>
					<td><select name="sectionroom" id="sectionroom">
							<option value="0">请选择</option>
							<option value="办公室">办公室</option>
					</select></td>
					<td align="right"><button onclick="query()">检索</button></td>
				</tr>
			</form>
		</table>
		<!--//commonTableSearch-->
		<div class="btnBar">
			<ul class="clearfix">
				<li><a href="<%=basePath %>jsp/userid-creat.jsp" title="创建登录号" class="btnNormal">创建登录号</a></li>
			</ul>
		</div>
		<div id="ttt">
		<table border="0" cellspacing="1" cellpadding="0" class="commonTable">
			<tr>
				<th>关联科室</th>
				<th>姓名</th>
				<th>登录名</th>
				<th class="editColS">编辑</th>
			</tr>
			<c:forEach items="${data }" var="user">
			<tr>
				<td align="center">${user.sectionroom }</td>
				<td align="left">${user.name }</td>
				<td align="center">${user.username }</td>
				<td align="center"><a href="<%=basePath %>userservlet?type=update&username=${user.username }"
					class="btnIconEdit" title="更新"></a> <a href="#" class="btnIconDel"
					title="删除"></a></td>
			</tr>
			</c:forEach>
			
		</table></div>
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
