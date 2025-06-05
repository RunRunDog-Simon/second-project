package org.example.model;

public class RetiredTeacher extends Teacher {
    private boolean isRetired;


    public RetiredTeacher(String name,
                          int age,
                          String email,
                          String teacherId,
                          String department,
                          Course[] courses,
                          boolean isRetired) {
        super(name, age, email, teacherId, department, courses,192,40);
        this.isRetired = isRetired();
    }


    public boolean isRetired (){
        return isRetired;
    }
}
