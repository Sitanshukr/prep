package com.content.java.core.oops;

public class TestSingleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleTon singleTon1= SingleTon.getInstance();
		SingleTon singleTon2= SingleTon.getInstance();

		if(singleTon1==singleTon2){
			System.out.println("Both objects are same");
		}

		

	}

}
