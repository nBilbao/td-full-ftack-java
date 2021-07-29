package com.nbilbao.web.elCodigo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ElCodigoController {

    @RequestMapping("/")
    public String home(){
        return "index.jsp";
    }

}
