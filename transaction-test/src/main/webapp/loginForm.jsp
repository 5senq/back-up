<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	// 유효성 검사 : 이 페이지 안에 코드를 계속해서 실행할 건지
	// 로그인이 되어있다면 이 페이지는 실행되지 않게
	if(session.getAttribute("loginMember") != null) {
		response.sendRedirect(request.getContextPath() + "/main.jsp"); // 이미 로그인 되어 있으니 웹 브라우저에서 다시 main.jsp를 재요청하세요
		
		return; // return은 method를 끝낼 때! <-> 반환값을 남길 때는 return 뒤에 ~
	}
%>
<!-- View -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>loginForm</title>
</head>
<body>
	<h1>로그인</h1>
	<form action="<%=request.getContextPath()%>/loginAction.jsp" method="post">
		<table border="1">
			<tr>
				<td>ID</td>
				<td><input type="text" name="memberId"></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="memberPw"></td>
			</tr>
		</table>
		<button type="submit">로그인</button>
		<a href="<%=request.getContextPath()%>/insertMemberForm.jsp">회원가입</a>
	</form>
</body>
</html>