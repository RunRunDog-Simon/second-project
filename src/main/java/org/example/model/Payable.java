package org.example.model;

public interface Payable {
    double calculatePayment(); //計算付款
    void processPayment(); //處理付款
    String getPaymentDetail(); //取的付款詳情
}
