/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tgspraktikum2;

/**
 *
 * @author AKHYAN
 */
public class Main {
    public static void main(String[] args) {
        // Membuat beberapa objek Buku
        Buku b1 = new Buku("Laskar Pelangi", "Andrea Hirata");
        Buku b2 = new Buku("Bumi Manusia", "Pramoedya Ananta Toer");
        Buku b3 = new Buku("Negeri 5 Menara", "Ahmad Fuadi");

        // Memasukkan buku ke dalam array
        Buku[] daftarBuku = {b1, b2, b3};

        // Membuat objek Perpustakaan dengan daftar buku
        Perpustakaan perpus = new Perpustakaan("Perpustakaan Kota", daftarBuku);

        // Menampilkan koleksi perpustakaan
        perpus.tampilkanKoleksi();
    }
}