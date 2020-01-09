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
<link href="../css/main.css" rel="stylesheet" type="text/css"
	media="all" />
<script src="../js/jquery-1.4.2.min.js" type="text/javascript"></script>
</head>
<body class="content-pages-body">
	<div class="content-pages-wrap">
		<div class="commonTitle">
			<h2>&gt;&gt; 人员管理 - 行政管理人员基本情况表</h2>
		</div>
		<table width="100%" border="0" cellspacing="0" cellpadding="0"
			class="commonTableSearch">
			<form id="form-search" name="form-search" action="" method="post">
				<tr>
					<td align="right">监督机构：</td>
					<td><select name="select" id="select">
							<option value="">请选择</option>
							<option value="">监督机构1</option>
							<option value="">监督机构2</option>
					</select></td>
					<td align="right"><button>检索</button>&nbsp;&nbsp;&nbsp;
						<button>导出</button></td>
				</tr>
			</form>
		</table>
		<table border="0" align="center" cellpadding="0" cellspacing="1"
			class="commonTable">
			<tr>
				<td colspan="18" align="center">
					<table width="100%" border="0" cellspacing="0" cellpadding="0"
						class="noStyleTable">
						<tr>
							<td width="20%">填表单位:</td>
							<td align="center">数字截至时间:2009年12月31号</td>
							<td width="20%" align="right">表号:人社统PS3号</td>
						</tr>
					</table>
				</td>
			</tr>
			<tr>
				<td rowspan="2" colspan="1" align="center">项目</td>
				<td rowspan="2" align="center">序号</td>
				<td colspan="4" align="center">&nbsp;</td>
				<td colspan="6" align="center">学历</td>
				<td colspan="6" align="center">年龄</td>
			</tr>
			<tr>
				<td width="5%" align="center">合计</td>
				<td width="5%" align="center">女</td>
				<td width="5%" align="center">少数民族</td>
				<td width="5%" align="center">中国党员</td>
				<td width="5%" align="center">研究生（含博士）</td>
				<td width="5%" align="center">博士</td>
				<td width="5%" align="center">大学本科</td>
				<td width="5%" align="center">大学专科</td>
				<td width="5%" align="center">中专</td>
				<td width="5%" align="center">高中及以下</td>
				<td width="5%" align="center">35岁及以下</td>
				<td width="5%" align="center">36岁至40岁</td>
				<td width="5%" align="center">41岁至45岁</td>
				<td width="5%" align="center">46岁至50岁</td>
				<td width="5%" align="center">51岁至55岁</td>
				<td width="5%" align="center">55岁及以上</td>
			</tr>
			<tr>
				<td align="center">甲</td>
				<td align="center">乙</td>
				<td width="5%" align="center">1</td>
				<td width="5%" align="center">2</td>
				<td width="5%" align="center">3</td>
				<td width="5%" align="center">4</td>
				<td width="5%" align="center">5</td>
				<td width="5%" align="center">6</td>
				<td width="5%" align="center">7</td>
				<td width="5%" align="center">8</td>
				<td width="5%" align="center">9</td>
				<td width="5%" align="center">10</td>
				<td width="5%" align="center">11</td>
				<td width="5%" align="center">12</td>
				<td width="5%" align="center">13</td>
				<td width="5%" align="center">14</td>
				<td align="center">15</td>
				<td align="center">15</td>
			</tr>
			<tr>
				<td align="center">总计</td>
				<td align="center">1</td>
				<td align="center">9</td>
				<td align="center">11</td>
				<td align="center">&nbsp;</td>
				<td align="center">74</td>
				<td align="center">43</td>
				<td align="center">34</td>
				<td align="center">83</td>
				<td align="center">25</td>
				<td align="center">36</td>
				<td align="center">111</td>
				<td align="center">165</td>
				<td align="center">654</td>
				<td align="center">&nbsp;</td>
				<td align="center">&nbsp;</td>
				<td align="center">56</td>
				<td align="center">15</td>
			</tr>
			<tr>
				<td align="center">省部级正职</td>
				<td align="center">2</td>
				<td align="center">45</td>
				<td align="center">9</td>
				<td align="center">11</td>
				<td align="center">85</td>
				<td align="center">36</td>
				<td align="center">34</td>
				<td align="center">96</td>
				<td align="center">65</td>
				<td align="center">73</td>
				<td align="center">112</td>
				<td align="center">63</td>
				<td align="center">36</td>
				<td align="center">6463</td>
				<td align="center">6</td>
				<td align="center">56</td>
				<td align="center">15</td>
			</tr>
			<tr>
				<td align="center">省部级副职</td>
				<td align="center">3</td>
				<td align="center">34</td>
				<td align="center">45</td>
				<td align="center">9</td>
				<td align="center">11</td>
				<td align="center">64</td>
				<td align="center">45</td>
				<td align="center">97</td>
				<td align="center">548</td>
				<td align="center">37</td>
				<td align="center">363</td>
				<td align="center">36</td>
				<td align="center">36</td>
				<td align="center">6</td>
				<td align="center">565</td>
				<td align="center">65</td>
				<td align="center">15</td>
			</tr>
			<tr>
				<td align="center">厅局级正职</td>
				<td align="center">4</td>
				<td align="center">3</td>
				<td align="center">34</td>
				<td align="center">45</td>
				<td align="center">9</td>
				<td align="center">11</td>
				<td align="center">52</td>
				<td align="center">57</td>
				<td align="center">86</td>
				<td align="center">74</td>
				<td align="center">65</td>
				<td align="center">56</td>
				<td align="center">56</td>
				<td align="center">6</td>
				<td align="center">64</td>
				<td align="center">64</td>
				<td align="center">15</td>
			</tr>
			<tr>
				<td align="center">厅局级副职</td>
				<td align="center">5</td>
				<td align="center">64</td>
				<td align="center">5</td>
				<td align="center">34</td>
				<td align="center">45</td>
				<td align="center">9</td>
				<td align="center">11</td>
				<td align="center">86</td>
				<td align="center">86</td>
				<td align="center">45</td>
				<td align="center">45</td>
				<td align="center">64</td>
				<td align="center">36</td>
				<td align="center">64</td>
				<td align="center">756</td>
				<td align="center">64</td>
				<td align="center">15</td>
			</tr>
			<tr>
				<td align="center">县处级正职</td>
				<td align="center">6</td>
				<td align="center">34</td>
				<td align="center">64</td>
				<td align="center">5</td>
				<td align="center">34</td>
				<td align="center">45</td>
				<td align="center">9</td>
				<td align="center">11</td>
				<td align="center">86</td>
				<td align="center">45</td>
				<td align="center">45</td>
				<td align="center">45</td>
				<td align="center">36</td>
				<td align="center">46</td>
				<td align="center">75</td>
				<td align="center">4</td>
				<td align="center">15</td>
			</tr>
			<tr>
				<td align="center">县处级副职</td>
				<td align="center">7</td>
				<td align="center">34</td>
				<td align="center">54</td>
				<td align="center">64</td>
				<td align="center">5</td>
				<td align="center">34</td>
				<td align="center">45</td>
				<td align="center">9</td>
				<td align="center">11</td>
				<td align="center">25</td>
				<td align="center">5</td>
				<td align="center">&nbsp;</td>
				<td align="center">36</td>
				<td align="center">65</td>
				<td align="center">57</td>
				<td align="center">654</td>
				<td align="center">15</td>
			</tr>
			<tr>
				<td align="center">乡科级正职</td>
				<td align="center">8</td>
				<td align="center">54</td>
				<td align="center">54</td>
				<td align="center">34</td>
				<td align="center">64</td>
				<td align="center">5</td>
				<td align="center">34</td>
				<td align="center">45</td>
				<td align="center">9</td>
				<td align="center">11</td>
				<td align="center">25</td>
				<td align="center">252</td>
				<td align="center">263</td>
				<td align="center">46</td>
				<td align="center">57</td>
				<td align="center">436</td>
				<td align="center">15</td>
			</tr>
			<tr>
				<td align="center">乡科级副职</td>
				<td align="center">9</td>
				<td align="center">35</td>
				<td align="center">37</td>
				<td align="center">36</td>
				<td align="center">36</td>
				<td align="center">76</td>
				<td align="center">5</td>
				<td align="center">34</td>
				<td align="center">54</td>
				<td align="center">9</td>
				<td align="center">11</td>
				<td align="center">25</td>
				<td align="center">635</td>
				<td align="center">654</td>
				<td align="center">756</td>
				<td align="center">57</td>
				<td align="center">15</td>
			</tr>
		</table>
		<div class="commonTableFooter">
			填报注意事项：年龄在&quot;35岁及以下&quot;职务在副厅级以上,学历在&quot;高中及以下&quot;职务在副厅级以上,
			要填报名单(姓名、性别、年龄、单位以及职务、任职时间)
			<!--//commonTable-->
		</div>
		<!--//content pages wrap-->
</body>
</html>
