package org.example;

import net.datafaker.Faker;

import java.util.*;

public class ActivityRegistration {
    public static void main(String[] args) {
        Faker faker = new Faker();
        Map<String, String> registeredUsers = new HashMap<>();
        System.out.println("=====================活動報名=====================");
        int numberOfAttendees = 100;
        int successfulRegistration = 0;
        List<String> failedUsers = new ArrayList<>();

        for (int i = 0; i < numberOfAttendees; i++) {
            String uniqudId = faker.internet().uuid();
            String userName = faker.funnyName().name();
            System.out.println("嘗試報名:" + userName);
            registeredUsers.put(uniqudId, userName);
        }


//        int i = 0;
//        while (i < numberOfAttendees) {
//            String userName = faker.funnyName().name();
//            System.out.println("嘗試報名:" + userName);
//
//            if (!registeredUsers.contains(userName)) {
//                System.out.println("報名成功");
//                registeredUsers.add(userName);
//                successfulRegistration++;
//            } else {
//                System.out.println("報名失敗");
//                failedUsers.add(userName);
//            }
//            i++;
//        }

        System.out.println("=====================報名結束=====================");
        System.out.println("嘗試報名者:" + numberOfAttendees);
        System.out.println("成功報名者:" + registeredUsers.size() + "人");

        System.out.println("=====================報名成功者列表=====================");
        if (registeredUsers.isEmpty()) {
            System.out.println("無人報名成功");
        } else {
            for (String uniqueId : registeredUsers.keySet()) {
                System.out.println(registeredUsers.get(uniqueId));
            }

            for (Map.Entry<String, String> entry : registeredUsers.entrySet()) {

            }

            System.out.println("=====================嘗試重覆的名字=====================");
            for (String userName : failedUsers) {
                System.out.println(userName);
            }
        }

    }
}