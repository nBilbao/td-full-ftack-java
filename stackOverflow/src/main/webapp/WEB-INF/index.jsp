<%--
  Created by IntelliJ IDEA.
  User: nemesiobilbao
  Date: 17-08-21
  Time: 19:09
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">

    <title>Questions!</title>
</head>
<body>


<!--   navbar -->

<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
    <div class="container container-fluid">
        <a class="navbar-brand" href="#">Questions</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarColor01" aria-controls="navbarColor01" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarColor01">
            <ul class="navbar-nav me-auto">
                <li class="nav-item">
                    <a class="nav-link active" href="#">Home
                        <span class="visually-hidden">(current)</span>
                    </a>
                </li>


            </ul>

        </div>
    </div>
</nav>

<!-- 	******************* -->


<!-- 	******************* -->
<main>
    <div class="container mt-5">
        <h2>All Questions</h2>

        <table class="table table-hover">
            <thead>
            <tr>
                <td>Questions</td>
                <td>Tags</td>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${questions}" var="question">
                <tr>
                    <td>
                        <a href="/questions/<c:out value="${question.idQuestions}"/>"><c:out value="${question.question}"/></a>

                    </td>
                    <td>
                        <c:forEach items="${question.tags}" var="tag">
                            <c:out value="${tag.subject}"/>,
                        </c:forEach>

                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>

        <div class="row">
            <div class="col-sm-12" style="text-align: right;">
                <a type="button" class="btn btn-primary" href="/questions/new">New Questions</a>
            </div>
        </div>
    </div>
</main>




<!-- Option 1: Bootstrap Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-U1DAWAznBHeqEIlVSCgzq+c9gqGAJn5c/t99JyeKa9xxaYpSvHU5awsuZVVFIhvj" crossorigin="anonymous"></script>

</body>
</html>
