<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"
	isELIgnored="false"%>
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
<link href="<%=basePath%>css/main.css" rel="stylesheet" type="text/css"
	media="all" />
<script src="<%=basePath%>js/jquery-1.4.2.min.js" type="text/javascript"></script>
<script>
	//var flag=0;
	$(function(){
	//alert("jjjjjjjjjjjjjjjjjjjjj")
	//alert("a");
		$.getJSON("orgservlet","type=allorgname",function(data){
				//	alert(data);
			    		var s;
			    		$.each(data,function(i,d){
			    			s+="<option value="+d.id+">"+d.orgName+"</option>"
			    		});
			    		$("#ORGNAME").html(s);
			 });	
			// query();
	})
		var currentPage = 1;
		var sbody;
	function startJSON(sbody,id){
		$("#ttt").html(sbody);
		$.getJSON("orgservlet","type=allorgname",function(data){
				//	alert(data);
			    		var s;
			    		$.each(data,function(i,d){
			    			s+="<option value="+d.id+">"+d.orgName+"</option>"
			    		});
			    		$("#ORGNAME").html(s);
			 });	
	if(id=null)
		$("select[name=ORGNAME]").find("option[value="+id+" }]").attr("selected",true);
	}
	function req(page) {
		currentPage = page;
		var s;
		$.getJSON("sectionservlet","type=list&page="+page,function(data){
			s='<table width="100%" border="0" cellspacing="0" cellpadding="0"'+
			'class="commonTableSearch"><form id="form-search" name="form-search" action="" method="post">'+
				'<tr><td width="40" align="center"><imgsrc="../images/icon-search.png" width="16" height="16" alt="检索" /></td>'+
					'<th align="right">机构名称：</th><td><select name="ORGNAME" id="ORGNAME"></select></td>'+
					'<th>科室名称：</th><td><input name="secname" type="text" class="inputTextNormal" id="secname" ></td>'+
					'<td align="right"><button onclick="query()">检索</button></td></tr></form></table>' ;
		    	
		    		s+='<table border="0" cellspacing="1" cellpadding="0" class="commonTable"><tr>'+
				'<th width="7%">机构编码</th><th>机构名称</th><th width="8%">行政类别</th>'+
				'<th>科室编码</th><th>科室名称</th><th width="8%">电话号码</th><th width="8%">传真号码</th>'+
				'<th width="5%">门号</th><th class="editColS">编辑</th></tr>';
		    		$.each(data,function(i,d){
		    			s+='<tr><td align="center">'+d.org.orgNo+'</td><td align="left">'+d.org.orgName +'</td>'+
					'<td align="center">'+d.org.exeType +'</td><td align="center">'+d.sec.divCode +'</td>'+
					'<td align="left">'+d.sec.divName +'</td><td align="center">'+d.sec.dutyTel +'</td>'+
					'<td align="center">'+d.sec.fax +'</td><td align="center">'+d.sec.divRoomNo +'</td>'+
					'<td align="center"><a href="office-edit.html"class="btnIconEdit" title="更新"></a> '+
					'<a href="#" class="btnIconDel" title="注销"></a></td></tr>';
		    		});
		    		s+="</table>";
		    		$("#ttt").html(s);
		 });
		var num = $("[class='current']").html();
		$("[class='current']").replaceWith("<a class='aa' href='javascript:void(0)' onclick='fenye(this)'>" + num + "</a>");
		$("[class='aa']").each(function() {
			if ($(this).html() == page) {
				$(this).replaceWith("<a class='current'>" + page  + "</a>");
			}
		});
		sbody=s;
		var id;
		startJSON(sbody,id);
	}
	/* function query(){
	
		page=currentPage;
		var s;
		var id= $("#ORGNAME").val();
		var secname = $("#secname").val();
		$.getJSON("sectionservlet","type=query3&page="+page+"&id="+id+"&secname="+secname,function(data){
		//alert("lllll"+${list3__.org.orgNo });
		    		s='<table width="100%" border="0" cellspacing="0" cellpadding="0"'+
			'class="commonTableSearch"><form id="form-search" name="form-search" action="" method="post">'+
				'<tr><td width="40" align="center"><imgsrc="../images/icon-search.png" width="16" height="16" alt="检索" /></td>'+
					'<th align="right">机构名称：</th><td><select name="ORGNAME" id="ORGNAME"></select></td>'+
					'<th>科室名称：</th><td><input name="secname" type="text" class="inputTextNormal" id="secname" value='+secname+'></td>'+
					'<td align="right"><button onclick="query()">检索</button></td></tr></form></table>' ;
		    		
		    		
		    	s+='<table border="0" cellspacing="1" cellpadding="0" class="commonTable"><tr>'+
				'<th width="7%">机构编码</th><th>机构名称</th><th width="8%">行政类别</th>'+
				'<th>科室编码</th><th>科室名称</th><th width="8%">电话号码</th><th width="8%">传真号码</th>'+
				'<th width="5%">门号</th><th class="editColS">编辑</th></tr>';
		    		$.each(data,function(i,d){
		    			s+='<tr><td align="center">'+d.org.orgNo+'</td><td align="left">'+d.org.orgName +'</td>'+
					'<td align="center">'+d.org.exeType +'</td><td align="center">'+d.sec.divCode +'</td>'+
					'<td align="left">'+d.sec.divName +'</td><td align="center">'+d.sec.dutyTel +'</td>'+
					'<td align="center">'+d.sec.fax +'</td><td align="center">'+d.sec.divRoomNo +'</td>'+
					'<td align="center"><a href="office-edit.html"class="btnIconEdit" title="更新"></a> '+
					'<a href="#" class="btnIconDel" title="注销"></a></td></tr>';
		    		});
		    		s+="</table>";
		    		$("#ttt").html(s);
		 });
		var num = $("[class='current']").html();
		$("[class='current']").replaceWith("<a class='aa' href='javascript:void(0)' onclick='fenye(this)'>" + num + "</a>");
		$("[class='aa']").each(function() {
			if ($(this).html() == page) {
				$(this).replaceWith("<a class='current'>" + page  + "</a>");
			}
		});
	sbody=s;
		startJSON(sbody,id);
		//flag++;
	} */
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
	<%-- 123121321<br>
