package com.devtalles.tu_cv_spring_boot.cv.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.devtalles.tu_cv_spring_boot.cv.model.Skill;

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

//    private final List<Skill> skills = new ArrayList<>();
    private final List<Skill> skills = new ArrayList<>(List.of(
        new Skill("java", "Avanzado"),
        new Skill("js", "Medio"),
        new Skill("css", "Basico"),
        new Skill("html", "Avanzado"),
        new Skill("python", "Basico"),
        new Skill("c++", "Avanzado"),
        new Skill("c", "Medio")
    ));



    @GetMapping
    public String index(
            @RequestParam(defaultValue = "", required = false) String filter,
            Model model
    ) {

        List<Skill> filteredSkills = skills.stream()
                .filter(skill -> skill.getName().toLowerCase().contains(filter.toLowerCase()))
                .toList();

        model.addAttribute("skills", filteredSkills);
        model.addAttribute("filter", filter);

        
        // Agregamos el titulo y el contenido
        model.addAttribute("title", "Habilidades");          // Carga el titulo
        model.addAttribute("content", "skills/index");  // Carga la Vista

        return "layouts/main";

        //return "skills";
    }


    @GetMapping("/id/{index}")
    public String show(
            @PathVariable int index,
            Model model
    ){

        if(index>=0 && index < skills.size()){
            Skill skill = skills.get(index);
            model.addAttribute("skill", skill);

            // Agregamos el titulo y el contenido
            model.addAttribute("title", "Show Skill");
            model.addAttribute("content", "skills/show");

            return "layouts/main";
            //return "show-skill";
        }

        return "redirect:/skills";
    }


    @GetMapping("/filter/{name}/{level}")
    public String showFilteredSkill(
            @PathVariable String name,
            @PathVariable String level,
            Model model
    ){

        List<Skill> filteredSkills = skills.stream()
                .filter(skill -> skill.getName().equalsIgnoreCase(name)
                && skill.getLevel().equalsIgnoreCase(level)
                )
                .toList();


        model.addAttribute("skills", filteredSkills);
        model.addAttribute("filterMessage", "Filtro" + name + " - " + level);

        return "skills/index";
    }


    @GetMapping("/name/{name}")
    public String showFilteredSkill(
            @PathVariable String name,
            Model model
    ){

        List<Skill> filteredSkills = skills.stream()
                .filter(skill -> skill.getName().equalsIgnoreCase(name))
                .toList();


        model.addAttribute("skills", filteredSkills);
        model.addAttribute("filterMessage", "Filtro" + name);

        return "skills/index";
    }





    @GetMapping("/create")
    public String create(Model model){
        model.addAttribute("skill", new Skill());

        // Agregamos el titulo y el contenido
        model.addAttribute("title", "Create Skill");
        model.addAttribute("content", "skills/create");

        return "layouts/main";
    }


    @PostMapping("/store")
    public String store(@ModelAttribute Skill skill){
        skills.add(skill);
        return "redirect:/skills";
    }


}
