<%--
  Created by IntelliJ IDEA.
  User: nemesiobilbao
  Date: 12-08-21
  Time: 21:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
    <title>SHow Dojos!</title>
</head>
<body>
<h1>Burbank Location Ninjas</h1>

<h2>${dojo.name}  Dojo </h2>
<table>
    <thead>
    <tr>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Age</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${dojo.ninjas}" var="ninja">
        <tr>
            <td><c:out value="${ninja.firstName}"/></td>
            <td><c:out value="${ninja.lastName}"/></td>
            <td><c:out value="${ninja.age}"/></td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>
