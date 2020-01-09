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
</head>
<script type="text/javascript">
	function jdy_hide() {
		document.getElementById('jdy1').style.display = 'none';
		document.getElementById('jdy2').style.display = 'none';
	}
	function jdy_show() {
		document.getElementById('jdy1').style.display = 'block';
		document.getElementById('jdy2').style.display = 'block';
	}
	$(document).ready(function(){
		$("input[name=gender][value=${stuff.gender }]").attr("checked",true);
		$("select[name=folk]").find("option[value=${stuff.folk }]").attr("selected",true);
		$("select[name=pol]").find("option[value=${stuff.pol }]").attr("selected",true);
		$("select[name=edu]").find("option[value=${stuff.edu }]").attr("selected",true);
		$("select[name=spe]").find("option[value=${stuff.spe }]").attr("selected",true);
		$("select[name=manageJob]").find("option[value=${stuff.manageJob }]").attr("selected",true);
		$("select[name=perPro]").find("option[value=${stuff.perPro }]").attr("selected",true);
		$("select[name=jobLevel]").find("option[value=${stuff.jobLevel }]").attr("selected",true);
		$("select[name=title]").find("option[value=${stuff.title }]").attr("selected",true);
		$("input[name=ifStaffPer][value=${stuff.ifStaffPer }]").attr("checked",true);
	});
	function formsubmit() {
	var flag=0;
		
		//人员编码:必填状态
		if($("#sectionId").val()==""){
			$("#sectionId").css("border","1px solid red");
			flag=1;//return;
		}else {
			$("#sectionId").css("border","1px solid black");
		}
		//姓名:必填状态
		if($("#repManName").val()==""){
			$("#repManName").css("border","1px solid red");
			flag=1;//return;
		}else {
			$("#repManName").css("border","1px solid black");
		}
		//性别:必选
		var choose = $("input:radio[name='gender']:checked").val();
		if(choose == null){
			$("#gender").css("background-color","red");
			flag=1;//return;
		}else{
			$("#gender").css("background-color","white");
		}
		//出生日期: 必填，格式yyyy-mm-dd hh:mm:ss
		var reg = /^[1-9]\d{3}-(0[1-9]|1[0-2]|[1-9])-(0[1-9]|[1-2][0-9]|3[0-1]|[1-9])\s+(20|21|22|21|[0-1]\d|\d):([0-5]\d|\d):([0-5]\d|\d)$/
		//alert(reg.test($("#listingDate").val()));
		if($("#birthDate").val()=="" || !reg.test($("#birthDate").val())){
			$("#birthDate").css("border","1px solid red");
			flag=1;//return;
		}else {
			$("#birthDate").css("border","1px solid black");
		}
		//政治面貌:必选
		if($("#pol").val()=="0"){
			$("#pol").css("border","1px solid red");
			flag=1;
		}else{
			$("#pol").css("border","1px solid black");
		}
		//学历:必选
		if($("#edu").val()=="0"){
			$("#edu").css("border","1px solid red");
			flag=1;
		}else{
			$("#edu").css("border","1px solid black");
		}
		//何时参加工作: 必填，格式yyyy-mm-dd hh:mm:ss
		var reg = /^[1-9]\d{3}-(0[1-9]|1[0-2]|[1-9])-(0[1-9]|[1-2][0-9]|3[0-1]|[1-9])\s+(20|21|22|21|[0-1]\d|\d):([0-5]\d|\d):([0-5]\d|\d)$/
		//alert(reg.test($("#listingDate").val()));
		if($("#beginWorkDate").val()=="" || !reg.test($("#beginWorkDate").val())){
			$("#beginWorkDate").css("border","1px solid red");
			flag=1;//return;
		}else {
			$("#beginWorkDate").css("border","1px solid black");
		}
		//职务:必选
		if($("#manageJob").val()=="0"){
			$("#manageJob").css("border","1px solid red");
			flag=1;
		}else{
			$("#manageJob").css("border","1px solid black");
		}
		//职级:必选
		if($("#jobLevel").val()=="0"){
			$("#jobLevel").css("border","1px solid red");
			flag=1;
		}else{
			$("#jobLevel").css("border","1px solid black");
		}
		//职称:必选
		if($("#title").val()=="0"){
			$("#title").css("border","1px solid red");
			flag=1;
		}else{
			$("#title").css("border","1px solid black");
		}
		//何时进卫生监督所: 格式yyyy-mm-dd hh:mm:ss
		if($("#getInDate").val()!="" && !reg.test($("#getInDate").val())){
			$("#getInDate").css("border","1px solid red");
			flag=1;//return;
		}else {
			$("#getInDate").css("border","1px solid black");
		}
		//人员性质:必选
		if($("#perPro").val()=="0"){
			$("#perPro").css("border","1px solid red");
			flag=1;
		}else{
			$("#perPro").css("border","1px solid black");
		}
		//行政执法证号:必填状态
 		if($("#enfCardNo").val()==""){
			$("#enfCardNo").css("border","1px solid red");
			flag=1;//return;
		}else {
			$("#enfCardNo").css("border","1px solid black");
		}
		//何时取得行政执法证: 必填，格式yyyy-mm-dd hh:mm:ss
		if($("#getCardDate").val()=="" || !reg.test($("#getCardDate").val())){
			$("#getCardDate").css("border","1px solid red");
			flag=1;//return;
		}else {
			$("#getCardDate").css("border","1px solid black");
		}
		//卫生监督胸牌号:必填状态
		if($("#healthCardNo").val()==""){
			$("#healthCardNo").css("border","1px solid red");
			flag=1;//return;
		}else {
			$("#healthCardNo").css("border","1px solid black");
		}
		//何时取得卫生监督员资格: 必填，格式yyyy-mm-dd hh:mm:ss
		if($("#getQuaDate").val()=="" || !reg.test($("#getCardDate").val())){
			$("#getQuaDate").css("border","1px solid red");
			flag=1;//return;
		}else {
			$("#getQuaDate").css("border","1px solid black");
		}
		//目前持有有效的监督员证号:必填状态
		if($("#perCode").val()==""){
			$("#perCode").css("border","1px solid red");
			flag=1;//return;
		}else {
			$("#perCode").css("border","1px solid black");
		}
		//目前所持有效监督员证的有效时间: 必填，格式yyyy-mm-dd hh:mm:ss
		if($("#cardDay").val()=="" || !reg.test($("#getCardDate").val())){
			$("#cardDay").css("border","1px solid red");
			flag=1;//return;
		}else {
			$("#cardDay").css("border","1px solid black");
		}
		//是否为在编人员:必选
		var choose = $("input:radio[name='ifStaffPer']:checked").val();
		if(choose == null){
			$("#ifStaffPer").css("background-color","red");
			flag=1;//return;
		}else{
			$("#ifStaffPer").css("background-color","white");
		}
		
		if(flag==1){
			return;
		}
		//return;
		$("#memberCreat").submit();
	}
