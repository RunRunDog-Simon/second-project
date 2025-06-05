package org.example.model;

public class Car {
    private String brand;
    private int speed;

    public Car (String brand, int speed){
        this.brand = brand;
        this.speed = speed;
    }

    public double accelerate(int a){
        return speed + a;
    }

    public double getSpeed(){
        return speed;
    }

}
