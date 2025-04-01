package com.content.java.core;

import java.lang.reflect.Constructor;

public class Xyz {
    private Xyz() {
        System.out.println("MyClass constructor called!");
    }

    public void sayHello() {
        System.out.println("Hello from MyClass!");
    }

    public static void main(String[] args) {
        try {
            // Obtain Class object of MyClass
            Class<?> clazz = Class.forName("Xyz");

            // Get the constructor of the class (no parameters)
            Constructor<?> constructor = clazz.getDeclaredConstructor();
            constructor.setAccessible(true);
            // Create a new instance using the constructor
            Xyz obj = (Xyz) constructor.newInstance();

            // Call method using reflection
            obj.sayHello();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}