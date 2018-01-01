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
		//	$.messager.alert("warning",'The warning message');
		  /*  $.messager.confirm('标题内容','确认吗？',function(r){
		    	if(r){
		    		$.messager.alert('确认','确认了');
		    		
		    	}else{
		    		$.messager.alert('warning','取消','error');
		    		
		    	}
		    })*/
		  /*  $.messager.prompt('提示信息','请输入内容',function(val){
		    	alert(val);
		    })*/
		    /*
				options 这样定义：
				title： 显示在头部面板上的标题文字，默认值是 '' 。
				msg： 消息框的文本，默认值是 '' 。
				text： 显示在进度条里的文字，默认值是 undefined 。
				interval： 每次进度更新之间以毫秒为单位的时间长度。默认值是 300 。
			
		    */
		   /* $.messager.progress({
		    	title:'warning....!',
		    	text:'导弹真在自毁中.....请快速撤离!',
		    	msg:'警告！',
		    	interval:'1000'
		    })*/
		        $.messager.show({
		    	title:'萱萱发来信息',
		    	
		    	msg:'快和她聊天！！！',
		    	
		    })
		   
		})
		
		
		</script>
	
  </head>
  
  <body>
   
  </body>
</html>
