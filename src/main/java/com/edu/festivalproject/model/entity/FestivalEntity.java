package com.edu.festivalproject.model.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "festival")
@Data
public class FestivalEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer adminpk;

    @Column
    private String adminid;

    @Column
    private String adminpw;

}
