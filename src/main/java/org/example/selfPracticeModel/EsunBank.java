package org.example.selfPracticeModel;

public class EsunBank {

    public void transfer(EsunAccount from, EsunAccount to, int amount) {
        if (from.getBalance() < amount) {
            throw new InsufficientFundsException("餘額不足：無法轉帳", from.getBalance(), amount);
        }
        from.withdraw(amount);
        to.deposite(amount);
        System.out.println("成功轉帳" + amount + "元，從" + from.getName() + "到" + to.getName());
    }
}
