package com.content.java.core.oops;

public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Vehical object=new Car();
		object.drive();
		System.out.println(object.hashCode());
		Car c=(Car) object;
		c.getFuel();
		System.out.println(object.hashCode());
		*/

		Vehical object=new Bike();
		//object=new Bike();
		object.drive();
		System.out.println(object.hashCode());

	}

}
