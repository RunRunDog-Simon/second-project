package org.example.selfPractice;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class NumbersTXT {
    public static void main(String[] args) {
        String fileName = "numbers.txt";
        int numberOfLine = 100;
        List <Integer> numbersCollections = new ArrayList<>();

        System.out.println("開始生成檔案");
        try (
                FileWriter writer = new FileWriter(fileName);
                BufferedWriter bufferedWriter = new BufferedWriter(writer);
        ) {
            //建造List
            Integer number = 0;
            for (int i = 0; i < numberOfLine; i++) {
                numbersCollections.add(number);
                number ++;
            }
            //打亂List
            Collections.shuffle(numbersCollections);
            //寫入List
            for (Integer num : numbersCollections) {
                bufferedWriter.write(num.toString());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            System.out.println("產生了一個錯誤，但我們仍不停歇，持續跑完程式!");
        }
        System.out.println("檔案"+ fileName +"製作完成!");
    }
}
