package com.jdc.onestop.students.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String phone;
    private String gmail;

    @ManyToOne
    private Account account;

}
