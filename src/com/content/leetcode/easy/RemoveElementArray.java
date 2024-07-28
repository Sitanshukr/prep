package com.content.leetcode.easy;

import java.util.Arrays;

public class RemoveElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		int [] nums = {3,2,2,3};
		int val = 3 ;
		
		System.out.println(removeElement(nums,val));
		
	}

	
	public static int removeElement(int[] nums, int val) {
        
	       int arr[]= new int[nums.length];

	       for(int i=0;i < nums.length;i++){
	            if(nums[i]!=val){
	                arr[i]=nums[i];
	            }
	       }
	       
	       Arrays.sort(arr);
	       for(int i=0;i<arr.length;i++) {
	    	   System.out.println(arr[i]);
	       }
	       return arr.length;
	}
}
