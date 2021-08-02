package com.company;

public class Main {

    public static void main(String[] args) {
        Instructor instructor1 =new Instructor("Mehmet Ali",14,"Erkek","Matematik");
        Student st1=new Student("AHmet",1,"Erkek",4);

        InstructorManager instructorManager1=new InstructorManager();
        instructorManager1.createAccount(instructor1);
        StudentManager studentManager1=new StudentManager();
        studentManager1.createAccount(st1);
        instructorManager1.deleteAccount(st1);

    }
}
