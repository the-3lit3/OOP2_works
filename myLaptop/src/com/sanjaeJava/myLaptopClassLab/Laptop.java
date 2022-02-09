package com.sanjaeJava.myLaptopClassLab;

public class Laptop {

    private String name; //Member variable

    public Laptop(){} //Default constructor

    public Laptop(String xName){
        //Param Constr.
        this.name = xName;
    }

    public String getName(){

        return this.name;
    }
}
