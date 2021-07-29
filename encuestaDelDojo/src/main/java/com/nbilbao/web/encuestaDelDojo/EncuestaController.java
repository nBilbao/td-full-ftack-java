package com.nbilbao.web.encuestaDelDojo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class EncuestaController {
    @RequestMapping("/")
    public String home(){
        return "index.jsp";
    }
    @RequestMapping(value="/result",method= RequestMethod.POST)
    public String result(@RequestParam(value="name") String nombre, @RequestParam(value="location") String locacion, @RequestParam(value="language") String lenguaje, @RequestParam(value="text") String text, HttpSession session){



        session.setAttribute("nombre", nombre);
        session.setAttribute("locacion", locacion);
        session.setAttribute("lenguaje", lenguaje);
        session.setAttribute("text", text);


        return "result.jsp";
    }

}
