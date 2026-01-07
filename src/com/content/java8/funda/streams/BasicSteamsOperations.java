package com.content.java8.funda.streams;

import com.content.java.core.oops.comparison.MyComparator;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BasicSteamsOperations {

    static List <Integer> integerList= Arrays.asList(10,75,24,31,7,2,6,894,66,75,88,894,24,98);

    static List<List<Integer>> listofIntegerLists=Arrays.asList(Arrays.asList(45,32,56,67,34),
            Arrays.asList(13,42,45,56,89),Arrays.asList(90,13,88,56));
    static HashMap<String, Integer> fruitMap1 = new HashMap(){{
        put("Mango",200);
        put("Orange",100);
        put("Apple",150);
        put("Kiwi",180);
    }
    };

    static HashMap<String, Integer> fruitMap2 = new HashMap(){{
        put("Grapes",250);
        put("Watermelon",80);
        put("Bannana",150);
        put("Kiwi",189);
    }
    };

    static HashMap<HashMap<String, Integer>,String> fruitsMapOfFruits = new HashMap<HashMap<String,Integer>,String>(){{
        put(fruitMap1,"UP");
        put(fruitMap2,"Karnatka");
    }};


    public static void main(String[] args) {
        //Filter Operation
        //1. Filter even numbers
        System.out.println(integerList.stream().filter(i->i%2==0).collect(Collectors.toList()));

        //Map Operation
        //1.Multiply all numbers with 4 in list
        System.out.println(integerList.stream().map(element->element*2).collect(Collectors.toList()));

        //limit Operation
        //1.Process first 5 elements in the list
        System.out.println(integerList.stream().limit(5).collect(Collectors.toList()));

        //distinct Operation
        //1.Remove duplicate element from list
        System.out.println(integerList.stream().distinct().collect(Collectors.toList()));

        //skip Operation
        //1.Process elements after 4
        System.out.println(integerList.stream().skip(4).collect(Collectors.toList()));

        //peek Operation
        //1. Debug integer stream
        System.out.println(integerList.stream().peek(n-> System.out.println("Before Map " +n))
                .map(n->n*3).peek(n->System.out.println("After Map Operation " +n)).collect(Collectors.toList()));

        //flatMap Operation
        //1. Perform multiplication of all elements by 7 of listofIntegerLists and then remove dulicates
        System.out.println(listofIntegerLists.stream().flatMap(List::stream).map(n->n*7).distinct().collect(Collectors.toList()));
        //---------------------
        System.out.println(fruitMap1.entrySet().stream().filter(n->n.getValue()>150).collect(Collectors.toList()));

        //Get all fruits from Karnatka , and price >100

        System.out.println(fruitsMapOfFruits.entrySet().stream().peek(h-> System.out.println("Pre " +h.getKey().entrySet().stream())));

        //sort list in reverse order
        System.out.println( integerList.stream().sorted((a, b)->new MyComparator().compare(a,b)).collect(Collectors.toList()));

        }
    }

