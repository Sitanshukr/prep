package com.content.java.exception;

public class NestedBlocks {

    public static void main(String[] args) {

        try{

            try{

            }finally {

            }
        }catch(Exception e){

            e.getStackTrace();
        }
    }
}
