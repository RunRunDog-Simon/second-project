package org.example.selfPracticeModel;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputValue {
    private int target;

    public InputValue() {
        this.target = target;
    }

    public int youTypeANumber(){
        try {
            Scanner scanner = new Scanner(System.in);
            int target = scanner.nextInt();
            System.out.println("輸入的數值為:" + target);
        } catch (InputMismatchException ime) {
            System.out.println("輸入的數值非整數，錯誤!");
        }
        return target;
    }
}