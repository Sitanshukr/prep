package com.content.java8questionaries;

import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**demonstration of Collectors.partioningby() which partions stream into two groups based on a given predicate
 * true key contains set of values that satifies the predicate condition
 * false key contains set of values that does not satifies the predicate conditons
 *
 * It returns Map<Boolean List<T>>
 *
 */
//WAP which seperates odd and Even Integers
public class Partitioningby {


    public void sperateOddEven(List <Integer> listofInt){
      Map<Boolean , List<Integer>> seperatedMap= listofInt.stream().collect(Collectors.partitioningBy(n->n%2==0));

      //forEach(seperatedMap.entrySet()->System.out.println(seperatedMap.entrySet()));
        for (Map.Entry<Boolean , List<Integer>> entry:seperatedMap.entrySet()){
            System.out.println(entry.getKey() + "" + entry.getValue());

        }

    }

    public static void main(String[] args) {
        List<Integer> listofInt = Arrays.asList(23,454);

        Partitioningby partitioningby= new Partitioningby();
        partitioningby.sperateOddEven(listofInt);
    }
}
