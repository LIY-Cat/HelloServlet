<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">

<script type="text/javascript">
function validateForm() {
    var idInput = document.myFrom.id.value;
    var passwordInput = document.myFrom.password.value;
    var nameInput = document.myFrom.name.value;
    var roleInput = document.myFrom.role.value;
    // 다른 입력값에 대한 검증을 추가할 수 있습니다.

    if (idInput == "" || passwordInput == "" || nameInput == "" || roleInput == "") {
        alert("필수 입력값이 누락되었습니다.");
        return false;
    }
}
</script>

<title>회원가입</title>
</head>
<body>
	<center>
		<h1>화원가입</h1>
		<hr>
		<form action="signin.do" method="post" name="myFrom" onsubmit="return validateForm();">
			<table border="1" cellpadding="0" cellspacing="0">
				<tr>
					<td bgcolor="orange">이름</td>
					<td><input type="text" name="name" /></td>
				</tr>
				<tr>
					<td bgcolor="orange">ROLE</td>
					<td><input type="text" name="role" /></td>
				</tr>
				<tr>
					<td bgcolor="orange">아이디</td>
					<td><input type="text" name="id" /></td>
				</tr>
				<tr>
					<td bgcolor="orange">비밀번호</td>
					<td><input type="password" name="password" /></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="가입" /></td>
				</tr>
			</table>
		</form>
		<hr>
	</center>
</body>
</html>