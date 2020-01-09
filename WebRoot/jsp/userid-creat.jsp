<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" isELIgnored="false"%>
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
<script language="javascript">
<!--
$().ready(function(){
	$(".btnShort").click(function(){$(".content-wrap-box").show()})
});
-->
</script>
<script type="text/javascript">
function formsubmit() {
		
		var flag=0;
		if($("#sectionroom").val()=="0"){
			$("#sectionroom").css("border","1px solid red");
			flag=1;
		}else{
			$("#sectionroom").css("border","1px solid black");
		}
		if($("#name").val()=="0"){
			$("#name").css("border","1px solid red");
			flag=1;
		}else{
			$("#name").css("border","1px solid black");
		}
		//登录名:必填状态
		if($("#username").val()==""){
			$("#username").css("border","1px solid red");
			flag=1;//return;
		}else {
			$("#username").css("border","1px solid black");
		}
		//密码:必填状态
		if($("#password").val()==""){
			$("#password").css("border","1px solid red");
			flag=1;//return;
		}else {
			$("#password").css("border","1px solid black");
		}
		//确认密码:必填状态
		if($("#repassword").val()==""){
			$("#repassword").css("border","1px solid red");
			flag=1;//return;
		}else {
			$("#repassword").css("border","1px solid black");
		}
		if($("#password").val()!=$("#repassword").val() || $("#password").val()==""){
			$("#password").css("border","1px solid red");
			$("#repassword").css("border","1px solid red");
			flag=1;//return;
		}else {
			$("#password").css("border","1px solid black");
			$("#repassword").css("border","1px solid black");
		}
		
		
		
		if(flag==1){
			return;
		}
		//return;
		$("#institutionCreat").submit();
	}

</script>
</head>

<body class="content-pages-body">
<div class="content-pages-wrap">
    <div class="commonTitle"><h2>&gt;&gt; <a href="userid-list.html">登录号管理</a> - 登录号创建</h2></div>
    <table border="0" cellspacing="1" cellpadding="0" class="commonTable">
        <form id="institutionCreat" name="institutionCreat" action="<%=basePath%>userservlet?type=create1" method="post">
        <tr>
            <td width="100" align="right"><span class="required">*</span>请选择科室：</td>
            <td align="left">
                <select name="sectionroom" id="sectionroom" class="formWidthDefault">
                    <option value="0">请选择</option>
                    <option value="科室1">科室1</option>
                    <option value="科室2">科室2</option>
                </select>
            </td>
            <td width="100" align="right"><span class="required">*</span>请选择人员：</td>
            <td align="left">
                <select name="name" id="name" class="formWidthDefault">
                    <option value="0">请选择</option>
                    <option value="张三">张三</option>
                    <option value="李四">李四</option>
                </select>
            </td>			
        </tr>
       <!--  </form> -->
    </table>
    <div id="formPageButton">
    	<ul>
        	<li><a href="#" title="下一步" class="btnShort">下一步</a></li>
        	<li><a href="javascript:window.history.go(-1)" title="返回" class="btnShort">返回</a></li>
        </ul>
    </div>
    <div class="content-wrap-box" style="display:none;">
    <table border="0" cellspacing="1" cellpadding="0" class="commonTable">
       <!--  <form id="useridCreat" name="useridCreat" action="" method="post"> -->
        <tr>
            <td width="12%" align="right"><span class="required">*</span>登录名：</td>
            <td width="21%" align="left"><input name="username" type="text" class="inputTextNormal" id="username" /></td>
            <td width="12%" align="right">描述：</td>
            <td width="21%" align="left"><input name="desc" type="text" class="inputTextNormal" id="desc" /></td>
            </tr>
        <tr>
            <td align="right"><span class="required">*</span>密码：</td>
            <td align="left"><input name="password" type="text" class="inputTextNormal" id="password" /></td>
            <td align="right"><span class="required">*</span>确认密码：</td>
            <td align="left"><input name="repassword" type="text" class="inputTextNormal" id="repassword" /></td>
        </tr>
        </form>
    </table>
    <!--//commonTable-->
    <div id="formPageButton">
    	<ul>
        	<li><a href="userid-list.html" title="保存" class="btnShort">保存</a></li>
        	<li><a href="javascript:void(0)" onclick="formsubmit()" title="提交" class="btnShort">提交</a></li>
        	<li><a href="javascript:window.history.go(-1)" title="返回" class="btnShort">返回</a></li>
        </ul>
    </div>
    <!--//commonToolBar-->
    </div>
</div>
<!--//content pages wrap-->
</body>
</html>
