package com.content.java.exception.unchecked;

public class UnheckedExceptionEg {

    public static void main(String[] args) {
        int[] arr = {34, 56, 454, 345};
       try {
           for (int i = 0; i <= arr.length; i++) {
               System.out.println("Element at index " + i + " " + arr[i]);
           }
       }catch (Exception e){
           e.printStackTrace();
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

    public int divide(int dividend, int divisor) {
        try {
            return dividend / divisor;
        } catch (Exception a) {
            a.printStackTrace();
        }
        return 0;
    }
}
