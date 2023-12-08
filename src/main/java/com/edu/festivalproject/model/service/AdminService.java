package com.edu.festivalproject.model.service;

import com.edu.festivalproject.model.entity.AdminEntity;

public interface AdminService {
    public AdminEntity selectId(String id, String pw);
    public AdminEntity select();
}
