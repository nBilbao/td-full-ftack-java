package com.nbilbao.web.ninjaGold;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import javax.servlet.http.HttpSession;

@Controller

public class NinjaController {

    @RequestMapping("/gold")
    public String home(HttpSession session, Model model){

        if(session.getAttribute("puntos")==null){
            session.setAttribute("puntos",0);
        }
        model.addAttribute("puntos",session.getAttribute("puntos"));

        return "index.jsp";
    }

        @RequestMapping(value="/action", method=RequestMethod.POST)
        public String login(@RequestParam(value="oro") String user, @RequestParam(value="password") String password) {
            // ... procesar la información y guardarla en la Session
            return "redirect:/home";
        }



}
