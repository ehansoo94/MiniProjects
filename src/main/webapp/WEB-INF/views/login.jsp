<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 창</title>
</head>
<body>
	<form action="member.login" method="post">
		<table id="loginTable">
			<tr>
				<td class="whatToInput">아이디</td>
				<td><input name="input_id" autocomplete="off" placeholder="아이디를 입력해주세요" maxlength="10"></td>
				<td rowspan="2">
					<button id="loginButton">로그인</button>
				</td>
			</tr>
			<tr>
				<td class="whatToInput">비밀번호</td>
				<td><input name="input_pw" type="password" autocomplete="off" placeholder="비밀번호를 입력해주세요" maxlength="12"></td>
			</tr>
			<tr>
				<td colspan="3" align="right" >
					<span id="result">${result }</span>&nbsp;
					<a href="go.signup">회원가입</a>
				</td>
			</tr>
		</table>
	</form>

</body>
</html>