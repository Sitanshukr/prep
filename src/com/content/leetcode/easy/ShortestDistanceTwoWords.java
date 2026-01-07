package com.content.leetcode.easy;

public class ShortestDistanceTwoWords {

     int shortestDistance(String[] word, String word1, String word2){

         int postion1=-1;
         int position2=-1;
         int shortestDistance=0;

         for(int i=0;i<word.length;i++){
             if (word[i]==word1){
                 postion1 = 0;
             }
             if(word[i]==word2){
                 position2=i;
             }
         }

        return 0;
    }
}
