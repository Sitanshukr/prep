package com.content.java.core.oops.comparison;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparisonExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(23);
        list.add(7);
        list.add(22);
        list.add(90);
        list.add(42);
        list.add(84);
        System.out.println("Before Sorting :: " + list);
       // Collections.sort(list,new MyComparator());
        Comparator<Integer> c = ( o1,o2) -> (o1<o2) ? -1 : (o1>o2)?1:0;
        Collections.sort(list,c);
        //System.out.println("After Sorting :: " + list);
        list.stream().forEach(System.out::println);


    }

}
