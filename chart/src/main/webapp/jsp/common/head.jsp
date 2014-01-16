<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme() + "://"
+ request.getServerName() + ":" + request.getServerPort()
+ path + "/";
pageContext.setAttribute("basePath",basePath);     
%>
<c:set var="ctx" value="<%=basePath %>"/>
<script type="text/javascript" src="${ctx}js/easyui/jquery.min.js"></script>
<script type="text/javascript" src="${ctx}js/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="${ctx}js/easyui/locale/easyui-lang-zh_CN.js"></script>
<link rel="stylesheet" type="text/css"href="${ctx}css/themes/default/easyui.css">
<link rel="stylesheet" type="text/css"href="${ctx}css/themes/icon.css">
<link rel="stylesheet" type="text/css"href="${ctx}css/common.css">
