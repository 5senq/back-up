<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="vo.*"%>
<%@page import="dao.*"%>
<%@page import="java.util.*"%>
<%
	int currentPage = 1;
	
	if(request.getParameter("currentPage") != null) {
		currentPage = Integer.parseInt(request.getParameter("currentPage"));
	}
	
	int rowPerPage = 10;
	
	CustomerDao customerDao = new CustomerDao();
	
	int cnt = customerDao.customerCount();
	int lastPage = (int)Math.ceil((double)cnt / (double)rowPerPage);
	
	if(currentPage < 1) {
		currentPage = 1;
		response.sendRedirect(request.getContextPath() + "/customerJoinList.jsp?currentPage = 1");
		return;
	} else if(currentPage > lastPage) {
		currentPage = lastPage;
		response.sendRedirect(request.getContextPath() + "/customerJoinList.jsp?currentPage=" + lastPage);
		return;
	}
	
	int beginRow = (currentPage - 1) * rowPerPage;
	
	ArrayList<CustomerAddressCityCountry> list = customerDao.selectCustomerJoinList(beginRow, rowPerPage);
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>customer Join List</title>
	</head>

	<body>
		<!-- Domain 타입 사용 -->
		<div>
			<h1>Domain Type List</h1>
			<a href="<%=request.getContextPath()%>/customerMapList.jsp">Map Type</a>
		</div>
		
		<table border="1">
			<tr>
				<th>firstName</th>
				<th>lastName</th>
				<th>address</th>
				<th>district</th>
				<th>city</th>
				<th>country</th>
			</tr>
			<tr>
				<%
					for(CustomerAddressCityCountry cacc : list) {
				%>
						<td><%=cacc.getCustomer().getFirstName()%></td>
						<td><%=cacc.getCustomer().getLastName()%></td>
						<td><%=cacc.getAddress().getAddress()%></td>
						<td><%=cacc.getAddress().getDistrict()%></td>
						<td><%=cacc.getCity().getCity()%></td>
						<td><%=cacc.getCountry().getCountry()%></td>
						</tr><tr>
				<%
					}
				%>
			</tr>
		</table>
		<div>
			<a href="<%=request.getContextPath()%>/customerJoinList.jsp?currentPage = 1">처음</a>
			<%
				if(currentPage > 1) {
			%>
					<a href="<%=request.getContextPath()%>/customerJoinList.jsp?currentPage=<%=currentPage - 1%>">이전</a>
			<%
				}
			%>
				<span><%=currentPage%> / <%=lastPage%></span>
			<%
				if(currentPage < lastPage) {
			%>
					<a href="<%=request.getContextPath()%>/customerJoinList.jsp?currentPage=<%=currentPage + 1%>">다음</a>
			<%
				}
			%>
			<a href="<%=request.getContextPath()%>/customerJoinList.jsp?currentPage=<%=lastPage%>">마지막</a>
		</div>
	</body>
</html>