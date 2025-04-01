package com.content.java.core.oops;

public class HP implements Computer{
    @Override
    public void display() {
        System.out.println("Hi, This is HP");
    }

    @Override
    public String giveName() {
        return "HP";
    }
}
