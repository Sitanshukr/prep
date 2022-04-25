package com.content.java.exception;

public class StatmentInthemiddleofTryCatch {
// there cannot be any statement b/w try, catch and finally-> compile time error
    //beacuse they are one unit block of execution.
    public static void main(String[] args){

        try{
            System.out.println("Statement inside Try");
        }
        //System.out.println("Statement just outside try");
        catch(Exception e){

            e.getStackTrace();
        }
        //System.out.println("Statement just outside catch);
        finally {
            System.out.println("Statement just outside try");
        }


    }
}
