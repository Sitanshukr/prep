package com.content.java.core;

public class Employee implements Comparable{
    int regid;
    String name;

    public Employee(int regid, String name) {
        this.regid = regid;
        this.name = name;
    }

    @Override
    public int compareTo(Object o) {
        Employee e = null;
        if(o instanceof Employee){
            e = (Employee)o;
        }
        return regid - e.regid;
    }

    @Override
    public String toString() {
        return this.regid + " " +this.name;
    }
}
