$(document).ready(function () {
    var link = "http://www.omdbapi.com/?s=";
    var id= "&apikey=6c7f832c";


    $("#enviar").click(function() { 

        
        var title = $("input").val();
        $.ajax({

            url: link+title+id,
            success: recopilacion
            
        });
        function recopilacion(response){
            
            console.log(link+title+id)
            console.log(response.Search.length);
            console.log(response);
            var salida="";

            for(let i =0;i<response.Search.length;i++){
                
                salida +="<h1>Titulo: "+    response.Search[i].Title+"</h1>";
                salida +="<h2>Año: "+       response.Search[i].Year+"</h2>";
                salida +="<h2>Tipo: "+      response.Search[i].Type+"</h2>";
                salida +="<h2>imdb ID: "+   response.Search[i].imdbID+"</h2>";
                salida +="<img src='"   +   response.Search[i].Poster+"'</img>";
                salida +="<br>";
            

                

            }
            $("#datos").append(salida);
            
            
        }
    });  

});