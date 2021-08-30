<%--
  Created by IntelliJ IDEA.
  User: nemesiobilbao
  Date: 12-08-21
  Time: 21:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
    <title>Index Ninjas</title>
</head>
<body>
<h1>All Ninjas</h1>

<c:out value="${ninjas.size()}"/>
<table>
    <thead>
    <tr>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Age</th>
        <th>Dojo</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${ninjas}" var="ninja">
        <tr>
            <td><c:out value="${ninja.firstName}"/></td>
            <td><c:out value="${ninja.lastName}"/></td>
            <td><c:out value="${ninja.age}"/></td>
            <td><c:out value="${ninja.dojo}"/></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<a href="/ninjas/new">Add New Ninja</a>

</body>
</html>
