package com.content.java8.funda.methodreference;

public class TestMethodRef {

    public static void main(String[] args) {
        I4 intref = new MethodRefeEg()::sum;
        intref.add(34,67);
    }



}
