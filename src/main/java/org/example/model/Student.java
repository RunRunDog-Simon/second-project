package org.example.model;

public class Student extends Person implements Notifiable {
    private String studentId;
    private String major;
    private String sex; //m男(預設) f女

    public Student(String name, int age, String email, String studentId, String major, String sex) {
        super(name, age , email);
        this.studentId = studentId;
        this.major = major;
        this.sex = sex;
    }

    public void eat(){
        System.out.println( getName() + "同學覺得營養午餐真難吃");
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("學號:" + studentId);
        System.out.println("主修:" + major);
        System.out.println("性別:" + sex);
    }

    public void introduce() {
        if (sex.equals("m")) {
            System.out.println("我叫" + getName() + "，今年" + getAge() + "歲" + "，我是男生");
        } else {
            System.out.println("我叫" + getName() + "，今年" + getAge() + "歲" + "，我是女生");
        }
    }

    @Override
    public void sendNotification(String Message){
        System.out.println("向" + getName() + "發送通知:" + Message);
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}