package org.example;

import org.example.model.User;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadCSVFile {
    public static void main(String[] args) {
        String fileName = "user.csv";
        int yahooAccount = 0;
        int hotmailAccount = 0;
        int gmailAccount = 0;

        try(
                FileReader fileReader = new FileReader (fileName);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                ){
            String line;
            if((line = bufferedReader.readLine()) != null){
                System.out.println("標題為：" + line);
            }
            while ((line = bufferedReader.readLine()) != null){
                String [] data = line.split(",");
//                System.out.println("名字：" + data[0]);
//                System.out.println("email：" + data[1]);
//                System.out.println("電話：" + data[2]);

                User user = new User(data[0], data[1], data[2]);
                user.setEmailProvider(data[1]);
                System.out.println(user);

                switch(user.getEmailProvider()){
                    case "yahoo.com":
                        yahooAccount++;
                        break;
                    case "hotmail.com":
                        hotmailAccount++;
                        break;
                    case "gmail.com":
                        gmailAccount++;
                        break;
                }
            }
            System.out.printf( "yahoo統計有:%s, hotmail統計有:%s, gmail統計有:%s",
                    yahooAccount, hotmailAccount, gmailAccount);
        } catch ( IOException e){
            System.out.println("檔案讀取有誤：" + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException a){
            System.out.println("用戶資料不完整：" + a.getMessage());
        }
    }
}
