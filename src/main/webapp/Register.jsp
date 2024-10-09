<html>
<body>
<h2>Student Registration Form</h2>
<form method="post" action=" Registerservlet">
<label>Enter the student name:</label>
<input type="text" name="stdname">
<br>
<br>
<label>Enter the student age:</label>
<input type="text" name="stdage">
<br>
<br>
<label>Enter the email:</label>
<input type="email" name="stdemail">
<br>
<br>
<label>Enter the password:</label>
<input type="password" name="stdpassword">
<br>
<br>
<label for="course">select the course:</label>
<select name="cname" id="course">
<option value="BCA">BCA</option>
<option value="BCOM">BCOM</option>
<option value="BA">BA</option>
<option value="BSE">BSE</option>
</select>
<br>
<br>
<label for="state">Select  the state:</label>
<select name="state" id="state">
<option value="kerala">kerala</option>
<option value="karnataka">karnataka</option>
<option value="Tamilnadu">Tamilnadu</option>
<option value="Goa">GOA</option>
<option value="AndhraPradesh">Andhrapradesh</option>
</select>
<br>

<input type="submit">
<br>
</form>
</body>
</html>
