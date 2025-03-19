package com.content.leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public static void main(String[] args) {
        int arr[] ={-1, 0, 1, 2, -1, -4};
        System.out.println(findTriplets(arr));
    }

   private static List<List> findTriplets(int [] arr){
        //Arrays.sort(arr);
        List<List> listOfList = new ArrayList<>();

        for (int i =0; i<arr.length;i++){

            int left = 1;
            int right = arr.length-1;

            while(left<right){
                if (arr[i]+arr[left]+arr[right]==0){
                List<Integer> list = new ArrayList<>();
                list.add(i);
                list.add(left);
                list.add(right);
                listOfList.add(list);
                }
                left++;
                right--;
            }
        }

        return listOfList;
    }
}
