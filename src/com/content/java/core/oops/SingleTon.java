package com.content.java.core.oops;

public class SingleTon {
	
	private static SingleTon obj= new SingleTon();

	private SingleTon() {
		
	}
	
	public static SingleTon getInstance() {
		
		if(obj ==null) {
		  return new SingleTon();
		}
		else {
			return obj;
		}
	}
}
