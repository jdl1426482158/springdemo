<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'hello.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style type="text/css">
table {
	border: 1px solid gray;
}

td, th {
	border: 1px solid gray;
}
</style>
</head>

<body>
	<center>
		<table cellspacing="2px">
			<tr>
				<th>编号</th>
				<th>姓名</th>
				<th>年龄</th>
				<th>操作</th>
			</tr>
			<c:forEach items="${emps}" var="emp">
				<tr>

					<td>${emp.id}</td>
					<td>${emp.name}</td>
					<td>${emp.age}</td>
					<td>
						<form action="edit?id=${emp.id}&name=${emp.name}" method="post">
							<input type="submit" value="编辑" />
						</form>
					</td>
				</tr>
			</c:forEach>
		</table>
	</center>
	
</body>
</html>
