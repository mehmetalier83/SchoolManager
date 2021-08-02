package com.company;

public class StudentManager extends UserManager{
    @Override
    public void createAccount(User user)
    {
        System.out.println("Ögrenci hesabi olusturuldu ");
    };
    public void deleteAccount(User user)
    {
        System.out.println("ögrenci hesabi silindi ");
    };
}
