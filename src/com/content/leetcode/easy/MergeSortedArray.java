package com.content.leetcode.easy;

public class MergeSortedArray {

    public static void main(String[] args) {
        int nums1[] = {12, 16, 22, 25, 32, 37, 40, 52};
        int nums2[] = {10, 15, 27, 29, 35, 36, 47};
        int mergedArray[] = new int[nums1.length + nums2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        int m = nums1.length;
        int n = nums2.length;

        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                mergedArray[k] = nums1[i];
                i++;
            } else {
                mergedArray[k] = nums2[j];
                j++;
            }
            k++;
        }
        while (j < n) {
            mergedArray[k++] = nums2[j++];
        }
        while (i < m) {
            mergedArray[k++] = nums1[i++];
        }
        /*to merge this two arrays and place it in num1 arr
            i = 0, j=0 --> 12 < 10 false
            mergedArray[0] = 10
            i=0, j =1 --->12 < 15 true
            mergedArray[1] = 12
            i=1, j=1 ---16 < 15 false
            mergedArray[2] = 15
            i=1, j
         */

        for (int o=0; o<mergedArray.length;o++){
            System.out.println(mergedArray[o]);
        }

    }

}
