<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="Editservlet" method="post">

<label>id</label>
<input type="text" value="<%= request.getParameter("id") %>" name="stdid">       
<br>
<label>Edit the student  name:</label>
<input type="text" value="<%= request.getParameter("name") %>" name="stdname">
<br>
<br>

<label>edit the student age:</label>
<input type=" text" value="<%= request.getParameter("age") %>" name="stdage">
<br>
<br>

<label>edit the student email:</label>
<input type="text" value=" <%= request.getParameter("email") %>" name="stdemail">
<br>
<br>

<label>edit the student password: </label>
<input type="text" value="<%= request.getParameter("password") %>" name="stdpassword">
<br>
<br>

<label>edit the course name:</label>
<input type="text" value="<%= request.getParameter("course") %>"ss name="cname">
<br>
<br>

<label>edit the state:</label>
<input type="text"  value="<%= request.getParameter("state") %>" name="state">
<br>
<br>

<input type="submit">




</form>
</body>
</html>