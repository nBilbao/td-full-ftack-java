<%--
  Created by IntelliJ IDEA.
  User: nemesiobilbao
  Date: 06-08-21
  Time: 18:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
    <title>DashBoard</title>
</head>
<body>

<a href="/dashboard/new">Add New</a>  <a href="/dashboard/search">Top Songs</a>




<table border="1">
    <thead>
    <tr>
        <th>Name</th>
        <th>Rating</th>
        <th>Actions</th>

    </tr>
    </thead>
    <tbody>
    <c:forEach items="${listas}" var="lista">
        <tr>
            <td> <a href="/songs/${lista.id}"><c:out value="${lista.title}"/></a></td>

            <td><c:out value="${lista.classification}"/></td>
            <td><a href="/songs/${lista.id}">Delete</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>


</body>
</html>
