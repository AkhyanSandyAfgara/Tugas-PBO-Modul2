/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.skencapsulation1;

/**
 *
 * @author AKHYAN
 */
class User {
    private String userID;
    private String password;
    private String dueDate; // disederhanakan menjadi String

    // Constructor
    public User(String userID, String password, String dueDate) {
        this.userID = userID;
        this.password = password;
        this.dueDate = dueDate;
    }

    // Getter
    public String getUserID() {
        return userID;
    }

    public String getPassword() {
        return password;
    }

    public String getDueDate() {
        return dueDate;
    }

    // Setter
    public void setUserID(String userID) {
        this.userID = userID;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }
}
