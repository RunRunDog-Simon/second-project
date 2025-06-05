package org.example.model;

public class Animal2 {

    private String name;
    private int age;

    public Animal2(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void showInfo(){
        System.out.println("名字是" + name + "，年齡是" + age + "歲");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String makeSound(){
        return "這隻動物會發出聲音" ;
    }
}
