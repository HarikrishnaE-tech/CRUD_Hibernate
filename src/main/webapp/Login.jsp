<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>LOGIN</h1>
	<form action="Loginservlet" method="post" >
	<label>Enter the Email:</label>
	<input type="email" name="stdemail">
	<br>
	<br>
	<label>Enter the password:</label>
	<input type="password" name="stdpassword">
	<br>
<label for="person" >select one  option </label>
<select name="person" id="person">
<option value="student">student</option>
<option value="teacher">teacher</option>

</select>

<br>
	<br>
	<input type="submit">
	</form>
</body>
</html>