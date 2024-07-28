package com.content.java.core.oops;

public class PassbyValuePassByReference {

    int a=30;

    public void add(int a){
        a=a+40;
    }

    public static void main(String[] args) {

        int a=10;
        int b=a;
        b=100;

        System.out.println(b);
        System.out.println(a);

        //int [] c={4,5,6};
        //int [] d=c;

       // int [] e={7,8,9};
       // int[] f= {7,8,9};

       // System.out.println(c);
        //System.out.println(d);

        //System.out.println(e);
        //System.out.println(f);

        PassbyValuePassByReference obj=new PassbyValuePassByReference();
        obj.add(10);
        System.out.println(obj.a);

    }
}
