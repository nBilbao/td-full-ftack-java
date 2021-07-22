<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
 
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">

	<title>Team</title>
</head>
	<body>
	
	<h3>Ninjas
	<a  href="Teams">New Ninja</a>
	
	</h3>
	
	<table border>
	  <tr>
	    <th>First Name</th>
	    <th>Last Name</th>
	    <th>age</th>
	    <th>Action</th>
	  </tr>  
	    <c:forEach var="person" items="${teams}">
	    	<tr>
	    	<td><c:out value="${person.getName()}"/></td>
	    	<td><c:out value="${person.contadorJugadores()}"/></td>
	    	<td><a  href="Teams">Details</a> <a  href="Teams">Delete</a></td>
	    	</tr>
	    	
		</c:forEach>
	  
	</table>

	</body>
</html>