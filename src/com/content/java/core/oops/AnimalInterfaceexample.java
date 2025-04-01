package com.content.java.core.oops;

import com.content.java.core.Animal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AnimalInterfaceexample {

    public static void main(String[] args) {
        Animal a1 = new Lion();
        Animal a2 = new Elephant();

        System.out.println(a1.sound());
        System.out.println(a2.sound());

        ArrayList<String> list = new ArrayList<>();
        list.add("zTst");
        list.add("erer");

        LinkedList<String> llist = new LinkedList<>();
        llist.add("");
    }
}
