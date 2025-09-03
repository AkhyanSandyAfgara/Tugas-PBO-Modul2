/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studikasusmodul2;
import java.util.*;
/**
 *
 * @author AKHYAN
 */
// Aggregation: BorrowTransaction menghubungkan User dan Material 
class BorrowTransaction {
    private User user;
    private Material material;
    private Date dueDate;  // dienkapsulasi

    public BorrowTransaction(User user, Material material, Date dueDate) {
        this.user = user;
        this.material = material;
        this.dueDate = dueDate;
    }

    public Date getDueDate() { return dueDate; }
    public void setDueDate(Date dueDate) { this.dueDate = dueDate; }

    public void showTransaction() {
        System.out.println("Transaction: " + user.getUserID() +
                " borrowed " + material.getTitle() +
                ", due on " + dueDate);
    }
}

