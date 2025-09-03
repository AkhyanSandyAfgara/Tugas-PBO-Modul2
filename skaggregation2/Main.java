/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.skaggregation2;

/**
 *
 * @author AKHYAN
 */
public class Main {
    public static void main(String[] args) {
        // buat user dan material (di luar BorrowTransaction)
        User u = new User("Akhyan");
        Material m = new Material("Belajar Java");

        // buat transaksi peminjaman (agregasi)
        BorrowTransaction t = new BorrowTransaction(u, m);

        // tampilkan hasil transaksi
        t.tampilkanTransaksi();
    }
}