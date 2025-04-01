package com.content.java;

import com.content.java.core.oops.Student;

public class StudentExample {

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.setRollNo(34);
        s1.setFirstName("Aarav");
        s1.setDept("CS");

        s2.setFirstName("Aaditya");

        System.out.println(s1.getFirstName());
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

    }
}
