package com.nbilbao.web.mostrarFecha;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping("/")
public class HomeController {

    @RequestMapping("fecha")
    public String fecha(Model model){

        Date fecha = new Date();
        String formater = "EEEE', 'd ' de' MMMM ', de 'YYYY";
        SimpleDateFormat obj = new SimpleDateFormat(formater);
        String formatoFinal = obj.format(fecha);
        model.addAttribute("fecha",formatoFinal);

        return "fecha.jsp";
    }
    @RequestMapping("hora")
    public String hora(Model model){

        Date fecha = new Date();
        String formater = "HH:mm a";
        SimpleDateFormat obj = new SimpleDateFormat(formater);
        String formatoFinal = obj.format(fecha);
        model.addAttribute("fecha",formatoFinal);

        model.addAttribute("hora",new Date());
        return "hora.jsp";
    }








}
