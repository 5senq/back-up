<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<%@ page import="dao.*"%>
<%@ page import="vo.*"%>
<%
   Class.forName("org.mariadb.jdbc.Driver");
   Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/db58","root","java1234");
   PreparedStatement stmt = conn.prepareStatement("SELECT * FROM student");
   ResultSet rs = stmt.executeQuery();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>studentList</title>
</head>
<body>
	<%
	   while(rs.next()) {
	%>
	      <div>
	         <%=rs.getInt("student_id")%>
	         <%=rs.getString("family_name")%>
	         <%=rs.getString("name")%>
	         <%=rs.getString("gender")%>
	         <%=rs.getString("birth")%>
	         <%=rs.getString("city")%>
	         <%=rs.getString("updatedate")%>
	         <%=rs.getString("createdate")%>
	      </div>
	<%      
	   }
	%>
</body>
</html>