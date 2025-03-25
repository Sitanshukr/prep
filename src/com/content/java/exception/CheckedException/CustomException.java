package com.content.java.exception.CheckedException;

public class CustomException extends RuntimeException {

    public CustomException(String msg) {
        super(msg);
    }

    public static void main(String[] args) throws CustomException{
            int[] arr = {34, 56, 454, 345};
            for (int i = 0; i <= arr.length; i++) {
                System.out.println("Element at index " + i + " " + arr[i]);
            }
    }
    }
