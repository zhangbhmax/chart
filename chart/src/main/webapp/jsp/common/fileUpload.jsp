<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ include file="head.jsp" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>文件上传</title>
</head>
<body>
	<div>
		<form id="fileForm" method="post" action="${ctx}common/web/upload.do" enctype="multipart/form-data">
			<input type="file" id="file" name="file"/>
			<input type="submit" value="上传"/>
		</form>
	</div>
</body>
</html>