<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="com.google.gson.*"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!-- PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" -->
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=7" />
<title>江苏省卫生监督业务系统</title>
<link href="<%=basePath %>css/main.css" rel="stylesheet" type="text/css" media="all" />
<script src="<%=basePath %>js/jquery-1.4.2.min.js" type="text/javascript"></script>
<script type="text/javascript">
	$(function(){
	//alert("a");
		$("#ORGNAME").load("<%=basePath %>orgservlet?type=allorgname");
		$(".btnShort").click(function(){$(".content-wrap-box").show()})
	})
	function formsubmit() {
		var flag=0;
		//科室名称:必填
		if($("#divName").val()==""){
			$("#divName").css("border","1px solid red");
			flag=1;//return;
		}else {
			$("#divName").css("border","1px solid black");
		}
		//是否为分所:必选
		var choose = $("input:radio[name='ifSub']:checked").val();
		if(choose == null){
			$("#ifSub").css("background-color","red");
			flag=1;//return;
		}else{
			$("#ifSub").css("background-color","white");
		}
		if(flag==1){
			return;
		}
		//return;
		$("#institutionCreat1").submit();
		//$("#institutionCreat2").submit();
		
	}
</script>
</head>

<body class="content-pages-body">
<div class="content-pages-wrap">
    <div class="commonTitle"><h2>&gt;&gt; <a href="office-list.jsp">科室管理</a> - 科室创建</h2></div>
    <table border="0" cellspacing="1" cellpadding="0" class="commonTable">
        <form id="institutionCreat1" name="institutionCreat1" action="<%=basePath %>sectionservlet?type=create" method="post">
        <tr>
            <td align="right"><span class="required">*</span>请选择机构：</td>
            <td colspan="5" align="left">
            	<select name="ORGNAME" id="ORGNAME">
					 
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
    
        <%-- <form id="institutionCreat" name="institutionCreat" action="<%=basePath %>sectionservlet?type=create" method="post"> --%>
       <table border="0" cellspacing="1" cellpadding="0" class="commonTable">
        <tr>
            <td align="right"><span class="required">*</span>科室编码：</td>
            <td align="left"><input name="divCode" type="text" class="inputTextNormal" id="divCode" value="机构编码12位+标志位1位+流水3位自动生成"  disabled/></td>
            <td align="right"><span class="required">*</span>科室名称：</td>
            <td align="left"><input name="divName" type="text" class="inputTextMiddle" id="divName" /></td>
            <td align="right"><span class="required">*</span>是否为分所：</td>
            <td align="left"><input type="radio" name="ifSub" value=""/>是<input type="radio" name="ifSub" value=""/>否</td>
        </tr>
        <tr>
            <td align="right">电话号码：</td>
            <td align="left"><input name="dutyTel" type="text" class="inputTextNormal" id="dutyTel" /></td>
            <td align="right">传真号码：</td>
            <td align="left"><input name="fax" type="text" class="inputTextNormal" id="fax" /></td>
            <td align="right">门号：</td>
            <td align="left"><input name="divRoomNo" type="text" class="inputTextNormal" id="divRoomNo" /></td>
        </tr>
        
    </table></form>
    <div id="formPageButton">
    	<ul>
        	<li><a href="office-list.html" title="保存" class="btnShort">保存</a></li>
        	<li><a href="javascript:void(0)" onclick="formsubmit()" title="提交" class="btnShort">提交</a></li>
        	<li><a href="javascript:window.history.go(-1)" title="返回" class="btnShort">返回</a></li>
        </ul>
    </div>
    </div>
</div>
<!--//content pages wrap-->
</body>
</html>
