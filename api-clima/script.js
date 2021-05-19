$(document).ready(function() {
    var key="e7c117eee5f9599acd069e93e49333fc"
    var url1="http://api.openweathermap.org/data/2.5/weather?q="
    var url2="&appid=";
    var urlFinal="";
    var ciudad="";
    

    
    $('#enviar').click(function (e) { 
        ciudad = $('#ciudad').val();
        
        urlFinal=url1+ciudad+url2+key;
        $.get(urlFinal,function (res) {
            console.log(res);
            var salida="";
            

            salida=ciudad+": "+res.weather[0].description
            +"<br>Temperatura: "+res.main.temp
            +"<br>Coord: "+res.coord.lon+"     "+res.coord.lat;
            $('#salida').html("<p>"+salida+" </p>");


                
            },"json"
        );
    
    });
    

    
});

