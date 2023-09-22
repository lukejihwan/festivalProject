package com.edu.festivalproject.model.dao;

import com.edu.festivalproject.model.entity.AdminEntity;
import com.sun.xml.bind.v2.model.core.ID;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class AdminDAOHibernateImpl implements AdminDAO{
    @Autowired
    private EntityManager entityManager;

    public AdminDAOHibernateImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
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

    }

    @Override
    public boolean existedById(ID primarykey) {
        return false;
    }
}
