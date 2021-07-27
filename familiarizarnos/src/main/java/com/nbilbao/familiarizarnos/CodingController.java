package com.nbilbao.familiarizarnos;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coding")
public class CodingController {

    @RequestMapping()
    public String enCoding(){
        return "Hola Coding Dojo!";
    }
    @RequestMapping("/python")
    public String enPython(){
        return "¡Python/Django fue increíble!";

    }
    @RequestMapping("/java")
    public String enJava(){
        return "¡Java/Spring es mejor!";

    }
}
