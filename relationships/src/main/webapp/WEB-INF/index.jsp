<%--
  Created by IntelliJ IDEA.
  User: nemesiobilbao
  Date: 12-08-21
  Time: 12:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Resumen</title>
</head>
<body>

<h1>All Persons</h1>
<table>
    <thead>
    <tr>
        <th>ID</th>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Created At</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${persons}" var="person">
        <tr>
            <td><c:out value="${person.id}"/></td>
            <td><c:out value="${person.firstName}"/></td>
            <td><c:out value="${person.lastName}"/></td>
            <td><c:out value="${person.createdAt}"/></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<a href="/persons/new">Add Persons</a>


</body>
</html>
