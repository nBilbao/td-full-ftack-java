package com.nbilbao.familiarizarnos;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CodingController {
    @RequestMapping("/")
    public String main(){
        return "Principal";

    }
    @RequestMapping("/coding")
    public String enCoding(){
        return "Hola Coding Dojo!";
    }
    @RequestMapping("/coding/python")
    public String enPython(){
        return "¡Python/Django fue increíble!";

    }
    @RequestMapping("/coding/java")
    public String enJava(){
        return "¡Java/Spring es mejor!";

    }
}
