package com.devtalles.tu_cv_spring_boot.cv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping({"/", "/index", "/home"})
    public String index(Model model){

        // Agregamos el titulo y el contenido
        model.addAttribute("title", "Home");
        model.addAttribute("content", "index");

        return "layouts/main";
    }
}
