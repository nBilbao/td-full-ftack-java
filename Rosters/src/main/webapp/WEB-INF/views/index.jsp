<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
  
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">

	<title>El Roster</title>
</head>
	<body>
	
	<h3>Prototype Roster
	<a  href="Teams">Add Team</a>
	
	</h3>
	
	<table border>
	  <tr>
	    <th>Team</th>
	    <th>Players</th>
	    <th>Action</th>
	  </tr>  
	  <% int i=0; %>
	    <c:forEach var="person" items="${teams}">
	    	
	    	<tr >
	    	<td><c:out value="${person.name}"/></td>
	    	<td><c:out value="${person.contadorJugadores()}"/></td>
	    	<td><a  href="#">Details</a> <a  href="Teams" method="get" id="<%=i%>">Delete</a></td>
	    	</tr>
	    	<%i++;%>
	    	
		</c:forEach>
	  
	</table>

	</body>
</html>