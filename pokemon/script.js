$(document).ready(function(){
    var num=1;
    const rutaImagen ="http://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/shiny/";
    for(let i=0;i<151;i++){
        $('#container').append('\n<div class="marcoImagen"><img id="'+num+'"> </img></div>\n' );
            $('#'+num).prop("src",rutaImagen+num+".png");
            num++;
    }  
    $('.marcoImagen').click(function (e) { 

        // $(this).css("background-color", "red");
        $(this).fadeOut(100);
        $(this).fadeIn(100);     

        
        var numero = e.target.id;
        var pokemon = "https://pokeapi.co/api/v2/pokemon/"+numero;
        $('#menu').fadeOut(100);
        $('#menu').fadeIn(100);  
        
        $.get(pokemon, function(res) {
            var salidaHtml="";
            salidaHtml +='<h2>Tipos:</h2>';
            salidaHtml +='<ul>';
            $('#datos').html('<ul>');
            for(var i = 0; i <res.types.length; i++) {
                
                salidaHtml+='<li>'+res.types[i].type.name+'</li>';
            }
            salidaHtml+='</ul>';


            $('#imagen').html('<img src="http://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/shiny/'+numero+'.png"></img>');
            $('#nombre').html('<h1>'+res.name+'</h1');
            $('#datos').html(salidaHtml);
            $('#height').html('<h2>Height</h2>\n'+res.height);
            $('#weight').html('<h2>weight</h2>\n'+res.weight);

            

        }, "json");


    });


});