package com.nbilbao.paginacionSpringBoot.controllers;


import com.nbilbao.paginacionSpringBoot.models.Ninja;
import com.nbilbao.paginacionSpringBoot.services.NinjaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NinjaController {

    @Autowired
    NinjaService ninjaService;

    @RequestMapping("/pages/{pageNumber}")
    public String getNinjasPerPage(Model model, @PathVariable("pageNumber") int pageNumber) {
        //Tenemos que restar 1 porque las páginas iterables empiezan con índice 0. Esto es para que nuestros enlaces puedan mostrarse desde 1...maxPage(última página)
        Page<Ninja> ninjas = ninjaService.ninjasPerPage(pageNumber - 1);
        //Total número de páginas que tenemos
        int totalPages = ninjas.getTotalPages();
        model.addAttribute("totalPages", totalPages);
        model.addAttribute("ninjas", ninjas);
        return "ninjas.jsp";
    }

}
