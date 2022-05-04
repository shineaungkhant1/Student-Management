package com.jdc.onestop.students.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Entity
@Getter
@Setter
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String userName;
    private String password;
    private int activated;
    private Date registerDate;
    private Date retireDate;

}
