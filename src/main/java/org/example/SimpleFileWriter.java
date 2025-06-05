package org.example;

import java.io.FileWriter;
import java.io.IOException;

public class SimpleFileWriter {
    public static void main(String[] args) {
        String fileName = "firstFile.txt";
        String contact = "測試JAVA的寫入功能";

        try {
            writeSth(fileName, contact);
        } catch (IOException ioe) {
            System.out.println("寫入發生錯誤");
        }
    }

    public static void writeSth ( String fileName, String contact) throws IOException {
        FileWriter writer = new FileWriter(fileName);
        writer.write(contact);
        writer.close();
        System.out.println("成功寫入檔案!" + fileName);
    }
}
