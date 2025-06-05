package org.example.selfPractice;

public class Phone {
    String brand;
    String model;
    String color;

    public Phone(String brand ,String model, String color){
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    public void makeCall(String number){
        System.out.println("正在使用" + brand + "-" + model + "撥打電話給：" + number);
    }

    public void showPhoneInfo(){
        System.out.println("這支手機是：" + brand + "-" + model + "，顏色是：" + color);
    }

    public void takePhoto(){
        System.out.println("使用" + brand + "-" + model + "，拍了一張照片\uD83D\uDCF8");
    }

    public static void main(String[] args) {

        Phone phone = new Phone("Pixel","pxl_20250427", "red");

        phone.makeCall("+886-123456");

        phone.showPhoneInfo();

        phone.takePhoto();
    }

}
