<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.io.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>application/x-www-form-urlencoded</h1>
	<div>urlId : <%=request.getParameter("urlId")%></div>
	<div>urlFile : <%=request.getParameter("urlFile")%></div>
	
	<h1>multipart/form-data</h1>
	<div>request InputStream : <%=request.getInputStream()%></div> <!-- 이진수라 getParameter로 받을 수 없음 -->
	
	<%
		InputStream is = request.getInputStream();
	int i = 0;
	while((i = is.read()) != -1) {
		System.out.print((char)i);
	}
	%>
</body>
</html>