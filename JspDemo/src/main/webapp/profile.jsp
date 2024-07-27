 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- add jar within lib then assign the input as follows -->
	<% 
		String url = "jdbc:mysql://localhost:3306/hibernateDemo";
		String username = "root";
		String sql = "select * from alien";
		String password = "";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, username, password);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		rs.next();		
	%>
	
	Aid : <%= rs.getString(1) %> <br>
	Name : <%= rs.getString(2) %> <br>
	Color : <%= rs.getString(3) %> <br>
        
</body>

</html>