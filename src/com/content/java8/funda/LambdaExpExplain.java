package com.content.java8.funda;

public class LambdaExpExplain {

   static Render render = new Render() {// using annonymous inner
        @Override
        public String render(String data) {
            return "Value to Render using annonymous inner class:: " + data;
        }
    };

   static Render render1 = (String data)-> {//using lambda
        return "Rendering from using lambda expression :: " + data;
    };

    public static void main(String[] args) {
        System.out.println( render.render("hello"));
        System.out.println( render1.render("Bye"));
    }
}
