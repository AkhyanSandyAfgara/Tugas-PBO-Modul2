/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.skinheritance2;

/**
 *
 * @author AKHYAN
 */
class Book extends Material {
    public Book(String judul) {
        super(judul);
    }

    public void baca() {
        System.out.println(judul + " adalah sebuah buku yang sedang dibaca.");
    }
}

