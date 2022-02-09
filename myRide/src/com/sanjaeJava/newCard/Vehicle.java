package com.sanjaeJava.newCard;

public class Vehicle {
    private String model;
    private int speed;

    public Vehicle(){}

    public Vehicle(String model, int speed){
        this.model = " ";
        this.speed = 0;
    }

    public void setSpeed(int newSpeed){
        this.speed = newSpeed;
    }

    public int getSpeed(){

        return this.speed;
    }

    public void setModel(String newModel){
        this.model = newModel;
    }

    public String getModel(){

        return this.model;
    }
}
