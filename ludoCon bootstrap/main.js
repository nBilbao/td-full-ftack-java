var tablero = [
    [0,0,0,0,0,0,1,1,1,3,3,3,3,3,3],
    [0,1,0,0,1,0,1,3,3,3,1,3,3,1,3],
    [0,0,0,0,0,0,1,3,1,3,3,3,3,3,3],
    [0,0,0,0,0,0,1,3,1,3,3,3,3,3,3],
    [0,1,0,0,1,0,1,3,1,3,1,3,3,1,3],
    [0,0,0,0,0,0,1,3,1,3,3,3,3,3,3],
    [1,0,1,1,1,1,1,3,1,1,1,1,1,1,1],
    [1,0,0,0,0,0,0,1,4,4,4,4,4,4,1],
    [1,1,1,1,1,1,1,5,1,1,1,1,1,4,1],
    [5,5,5,5,5,5,1,5,1,4,4,4,4,4,4],
    [5,1,5,5,1,5,1,5,1,4,1,4,4,1,4],
    [5,5,5,5,5,5,1,5,1,4,4,4,4,4,4],
    [5,5,5,5,5,5,1,5,1,4,4,4,4,4,4],
    [5,1,5,5,1,5,5,5,1,4,1,4,4,1,4],
    [5,5,5,5,5,5,1,1,1,4,4,4,4,4,4]
    ]
function rellenar(){
    var output="";
    for(let i =0;i<tablero.length;i++){
        output+="\n<div class='row'>\n";
        for(let j=0;j<tablero.length;j++){
            if(tablero[i][j]==0){

                output+="<div class='greenSq bloque'></div>";
            }
            else if(tablero[i][j]==1){

                output+="<div class='whiteSq bloque'></div>";
            }
            else if(tablero[i][j]==3){

                output+="<div class='redSq bloque'></div>";
            }
            else if(tablero[i][j]==4){

                output+="<div class='blueSq bloque'></div>";
            }
            else if(tablero[i][j]==5){

                output+="<div class='yellowSq bloque'></div>";
            }
            
        }
        output += "\n</div>";
    }
    document.getElementById("tablero").innerHTML = output;
}
var ficha={
    x: 300,
    y: 700
};

function mostrarFicha(){
    document.getElementById('fichaVerde').style.top = (ficha.y)+"px";
    document.getElementById('fichaVerde').style.left = (ficha.x)+"px";
}
function mover(){
    let aux =0;
    //cambiar a metodo de captura del dado
    let nroDado = document.getElementById("placeholder").value;
    let capturaDado=nroDado;
    
    console.log(nroDado);
    aux+=capturaDado;
    if(aux<=6){
        ficha.x+=aux*100;
        
    }
    mostrarFicha();
}
//dado

function dado(){
    var min=1;
    var max=6;
    return Math.floor((Math.random() * (max - min + 1)) + min);
}
//muestro los numeros del dado en la pantalla del index
function mostrarDado(){
    var dadoNro = dado();
    document.getElementById("placeholder").innerHTML=dadoNro;
    return dadoNro;
}


rellenar();
mover();
