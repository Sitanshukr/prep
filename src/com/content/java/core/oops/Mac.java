package com.content.java.core.oops;

public class Mac implements Computer{

    @Override
    public void display() {
        System.out.println("Hey, Welcome to MAC");
    }

    @Override
    public String giveName() {
        return "APPLE";
    }
}
