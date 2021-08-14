package com.nbilbao.dojoAndNinjaSpring.controllers;

import com.nbilbao.dojoAndNinjaSpring.models.Dojo;
import com.nbilbao.dojoAndNinjaSpring.models.Ninja;
import com.nbilbao.dojoAndNinjaSpring.sevices.DojoService;
import com.nbilbao.dojoAndNinjaSpring.sevices.NinjaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.List;

@Controller
public class DojoController {

    private final DojoService dojoService;
    private final NinjaService ninjaService;

    public DojoController(DojoService dojoService, NinjaService ninjaService){

        this.dojoService = dojoService;
        this.ninjaService = ninjaService;
    }

    @RequestMapping("/dojos")
    public String indexDojos(Model model){
        List<Dojo> dojos = dojoService.allDojos();
        model.addAttribute("dojos",dojos);
        return "index_dojo.jsp";
    }
    @RequestMapping("/dojos/new")
    public String newDojo(@ModelAttribute("dojos") Dojo dojo) {
        return "/new_dojo.jsp";
    }
    @RequestMapping(value= "/dojos", method= RequestMethod.POST)
    public String create(@Valid @ModelAttribute("dojos") Dojo dojos, BindingResult result) {
        if (result.hasErrors()) {
            return "/new_dojo.jsp";
        } else {
            dojoService.createDojo(dojos);
            return "redirect:/dojos";
        }
    }
    @RequestMapping("/dojos/{id}")
    public String edit(@PathVariable("id") Long id, Model model) {
        Dojo dojo = dojoService.findDojo(id);
        List<Ninja> ninjas = ninjaService.findAllByDojo(dojo);
        model.addAttribute("dojo", dojo);
        model.addAttribute("ninjas", ninjas);
        return "/show.jsp";
    }

}
