package com.content.java8.funda.defaultMethods;

public interface I1 {

    void m2();
    void m3();
    default String m1() {
        return "Hello from I1 default m1 method";
    }

    public static void m4(){
        System.out.println("Hello from I1 static m4 method");
    }
}
