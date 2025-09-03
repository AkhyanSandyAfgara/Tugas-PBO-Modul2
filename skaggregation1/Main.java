/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.skaggregation1;

/**
 *
 * @author AKHYAN
 */
public class Main {
    public static void main(String[] args) {
        // buat objek material dan user
        Material m = new Material("Belajar Java");
        User u = new User("Akhyan");

        // library punya material & user
        Library lib = new Library(m, u);

        // tampilkan info
        lib.tampilkanInfo();
    }
}