package com.content.hackerrank.ds;

import java.util.Arrays;

public class MultidimentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][][] arr3D= {
				{{23,34},{90,894}},
				{{45,56},{43,11}},
				{{67,34,21},{77,56}}
		};
		
		print2(arr3D);
	}

	static void print(int [][][] arr3D) {
		
		for(int i=0;i<arr3D.length;i++) {
			for(int j=0;j<arr3D[i].length;j++) {
				for(int k=0;k<arr3D[j].length;k++) {
					System.out.println(arr3D[i][j][k]);
					
				}
			}
		}
	}
	
	static void print2(int [][][] arr3D) {
		
		for(int[][] arr2D: arr3D) {
			for(int [] ar: arr2D) {
				System.out.println(Arrays.toString(ar));
			}
			
		}
	}
}
