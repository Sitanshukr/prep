package com.content.hackerrank.ds;

public class LinearSearchIn2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [][] arr= {{23,45,56},
				{98, 45, 22},
				{90, 11,74}};
		
		System.out.println(linearSearch(arr, 4556));
	}

	
	public static boolean linearSearch(int [][] arr, int target) {
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr[i].length;j++) {
				
				if(arr[i][j]==target) {
					
					return true;
				}
			}
			
		}
		return false;
		
	}
}
