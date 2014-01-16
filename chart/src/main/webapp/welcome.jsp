<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ include file="jsp/common/head.jsp" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>欢迎进入聊天下台</title>
</head>
<script>
$(window).resize(function(){ 
    $("#welcomeTab").css({ 
        position: "absolute", 
        left: ($(window).width() - $("#welcomeTab").outerWidth())/2, 
        top: ($(window).height() - $("#welcomeTab").outerHeight())/2 
    });        
}); 

$(function(){ 
    $(window).resize(); 
}); 
</script>
<body>
		<div id="welcomeTab" style="width:400px;height:220px;" class="easyui-tabs">
		<div title="用户登录" style="padding: 10px">
			<div style="padding:10px 0 10px 30px">
	    <form id="loginForm" method="post">
	    	<table>
	    		<tr>
	    			<td>用户名：</td>
	    			<td><input class="easyui-validatebox" id="lname" type="text" name="name" data-options="required:true"></input></td>
	    		</tr>
	    		<tr>
	    			<td>邮箱地址：</td>
	    			<td><input class="easyui-validatebox" id="lemail" type="text" name="email" data-options="required:true,validType:'email'"></input></td>
	    		</tr>
	    		<tr>
	    			<td>密码：</td>
	    			<td><input class="easyui-validatebox" id="lpassword" type="password" name="passowrd" data-options="required:true"></td>
	    		</tr>
	    	</table>
	    </form>
	    </div>
	    <div style="text-align:center;padding:5px">
	    	<a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitForm()">登录</a>
	    	<a href="javascript:void(0)" class="easyui-linkbutton" onclick="clearForm()">重置</a>
	    </div>
	<script>
		function submitForm(){
			$('#loginForm').form('submit');
		}
		function clearForm(){
			$('#loginForm').form('clear');
		}
	</script>
		</div>
		<div title="加入我们" style="padding:10px">
		<div style="padding:10px 0 10px 30px">
	    <form id="regForm" action="${ctx }base/index.do" method="post">
	    	<table>
	    		<tr>
	    			<td>用户名：</td>
	    			<td><input class="easyui-validatebox" id="name" type="text" name="userName" data-options="required:true"></input></td>
	    		</tr>
	    		<tr>
	    			<td>邮箱地址：</td>
	    			<td><input class="easyui-validatebox" id="email" type="text" name="email" data-options="required:true,validType:'email'"></input></td>
	    		</tr>
	    		<tr>
	    			<td>密码：</td>
	    			<td><input class="easyui-validatebox" id="password" type="password" name="password" data-options="required:true"></input></td>
	    		</tr>
	    		<tr>
	    			<td>确认密码：</td>
	    			<td><input class="easyui-validatebox" id="repassword" type="password" name="repassowrd" data-options="required:true"></input></td>
	    		</tr>
	    	</table>
	    </form>
	    </div>
	    <div style="text-align:center;padding:5px">
	    	<a href="javascript:void(0)" class="easyui-linkbutton" onclick="reg()">注册</a>
	    	<a href="javascript:void(0)" class="easyui-linkbutton" onclick="clearReg()">重置</a>
	    </div>
	</div>
	<script>
		function reg(){
			$('#regForm').submit();
			/* $('#regForm').form('clear');
			$('#welcomeTab').tabs("select",0); */
			
		}
		function clearReg(){
			$('#regForm').form('clear');
		}
	</script>
		</div>
</body>
</html>