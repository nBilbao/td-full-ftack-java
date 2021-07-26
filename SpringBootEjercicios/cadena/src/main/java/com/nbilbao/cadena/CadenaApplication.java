package com.nbilbao.cadena;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CadenaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CadenaApplication.class, args);
	}

	@RequestMapping("/")

	public String msg(){
		return "Este es un cálido mensaje!";
	}

	@RequestMapping("/random")

	public String msg2(){
		return "Este es un cálido mensaje también, y escrito con SpringBoot";
	}

}
