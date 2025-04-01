package com.content.java.core.oops;


public class StudentMain {

    public static void main(String[] args) {

        Student a1= new Student();
        a1.setRollNo(23);
        a1.setDept("computerscicece");
        a1.setFirstName("Kumar");

        Student d3=new Student();
        d3.setRollNo(23);
        d3.setDept("computerscicece");
        d3.setFirstName("Kumar");

Student r3 =new Student();
r3.setRollNo(45);
r3.setDept("computerscicece");
r3.setFirstName("Kumar");


        if(a1.equals(d3)){
            System.out.println("Both a1 and d3 are equals");
        }else{
            System.out.println("Both are different");
        }

        System.out.println(a1.hashCode());
        System.out.println(d3.hashCode());
        System.out.println(r3.hashCode());
        }
    }

