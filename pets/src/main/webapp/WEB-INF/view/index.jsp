<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>Create a pet!</title>
</head>
<body>
	<h1>Create a Dog</h1>

	<form action="Dogs" method="get">

	  <p>Name: <input type="text" 	name="name" 	size="40"></p>
	  <p>Breed: <input type="text" 	name="breed" 	size="40"></p>
	  <p>Weight: <input type="text" name="weight" 	size="40"></p>
	  <p><input id="dog" type="submit" value="Enviar"></p>

	</form>

	<h1>Create a Cat</h1>
	
	<form action="Cats" method="get">

	  <p>Name: <input type="text" 	name="name" 	size="40"></p>
	  <p>Breed: <input type="text" 	name="breed" 	size="40"></p>
	  <p>Weight: <input type="text" name="weight" 	size="40"></p>
	  <p><input id="cat" type="submit" value="Enviar"></p>

	</form>

</body>
</html>