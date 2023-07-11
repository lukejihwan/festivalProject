package com.edu.festivalproject.model.dao;

import com.edu.festivalproject.model.entity.AdminEntity;

public interface AdminDAO {
    public AdminEntity selectAdminId(String id, String pw);
}
