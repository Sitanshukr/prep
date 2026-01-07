package com.content.java.Generics;

import javax.naming.Name;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Execute<T> {

    //T thingToExecute;
    //This method is generic type it means "thingToExecute" will accept any object type or collection object type
    public <T> void print(T thingToExecute){
        System.out.println(thingToExecute  + " started" );
    }
//this is wildcard method, it means that it will accept only List type object but it list can hold any type of object inside it
    public void display(List<?> list){
        System.out.println(list);
    }

    public static void main(String[] args) {
        Execute <Integer>e1 = new Execute<>();
        e1.print(34);

        Execute <String>e2 = new Execute<>();
        e2.print("Hello");

       List<String>listOfString=Arrays.asList("test","give","me","ticket","for","appraisal");
       Execute<List<String>> e3= new Execute<>();
       e3.display(listOfString);
       e3.print(listOfString);
       System.out.println( listOfString.stream().filter(name->name.length()>3).collect(Collectors.toList()));
    }
}
