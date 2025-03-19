package com.content.java.core.oops.cloning;

public class Person implements Cloneable{
    String name;
    Adress adress;

    public static void main(String[] args) throws CloneNotSupportedException {
        Person p1 =new Person();
        Adress adress = new Adress("patna");
        p1.name = "Atul";
        p1.adress=adress;

        Person p2 = (Person) p1.clone();

        System.out.println(p1.name);
        System.out.println(p2.name);
        System.out.println(p1.adress.city);
        System.out.println(p2.adress.city);

        p1.adress.city="Bangalore";
        System.out.println(p1.adress.city);
        System.out.println(p2.adress.city);
    }
}


