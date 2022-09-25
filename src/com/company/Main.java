package com.company;

public class Main {

    public static void main(String[] args) {
	    Car car = new Car(5000, "Vaz");
        System.out.println(car.getPrice());
        Milk milk = new Milk(3.5f,100);
        System.out.println(milk.getPrice());
    }
}
