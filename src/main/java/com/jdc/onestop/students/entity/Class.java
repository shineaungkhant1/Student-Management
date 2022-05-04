package com.jdc.onestop.students.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

@Entity
@Getter
@Setter
public class Class {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String classType;
    private Date startDate;
    private String months;
    private Time timeFrom;
    private Time timeTo;

    @ManyToOne
    private Course course;

    @OneToOne   
    private Employee employee;

}
