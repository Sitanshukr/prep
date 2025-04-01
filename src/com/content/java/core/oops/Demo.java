package com.content.java.core.oops;

public class Demo {

    public static void main(String[] args) {
        Demo demo = new Demo();
        Demo demo2 = new Demo();

        if(demo==demo2){
            System.out.println("demo and demo2 are equal");
        }else{
            System.out.println("demo and demo2 are not equal");
        }

        demo = demo2;
        Demo demo3 = new Demo();
        demo2 = demo3;
        demo=demo3;
        System.gc();


        System.out.println(demo.add(78,87));
        demo.print();
    }

    public void print (){
        System.out.println("THis is you input " );
    }

    public int add(int a , int b){
        int sum = a+b;
        return sum;

    }
}


