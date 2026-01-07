package com.content.leetcode.easy;

public class Pallindrome {

    public static void main(String[] args) {
        String input = "A man, a plan, a canal, Panama!";
        System.out.println(isPalindrome(input));
    }

    private static Boolean isPalindrome(String input){
        String cleanString = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        char [] chars = cleanString.toCharArray();
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
