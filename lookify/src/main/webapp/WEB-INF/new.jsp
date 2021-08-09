<%--
  Created by IntelliJ IDEA.
  User: nemesiobilbao
  Date: 06-08-21
  Time: 19:04
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>New!</title>
</head>
<body>
<a href="/dashboard">DashBoard</a><br><br><br>
<h1>New Book</h1></a><br><br><br>

<form:form action="/dashboard" method="post" modelAttribute="lista">
    <p>
        <form:label path="title">Title</form:label>
        <form:errors path="title"/>
        <form:input path="title"/>
    </p>
    <p>
        <form:label path    ="artist">Artist</form:label>
        <form:errors path   ="artist"/>
        <form:input path ="artist"/>
    </p>
    <p>
        <form:label path    ="classification">Classification</form:label>
        <form:errors path   ="classification"/>
        <form:input path    ="classification"/>
    </p>

    <input type="submit" value="Submit"/>
</form:form>


</body>
</html>
