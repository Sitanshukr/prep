package com.content.leetcode.easy;

public class Pallindrome {

    public static void main(String[] args) {
        String input = "abcdefdcba";
        System.out.println(isPalindrome(input));
    }

    private static Boolean isPalindrome(String input){
        char [] chars = input.toCharArray();
        int i =0;
        int j = chars.length-1;
        while (i<=j){
                if(chars[i]!=chars[j]){
                   return false;
                }
                i++;
                j--;
        }
         return true;
    }
}
