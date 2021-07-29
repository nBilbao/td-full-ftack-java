package com.nbilbao.web.contador;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller

public class ContadorController {


    @RequestMapping("/")
    public String home(HttpSession session){
        if(session.getAttribute("contador")==null){
            session.setAttribute("contador",1);
            return "index.jsp";
        }
        else{
            int contador = (int)session.getAttribute("contador");
            session.setAttribute("contador",contador+1);
            return "index.jsp";

        }
    }
    @RequestMapping("/counter")
    public String counter(HttpSession session, Model model){

        Integer count = (Integer) session.getAttribute("contador");
        model.addAttribute("times",count != null ? count : 0);
        return "contador.jsp";
    }
}
