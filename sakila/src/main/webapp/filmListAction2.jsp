<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="vo.*"%>
<%@ page import="dao.*"%>
<%@ page import="java.util.*"%>
<%
	// 첫번째 조건 'rating' 처리
	String[] rating = request.getParameterValues("rating"); // 여러 개를 받을 때는 Values
	System.out.println(rating);
	if(rating != null) {
		System.out.println(rating.length + "<-- rating.length");
	}
	
	// 두번째 조건 'fromMinute & toMinute' 처리
	int fromMinute = 0;
	int toMinute = 0;
	
	// 둘다 공백값이 아니면 -> 정상적인 숫자값이 넘어왔다면
	if(!request.getParameter("fromMinute").equals("") && !request.getParameter("toMinute").equals("")) {
		fromMinute = Integer.parseInt(request.getParameter("fromMinute"));
		toMinute = Integer.parseInt(request.getParameter("toMinute"));
	}
	// 디버깅
	System.out.println(fromMinute + ", "+toMinute + " <-- fromMinute, toMinute");
	
	FilmDao filmDao = new FilmDao();
	ArrayList<Film> list = filmDao.selectFilmList2(rating, fromMinute, toMinute);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>filmListAction2</title>
</head>
<body>
	<h1>검색결과</h1>
	<table border="1">
		<tr>
			<td>필름 제목</td>
			<td>필름 등급</td>
			<td>필름 상영시간</td>
		</tr>
		<%
			for(Film f : list) {
		%>
				<tr>
					<td><%=f.getTitle()%></td>
					<td><%=f.getRating()%></td>
					<td><%=f.getLength()%></td>
				</tr>
		<%
			}
		%>
	</table>
</body>
</html>