${data[2].org.orgName } --%>

	<div class="content-pages-wrap">
		<div class="commonTitle">
			<h2>&gt;&gt; 科室管理</h2>
		</div>
		<div id="ttt">
		<table width="100%" border="0" cellspacing="0" cellpadding="0"
			class="commonTableSearch">
			<form id="form-search" name="form-search" action="<%=basePath %>sectionservlet?type=query" method="post">
				<tr>
					<td width="40" align="center"><img
						src="../images/icon-search.png" width="16" height="16" alt="检索" /></td>
					<th align="right">机构名称：</th>
					<td><select name="ORGNAME" id="ORGNAME">
					</select></td>
					<th>科室名称：</th>
					<td><input name="secname" type="text" class="inputTextNormal" id="secname" /></td>
					<td align="right"><button onclick="query()">检索</button></td>
				</tr>
			</form>
		</table>
		<!--//commonTableSearch-->
		<div class="btnBar">
			<ul class="clearfix">
				<li><a href="jsp/office-creat.jsp" title="创建科室" class="btnNormal">创建科室</a></li>
			</ul>
		</div>
		
			<table border="0" cellspacing="1" cellpadding="0" class="commonTable">
				<tr>
					<th width="7%">机构编码</th>
					<th>机构名称</th>
					<th width="8%">行政类别</th>
					<th>科室编码</th>
					<th>科室名称</th>
					<th width="8%">电话号码</th>
					<th width="8%">传真号码</th>
					<th width="5%">门号</th>
					<th class="editColS">编辑</th>
				</tr>
				<c:forEach items="${data }" var="d">
					<tr>
						<td align="center">${d.org.orgNo }</td>
						<td align="left">${d.org.orgName }</td>
						<td align="center">${d.org.exeType }</td>
						<td align="center">${d.sec.divCode }</td>
						<td align="left">${d.sec.divName }</td>
						<td align="center">${d.sec.dutyTel }</td>
						<td align="center">${d.sec.fax }</td>
						<td align="center">${d.sec.divRoomNo }</td>
						<td align="center"><a href="office-edit.html"
							class="btnIconEdit" title="更新"></a> <a href="#"
							class="btnIconDel" title="注销"></a></td>
					</tr>
				</c:forEach>

			</table>
		</div>
		<!--//commonTable-->
		<div id="pagelist">
			<ul class="clearfix">
				<li><a href='javascript:void(0)' onclick="req(1)">首页</a></li>
				<li><a href='javascript:void(0)' onclick="shangyiye(this)">上页</a></li>
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
