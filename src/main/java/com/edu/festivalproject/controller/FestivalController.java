package com.edu.festivalproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class FestivalController {

    @GetMapping("/")
    public String getFestivals(Model model){
        model.addAttribute("data","Hello Spring");
        return "main";
    }



    public String getFestival(){

        return null;
    }

    public String UpdateFestival(){

        return null;
    }
}
