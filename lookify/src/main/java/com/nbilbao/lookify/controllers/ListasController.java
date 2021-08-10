package com.nbilbao.lookify.controllers;

import com.nbilbao.lookify.models.Lista;
import com.nbilbao.lookify.services.ListaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller

public class ListasController {
    private final ListaService listaService;

    public ListasController(ListaService listaService){
        this.listaService = listaService;
    }
    @RequestMapping("/")
    public String home(){
        return "/index.jsp";
    }

    @RequestMapping("/dashboard")
    public String index(Model model) {
        List<Lista> listas = listaService.allListas();
        model.addAttribute("listas", listas);
        return "dashboard.jsp";
    }

    @RequestMapping("dashboard/new")
    public String newLista(@ModelAttribute("lista") Lista lista) {
        return "/new.jsp";
    }

    @RequestMapping(value="/dashboard", method= RequestMethod.POST)
    public String create(@Valid @ModelAttribute("lista") Lista lista, BindingResult result) {
        if (result.hasErrors()) {
            return "/new.jsp";
        } else {
            listaService.createLista(lista);
            return "redirect:/dashboard";
        }
    }
    @RequestMapping(value="/songs/{id}")
    public String songs(@PathVariable("id") Long id,Model model) {
        model.addAttribute("song",listaService.findLista(id));
        return "/songs.jsp";
    }
    @RequestMapping(value="/songs/{id}/delete",method = RequestMethod.GET)
    public String destroy(@PathVariable("id") Long id) {

        listaService.deleteBook(id);
        return "redirect:/dashboard";

    }

    @RequestMapping("/search/topten")
    public String topten(Model model) {
        List<Lista> listas = listaService.ordenarTopTen();
        model.addAttribute("listas",listas) ;
        return "topten.jsp";
    }
    @RequestMapping(value="/search/",method = RequestMethod.GET)
    public String searchArtist(@RequestParam("artist") String name,@ModelAttribute("lista") Lista lista,Model model) {
        //model.addAttribute("song",listaService.findLista(id));
        model.addAttribute("canciones",listaService.findArtist(name));
        return "/search.jsp";
    }



}
