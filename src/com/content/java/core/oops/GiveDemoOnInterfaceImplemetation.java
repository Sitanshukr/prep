package com.content.java.core.oops;

public class GiveDemoOnInterfaceImplemetation {

    public static void main(String[] args) {
        Computer c1 = new Mac();
        System.out.println(c1.giveName());

        Computer c2=new HP();
        System.out.println(c2.giveName());

        Computer c3 = new Dell();
        System.out.println(c3.giveName());

    }
}
