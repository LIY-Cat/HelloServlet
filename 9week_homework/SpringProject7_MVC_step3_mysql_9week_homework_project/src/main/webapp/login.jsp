<%@page contentType="text/html; charset=EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">

<script type="text/javascript">
function validateForm() {
    var idInput = document.myFrom.id.value;
    var passwordInput = document.myFrom.password.value;
    // 다른 입력값에 대한 검증을 추가할 수 있습니다.

    if (idInput == "" || passwordInput == "") {
        alert("필수 입력값이 누락되었습니다.");
        return false;
    }
}
</script>

<title>로그인</title>
</head>
<body>
	<center>
		<h1>로그인</h1>
		<hr>
		<form action="login.do" method="post" name="myFrom" onsubmit="return validateForm();">
			<table border="1" cellpadding="0" cellspacing="0">
				<tr>
					<td bgcolor="orange">아이디</td>
					<td><input type="text" name="id" /></td>
				</tr>
				<tr>
					<td bgcolor="orange">비밀번호</td>
					<td><input type="password" name="password" /></td>
				</tr>
				<tr>
					<td colspan="2" align="center">
					<input type="submit"value="로그인"/>
						<a href="signin.jsp">회원가입</a>
					</td>
				</tr>
			</table>
		</form>
		<hr>
	</center>
</body>
</html>