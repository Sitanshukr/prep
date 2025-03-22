package com.content.java.core.oops.comparison;

import java.util.Comparator;

public class MyComparator implements Comparator<Integer> {

    //this methods compare 2 objects and sort them into ascending order
    /*
    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1<o2){
            return -1;
        } else if (o1>o2) {
            return +1;
        }else{
            return 0;
        }
    }
    */

    @Override
    public int compare(Integer o1, Integer o2) {
       return  (o1<o2) ? -1 : (o1>o2)?1:0;
      }
    }
