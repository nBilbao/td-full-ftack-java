package com.nbilbao.holaHumano;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping("/")
    public String saludo(@RequestParam(value="name", required=false) String name,@RequestParam(value="apellido", required=false) String apellido){
        if(name==null){
            return "<h1>Hola Humano</h1><br><br><br> <h3>¡Bienvenido a SpringBoot!</h3>";
        }
        else{
            return "<h1>Hola "+name+" "+apellido+"</h1><br><br><br> <h3>¡Bienvenido a SpringBoot!</h3>";
        }


    }




}
