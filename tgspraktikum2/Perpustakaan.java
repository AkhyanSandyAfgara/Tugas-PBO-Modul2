/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tgspraktikum2;

/**
 *
 * @author AKHYAN
 */
class Perpustakaan {
    String nama;
    Buku[] koleksiBuku;

    public Perpustakaan(String nama, Buku[] koleksiBuku) {
        this.nama = nama;
        this.koleksiBuku = koleksiBuku;
    }

    public void tampilkanKoleksi() {
        System.out.println("Perpustakaan: " + nama);
        System.out.println("Daftar Buku:");
        for (Buku b : koleksiBuku) {
            b.tampilkanInfo();
        }
    }
}

