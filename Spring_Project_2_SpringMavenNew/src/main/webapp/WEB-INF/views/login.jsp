<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
<style>
	form{
	position : relative;
	left : 20%;
	}
	h2{
	position : relative;
	left : 20%;
	}
</style>
</head>
<body>
	<h2>Login Here..</h2>
	<form action="loginProcess" method="post">
	<table>
		<tr><td>User Name : </td><td><input type="text" name="username" id="userneme"></td></tr>
		<tr><td>Password : </td><td><input type="text" name="password" id="password"></td></tr>
		<tr><td></td><td><input type="submit" value="LOGIN"></td></tr>
	</table>			
	</form>
</body>
</html>