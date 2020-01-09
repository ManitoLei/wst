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
<link href="<%=basePath %>css/main.css" rel="stylesheet" type="text/css" media="all" />
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
    <h2>&gt;&gt; 机构管理 - 监督机构基本情况表</h2>
</div> 
  <table width="100%" border="0" cellspacing="0" cellpadding="0" class="commonTableSearch">
       	<form id="form-search" name="form-search" action="infoservlet?type=query1" method="post">
        <tr>
            <th align="right">监督机构：</th>
            <td><select name="orgname" id="orgname">
			 
			</select></td>
			 <th align="right">年份：</th>
            <td><select name="select" id="select">
			 <option value="">2010</option>
			 <option value="">2009</option>
			 <option value="">2008</option>
			 <option value="">...</option>
			</select></td>
            <td align="right"><button onclick="query()">检索</button>&nbsp;&nbsp;&nbsp;<button>导出</button></td>
        </tr>
       	</form>
</table>
     <table border="0" align="center" cellpadding="0" cellspacing="1" class="commonTable">
		<tr>
            <td align="center" rowspan="2">单位</td>
            <td align="center" rowspan="2">编办批文日期（年月日）</td>
            <td align="center" rowspan="2">挂牌日期（年月日）</td>
            <td align="center" rowspan="2">独立运行日期（年月日）</td>
            <td align="center" rowspan="2">行政级别</td>
			 <td align="center" rowspan="2">行政性质</td>
            <td align="center" rowspan="2">编制人数</td>
            <td align="center" rowspan="2">是否参公管理</td>
			 <td align="center" rowspan="2">在职人数</td>
            <td align="center" rowspan="2">离退休人数</td>
            <td align="center" colspan="3">办公用房</td>
			<td align="center" colspan="3">内设科室数</td>
       </tr>
		<tr>
            <td align="center">建筑面积（平方米）</td>
            <td align="center">房屋所有权</td>
            <td align="center">在建面积（平方米）</td>
            <td align="center">业务科室</td>
            <td align="center">职能科室</td>
		    <td align="center">派出机构数</td>
       </tr>
		
		<c:forEach items="${data }" var="d">
		<tr>
            <td align="center">${d.org.orgName }</td>
            <td align="center">${d.org.zbbdocDate }</td>
            <td align="center">${d.org.listingDate }</td>
            <td align="center">${d.org.standaloneDate }</td>
            <td align="center">${d.org.exeType }</td>
			 <td align="center">${d.org.orgPro }</td>
            <td align="center">${d.info.zbbNum }</td>
			 <td align="center">${d.info.ifPublicmanage }</td>
            <td align="center">${d.info.onworkerNum }</td>
			 <td align="center">${d.info.retireNum }</td>
            <td align="center">${d.info.officeBuildarea }</td>
			 <td align="center">${d.info.buildingOwnership }</td>
            <td align="center">${d.info.officeBuildingarea }</td>
			 <td align="center">${d.info.businessDivCount }</td>
            <td align="center">${d.info.funDivCount }</td>
			 <td align="center">${d.info.orgCount }</td>
       </tr></c:forEach>
		
  </table>
<!--//content pages wrap-->
</body>
</html>
