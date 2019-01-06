package com.example.demo.model.entitites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    public String getPassword() {
        return password;
    }

    public void setId(Long id) {

        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(String role) {
        this.role = role;
    }

    private String password;
    private String role;

    public Users(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public Users() {
    }

    public String getRole() {
        return role;
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }
}
