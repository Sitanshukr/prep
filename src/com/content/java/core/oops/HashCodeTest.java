package com.content.java.core.oops;

import java.util.Objects;

public class HashCodeTest {

	
	String name;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object obj1=10;
		Object obj2=10;
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj1.equals(obj2));
		System.out.println(Objects.hash(obj1));
		System.out.println(Objects.hash(obj2));
		System.out.println(Objects.hash(obj2,obj1));
	}
}
