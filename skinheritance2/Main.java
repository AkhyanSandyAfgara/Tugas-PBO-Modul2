/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.skinheritance2;

/**
 *
 * @author AKHYAN
 */
public class Main {
    public static void main(String[] args) {
        Book b = new Book("Belajar Java");
        Journal j = new Journal("Jurnal Teknologi 2025");

        b.tampilkanInfo();
        b.baca();

        j.tampilkanInfo();
        j.review();
    }
}