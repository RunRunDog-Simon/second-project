package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SimpleFileReader {
    public static void main(String[] args) {
        String fileName = "firstFile.txt";
        try{
            readSth(fileName);
        } catch ( IOException e ){
            System.out.println("檔案讀取錯誤");
        }
    }

    public static void readSth (String fileName) throws IOException{
        FileReader reader = new FileReader (fileName);
        BufferedReader bufferedReader = new BufferedReader(reader);
        String line;
        while((line = bufferedReader.readLine()) != null )
            System.out.println(line);
    }
}
