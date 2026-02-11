package com.devtalles.tu_cv_spring_boot.cv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.devtalles.tu_cv_spring_boot.cv.model.Person;


@Controller
@RequestMapping("/cv")
public class CvController {

    @GetMapping({"/index", "", "/"})
    public String index(Model model) {

        Person person = new Person("Gabriel", "Manu", "Developers");

        model.addAttribute("name", "Ga");

        model.addAttribute("person", person);

        return "index"; // retornamos el nombre de la vista
    }

    @GetMapping("/about")
    public String about() {
        return "about"; // retornamos el nombre de la vista
    }

}