</script>
<body class="content-pages-body">
	<div class="content-pages-wrap">
		<div class="commonTitle">
			<h2>
				&gt;&gt; <a href="member-list.jsp">人员管理</a> - 人员创建
			</h2>
		</div>
		<table border="0" cellspacing="1" cellpadding="0" class="commonTable">
			<form id="memberCreat" name="memberCreat" action="<%=basePath%>stuffservlet?type=update&id=${stuff.id }" method="post">
				<tr>
					<td width="12%" align="right"><span class="required">*</span>人员编码：</td>
					<td width="21%" align="left"><input name="sectionId"
						type="text" class="inputTextNormal" id="sectionId" value="${stuff.sectionId }"/></td>
					<td width="12%" align="right"><span class="required">*</span>姓名：</td>
					<td width="21%" align="left"><input name="repManName"
						type="text" class="inputTextNormal" id="repManName" value="${stuff.repManName }"/></td>
					<td width="12%" align="right"><span class="required">*</span>性别：</td>
					<td align="left"><input type="radio" name="gender" id="radio1"
						value="男" /> 男 <in男put type="radio" name="gender" id="radio2"
						value="女" /> 女</td>
				</tr>
				<tr>
					<td align="right"><span class="required">*</span>出生年月：</td>
					<td align="left"><input name="birthDate" type="text"
						class="inputTextNormal" id="birthDate" value="${stuff.birthDate }"/></td>
					<td align="right">民族：</td>
					<td align="left"><select name="folk" id="folk">
							<option value="0">请选择</option>
							<option value="汉">汉</option>
							<option value="其他">其他</option>
					</select></td>
					<td align="right"><span class="required">*</span>政治面貌：</td>
					<td align="left"><select name="pol" id="pol">
							<option value="0">请选择</option>
							<option value="中共党员">中共党员</option>
							<option value="团员">团员</option>
							<option value="民族党派">民族党派</option>
							<option value="群众">群众</option>
					</select></td>
				</tr>
				<tr>
					<td width="12%" align="right">手机：</td>
					<td width="21%" align="left"><input name="mobile"
						type="text" class="inputTextNormal" id="mobile" value="${stuff.mobile }"/></td>
					<td width="12%" align="right">电话：</td>
					<td width="21%" align="left"><input name="workTel"
						type="text" class="inputTextNormal" id="workTel" value="${stuff.workTel }"/></td>
					<td width="12%" align="right">电子邮件：</td>
					<td align="left"><input name="email" type="text"
						class="inputTextNormal" id="email" value="${stuff.email }"/></td>
				</tr>
				<tr>
					<td align="right"><span class="required">*</span>学历：</td>
					<td align="left"><select name="edu" id="edu">
							<option value="0">请选择</option>
							<option value="博士">博士</option>
							<option value="硕士">硕士</option>
							<option value="本科">本科</option>
							<option value="大专">大专</option>
							<option value="中专">中专</option>
							<option value="高中">高中</option>
							<option value="初中">初中</option>
							<option value="无学历">无学历</option>
					</select></td>
					<td align="right">毕业学校：</td>
					<td align="left"><input name="graCollege" type="text"
						class="inputTextNormal" id="graCollege" value="${stuff.graCollege }"/></td>
					<td align="right">所选专业：</td>
					<td align="left"><input name="choiceSpe" type="text"
						class="inputTextNormal" id="choiceSpe" value="${stuff.choiceSpe }"/></td>
				</tr>
				<tr>
					<td align="right">所学专业类型：</td>
					<td align="left"><select name="spe" id="spe">
							<option value="0">请选择</option>
							<option value="工程">工程</option>
							<option value="法律">法律</option>
							<option value="医药">医药</option>
							<option value="公共卫生">公共卫生</option>
							<option value="无专业">无专业</option>
							<option value="其他专业">其他专业</option>
							<option value="不详">不详</option>
					</select></td>
					<td align="right">建所前从事专业：</td>
					<td align="left"><input name="beforeSpe" type="text"
						class="inputTextNormal" id="beforeSpe" value="${stuff.beforeSpe }"/></td>
					<td align="right"><span class="required">*</span>何时参加工作：</td>
					<td align="left"><input name="beginWorkDate" type="text"
						class="inputTextNormal" id="beginWorkDate" value="${stuff.beginWorkDate }"/></td>
				</tr>
				<tr>
					<td align="right"><span class="required">*</span>职务：</td>
					<td align="left"><select name="manageJob" id="manageJob">
							<option value="0">请选择</option>
							<option value="所长">所长</option>
							<option value="书记">书记</option>
							<option value="副所长">副所长</option>
							<option value="副书记">副书记</option>
							<option value="主任(科长)">主任(科长)</option>
							<option value="副主任(副科长)">副主任(副科长)</option>
							<option value="科员">科员</option>
							<option value="无">无</option>
					</select></td>
					<td align="right"><span class="required">*</span>职级：</td>
					<td align="left"><select name="jobLevel" id="jobLevel">
							<option value="0">请选择</option>
							<option value="省部级正职">省部级正职</option>
							<option value="省部级副职">省部级副职</option>
							<option value="厅局级正职">厅局级正职</option>
							<option value="厅局级副职">厅局级副职</option>
							<option value="乡科级正职">乡科级正职</option>
							<option value="乡科级副职">乡科级副职</option>
							<option value="县处级正职">县处级正职</option>
							<option value="县处级副职">县处级副职</option>
							<option value="科办员">科办员</option>
					</select></td>
					<td align="right"><span class="required">*</span>职称：</td>
					<td align="left"><select name="title" id="title">
							<option value="0">请选择</option>
							<option value="初级（医（技）师）">初级（医（技）师）</option>
							<option value="初级（助理政工师）">初级（助理政工师）</option>
							<option value="初级（助理工程师）">初级（助理工程师）</option>
							<option value="初级（助理会计师）">初级（助理会计师）</option>
							<option value="初级（研究实习员）">初级（研究实习员）</option>
							<option value="中级（主管（治）医（技）师）">中级（主管（治）医（技）师）</option>
							<option value="中级（政工师）">中级（政工师）</option>
							<option value="中级（馆员）">中级（馆员）</option>
							<option value="中级（工程师）">中级（工程师）</option>
							<option value="中级（会计师）">中级（会计师）</option>
							<option value="副高（副主任医（技）师）">副高（副主任医（技）师）</option>
							<option value="副高（高级政工师）">副高（高级政工师）</option>
							<option value="副高（高级会计师）">副高（高级会计师）</option>
							<option value="正高（主任医（技）师））">正高（主任医（技）师））</option>
							<option value="未聘任专业技术职务">未聘任专业技术职务</option>
							<option value="无职称">无职称</option>
					</select></td>
				</tr>
				<tr>
					<td align="right">何时进卫生监督所：</td>
					<td align="left"><input name="getInDate" type="text"
						class="inputTextNormal" id="getInDate" value="${stuff.getInDate }"/></td>
					<td align="right"><span class="required">*</span>人员性质：</td>
					<td align="left"><select name="perPro" id="perPro">
							<option value="0">请选择</option>
							<option value="聘用制干部">聘用制干部</option>
							<option value="聘用制工人">聘用制工人</option>
							<option value="固定干部">固定干部</option>
							<option value="固定工人">固定工人</option>
							<option value="其他">其他</option>
					</select></td>
					<td align="right">类别：</td>
					<td align="left"><input type="radio" name="perType" id="radio1"
						value="radio1" checked onclick="jdy_show()" /> 监督人员 <input
						type="radio" name="perType" id="radio2" value="radio2"
						onclick="jdy_hide()" /> 协查人员 <input type="radio" name="perType"
						id="radio2" value="radio2" onclick="jdy_hide()" /> 不详</td>
				</tr>
				<tr id="jdy1">
					<td align="right"><span class="required">*</span>行政执法证号：</td>
					<td align="left"><input name="enfCardNo" type="text"
						class="inputTextNormal" id="enfCardNo" value="${stuff.enfCardNo }"/></td>
					<td align="right"><span class="required">*</span>何时取得行政执法证：</td>
					<td align="left"><input name="getCardDate" type="text"
						class="inputTextNormal" id="getCardDate" value="${stuff.getCardDate }"/></td>
					<td align="right"><span class="required">*</span>卫生监督胸牌号：</td>
					<td align="left"><input name="healthCardNo" type="text"
						class="inputTextNormal" id="healthCardNo" value="${stuff.healthCardNo }"/></td>
					</td>
				</tr>
				<tr id="jdy2">
					<td align="right"><span class="required">*</span>何时取得卫生监督员资格：</td>
					<td align="left"><input name="getQuaDate" type="text"
						class="inputTextNormal" id="getQuaDate" value="${stuff.getQuaDate }"/></td>
					<td align="right"><span class="required">*</span>目前持有有效的监督员证号：</td>
					<td align="left"><input name="perCode" type="text"
						class="inputTextNormal" id="perCode" value="${stuff.perCode }"/></td>
					<td align="right"><span class="required">*</span>目前所持有效监督员证的有效时间：</td>
					<td align="left"><input name="cardDay" type="text"
						class="inputTextNormal" id="cardDay" value="${stuff.cardDay }"/></td>
				</tr>
				<tr>
					<td align="right"><span class="required">*</span>是否为在编人员：</td>
					<td align="left"><input type="radio" name="ifStaffPer" id="radio1"
						value="是" /> 是 <input type="radio" name="ifStaffPer" id="radio2"
						value="否" /> 否</td>
					<td align="right"></td>
					<td align="left"></td>
					<td align="right">&nbsp;</td>
					<td align="left">&nbsp;</td>
				</tr>
			</form>
		</table>
		<!--//commonTable-->
		<div id="formPageButton">
			<ul>
				<li><a href="member-list.jsp" title="保存" class="btnShort">保存</a></li>
				<li><a href="javascript:void(0)" onclick="formsubmit()"
					title="提交" class="btnShort">提交修改</a></li>
				<li><a href="javascript:window.history.go(-1)" title="返回"
					class="btnShort">返回</a></li>
			</ul>
		</div>
		<!--//commonToolBar-->
	</div>
	<!--//content pages wrap-->
</body>
</html>
