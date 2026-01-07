package com.content.leetcode.easy;

import sun.jvm.hotspot.ui.tree.BooleanTreeNodeAdapter;

import java.util.HashMap;
import java.util.Map;

//Given two strings are anagram if other string is formed by using first string exactly once
public class Anagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("hello","world"));
    }

    static boolean isAnagram(String first, String second){
        char [] firstCharArray = first.toCharArray();
        char [] secondCharArray = second.toCharArray();
        Map<Character, Integer> firstCountMap = new HashMap<Character,Integer>();
        for (char c: firstCharArray){
                if(firstCountMap.get(c)!=null && firstCountMap.get(c)>0){
                    return false;
                }else {
                    firstCountMap.put(c,1);
                }
        }

        for (int i =0;i<secondCharArray.length;i++){
            if(firstCountMap.get(secondCharArray[i])==null || firstCountMap.get(secondCharArray[i])!=1){
                return false;
            }
        }
        return true;
    }
    static boolean isAnnagramm(String s,  String t){
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character, Integer> countHashMap = new HashMap<>();
        for (int i=0;i<s.length();i++){
            countHashMap.put(s.charAt(i),countHashMap.getOrDefault(s.charAt(i),0)+1);
            countHashMap.put(t.charAt(i),countHashMap.getOrDefault(t.charAt(i),0)-1);
        }
        for (char ch:countHashMap.keySet()){
            if(countHashMap.get(ch)!=0){
                return false;
            }
        }
        return true;
    }
}
