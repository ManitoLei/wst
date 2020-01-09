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
<link href="<%=basePath %>css/main.css" rel="stylesheet" type="text/css" media="all" />
<script src="<%=basePath %>js/jquery-1.4.2.min.js" type="text/javascript"></script>
</head>

<body class="content-pages-body">

<div class="content-pages-wrap">
    <div class="commonTitle">
    <h2>&gt;&gt; <a href="institution-list.jsp">机构管理</a> - 机构信息</h2></div>
    <table border="0" cellspacing="1" cellpadding="0" class="commonTable">
        <form id="institutionCreat" name="institutionCreat" action="" method="post">
	  <tr>
            <td width="16%" align="right" class="title"><span class="required">*</span>机构编码：</td>
            <td width="17%" align="left">${org.orgNo }</td>
             <td width="16%" align="right" class="title"><span class="required">*</span>机构代码：</td>
            <td width="17%" align="left">${org.orgCode }</td>
            <td width="16%" class="title" align="right"><span class="required">*</span>机构名称：</td>
            <td width="17%" align="left">${org.orgName }</td>
        </tr>
        <tr>
           <td width="15%" align="right" class="title"><span class="required">*</span>行政类别：</td>
            <td width="19%" align="left">
            	${org.exeType }</td>
           <td align="right" class="title">行政区划：</td>
            <td align="left" colspan="3">${org.areaCode }</td>
        </tr>
        <tr>
            <td align="right" class="title">地址：</td>
            <td align="left" colspan="3">${org.linkAdd }</td>
            <td align="right" class="title">邮编：</td>
            <td align="left">${org.ZIPCODE }</td>
        </tr>
        <tr>
            <td align="right" class="title">挂牌日期：</td>
            <td align="left">${org.listingDate }</td>
            <td align="right" class="title">独立运行日期：</td>
            <td align="left">${org.standaloneDate }</td>
            <td align="right" class="title"><span class="required">*</span>行政区类别：</td>
            <td align="left">
            	${org.areaType }</td>
        </tr>
        <tr>
            <td align="right" class="title">在职人数：</td>
            <td align="left">${info.onworkerNum }</td>
            <td align="right" class="title">卫生监督员数：</td>
            <td align="left">${info.supervisorNum }</td>
            <td align="right" class="title">编办批文日期：</td>
            <td align="left">${org.zbbdocDate }</td>
        </tr>
		<tr>
            <td align="right" class="title"><span class="required">*</span>机构行政级别 ：</td>
            <td align="left" >${org.orgLevel }</td>
            <td align="right" class="title"><span class="required">*</span>机构性质：</td>
            <td align="left">${org.orgPro }</td>
            <td align="right" class="title"><span class="required">*</span>编制人数 ：</td>
            <td align="left">${info.zbbNum }</td>
		</tr>
		<tr>
            <td align="right" class="title"><span class="required">*</span>是否参公管理 ：</td>
          <td align="left">${info.ifPublicmanage }</td>
            <td align="right" class="title"><span class="required">*</span>离退休人数 ：</td>
            <td align="left">${info.retireNum }</td>
            <td align="right" class="title"> <span class="required">*</span>办公用房建筑面积（平方米） ：</td>
            <td align="left">${info.officeBuildarea }</td>
		</tr>
		<tr>
            <td align="right" class="title"><span class="required">*</span>房屋所有权 ：</td>
            <td align="left">${info.buildingOwnership }</td>
            <td align="right" class="title"> 办公用房在建面积（平方米） ：</td>
            <td align="left">${info.officeBuildingarea }</td>
            <td align="right" class="title"><span class="required">*</span>业务科室数 ：</td>
            <td align="left">${info.funDivCount }</td>
		</tr>
		<tr>
            <td align="right" class="title"><span class="required">*</span>职能科室数 ：</td>
            <td align="left">${info.businessDivCount }</td>
            <td align="right" class="title"><span class="required">*</span>派出机构数 ：</td>
            <td align="left">${info.orgCount }</td>
            <td align="right" class="title"><span class="required">*</span> 检测仪器设备数 ：</td>
            <td align="left">
			${info.equ3Count }台（一千&lt;价格&lt;一万）<br/>
			${info.equ2Count }台（一万&lt;价格&lt;十万）<br/>
		  	${info.equ1Count }台（价格大于十万）</td>
        </tr>
		<tr>
            <td align="right" class="title"><span class="required">*</span> 汽车数（不含快速检测车） ：</td>
            <td align="left">${info.busCount }</td>
            <td align="right" class="title"><span class="required">*</span> 快速检测车数 ：</td>
            <td align="left">${info.rapidtestvehicleCount }</td>
            <td align="right" class="title"><span class="required">*</span> 摩托车数 ：</td>
            <td align="left">${info.motorCount }</td>
        </tr>
		<tr>
            <td align="right" class="title"><span class="required">*</span> 照相机数

 ：</td>
            <td align="left">${info.cameraCount }</td>
            <td align="right" class="title"><span class="required">*</span> 摄像机数 ：</td>
            <td align="left">${info.videoCount }</td>
            <td align="right" class="title"><span class="required">*</span> 复印机数：</td>
            <td align="left">${info.copycatNum }</td>
        </tr>
		<tr>
            <td align="right" class="title"><span class="required">*</span> 台式电脑数 ：</td>
            <td align="left">${info.computerNum }</td>
            <td align="right" class="title"> <span class="required">*</span>笔记本电脑数 ：</td>
            <td align="left">${info.notepadNum }</td>
            <td align="right" class="title"><span class="required">*</span> 服务器数 ：</td>
            <td align="left">${info.serverCount }</td>
        </tr>
		<tr>
            <td align="right" class="title"> <span class="required">*</span>交换机数 ：</td>
            <td align="left">${info.pbxCount }</td>
            <td align="right" class="title"> <span class="required">*</span>传真机数 ：</td>
            <td align="left">${info.faxCount }</td>
            <td align="right" class="title"> <span class="required">*</span>投影仪数

 ：</td>
            <td align="left">${info.ohpCount }</td>
        </tr>
        <tr>
            <td align="right" class="title"> <span class="required">*</span>录音笔数 ：</td>
            <td align="left">${info.VRCOUNT }</td>
      
        </tr>
        </form>
    </table>
    <!--//commonTable-->
    <div id="formPageButton">
    	<ul>
        	<!-- <li><a href="institution-creat.jsp" title="修改" class="btnShort">修改</a></li> -->
        	<li><a href="javascript:window.history.go(-1)" title="返回" class="btnShort">返回</a></li>
        </ul>
    </div>
    <!--//commonToolBar-->
    
    <div class="commonToolBar">
    	<a href="institution-appropriation-creat.jsp" title="机构创建" class="btnNormal rt1st">添加拨款</a>
    </div>
    <!--//commonToolBar-->
   	<div class="commonTitle">
    	    <h2>&gt;&gt; 机构财政拨款</h2></div>
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
            <td align="center">
            	<a href="institution-appropriation-edit.jsp" class="btnIconEdit" title="更新"></a>
                <a href="#" class="btnIconDel" title="删除"></a>
            </td>
        </tr>
        <tr>
            <td align="center">2009</td>
            <td align="center">305.26</td>
            <td align="center">1020.08</td>
            <td align="center">2089.82</td>
            <td align="center">6122.37</td>
            <td align="center">
            	<a href="institution-appropriation-edit.jsp" class="btnIconEdit" title="更新"></a>
                <a href="#" class="btnIconDel" title="删除"></a>
            </td>
        </tr>
        <tr>
            <td align="center">2008</td>
            <td align="center">305.26</td>
            <td align="center">1020.08</td>
            <td align="center">2089.82</td>
            <td align="center">6122.37</td>
            <td align="center">
            	<a href="institution-appropriation-edit.jsp" class="btnIconEdit" title="更新"></a>
                <a href="#" class="btnIconDel" title="删除"></a>
            </td>
        </tr>
        <tr>
            <td align="center">2007</td>
            <td align="center">305.26</td>
            <td align="center">1020.08</td>
            <td align="center">2089.82</td>
            <td align="center">6122.37</td>
            <td align="center">
            	<a href="institution-appropriation-edit.jsp" class="btnIconEdit" title="更新"></a>
                <a href="#" class="btnIconDel" title="删除"></a>
            </td>
        </tr>
        <tr>
            <td align="center">2006</td>
            <td align="center">305.26</td>
            <td align="center">1020.08</td>
            <td align="center">2089.82</td>
            <td align="center">6122.37</td>
            <td align="center">
            	<a href="institution-appropriation-edit.jsp" class="btnIconEdit" title="更新"></a>
                <a href="#" class="btnIconDel" title="删除"></a>
            </td>
        </tr>
        <tr>
            <td align="center">2005</td>
            <td align="center">305.26</td>
            <td align="center">1020.08</td>
            <td align="center">2089.82</td>
            <td align="center">6122.37</td>
            <td align="center">
            	<a href="institution-appropriation-edit.jsp" class="btnIconEdit" title="更新"></a>
                <a href="#" class="btnIconDel" title="删除"></a>
            </td>
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
