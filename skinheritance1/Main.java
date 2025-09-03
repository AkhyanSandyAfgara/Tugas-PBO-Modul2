/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.skinheritance1;

/**
 *
 * @author AKHYAN
 */
public class Main {
    public static void main(String[] args) {
        Student s = new Student("Akhyan");
        Librarian l = new Librarian("Budi");

        s.tampilkanInfo();
        s.pinjamBuku();

        l.tampilkanInfo();
        l.kelolaBuku();
    }
}