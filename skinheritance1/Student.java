/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.skinheritance1;

/**
 *
 * @author AKHYAN
 */
class Student extends User {
    public Student(String nama) {
        super(nama);
    }

    public void pinjamBuku() {
        System.out.println(nama + " meminjam buku.");
    }
}

