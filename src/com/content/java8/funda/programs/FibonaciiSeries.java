package com.content.java8.funda.programs;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

//WAP to implement Fibonacii series using java 8
//0,1,1,2,3,5,8,13,21,34......
public class FibonaciiSeries {

    static  ArrayList<Integer> resultList = new ArrayList<>();
    static  Predicate<Integer> check0or1 = (i->i==0||i==1);

    //Using predefined Function Functional Interface
    static Function<Integer, List> fiboFunc =(n)->{
        for (int i=0;i<=n; i++) {
            if (check0or1.test(i)) {
                resultList.add(i);
            } else {
                resultList.add(resultList.get(i-1)+resultList.get(i-2)) ;
            }
        }
        return resultList;
    };

    //Converted conventional to Supplier
    static Supplier<List> supplier = () ->{
        for (int i=0;i<=10; i++) {
            if (i==0 || i ==1) {
                resultList.add(i);
            } else {
                resultList.add(resultList.get(i-1)+resultList.get(i-2)) ;
            }
        }
        return resultList;
    };

    //Conventional
    public List<Integer> getFibonacii() {
        for (int i=0;i<=10; i++) {
            if (i==0 || i ==1) {
                resultList.add(i);
            } else {
                resultList.add(resultList.get(i-1)+resultList.get(i-2)) ;
            }
        }
        return resultList;
    }


    public static void main(String[] args) {
        //  FibonaciiSeries series = new FibonaciiSeries();
        //   System.out.println( series.getFibonacii());
        // System.out.println(  "Fibonacii Series " + supplier.get());
        System.out.println( "Fibonacii series from using function  "+ fiboFunc.apply(21));
    }
}
