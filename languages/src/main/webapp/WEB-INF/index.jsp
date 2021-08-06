<%--
  Created by IntelliJ IDEA.
  User: nemesiobilbao
  Date: 05-08-21
  Time: 21:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Languages </title>
</head>
<body>
    <h1>All Languages</h1>

    <table border="1">
        <thead>
        <tr>
            <th>Name</th>
            <th>Creator</th>
            <th>Current_Version</th>
            <th>Action</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${languages}" var="languages">
            <tr>
                <td><c:out value="${languages.name}"/></td>
                <td><c:out value="${languages.creator}"/></td>
                <td><c:out value="${languages.currentVersion}"/></td>
                <td><a href="/languages/${languages.id}">Delete</a>  <a href="/languages/${languages.id}/edit">Edit</a></td>
            </tr>

        </c:forEach>
        </tbody>
    </table>

    <a href="/languages/new">New Language</a>

</body>
</html>
