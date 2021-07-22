<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
		<title>Add New Team</title>
	</head>
	<body>
	<h2>Create a new Team</h2>
	
	<form action="Teams" method="post">
	  <label for="name">Team Name:</label>
	  <input type="text" id="name" name="name"><br><br>
	  <input type="submit" value="Submit">
	</form>
	
	
	</body>
</html>