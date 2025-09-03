/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studikasusmodul2;

/**
 *
 * @author AKHYAN
 */
// Subclass Librarian (Inheritance) 
class Librarian extends User {
    private String staffID;

    public Librarian(String userID, String password, String staffID) {
        setUserID(userID);
        setPassword(password);
        this.staffID = staffID;
    }

    public String getStaffID() { return staffID; }

    public void manage() {
        System.out.println("Librarian managing the library system.");
    }
}

