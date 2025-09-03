/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studikasusmodul2;

/**
 *
 * @author AKHYAN
 */
// Subclass Student (Inheritance) 
class Student extends User {
    private String name;
    private String email;

    public Student(String userID, String password, String name, String email) {
        setUserID(userID);
        setPassword(password);
        this.name = name;
        this.email = email;
    }

    public String getName() { return name; }
    public String getEmail() { return email; }
}
