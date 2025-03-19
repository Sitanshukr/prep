package com.content.leetcode.easy;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class RemoveDuplicateElementsFromArray {

    public static void main(String[] args) {
        int [] arr = {34,56,76,2,45,12,34,56};
        int k =0;
        int totalDuplicates=0;
       Map<Integer, Integer> map = findDuplicate(arr);
       for(Map.Entry entry :map.entrySet()){
           //System.out.println(entry.getKey() + " " + entry.getValue());
           if((Integer)entry.getValue()>1){
               totalDuplicates= totalDuplicates+1;
               k = removeElement(arr,(Integer) entry.getKey());
           }
       }

    for(int s=0;s<k-totalDuplicates;s++){
       System.out.println(arr[s]);
        }
    }

    public static Map<Integer,Integer> findDuplicate(int [] arr){
        int i =0;
        int j =arr.length-1;

        Map<Integer,Integer> map = new HashMap<>();
        while(i<arr.length){
            int count=0;
            if(map.containsKey(arr[i])){
                count = map.get(arr[i]);
            }
            map.put(arr[i],count+1);
            i++;
            j--;
        }
        return map;
    }

    private static int removeElement(int [] arr, int val){
        int i =0;
        int k =0;
        while(i<arr.length-1){
            if(arr[i]!=val){
               arr[k] = arr[i];
               k++;
               i++;
            }else{
                i++;
            }

        }
        return k;
    }
}
