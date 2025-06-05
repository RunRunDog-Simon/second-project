package org.example;

import org.example.selfPracticeModel.AccountNotFoundException;
import org.example.selfPracticeModel.LoginService;
import org.example.selfPracticeModel.PasswordTooShortException;
import org.example.selfPracticeModel.WrongPasswordException;

public class Main  {
    public static void main(String[] args) {

        LoginService testUser = new LoginService("testUser","12345678");
        LoginService admin = new LoginService("admin","admin123");

        System.out.println("歡迎蒞臨try-catch練習網站，請輸入帳號密碼");
        try {
            admin.login("admin555","admin123");
        } catch (AccountNotFoundException a){
            System.out.println( a.getMessage());
        } catch (PasswordTooShortException p){
            System.out.println( p.getMessage());
        } catch (WrongPasswordException w){
            System.out.println( w.getMessage());
        }
    }
}