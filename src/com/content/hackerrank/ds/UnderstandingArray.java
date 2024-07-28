package com.content.hackerrank.ds;

import java.util.Arrays;

public class UnderstandingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] a;  // Happens at Compile time .Since Array in java an Object it will be created in Stack with reference and to the value it which is created in Heap.
	    a= new int [5];// Happens at run time. Created space in heap memory and a holds reference of it.
	    System.out.println(a[2]);
	    //Note: if we don't initialize any internal element of an array then the default value of that data type is persisted.
	    //e.g in case of int -- 0
	    // String --null
	    //float -- 0.0
	   float [] f=new float[5];
	   System.out.println(f[3]);
	    
	    
	    int [] s =new int[5];
	    s[0]=12;
	    System.out.println(Arrays.toString(s));// Arrays Class has toString method that converts any type of array into String array.
	    
	    
	    //Arrays parsing in function
	    int[] r= {56,45,32,89,67,64};
	    System.out.println(Arrays.toString(r));
	    change(r);//reference is passed , arrays is an mutable object in java, where as String is immutable objects in java.
	    System.out.println(Arrays.toString(r));
	    
	}

	static void change(int [] arr) {
		arr[0]=43;
		
	}
}
