package com.content.algorithum.sorting;

import com.content.java.core.oops.*;


public class Test {

    public static void main(String[] args) {

        Vehical v1 = new Car();
        Vehical v2=new Bus();
        Vehical v3=new Bike();
        Vehical v4 = new Truck();

        v1.drive();
      v2.drive();
       v3.drive();
       v4.drive();

        ((Car)v1).getFuel();
    }
}
