package com.content.java.core.oops;

public class Dell implements Computer{

    @Override
    public void display() {
        System.out.println("DELL Computers");
    }

    @Override
    public String giveName() {
        return "DELL";
    }
}
