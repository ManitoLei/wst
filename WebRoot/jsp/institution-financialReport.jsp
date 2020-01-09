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
<link href="<%=basePath%>css/main.css" rel="stylesheet" type="text/css"
	media="all" />
<script src="<%=basePath%>js/jquery-1.4.2.min.js" type="text/javascript"></script>
<script>

	$(document).ready(function(){
	

				$.getJSON("fundservlet","type=ready2",function(data){
			    	var s="<option value='0'>全部</option>";
			    	$.each(data,function(i,d){
			    		s+="<option value="+d.val+">"+d.val+"</option>"
			    	});
			    	$("#exeType").html(s);
				});	

				$.getJSON("fundservlet","type=ready",function(data){
			    	var s="<option value='0'>全部</option>";
			    	$.each(data,function(i,d){
			    		s+="<option value="+d.val+">"+d.val+"</option>"
			    	});
			    	$("#yearly").html(s);
				});	 

	});
	
	var sbody;
	function startJSON(sbody,id){

		$("#ttt").html(sbody);
		 $.getJSON("fundservlet","type=ready2",function(data){
			    		var s="<option value='0'>全部</option>";
			    		$.each(data,function(i,d){
			    			s+="<option value="+d.val+">"+d.val+"</option>"
			    		});
			    		$("#exeType").html(s);
		});	
		$.getJSON("fundservlet","type=ready",function(data){
			    		var s="<option value='0'>全部</option>";
			    		$.each(data,function(i,d){
			    			s+="<option value="+d.val+">"+d.val+"</option>"
			    		});
			    		$("#yearly").html(s);
		});	 
		//if(id!=null)
			//$("select[name=YEARLY]").find("option[value="+id+" }]").attr("selected",true); 
	}
	
	function query(){
	
		/* var s;
		var exeType= $("#EXETYPE").val();
		var yearly = $("#YEARLY").val();
		$.getJSON("fundservlet","type=query&yearly="+yearly+"&exeType="+exeType,function(data){
		    		s='<table width="100%" border="0" cellspacing="0" cellpadding="0"'+
			'class="commonTableSearch"><form id="form-search" name="form-search" action="" method="post">'+
				'<tr><th align="right">监督机构：</th><td><select name="EXETYPE" id="EXETYPE">'+
					'</select></td><th align="right">年份：</th><td><select name="YEARLY" id="YEARLY"></select></td>'+
					'<td align="right"><button  onclick="query()">检索</button>&nbsp;&nbsp;&nbsp;<button>导出</button></td></tr>'+
			'</form></table>';
			s='<table border="0" align="center" cellpadding="0" cellspacing="1"class="commonTable">'+
			'<tr><td align="center">单位</td><td align="center">人员经费（万元）</td>'+
			'<td align="center">公务费（万元）</td><td align="center">业务经费（万元）</td><td align="center">基本建设基金（万元）</td></tr>' ;
		    		$.each(data,function(i,d){
		    			s+='<tr><td align="center">'+d.orgName +'</td><td align="center">'+d.preFund +'</td>'+
						'<td align="center">'+d.businessFund +'</td><td align="center">'+d.dutyFund+'+'+
						'</td><td align="center">'+d.buildFund +'</td></tr>';
		    		});
		    		s+="</table>";
		    		$("#ttt").html(s);
		 });
		sbody=s; */
		//startJSON(sbody,yaerly);
		$("#form-search").submit();
	}
</script>

</head>
<body class="content-pages-body">
	<div class="content-pages-wrap">
		<div class="commonTitle">
			<h2>&gt;&gt; 机构管理 - 年度财政拨款情况表</h2>
		</div>

		
		<table width="100%" border="0" cellspacing="0" cellpadding="0"
			class="commonTableSearch">
			<form id="form-search" name="form-search" action="fundservlet?type=query" method="post">
				<tr>
					<th align="right">监督机构：</th>
					<td>
						<select name="exeType" id="exeType"></select></td>
					<th align="right">年份：</th>
					<td>
						<select name="yearly" id="yearly"></select></td>
					<td align="right"><button onclick="query()">检索</button>&nbsp;&nbsp;&nbsp;
					<button>导出</button></td>
				</tr>
			</form>
		</table><div id="ttt">
		<table border="0" align="center" cellpadding="0" cellspacing="1"
			class="commonTable">
			<tr>
				<td align="center">单位</td>
				<td align="center">人员经费（万元）</td>
				<td align="center">公务费（万元）</td>
				<td align="center">业务经费（万元）</td>
				<td align="center">基本建设基金（万元）</td>
			</tr>
			<c:forEach items="${data }" var="d">
				<tr>
				<td align="center">${d.orgName }</td>
				<td align="center">${d.preFund }</td>
				<td align="center">${d.businessFund }</td>
				<td align="center">${d.dutyFund }</td>
				<td align="center">${d.buildFund }</td>
				</tr>
			</c:forEach>
		</table>
		</div>
		<!--//content pages wrap-->
</body>
</html>
