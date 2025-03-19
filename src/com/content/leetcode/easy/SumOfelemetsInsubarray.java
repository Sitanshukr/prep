package com.content.leetcode.easy;


import java.util.Arrays;

public class SumOfelemetsInsubarray {

    public static void main(String[] args) {
        int [] arr = {23,34,12,45,55,67,78,1,78};
        System.out.println("Sum of SubArray : " + SumOfelemetsInsubarray.sumOfElements(arr,3,7) );
        System.out.println("Prefix sum array : " + Arrays.toString(SumOfelemetsInsubarray.prefixsumArray(arr)));
        System.out.println("Sum of subarray by prefix sum : " + SumOfelemetsInsubarray.sumOfElementsByPrefixSum(arr,3,7));
    }

    // This approach is time expensive as O(m*n), if there are n subarray
    private static int sumOfElements(int [] arr, int i , int j){
        int subArraySum = 0;
        for (int k=i; k<=j;k++){
            subArraySum += arr[k];
        }
        return  subArraySum;
    }

    private static int[] prefixsumArray(int [] arr){
        int [] prefixSumArr = new int[arr.length];
        for(int s =0; s<arr.length; s++){
            if (s==0){
                prefixSumArr[s] = arr[s];
            }else{
                prefixSumArr[s] = prefixSumArr[s-1] + arr[s];
            }
        }
        return prefixSumArr;
    }

    private static int sumOfElementsByPrefixSum(int [] arr, int i , int j){
        int subArraySum = 0;
       int[] prefixSumArray= SumOfelemetsInsubarray.prefixsumArray(arr);
        subArraySum = prefixSumArray[j] - prefixSumArray[i-1];
        return  subArraySum;
    }


}
