<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin-register</title>
</head>
<body>

<form action="Adminregister_Servlet" method="post">
<label >Enter the email:</label>
<input type="email" name="email">
<br>
<label>Enter the Password:</label>
<input type="text" name="password">
<br>
<br>
<label for="person">Select one option</label>
<select name="person" id="person">
<option value="admin">admin</option>
<option value="teacher">teacher</option>
</select>
<br>
<input type="submit">



</form>
</body>
</html>