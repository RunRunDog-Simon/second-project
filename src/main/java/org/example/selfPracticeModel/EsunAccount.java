package org.example.selfPracticeModel;

public class EsunAccount {
    private String name;
    private int balance;

    public EsunAccount(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int withdraw(int withdrawMoney) {
        balance = balance - withdrawMoney;
        return balance;
    }

    public int deposite(int depositeMoney) {
        balance = balance + depositeMoney;
        return  balance;
    }
}


