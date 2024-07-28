package com.content.leetcode.easy;

import java.util.Arrays;

public class E1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums1 = {1,2,3,0,0,0};
		int m = 3;
		int [] nums2 = {2,5,6};
		int n = 3;

		
		int [] resultarr =merge(nums1,m,nums2,n);
		
		for(int i=0;i<resultarr.length;i++) {
			
			System.out.println(resultarr[i]);
		}
		
	}
	
public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        
        int [] arr= new int [m+n];
        int []arr1=new int[m];
        int []arr2=new int[n];

        for(int i=0;i < m;i++){
            if(nums1[i]>0){
            arr[i]=nums1[i];
            }else{
            break;
            }
        }
        
         for(int j=0;j<n;j++){
            if(nums2[j] > 0){
            arr[j+m]=nums2[j];
            }
        }

         Arrays.sort(arr);
         return arr;
   }
}