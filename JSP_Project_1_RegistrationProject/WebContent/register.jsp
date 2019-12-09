<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>
<h1>Registration</h1>
<form action="/RegistrationProject/RegisterServlet" method="post">
	<table>
		<tr>
			<td>Name : </td>
			<td><input type="text" name="uname" id="uname" ></td>	
		</tr>
		<tr>
			<td>E-mail : </td>
			<td><input type="text" name="email" id="email"></td>
		</tr>
		<tr>
			<td>Phone : </td>
			<td><input type="text" name="phone"></td>
		</tr>
		<tr>
			<td>Password : </td>
			<td><input type="password" name="password" id="password"></td>
		</tr>
		<tr>
			<td>Place : </td>
			<td><input type="text" name="place" id="place"></td>
		</tr>
		<tr>
			<td></td>
			<td><input type="submit" value="signup"></td>
		</tr>
	</table>	
	</form>
</body>
</html>