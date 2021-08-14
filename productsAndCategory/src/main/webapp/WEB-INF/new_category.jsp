<%--
  Created by IntelliJ IDEA.
  User: nemesiobilbao
  Date: 14-08-21
  Time: 11:48
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
  <title>New Category</title>
</head>
<body>

<h1>New Category</h1>
<form:form action="/categories/new" method="post" modelAttribute="categories">
  <p>
    <form:label path  ="name">Name</form:label>
    <form:errors path ="name"/>
    <form:input path  ="name"/>
  </p>


  <input type="submit" value="Create"/>
</form:form>



</body>
</html>
