package org.example;

import org.example.model.Counter;
import org.example.model.CounterThread;

public class NoSyncDemo {
    public static void main(String[] args) throws InterruptedException {
        Counter sharedCount = new Counter();
        int numberOfThreads = 5;
        int incrementPerThread = 1000;
        System.out.println("No Sync Counter的情況下");
        System.out.println("預期結果:" + numberOfThreads * incrementPerThread);

        Thread[] threads = new Thread[numberOfThreads];
        for (int i = 0; i < numberOfThreads; i++){
            threads[i] = new CounterThread(sharedCount, incrementPerThread);
            threads[i].start();
        }
        for (int i = 0; i < numberOfThreads; i++){
            threads[i].join();
        }

        System.out.println("實際結果:" + sharedCount.count);

    }
}
