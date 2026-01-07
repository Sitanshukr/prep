package com.content.leetcode.easy;

import java.util.Arrays;

public class MergeSortedArraysWiithoutThirdArray {
    //method to merge two sorted arrays as without taking third array
        int [] merge(int[] arr1, int[] arr2){
            int j = 0;
            int k=0;
            for (int i=j;i<arr1.length;i++){
                while(arr1[j]<=arr2[k]){
                    j++;
                }
                int temp = arr1[j];
                if(j+1<arr1.length){
                    arr1[j+1]=arr1[j];
                    arr1[j]=arr2[k];
                    k++;
                }
                //merging of last element from smaller array and breaking loop as further iteration is not required
                if(j+1==arr1.length){
                    arr1[arr1.length-1]=arr2[k];
                    break;
                }
            }
            return arr1;
        }

    public static void main(String[] args) {
        int arr1[] = {1,2,3,0,0,0};
        int arr2[]={2,5,6};
        MergeSortedArraysWiithoutThirdArray mergeSortedArraysWiithoutThirdArray = new MergeSortedArraysWiithoutThirdArray();
        System.out.println("Input arrays :: " + Arrays.toString(arr1) + " and " + Arrays.toString(arr2));
        System.out.println("Merged Array :: " + Arrays.toString(mergeSortedArraysWiithoutThirdArray.merge(arr1,arr2)));
    }
}
