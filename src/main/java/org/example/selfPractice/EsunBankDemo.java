package org.example.selfPractice;

import org.example.selfPracticeModel.EsunAccount;
import org.example.selfPracticeModel.EsunBank;
import org.example.selfPracticeModel.InsufficientFundsException;

public class EsunBankDemo {
    public static void main(String[] args) {
        EsunAccount alice = new EsunAccount("Alice", 500);
        EsunAccount bob = new EsunAccount("Bob", 1000);
        EsunBank esunBank = new EsunBank();

        try {
            esunBank.transfer(alice, bob, 600);
        } catch (InsufficientFundsException e){
            System.out.println("轉帳失敗" + e.getAttempted() + "元");
            System.out.println("你有：" + e.getBalance() + " 元，想轉：" + e.getAttempted() + " 元");
        }

        System.out.println(alice.getName() + "餘額:" + alice.getBalance());
        System.out.println(bob.getName() + " 餘額：" + bob.getBalance());
    }


}
