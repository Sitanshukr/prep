package com.content.java.core.oops.comparison;

public class Worker {

    private int wid;
    protected String wName;
    public int wSal;

    public Worker(int wid, String wName, int wSal){
        this.wid=wid;
        this.wName=wName;
        this.wSal=wSal;
    }

    public Worker(){}

    @Override
    public String toString() {
        return this.wid+" "+this.wName+ " " +this.wSal;
    }
}
