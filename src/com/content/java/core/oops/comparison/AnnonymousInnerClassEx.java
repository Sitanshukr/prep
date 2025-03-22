package com.content.java.core.oops.comparison;

public class AnnonymousInnerClassEx {

   static Runnable r =new Runnable()
    {
        @Override
        public void run() {
            System.out.println("Hi from Annonynous inner clas");
        }
    };

    public static void main(String[] args) throws InterruptedException {

        while(true) {
            Thread t=new Thread(r);
            t.start();
            Thread.sleep(2000);


        }
    }
}
