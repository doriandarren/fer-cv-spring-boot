package com.devtalles.tu_cv_spring_boot.cv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * index -> lista
 * show -> ver uno
 * create -> cargar view para crear
 * store -> guardar
 * edit -> cargar view para editar
 * update -> actualizar
 * destroy -> eliminar
 */


@Controller
@RequestMapping("/skills")
public class SkillsController {

    private final List<String> skills = new ArrayList<>();


    @GetMapping
    public String index(Model model) {
        model.addAttribute("skills", skills);
        return "skills";
    }






}
