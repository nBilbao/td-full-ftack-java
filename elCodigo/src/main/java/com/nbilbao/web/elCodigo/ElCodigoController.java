package com.nbilbao.web.elCodigo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller

public class ElCodigoController {

    @RequestMapping("/")
    public String home(RedirectAttributes redirectAttributes, Model model){
        redirectAttributes.addFlashAttribute("error", "You must train harder!");
        model.addAttribute("error",null);



        return "index.jsp";
    }
    @RequestMapping(value="/code", method= RequestMethod.POST)
    public String validar(RedirectAttributes redirectAttributes, @RequestParam(value="code",required = false) String code){

        redirectAttributes.addFlashAttribute("error", "You must train harder!");
        if(code.equals("bushido")){
            return "code.jsp";
        }else{
            return "/createError";
        }


    }
    





}
