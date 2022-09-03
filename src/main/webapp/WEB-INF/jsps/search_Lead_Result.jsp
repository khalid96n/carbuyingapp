<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ include file="menu.jsp" %>
    
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Leads</title>
</head>
<body>
	<h2>Lead List |</h2>
	
	<table border="2">
		<tr>
		<th>FirstName</th>
		<th>LastName</th>
		<th>Source</th>
		<th>Email</th>
		<th>Mobile</th>
		
		</tr>
	
	<c:forEach var = "lead" items="${lead}">
	
	<tr>
		<td><a href="leadInfo?id=${lead.id}">${lead.firstName}</a></td>
		<td>${lead.lastName}</td>
		<td>${lead.source}</td>
		<td>${lead.email}</td>
		<td>${lead.mobile}</td>
		
		</tr>
		
	</c:forEach>
	
	
	</table>

</body>
</html>