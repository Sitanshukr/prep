package com.content.java8.funda.supplier;

import java.util.function.Supplier;

public class SupplierEg {

    Supplier<String> supplier =()-> {
           String otp="";
            for (int i=0;i<6;i++){
                otp= otp +(int) (Math.random()*10);
            }
            return otp;
    };

    public static void main(String[] args) {
        System.out.println(new SupplierEg().supplier.get());
        System.out.println(new SupplierEg().supplier.get());
        System.out.println(new SupplierEg().supplier.get());
        System.out.println(new SupplierEg().supplier.get());
        System.out.println(new SupplierEg().supplier.get());
    }
}
