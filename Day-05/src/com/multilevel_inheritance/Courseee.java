package com.multilevel_inheritance;

public class Courseee {
    String courseName;
    String duration;
    Courseee(String courseName, String duration){
        this.courseName=courseName;
        this.duration=duration;
    }
    void displayInfo(){
        System.out.println("Course name: "+courseName);
        System.out.println("Duration of course: "+duration);
    }
}
class OnlineCourse extends Courseee{
    int courseId;

    String platform;
    boolean isRecorded;
    OnlineCourse(String courseName, String duration,int courseId,boolean isRecorded){
        super(courseName,duration);

        this.courseId=courseId;
        this.platform=platform;
        this.isRecorded=isRecorded;
    }
    void displayInfo(){
        System.out.println("Course name: "+courseName);
        System.out.println("Duration of course: "+duration);

        System.out.println("course Id: "+courseId);
    }
}
class PaidOnlineCourse extends OnlineCourse{
    double discount,fee;
    PaidOnlineCourse(String courseName,String duration,boolean isRecorded, int courseId,double fee,double discount){
        super(courseName,duration,courseId,isRecorded);
        this.discount=discount;
        this.fee=fee;
    }
    void displayInfo(){
        System.out.println("Course name: "+courseName);
        System.out.println("Duration of course: "+duration);
        System.out.println("Fees of course: "+fee);
        System.out.println("course Id: "+courseId);
        System.out.println("Discount on the course: "+discount);
        System.out.println("Is course Recorded? "+isRecorded);
        discount= (discount/100)*fee;
        double discounted_fee=fee - discount;
        System.out.println("Discounted price: "+discounted_fee);
    }

    public static void main(String[] args) {
        Courseee course= new Courseee("Java","3 months");
        OnlineCourse onlineCourse=new OnlineCourse("Java","3 months",23,true);
        PaidOnlineCourse paidOnlineCourse=new PaidOnlineCourse("Java","3 months",true,23,3000,20);
        course.displayInfo();
        onlineCourse.displayInfo();
        paidOnlineCourse.displayInfo();
    }
}
