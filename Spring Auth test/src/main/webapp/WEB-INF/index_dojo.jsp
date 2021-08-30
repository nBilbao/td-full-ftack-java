<%--
  Created by IntelliJ IDEA.
  User: nemesiobilbao
  Date: 12-08-21
  Time: 20:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Index</title>
</head>
<body>

<h1>All Dojos</h1>
<table>
    <thead>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Ninjas</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${dojos}" var="dojo">
        <tr>
            <td><c:out value="${dojo.id}"/></td>
            <td><c:out value="${dojo.name}"/></td>
            <td><c:out value="${dojo.ninjas}"/></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<a href="/dojos/new">New Dojo</a>


</body>
</html>
