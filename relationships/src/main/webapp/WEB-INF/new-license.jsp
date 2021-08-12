<%--
  Created by IntelliJ IDEA.
  User: nemesiobilbao
  Date: 12-08-21
  Time: 15:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>New License</title>
</head>
<body>
<h1>New License!</h1>
<form:form action="/licenses" method="post" modelAttribute="license">

    <p>
        <form:select path="person">
            <c:forEach items="${license.person}" var="person">
                <form:option value="${license.person.firstName}${person.lastName}"/>
            </c:forEach>
        </form:select>

    </p>
    <p>
        <form:label  path="state">State: </form:label>
        <form:errors path="state"/>
        <form:input  path="state"/>
    </p>
    <p>
        <form:label path=   "expirationDate">Expiration Date</form:label>
        <form:errors path=  "expirationDate"/>

    </p>


    <input type="submit" value="Submit"/>
</form:form>



</body>
</html>
