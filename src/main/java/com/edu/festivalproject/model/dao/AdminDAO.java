package com.edu.festivalproject.model.dao;

import com.edu.festivalproject.model.entity.AdminEntity;
import com.sun.xml.bind.v2.model.core.ID;

import java.util.Optional;

public interface AdminDAO {
    public AdminEntity selectAdminId(String id, String pw);
    punlic long count();
    punlic void delete();
    public void update();
    public
   boolean existedById(ID primarykey);
}
