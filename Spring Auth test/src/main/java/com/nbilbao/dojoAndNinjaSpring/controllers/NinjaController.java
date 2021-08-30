package com.nbilbao.dojoAndNinjaSpring.controllers;

import com.nbilbao.dojoAndNinjaSpring.models.Dojo;
import com.nbilbao.dojoAndNinjaSpring.models.Ninja;
import com.nbilbao.dojoAndNinjaSpring.sevices.DojoService;
import com.nbilbao.dojoAndNinjaSpring.sevices.NinjaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
public class NinjaController {

    private final NinjaService ninjaService;
    private final DojoService dojoService;

    public NinjaController(NinjaService ninjaService, DojoService dojoService){
        this.ninjaService = ninjaService;
        this.dojoService = dojoService;
    }

    @RequestMapping("/ninjas")
    public String indexNinjas(Model model){
        List<Ninja> ninjas = ninjaService.allNinjas();
        model.addAttribute("ninjas",ninjas);

        return "index_ninja.jsp";
    }

    @RequestMapping("/ninjas/new")
    public String newNinja(@ModelAttribute("ninja") Ninja ninja, Model model) {
        List<Dojo> dojos = dojoService.allDojos();
        model.addAttribute("dojos",dojos);

        return "/new_ninja.jsp";
    }


    @RequestMapping(value= "/ninjas/new", method= RequestMethod.POST)
    public String create(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result,Model model) {

        if (result.hasErrors()) {
            return "/new_ninja.jsp";
        } else {

            return "redirect:/ninjas";
        }
    }



}
