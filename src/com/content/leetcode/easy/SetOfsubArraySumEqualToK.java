package com.content.leetcode.easy;

import com.content.java.exception.StatmentInthemiddleofTryCatch;

import java.io.FileReader;
import java.nio.channels.InterruptedByTimeoutException;
import java.util.*;

public class SetOfsubArraySumEqualToK {
    public static void main(String[] args) {
        int arr [] = {3,4,4,3,2,3,1,1,3};
        int k = 8;
        //System.out.println(Arrays.toString(getPrefixSumArray(arr)));
        //System.out.println(getSumofSubArray(getPrefixSumArray(arr),2,7));
        System.out.println("List of SubArray equal to " + k +  findSetOfSubArray(arr,k));
    }

    private static int[] getPrefixSumArray(int [] arr){

        int [] prefixSumArr= new int[arr.length];
        for (int i =0 ;i< arr.length;i++){
            if(i==0){
                prefixSumArr[0]= arr[0];
            }else {
                prefixSumArr[i] = prefixSumArr[i-1]+ arr[i];
            }
        }
        return prefixSumArr;
    }

    private static int getSumofSubArray(int [] prefixSumSubArray, int i, int j){
     //sum[i,j] = sum[j] - sum[i-1]
        if(i>=1) {
            return prefixSumSubArray[j] - prefixSumSubArray[i - 1];
        }
        else return prefixSumSubArray[0];
    }

    private static List<Map> findSetOfSubArray(int [] arr, int k){
        int [] prefixsumArray = getPrefixSumArray(arr);
        List<Map> listOfSubArrays = new ArrayList<Map>();
        for (int i=0; i<arr.length;i++){
                for (int j=i;j<arr.length;j++){
                    if(getSumofSubArray(prefixsumArray,i,j)==k){
                        HashMap mapObj = new HashMap();
                        mapObj.put(i,j);
                        listOfSubArrays.add(mapObj);
                    }
                }
        }
        return listOfSubArrays;
    }
}
