package com.content.java8questionaries.Lambda;

public class Bottle {

    public static void main(String[] args) {

            Runnable r = () -> {
                for (int i =0;i<10;i++) {
                    System.out.println("Hi from Child Thread");
                }
            };
            Thread thread = new Thread(r);
            thread.start();
            for(int i =0;i<10;i++) {
                System.out.println("Hi From Main thread");
            }
        }
    }
