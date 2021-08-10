<%--
  Created by IntelliJ IDEA.
  User: nemesiobilbao
  Date: 09-08-21
  Time: 21:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Search</title>
</head>
<body>
<h2>Song's By Artist: <c:out value="${canciones.size()}"/><</h2>

<table border="1">
    <thead>
    <tr>
        <th>Name</th>
        <th>Rating</th>
        <th>Actions</th>

    </tr>
    </thead>
    <tbody>
    <c:forEach items="${canciones}" var="artist">
        <tr>
            

            <td><c:out value="${artist.classification}"/></td>
            <td><a href="/songs/${artist.id}">Delete</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>
