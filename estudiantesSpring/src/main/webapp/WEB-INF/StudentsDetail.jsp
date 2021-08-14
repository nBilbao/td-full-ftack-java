<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">

    <title>Hello, world!</title>
  </head>
  <body>
  
<!--   navbar -->

	<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
	  <div class="container container-fluid">
	    <a class="navbar-brand" href="#">Estudents</a>
	    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarColor01" aria-controls="navbarColor01" aria-expanded="false" aria-label="Toggle navigation">
	      <span class="navbar-toggler-icon"></span>
	    </button>
	
	    <div class="collapse navbar-collapse" id="navbarColor01">
	      <ul class="navbar-nav me-auto">
	        <li class="nav-item">
	          <a class="nav-link active" href="#">Home
	            <span class="visually-hidden">(current)</span>
	          </a>
	        </li>
	        
	        
	      </ul>
	      
	    </div>
	  </div>
	</nav>

<!-- 	******************* -->
	<main>
		<div class="container mt-5">
			<h2>All Students</h2>
	
			<table class="table table-hover">
				<thead>
					<tr>
						<td>Name</td>
						<td>Age</td>
						<td>Address</td>
						<td>City</td>
						<td>State</td>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${students}" var="student">
			            <tr>
			                <td><c:out value="${student.firstName}"/></td>
			                <td><c:out value="${student.age}"/></td>
			                <td><c:out value="${student.contactInfo.address}"/></td>
			                <td><c:out value="${student.contactInfo.city}"/></td>
			                <td><c:out value="${student.contactInfo.state}"/></td>
			            </tr>
			        </c:forEach>
				</tbody>
			</table>
		</div>
	</main>
	

 	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-U1DAWAznBHeqEIlVSCgzq+c9gqGAJn5c/t99JyeKa9xxaYpSvHU5awsuZVVFIhvj" crossorigin="anonymous"></script>
	</body>
</html>