package org.example;

import org.example.model.MyFirstThread;

public class ThreadDemo {
    public static void main(String[] args) {
        MyFirstThread thread1 = new MyFirstThread("A");
        MyFirstThread thread2 = new MyFirstThread("B");
        Thread thread3 = new Thread("5");

        thread1.start();
        thread2.start();
//        thread3.start();

        System.out.println("主執行緒運行結束!");
    }
}
