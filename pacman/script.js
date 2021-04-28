var mundo=[
    [1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1],
    [1,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1],
    [1,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1],
    [1,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1],
    [1,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1],
    [1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1],
    [1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1],
    [1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1],
    [1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1],
    [1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1],
];

var pacman = {
    x: 20,
    y: 22

};
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
            if(mundo[i][j]==2){
                output+="<div class='empty'></div>";
            }

        }
        output += "\n</div>";

    }
    document.getElementById("mundo").innerHTML=output;


}
function displayPacman(){
    document.getElementById('pacman').style.top = pacman.y +"px";
    document.getElementById('pacman').style.left = pacman.x +"px";
}
function displayScore(){
    document.getElementById('score').innerHTML=socre;
}
displayMundo();
displayPacman();
displayScore();
document.onkeydown = function (e){
    if(e.keyCode==37){
        pacman.x -= 20;
    }
    else if(e.keyCode==39){
        pacman.x += 20;
    }
    else if(e.keyCode==38){
        pacman.y -= 22;
    }
    else if(e.keyCode==40){
        pacman.y += 22;
    }
    if(mundo[pacman.y][pacman.x]==0){
        mundo[pacman.y][pacman.x]=2;
        score+=100;
        displayMundo();
    }
    console.log(e.keyCode);
    displayPacman();
}