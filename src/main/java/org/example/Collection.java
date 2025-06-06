package org.example;

import net.datafaker.Faker;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Collection {
    public static void main(String[] args) {
        Faker faker = new Faker();
        List<String> studentNames = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String name = faker.name().fullName();
            studentNames.add(name);
            System.out.println(name);
        }
        System.out.println("學生總數:" + studentNames.size());
        System.out.println("第一位學生:" + studentNames.get(0));
        System.out.println("最後一位學生:" + studentNames.get(studentNames.size() - 1));

        String newName = faker.name().fullName();
        System.out.println("將第三位學生改為:" + newName);
        studentNames.set(2, newName);

        System.out.println("移除第五位學生" + studentNames.get(4));
        studentNames.remove(4);

        studentNames.add(studentNames.get(0));
        studentNames.add(studentNames.get(0));
        studentNames.add(studentNames.get(0));

        System.out.println("最終名單為");
        HashSet<String> newNames = new HashSet<>(studentNames);
//        for (String name : newNames){
//            System.out.println(name);
//        }

        studentNames.forEach((String name) -> System.out.println(name));

    }
}
