<%--
  Created by IntelliJ IDEA.
  User: nemesiobilbao
  Date: 01-08-21
  Time: 15:18
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    <title>Gold</title>
</head>
<body>

    <br>
    <div class="container">
        <h1>Your Gold: <c:out value="${puntos}"/>
        </h1>
        <div class="row align-items-start border border-primary">
            <div class="col border border-primary">
                <form method="post" name="oro">
                    <div class="form-group row text-center">
                        <h2>Farm</h2>
                        <h5>(earns 10-20 gold)</h5>
                        <button type="submit" class="btn btn-primary">Find Gold!</button>
                    </div>
                </form>
            </div>
            <div class="col border border-primary">
                <form method="post">
                    <div class="form-group row text-center">
                        <h2>Cave</h2>
                        <h5>(earns 5-10 gold)</h5>
                        <button type="submit" class="btn btn-primary">Find Gold!</button>
                    </div>
                </form>
            </div>
            <div class="col border border-primary">
                <form method="post">
                    <div class="form-group row text-center">
                        <h2>House</h2>
                        <h5>(earns 2-5 gold)</h5>
                        <button type="submit" class="btn btn-primary">Find Gold!</button>
                    </div>
                </form>
            </div>
            <div class="col border border-primary">
                <form method="post">
                    <div class="form-group row text-center">
                        <h2>Casino!</h2>
                        <h5>(earns/takes 0-50 gold)</h5>
                        <button type="submit" class="btn btn-primary">Find Gold!</button>
                    </div>
                </form>
            </div>
        </div>
        <div class="container"><br><br>

            <div class="form-group">
                <label for="exampleSelect2"><h1>Activities:</h1></label><br>
                <select multiple="" class="form-select" id="exampleSelect2">
                    <option>1</option>
                    <option>2</option>
                    <option>3</option>
                    <option>4</option>
                    <option>5</option>
                </select>
            </div>

        </div>

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
