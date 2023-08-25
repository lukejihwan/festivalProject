package com.edu.festivalproject.model.dao;

import com.edu.festivalproject.model.entity.AdminEntity;
import com.sun.xml.bind.v2.model.core.ID;

import java.util.Optional;

public interface AdminDAO {
    public AdminEntity selectAdminId(String id, String pw);

   long count();

   void delete();

   boolean existedById(ID primarykey);
}
