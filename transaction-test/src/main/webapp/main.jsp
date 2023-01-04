<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="vo.*"%>
<%
	// 유효성 검사 : 이 페이지 안에 코드를 계속해서 실행할 건지
	// 로그인이 되어있지 않다면 이 페이지는 실행되지 않게
	if(session.getAttribute("loginMember") == null) {
		response.sendRedirect(request.getContextPath() + "/loginForm.jsp"); // 로그인 되어있지 않으니 웹 브라우저에서 다시 loginForm.jsp를 재요청하세요
		
		return; // return은 method를 끝낼 때! <-> 반환값을 남길 때는 return 뒤에 ~
	}

	// 로그인이 되어있다면 세션 정보를 가져오세요
	// Member loginMember = (Member)(session.getAttribute("loginMember"));
	Object object = session.getAttribute("loginMember");
	Member loginMember = (Member)object; 
	
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>main</title>
</head>
<body>
	<div>
		<%=loginMember.getMemberName()%>님 반갑습니다.
	</div>
</body>
</html>