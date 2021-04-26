var nombre = document.getElementById("nombre").value;
var apellido = document.getElementById("apellido").value;
//var sexo = document.getElementById("sexo").value;
var email = document.getElementById("email").value;




function validaciones(){
    if(email.search("@")==-1){
        alert("Correo electrónico inválido!")
        console.log("error");
        return false;

    }


}




