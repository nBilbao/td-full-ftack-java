<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    <title>Juego</title>
  </head>
  <body>
  
  	<div class="card text-center">
        <div class="card-header">
          Generador de palabras. <c:out value="${target}"/>
        </div>
          <div class="card-body">
          <h5 class="card-title">Su n�mero es: </h5> 
          <p class="card-text"><h2> <c:out value="${number}"/> </h2> </p>
          
          
          
          <form class="row g-3 mx-auto" action="/greatNameNumber/Home" method="post" >
	  
			  <div class="col-auto">
			    <label for="number" class="visually-hidden"></label>
			    <input type="text" name="number" class="form-control" id="number" placeholder="Ingrese su n�mero">
			  </div>
			  <div class="col-auto">
			    <button type="submit" class="btn btn-primary mb-3">Comprobar</button>
			  </div>
		  
			</form>
		
	
          
          </div>
          <div class="card-footer text-muted">
          <h4>Estado:  <c:out value="${resultado}"/></h4>
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