
var tablero = [
    [0,0,0,0,0,0,1,1,1,3,3,3,3,3,3],
    [0,0,0,0,0,0,1,3,3,3,3,3,3,3,3],
    [0,0,0,0,0,0,1,3,1,3,3,3,3,3,3],
    [0,0,0,0,0,0,1,3,1,3,3,3,3,3,3],
    [0,0,0,0,0,0,1,3,1,3,3,3,3,3,3],
    [0,0,0,0,0,0,1,3,1,3,3,3,3,3,3],
    [1,0,1,1,1,1,1,3,1,1,1,1,1,1,1],
    [1,0,0,0,0,0,0,1,4,4,4,4,4,4,1],
    [1,1,1,1,1,1,1,5,1,1,1,1,1,4,1],
    [5,5,5,5,5,5,1,5,1,4,4,4,4,4,4],
    [5,5,5,5,5,5,1,5,1,4,4,4,4,4,4],
    [5,5,5,5,5,5,1,5,1,4,4,4,4,4,4],
    [5,5,5,5,5,5,1,5,1,4,4,4,4,4,4],
    [5,5,5,5,5,5,5,5,1,4,4,4,4,4,4],
    [5,5,5,5,5,5,1,1,1,4,4,4,4,4,4]
    ]

function rellenar(){
    var output="";
    for(let i =0;i<tablero.length;i++){
        output+="\n<div class='row'>\n";
        for(let j=0;j<tablero.length;j++){
            if(tablero[i][j]==0){

                output+="<div class='greenSq'></div>";
            }
            else if(tablero[i][j]==1){

                output+="<div class='whiteSq'></div>";
            }
            else if(tablero[i][j]==3){

                output+="<div class='redSq'></div>";
            }
            else if(tablero[i][j]==4){

                output+="<div class='blueSq'></div>";
            }
            else if(tablero[i][j]==5){

                output+="<div class='yellowSq'></div>";
            }
            else if(tablero[i][j]==6){

                output+="<div class='bicolor'></div>";
            }
        }
        output += "\n</div>";
    }
    document.getElementById("tablero").innerHTML = output;


}


//dado
var dice = {
    sides: 6,
    roll: function () {
        var randomNumber = Math.floor(Math.random() * this.sides) + 1;
        return randomNumber;
    }
}
//Prints dice roll to the page

function printNumber(number) {
    var placeholder = document.getElementById('placeholder');
    placeholder.innerHTML = number;
}

var button = document.getElementById('lanzar');

button.onclick = function() {
    var result = dice.roll();
    printNumber(result);
};
var pos={
    x: 1,
    y: 1
};
function mostrarPeon(){
    document.getElementById('peon').style.top = (pos.y)+"px";
    document.getElementById('peon').style.left = (pos.x)+"px";
}
function mover(){
    let mov = document.getElementById("placeholder").value;
    let count=0;
    coun +=mov;
    if(coun<6){
        pos.x=count;
        mostrarPeon();
    }
}

rellenar();
mostrarPeon();