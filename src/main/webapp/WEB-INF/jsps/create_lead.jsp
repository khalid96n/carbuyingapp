<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  
 <%@ include file="menu.jsp" %>  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert lead Information</title>
</head>
<body>

<h2>Lead | Create</h2>

<form action="saveLead" method="post">
<pre>
First Name  : <input type="text" name="firstName">
Last Name   : <input type="text" name="lastName">
Source      : <select name="source">
  				<option value="NewsPaper">NewsPaper</option>
  				<option value="TV">TV</option>
  				<option value="radio">radio</option>
  				<option value="online">online</option>
			  </select>
Email       : <input type="email" name="email">
Mobile      : <input type="text" name="mobile">

<input type="submit" value="save">
</pre>
</form>

</body>
</html>