package com.content.hackerrank.ds;

import java.util.Arrays;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] arr= {34, 45, 67, 65, 21};
		swap(arr, 2 , 3);
		System.out.println(Arrays.toString(arr));
	 
		 
	}

	public static void swap(int [] arr, int index1, int index2) {
		int temp= arr[index1];
		arr[index1]=arr[index2];
		arr[index2]=temp;
	}
	
	public int[] swapp(int [] arr, int index1, int index2) {
		int temp= arr[index1];
		arr[index1]=arr[index2];
		arr[index2]=temp;
		return arr;
	}
}
