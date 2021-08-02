<%--
  Created by IntelliJ IDEA.
  User: nemesiobilbao
  Date: 29-07-21
  Time: 18:18
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>El Código</title>
</head>
<body>



<form action="/code.jsp" method="post" style="margin: 5% 0 0 45% ">
    <h4 style="color: red"> <c:out value="${error}"/></h4>
    <label for="fname">What is the code?</label><br>
    <input type="text" id="fname" name="code"><br>

    <input type="submit" value="Try Code">
</form>

</body>
</html>
