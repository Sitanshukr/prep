package com.content.java8.funda.Function;

import java.util.function.Function;

public class FunctionEg {

    //WAF which takes string input and return length of the string

    Function<String , Integer> f1 = str->{return str.length();};
    Function<Student,String> f2= s->s.grade;
    Function<Integer,Integer> f3=i->i*i;

    public static void main(String[] args) {
        System.out.println(new FunctionEg().f1.apply("Positon"));
        System.out.println(new FunctionEg().f1.andThen(new FunctionEg().f3).apply("text"));

        Student s1 = new Student(2, "Samual", "A");
        Student s2 = new Student(2, "Ras", "B");
        Student s3 = new Student(2, "dwane", "B");
        Student s4 = new Student(2, "Floyd", "A");

        System.out.println(new FunctionEg().f2.apply(s1));
        System.out.println(new FunctionEg().f2.apply(s2));
        System.out.println(new FunctionEg().f2.apply(s3));
        System.out.println(new FunctionEg().f2.apply(s4));

    }
}
