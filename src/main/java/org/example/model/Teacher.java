package org.example.model;

public class Teacher extends Person implements Payable, Notifiable {

    private String teacherId;
    private String department;
    private Course[] courses;
    private double hourlyRate;
    private int workHours;


    public Teacher(String name,
                   int age,
                   String email,
                   String teacherId,
                   String department,
                   Course[] courses,
                   double hourlyRate,
                   int workHours) {
        super(name, age, email);
        this.teacherId = teacherId;
        this.department = department;
        this.courses = courses;
        this.hourlyRate = hourlyRate;
        this.workHours = workHours;
    }

    public void teach(){
        System.out.println(getName() + "正在教授" + courses[0] + "課程");
    }

    @Override
    public void eat(){
        System.out.println("吃福利社兩顆10元的茶葉蛋");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("教師編號:" + teacherId);
        System.out.println("隸屬部門:" + department);
        System.out.println("授課內容:");
        for (Course course : courses) {
            System.out.println(course.getCourseId() +":"+ course.getCourseName() + ";課程描述:" + course.getDescription());
        }
    }

    @Override
    public void sendNotification(String Message){
        System.out.println("向" + getName() + "發送通知:" + Message);
    }

    @Override
    public double calculatePayment() {
        return hourlyRate * workHours;
    }

    @Override
    public void processPayment() {
        System.out.println("處理" + getName() + "的薪資支付中:" + calculatePayment());
    }

    @Override
    public String getPaymentDetail() {
        return "教師:" + getName() + "，時薪為:" + hourlyRate + "，工作時數:" + workHours + "，總薪資:" + calculatePayment() ;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Course[] getCourses() {
        return courses;
    }

    public void setCourses(Course[] courses) {
        this.courses = courses;
    }

}
