package org.example.selfPractice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadNumbers {
    public static List<Integer> numbersListFill(){
        String fileName = "numbers.txt";
        List <Integer> numbersCollection = new ArrayList<>();
        try (
                FileReader reader = new FileReader(fileName);
                BufferedReader bufferedReader = new BufferedReader(reader);
        ){
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                numbersCollection.add(Integer.valueOf(line));
            }
        }catch ( IOException e){
            System.out.println("看到這條訊息代表程式發生IOException，程式不當執行!");
        }
        if (!numbersCollection.isEmpty()) {
            System.out.println("numbersCollection已充滿元素");
        } else {
            System.out.println("numbersCollection是空的，沒有第一個元素可以印出");
        }
        return numbersCollection;
    }

    public static void main(String[] args) {
        System.out.println(ReadNumbers.numbersListFill());
    }
}
