package com.content.java.core.oops;

public class TestTripolton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tripleton s1 =  Tripleton.getInstance();
        System.out.println(s1);
        System.out.println(Tripleton.getInstance());
        System.out.println(Tripleton.getInstance());
        System.out.println(Tripleton.getInstance());
        System.out.println(Tripleton.getInstance());
        System.out.println(Tripleton.getInstance());
        System.out.println(Tripleton.getInstance());
	}

}
