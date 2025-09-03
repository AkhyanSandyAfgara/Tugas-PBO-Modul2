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
// Main Program 
public class DigitalLibrarySystem {
    public static void main(String[] args) {
        
        // Buat User dengan nama dan email berbeda
        Student s1 = new Student("S100", "mypass", "Ani", "ani@email.com");
        Librarian l1 = new Librarian("L200", "libpass", "STAFF99");

        // Buat Material dengan buku/jurnal berbeda
        Book b1 = new Book("Python Dasar", "Rina", "ISBN98765", 250);
        Journal j1 = new Journal("Machine Learning Trends", "Dr. Y", "ISSN54321", 8);

        // Buat Library
        Library lib = new Library();
        lib.addUser(s1);
        lib.addUser(l1);
        lib.addMaterial(b1);
        lib.addMaterial(j1);

        // Tampilkan isi Library
        lib.showUsers();
        lib.showMaterials();

        // Buat BorrowTransaction
        BorrowTransaction t1 = new BorrowTransaction(s1, b1, new Date());
        t1.showTransaction();
    }
}