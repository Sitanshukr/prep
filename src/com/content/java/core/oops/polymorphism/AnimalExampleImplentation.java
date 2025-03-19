package com.content.java.core.oops.polymorphism;

public class AnimalExampleImplentation {

    public static void main(String[] args) {
        Dogs a1 = new Dogs();
        System.out.println(a1.Owner());
        System.out.println(a1.Owner("Old Lady"));

        System.out.println(a1.add(34,43));
        System.out.println(a1.add(34,43,68));
        System.out.println(a1.add(65.34,4.5));

        Animal a2 = new Animal();
        a2.setName("Jumbo");
        System.out.println(a2.getName());
        a2.setName("Crocodile");
        System.out.println(a2.getName());
    }
}
