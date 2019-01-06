package com.example.demo.model.entitites;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Detailedauction {

    @Id
    private Long id;
    private String name;
    private Float price;
    private Long categoryid;
    private String categoryname;
    private String condition;
    private Integer photosamount;
    private String parametername;
    private Float parametervalue;
    private String parameterunit;
    private Long userid;

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Detailedauction{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", categoryid=" + categoryid +
                ", categoryname='" + categoryname + '\'' +
                ", condition='" + condition + '\'' +
                ", photosamount=" + photosamount +
                ", parametername='" + parametername + '\'' +
                ", parametervalue=" + parametervalue +
                ", parameterunit='" + parameterunit + '\'' +
                ", userid=" + userid +
                ", username='" + username + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public Float getPrice() {
        return price;
    }

    public Long getCategoryid() {
        return categoryid;
    }

    public String getCategoryname() {
        return categoryname;
    }

    public String getCondition() {
        return condition;
    }

    public Integer getPhotosamount() {
        return photosamount;
    }

    public String getParametername() {
        return parametername;
    }

    public Float getParametervalue() {
        return parametervalue;
    }

    public String getParameterunit() {
        return parameterunit;
    }

    public Long getUserid() {
        return userid;
    }

    public String getUsername() {
        return username;
    }

    public Detailedauction(Long id, String name, Float price, Long categoryid, String categoryname, String condition, Integer photosamount, String parametername, Float parametervalue, String parameterunit, Long userid, String username) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.categoryid = categoryid;
        this.categoryname = categoryname;
        this.condition = condition;
        this.photosamount = photosamount;
        this.parametername = parametername;
        this.parametervalue = parametervalue;
        this.parameterunit = parameterunit;
        this.userid = userid;
        this.username = username;

    }

    public Detailedauction() {

    }

    private String username;
}
