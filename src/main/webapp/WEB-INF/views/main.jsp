<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>오늘 할 일</title>
<script type="text/javascript" src="resources/javaScript/go.js"></script>
<link rel="stylesheet" type="text/css" href="resources/css/main.css">
<link rel="stylesheet" type="text/css" href="resources/css/planner.css">
</head>
<body>
	<table id="siteTable">
		<tr>
			<td id="dateTd" valign="bottom">
				<span id=dateSpan>
					${date }
				</span>
				<span id=functionSpan>
					달력보기&nbsp; <a href="member.logout">로그아웃</a>
				</span>
			</td>
		</tr>
		<tr>
			<td valign="top"><jsp:include page="${content }"></jsp:include></td>
		</tr>
	</table>
</body>
</html>