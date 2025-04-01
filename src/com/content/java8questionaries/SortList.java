package com.content.java8questionaries;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Sort list
 */
public class SortList {

    public void sortlistinreverse(List<String> inputlist){
       List<String> reverseSortedlist= inputlist.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

       for(String element : reverseSortedlist){
           System.out.println(element);
       }
    }

    public static void main(String[] args) {
        List<String> inputList = Arrays.asList("ge", "teer", "yere", "jt", "as");
        SortList sortList= new SortList();
        sortList.sortlistinreverse(inputList);
    }
}
