package com.content.hackerrank.ds;

import java.util.Arrays;

public class ReverseAnArray {

	public static void main(String[] args) {
		int [] arr= {45,23,67,54, 97, 22,41};
		int start=0;
		int end=arr.length-1;

		while(start<end) {
			swap(arr,start, end);
			start=start+1;
			end=end-1;
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public static void swap(int [] arr, int index1, int index2) {
		int temp=arr[index1];
		arr[index1]=arr[index2];
		arr[index2]=temp;
	}

}
