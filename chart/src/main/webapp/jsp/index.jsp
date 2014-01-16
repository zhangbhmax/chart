<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ include file="common/head.jsp" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title></title>
</head>
<body>
	<div class="easyui-layout" style="width:100%;height:600px;">
		<div data-options="region:'north'" style="height:50px"></div>
		<div data-options="region:'south',split:false" style="height:50px;"></div>
		<div data-options="region:'east',split:false" title="East" style="width:180px;"></div>
		<div data-options="region:'west',split:false" title="West" style="width:100px;"></div>
		<div data-options="region:'center',title:'Main Title',iconCls:'icon-ok'">
			<table class="easyui-datagrid"
					data-options="url:'datagrid_data1.json',method:'get',border:false,singleSelect:true,fit:true,fitColumns:true">
				<thead>
					<tr>
						<th data-options="field:'itemid'" width="80">Item ID</th>
						<th data-options="field:'productid'" width="100">Product ID</th>
						<th data-options="field:'listprice',align:'right'" width="80">List Price</th>
						<th data-options="field:'unitcost',align:'right'" width="80">Unit Cost</th>
						<th data-options="field:'attr'" width="150">Attribute</th>
						<th data-options="field:'status',align:'center'" width="50">Status</th>
					</tr>
				</thead>
			</table>
		</div>
	</div>
</body>
</html>