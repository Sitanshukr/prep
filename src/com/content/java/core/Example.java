package com.content.java.core;

public class Example {

    public static void main(String[] args) {
        Computer aravsComputer = new Computer(34,"Intel","8GB","i3");

        /*aravsComputer.setChipId(34);
        aravsComputer.setManufactureName("Intel");
        aravsComputer.setProcesor("i3");
        aravsComputer.setStorgae("8GB");

         */

        Computer aadiyaComputer = new Computer();

        aadiyaComputer.setChipId(56);
        aadiyaComputer.setManufactureName("AMD");
        aadiyaComputer.setProcesor("i5");
        aadiyaComputer.setStorgae("16GB");

        System.out.println(aadiyaComputer.getManufactureName());
        System.out.println(aravsComputer.getManufactureName());

        System.out.println(aravsComputer.hashCode());
        System.out.println(aadiyaComputer.toString());




    }
}
