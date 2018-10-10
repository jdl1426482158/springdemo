<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'edit.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
<script type="text/javascript">
	$(function() {
		$(".name").blur(function() {
			$.post("json", {
				name : $(this).val()
			}, function(result) {
				alert(result);
			},"json");
		});
	});
</script>
</head>

<body>
	<form action="update" method="post">
		<table>
			<tr>
				<td>编号</td>
				<td><input name="id" value="${emp.id}" /></td>
			</tr>
			<tr>
				<td>姓名</td>
				<td><input class="name" name="name" value="${emp.name}" /><span id="span"></span></td>
			</tr>
			<tr>
				<td>年龄</td>
				<td><input name="age" value="${emp.age}" /></td>
			</tr>
			<tr>
				<td>用户名</td>
				<td><input name="user.name" /></td>
			</tr>
			<tr>
				<td>用户名1</td>
				<td><input name="userList[0].name" /></td>
			</tr>
			<tr>
				<td>用户名2</td>
				<td><input name="userList[1].name" /></td>
			</tr>
		</table>
		<input type="submit" value="提交" />
	</form>
</body>
</html>
