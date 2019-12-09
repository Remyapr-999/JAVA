<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page language="java" import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>

</head>
<body>
	<h1>Hiii...Welcome..!</h1>
	
	
	 <%	 
	 out.println("<table>");
	 ArrayList list = (ArrayList)request.getAttribute("List");
	 for (Iterator iter = list.iterator(); iter.hasNext();) {
         out.println("<tr><td>" + (String)(iter.next()) + "</td></tr>");
     }
     out.println("</table>");        
        
      %>
    
</body>
</html>