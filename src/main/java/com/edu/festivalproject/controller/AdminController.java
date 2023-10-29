package com.edu.festivalproject.controller;

import com.edu.festivalproject.util.FestivalAPIManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

@Controller
public class AdminController {

    @RequestMapping(value = "/admin")
    public String getAdminLoginMain() throws IOException {
        //이 컨트롤러가 static은 접근 못하고 templates폴더만 접근 가능함
        //테스트를 위한 API호출
        FestivalAPIManager ap=new FestivalAPIManager();
        ap.getfestival();
        //===============================
        return "adminMain";
    }

    @RequestMapping(value = "/admin/page")
    public String getAdminMain() {

        ModelAndView mv = new ModelAndView();

        return "adminPage/index";
    }

}
