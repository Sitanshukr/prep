package com.content.algorithum.sorting;

import java.sql.SQLData;

public class QuickSort {

    public static void main(String[] args) {
        int [] arr= {43,2,12,32,44,10,9,95,89,62};
        quickSort(arr,0,arr.length-1);
        print(arr);
    }

    private static void quickSort(int [] arr, int low, int high){
        if (low<high) {
            int partitionIndex = partition(arr, low, high);
            quickSort(arr, low, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, high);
        }
    }

    private static int partition(int [] arr, int low, int high) {
            int pivot = arr[high];
            int i = low - 1;

            for (int j = low; j <= high; j++) {
                if (arr[j] < pivot) {
                    i++;
                    swap(arr, i, j);
                }
            }
            swap(arr, i + 1, high);
            return i + 1;
    }

    private static int[] swap(int [] arr, int i , int j){
        int temp;
        temp=arr[i];
        arr[i]= arr[j];
        arr[j]=temp;
        return arr;
    }
    private static void print(int [] arr){
        for(int element : arr){
            System.out.println(element);
        }
    }
}
