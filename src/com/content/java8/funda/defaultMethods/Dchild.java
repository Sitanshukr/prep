package com.content.java8.funda.defaultMethods;

public class Dchild implements I1,I2{
    @Override
    public void m2() {
        System.out.println("Hi from m2 Method");
    }

    @Override
    public void m3() {
        System.out.println("Hi from m3 Method");
    }

    public String m1(){
        return I2.super.m1();
    }


    public static void main(String[] args) {
        Dchild dchild = new Dchild();
        System.out.println(dchild.m1());
        dchild.m2();
        dchild.m3();
        I1.m4();// static method in interface must be called via Interface itself , its not available to child class or its object.
    }
}
