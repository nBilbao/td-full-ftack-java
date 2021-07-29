<%--
  Created by IntelliJ IDEA.
  User: nemesiobilbao
  Date: 29-07-21
  Time: 18:30
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    <title>Dojo Survey Index</title>
</head>
<body class="row align-items-center justify-content-center vh-50">
<div class="col-sm-4 mt-2">
    <form method="post" action="/result" >
        <fieldset >
            <legend>Encuesta del Dojo</legend>

            <div class="form-group" >
                <label for="nombre" class="form-label mt-4">Nombre</label>
                <input name="name" type="text" class="form-control" id="nombre" aria-describedby="emailHelp" placeholder="Ingrese  su nombre">

                <label for="exampleSelect1" class="form-label mt-4">Dojo Location</label>
                <select name="location" class="form-select" id="exampleSelect1">
                    <option>San Jose</option>
                    <option>Loncoche</option>

                </select>

                <label for="exampleSelect1" class="form-label mt-4">Lenguaje Favorito</label>
                <select name="language" class="form-select" id="exampleSelect2">
                    <option>Java</option>
                    <option>Python</option>
                </select>

                <label for="exampleTextarea" class="form-label mt-4">Comentarios (opcional)</label>
                <textarea name="text" class="form-control" id="exampleTextarea" rows="3"></textarea>

            </div>
            <button type="submit" class="btn btn-primary mt-4">Submit</button>

        </fieldset>
    </form>
</div>

    <!-- Optional JavaScript; choose one of the two! -->

    <!-- Option 1: Bootstrap Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

    <!-- Option 2: Separate Popper and Bootstrap JS -->
    <!--
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
    -->
</body>
</html>
