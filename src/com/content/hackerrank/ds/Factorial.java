package com.content.hackerrank.ds;

import com.content.java.exception.StatmentInthemiddleofTryCatch;

public class Factorial {

    //WAF which will accept an integer value and return its factorial

   // 5!= 5*4*3*2*1
    //Recurrsion
    public static int factorial(int input){
        if(input==0){
            return 0;
        }else{
             return input * factorial(input-1);
        }
    }

    public static void main(String[] args) {
        System.out.println("Factorial of given Number is :: " +Factorial.factorial(4));
        System.out.println("Factorial of given Number is :: " +Factorial.factorial(5));
        System.out.println("Factorial of given Number is :: " +Factorial.factorial(6));
        System.out.println("Factorial of given Number is :: " +Factorial.factorial(7));
    }

}
