package com.example.userservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUser;

    @Column(name="name")
    private String name;

    @Column(name ="email")
    private String email;

    @Column(name="password")
    private String password;

    @Column(name="male")
    private int male;

    @Column(name="dob")
    private Date dob;

    @Column(name="phonenumber")
    private int phonenumber;

    @Column(name="address")
    private String address;





}
