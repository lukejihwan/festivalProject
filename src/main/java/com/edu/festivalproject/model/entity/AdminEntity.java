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

    @Column
    private String adminid;

    @Column
    private String adminpw;
}
