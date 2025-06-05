package org.example.model;

public class Dog extends Animal {
    private String weight;
    private String color;
    private String number;



    public Dog(String weight,String color,String number){
        super("mammals");
        this.weight = weight;
        this.color = color;
        this.number = number;
    }

    @Override
    public void eat(){
        System.out.println(species + "啃骨頭");
    }


    public String getWeight() {
        return weight;
    }
    public void setWeight(String weight) {
        this.weight = weight;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
}
