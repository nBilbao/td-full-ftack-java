<%--
  Created by IntelliJ IDEA.
  User: nemesiobilbao
  Date: 06-08-21
  Time: 19:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
    <title>Song</title>
</head>
<body>
<a href="/dashboard">DashBoard</a></a><br><br><br>


<table border="1">
    <tbody>

        <tr>
            <td>Title</td>
            <td><c:out value="${song.title}"/></td>
        </tr>
        <tr>
            <td>Artist</td>
            <td><c:out value="${song.artist}"/></td>
        </tr>
        <tr>
            <td>Classification</td>
            <td><c:out value="${song.classification}"/></td>
        </tr>

    </tbody>
</table>
<a href="/songs/${song.id}/delete" >Delete</a><br><br><br>








</body>
</html>
