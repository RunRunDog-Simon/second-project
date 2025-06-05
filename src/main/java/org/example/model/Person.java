package org.example.model;

public abstract class Person {
    private String name;
    private  int age;
    private  String email;

    public Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public abstract void eat();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void displayInfo(){
        System.out.println("姓名:" + name);
        System.out.println("年齡:" + age);
        System.out.println("email:" + email);
    }
}
