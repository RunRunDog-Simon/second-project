package org.example.model;

public class CounterThread extends Thread {
    private Counter counter;
    private int incrementPerThread;

    public CounterThread (Counter counter, int incrementPertThread){
        this.counter = counter;
        this.incrementPerThread = incrementPerThread;
    }

    @Override
    public void run(){
        for (int i = 0; i < incrementPerThread; i++){
            counter.increment();
        }
    }
}
