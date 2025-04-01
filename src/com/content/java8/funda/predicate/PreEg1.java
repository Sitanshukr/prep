package com.content.java8.funda.predicate;

import java.util.function.Predicate;

// W a predicate if given nummber is greater than 5 or not
// W a predicate if given string lenght is greater than 8
public class PreEg1 {
    static Predicate<Integer> p1 = i-> i>5;
    static Predicate<String> p2 =str-> str.length()>5;
    public static void main(String[] args) {

        System.out.println(p1.test(2));
        System.out.println(p1.test(20));
        System.out.println(p2.test("NOCAP"));
        System.out.println(p2.test("Shut up and work"));


    }
}
