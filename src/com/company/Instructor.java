package com.company;

public class Instructor extends User{

    String branch;
    public Instructor(String name, int userNumber, String gender, String branch) {
        super(name, userNumber, gender);
        this.branch = branch;
    }


    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }


}
