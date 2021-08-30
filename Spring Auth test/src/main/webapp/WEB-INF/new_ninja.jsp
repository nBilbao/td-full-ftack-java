<%--
  Created by IntelliJ IDEA.
  User: nemesiobilbao
  Date: 12-08-21
  Time: 21:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>New Ninja</title>
</head>
<body>
<h1>New License!</h1>
<form:form action="/ninjas/new" method="post" modelAttribute="ninja">

    <p>
        <form:select path="dojo">
            <c:forEach items="${dojos}" var="dojos">
                <form:option value="${dojos.name}"/>
            </c:forEach>
        </form:select>

    </p>
    <p>
        <form:label  path="firstName">Name: </form:label>
        <form:errors path="firstName"/>
        <form:input  path="firstName"/>
    </p>
    <p>

        <form:label  path="lastName">Last Name: </form:label>
        <form:errors path="lastName"/>
        <form:input  path="lastName" />

    </p>
    <p>

        <form:label  path="age">Age: </form:label>
        <form:errors path="age"/>
        <form:input  path="age" />

    </p>

    <input type="submit" value="Submit"/>
</form:form>
</body>
</html>
