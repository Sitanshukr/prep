package com.content.java.core.oops;

import java.util.Comparator;

public class City implements Comparable<City> {

    int regNo;
    String name;


    @Override
    public int compareTo(City c) {
        return this.regNo-c.regNo;
    }
}
