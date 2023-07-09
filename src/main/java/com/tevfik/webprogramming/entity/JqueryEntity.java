package com.tevfik.webprogramming.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

//lombok
@Data
@NoArgsConstructor

//Entity
@Entity
@Table(name = "jquery")
public class JqueryEntity implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer id;

    @Column(name = "email")
    private String email;

    @Column(name = "name")
    private String name;

    @Column(name = "password", columnDefinition = "varchar(255) default '0000@'")
    private String passwd;
}