<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>플래너 로그인</title>
<link rel="stylesheet" type="text/css" href="resources/css/index.css">
<link rel="stylesheet" type="text/css" href="resources/css/login.css">
</head>
<body>
	<table id="siteTable">
		<tr>
			<td id="title" colspan="2">오늘 할 일</td>
		</tr>
		<tr>
			<td id="date" colspan="2">${date }</td>
		</tr>
		<tr>
			<td><jsp:include page="${loginPage }"></jsp:include></td>
		</tr>
	</table>
</body>
</html>