package org.example;

public class StringToIntExceptionDemo {
    public static void main(String[] args) {
        String numberStr = "123+99";
        int number;
//        number = Integer.parseInt(numberStr);
        try{
            number = Integer.parseInt(numberStr);
            System.out.println("轉換後的數字為:" + number);
        } catch (ArithmeticException e) {
            System.out.println("數字計算失敗");
        } catch (NumberFormatException e ){
            System.out.println("字串轉換失敗了阿");
        }
    }


}
