$(document).ready(function(){
    var num=1;
    for(let i=0;i<151;i++){
        $('#container').append('\n<div class="marcoImagen"><img id="'+num+'"> </img></div>\n' );
            $('#'+num).prop("src","http://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/shiny/"+num+".png");
            num++;
    }  
  });