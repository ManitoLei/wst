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
<link href="<%=basePath %>css/main.css" rel="stylesheet" type="text/css"
	media="all" />
<script src="<%=basePath %>js/jquery-1.4.2.min.js" type="text/javascript"></script>
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
		//名字:必填状态
		if($("#leaderName").val()==""){
			$("#leaderName").css("border","1px solid red");
			flag=1;//return;
		}else {
			$("#leaderName").css("border","1px solid black");
		}
		//性别:必选
		var choose = $("input:radio[name='gender']:checked").val();
		if(choose == null){
			$("#gender").css("background-color","red");
			flag=1;//return;
		}else{
			$("#gender").css("background-color","white");
		}
		//民族:必选
		if($("#folk").val()=="0"){
			$("#folk").css("border","1px solid red");
			flag=1;
		}else{
			$("#folk").css("border","1px solid black");
		}
		//出生年月: 格式yyyy-mm-dd hh:mm:ss
		if($("#birthDate").val()!="" && !reg.test($("#getInDate").val())){
			$("#birthDate").css("border","1px solid red");
			flag=1;//return;
		}else {
			$("#birthDate").css("border","1px solid black");
		}
		//任职日期: 格式yyyy-mm-dd hh:mm:ss
		if($("#serDate").val()!="" && !reg.test($("#getInDate").val())){
			$("#serDate").css("border","1px solid red");
			flag=1;//return;
		}else {
			$("#serDate").css("border","1px solid black");
		}
		//离任日期: 格式yyyy-mm-dd hh:mm:ss
		if($("#leaveDate").val()!="" && !reg.test($("#getInDate").val())){
			$("#leaveDate").css("border","1px solid red");
			flag=1;//return;
		}else {
			$("#leaveDate").css("border","1px solid black");
		}
		
		
		
		if(flag==1){
			return;
		}
		//return;
		$("#memberCreat").submit();
	}

</script>
</head>

<body class="content-pages-body">
	<div class="content-pages-wrap">
		<div class="commonTitle">
			<h2>&gt;&gt; 所级领导名录管理 - 添加领导名录信息</h2>
		</div>
		<table border="0" cellspacing="1" cellpadding="0" class="commonTable">
			<form id="memberCreat" name="memberCreat" action="<%=basePath%>leaderservlet?type=create" method="post">
				<tr>
					<td width="12%" align="right"><span class="required">*</span>姓名：</td>
					<td width="21%" align="left"><input name="leaderName"
						type="text" class="inputTextNormal" id="leaderName" /></td>
					<td width="12%" align="right"><span class="required">*</span>性别</td>
					<td width="21%" align="left"><input type="radio" name="gender"
						id="radio" value="男" /> 男 <input type="radio" name="gender"
						id="radio3" value="女" /> 女</td>
					<td width="12%" align="right"><span class="required">*</span>民族：</td>
					<td align="left"><select name="folk" id="folk">
							<option value="0">请选择</option>
							<option value="汉">汉</option>
							<option value="其他">其他</option>
					</select></td>
				</tr>

				<tr>
					<td align="right">出生年月：</td>
					<td align="left"><input name="birthDate" type="text"
						class="inputTextNormal" id="birthDate" /></td>
					<td align="right">政治面貌：</td>
					<td align="left"><select name="pol" id="pol">
							<option value="0">请选择</option>
							<option value="中共党员">中共党员</option>
							<option value="团员">团员</option>
							<option value="民族党派">民族党派</option>
							<option value="群众">群众</option>
					</select></td>
					<td align="right">学历：</td>
					<td align="left"><input name="edu" type="text"
						class="inputTextNormal" id="edu" /></td>
				</tr>
				<tr>
					<td width="12%" align="right">学位：</td>
					<td width="21%" align="left"><input name="degree"
						type="text" class="inputTextNormal" id="degree" /></td>
					<td width="12%" align="right">职务：</td>
					<td width="21%" align="left"><input name="manageJob"
						type="text" class="inputTextNormal" id="manageJob" /></td>
					<td width="12%" align="right">职称：</td>
					<td align="left"><input name="title" type="text"
						class="inputTextNormal" id="title" /></td>
				</tr>
				<tr>
					<td align="right">任职日期：</td>
					<td align="left"><input name="serDate" type="text"
						class="inputTextNormal" id="serDate" /></td>
					<td align="right">离任日期：</td>
					<td align="left"><input name="leaveDate" type="text"
						class="inputTextNormal" id="leaveDate" /></td>
					<td align="right"></td>
					<td align="left"></td>
				</tr>
				<tr>
					<td align="right">备注：</td>
					<td align="left" colspan="5"><textarea id="memo" name="memo" rows="4" cols="60"></textarea></td>
				</tr>
				<tr>
					<td width="12%" align="right">填表人姓名：</td>
					<td width="21%" align="left"><input name="formFillingMan"
						type="text" class="inputTextNormal" id="formFillingMan" /></td>
					<td width="12%" align="right">填表人电话：</td>
					<td width="21%" align="left"><input name="linkTel"
						type="text" class="inputTextNormal" id="linkTel" /></td>
					<td width="12%" align="right">年份：</td>
					<td align="left"><select name="yearly" id="yearly">
							<option value="0">请选择</option>
							<option value="2020">2020</option>
							<option value="2019">2019</option>
							<option value="2018">2018</option>
							<option value="2017">2017</option>
							<option value="2015">2015</option>
							<option value="2014">2014</option>
							<option value="2013">2013</option>
							<option value="2012">2012</option>
							<option value="2011">2011</option>
							<option value="2010">2010</option>
					</select></td>
				</tr>
			</form>
		</table>
		<!--//commonTable-->
		<div id="formPageButton">
			<ul>
				<li><a href="leadership-list.jsp" title="保存" class="btnShort">保存</a></li>
				<li><a href="javascript:void(0)" onclick="formsubmit()" title="提交" class="btnShort">提交</a></li>
				<li><a href="javascript:window.history.go(-1)" title="返回"
					class="btnShort">返回</a></li>
			</ul>
		</div>
		<!--//commonToolBar-->
	</div>
	<!--//content pages wrap-->
</body>
</html>
