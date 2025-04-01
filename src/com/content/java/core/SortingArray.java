package com.content.java.core;

public class SortingArray <T extends Comparable>  {
    public static void main(String[] args) {
        Employee e1 = new Employee(23,"Aditya");
        Employee e2 = new Employee(13,"Akshay");
        Employee e3 = new Employee(43,"Vikas");
        Employee e4 = new Employee(10,"Simank");
        Employee e5 = new Employee(73,"Ritesh");

        Employee[] employeeArr = {e1,e2,e3,e4,e5};

        SortingArray sortingArray  = new SortingArray();
        sortingArray.sorting(employeeArr);
        sortingArray.print(employeeArr);
    }


        public void sorting(T[] array){
            int length = array.length;
            for (int i =0 ; i<length;i++){
                for (int j = 0 ; j<length-1;j++){
                   if(array[j].compareTo(array[j+1])>0){
                       swap(array,j,j+1);
                   }
                }
            }

    }

    private T[] swap (T[] array, int i , int j){
//        T temp;
        T temp = array[i];
        array[i]=array[j];
        array[j]= temp;
        return array;
    }

    private void print(T[] arr){
        for (int i = 0 ;i<arr.length;i++){
            System.out.println(arr[i].toString());
        }

    }


}
