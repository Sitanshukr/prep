package com.content.java.core.oops.polymorphism;

public class Dogs extends Animal {

	@Override
	public String Owner(){
		return "boy";
	}

	public String Owner(String name){
		return "This Pet belongs to :: " + name;
	}

	public int add(int a, int b){
		return a+b;
	}
	public int add(int a, int b, int c){
		return a+b+c;
	}

	public double add(int a, double b, int c){
		return a+b+c;
	}

	public double add(double a, double b){
		return  a+b;
	}


}
