package com.edu.festivalproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminController {

    @RequestMapping(value = "/admin")
    public String getAdminLoginMain(){
        //이 컨트롤러가 static은 접근 못하고 templates폴더만 접근 가능함
        return "adminMain";
    }

    @RequestMapping(value = "/admin/page")
    public String getAdminMain(){
        return "adminPage/index";
    }
}
