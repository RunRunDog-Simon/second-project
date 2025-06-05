package org.example.selfPracticeModel;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteAndRead {
    public static void main(String[] args) {
//        try {
//            FileWriter writer = new FileWriter("output.txt");
//            writer.write("Hello, this is my first file writing!");
//            writer.close(); //關閉檔案
//            System.out.println("寫入完成");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        try{
            FileReader reader = new FileReader("output.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;
            while((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }

            bufferedReader.close();

        } catch ( IOException e ){
            e.printStackTrace();
        }
    }
}
