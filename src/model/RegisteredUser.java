package model;
/*
* File: User.java
* Assignment: ENSF480 Final Project
* Section: L02
* Due Date: Dec. 4, 2022
* Authors: Andrew Howe (30113096), James Platt (30130627), 
* Jenna Vlaar (30113774) and Sadman Shahriar (30121460)
*/


public class RegisteredUser extends User
{
    private String password;
    public RegisteredUser(String firstName, String lastName, String email, String password){
        super(firstName, lastName, email, true);
        this.password = password;
    }
}
