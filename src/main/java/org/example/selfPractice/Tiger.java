package org.example.selfPractice;

import org.example.model.Animal2;

public class Tiger extends Animal2 {
double kilogram;

    public Tiger(String name, int age, double kilogram) {
        super(name, age);
        this. kilogram = kilogram;
    }

    @Override
    public String makeSound() {
        return "獅子喵喵叫";
    }

    public double getKilogram(){
        return kilogram;
    }

    public static void main(String[] args) {

    }
}
