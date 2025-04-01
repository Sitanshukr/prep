package com.content.java.string.programs;

public class StringComparisions {

    public static void main(String[] args) {
        String a1= "hello";
        String a2="hello";
        String a3=a1;
        a1="say";//this is called as immmutablility
        String a4= new String("hello");
        String a5=new String("hello");
        String a6=a4;
        int a= 40;
        int b =40;

        System.out.println(a3==a2);
        /*System.out.println(a2==a3);
        System.out.println(a1.equals(a3));

        System.out.println(a4==a1);
        System.out.println(a4.equals(a1));
        System.out.println(a6==a5);
        System.out.println(a6.equals(a5));

        System.out.println(a==b);*/
    }
}
