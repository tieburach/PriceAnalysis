package com.example.demo.model;

public class Parameter {
    private int index;
    private String name;

    public int getIndex() {
        return index;
    }

    public String getName() {
        return name;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parameter(){
    }

    public Parameter(int index, String name) {
        this.index = index;
        this.name = name;
    }

    public Parameter(String name){
        this.name = name;
    }

    public Parameter(int index){
        this.index = index;
    }
}
