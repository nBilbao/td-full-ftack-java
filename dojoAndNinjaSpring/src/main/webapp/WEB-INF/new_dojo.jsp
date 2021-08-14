<%--
  Created by IntelliJ IDEA.
  User: nemesiobilbao
  Date: 12-08-21
  Time: 21:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>New Dojo</title>
</head>
<body>

<h1>New Dojo</h1>
<form:form action="/dojos" method="post" modelAttribute="dojos">
  <p>
    <form:label path  ="name">Name</form:label>
    <form:errors path ="name"/>
    <form:input path  ="name"/>
  </p>

  <input type="submit" value="Create"/>
</form:form>



</body>
</html>
