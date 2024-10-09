<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="jakarta.servlet.http.HttpSession"%>
<%@page import="jakarta.servlet.http.HttpServlet"%>

   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
HttpSession Session =request.getSession();
List<Object[]> rlist=(List<Object[]>)Session.getAttribute("resultlist");

%>
<table border=1>
		<tr>
			<th>Student_id</th>
			<th>Student_name</th>
			<th>Student_age</th>
			<th>student_email</th>
			<th>student_password</th>
			<th>course_name</th>
			<th>state</th>
			<th>Edit/Delete</th>
		</tr>
<% for(Object[] row:rlist) {%>
<tr>
<td><%= row[0] %></td>
<td><%= row[1] %></td>
<td><%= row[2] %></td>
<td><%= row[3] %></td>
<td><%= row[4] %></td>
<td><%= row[6] %></td>
<td><%= row[5] %></td>
<td>
            <a href="Editservlet?id=<%= row[0] %>&name=<%= row[1] %>&age=<%= row[2] %>&email=<%= row[3] %>&password=<%= row[4] %>&course=<%= row[6] %>&state=<%= row[5] %>">Edit</a> | 
            <a href="DeleteServlet?id=<%= row[0] %>&name=<%= row[1] %>&age=<%= row[2] %>&email=<%= row[3] %>&password=<%= row[4] %>&course=<%= row[6] %>&state=<%= row[5] %>">Delete</a>
        </td>

<%} %>

</tr>



</body>
</html>