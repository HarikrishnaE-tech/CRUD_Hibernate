<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="jakarta.servlet.http.HttpSession"%>
<%@page import="java.util.ArrayList"%>
<%@page import="entity.Student"%>
<%@page import="java.util.List"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
    HttpSession Session = request.getSession();
   List<Object[]> lstud = (List<Object[]>) Session.getAttribute("resultlist");
   
%>

	<table border=1>
		<tr>
			<th>Student_id</th>
			<th>Student_name</th>
			<th>Student_age</th>
			<th>course_name</th>
			<th>state</th>
		</tr>
		<% if(lstud!=null){
			for(Object[] row:lstud){
		
		%>
		<tr>
			<td><%= row[0] %></td>
			<td><%= row[1] %></td>
			<td><%= row[2] %></td>
			<td><%= row[4] %></td>
			<td><%= row[3] %></td>
		</tr>
   <% 
                }
            } 
        %>

</table>
</body>
</html>