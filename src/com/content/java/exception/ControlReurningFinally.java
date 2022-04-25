package com.content.java.exception;

import java.io.EOFException;

public class ControlReurningFinally {


    private static Boolean getvalue(String in){
        try {
            if (in == "hello") {
                return true;
                //System.out.println("Inside try block");

            } else {
                return false;

            }
        }catch(Exception e){
            e.getStackTrace();
        }
        finally {
            //System.exit(0);
            System.out.println("Hi from finally block");
           // System.exit(0);
        }
        return false;
    }
    public static void main(String[] args) {

        System.out.println(getvalue("hello"));
       // getvalue("hello");

    }
}
