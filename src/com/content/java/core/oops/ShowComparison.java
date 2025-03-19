package com.content.java.core.oops;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ShowComparison {
    public static void main(String[] args) {
        City city1= new City();
        City city2= new City();
        city1.regNo=34;
        city1.name="Mumbai";
        city2.regNo=45;
        city2.name="Delhi";

        List<City> cityList = new ArrayList<>();
        cityList.add(city2);
        cityList.add(city1);


        Collections.sort(cityList);

        for(City city : cityList){
            System.out.println(city.regNo + " : "+city.name);
        }
    }
}
