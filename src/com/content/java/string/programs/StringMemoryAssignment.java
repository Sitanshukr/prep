package com.content.java.string.programs;

public class StringMemoryAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		a++;
		System.out.println("" + a);
		int b=a;
		
		String c= "Hello";
		System.out.println("" + c.hashCode());
		
		String d =new String("Hello");
		
		String e=c;
		
		e="hi";
		
		c=c.concat("eref");
		System.out.println("" + c);
		System.out.println("" + c.hashCode());
		
	//System.out.println("" + a);
	//System.out.println("" + b);
	//System.out.println("" + c.hashCode());
	//System.out.println("" + d.hashCode());
	//System.out.println("" + e);
	
	
		
	}

}
