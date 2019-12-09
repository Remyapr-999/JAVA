<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<span>Haii ... </span><%=request.getAttribute("username") %><br>
<span>Your Password is...</span><%=request.getAttribute("password") %>
</body>
</html>