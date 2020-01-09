<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
 <head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=7" />
<title>江苏省卫生监督业务系统</title>
<link href="<%=basePath %>css/main.css" rel="stylesheet" type="text/css" media="all" />
<link href="<%=basePath %>css/main.css" rel="stylesheet" type="text/css" media="all" />
<script src="<%=basePath %>js/jquery-1.4.2.min.js" type="text/javascript"></script>
<script src="<%=basePath %>js/jquery.common.js" type="text/javascript"></script><!--所有页面公用，去除a、button点击虚线框等类似功能-->
</head>

<body class="content-pages-body">
<div class="content-pages-wrap">
    <div class="commonTitle">
      <h2>&gt;&gt; 人员授权-详细信息</h2>
    </div>
    <table border="0" cellspacing="1" cellpadding="0" class="commonTable">
        <form id="useridCreat" name="useridCreat" action="" method="post">
        <tr>
            <td width="25%" class="title" align="right">被授权人：</td>
            <td width="75%" align="left">${pri.name }</td>
        </tr>
        <tr>
            <td align="right" class="title">授权终止时间：</td>
            <td align="left">${pri.endtime }</td>
        </tr>
         <tr>
            <td align="right" class="title">确认时间：</td>
            <td align="left">${pri.starttime }</td>
        </tr>
		 <tr>
            <td width="25%" class="title" align="right">描述：</td>
            <td width="75%" align="left">${pri.desc }</td>
		 </tr>
        </form>
    </table>
    <!--//commonTable-->
    <div id="formPageButton">
    	<ul>
        	<li><a href="javascript:window.history.go(-1)" title="返回" class="btnShort">返回</a></li>
        </ul>
    </div>
    <!--//commonToolBar-->
</div>
<!--//content pages wrap-->
</body>
</html>
