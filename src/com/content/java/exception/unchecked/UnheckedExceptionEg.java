package com.content.java.exception.unchecked;

import java.awt.event.HierarchyBoundsAdapter;

public class UnheckedExceptionEg {

    public static void main(String[] args) {
        int [] arr = {34,56,34,345};
        try {
            for (int i = 0; i <= arr.length; i++) {
                System.out.println("Element at index " + i + " " + arr[i]);
            }
        }catch (ArrayIndexOutOfBoundsException w){
            System.out.println("Invalid index , pls check code" + w.getMessage());
        }
        UnheckedExceptionEg obj = new UnheckedExceptionEg();
           System.out.println("Hi from try");
            System.out.println(obj.divide(30, 0));
            System.out.println("Bye from try");
            System.out.println(obj.divide(30, 10));
        System.out.println(obj.divide(45, 10));
        System.out.println(obj.divide(23, 10));
        System.out.println(obj.divide(4546544, 100));

            System.out.println("hello from finally block");
        System.out.println("my program is completed");
    }

    public int divide(int dividend , int divisor){
        try {
            return dividend / divisor;
        }catch (ArithmeticException e){
            System.out.println(divisor + " " + "is not valid divsor");
        }
        return 0;
    }

}
