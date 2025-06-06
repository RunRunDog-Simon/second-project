package org.example;

import java.util.Arrays;
import java.util.List;

public class LambdaDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charline");
        for (String name : names){
            printName(name);
        }

        names.forEach((name) -> System.out.println(name));
    }

    //測試Git Hub

    private static void printName(String name) {
        System.out.println(name);
    }
}
