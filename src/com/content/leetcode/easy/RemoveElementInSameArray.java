package com.content.leetcode.easy;

import java.util.Arrays;

public class RemoveElementInSameArray {

    public static int[] removeElement(int[] arr, int val){
        int k =0;
        for (int i =0; i< arr.length; i++){
            if (arr[i]!=val){
                arr[k]=arr[i];
                k++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int [] nums = {0,1,2,2,3,0,4,2};

        int val = 2;
       int [] modifiedArray =removeElement(nums,val);
        System.out.println("ModfiedArray :: ");
       for (int m=0;m<5;m++){
           System.out.println(modifiedArray[m]);
       }
    }
}
