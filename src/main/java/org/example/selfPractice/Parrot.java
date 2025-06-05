package org.example.selfPractice;

import org.example.model.Animal2;

public class Parrot extends Animal2 {
    double height;

    public Parrot(String name, int age, double height) {
        super(name , age);
        this.height = height;
    }

    @Override
    public String makeSound() {
        return "鸚鵡叫了叫";
    }

    public double getHeight(){
        return height;
    }


    public void fly(){
        System.out.println("鸚鵡正在飛翔");
    }

    public static void main(String[] args) {

        Parrot P1 = new Parrot("Apple", 5, 199.9);

        P1.fly();
        P1.makeSound();
        P1.showInfo();
        System.out.println("這隻鸚鵡" + P1.getAge() + "歲");

        Animal2 bird = new Animal2("Banana", 5);
        Parrot P2 = new Parrot("Pineapple",3, 777.7);
        Tiger T2 = new Tiger("STiger",1,666.6);

        //System.out.println(bird.makeSound());

        Animal2 [] creatures = {bird, P2, T2};

        for (int i = 0; i < creatures.length; i++) {
            creatures[i].makeSound();

            if (creatures[i] instanceof Parrot) {
                Parrot realParrot = (Parrot) creatures[i];  // ✅ 安全轉型
                System.out.println("鸚鵡的高度：" + realParrot.getHeight());
            }

            if (creatures[i] instanceof Tiger) {
                Tiger realTiger = (Tiger) creatures[i];
                System.out.println("老虎的體重：" + realTiger.getKilogram());
            }
        }

//        for (Animal2 creature:creatures){
//            System.out.println(creature.makeSound());
//        }



    }

}
