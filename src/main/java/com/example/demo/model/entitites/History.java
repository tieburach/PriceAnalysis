package com.example.demo.model.entitites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;
import java.sql.Time;

@Entity
public class History {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long userid;
    private Date date;
    private Time time;
    private String categoryname;
    private Long categoryid;
    private String parameter;

    public Long getId() {
        return id;
    }

    public History() {
    }

    public void setId(Long id) {
        this.id = id;
    }



    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getCategoryname() {
        return categoryname;
    }

    public void setCategoryname(String categoryname) {
        this.categoryname = categoryname;
    }

    public Long getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(Long categoryid) {
        this.categoryid = categoryid;
    }

    public String getParameter() {
        return parameter;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    public History(Long userid, Date date, Time time, String categoryname, Long categoryid, String parameter) {
        this.userid = userid;
        this.date = date;
        this.time = time;
        this.categoryname = categoryname;

        this.categoryid = categoryid;
        this.parameter = parameter;
    }

}
