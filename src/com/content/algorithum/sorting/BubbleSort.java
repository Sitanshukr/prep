package com.content.algorithum.sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr= {64, 34, 25, 12, 22, 11, 90};
        bubbleSort(arr);
        print(arr);
    }
    


    private static void bubbleSort(int [] arr){
        for (int i =0; i<=arr.length;i++){
            for (int j =0 ;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                        swap(arr,j,j+1);
                }
            }

        }
    }

    private static int[] swap(int[] arr, int j , int k){
        int temp;
        temp = arr[j];
        arr[j] = arr[k];
        arr[k]= temp;
        return arr;
    }

    private static void print(int [] arr){
        for (int element : arr){
            System.out.println(element);
        }
    }
}
