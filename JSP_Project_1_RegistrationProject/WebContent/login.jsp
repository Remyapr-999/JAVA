<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<h1>LOGIN PAGE</h1>
	<form action="/RegistrationProject/LoginServlet" method="post">
		User name : <input type="text" name="username"><br><br>
		Password : <input type="password" name="passwrd"><br><br>
		<input type="submit" value="login">
	</form>
</body>
</html>