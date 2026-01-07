package com.content.java.exception.CheckedException;

public class Humble {

    public static void validateAge (int age) throws MyCustomException {
        if(age<18){
            throw new MyCustomException("cannot vote as age is :: "+age);
        }
        System.out.println("Hejekle");

    }

    public static void main(String[] args) throws MyCustomException {
        Humble.validateAge(3);
    }

}
