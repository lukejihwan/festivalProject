package com.edu.festivalproject.controller;

import com.edu.festivalproject.model.entity.AdminEntity;
import com.edu.festivalproject.model.service.AdminService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RestController {
    
    Logger logger= LoggerFactory.getLogger(this.getClass());

    @Autowired
    private AdminService adminService;
    
    @ResponseBody
    @GetMapping("/rest/getid")
    public AdminEntity getId(){
        logger.info("Rest컨트롤러 동작");

        AdminEntity adminEntity =adminService.selectId("admin","12");

        return adminEntity;
    }

    public function getPassword(){
        BufferedReader br = new BufferedReader();
    }
}
