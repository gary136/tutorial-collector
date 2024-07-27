<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- core library -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- sql -->
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<!-- functions -->
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- Hello -->
	<%-- <% 
		String name = request.getAttribute("label").toString();
		out.println(name);
	%> --%>	
	
	<!-- jstl -->
	<%-- ${label} --%>	
	<%-- <c:import url = "https://www.yahoo.com"></c:import> --%>
	<%-- <c:out value = "Hello" /> --%>
	<%-- <c:out value = "${label}" /> --%>
	
	<%-- ${student.name} --%>
	<%-- ${student} --%>
	<%-- ${students} --%>
	<%-- <c:forEach items="${students}" var = "s"> <!-- for s : students -->
		${s} <br/>
	</c:forEach> --%>
	
	<%-- <sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/hibernateDemo" user="root" password=""/>
	<sql:query var="rs" dataSource="${db}"> select * from alien</sql:query>
	${rs.rows}
	<c:forEach items="${rs.rows}" var = "alien">
		aid = ${alien.aid}, color = ${alien.color}, name = ${alien.name} <br/>
	</c:forEach> --%>
	
	<c:set var="s" value="Navin is a fantastic Trainer"></c:set>
	<%-- Length : ${fn:length(s)} --%>
	<%-- <c:forEach items="${fn:split(s, ' ')}" var="c">
		<br>
		${c}
	</c:forEach> --%>
	<%-- index : ${fn:indexOf(s, "is")} --%>
	<%-- is there : ${fn:contains(s, "is")} --%>
	<%-- <c:if test="${fn:contains(s, 'Servlet')}">
		Servlet is there
	</c:if> --%>
	<%-- <c:if test="${fn:contains(s, 'Navin')}">
		Navin is there
	</c:if> --%>
	<c:if test="${fn:endsWith(s, 'Trainer')}">
		right
	</c:if>
	
	
</body>
</html>