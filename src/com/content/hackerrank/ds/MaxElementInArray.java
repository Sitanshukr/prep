package com.content.hackerrank.ds;

public class MaxElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] arr= {34, 56, 12, 32, 89, 54, 23};
		int max=0;
		for(int i=0; i<arr.length;i++) {
			
			if(arr[i]> max) {
				max=arr[i];
			}
		}
		
		System.out.println("Max Element in an array is "+max );
	}

}
