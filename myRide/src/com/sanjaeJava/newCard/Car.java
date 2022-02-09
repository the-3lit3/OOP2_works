package com.sanjaeJava.newCard;

public class Car extends Vehicle {
    private String carName;

    public void setDetails(String newCarName){
        this.carName = newCarName;
    }

    public String getDetails(){

        return this.carName;
    }
}
