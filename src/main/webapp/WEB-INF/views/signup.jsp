<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="member.signup">
		<table id="loginTable" >
			<tr>
				<th id=titleTh colspan="2">회원가입하기</th>
			</tr>
			<tr>
				<td>아이디</td>
				<td><input></td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><input></td>
			</tr>
			<tr>
				<td>비밀번호 확인</td>
				<td><input></td>
			</tr>
			<tr>
				<td colspan="2" id="buttonTd">
					<button id="signUpButton">가입하기</button>&nbsp;&nbsp;
					<a href="go.back">뒤로가기</a>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>