package com.example.demo.model.entitites;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Auction {

    @Id
    private Long id;
    private Float price;
    private String firstparametername;
    private Float firstparametervalue;
    private String firstparameterunit;
    private String secondparametername;
    private Float secondparametervalue;
    private String secondparameterunit;
    private String name;

    public Auction(Long id, Float price, String firstparametername, Float firstparametervalue, String firstparameterunit, String name) {
        this.id = id;
        this.price = price;
        this.firstparametername = firstparametername;
        this.firstparametervalue = firstparametervalue;
        this.firstparameterunit = firstparameterunit;
        this.name = name;
    }

    public Auction() {
    }

    public Auction(Long id, Float price, String firstparametername, Float firstparametervalue, String firstparameterunit, String secondparametername, Float secondparametervalue, String secondparameterunit, String name) {
        this.id = id;
        this.price = price;
        this.firstparametername = firstparametername;
        this.firstparametervalue = firstparametervalue;
        this.firstparameterunit = firstparameterunit;
        this.secondparametername = secondparametername;
        this.secondparametervalue = secondparametervalue;
        this.secondparameterunit = secondparameterunit;
        this.name = name;
    }

    public Auction(Long id, Float price, Float firstparametervalue, Float secondparametervalue, String name) {
        this.id = id;
        this.firstparametervalue = firstparametervalue;
        this.secondparametervalue = secondparametervalue;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Auction{" +

                "id=" + id +
                ", price=" + price +
                ", firstparametername='" + firstparametername + '\'' +
                ", firstparametervalue=" + firstparametervalue +
                ", firstparameterunit='" + firstparameterunit + '\'' +
                ", secondparametername='" + secondparametername + '\'' +
                ", secondparametervalue=" + secondparametervalue +
                ", secondparameterunit='" + secondparameterunit + '\'' +
                '}';
    }
}
