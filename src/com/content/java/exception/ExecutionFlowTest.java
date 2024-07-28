package com.content.java.exception;


// This class is for testing the execution flow of program when exception is not handled properly
public class ExecutionFlowTest {

	public static void main(String[] args) {
		
		int a=10;
		int b=0;
		divide(a,b);
		System.out.println("After Performing Division Operation");

	}

	
	private static void divide(int a, int b) {
		
		
		int c = a/b;
		System.out.println("Result is --  "+ c);
	}
	
	
}
