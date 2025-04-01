package com.content.java8.funda.consumer;

import java.util.function.Consumer;

public class ConsumerEg {

    Consumer<String> c1 = c -> System.out.println("Hello " + c);
    Consumer<String> c2 = c -> System.out.println("and " + c);

    public static void main(String[] args) {
         new ConsumerEg().c1.accept("Manual");
         new ConsumerEg().c2.accept("lets dance");
       Consumer <String> chainedConsumer= new ConsumerEg().c1.andThen(new ConsumerEg().c2);
       chainedConsumer.accept("aks");
    }
}
