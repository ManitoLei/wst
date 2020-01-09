<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" isELIgnored="false"%>
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
<link href="../css/main.css" rel="stylesheet" type="text/css" media="all" />
<link href="../css/main.css" rel="stylesheet" type="text/css" media="all" />
<script src="../js/jquery-1.4.2.min.js" type="text/javascript"></script>
<script src="../js/jquery.common.js" type="text/javascript"></script><!--所有页面公用，去除a、button点击虚线框等类似功能-->
<script type="text/javascript">
function formsubmit() {
		
	
		//return;
		$("#useridCreat").submit();
	}

</script>
</head>

<body class="content-pages-body">
<div class="content-pages-wrap">
    <div class="commonTitle">
      <h2>&gt;&gt; 人员授权-新增</h2>
    </div>
    <table border="0" cellspacing="1" cellpadding="0" class="commonTable">
        <form id="useridCreat" name="useridCreat" action="<%=basePath%>priservlet?type=create" method="post">
        <tr>
            <td width="25%" class="title" align="right">被授权人：</td>
            <td width="75%" align="left">
            <select name="name" id="name">
            <option value="张**">张**</option>
            <option value="李**">李**</option>
            <option value="王**">王**</option>
            <option value="赵**">赵**</option>
            <option value="陈**">陈**</option>
            </select></td>
        </tr>
        <tr>
            <td align="right" class="title">授权终止时间：</td>
            <td align="left"><input name="endtime" type="text" class="inputTextMiddle isDate" id="endtime" onclick="WdatePicker({dateFmt:'yyyy-MM-dd'});" /></td>
        </tr>
		 <tr>
            <td width="25%" class="title" align="right">描述：</td>
            <td width="75%" align="left"><textarea name="desc" id="desc" cols="60" rows="5"></textarea></td>
		 </tr>
        </form>
    </table>
    <!--//commonTable-->
    <div id="formPageButton">
    	<ul>
        	<li><a href="#" title="保存" class="btnShort">保存</a></li>
			<li><a href="javascript:void(0)" onclick="formsubmit()" title="提交" class="btnShort">提交</a></li>
        	<li><a href="javascript:window.history.go(-1)" title="返回" class="btnShort">返回</a></li>
        </ul>
    </div>
    <!--//commonToolBar-->
</div>
<!--//content pages wrap-->
</body>
</html>
