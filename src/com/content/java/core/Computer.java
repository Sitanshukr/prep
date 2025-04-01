package com.content.java.core;

public class Computer {

    private int chipId;                          //Camel cases
    private String manufactureName;
    private String storgae;
    private  String procesor;

    public void setChipId(int chipId) {
        this.chipId = chipId;
    }

    public void setManufactureName(String manufactureName) {
        this.manufactureName = manufactureName;
    }

    public void setStorgae(String storgae) {
        this.storgae = storgae;
    }

    public void setProcesor(String procesor) {
        this.procesor = procesor;
    }

    public int getChipId() {
        return chipId;
    }

    public String getManufactureName() {
        return manufactureName;
    }

    public String getStorgae() {
        return storgae;
    }

    public String getProcesor() {
        return procesor;
    }
//POJO classes= Plain old java object
public Computer(){

}

   public  Computer(int chipId, String manufactureName, String storgae, String procesor){//cons no.2 also called as parmeterize constructoe
        this.chipId = chipId;
        this.manufactureName=manufactureName;
        this.storgae=storgae;
        this.procesor=procesor;
    }
    //private , protected, public-  Access Modifier
    //Constructor are special func/methods whose name is same as class name && is used to initize an object of respective class
    //constroctoes dosn't have any return type
    // if we don't declare any constuctors , default constructoes are implicitly implemented

    private void display(){
        System.out.println("hello from computer");
    }

    @Override
    public String toString() {
        return this.getChipId()+ " "+ this.getManufactureName()+" "+this.getProcesor()+ " "+this.getStorgae();
    }
}
