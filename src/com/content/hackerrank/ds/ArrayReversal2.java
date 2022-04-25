package com.content.hackerrank.ds;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayReversal2 {

    public static void main(String [] args){
        List<Integer> iplist=new ArrayList<>();
        iplist.add(23);
        iplist.add(34);
        iplist.add(45);

        System.out.println(reverse(iplist));
    }

    private static List<Integer> reverse(List<Integer> input){

        ListIterator <Integer> listIterator=input.listIterator(input.size());
        List<Integer> oplist=new ArrayList<>();
        while(listIterator.hasPrevious()){
            //System.out.println(listIterator.previous());
            oplist.add(listIterator.previous());
        }
        return  oplist;
    }
}
