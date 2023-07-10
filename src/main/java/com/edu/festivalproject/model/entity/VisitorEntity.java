package com.edu.festivalproject.model.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "visitor")
@Data
public class VisitorEntity {

    @Id
    @GeneratedValue
    private Integer id;

    @Column
    private String adminid;

    @Column
    private String adminpw;
}
