package com.content.hackerrank.ds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Arrayreversal {

    public static void main(String[] args) {
        List <Integer> list=new ArrayList<Integer>();
        list.add(5);
        list.add(3);
        list.add(2);
        list.add(8);
        reverseArray(list);
    }

    //func to reverse an array
    //i/p- List<Interger>
    private static Object[] reverseArray(List <Integer> a){

        Object[] inputArr=a.toArray();
        Object[] tempArr=new Integer[inputArr.length];
        int counter=0;
        for(int index=inputArr.length-1;index>=0;index--){
            tempArr[counter]=inputArr[index];
            counter++;
        }
        for (Object item: tempArr
             ) {
            System.out.println(item);
        }
        return inputArr;
    }
}
