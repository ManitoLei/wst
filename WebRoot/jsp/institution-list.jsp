<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"
	isELIgnored="false"%>
<%@ page import="com.google.gson.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%
	response.setHeader("Cache-Control", "no-cache");
	response.setHeader("Pragma", "no-cache");
	response.setDateHeader("Expires", 0);
%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=7" />
<title>江苏省卫生监督业务系统</title>
<link href="<%=basePath%>css/main.css" rel="stylesheet" type="text/css"
	media="all" />
<script src="<%=basePath%>js/jquery-1.4.2.min.js" type="text/javascript"></script>
<script type="text/javascript">
	var currentPage = 1;
	 $(function(){
		/* var num = $("[class='current']").html();
		//alert(num);
		$("[class='current']").replaceWith("<a class='aa' href='javascript:void(0)' onclick='fenye(this)'>" + num + "</a>");
		$("[class='aa']").each(function() {
			if ($(this).html() == ${page }) {
				//	alert($(this).html())
				$(this).replaceWith("<a class='current'>" + ${page } + "</a>");
			}
		}); */
				 
				 
	
	}); 
	function req(page) {
		currentPage = page;
		//alert(currentPage);
		$.getJSON("orgservlet","type=list&page="+page,function(data){
				//alert(data);
		    		var s='<table border="0" cellspacing="1" cellpadding="0" class="commonTable"><tr><th width="7%">机构编码</th><th>机构名称</th>'+
				'<th width="8%">行政类别</th><th>地址</th><th width="10%">独立运行日期</th>'+
				'<th class="editColM">操作</th></tr>';
		    		$.each(data,function(i,org){
		    		
		    			s+='<tr><td align="center">'+org.orgNo+'</td><td align="left"><a href="institution-view.jsp">'+org.orgName+'</a>'+
		    			'</td><td align="center">'+org.exeType+'</td><td align="left">'+org.linkAdd+'</td>'+
						'<td align="center">'+org.standaloneDate+'</td><td align="center"><a href="institution-view.jsp"'+
							'class="btnIconView" title="查看详情"></a><a href="<%=basePath %>orgservlet?type=update&id=${org.id }" class="btnIconEdit" title="更新"></a></td></tr>';
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
		
		
		
		// location.href="orgservlet?type=list&page="+page;
		/*$.post("orgservlet?type=list", "page=" + page/* , function(data) {
			var s= "<c:forEach items='${data }' var='org'>"+
				"<tr><td align='center'>${org.orgNo }</td><td align='left'><a href='institution-view.jsp'>${org.orgName }</a></td>"+
					"<td align='center'>${org.exeType }</td><td align='left'>${org.linkAdd }</td><td align='center'>${org.orgName }</td>"+
					"<td align='center'>${org.standaloneDate }</td><td align='center'><a href='institution-view.jsp' class='btnIconView' title='查看详情'></a> </a></td></tr>"+"</c:forEach>";
			$("#temp").html(s);
			alert($("#temp").html(s));
		} );*/

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
			<h2>&gt;&gt;建设项目审查</h2>
		</div>

		<form id="form-search" name="form-search"
			action="orgservlet?type=query" method="post">
			<table width="100%" border="0" cellspacing="0" cellpadding="0"
				class="commonTableSearch">
				<tr>
					<th align="right">行政类别：</th>
					<td><select name="exeType" id="exeType">
							<option value="卫生监督机构">卫生监督机构</option>
							<option value="行政部门">行政部门</option>
							<option value="协作单位">协作单位</option>
					</select></td>
					<td><div align="right">机构名称：</div></td>
					<td><input name="orgName" type="text" class="inputTextNormal"
						id="orgName" /></td>
					<td align="right">机构地址：</td>
					<td align="right"><input name="linkAdd" type="text"
						class="inputTextNormal" id="linkAdd" /></td>
					<td align="right">机构代码：</td>
					<td align="right"><input name="orgCode" type="text"
						class="inputTextNormal" id="orgCode" /></td>
				</tr>

				<tr>
					<th align="right">行政区划：</th>
					<td><input name="areaCode" type="text" class="inputTextNormal"
						id="areaCode" value="" /></td>
					<td><div align="right">邮政编码：</div></td>
					<td><input name="ZIPCODE" type="text" class="inputTextNormal"
						id="ZIPCODE" /></td>
					<td align="right">机构性质：</td>
					<td align="right"><select name="orgPro" id="orgPro">
							<option value="0">请选择</option>
							<option value="行政机构">行政机构</option>
							<option value="全额拔款事业单位">全额拔款事业单位</option>
							<option value="差额拔款事业单位">差额拔款事业单位</option>
							<option value="自收自支事业单位">自收自支事业单位</option>
							<option value="其他">其他</option>
					</select></td>
					<td align="right">&nbsp;</td>
					<td align="right"><button onclick="query()">检索</button></td>
				</tr>
			</table>
		</form>

		<!--//commonTableSearch-->
		<div class="btnBar">
			<ul class="clearfix">
				<li><a href="<%=basePath%>jsp/institution-creat.jsp"
					title="创建机构" class="btnNormal">新增</a></li>
			</ul>
		</div>
		<div id="ttt">
			<table border="0" cellspacing="1" cellpadding="0" class="commonTable">
				<tr>
					<th width="7%">机构编码</th>
					<th>机构名称</th>
					<th width="8%">行政类别</th>
					<th>地址</th>
					<!-- <th width="5%">报告日期</th> -->
					<th width="10%">独立运行日期</th>
					<th class="editColM">操作</th>
				</tr>
				<c:forEach items="${data }" var="org">
					<tr>
						<td align="center">${org.orgNo }</td>
						<td align="left"><a href="institution-view.jsp">${org.orgName }</a></td>
						<td align="center">${org.exeType }</td>
						<td align="left">${org.linkAdd }</td>
						<%-- <td align="center">${org.orgName }</td> --%>
						<td align="center">${org.standaloneDate }</td>
						<td align="center"><a href="<%=basePath %>orgservlet?type=query2&id=${org.id }"
							class="btnIconView" title="查看详情"></a> <a
					href="<%=basePath %>orgservlet?type=update&id=${org.id }" class="btnIconEdit"
					title="更新"></a> <a
					href="<%=basePath %>jsp/institution-appropriation-creat.jsp?&orgid=${org.id }&orgname=${org.orgName }&orgno=${org.orgNo }&orgcode=${org.orgCode }" class="btnIconEdit"
					title="添加拨款"></a></td>
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
