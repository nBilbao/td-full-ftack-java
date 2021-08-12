package com.nbilbao.relationships.controllers;

import com.nbilbao.relationships.models.License;
import com.nbilbao.relationships.models.Person;
import com.nbilbao.relationships.services.LicenseService;
import com.nbilbao.relationships.services.PersonService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.List;

@Controller
public class LicenseController {

    private final LicenseService licenseService;


    public LicenseController(LicenseService licenseService){
        this.licenseService = licenseService;
    }

    @RequestMapping("/licenses")
    public String index(Model model) {
        List<License> licenses = licenseService.allLicense();
        model.addAttribute("licenses", licenses);
        return "/index-license.jsp";
    }

    @RequestMapping("/licenses/new")
    public String newLicense(@ModelAttribute("license") License license) {
        return "/new-license.jsp";
    }
    @RequestMapping(value="/licenses", method= RequestMethod.POST)
    public String create(@Valid @ModelAttribute("license") License license, BindingResult result) {
        if (result.hasErrors()) {
            return "/new-license.jsp";
        } else {
            licenseService.createLicense(license);
            return "redirect:/licenses";
        }
    }





}
