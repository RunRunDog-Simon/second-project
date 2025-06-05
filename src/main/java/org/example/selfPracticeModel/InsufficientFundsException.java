package org.example.selfPracticeModel;

public class InsufficientFundsException extends RuntimeException {
    private int balance;
    private int attempted;


    public InsufficientFundsException(String message, int balance, int attempted){
        super(message);
        this.balance = balance;
        this.attempted = attempted;
    }

    public int getBalance(){
        return balance;
    }

    public int getAttempted(){
        return attempted;
    }
}


