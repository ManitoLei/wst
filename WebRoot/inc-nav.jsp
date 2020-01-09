<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
<link href="css/main.css" rel="stylesheet" type="text/css" />
<script src="js/jquery-1.4.2.min.js" type="text/javascript"></script>
<script src="js/jquery.treeview.js" type="text/javascript"></script>
<link href="css/jquery.treeview.css" rel="stylesheet" type="text/css" />

<script language="javascript">
	$().ready(function() {

		//树状菜单生成 JQuery Treeview
		$("#browser").treeview({
			//animated菜单展开关闭时动画效果
			animated : "slow",
			//collapsed菜单载入时关闭还是展开
			collapsed : false
		//unique同一层次是否只允许展开一个
		//unique: true
		});
		//设置树状菜单外框DIV纵向滚动条属性为自动

		$("#nav-box").css("overflowY", "auto");


		//自动添加a标签title为a标签中的内容
		for (var i = 0; i < $("span.file a").length; i++) {
			$("span.file a").eq(i).attr("title", $("span.file a").eq(i).text());
		}

	});

	//链接转入index.html页面ID为content-box的iframe显示
	function urlTarget(urls) {
		$("#content-box", parent.document.body).attr("src", urls);
	}
</script>

</head>

<body class="inc-nav-body">
	<div id="nav-box">

		<ul id="browser" class="filetree">
			<li><span class="folder">机构管理</span>
				<ul>
					<li><span class="file"><a
							onclick="urlTarget('<%=basePath%>orgservlet?type=list1&page=1');">机构列表</a></span></li>
					<li><span class="file"><a
							onclick="urlTarget('<%=basePath%>sectionservlet?type=list1&page=1');">科室列表</a></span></li>
					<li><span class="file"><a
							onclick="urlTarget('<%=basePath%>fundservlet?type=list1');">年度财政拨款情况表</a></span></li>
					<li><span class="file"><a
							onclick="urlTarget('<%=basePath%>infoservlet?type=list');">仪器设备配置情况表</a></span></li>
					<li><span class="file"><a
							onclick="urlTarget('<%=basePath%>infoservlet?type=oversightbodylist1');">监督机构基本情况表</a></span></li>
				</ul></li>

			<li><span class="folder">人员管理</span>
				<ul>
					<li><span class="file"><a
							onclick="urlTarget('<%=basePath%>stuffservlet?type=list&page=1');">人员列表</a></span></li>
					<li><span class="file"><a
							onclick="urlTarget('<%=basePath%>priservlet?type=list2&page=1');">人员授权</a></span></li>
					<li><span class="file"><a
							onclick="urlTarget('<%=basePath%>priservlet?type=list');">被授权人确认</a></span></li>
					<!--
            	<li><span class="file"><a onclick="urlTarget('content/training-list.html');">培训考核列表</a></span></li>
            	-->
					<li><span class="file"><a
							onclick="urlTarget('<%=basePath%>leaderservlet?type=list2&page=1');">所级领导名录管理</a></span></li>
					<li><span class="file"><a
							onclick="urlTarget('<%=basePath%>leaderservlet?type=list');">所级领导名录统计表</a></span></li>
					<li><span class="file"><a
							onclick="urlTarget('jsp/staff-composition.jsp');">人员构成情况表</a></span></li>
					<li><span class="file"><a
							onclick="urlTarget('jsp/member-supervisor.jsp');">卫生监督员管理信息汇总</a></span></li>
					<li><span class="file"><a
							onclick="urlTarget('jsp/member-technicist.jsp');">专业技术人员基本情况表</a></span></li>
					<li><span class="file"><a
							onclick="urlTarget('jsp/member-administrators.jsp');">行政管理人员基本情况表</a></span></li>
				</ul></li>
			<li><span class="folder">登录号管理</span>
				<ul>
					<li><span class="file"><a
							onclick="urlTarget('<%=basePath%>userservlet?type=list1&page=1');">登录号列表</a></span></li>
				</ul></li>
		</ul>
	</div>
</body>
</html>
