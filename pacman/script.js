var mundo=[
    [1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1],
    [1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1],
    [1,0,0,0,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1],
    [1,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1],
    [1,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1],
    [1,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1],
    [1,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1],
    [1,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1],
    [1,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1],
    [1,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1],
    [1,0,0,0,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1],
    [1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1],
    [1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1],
    [1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1],
    [1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1],
    [1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1]
];

var pacman = {x: 1,y: 1};
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
function displayScore(){
    document.getElementById('score').innerHTML=score;
}
displayMundo();
displayPacman();
displayScore();

document.onkeydown = function (e){

    if(e.key=="ArrowLeft"){
        pacman.x--;
    }
    else if(e.key=="ArrowRight"){
        pacman.x++;
    }
    else if(e.key=="ArrowUp"){
        pacman.y--;
    }
    else if(e.key=="ArrowDown"){
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
    }

    console.log(e.key);
    displayPacman();
}
