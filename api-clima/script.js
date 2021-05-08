$(document).ready(function() {
    var key="e7c117eee5f9599acd069e93e49333fc"
    var url1="http://api.openweathermap.org/data/2.5/weather?q="
    var url2="&appid=";
    var urlFinal="";
    var ciudad="";
    

    // $('form').submit(function() {
    //     // your code here (build up your url)
    //     $.get(url, function(res) {
    //         // your code here
    //     }, 'json');
    //     // don't forget to return false so the page doesn't refresh
    //     return false;
    // });

    $('#enviar').click(function (e) { 
        ciudad = $('#ciudad').val();
        
        urlFinal=url1+ciudad+url2+key;
        $.get(urlFinal,function (res) {
            console.log(res);
            var salida="";
            // for(let i=0;i<res.weather.lenght;i++){
            //     salida+=res.weather[i];
            // }
            // console.log(salida);

            salida=ciudad+": "+res.weather[0].description
            +"<br>Temperatura: "+res.main.temp
            +"<br>Coord: "+res.coord.lon+"     "+res.coord.lat;
            $('#salida').html("<p>"+salida+" </p>");


                
            },"json"
        );
    
    });
    

    
});

