<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="error.jsp" %>
<%@ page import="java.util.Scanner" %>
<%@ include file="head.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Jsp Page</title>
</head>
<body>
	<%-- <%! 
		int coef = 3;
	%>
	<h1>Hello World!</h1>
	<% 
		out.println(5 + 10);
	%>	
	Good number is : <%= coef %> --%>
	
	<%
		/* request.getParameter(arg0); */
		/* pageContext.setAttribute("name", "navin", PageContext.SESSION_SCOPE); */
		/* getAttribute */
		/* config.getInitParameter(name) */
		
		/* int k = 9/0; */
		
		/* try {
			int k = 9/0;
		} catch(Exception e) {
			out.println("Error " + e.getMessage());
		} */
		
		int k = 9/0;
		
	%>
</body>
</html>