<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
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
	<h2>REGISTER HERE</h2>
	<form action="registerProcess" method="post">
	<table>
	<tr>
		<td>Name : </td><td><input type="text" name="username" id="username"></td>
	</tr>
	
	<tr>
		<td>Password : </td><td><input type="text" name="password" id="password"></td>
	</tr>
	
	<tr>
		<td>First Name : </td><td><input type="text" name="firstname" id="firstname"></td>
	</tr>
	
	<tr>
		<td>Last Name : </td><td><input type="text" name="lastname" id="lastname"></td>
	</tr>
	
	<tr>
		<td>E-Mail : </td><td><input type="text" name="email" id="email"></td>
	</tr>
	
	<tr>
		<td>Address : </td><td><input type="text" name="address" id="address"></td>
	</tr>
	
	<tr>
		<td>Phone : </td><td><input type="text" name="phone" id="phone"></td>
	</tr>	
	
	<tr>
		<td> </td><td><input type="submit" value="Submit"></td>
	</tr>
</table>
	
	
</form>
</body>
</html>