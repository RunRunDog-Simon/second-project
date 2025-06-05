package org.example;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileDemo {
    public static void main(String[] args) throws IOException {

        try {
            String path = "";
            FileReader reader = new FileReader(path);
            reader.close();
        }catch ( IOException e){
            System.out.println("檔案讀取錯誤");
        }

        Scanner scanner = new Scanner(System.in);
        String numberStr = scanner.next();
        System.out.println("開始執行囉");
        try {
            int number;
            number = Integer.parseInt(numberStr);
            System.out.println("已成功轉換成數字:" + number);
        } catch (NumberFormatException n){
            System.out.println("轉換錯誤，提供的字串無法轉換為數字");
        }
    }
}
