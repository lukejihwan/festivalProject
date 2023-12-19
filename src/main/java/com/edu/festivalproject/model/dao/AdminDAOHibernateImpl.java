package com.edu.festivalproject.model.dao;

import com.edu.festivalproject.model.entity.AdminEntity;
import com.edu.festivalproject.model.service.AdminService;
import com.sun.xml.bind.v2.model.core.ID;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class AdminDAOHibernateImpl implements AdminDAO{
    @Autowired
    private EntityManager entityManager;
    @Autowired
    private AdminService adminService;

    public AdminDAOHibernateImpl(EntityManager entityManager, AdminService adminService) {
        this.entityManager = entityManager;
        this.adminService = adminService;
    }

    @Override
    public AdminEntity selectAdminId(String id, String pw) {
        Session session=entityManager.unwrap(Session.class);
        AdminEntity adminEntity=session.get(AdminEntity.class, 1);
        return adminEntity;
    }

    @Override
    public long count() {
        System.out.println();
        return 0;
    }

    @Override
    public void delete() {
        FestivalDto = new FestivalDto();
    }

    @Override
    public boolean existedById(ID primarykey) {
        return false;
    }

    private void getfestival(){}
}
