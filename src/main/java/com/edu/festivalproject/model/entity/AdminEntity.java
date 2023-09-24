package com.edu.festivalproject.model.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="admin")
@Data
public class AdminEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer adminpk;

    @Column(name = "admin_id")
    private String adminid;

    @Column(name = "admin_pw")
    private String adminpw;
}
