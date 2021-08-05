<%--
  Created by IntelliJ IDEA.
  User: nemesiobilbao
  Date: 04-08-21
  Time: 21:02
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Libros</title>
</head>
<body>
<h1>All Books</h1>
<table border="1">
    <thead>
    <tr>
        <th>Title</th>
        <th>Description</th>
        <th>Language</th>
        <th>Number of Pages</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${books}" var="book">
        <tr>
            <td><c:out value="${book.title}"/></td>
            <td><c:out value="${book.description}"/></td>
            <td><c:out value="${book.language}"/></td>
            <td><c:out value="${book.numberOfPages}"/></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<a href="/books/new">New Book</a>

</body>
</html>
