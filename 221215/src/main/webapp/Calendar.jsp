<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Calendar</title>
</head>
<body>
	<h1>서버(Back-end) 기술로 시간 출력(JAVA)</h1>
		<%
			// 서버(톰캣)에서 html로 변경되기 전에 해석 -> 서버 시간
			Calendar today = Calendar.getInstance(); // 왜? new Calendar()
			int year = today.get(Calendar.YEAR);
			int month = today.get(Calendar.MONTH) + 1;
			int date = today.get(Calendar.DATE);
		%>
		<%=year%>년 <%=month%>월 <%=date%>일
		
	<h1>클라이언트(Front-end) 기술로 시간 출력(JAVASCRIPT)</h1>
		<div>
			<span id="year"></span>년 <span id="month"></span>월 <span id="date"></span>일
	<script>
		// 서버에서(html로 변경된) 응답받은 html 파일을 브라우저가 읽을때 해석 -> 클라이언트 시간
		let today = new Date();
		let year = today.getFullYear();
		let month = today.getMonth() + 1;
		let date = today.getDate();
		document.querySelector('#year').innerHTML = year;
		document.querySelector('#month').innerHTML = month;
		document.querySelector('#date').innerHTML = date;
	</script>
</body>
</html>