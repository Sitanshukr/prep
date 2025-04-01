package com.content.java8.funda;

public class AnnonymousInnerClassEg {

static AnnoInterface annoInterface = new AnnoInterface() {
        @Override
        public void display() {
            System.out.println("Hi From Annonymous Inner Class Display Method");
        }
        @Override
        public String giveName() {
            return "demo";
        }
    };

    public static void main(String[] args) {
        annoInterface.display();
        System.out.println(annoInterface.giveName());
    }
  }


