<%--
  Created by IntelliJ IDEA.
  User: nemesiobilbao
  Date: 12-08-21
  Time: 11:46
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>New</title>
</head>
<body>

<h1>New Person</h1>
    <form:form action="/persons" method="post" modelAttribute="person">
        <p>
            <form:label  path="firstName">First Name</form:label>
            <form:errors path="firstName"/>
            <form:input  path="firstName"/>
        </p>
        <p>
            <form:label path=   "lastName">Last Name</form:label>
            <form:errors path=  "lastName"/>
            <form:input path=   "lastName"/>
        </p>
        <input type="submit" value="Submit"/>
    </form:form>

</body>
</html>
