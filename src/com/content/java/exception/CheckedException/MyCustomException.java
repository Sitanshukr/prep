package com.content.java.exception.CheckedException;

public class MyCustomException extends Exception{
    public MyCustomException(String msg){
        super("hahahah" +msg);
    }
}
