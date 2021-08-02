package com.company;

public class Student extends User{
    int classroom;

    public Student(String name, int userNumber, String gender,int classroom) {
        super(name, userNumber, gender);
        this.classroom=classroom;
    }

    public int getClassroom() {
        return classroom;
    }

    public void setClassroom(int classroom) {
        this.classroom = classroom;
    }


}
