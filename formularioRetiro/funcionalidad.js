function validacionRut(){
    let rut = document.getElementById("rut")
    // Despejar Puntos
    let valor = rut.value.replace('.', '');
    // Despejar Guión
    valor = valor.replace('-', '');
    // Aislar Cuerpo y Dígito Verificador
    cuerpo = valor.slice(0, -1);
    dv = valor.slice(-1).toUpperCase();
    // Formatear RUN
    rut.value = cuerpo + '-' + dv
    // Si no cumple con el mínimo ej. (n.nnn.nnn)
    if (cuerpo.length < 7) { 
        alert("Rut incompleto");
        return false;
    }
    // Calcular Dígito Verificador
    suma = 0;
    multiplo = 2;
    // Para cada dígito del Cuerpo
    //let valido = document.getElementById('rut');
    for (let i = 1; i <= cuerpo.length; i++) {
        // Obtener su Producto con el Múltiplo Correspondiente
        index = multiplo * valor.charAt(cuerpo.length - i);
        // Sumar al Contador General
        suma = suma + index;
        // Consolidar Múltiplo dentro del rango [2,7]
        if (multiplo < 7) {
            multiplo = multiplo + 1;
        } else {
            multiplo = 2;
        }
    }
    // Calcular Dígito Verificador en base al Módulo 11
    dvEsperado = 11 - (suma % 11);
    // Casos Especiales (0 y K)
    dv = (dv == 'K') ? 10 : dv;
    dv = (dv == 0) ? 11 : dv;
    // Validar que el Cuerpo coincide con su Dígito Verificador
    if (dvEsperado != dv) {
        alert("El digito verificador no coincide");      
        return false;
    }
    return true;
}
function validacionNroSerie(){
    let serie = document.getElementById('serie').value;
    let conSerie = document.getElementById('conSerie').value;
    let serieRegex = /^([0-9])*$/;
    if(serie!==conSerie){
        return false;
    }
    else if(serieRegex.test(serie)==false){
        return false;
    }
    else if(serie==""){
        return false;
    }
    else{
        return true;
    }
}
function validacioEmail(){

    let email = document.getElementById('email').value;
    let conEmail = document.getElementById('conEmail').value;
    let emailRegex = /^[-\w.%+]{1,64}@(?:[A-Z0-9-]{1,63}\.){1,125}[A-Z]{2,63}$/i;
    if(email!==conEmail){
        return false
    }
    else if(emailRegex.test(email)==false){
        return false      
    }
    else if(email==""){
        return false;
    }
    else{
        return true;
    }
}
function validacionCel(){
    let celular = document.getElementById('celular').value;
    let conCelular = document.getElementById('conCelular').value;
    let celRegex = /^([0-9])*$/;

    if(celular!==conCelular){
        return false;
    }
    else if(celRegex.test(celular)==false){
        return false;
    }
    else if(celular==""){
        return false;
    } 
    else{
        return true;
    }
}
function obtnerRadio(){
    let ctaRut= document.getElementById('ctaRut');
    let otroBanco = document.getElementById('otroBanco');
    let cta2 = document.getElementById('cta2');
    if(ctaRut.checked==true){
        return 'Cuenta rut.';
    }
    else if(otroBanco.checked==true){
        return "Desposito en otro Banco.";
    }
    else if(cta2.checked==true){
        return "Deposito en cuenta 2.";
    }
    else{
        return "Error en la captura de selección."
    }
}
function generarUsuario(){
    let rut = document.getElementById("rut").value;
    let serie = document.getElementById('serie').value;
    let email = document.getElementById('email').value;
    let celular = document.getElementById('celular').value;

    user ={rut:rut,nroSerie:serie,email:email,celular:celular,cuenta:obtnerRadio() };
    return user;
}
function cerrarVentanaPrincipal(){
    let ventana1 = document.getElementById('wrapper');
    let ventana2 = document.getElementById('wrapper2');
    ventana1.style.display = "none";
    ventana2.style.display = "block"
}
function cerrarVentanaSecundaria(){
    let ventana2 = document.getElementById('wrapper2');
    let ventana3 = document.getElementById('wrapper3');
    ventana2.style.display = "none";
    ventana3.style.display = "block"
}

function validaciones(){
    let rut = validacionRut().value;
    let serie = validacionNroSerie().value;
    let email = validacioEmail().value;
    let celular = validacionCel().value;

    if(serie == false){
        console.log('numero de serie invalido');
    }
    else if(email==false){
        console.log('Email invalido');
    }
    else if(celular==false){
        console.log('celular invalido');
    }
    else if(rut==false){
        console.log('verifique el rut')
    }
    else{
        console.log('todo ok por acá!');
        cerrarVentanaPrincipal();
    }
}

function mostrarResul(){
    let usuario = generarUsuario();
    let consola = document.getElementById('status');
    let resumen = 
    "\n RUT    : "+usuario.rut+
    "\n Nro    : "+usuario.nroSerie+
    "\n E-Mail : "+usuario.email+
    "\n Celular: "+usuario.celular+
    "\n Cuenta : "+usuario.cuenta;


    cerrarVentanaSecundaria();
    consola.innerText = resumen;
}



