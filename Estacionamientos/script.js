$(document).ready(function () {
var clientes=[];
var vehiculos={};
var contador=1;


    $('#sub').click(function(){    
        
        let patente = $('#patente').val();
        let tipo = $('#tipo').val();
        let fecha = new Date($.now());
        var elemento ="";

        if(patente==""){
            alert("Debe ingresar una patente");
            return;
        }
        if(tipo=="Seleccione"){
            alert("Debe Seleccionar un tipo de vehiculo");
            return;
        }
        vehiculos={pos: contador, patente: patente, tipo: tipo, fechaIngreso: fecha};
        clientes[contador]=vehiculos;


        elemento +='<tr id="'+vehiculos.pos+'"';
        elemento +='><td>'+vehiculos.pos+''
        elemento +=
        elemento +=


        $('table').append('<tr id="'+vehiculos.pos+'"> <td>'+vehiculos.pos+'</td> <td>'+vehiculos.patente+'</td> <td>'+vehiculos.tipo+'</td><td>'+vehiculos.fechaIngreso.getHours()+':'+vehiculos.fechaIngreso.getMinutes()+'</td><td> <div id="columna'+vehiculos.pos+'" class="field"><div class="control"><div class="buttons has-addons is-centered"><button id="del'+vehiculos.pos+'" class="button">Eliminar</button><button id="edit'+vehiculos.pos+'" class="button">Editar</button></div></div></div></td> </tr>'); 
        
        contador++;    
        console.log(clientes);

        
        $( '#'+vehiculos.pos ).mouseover(function() {
            $(this).css("background-color","hsl(217, 71%, 53%)");
            $(this).css("color","white");
            $('button').css("display","inline");

            
            
            
           
        });
        $( '#'+vehiculos.pos ).mouseout(function() {
            $(this).css("background-color","white");
            $(this).css("color","black");
        });

        
    });

    
    

    function mostrarHora(){
        var horaActual = new Date($.now())
        var hora = horaActual.getHours()
        var min = horaActual.getMinutes();
        var seg = horaActual.getSeconds();
        if(hora<10){
            hora = "0"+ hora;
        }
        if(min<10){
            min="0"+min;   
        } 
        if(seg<10){
            seg="0"+seg; 
        } 
        $('#reloj').val(hora+":"+min+":"+seg);  
    }
    setInterval(mostrarHora,1000);

    
    


});