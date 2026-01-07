package com.content.java8.funda.optional;

import com.content.algorithum.sorting.Test;

import java.util.Optional;

public class ShowOptionalUse<T> {

    public Optional<Prefume> getPerfumeName(T obj){
        Prefume perfume= (Prefume)obj;
       return Optional.ofNullable(perfume);

    }

    public static void main(String[] args) {
        Prefume p1 = new Prefume("Axe",300,"Wood");
        Prefume p2= new Prefume("ParkAvenue",400,"Mystic");
        Prefume p3 = null;

        ShowOptionalUse showOptionalUse = new ShowOptionalUse();

        Optional<Prefume> optionalname =showOptionalUse.getPerfumeName(p3);

        Prefume h=optionalname.orElse(new Prefume("n",9," NA"));
        System.out.println(h.getFragrance());

        //This is real power of Optional where we can use map to map values
        Optional<Prefume> optionalname2 =showOptionalUse.getPerfumeName(p1);
        System.out.println(optionalname2.map(Prefume::getFragrance).orElse("NAfrom"));


    }


}
