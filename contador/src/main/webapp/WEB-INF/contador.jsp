<%--
  Created by IntelliJ IDEA.
  User: nemesiobilbao
  Date: 28-07-21
  Time: 14:07
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Contador</title>
</head>
<body>
    <h3>You have visited <a href="http://localhost:8080">localhost</a> <c:out value="${times}"/> times</h3>

</body>
</html>
