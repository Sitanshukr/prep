package com.content.java.core.oops;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class UseOfWrapperClass {

    List<String> listOfString= new ArrayList<>();
    List<Integer> listofInt= new ArrayList<>();

    public static void main(String[] args) {
        UseOfWrapperClass obj = new UseOfWrapperClass();
        obj.listOfString.add("Honda");
        obj.listOfString.add("Mercedez");
        obj.listOfString.add("BMW");

        obj.listofInt.add(34);
        obj.listofInt.add(64);
        obj.listofInt.add(37);
    }

    public void print(){
        System.out.println("kuch print kro");
    }
}
