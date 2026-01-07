package com.content.java.exception;

public class StatmentInthemiddleofTryCatch {
// there cannot be any statement b/w try, catch and finally-> compile time error
    //beacuse they are one unit block of execution.
    public static void main(String[] args){

        try{
            System.out.println("Statement inside try");
            long q=10/0;
            System.out.println("q value"+q);
           // return;
        }
        //System.out.println("Statement just outside try");
        catch(Exception e){
//return;
            e.printStackTrace();
        }
        //System.out.println("Statement just outside catch");
        finally {
            System.out.println("Statement inside finally");
           //return;
        }
        
        //System.out.println("Staement below");


    }
}
