package com.example.miguel.tabby.Models;

public class Person {

    private String name, country;

    public Person(){}

    public Person(String name, String country){
        this.name =  name;
        this.country  = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
