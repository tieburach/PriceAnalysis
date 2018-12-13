package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Category {

    @Id
    private Long id;

    private String name;
    private Long parentid;

    protected Category(){}

    public Category(Long id, String name, Long parentid) {
        this.id = id;
        this.name = name;
        this.parentid = parentid;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", parentid=" + parentid +
                '}';
    }
}
