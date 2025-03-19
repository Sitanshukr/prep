package com.content.java.core.oops;

public class  SingleTon {
	private static final SingleTon singleTonobj= new SingleTon();
	private SingleTon() {
	}
	
	public static SingleTon getInstance() {
		if(singleTonobj ==null) {
		  return new SingleTon();
		}
		else {
			return singleTonobj;
		}
	}
}
