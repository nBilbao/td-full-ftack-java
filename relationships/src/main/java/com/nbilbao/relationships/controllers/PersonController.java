package com.nbilbao.relationships.controllers;

import com.nbilbao.relationships.models.Person;
import com.nbilbao.relationships.services.PersonService;
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
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }
    @RequestMapping("/persons")
    public String index(Model model) {
        List<Person> persons = personService.allPersons();
        model.addAttribute("persons", persons);
        return "/index.jsp";
    }

    @RequestMapping("/persons/new")
    public String newBook(@ModelAttribute("person") Person person) {
        return "/new-person.jsp";
    }
    @RequestMapping(value="/persons", method= RequestMethod.POST)
    public String create(@Valid @ModelAttribute("person") Person person, BindingResult result) {
        if (result.hasErrors()) {
            return "/new-person.jsp";
        } else {
            personService.createPerson(person);
            return "redirect:/persons";
        }
    }
    @RequestMapping("/persons/{id}")
    public String edit(@PathVariable("id") Long id, Model model) {
        Person person = personService.findPerson(id);
        model.addAttribute("person", person);
        return "/show.jsp";
    }

}
