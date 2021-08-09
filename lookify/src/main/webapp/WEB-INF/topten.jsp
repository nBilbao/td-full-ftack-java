<%--
  Created by IntelliJ IDEA.
  User: nemesiobilbao
  Date: 06-08-21
  Time: 20:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Search</title>
</head>
<body>
<a href="/dashboard">DashBoard</a><br><br><br>
<h2>Top Ten Song's</h2>

<ol>
  <c:forEach items="${listas}" var="lista">
  <li><c:out value="${lista.title}"/></li>
  </c:forEach>
</ol>






</body>
</html>
