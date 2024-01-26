package com.edu.festivalproject.model.service;

import com.edu.festivalproject.model.dao.AdminDAO;
import com.edu.festivalproject.model.entity.AdminEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService{
    
    Logger logger= LoggerFactory.getLogger(this.getClass());
    
    @Autowired
    private AdminDAO adminDAO;
    
    @Override
    public AdminEntity selectId(String id, String pw) {
        logger.debug("adminService 클래스 호출");
        AdminEntity adminEntity =adminDAO.selectAdminId(id, pw);
        return adminEntity;
    }

    public void store(){}

    private void delete(){}
}
