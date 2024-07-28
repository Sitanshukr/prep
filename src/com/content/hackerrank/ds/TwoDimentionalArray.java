package com.content.hackerrank.ds;

import java.util.Scanner;

public class TwoDimentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//int [][] arr2D=new int[3][];
		
		int [][] arr2D= {{23,45,34,3},{76,56},{4,8,76}};
		print(arr2D);
		
		
		/*Scanner in =new Scanner(System.in);
		
		for(int row=0;row<arr2D.length; row ++) {
			for(int col=0;col<2;col++) {
				arr2D[row][col]=in.nextInt();
			}
		}
				
			print(arr2D);	
				
	}*/
	
	
}
	static void print(int [][] arr2D) {
		
        for(int row=0;row<arr2D.length; row ++) {
			for(int col=0;col<arr2D[row].length;col++) {
				System.out.println(arr2D[row][col]);
			}
		}
	}
}