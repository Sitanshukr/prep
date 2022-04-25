package com.content.java.exception;

public class Trywithreturnstatement {

    public static void main (String[] args){
        System.out.println(getValue("Hello"));
    }

    private static int getValue(String input){

        try{
            if(input=="HI"){
                return 1;
            }

        }catch(Exception e){
            //return 0;
            e.getStackTrace();
        }

        return 0;
    }
}
