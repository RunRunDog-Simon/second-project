package org.example;

import net.datafaker.Faker;

public class ExceptionDemo {
    public static void main(String[] args) {
        Faker faker = new Faker();

        for (int i = 0; i < 3; i++) {
            {
                int numerator = 10;
                int denominator = faker.random().nextInt(2);
                System.out.println("分母為:" + denominator);
                int result = divide(numerator,denominator);
                System.out.println("計算結果為:" + result);
            }
        }
        System.out.println("程式繼續執行");
    }

    public static int divide (int a, int b) throws ArithmeticException {
        int result = 0;
        try {
            result = a / b;
        } catch (ArithmeticException e) {
            System.out.println("錯了!0不可為除數");
            //throw new ArithmeticException("錯誤，除數不可為0");
        }
        return result;
    }
}