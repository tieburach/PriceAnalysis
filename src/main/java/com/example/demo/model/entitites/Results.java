package com.example.demo.model.entitites;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Results {
    @Id
    private Long id;
    private Float price;

    public Results() {
    }

    public Results(Long id, Float price) {
        this.id = id;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Results{" +
                "id=" + id +
                ", price=" + price +
                '}';
    }

    public Float getPrice() {
        return price;
    }
}
