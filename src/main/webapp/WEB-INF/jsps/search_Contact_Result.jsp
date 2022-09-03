<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ include file="menu.jsp" %>
    
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Contacts</title>
</head>
<body>
	<h2>Contact List |</h2>
	
	<table border="2">
		<tr>
		<th>FirstName</th>
		<th>LastName</th>
		
		<th>Email</th>
		<th>Mobile</th>
		<th>Billing</th>
		
		</tr>
	
	<c:forEach var = "contacts" items="${contacts}">
	
	<tr>
		<td><a href="contactInfo?id=${contacts.id}">${contacts.firstName}</a></td>
		<td>${contacts.lastName}</td>
		
		<td>${contacts.email}</td>
		<td>${contacts.mobile}</td>
		<td><a href="ShowGenerateBill?id=${contacts.id}">BILLLING</a></td>
		
		</tr>
		
	</c:forEach>
	
	
	</table>

</body>
</html>