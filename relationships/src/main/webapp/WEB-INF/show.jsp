<%--
  Created by IntelliJ IDEA.
  User: nemesiobilbao
  Date: 12-08-21
  Time: 12:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Show</title>
</head>
<body>

    <h1><c:out value="${person.firstName} ${person.lastName}"/></h1>
    <p>First Name: <c:out value="${person.firstName}"/></p>
    <p>Last  Name: <c:out value="${person.lastName}"/></p>

</body>
</html>
