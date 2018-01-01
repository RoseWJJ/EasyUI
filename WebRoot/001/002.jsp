<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP '001.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript" src="js/jquery-easyui-1.2.6/jquery-1.7.2.min.js"></script>
	<script type="text/javascript" src="js/jquery-easyui-1.2.6/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="js/jquery-easyui-1.2.6/locale/easyui-lang-zh_CN.js"></script>
	<link rel="stylesheet" href="js/jquery-easyui-1.2.6/themes/default/easyui.css"/>
	<link rel="stylesheet" href="js/jquery-easyui-1.2.6/themes/icon.css"/>
		<script type="text/javascript">
		$(function(){
			/*$("#mypanel").panel({
				title:'我的面板',
				height:300,
				width:300,
				minimizable:true,
				closable:true,
				content:'珍爱生命，远离屁壳子'

			});*/
		   
			
		})
		</script>
	
  </head>
  
  <body>
	  <!--
	          使用组		件的两种方式： 1html 2js
		html方式测试：
		<div minimizable="true" collapsible="true"id="mypanel" class="easyui-panel" style="width:500px;height:300px;padding:10px;" closable="true" maximizable=true title="MyPanel"  iconCls="icon-save">
			老梁放屁了 快跑
		</div>
		
	   -->
		<div id="mypanel">老梁放屁了 快跑</div>
		<a id="btn" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-search'">查询</a>  
		
		
  </body>
</html>
