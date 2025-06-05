package org.example.model;

public class Circle extends Shape {

    private double r;


    public Circle(String color, double r){
        super(color);
        this.r = r;
    }

    @Override
    public void getArea(){
        double area = r*r*3.14;
        System.out.println(area);
    }
}
