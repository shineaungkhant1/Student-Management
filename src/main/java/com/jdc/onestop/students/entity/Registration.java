package com.jdc.onestop.students.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Getter
@Setter
public class Registration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Date registDate;
    private String status;
    private int fees;
    private int discount;
    private int paid;

    @ManyToOne
    private Student student;

    @ManyToOne
    private Class aClass;
}
