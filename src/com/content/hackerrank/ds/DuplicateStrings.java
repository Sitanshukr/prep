package com.content.hackerrank.ds;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DuplicateStrings {
    public static void main(String[] args) {
        String str = "Hello , today is a very pleasant morning , this morning we must plan an activity so we can enjoy this morning";
        System.out.println(findDuplicatesInGivenString(str));
    }

    public static Map<String , Integer> findDuplicatesInGivenString(String sentence){
        Map<String, Integer > resultMap = new HashMap<String , Integer>();
        String [] strArr =  sentence.split(" ");
        if(strArr != null) {
            for (String word : strArr) {
                if (resultMap.get(word) == null) {
                    Integer count = 1;
                    resultMap.put(word, count);
                } else {
                    Integer count = resultMap.get(word);
                    Integer resultCount = count + 1;
                    resultMap.put(word, resultCount);
                }
            }

        }

        return resultMap;
    }
}
