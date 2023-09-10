package com.edu.festivalproject.controller;

import com.edu.festivalproject.util.FestivalAPIManager;
import org.apache.catalina.connector.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;

@Controller
@RequestMapping("/")
public class FestivalController {

    @Autowired
    private FestivalAPIManager festivalAPIManager;

    @GetMapping("/")
    public String getFestivals(Model model){
        model.addAttribute("data","Hello Spring");
        return "main";
    }



    public String getFestival(Request request) throws IOException {
        festivalAPIManager.getfestival();
        return "";
    }

    public String UpdateFestival(Request request){

        return null;
    }
}
