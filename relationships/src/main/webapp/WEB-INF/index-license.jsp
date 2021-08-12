<%--
  Created by IntelliJ IDEA.
  User: nemesiobilbao
  Date: 12-08-21
  Time: 15:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Resumen Licences</title>
</head>
<body>
    <h1>All Licenses</h1>
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
        <c:forEach items="${licenses}" var="license">
            <tr>
                <td><c:out value="${license.id}"/></td>
                <td><c:out value="${license.number}"/></td>
                <td><c:out value="${license.expirationDate}"/></td>
                <td><c:out value="${license.state}"/></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <a href="/licenses/new">Add Licenses</a>


</body>

</body>
</html>
