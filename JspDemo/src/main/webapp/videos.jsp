<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% 
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
		/* response.setHeader("Pragma", "no-cache");
		response.setHeader("Expires", "0"); */
		if (session.getAttribute("uname") == null) {
			response.sendRedirect("login.jsp");
		}
	%>
	Links of Videos
	<form action="Logout">
		<input type="submit" value="Logout">
	</form>
</body>
</html>