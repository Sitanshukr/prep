package com.content.java.exception;

public class ControlReurningFinally {


    private static Boolean getvalue(String in){
        try {
            if (in == "hello") {
                System.out.println("Inside try block");
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
            //return false;
           // System.exit(0);
        }
        return false;
    }
    public static void main(String[] args) {

        System.out.println(getvalue("hello"));
       // getvalue("hello");

    }
}
