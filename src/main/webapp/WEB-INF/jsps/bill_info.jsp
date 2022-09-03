<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ include file="menu.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Leads Information</title>
</head>
<body>

<h2>Bill | Information</h2>

Transaction Id : ${bill.id}<br/>
First name : ${bill.firstName}<br/>
Last name : ${bill.lastName}<br/>

email : ${bill.email}<br/>
mobile : ${bill.mobile}<br/>
product : ${bill.product}<br/>
amount : ${bill.amount}<br/>

<form action="convertLead" method="post">
<input type="hidden" name="id" value="${lead.id}">
<input type = "submit" value ="convert" >
</form>

</body>
</html>