package com.content.java.exception;

public class Trywithreturnstatement {

    public static void main (String[] args){
        System.out.println(getValue("HI"));
    }

    private static int getValue(String input){

        try{
            if(input=="HI"){
                return 1;
            }

        }catch(Exception e){
        	
            //return 3;
            e.printStackTrace();
        }

        return 0;
    }
}
