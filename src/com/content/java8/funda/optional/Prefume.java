package com.content.java8.funda.optional;

public class Prefume {

    String name;
    int price;
    String fragrance;

    Prefume(String name,int price, String fragrance){
        this.name=name;
        this.price=price;
        this.fragrance=fragrance;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getFragrance() {
        return fragrance;
    }
}
