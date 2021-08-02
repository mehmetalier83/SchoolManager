package com.company;

public class User {
    String name;
    int userNumber;
    String gender;

    public User(String name, int userNumber, String gender) {
        this.name = name;
        this.userNumber = userNumber;
        this.gender = gender;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(int userNumber) {
        this.userNumber = userNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


}
