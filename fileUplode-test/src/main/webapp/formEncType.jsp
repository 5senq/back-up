<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- action으로 문자열을 넘김 -->
	<form action="./action.jsp"
		enctype="application/x-www-form-urlencoded" method="post"> <!-- method type이 get이든 post든 상관없음 -->
		<input type="text" name="urlId">
		<input type="file" name="urlFile">
		<button type="submit">application/x-www-form-urlencoded</button>
	</form>
	<br>
	<!-- action으로 stream(기계어, 이진수)을 넘김 -->
	<form action="./action.jsp"
		enctype="multipart/form-data" method="post"> <!-- method type이 post여야함 : body로 바이너리 타입(글자든 뭐든 이진수로 넘어가서 getParameter로 받을 수 없음)으로 넘어가야하니까, url로 넘어가지 않음 -->
		<input type="text" name="multiId">
		<input type="file" name="multiFile">
		<button type="submit">multipart/form-data</button>
	</form>
</body>
</html>