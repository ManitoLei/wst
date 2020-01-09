<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%
	String path = request.getContextPath(); //获取的是当前程序的目录     wst
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!-- <!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"> -->
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=7" />
<title>江苏省卫生监督业务系统</title>
<link href="<%=basePath %>css/main.css" rel="stylesheet" type="text/css"
	media="all" />
<script src="<%=basePath %>js/jquery.min.js" type="text/javascript"></script>
<script type="text/javascript">
	$(document).ready(function(){
		$("input[name=exeType][value=${org.exeType }]").attr("checked",true);
		$("input[name=areaType][value=${org.areaType }]").attr("checked",true);
		$("select[name=orgLevel]").find("option[value=${org.orgLevel }]").attr("selected",true);
		$("select[name=orgPro]").find("option[value=${org.orgPro }]").attr("selected",true);
		$("input[name=ifPublicmanage][value=${info.ifPublicmanage }]").attr("checked",true);
		$("select[name=buildingOwnership]").find("option[value=${info.buildingOwnership }]").attr("selected",true);
	});
	
	
	function formsubmit() {
	var flag=0;
		//机构代码:必填状态且格式为XXXXXXX-X
		zzbds = /^[\d]{8}-[\d]$/;
		//alert(a.test($("#orgCode").val()));
		if($("#orgCode").val()=="" || !zzbds.test($("#orgCode").val())){
			$("#orgCode").css("border","1px solid red");
			//return;
			flag=1;
		}else {
			$("#orgCode").css("border","1px solid black");
		}
		//机构名称:必填状态
		if($("#orgName").val()==""){
			$("#orgName").css("border","1px solid red");
			flag=1;//return;
		}else {
			$("#orgName").css("border","1px solid black");
		}
		//行政类别:必选
		var choose = $("input:radio[name='exeType']:checked").val();
		if(choose == null){
			$("#exetypetd").css("background-color","red");
			flag=1;//return;
		}else{
			$("#exetypetd").css("background-color","white");
		}
		//行政区划:必填，9位
		if($("#areaCode").val()=="" || !/^[\d]{9}$/.test($("#areaCode").val())){
			$("#areaCode").css("border","1px solid red");
			flag=1;//return;
		}else {
			$("#areaCode").css("border","1px solid black");
		}
		//挂牌日期: 格式yyyy-mm-dd hh:mm:ss
		var reg = /^[1-9]\d{3}-(0[1-9]|1[0-2]|[1-9])-(0[1-9]|[1-2][0-9]|3[0-1]|[1-9])\s+(20|21|22|21|[0-1]\d|\d):([0-5]\d|\d):([0-5]\d|\d)$/
		//alert(reg.test($("#listingDate").val()));
		if($("#listingDate").val()!="" && !reg.test($("#listingDate").val())){
			$("#listingDate").css("border","1px solid red");
			flag=1;//return;
		}else {
			$("#listingDate").css("border","1px solid black");
		}
		//独立运行日期
		if($("#standaloneDate").val()!="" && !reg.test($("#standaloneDate").val())){
			$("#standaloneDate").css("border","1px solid red");
			flag=1;//return;
		}else {
			$("#standaloneDate").css("border","1px solid black");
		}
		//行政区类别:必选
		var choose2 = $("input:radio[name='areaType']:checked").val();
		if(choose2 == null){
			$("#areatypetd").css("background-color","red");
			flag=1;//return;
		}else{
			$("#areatypetd").css("background-color","white");
		}
		//在职人数:数字
		var reg2 = /^([0-9]|[1-9][0-9]+)$/;
		//alert(reg2.test($("#onworkerNum").val()));
		if($("#onworkerNum").val()!="" && !reg2.test($("#onworkerNum").val())){
			$("#onworkerNum").css("border","1px solid red");
			flag=1;//return;
		}else {
			$("#onworkerNum").css("border","1px solid black");
		}
		//卫生监督员:数字
		if($("#supervisorNum").val()!="" && !reg2.test($("#supervisorNum").val())){
			$("#supervisorNum").css("border","1px solid red");
			flag=1;//return;
		}else {
			$("#supervisorNum").css("border","1px solid black");
		}
		//机构行政级别:必选
		if($("#orgLevel").val()=="0"){
			$("#orgLevel").css("border","1px solid red");
			flag=1;
		}else{
			$("#orgLevel").css("border","1px solid black");
		}
		//机构性质:必选
		if($("#orgPro").val()=="0"){
			$("#orgPro").css("border","1px solid red");
			flag=1;
		}else{
			$("#orgPro").css("border","1px solid black");
		}
		//编办批文日期
		if($("#zbbdocDate").val()!="" && !reg.test($("#zbbdocDate").val())){
			$("#zbbdocDate").css("border","1px solid red");
			flag=1;//return;
		}else {
			$("#zbbdocDate").css("border","1px solid black");
		}
		//是否参公管理:必选
		var choose3 = $("input:radio[name='ifPublicmanage']:checked").val();
		if(choose3 == null){
			$("#idpublictd").css("background-color","red");
			flag=1;//return;
		}else{
			$("#idpublictd").css("background-color","white");
		}
		//离退休人数:必填，数字
		if($("#retireNum").val()=="" || !reg2.test($("#retireNum").val())){
			$("#retireNum").css("border","1px solid red");
			flag=1;//return;
		}else {
			$("#retireNum").css("border","1px solid black");
		}
		//编制人数:必填，数字
		if($("#zbbNum").val()=="" || !reg2.test($("#zbbNum").val())){
			$("#zbbNum").css("border","1px solid red");
			flag=1;//return;
		}else {
			$("#zbbNum").css("border","1px solid black");
		}
		//房屋所有权:必选
		if($("#buildingOwnership").val()=="0"){
			$("#buildingOwnership").css("border","1px solid red");
			flag=1;
		}else{
			$("#buildingOwnership").css("border","1px solid black");
		}
		//办公用房在建面积:浮点数
		var reg3 = /^([0-9]|[1-9]+(\.[0-9]+|[0-9]*))$/;
		//alert(reg3.test($("#officeBuildingarea").val()));
		if($("#officeBuildingarea").val()!="" && !reg3.test($("#officeBuildingarea").val())){
			$("#officeBuildingarea").css("border","1px solid red");
			flag=1;//return;
		}else {
			$("#officeBuildingarea").css("border","1px solid black");
		}
		//办公用房建筑面积:必填，浮点数
		if($("#officeBuildarea").val()=="" || !reg3.test($("#officeBuildarea").val())){
			$("#officeBuildarea").css("border","1px solid red");
			flag=1;//return;
		}else {
			$("#officeBuildarea").css("border","1px solid black");
		}
		//职能科室数:必填，数字
		if($("#businessDivCount").val()=="" || !reg2.test($("#businessDivCount").val())){
			$("#businessDivCount").css("border","1px solid red");
			flag=1;//return;
		}else {
			$("#businessDivCount").css("border","1px solid black");
		}
		//派出机构数:必填，数字
		if($("#orgCount").val()=="" || !reg2.test($("#orgCount").val())){
			$("#orgCount").css("border","1px solid red");
			flag=1;//return;
		}else {
			$("#orgCount").css("border","1px solid black");
		}
		//业务科室数:必填，数字
		if($("#funDivCount").val()=="" || !reg2.test($("#funDivCount").val())){
			$("#funDivCount").css("border","1px solid red");
			flag=1;//return;
		}else {
			$("#funDivCount").css("border","1px solid black");
		}
		//检测仪器设备数:必填，数字
		if($("#equ3Count").val()=="" || !reg2.test($("#equ3Count").val())){
			$("#equ3Count").css("border","1px solid red");
			flag=1;//return;
		}else {
			$("#equ3Count").css("border","1px solid black");
		}
		if($("#equ2Count").val()=="" || !reg2.test($("#equ2Count").val())){
			$("#equ2Count").css("border","1px solid red");
			flag=1;//return;
		}else {
			$("#equ2Count").css("border","1px solid black");
		}
		if($("#equ1Count").val()=="" || !reg2.test($("#equ1Count").val())){
			$("#equ1Count").css("border","1px solid red");
			flag=1;//return;
		}else {
			$("#equ1Count").css("border","1px solid black");
		}
		
		//...
		
		
		if($("#busCount").val()=="" || !reg2.test($("#busCount").val())){
			$("#busCount").css("border","1px solid red");
			flag=1;//return;
		}else {
			$("#busCount").css("border","1px solid black");
		}
		if($("#rapidtestvehicleCount").val()=="" || !reg2.test($("#rapidtestvehicleCount").val())){
			$("#rapidtestvehicleCount").css("border","1px solid red");
			flag=1;//return;
		}else {
			$("#rapidtestvehicleCount").css("border","1px solid black");
		}
		if($("#motorCount").val()=="" || !reg2.test($("#motorCount").val())){
			$("#motorCount").css("border","1px solid red");
			flag=1;//return;
		}else {
			$("#motorCount").css("border","1px solid black");
		}
		if($("#cameraCount").val()=="" || !reg2.test($("#cameraCount").val())){
			$("#cameraCount").css("border","1px solid red");
			flag=1;//return;
		}else {
			$("#cameraCount").css("border","1px solid black");
		}
		if($("#videoCount").val()=="" || !reg2.test($("#videoCount").val())){
			$("#videoCount").css("border","1px solid red");
			flag=1;//return;
		}else {
			$("#videoCount").css("border","1px solid black");
		}
		if($("#copycatNum").val()=="" || !reg2.test($("#copycatNum").val())){
			$("#copycatNum").css("border","1px solid red");
			flag=1;//return;
		}else {
			$("#copycatNum").css("border","1px solid black");
		}

		
		if($("#computerNum").val()=="" || !reg2.test($("#computerNum").val())){
			$("#computerNum").css("border","1px solid red");
			flag=1;//return;
		}else {
			$("#computerNum").css("border","1px solid black");
		}
		if($("#notepadNum").val()=="" || !reg2.test($("#notepadNum").val())){
			$("#notepadNum").css("border","1px solid red");
			flag=1;//return;
		}else {
			$("#notepadNum").css("border","1px solid black");
		}
		if($("#serverCount").val()=="" || !reg2.test($("#serverCount").val())){
			$("#serverCount").css("border","1px solid red");
			flag=1;//return;
		}else {
			$("#serverCount").css("border","1px solid black");
		}
		if($("#pbxCount").val()=="" || !reg2.test($("#pbxCount").val())){
			$("#pbxCount").css("border","1px solid red");
			flag=1;//return;
		}else {
			$("#pbxCount").css("border","1px solid black");
		}
		if($("#faxCount").val()=="" || !reg2.test($("#faxCount").val())){
			$("#faxCount").css("border","1px solid red");
			flag=1;//return;
		}else {
			$("#faxCount").css("border","1px solid black");
		}
		if($("#ohpCount").val()=="" || !reg2.test($("#ohpCount").val())){
			$("#ohpCount").css("border","1px solid red");
			flag=1;//return;
		}else {
			$("#ohpCount").css("border","1px solid black");
		}
		if($("#VRCOUNT").val()=="" || !reg2.test($("#VRCOUNT").val())){
			$("#VRCOUNT").css("border","1px solid red");
			flag=1;//return;
		}else {
			$("#VRCOUNT").css("border","1px solid black");
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
		<div class="commonTitle">
			<h2>
				&gt;&gt; <a href="institution-list.html">机构管理</a> - 机构创建
			</h2>
			(<span class="required">所有日期格式 均为 yyyy-mm-dd hh:mm:ss</span>)
			
			
			
		</div>
		
		<!-- <form>
			<input required>
			<input type="submit">
		</form> -->
		
			<!-- 绝对路径 -->
			<table border="0" cellspacing="1" cellpadding="0" class="commonTable">
			<form id="institutionCreat" name="institutionCreat"
				action="<%=basePath%>orgservlet?type=postupdate&id=${org.id }" method="post">
				
			<tr>
				<td align="right"><span class="required">*</span>机构编码：</td>
				<td align="left">
					<!-- 机构编码:行政区划9位+3  位流水，由系统自动根据行政区划生成，不可编辑 -->
					<input name="orgNo" type="text" class="inputTextMiddle" id="orgNo" value="${org.orgNo }" disabled/></td>
				<td align="right"><span class="required">*</span>机构代码：</td>
				<td align="left" colspan="3">
					<input name="orgCode" type="text" class="inputTextMiddle" id="orgCode" required="required" value="${org.orgCode }" disabled/>(<span
					class="required">代码格式:XXXXXXXX-X</span>)</td>
			</tr>
			<tr>
				<td align="right"><span class="required">*</span>机构名称：</td>
				<td align="left">
					<input name="orgName" type="text" class="inputTextMiddle" id="orgName" value="${org.orgName }"/></td>
				<td align="right"><span class="required">*</span>行政类别：</td>
				<td id="exetypetd" align="left" colspan="4">
					<input type="radio" name="exeType" id="radio5" value="行政部门" />行政部门
					<input type="radio" name="exeType" id="radio6" value="卫生监督机构" />卫生监督机构 
					<input type="radio" name="exeType" id="radio7" value="协作单位" />协作单位</td>
			</tr>
			<tr>
				<td align="right">地址：</td>
				<td colspan="3" align="left">
					<input name="linkAdd" type="text" class="inputTextLong" id="linkAdd" value="${org.linkAdd }"/></td>
				<td align="right">邮编：</td>
				<td align="left">
					<input name="ZIPCODE" type="text" class="inputTextNormal" id="ZIPCODE" value="${org.ZIPCODE }"/></td>
			</tr>
			<tr>
				<td align="right"><span class="required">*</span>行政区划：</td>
				<td align="left">
					<input name="areaCode" type="text" class="inputTextNormal" id="areaCode" value="${org.areaCode }" disabled/>(<span
					class="required">9位</span>)</td>
				<td align="right">挂牌日期：</td>
				<td align="left">
					<input name="listingDate" type="text" class="inputTextNormal" id="listingDate" value="${org.listingDate }"/></td>
				<td align="right">独立运行日期：</td>
				<td align="left">
					<input name="standaloneDate" type="text" class="inputTextNormal" id="standaloneDate" value="${org.standaloneDate }"/></td>
			</tr>
			<tr>
				<td align="right"><span class="required">*</span>行政区类别：</td>
				<td id="areatypetd" align="left">
					<input type="radio" name="areaType" id="radio1" value="省" />省 
					<input type="radio" name="areaType" id="radio2" value="市" />市 
					<input type="radio" name="areaType" id="radio3" value="市县级" />市县级 
					<input type="radio" name="areaType" id="radio4" value="县" />县 
					<input type="radio" name="areaType" id="radio5" value="区" />区</td>
				<td align="right">在职人数：</td>
				<td align="left">
					<input name="onworkerNum" type="text" class="inputTextNormal" id="onworkerNum" value="${info.onworkerNum }"/></td>
				<td align="right">卫生监督员数：</td>
				<td align="left">
					<input name="supervisorNum" type="text" class="inputTextNormal" id="supervisorNum" value="${info.supervisorNum }"/></td>
			</tr>
			<tr>
				<td align="right"><span class="required">*</span>机构行政级别 ：</td>
				<td align="left"><select name="orgLevel" id="orgLevel">
						<option value="0">请选择</option>
						<option value="处级">处级</option>
						<option value="副处级">副处级</option>
						<option value="科级">科级</option>
						<option value="副科级">副科级</option>
						<option value="乡级及以下">乡级及以下</option>
				</select></td>
				<td align="right"><span class="required">*</span>机构性质：</td>
				<td align="left"><select name="orgPro" id="orgPro">
						<option value="0">请选择</option>
						<option value="行政机构">行政机构</option>
						<option value="全额拔款事业单位">全额拔款事业单位</option>
						<option value="差额拔款事业单位">差额拔款事业单位</option>
						<option value="自收自支事业单位">自收自支事业单位</option>
						<option value="其他">其他</option>
				</select></td>
				<td align="right">编办批文日期：</td>
				<td align="left">
					<input name="zbbdocDate" type="text" class="inputTextNormal" id="zbbdocDate" value="${org.zbbdocDate }"/></td>
			</tr>
			<tr>
				<td align="right"><span class="required">*</span>是否参公管理 ：</td>
				<td id="idpublictd" align="left">
					<input type="radio" name="ifPublicmanage" value="是" />是
					<input type="radio" name="ifPublicmanage" value="否">否</td>
				<td align="right"><span class="required">*</span>离退休人数 ：</td>
				<td align="left">
					<input name="retireNum" type="text" class="inputTextNormal" id="retireNum" value="${info.retireNum }"/></td>
				<td align="right"><span class="required">*</span>编制人数 ：</td>
				<td align="left">
					<input name="zbbNum" type="text" class="inputTextNormal" id="zbbNum" value="${info.zbbNum }"/></td>
			</tr>
			<tr>
				<td align="right"><span class="required">*</span>房屋所有权 ：</td>
				<td align="left"><select name="buildingOwnership" id="buildingOwnership">
						<option value="0">请选择</option>
						<option value="自有">自有</option>
						<option value="借">借</option>
						<option value="租">租</option>
				</select></td>
				<td align="right">办公用房在建面积（平方米） ：</td>
				<td align="left">
					<input name="officeBuildingarea" type="text" class="inputTextNormal" id="officeBuildingarea" value="${info.officeBuildingarea }"/></td>
				<td align="right"><span class="required">*</span>办公用房建筑面积（平方米）
					：</td>
				<td align="left">
					<input name="officeBuildarea" type="text" class="inputTextNormal" id="officeBuildarea" value="${info.officeBuildarea }"/></td>
			</tr>
			<tr>
				<td align="right"><span class="required">*</span>职能科室数 ：</td>
				<td align="left">
					<input name="businessDivCount" type="text" class="inputTextNormal" id="businessDivCount" value="${info.businessDivCount }"/></td>
				<td align="right"><span class="required">*</span>派出机构数 ：</td>
				<td align="left">
					<input name="orgCount" type="text" class="inputTextNormal" id="orgCount" value="${info.orgCount }"/></td>
				<td align="right"><span class="required">*</span>业务科室数 ：</td>
				<td align="left">
					<input name="funDivCount" type="text" class="inputTextNormal" id="funDivCount" value="${info.funDivCount }"/></td>
			</tr>
			<tr>
				<td align="right"><span class="required">*</span>检测仪器设备数 ：</td>
				<td align="left" colspan="5">
					<input name="equ3Count" colspan="2" type="text" id="equ3Count" size="4" value="${info.equ3Count }"/>（价格大于一千,小于一万）<br />
					<input name="equ2Count" colspan="2" type="text" id="equ2Count" size="4" value="${info.equ2Count }"/>（价格大于一万、小于十万）<br /> 
					<input name="equ1Count" type="text" id="equ1Count" size="4" value="${info.equ1Count }"/>（价格大于十万）</td>
			</tr>
			<tr>
				<td align="right"><span class="required">*</span> 汽车数（不含快速检测车）
					：</td>
				<td align="left"><input name="busCount" type="text" class="inputTextNormal" id="busCount" value="${info.busCount }"/></td>
				<td align="right"><span class="required">*</span> 快速检测车数 ：</td>
				<td align="left"><input name="rapidtestvehicleCount" type="text" class="inputTextNormal" id="rapidtestvehicleCount" value="${info.rapidtestvehicleCount }"/></td>
				<td align="right"><span class="required">*</span> 摩托车数 ：</td>
				<td align="left"><input name="motorCount" type="text" class="inputTextNormal" id="motorCount" value="${info.motorCount }"/></td>
			</tr>
			<tr>
				<td align="right"><span class="required">*</span> 照相机数：</td>
				<td align="left"><input name="cameraCount" type="text" class="inputTextNormal" id="cameraCount" value="${info.cameraCount }"/></td>
				<td align="right"><span class="required">*</span> 摄像机数 ：</td>
				<td align="left"><input name="videoCount" type="text"
					class="inputTextNormal" id="videoCount" value="${info.videoCount }"/></td>
				<td align="right"><span class="required">*</span> 复印机数：</td>
				<td align="left"><input name="copycatNum" type="text"
					class="inputTextNormal" id="copycatNum" value="${info.copycatNum }"/></td>
			</tr>
			<tr>
				<td align="right"><span class="required">*</span> 台式电脑数 ：</td>
				<td align="left">
					<input name="computerNum" type="text" class="inputTextNormal" id="computerNum" value="${info.computerNum }"/></td>
				<td align="right"><span class="required">*</span>笔记本电脑数 ：</td>
				<td align="left">
					<input name="notepadNum" type="text" class="inputTextNormal" id="notepadNum" value="${info.notepadNum }"/></td>
				<td align="right"><span class="required">*</span> 服务器数 ：</td>
				<td align="left">
					<input name="serverCount" type="text" class="inputTextNormal" id="serverCount" value="${info.serverCount }"/></td>
			</tr>
			<tr>
				<td align="right"><span class="required">*</span>交换机数 ：</td>
				<td align="left">
					<input name="pbxCount" type="text" class="inputTextNormal" id="pbxCount" value="${info.pbxCount }"/></td>
				<td align="right"><span class="required">*</span>传真机数 ：</td>
				<td align="left">
					<input name="faxCount" type="text" class="inputTextNormal" id="faxCount" value="${info.faxCount }"/></td>
				<td align="right"><span class="required">*</span>投影仪数 ：</td>
				<td align="left">
					<input name="ohpCount" type="text" class="inputTextNormal" id="ohpCount" value="${info.ohpCount }"/></td>
			</tr>
			<tr>
				<td align="right"><span class="required">*</span>录音笔数：</td>
				<td align="left">
					<input name="VRCOUNT" type="text" class="inputTextNormal" id="VRCOUNT" value="${info.VRCOUNT }"/></td>
				<td align="right"></td>
				<td align="left"></td>
				<td align="right"></td>
				<td align="left"></td>
			</tr>
			
		</form>
		</table>
		<!--//commonTable-->
		<div id="formPageButton">
			<ul>
				<li><a href="#" title="保存" class="btnShort">保存</a></li>
				<!-- href="institution-list.html" -->
				<li><a href="javascript:void(0)" onclick="formsubmit()"
					title="提交" class="btnShort">提交修改</a></li>
				<li><a href="javascript:window.history.go(-1)" title="返回"
					class="btnShort">返回</a></li>
			</ul>
		</div>
		<!--//commonToolBar-->

		<div class="commonToolBar">
			<a href="institution-appropriation-creat.html" title="机构创建"
				class="btnNormal rt1st">添加拨款</a>
		</div>
		<!--//commonToolBar-->
		<div class="commonTitle">
			<h2>&gt;&gt; 机构财政拨款</h2>
		</div>
		<!--//commonTableSearch-->
		<table border="0" cellspacing="1" cellpadding="0" class="commonTable">
			<tr>
				<th>年度</th>
				<th width="20%">人员经费（万元）</th>
				<th width="20%">公务费（万元）</th>
				<th width="20%">业务经费（万元）</th>
				<th width="20%">基本建设资金（万元）</th>
				<th class="editColS">编辑</th>
			</tr>
			<tr>
				<td align="center">2010</td>
				<td align="center">305.26</td>
				<td align="center">1020.08</td>
				<td align="center">2089.82</td>
				<td align="center">6122.37</td>
				<td align="center"><a
					href="institution-appropriation-creat.html" class="btnIconEdit"
					title="更新"></a> <a href="#" class="btnIconDel" title="删除"></a></td>
			</tr>
			<tr>
				<td align="center">2009</td>
				<td align="center">305.26</td>
				<td align="center">1020.08</td>
				<td align="center">2089.82</td>
				<td align="center">6122.37</td>
				<td align="center"><a
					href="institution-appropriation-creat.html" class="btnIconEdit"
					title="更新"></a> <a href="#" class="btnIconDel" title="删除"></a></td>
			</tr>
			<tr>
				<td align="center">2008</td>
				<td align="center">305.26</td>
				<td align="center">1020.08</td>
				<td align="center">2089.82</td>
				<td align="center">6122.37</td>
				<td align="center"><a
					href="institution-appropriation-creat.html" class="btnIconEdit"
					title="更新"></a> <a href="#" class="btnIconDel" title="删除"></a></td>
			</tr>
			<tr>
				<td align="center">2007</td>
				<td align="center">305.26</td>
				<td align="center">1020.08</td>
				<td align="center">2089.82</td>
				<td align="center">6122.37</td>
				<td align="center"><a
					href="institution-appropriation-creat.html" class="btnIconEdit"
					title="更新"></a> <a href="#" class="btnIconDel" title="删除"></a></td>
			</tr>
			<tr>
				<td align="center">2006</td>
				<td align="center">305.26</td>
				<td align="center">1020.08</td>
				<td align="center">2089.82</td>
				<td align="center">6122.37</td>
				<td align="center"><a
					href="institution-appropriation-creat.html" class="btnIconEdit"
					title="更新"></a> <a href="#" class="btnIconDel" title="删除"></a></td>
			</tr>
			<tr>
				<td align="center">2005</td>
				<td align="center">305.26</td>
				<td align="center">1020.08</td>
				<td align="center">2089.82</td>
				<td align="center">6122.37</td>
				<td align="center"><a
					href="institution-appropriation-creat.html" class="btnIconEdit"
					title="更新"></a> <a href="#" class="btnIconDel" title="删除"></a></td>
			</tr>
		</table>
		<!--//commonTable-->
		<div id="pagelist">
			<ul class="clearfix">
				<li><a href="#">首页</a></li>
				<li><a href="#">上页</a></li>
				<li class="current">1</li>
				<li><a href="#">2</a></li>
				<li><a href="#">下页</a></li>
				<li><a href="#">尾页</a></li>
				<li class="pageinfo">第1页</li>
				<li class="pageinfo">共2页</li>
			</ul>
		</div>
	</div>
	<!--//content pages wrap-->
</body>
</html>
