<%--
  Created by IntelliJ IDEA.
  User: nemesiobilbao
  Date: 04-08-21
  Time: 21:35
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Detalle </title>
</head>
<body>
<form:form action="/books/${book.id}" method="delete" >
<table border="1">

    <thead>
    <tr>
        <th>Title</th>
        <th>Description</th>
        <th>Language</th>
        <th>Number of Pages</th>
        <th>Action</th>
    </tr>
    </thead>
    <tbody>
        <tr>
            <td><c:out value="${book.title}"/></td>
            <td><c:out value="${book.description}"/></td>
            <td><c:out value="${book.language}"/></td>
            <td><c:out value="${book.numberOfPages}"/></td>
            <td><input type="submit" value="Submit"/></td>
        </tr>

    </tbody>

</table>

</form:form>

</body>
</html>
