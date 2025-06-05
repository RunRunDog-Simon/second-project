package org.example.selfPractice;

import org.example.model.Animal;
import org.example.model.Dog;

public class TryTryLook {
    public static void main(String[] args) {
        Animal animal1 = new Dog("99kg","Red","1");
        Dog dog1 = (Dog) animal1;

        Animal animal2 = new Animal("fish");
        if ( animal2 instanceof Dog){
            Dog dog2 = (Dog) animal2;
            System.out.println("向下轉型成功");
        } else {
            System.out.println("向下轉型失敗");
        }
    }
}
