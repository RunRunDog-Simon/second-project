package org.example;

import org.example.selfPracticeModel.LengthException;

import java.util.Scanner;

public class PasswordValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("輸入密碼啦!");
        if (scanner.hasNext()){
            String pwd = scanner.next().trim();
            if (pwd.length() > 20 || pwd.length() < 3 ){
                throw new LengthException();
            }
            //密碼格式驗證
            String regex = "^(?=.*[A-Z])(?=.*[a-z]).*$";
            if(!pwd.matches(regex)){
                throw new RuntimeException("密碼格式驗證不符");
            }
            System.out.println("輸入的密碼為" + pwd);
        }

    }
}
