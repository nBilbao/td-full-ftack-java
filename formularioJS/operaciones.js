
let f = new Date(), fechaActual = f.getFullYear();
let nombre = document.getElementById("name").value;
let apellido = document.getElementById("lastName").value;
let fecha = document.querySelector('input[type="date"]').value;
let persona={name: nombre, lastName: apellido,date:fecha};
let arrayUser=[];

/*function calcularEdad() {
    var hoy = new Date();
    var cumpleanos = fecha;
    var edad = hoy.getFullYear() - cumpleanos.getFullYear();
    var m = hoy.getMonth() - cumpleanos.getMonth();
    if (m < 0 || (m === 0 && hoy.getDate() < cumpleanos.getDate())) {
        edad--;
    }
    return edad;
}
/*
var edad = calcularEdad("2000/08/10");
if(edad >= 18){
    alert("Eres mayor de edad :D ");
}else{
    alert("Eres menor de edad :( ");
}

 */
function addUser(){


    arrayUser.push(persona);





    /*Metedo para obtener el año actual
    var fecha = new Date();
    añoActual = fecha.getFullYear();*/



    /*
    var mensaje = "Bienvenido "+nombre+" "+apellido+" "+fecha;
    document.getElementById("show").innerHTML = mensaje;

     */

    console.log(persona);

}
function mostrarUsrs(){
    for(let i=0;i<arrayUser.length;i++){
        console.log(arrayUser[i]);
    }
}



