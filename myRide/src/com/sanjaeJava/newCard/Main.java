package com.sanjaeJava.newCard;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Car MyCar = new Car();
            MyCar.setModel("Toyota");
            MyCar.setSpeed(80);
            MyCar.setDetails("Altis");

            System.out.printf(MyCar.getModel() + ", " + MyCar.getDetails() + ", " + MyCar.getSpeed());

    }
}
