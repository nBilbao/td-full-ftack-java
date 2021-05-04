var mundo=[
    [1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1],
    [1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1],
    [1,0,1,0,1,1,1,1,1,1,1,1,1,0,0,0,0,0,1,1,1,1,1,1,1,1,1,0,1,0,1],
    [1,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,1],
    [1,0,1,0,1,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,1,0,1,0,1],
    [1,0,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,0,1],
    [1,0,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,0,1],
    [1,0,1,0,1,0,0,0,0,0,0,0,0,1,1,2,1,1,0,0,0,0,0,0,0,0,1,0,1,0,1],
    [1,0,1,0,1,0,0,0,0,0,0,0,0,1,2,2,2,1,0,0,0,0,0,0,0,0,1,0,1,0,1],
    [1,0,1,0,1,0,0,0,0,0,0,0,0,1,2,2,2,1,0,0,0,0,0,0,0,0,1,0,1,0,1],
    [1,0,1,0,1,1,1,1,1,1,1,0,0,1,1,1,1,1,0,0,1,1,1,1,1,1,1,0,1,0,1],
    [1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1],
    [1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1],
    [1,0,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,0,1],
    [1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1],
    [1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1]
];

var pacman =    {x: 1,  y: 1};
var ghost =     {x: 15, y: 8};

var score =0;
function displayMundo(){
    var output ='';

    for(var i=0;i<mundo.length;i++){
        output+="\n<div class='row'>\n";
        for(var j=0;j<mundo[i].length;j++){
            if(mundo[i][j]==1){
                output+="<div class='brick'></div>";
            }
            else if(mundo[i][j]==0){
                output+="<div class='coin'></div>";
            }
            else if(mundo[i][j]==2){
                output+="<div class='empty'></div>";
            }
            else if(mundo[i][j]==3){
                output+="<div class='cereza'></div>";
            }

        }
        output += "\n</div>";

    }
    document.getElementById("mundo").innerHTML=output;
}
function displayPacman(){
    document.getElementById("pacman").style.top = pacman.y*20 +"px";
    document.getElementById("pacman").style.left = pacman.x*20 +"px";
}

function displayGhost(){
    document.getElementById("ghost").style.top = ghost.y*20 +"px";
    document.getElementById("ghost").style.left = ghost.x*20 +"px";
}
function displayScore(){
    document.getElementById('score').innerHTML=score;
}
displayMundo();
displayPacman();

displayScore();
displayGhost();
setInterval(mostrarFruta,10000);
setInterval(movingGhost,100);

document.onkeydown = function (e){

    if(e.key=="ArrowLeft" && mundo[pacman.y][pacman.x-1]!=1){
        pacman.x--;
    }
    else if(e.key=="ArrowRight" && mundo[pacman.y][pacman.x+1]!=1){
        pacman.x++;
    }
    else if(e.key=="ArrowUp" && mundo[pacman.y-1][pacman.x]!=1){
        pacman.y--;
    }
    else if(e.key=="ArrowDown" && mundo[pacman.y+1][pacman.x]!=1){
        pacman.y++;
    }

    if(mundo[pacman.y][pacman.x]==0 ){
        mundo[pacman.y][pacman.x]=2;
        score+=10;
        displayMundo();
        displayScore();
    }
    else if(mundo[pacman.y][pacman.x]==3){
        mundo[pacman.y][pacman.x]=2;
        score+=100;
        displayMundo();
        displayScore();
        //setTimeout(mostrarFruta,Math.round(Math.random()*10000));
    }

    console.log(e.key);
    displayPacman();
}

function movingGhost(){
    var ladoAleatoreo = Math.round(Math.random()*4);
    if(ladoAleatoreo==1 && mundo[ghost.y][ghost.x-1]!=1){
        //implementar mover izq
        ghost.x--;
    }
    else if(ladoAleatoreo==2 && mundo[ghost.y-1][ghost.x]!=1){
        //implementar mover arriba
        ghost.y--
    }
    else if(ladoAleatoreo==3 && mundo[ghost.y][ghost.x+1]!=1){
        //implementar mover derecha
        ghost.x++;
    }
    else if(ladoAleatoreo==4 && mundo[ghost.y+1][ghost.x]!=1){
        //implementar mover abajo
        ghost.y++;
    }
    displayGhost();

}


function mostrarFruta(){
    var aleatorio = Math.round(Math.random()*15);
    var aleatorio2 = Math.round(Math.random()*15);
    if(mundo[aleatorio][aleatorio2]!=1){
        mundo[aleatorio][aleatorio2]=3;
        displayMundo();

    }
}