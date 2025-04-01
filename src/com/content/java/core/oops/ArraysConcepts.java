package com.content.java.core.oops;

public class ArraysConcepts {

   static int[] arr = {12,14,7,2,1,92,54,62,85,91,56,787,3434,6573,345};

    //Find element at index 5
    public static void main(String[] args) {

        for(int i=0; i<=arr.length-1;i++){
            if(i==5){
                System.out.println("Element at Index " + i +" = " + arr[i]);
                System.out.println(arr.length);
                break;
            }

        }

    }

}
