package com.content.java.core.oops.comparison;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ExplainSecondSal {

    public static void main(String[] args) {
        ArrayList<Worker> wlist = new ArrayList<>();

        Worker w1=new Worker(23, "Hemant",20000);
        Worker w2=new Worker(43, "Riku",450000);
        Worker w3=new Worker(3, "dk",26430);
        Worker w4=new Worker(2, "yeste",290343);
        Worker w5=new Worker(78, "kir",60000);
        Worker w6=new Worker(93, "gerni",80000);



        wlist.add(w1);
        wlist.add(w2);
        wlist.add(w3);
        wlist.add(w4);
        wlist.add(w5);
        wlist.add(w6);

        Comparator<Worker> workerComparator = (w,ww)->(w.wSal < ww.wSal)?-1:(w.wSal > ww.wSal)?1:0;
        Collections.sort(wlist,workerComparator);
        System.out.println(wlist);
        System.out.println("Second highest sal Worker :: " + wlist.get(1));
    }

}
