package com.nbilbao.languages.controllers;

import com.nbilbao.languages.models.Language;
import com.nbilbao.languages.services.LanguageService;
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
public class LanguagesController {

    private final LanguageService languageService;

    public LanguagesController(LanguageService languageService){
        this.languageService = languageService;
    }

    @RequestMapping("/languages")
    public String index(Model model) {
        List<Language> languages = languageService.allLanguages();
        model.addAttribute("languages", languages);
        return "index.jsp";
    }
    @RequestMapping("/languages/new")
    public String newBook(@ModelAttribute("language") Language language) {
        return "/new.jsp";
    }
    @RequestMapping(value="/languages", method= RequestMethod.POST)
    public String create(@Valid @ModelAttribute("language") Language language, BindingResult result) {
        if (result.hasErrors()) {
            return "/new.jsp";
        } else {

            languageService.createLanguage(language);
            return "redirect:/languages";
        }
    }

    @RequestMapping("/languages/{id}/edit")
    public String edit(@PathVariable("id") Long id, Model model) {
        Language language = languageService.findLanguage(id);
        model.addAttribute("language", language);
        return "/edit.jsp";
    }

    @RequestMapping(value="/languages/{id}", method=RequestMethod.PUT)
    public String update(@Valid @ModelAttribute("language") Language language, BindingResult result) {
        if (result.hasErrors()) {
            return "/edit.jsp";
        } else {
            languageService.updateLanguage(language);
            return "redirect:/languages";
        }
    }



    //Otros métodos removidos para resumir.
    @RequestMapping(value="/languages/{id}", method=RequestMethod.GET)
    public String destroy(@PathVariable("id") Long id) {
        languageService.deleteBook(id);
        return "redirect:/languages";
    }



}
