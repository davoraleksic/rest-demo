package com.example.restdemo.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue
    @Setter(AccessLevel.PRIVATE)
    private Long id;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "nationality")
    private String nationality;

    @Column(name = "oib")
    private String oib;

    @Column(name = "yearOfBirth")
    private int yearOfBirth;

    private String password;

}
