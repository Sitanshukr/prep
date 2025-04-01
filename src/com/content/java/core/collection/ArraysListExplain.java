package com.content.java.core.collection;

import com.content.java.core.Computer;
import com.content.java.core.oops.Student;

import java.util.*;

public class ArraysListExplain {

    public static void main(String[] args) {
/*
        List<String> arrListObj = new ArrayList<>();
        arrListObj.add("Ram");
        arrListObj.add("Shyam");
        arrListObj.add("Ritesh");
        arrListObj.add("Virat");
        arrListObj.add("Hardik");
        arrListObj.add("Rohit");
        arrListObj.add("Shami");
        arrListObj.add("Pant");
        arrListObj.add("Rahul");
        arrListObj.add("Patel");

        arrListObj.add("jaiswal");//resize by factor of 1.5
        //interlly it works like
        /*
        String [] arrListObj = {Ram, ............................Patel}//10
        arrListObj.add(jaiswal);
        it check the against capacity of Arraylist
        if capacity < size
        then, create new String array of current capacity + 1.5 (10 +15) = 25
        String [] arrList = {------------------------------------};//25
                     arrListObj= {        Ram .................................jaiswal}







        ArrayList<Computer> listOfComputers = new ArrayList<>();
        listOfComputers.add(c1);
        listOfComputers.add(c2);
        listOfComputers.add(c3);
        listOfComputers.add(c4);
        listOfComputers.add(c5);


        for(Computer computer : listOfComputers){
            System.out.println(computer.getManufactureName());
        }
          */
        Computer c1 = new Computer();
        Computer c2 = new Computer();
        Computer c3 = new Computer();
        Computer c4 = new Computer();
        Computer c5 = new Computer();
        c1.setManufactureName("Dell");
        c2.setManufactureName("MAC");
        c3.setManufactureName("HP");
        c4.setManufactureName("Acer");
        c5.setManufactureName("Lenovo");
        Stack stack = new Stack();
        stack.push(c1);
        stack.push(c2);
        stack.push(c3);
        stack.push(c4);
        stack.push(c5);

        for(int i =0 ;i<=stack.size();i++) {
            System.out.println(stack.pop());
        }
    }
}
