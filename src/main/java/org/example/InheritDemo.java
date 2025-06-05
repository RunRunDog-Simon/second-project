package org.example;

import net.datafaker.Faker;
import org.example.model.Course;
import org.example.model.RetiredTeacher;
import org.example.model.Student;
import org.example.model.Teacher;

public class InheritDemo {
    public static void main(String[] args) {

        Faker faker = new Faker();
        Teacher teacher = new Teacher(
                faker.name().fullName(),
                faker.number().numberBetween(26,55),
                faker.internet().emailAddress(),
                faker.number().digit(),
                faker.educator().campus(),
                new Course[]{
                        new Course(faker.number().positive(), faker.educator().course(), "default"),
                        new Course(faker.number().positive(), faker.educator().course(), "default"),
                        new Course(faker.number().positive(), faker.educator().course(), "default"),
                }, 1800, 80
                );

        Student student = new Student(
                faker.name().fullName(),
                faker.number().numberBetween(15,18),
                faker.internet().emailAddress(),
                faker.number().digit(),
                faker.educator().course(),
                faker.gender().shortBinaryTypes()
        );

        RetiredTeacher retiredTeacher = new RetiredTeacher(
                faker.name().fullName(),
                faker.number().numberBetween(70,99),
                faker.internet().emailAddress(),
                faker.number().digit(),
                faker.educator().campus(),
                new Course[]{
                        new Course(faker.number().positive(), faker.educator().course(), "default"),
                        new Course(faker.number().positive(), faker.educator().course(), "default"),
                        new Course(faker.number().positive(), faker.educator().course(), "default"),
                        new Course(faker.number().positive(), faker.educator().course(), "default"),
                },
                faker.bool().bool()
                );

        teacher.teach();
        teacher.displayInfo();
        teacher.eat();
        teacher.processPayment();
        teacher.sendNotification("測試訊息");
        System.out.println(teacher.getPaymentDetail());
        System.out.println("--------------------------------------------");
        student.displayInfo();
        student.eat();
        System.out.println("--------------------------------------------");
        System.out.println("該位老師是否退休:" + retiredTeacher.isRetired());
        retiredTeacher.processPayment();
        System.out.println(retiredTeacher.getPaymentDetail());

    }
}
