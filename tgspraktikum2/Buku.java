/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tgspraktikum2;

/**
 *
 * @author AKHYAN
 */
class Buku {
    String judul;
    String penulis;

    public Buku(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }

    public void tampilkanInfo() {
        System.out.println("Judul: " + judul + ", Penulis: " + penulis);
    }
}
