package ru.khamitprojects.demomyfirstprojects.persist.entity;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

   @Column(unique = true , nullable = false)
    private String username;

   @Column(nullable = false)
    private String password;
}
