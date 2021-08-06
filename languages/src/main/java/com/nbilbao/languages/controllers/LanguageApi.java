package com.nbilbao.languages.controllers;

import com.nbilbao.languages.models.Language;
import com.nbilbao.languages.services.LanguageService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class LanguageApi {
    private final LanguageService languageService;
    public LanguageApi(LanguageService languageService){
        this.languageService = languageService;
    }
    @RequestMapping("/api/languages")
    public List<Language> index() {
        return languageService.allLanguages();
    }

    @RequestMapping(value="/api/languages", method= RequestMethod.POST)
    public Language create(@RequestParam(value="name") String name, @RequestParam(value="creator") String creator, @RequestParam(value="currentVersion") String currentVersion) {
        Language language = new Language(name, creator, currentVersion);
        return languageService.createLanguage(language);
    }

    @RequestMapping("/api/languages/{id}")
    public Language show(@PathVariable("id") Long id) {
        Language language = languageService.findLanguage(id);
        return language;
    }
    //Otros métodos han sido removidos para resumir.
    @RequestMapping(value="/api/books/{id}", method=RequestMethod.PUT)
    public Language update(@PathVariable("id") Long id, @RequestParam(value="name") String name, @RequestParam(value="creator") String creator, @RequestParam(value="currentVersion") String currentVersion) {
        Language language = languageService.updateLanguage(id, name, creator, currentVersion);
        return language;
    }

    @RequestMapping(value="/api/books/{id}", method=RequestMethod.DELETE)
    public void destroy(@PathVariable("id") Long id) {
        languageService.deleteLanguage(id);
    }
}
